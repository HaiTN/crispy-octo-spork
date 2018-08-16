import React from 'react';

import PlayerList from '../components/PlayerList';
import { Card } from '../../node_modules/@material-ui/core';

export default class PlayerListContainer extends React.Component {
  constructor(props) {
    super(props);
    this.state = {players: []}
  }

  componentWillMount() {
    fetch("http://localhost:8080/players/all-players")
    .then(response => response.json())
    .then(data => {
      this.setState({
        players: data
      })
    })
  }
  
  componentWillReceiveProps() {
    const url = this.props.goodPlayers ? 'http://localhost:8080/players/bitch-players' : 'http://localhost:8080/players/good-players';

    fetch(url)
      .then(response => response.json())
      .then(data => {
        this.setState({
          players: data
        })
      })
    }
    
    render() {
      const { players } = this.state;

      return(
        <Card> 
          <PlayerList players={players} />
        </Card>
      )
    }
}
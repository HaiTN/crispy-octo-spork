import React from 'react';

import PlayerList from '../components/PlayerList';

export default class PlayerListContainer extends React.Component {
  constructor(props) {
    super(props);
    this.state = {players: []}
  }

  componentWillMount() {
    fetch("http://localhost:8080/all-players")
    .then(response => response.json())
    .then(data => {
      this.setState({
        players: data
      })
    })
  }
  
  componentWillReceiveProps() {
    const url = this.props.goodPlayers ? 'http://localhost:8080/bitch-players' : 'http://localhost:8080/good-players';

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
        <PlayerList players={players} />
      )
    }
}
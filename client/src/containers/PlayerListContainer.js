import React from 'react';

import PlayerList from '../components/PlayerList';

export default class PlayerListContainer extends React.Component {
  constructor(props) {
    super(props);
    this.state = {
      players: [],
      isLoading: false
    }
  }
  
  componentWillReceiveProps() {
    this.setState({
      isLoading: true
    });

    const url = this.props.goodPlayers ? 'http://localhost:8080/all-players' : 'http://localhost:8080/good-players';

    fetch(url)
      .then(response => response.json())
      .then(data => {
        this.setState({
          players: data,
          isLoading: false
        })
        console.log(this.state);
      })
    }
    
    render() {
      const { players, isLoading } = this.state;

      if (isLoading) {
        return <p>Loading...</p>;
      }

      return(
        <PlayerList players={players}/>
      )
    }
}
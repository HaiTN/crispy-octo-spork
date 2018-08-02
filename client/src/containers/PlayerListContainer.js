import React from 'react';

import PlayerList from '../components/PlayerList';

export default class PlayerListContainer extends React.Component {
  constructor() {
    super();
    this.state = {
      players: [],
      isLoading: false
    }
  }
  
  componentDidMount() {
    this.setState({
      isLoading: true
    });

    fetch('http://localhost:8080/good-players')
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
      const {players, isLoading} = this.state;

      if (isLoading) {
        return <p>Loading...</p>;
      }

      return(
        <PlayerList players={players}/>
      )
    }
}
import React from 'react';
import './App.css';

import Button from '@material-ui/core/Button';

import AppToolbar from './components/AppToolbar';
import PlayerListContainer from './containers/PlayerListContainer';

class App extends React.Component {
  constructor(props) {
    super(props);
    this.state = {playerToggle: false};

    this.handleClick = this.handleClick.bind(this);
  }

  handleClick() {
    this.setState(prevState => ({
      playerToggle: !prevState.playerToggle
    }));
  }

  render() {
    const { playerToggle } = this.state;
    return (
      <div className="App">
        <AppToolbar />
        {playerToggle ? <PlayerListContainer goodPlayers={true}/> : <PlayerListContainer goodPlayers={false}/>}
        <Button variant="outlined" color="secondary" onClick={this.handleClick}>
          {playerToggle ? "All Players" : "Good Players Only"}
        </Button>
      </div>
    );
  }
}

export default App;

import React from 'react';
import CssBaseline from '@material-ui/core/CssBaseline';
import './App.css';

import Button from '@material-ui/core/Button';

import AppToolbar from './components/AppToolbar';
import PlayerListContainer from './containers/PlayerListContainer';

class App extends React.Component {
  constructor(props) {
    super(props);
    this.state = {playerToggle: true};
  }

  handleClick = () => {
    this.setState(prevState => ({
      playerToggle: !prevState.playerToggle
    }));
  }

  render() {
    const { playerToggle } = this.state;
    return (
      <React.Fragment>
        <CssBaseline />
        <div className="App">
        <AppToolbar />
        <PlayerListContainer goodPlayers={playerToggle} />
        <Button variant="outlined" color="secondary" onClick={this.handleClick}>
          {playerToggle ? "See Bitch Players" : "See Good Players Only"}
        </Button>
      </div>

      </React.Fragment>
    );
  }
}

export default App;

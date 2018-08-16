import React from 'react';

import PlayerListContainer from '../containers/PlayerListContainer';
import Button from '@material-ui/core/Button';

export default class PlayerTable extends React.Component {
  constructor() {
    super();
    this.state = { playerToggle: true };
  }

  handleClick = () => {
    this.setState(prevState => ({
      playerToggle: !prevState.playerToggle
    }));
  }

  render() {
    const { playerToggle } = this.state;
    return (
      <div>
        <PlayerListContainer goodPlayers={playerToggle} />
        <Button variant="outlined" color="secondary" onClick={this.handleClick}>
          {playerToggle ? "See Bitch Players" : "See Good Players Only"}
        </Button>
      </div>
    )
  }
}
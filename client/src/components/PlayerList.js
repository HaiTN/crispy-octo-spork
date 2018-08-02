import React from 'react';

const PlayerList = ({players}) => {
  return(
    <div>Test {players.map(player => player.firstName)}</div>
  )
}

export default PlayerList;
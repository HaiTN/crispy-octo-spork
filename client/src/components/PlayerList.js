import React from 'react';
import Table from '@material-ui/core/Table';
import TableBody from '@material-ui/core/TableBody';
import TableCell from '@material-ui/core/TableCell';
import TableHead from '@material-ui/core/TableHead';
import TableRow from '@material-ui/core/TableRow';
import Paper from '@material-ui/core/Paper';

const PlayerList = ({ players }) => {  
  return (
    <Paper className={players.root}>
      <Table className={players.table}>
        <TableHead>
          <TableRow>
            <TableCell>Players</TableCell>
            <TableCell>First Name</TableCell>
            <TableCell>Last Name</TableCell>
            <TableCell>Position</TableCell>
            <TableCell numeric>Rank</TableCell>
          </TableRow>
        </TableHead>
        <TableBody>
          {players.map(player => {
            return (
              <TableRow key={player.id} hover={true}>
                <TableCell>{player.id}</TableCell>
                <TableCell>{player.firstName}</TableCell>
                <TableCell>{player.lastName}</TableCell>
                <TableCell>{player.playerPosition}</TableCell>
                <TableCell numeric>{player.rank}</TableCell>
              </TableRow>
            );
          })}
        </TableBody>
      </Table>
    </Paper>
  );
}

export default PlayerList;
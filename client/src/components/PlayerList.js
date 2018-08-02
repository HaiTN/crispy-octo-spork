import React from 'react';
import { withStyles } from '@material-ui/core/styles';
import Table from '@material-ui/core/Table';
import TableBody from '@material-ui/core/TableBody';
import TableCell from '@material-ui/core/TableCell';
import TableHead from '@material-ui/core/TableHead';
import TableRow from '@material-ui/core/TableRow';
import Paper from '@material-ui/core/Paper';

const styles = theme => ({
  root: {
    width: '100%',
    marginTop: theme.spacing.unit * 3,
    overflowX: 'auto',
  },
  table: {
    minWidth: 700,
  },
});

function SimpleTable(props) {
  const { players } = props;

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
          {players.map(n => {
            return (
              <TableRow key={n.id}>
                <TableCell component="th" scope="row">
                  {n.id}
                </TableCell>
                <TableCell>{n.firstName}</TableCell>
                <TableCell>{n.lastName}</TableCell>
                <TableCell>{n.playerPosition}</TableCell>
                <TableCell numeric>{n.rank}</TableCell>
              </TableRow>
            );
          })}
        </TableBody>
      </Table>
    </Paper>
  );
}

export default withStyles(styles)(SimpleTable);
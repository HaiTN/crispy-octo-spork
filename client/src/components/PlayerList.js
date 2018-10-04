import React from 'react';
import Input from '@material-ui/core/Input';
import Table from '@material-ui/core/Table';
import TableBody from '@material-ui/core/TableBody';
import TableCell from '@material-ui/core/TableCell';
import TableHead from '@material-ui/core/TableHead';
import TableRow from '@material-ui/core/TableRow';
import Paper from '@material-ui/core/Paper';
import { Checkbox } from '../../node_modules/@material-ui/core';

class PlayerList extends React.Component {
  constructor() {
    super();
    this.state = {
      search: '',
      selected: []
    };
  }

  handleClick = (event, id) => {
    const { selected } = this.state;
    const selectedIndex = selected.indexOf(id);
    let selection = [];

    if (selectedIndex === -1) {
      selection = selection.concat(id);
    }

    this.setState({selected: selection});
  }

  updateSearch = event => this.setState({search: event.target.value});

  isSelected = id => this.state.selected.indexOf(id) !== -1;

  render() {
    let players = this.props.players.filter(player => {
      return player.firstName.toLowerCase().indexOf(this.state.search) !== -1 
      || player.lastName.toLowerCase().indexOf(this.state.search) !== -1;
    });
    return (
      <Paper className={players.root}>
        <Input type="text" 
          placeholder='Search by name'
          value={this.state.search}
          onChange={this.updateSearch}/>
        <Table className={players.table}>
          <TableHead>
            <TableRow>
              <TableCell>Select Player</TableCell>
              <TableCell>Player ID</TableCell>
              <TableCell>First Name</TableCell>
              <TableCell>Last Name</TableCell>
              <TableCell>Position</TableCell>
              <TableCell numeric>Rank</TableCell>
            </TableRow>
          </TableHead>
          <TableBody>
            {players.map(player => {
              const isSelected = this.isSelected(player.id);
              return (
                <TableRow 
                  key={player.id} 
                  hover={true}
                  onClick={event => this.handleClick(event, player.id)}>
                  <TableCell>
                    <Checkbox checked={isSelected} />
                  </TableCell>
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
}

export default PlayerList;
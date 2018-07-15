import React from 'react';
import Player from './Player';
import Table from '@material-ui/core/Table';
import TableBody from '@material-ui/core/TableBody';
import TableCell from '@material-ui/core/TableCell';
import TableHead from '@material-ui/core/TableHead';
import TableRow from '@material-ui/core/TableRow';
import Paper from '@material-ui/core/Paper';

export default class PlayerList extends React.Component{
	render() {
		var players = this.props.players.map(player =>
			<Player key={player._links.self.href} player={player}/>
		);
		return (
		    <Paper>
                <Table className={players.table}>
                    <TableHead>
                        <TableRow>
                            <TableCell>First Name</TableCell>
                            <TableCell>Last Name</TableCell>
                            <TableCell>Position</TableCell>
                            <TableCell>Rank</TableCell>
                        </TableRow>
                    </TableHead>
                    <TableBody>
                        {players}
                    </TableBody>
                </Table>
			</Paper>
		)
	}
}

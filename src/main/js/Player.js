import React from 'react';
import TableRow from '@material-ui/core/TableRow';
import TableCell from '@material-ui/core/TableCell';

export default class Player extends React.Component{
	render() {
		return (
			<TableRow>
				<TableCell>{this.props.player.firstName}</TableCell>
				<TableCell>{this.props.player.lastName}</TableCell>
				<TableCell>{this.props.player.position}</TableCell>
				<TableCell numeric>{this.props.player.rank}</TableCell>
			</TableRow>
		)
	}
}
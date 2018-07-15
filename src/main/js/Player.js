import React from 'react';

export default class Player extends React.Component{
	render() {
		return (
			<tr>
				<td>{this.props.player.firstName}</td>
				<td>{this.props.player.lastName}</td>
				<td>{this.props.player.rank}</td>
			</tr>
		)
	}
}
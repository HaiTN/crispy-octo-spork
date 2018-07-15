import React from 'react';

import Player from './Player';

export default class PlayerList extends React.Component{
	render() {
		var players = this.props.players.map(player =>
			<Player key={player._links.self.href} player={player}/>
		);
		return (
			<table>
				<tbody>
					<tr>
						<th>First Name</th>
						<th>Last Name</th>
						<th>Rank</th>
					</tr>
					{players}
				</tbody>
			</table>
		)
	}
}

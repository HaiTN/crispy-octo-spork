'use strict';

const React = require('react');
const ReactDOM = require('react-dom');
const client = require('./client');

class App extends React.Component {

	constructor(props) {
		super(props);
		this.state = {players: []};
	}

	componentDidMount() {
		client({method: 'GET', path: '/api/players'}).done(response => {
			this.setState({players: response.entity._embedded.players});
		});
	}

	render() {
		return (
			<PlayerList players={this.state.players}/>
		)
	}
}

class PlayerList extends React.Component{
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

class Player extends React.Component{
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

ReactDOM.render(
	<App />,
	document.getElementById('react')
)
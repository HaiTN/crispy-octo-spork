import React from 'react';
import ReactDOM from 'react-dom';
import client from './client';

import PlayerList from './PlayerList';
import NavBar from './NavBar';

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
		    <div>
		        <NavBar />
			    <PlayerList players={this.state.players} />
		    </div>
		)
	}
}

ReactDOM.render(
	<App />,
	document.getElementById('react')
)
import React from 'react';

import Team from '../components/Team';
import Paper from '@material-ui/core/Paper';

export default class TeamContainer extends React.Component {
  constructor(props) {
    super(props);
    this.state = {teamData: []}
  }

  componentWillMount() {
    fetch("http://localhost:8080/teams/7")
      .then(response => response.json())
      .then(data => {
        this.setState({
          teamData: data
        })
      });
  }

  render() {
    const { teamData } = this.state;

    return (
      <Paper>
        <Team teamData={teamData} />
      </Paper>
    )
  }
}
import React from 'react';
import CssBaseline from '@material-ui/core/CssBaseline';
import './App.css';

import AppToolbar from './components/AppToolbar';
import PlayerTable from './components/PlayerTable';
import { Grid } from '../node_modules/@material-ui/core';
import TeamContainer from './containers/TeamContainer';

class App extends React.Component {
  render() {
    return (
      <React.Fragment>
        <CssBaseline />
        <div className="App">
        <AppToolbar />
        <Grid container spacing={24}>
          <Grid item xs={6}>
            <PlayerTable />
          </Grid>
          <Grid item xs={6}>
            <TeamContainer />
          </Grid>
        </Grid>
      </div>

      </React.Fragment>
    );
  }
}

export default App;

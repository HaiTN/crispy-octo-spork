import React from 'react';

import Table from '@material-ui/core/Table';
import TableBody from '@material-ui/core/TableBody';
import TableCell from '@material-ui/core/TableCell';
import TableHead from '@material-ui/core/TableHead';
import TableRow from '@material-ui/core/TableRow';

const Team = ({ teamData }) => {
  return (
    <Table className={teamData.table}>
        <TableHead>
          <TableRow>
            <TableCell>Team ID</TableCell>
            <TableCell>Team Name</TableCell>
            <TableCell>Position</TableCell>
          </TableRow>
        </TableHead>
        <TableBody>
          <TableRow key={teamData.id} hover={true}>
            <TableCell>{teamData.id}</TableCell>
            <TableCell>{teamData.teamName}</TableCell>
            <TableCell>{teamData.draftPosition}</TableCell>
          </TableRow>
        </TableBody>
      </Table>
  )
}

export default Team;
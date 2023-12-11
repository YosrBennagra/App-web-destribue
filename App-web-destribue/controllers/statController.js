const express = require('express');
const { poolReservation, poolFoyer, poolChambre, poolBloc } = require('../db/connect');
const app = express();


// Example route to get statistics from all databases
app.get('/allStatistics', async (req, res) => {
    try {
      const [reservationStats] = await poolReservation.query('SELECT COUNT(*) as rowCount FROM your_table_reservation');
      const [foyerStats] = await poolFoyer.query('SELECT COUNT(*) as rowCount FROM your_table_foyer');
      const [chambreStats] = await poolChambre.query('SELECT COUNT(*) as rowCount FROM your_table_chambre');
      const [blocStats] = await poolBloc.query('SELECT COUNT(*) as rowCount FROM your_table_bloc');
  
      const totalRowCount = reservationStats[0].rowCount + foyerStats[0].rowCount + chambreStats[0].rowCount + blocStats[0].rowCount;
  
      res.status(200).json({
        status: 'success',
        data: {
          reservationStats,
          foyerStats,
          chambreStats,
          blocStats,
          totalRowCount,
          // Add other statistics as needed
        },
      });
    } catch (error) {
      res.status(500).json({
        status: 'error',
        message: 'Internal Server Error',
        data: {
          error: error.message,
        },
      });
    }
  });
  
module.exports = app;

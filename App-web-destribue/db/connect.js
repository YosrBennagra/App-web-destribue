const mongoose = require('mongoose');
const mysql = require('mysql2/promise');

// Connexion à MongoDB
mongoose.connect('mongodb://127.0.0.1:27017/universiteDB');

const mongoDB = mongoose.connection;

mongoDB.on('error', console.error.bind(console, 'Erreur de connexion à MongoDB :'));
mongoDB.once('open', () => {
  console.log('Connecté à MongoDB !');
});


// Connection pool for reservationDATABSE
const poolReservation = mysql.createPool({
  host: 'localhost',
  user: 'root',
  password: '',
  database: 'reservationDATABSE',
  port: 3306,
});

// Connection pool for FoyerDatabase
const poolFoyer = mysql.createPool({
  host: 'localhost',
  user: 'root',
  password: '',
  database: 'FoyerDatabase',
  port: 3307,
});

// Connection pool for chambreDatabase
const poolChambre = mysql.createPool({
  host: 'localhost',
  user: 'root',
  password: '',
  database: 'chambreDatabase',
  port: 3309,
});

// Connection pool for blocDatabse
const poolBloc = mysql.createPool({
  host: 'localhost',
  user: 'root',
  password: '',
  database: 'blocDatabse',
  port: 3310,
});

module.exports = {
  poolReservation,
  poolFoyer,
  poolChambre,
  poolBloc,
};
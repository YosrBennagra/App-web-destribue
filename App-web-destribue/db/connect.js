const mongoose = require('mongoose');
const mysql = require('mysql2/promise');

// Connexion à MongoDB
mongoose.connect('mongodb://127.0.0.1:27017/universiteDB');

const mongoDB = mongoose.connection;

mongoDB.on('error', console.error.bind(console, 'Erreur de connexion à MongoDB :'));
mongoDB.once('open', () => {
  console.log('Connecté à MongoDB !');
});

// Connexion à la base de données SQL (MySQL dans cet exemple)
const pool = mysql.createPool({
  host: 'localhost',
  user: 'root',
  password: '',
  database: 'springdb'
});


module.exports = {
  mongoose,
  pool
};

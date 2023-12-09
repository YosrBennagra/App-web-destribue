const express = require("express");
const bodyParser = require('body-parser');
const cors = require('cors');
const app = express();
app.use(cors());

//controllers : 
const universiteController = require('./controllers/universiteContoller');


app.use(bodyParser.json());

app.use('/universite', universiteController);


app.listen(3000, () => console.log("serveur activer!!"));

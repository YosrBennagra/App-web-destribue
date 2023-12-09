const express = require("express");
const bodyParser = require('body-parser');
const cors = require('cors');
const app = express();
app.use(cors());

//controllers : 
const universiteController = require('./controllers/universiteContoller');


app.use(bodyParser.json());

app.use('/universite', universiteController);

// Start the server
const port = 3000;
app.listen(port, () => {
  console.log(`Server is running on port ${port}`);
});

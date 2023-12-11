const express = require("express");
const {pool} = require("../db/connect");
const Historique = require("../models/historique");
const app = express();

app.post("/addHistorique", async (req, res) => {
  try {
    const newHisto = await Historique.create({
      nom: req.body.nom,
      description: req.body.description,
    });

    res.status(201).json({
      status: "success",
      data: {
        histo: newHisto,
      },
    });
  } catch (error) {
    res.status(500).json({
      status: "error",
      message: "Internal Server Error",
      data: {
        error: error.message,
      },
    });
  }
});

app.get("/all", async (req, res) => {
  try {
    let historiques = await Historique.find();
    res.status(200).send({ historiques });
  } catch (error) {
    res.status(400).send({ message: "error !" });
  }
});

app.get("/one/:idHisto", async (req, res) => {
  try {
    let id = req.params.idHisto;
    let histo = await Historique.findOne({ _id: id });

    if (!histo) res.status(400).send({ message: "histo not found!" });
    else res.status(200).send({ data: histo });
  } catch (error) {
    res.status(400).send({ message: "Error!" });
  }
});

/*sql */


app.get("/allResto", async (req, res) => {
    try {
      const [RestoTabe] = await pool.query('SELECT * FROM restaurant');
      res.status(200).json({
        status: "success",
        data: RestoTabe
      });
    } catch (error) {
      res.status(500).json({
        status: "error",
        message: "Internal Server Error",
        data: {
          error: error.message,
        },
      });
    }
  });

module.exports = app;

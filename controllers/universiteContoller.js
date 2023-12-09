const express = require("express");
const mongoose = require("../db/connect");
const Universite = require("../models/universite");
const app = express();

app.post("/addUniversite", async (req, res) => {
  try {
    const newUniv = await Universite.create({
      nomUniversite: req.body.nomUniversite,
      adresse: req.body.adresse,
    });

    res.status(201).json({
      status: "success",
      data: {
        university: newUniv,
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

module.exports = app;

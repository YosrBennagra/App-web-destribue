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

app.get("/all", async (req, res) => {
  try {
    let univs = await Universite.find();
    res.status(200).send({ univs });
  } catch (error) {
    res.status(400).send({ message: "error !" });
  }
});

app.get("/one/:idUniv", async (req, res) => {
  try {
    let id = req.params.idUniv;
    let univ = await Universite.findOne({ _id: id });

    if (!univ) res.status(400).send({ message: "University not found!" });
    else res.status(200).send({ university: univ });
  } catch (error) {
    res.status(400).send({ message: "Error!" });
  }
});

app.delete("/deleteAll", async (req, res) => {
  try {
    const univs = await Universite.find();

    if (univs.length !== 0) {
      const deletionResult = await Universite.deleteMany();

      if (deletionResult.deletedCount > 0) {
        res.status(200).send({ message: "Deletion successful" });
      } else {
        res.status(400).send({ message: "No univs found for deletion" });
      }
    } else {
      res.status(400).send({ message: "Table already deleted" });
    }
  } catch (error) {
    res
      .status(500)
      .send({ message: "Internal Server Error", error: error.message });
  }
});

app.delete("/deleOne/:idUniv", (req, res) => {
  let id = req.params.idUniv;
  Universite.findOneAndDelete({ _id: id })
    .then((univ) => {
      if (!univ) res.status(400).send({ message: "univ nexiste pas!" });
      else res.status(200).send(univ);
    })
    .catch((e) => {
      res.status(400).send(e);
    });
});

app.put("/update/:idUniv", async (req, res) => {
  try {
    const univ = await Universite.findByIdAndUpdate(
      req.params.idUniv,
      req.body,
      {
        new: true,
        runValidators: true,
      }
    );

    if (!univ) {
      return res.status(404).json({
        status: "fail",
        message: "University not found.",
      });
    }

    res.status(200).json({
      status: "success",
      data: {
        univ,
      },
    });
  } catch (error) {
    console.error("Error updating university:", error);
    res.status(500).json({
      status: "error",
      message: "Internal Server Error",
    });
  }
});

module.exports = app;

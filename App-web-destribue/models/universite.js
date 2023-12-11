const mongoose = require("mongoose");

const universiteSchema = new mongoose.Schema(
  {
    nomUniversite: {
      type: String,
      require: true,
    },
    adresse: {
      type: String,
      require: true,
    },
    createdAt: {
      type: Date,
      default: Date.now(),
    },
    updatedAt: { type: Date },
    /*
    foyer: {
      type: mongoose.Schema.ObjectId,
      ref: "Foyer",
      required: true,
    },
    */
  }
);

const Universite = mongoose.model("universite", universiteSchema);

module.exports = Universite;

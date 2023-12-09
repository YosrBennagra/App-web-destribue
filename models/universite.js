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
    /*
    foyer: {
      type: mongoose.Schema.ObjectId,
      ref: "Foyer",
      required: true,
    },
    */
  },
  {
    toJSON: { virtuals: true },
    toObject: { virtuals: true },
  }
);

const Universite = mongoose.model("universite", universiteSchema);

module.exports = Universite;

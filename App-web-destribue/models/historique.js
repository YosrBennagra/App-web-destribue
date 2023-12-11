const mongoose = require("mongoose");
const historiqueSchema = new mongoose.Schema(
    {
      nom: {
        type: String,
        require: true,
      },
      description: {
        type: String,
        require: true,
      },
      createdAt: {
        type: Date,
        default: Date.now(),
      },
      
      /*
      user: {
        type: mongoose.Schema.ObjectId,
        ref: "User",
        required: true,
      },
      */
    }
  );

  const Historique = mongoose.model("historique", historiqueSchema);

module.exports = Historique;

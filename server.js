const express = require("express");
const cors = require("cors");
const cookieSession = require("cookie-session");

const app = express();

app.use(cors());

app.use(express.json());

app.use(express.urlencoded({ extended: true }));

app.use(
  cookieSession({
    name: "reog-session",
    keys: ["COOKIE_SECRET12"], 
    httpOnly: true,
    sameSite: 'strict'
  })
);

// database
const db = require("./app/models");

db.sequelize.sync();

app.get("/", (req, res) => {
  res.json({ message: "Welcome to Resident Organizer." });
});

// routes
require("./app/routes/auth.routes")(app);
require("./app/routes/features.routes")(app);

const PORT = process.env.PORT || 8080;

db.sequelize
  .authenticate()
  .then(() => {
    console.log('Connection to the database has been established successfully.');

    app.listen(PORT, '0.0.0.0', () => {
      console.log(`Server is running on port ${PORT}.`);
    });
  })
  .catch(err => {
    console.error('Unable to connect to the database:', err);
  });

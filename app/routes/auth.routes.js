const { verifySignUp, processFileMiddleware } = require("../middleware");
const controller = require("../controllers/auth.controller");

const multer = require('multer')
const upload = multer()

module.exports = function(app) {
  app.use(function(req, res, next) {
    res.header(
      "Access-Control-Allow-Headers",
      "Origin, Content-Type, Accept"
    );
    next();
  });

  app.post(
    "/auth/signup",
    [
      verifySignUp.checkDuplicateEmail,
    ],
    controller.signup
  );

  app.post("/auth/signin", controller.signin);
  
  app.post("/auth/signout", controller.signout);

};

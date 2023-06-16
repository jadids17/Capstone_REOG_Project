const controller = require("../controllers/uploadController")
const multer = require('multer')
const upload = multer()

module.exports = function(app) {
  app.use(upload.single())
    app.use(function(req, res, next) {
      res.header(
        "Access-Control-Allow-Headers",
        "Origin, Content-Type, Accept"
      );
      next();
    });
    app.post("/bansos/upload", controller.uploadHandler.any())
};
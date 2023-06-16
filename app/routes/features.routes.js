const controller = require("../controllers/uploadController");
const multer = require('multer');

module.exports = function(app) {
    app.use(function(req, res, next) {
      res.header(
        "Access-Control-Allow-Headers",
        "Origin, Content-Type, Accept"
      );
      next();
    });
    app.post("/bansos/upload", controller.uploadHandler.single('file'))
};
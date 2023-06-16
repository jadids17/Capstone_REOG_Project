const multer = require("multer");
const multerGoogleStorage = require("multer-google-storage")

exports.uploadHandler = multer({
  storage: multerGoogleStorage.storageEngine({
    autoRetry: true,
    bucket: 'reog-users-data',
    projectId: 'reog-project',
    keyFilename: 'reog-project-a3b94c77b4e1.json',
    filename: (req, file, cb) => {
      cb(null, `/projectimages/${Date.now()}_${file.originalname}`);
    }
  })
});

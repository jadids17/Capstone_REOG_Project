// const db = require("../models");
// const Bansos = db.bansos;
// const ImgUpload = require("./uploadController")

// const multer = Multer({
//   storage: Multer.MemoryStorage,
//   fileSize: 5 * 1024 * 1024
// })

// exports.bansos = async (req, res) => {
//     try {
//       const user = await Bansos.create({
//         namaKepalaKeluarga: req.body.namaKepalaKeluarga,
//         nik: req.body.nik,
//         tanggalLahir: req.body.tanggalLahir,
//         alamat: req.body.alamat,
//         umur: req.body.umur,
//         rangePendapatan: req.body.rangePendapatan,
//         fotoKTP: req.body.fotoKTP,
//         fotoKK: req.body.fotoKK,
//         fotoSKTM: req.body.fotoSKTM,
//         fotoKeteranganDomisili: req.body.fotoKeteranganDomisili,
//         fotoDepanRumah: req.body.fotoDepanRumah,
//       });
//       return res.status(200).send({
//         message: "Berhasil mengajukan bantuan sosial"
//       });

//     } catch (error) {
//       res.status(500).send({ message: error.message });
//     }
//   };
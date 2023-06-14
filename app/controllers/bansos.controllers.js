const db = require("../models");
const Bansos = db.bansos;
const upload = require("./uploadController")

exports.bansos = async (req, res) => {
    try {
      const fotoKTP = await upload.upload(req.body.fotoKTP);
      const fotoKK = await upload.upload(req.body.fotoKK);
      const fotoSKTM = await upload.upload(req.body.fotoSKTM);

      const user = await Bansos.create({
        namaKepalaKeluarga: req.body.namaKepalaKeluarga,
        nik: req.body.nik,
        tanggalLahir: req.body.tanggalLahir,
        alamat: req.body.alamat,
        umur: req.body.umur,
        rangePendapatan: req.body.rangePendapatan,
        fotoKTP: fotoKTP,
        fotoKK: fotoKK,
        fotoSKTM: fotoSKTM,
        fotoKeteranganDomisili: req.body.fotoKeteranganDomisili,
        fotoDepanRumah: req.body.fotoDepanRumah,
      });
      return res.status(200).send({
        message: "Berhasil mengajukan bantuan sosial"
      });

    } catch (error) {
      res.status(500).send({ message: error.message });
    }
  };
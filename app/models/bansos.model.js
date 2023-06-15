module.exports = (sequelize, Sequelize) => {
    const Bansos = sequelize.define("Bansos", {
      namaKepalaKeluarga: {
        type: Sequelize.STRING
      },
      nik: {
        type: Sequelize.INTEGER
      },
      tanggalLahir: {
        type: Sequelize.DATE
      },
      alamat: {
        type: Sequelize.STRING
      },
      umur: {
        type: Sequelize.INTEGER
      },
      rangePendapatan: {
        type: Sequelize.INTEGER
      },
      fotoKTP: {
        type: Sequelize.STRING
      },
      fotoKK: {
        type: Sequelize.STRING
      },
      fotoSKTM: {
        type: Sequelize.STRING
      },
      fotoKeteranganDomisili: {
        type: Sequelize.STRING
      },
      fotoDepanRumah: {
        type: Sequelize.STRING,
      },
    });
    return Bansos;
  };
  
module.exports = {
  HOST: '34.101.150.85',
  USER: "root",
  PASSWORD: 'mads_jads',
  DB: 'REOGDB',
  dialect: "mysql",
  pool: {
    max: 5,
    min: 0,
    acquire: 30000,
    idle: 10000
  }
};




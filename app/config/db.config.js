module.exports = {
  HOST: "${{ secrets.DB_IP }}",
  USER: "root",
  PASSWORD: "${{ secrets.DB_PASSWORD }}",
  DB: "${{ secrets.DB_NAME }}",
  dialect: "mysql",
  pool: {
    max: 5,
    min: 0,
    acquire: 30000,
    idle: 10000
  }
};



module.exports = {
  HOST: '${{ secrets.DB_IP }}',
  USER: "root",
  PASSWORD: '${{ secrets.DB_PASSWORD }}',
  DB: '${{ secrets.DB_NAME }}',
  dialect: "mysql",
  pool: {
    max: 5,
    min: 0,
    acquire: 30000,
    idle: 10000
  }
};

const connection = mysql.createConnection({
  host: 'public_ip_sql_instance_Anda',
  user: 'root',
  database: 'nama_database_Anda',
  password: 'password_sql_Anda'
})



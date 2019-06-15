using MySql.Data.MySqlClient;
using System.Data;


namespace MyFinance.Util
{

    public class DAL
    {
        private static string server = "127.0.0.1";
        private static string database = "financeiro";
        private static string user = "root";
        private static string password = "root";
        private string connectionString = $"server={server};Database={database};Uid={user};Password={password}"; // Interpolação string
        private MySqlConnection connection;
        
        public DAL()
        {
            connection = new MySqlConnection(connectionString);
            connection.Open();
        }

        //Executa SELECT's
        public DataTable RetDataTable(string sql)
        {
            DataTable dataTable = new DataTable(); // Instanciação do DataTable
            MySqlCommand command = new MySqlCommand(sql, connection);
            MySqlDataAdapter da = new MySqlDataAdapter(command);
            da.Fill(dataTable);

            return dataTable;
        }

        //Executa INSERT'S, UPDATE's, DELETE's

        public void ExecutaComandoSQL(string sql)
        {
            MySqlCommand command = new MySqlCommand(sql, connection);
            command.ExecuteNonQuery();
        }
    }
}
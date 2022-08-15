package mesa1508;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

public class Main {

    private static final String sqlCreat = "DROP TABLE IF EXISTS dentista;\n" +
            "CREATE TABLE dentista (\n" +
            "    id INT PRIMARY KEY,\n" +
            "    matricula INT NOT NULL,\n" +
            "    nome VARCHAR(255),\n" +
            "    sobrenome VARCHAR(255)\n" +
            ");";


    private static final String sqlInsert = "INSERT INTO dentista (id, matricula, nome, sobrenome) VALUES (?, ?, ?, ?);";

    private static final String sqlUpdate = "UPDATE Dentista SET matricula = ? WHERE id = ?;";

    public static void main(String[] args) throws Exception {

        Dentista dentista = new Dentista("João", "Silva", 123, 1);

        Connection connection = null;

        try{
                connection = ConectionJDBC.getConnection();
                Statement statement = connection.createStatement();
                statement.execute(sqlCreat);

                PreparedStatement preparedStatement= connection.prepareStatement(sqlInsert);

                preparedStatement.setInt(1, dentista.getId());
                preparedStatement.setInt(2, dentista.getMatricula());
                preparedStatement.setString(3, dentista.getNome());
                preparedStatement.setString(4, dentista.getSobrenome());
                preparedStatement.execute();

                connection.setAutoCommit(false);
                PreparedStatement preparedStatementUpdate = connection.prepareStatement(sqlUpdate);
                preparedStatementUpdate.setInt(1, 456);
                preparedStatementUpdate.setInt(2, dentista.getId());
                preparedStatementUpdate.execute();
                connection.commit();
                connection.setAutoCommit(true);

                String sqlSelect = "SELECT * FROM dentista";
                statement = connection.createStatement();
                ResultSet resultSet = statement.executeQuery(sqlSelect);
                while(resultSet.next()){
                    System.out.println(resultSet.getInt("id") + " - " + resultSet.getInt("matricula") + " - " + resultSet.getString("nome") + " - " + resultSet.getString("sobrenome"));
                }

        }catch (Exception e){
            e.printStackTrace();
            connection.rollback();
        }finally {
            connection.close();
        }
    }


}

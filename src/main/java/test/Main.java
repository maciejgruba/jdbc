package test;

import java.sql.*;

public class Main {

    private static final String URL ="jdbc:mysql://localhost:3306/sda_libraryy?useTimezone=true&serverTimezone=UTC";

    public static void main(String[] args) {
        Connection connection= null;
        try {
             connection = DriverManager.getConnection(URL, "root", "Maciek88");
            System.out.println("połącznenie udane");

            CallableStatement callableStatement = connection.prepareCall("{call getPerson ()}");

            ResultSet resultSet = callableStatement.executeQuery();
            while(resultSet.next()){
                System.out.println(resultSet.getInt(1)+ " : " + resultSet.getString(2) + " : "
                        + resultSet.getString(3)+ " : " + resultSet.getDate(4));

            }
//            String query = "select * from test";
//            Statement statement = connection.createStatement();
//            ResultSet rs = statement.executeQuery(query);
//            while(rs.next()){
//                System.out.println(rs.getInt(1) + " | " + rs.getString(2));
//            }
//            statement.close();


        } catch (SQLException e){
            System.out.println("nie udało się połączyć");
            System.out.println(e.getMessage());
        }
        if (connection != null) {

            try{
                connection.close();
            } catch (SQLException throwables){
                throwables.printStackTrace();
            }
        }

    }
}

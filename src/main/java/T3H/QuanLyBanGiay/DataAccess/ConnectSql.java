package T3H.QuanLyBanGiay.DataAccess;

import java.sql.*;
import java.util.List;

public class ConnectSql {
    private final String connectString;
    private Connection connection;
    public ConnectSql(){
        connectString="jdbc:sqlserver://ADMIN\\MSSQLSERVER01;database=ban_hang";
    }
    public Connection getConnection(){
        if(connection!=null){
            return connection;

        }
        try{
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            connection= DriverManager.getConnection(connectString,"anhhuy","123456");
        } catch (Exception e) {
            e.printStackTrace();
        }

        return connection;
    }
    public void closeConnection(){
        if(connection!=null){
            try{
                connection.close();
            }
            catch (Exception throwables){
                throwables.printStackTrace();
            }
            finally {
                connection=null;
            }
        }
    }
    public ResultSet getTable(String query, List<String> parameters){
        ResultSet result=null;
        try {
            PreparedStatement ps=getConnection().prepareStatement(query);

                for (int i=0;i<parameters.size();i++){
                    ps.setString(i+1,parameters.get(i));
                }

            result=ps.executeQuery();
            ps.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return result;
    }
    public int executeQuery(String query,List<String> parameters){
        int result=0;
        try {
            PreparedStatement ps=getConnection().prepareStatement(query);
            for(int i=0;i<parameters.size();i++){
                ps.setString(i+1,parameters.get(i));
            }
            result=ps.executeUpdate();
            ps.close();
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        return result;
    }
}

package T3H.QuanLyBanGiay.Business;

import T3H.QuanLyBanGiay.model.Account;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class AccountBus extends BaseBus implements IBus<Account> {
    @Override
    public List<Account> getAll() {
        List<Account> accounts = new ArrayList<>();
        query = "Select * from Account";
        Connection conn = db.getConnection();
        if (conn != null) {
            try {
                PreparedStatement ps = (PreparedStatement)db.getConnection().prepareStatement(query);

                ResultSet result = ps.executeQuery();
                initInfo initInfo = new initInfo();
                while (result.next()) {
                    accounts.add(initInfo.initAccount(result));
                }
                ps.close();
            } catch (Exception throwables) {
                throwables.printStackTrace();
            }

        }
        return accounts;
    }

    @Override
    public Account getSingleByID(String id) {
        return null;
    }

    @Override
    public List<Account> getByKeyword(String keyword) {
        return null;
    }

    @Override
    public Account add(Account info) {
        query="INSERT INTO Account values(?,?,?,?)";
      //  parameters.add(info.getUserID());
        parameters.add(info.getFullName());
        parameters.add(info.getUserName());
        parameters.add(info.getPassword());
        parameters.add(info.getRole());
        db.executeQuery(query,parameters);
        parameters.clear();
        db.closeConnection();

        return null;
    }

    @Override
    public void Update(Account info) {

    }

    @Override
    public void delete(String id) {

    }

    public Account login(Account account){
        Account account1=null;
        query = "Select TOP 1 * from Account where userName=? and password=?";
        parameters.add(account.getUserName());
        parameters.add(account.getPassword());
        ResultSet resultSet=db.getTable(query,parameters);
        try {
            while (resultSet.next()){
                account1=new initInfo().initAccount(resultSet);
            }
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        parameters.clear();
        db.closeConnection();
        return account1;
    }

}

package T3H.QuanLyBanGiay.Business;

import T3H.QuanLyBanGiay.model.Account;
import T3H.QuanLyBanGiay.model.Giay;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class AccountBus extends BaseBus implements IBus<Account>{


    @Override
    public List<Account> getAll() {
        List<Account> accounts = new ArrayList<>();
        query = "Select * from account";
        Connection conn = db.getConnection();
        if (conn != null) {
            try {
                PreparedStatement ps = (PreparedStatement) db.getConnection().prepareStatement(query);

                ResultSet result = ps.executeQuery();
                initInfo initInfo=new initInfo();
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
    public void add(Account info) {

    }

    @Override
    public void Update(Account info) {

    }

    @Override
    public void delete(String id) {

    }
    public List<Account> login(String userName,String passowrd){
        List<Account> account=new ArrayList<>();
        query="Select * from Account where userName=? and password=?";
        parameters.add(userName);
        parameters.add(passowrd);
        ResultSet resultSet=db.getTable(query,parameters);
        initInfo initInfo=new initInfo();
        try {
            while (resultSet.next()){
                account.add(initInfo.initAccount(resultSet));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

        db.executeQuery(query,parameters);
        parameters.clear();
        db.closeConnection();
        return account;
    }
}

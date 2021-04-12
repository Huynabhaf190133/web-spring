package T3H.QuanLyBanGiay.Business;

import T3H.QuanLyBanGiay.DataAccess.ConnectSql;
import T3H.QuanLyBanGiay.model.Customer;
import T3H.QuanLyBanGiay.model.Giay;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class CustomerBus extends BaseBus implements IBus<Customer>{


    @Override
    public List<Customer> getAll() {
        return null;
    }

    @Override
    public Customer getSingleByID(String id) {
        return null;
    }

    @Override
    public List<Customer> getByKeyword(String keyword) {
        return null;
    }

    @Override
    public void add(Customer info) {

    }

    @Override
    public void Update(Customer info) {

    }

    @Override
    public void delete(String id) {

    }
}

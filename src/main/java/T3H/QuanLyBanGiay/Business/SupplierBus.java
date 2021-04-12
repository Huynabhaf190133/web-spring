package T3H.QuanLyBanGiay.Business;

import T3H.QuanLyBanGiay.DataAccess.ConnectSql;
import T3H.QuanLyBanGiay.model.Giay;
import T3H.QuanLyBanGiay.model.Supplier;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class SupplierBus extends BaseBus implements IBus<Supplier>{

    @Override
    public List<Supplier> getAll() {
        return null;
    }

    @Override
    public Supplier getSingleByID(String id) {
        return null;
    }

    @Override
    public List<Supplier> getByKeyword(String keyword) {
        return null;
    }

    @Override
    public void add(Supplier info) {

    }

    @Override
    public void Update(Supplier info) {

    }

    @Override
    public void delete(String id) {

    }
}

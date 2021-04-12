package T3H.QuanLyBanGiay.Business;

import T3H.QuanLyBanGiay.DataAccess.ConnectSql;
import T3H.QuanLyBanGiay.model.Giay;
import T3H.QuanLyBanGiay.model.NSX;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class NSXBus extends BaseBus implements IBus<NSX>{

    @Override
    public List<NSX> getAll() {
        return null;
    }

    @Override
    public NSX getSingleByID(String id) {
        return null;
    }

    @Override
    public List<NSX> getByKeyword(String keyword) {
        return null;
    }

    @Override
    public void add(NSX info) {

    }

    @Override
    public void Update(NSX info) {

    }

    @Override
    public void delete(String id) {

    }
}

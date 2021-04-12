package T3H.QuanLyBanGiay.Business;

import T3H.QuanLyBanGiay.DataAccess.ConnectSql;
import T3H.QuanLyBanGiay.model.Giay;
import T3H.QuanLyBanGiay.model.PhieuXuat;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class PhieuXuatBus extends BaseBus implements IBus<PhieuXuat>{

    @Override
    public List<PhieuXuat> getAll() {
        return null;
    }

    @Override
    public PhieuXuat getSingleByID(String id) {
        return null;
    }

    @Override
    public List<PhieuXuat> getByKeyword(String keyword) {
        return null;
    }

    @Override
    public void add(PhieuXuat info) {

    }

    @Override
    public void Update(PhieuXuat info) {

    }

    @Override
    public void delete(String id) {

    }
}

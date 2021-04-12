package T3H.QuanLyBanGiay.Business;

import T3H.QuanLyBanGiay.DataAccess.ConnectSql;
import T3H.QuanLyBanGiay.model.Giay;
import T3H.QuanLyBanGiay.model.NhanVien;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class NhanVienBus extends BaseBus implements IBus<NhanVien>{

    @Override
    public List<NhanVien> getAll() {
        return null;
    }

    @Override
    public NhanVien getSingleByID(String id) {
        return null;
    }

    @Override
    public List<NhanVien> getByKeyword(String keyword) {
        return null;
    }

    @Override
    public void add(NhanVien info) {

    }

    @Override
    public void Update(NhanVien info) {

    }

    @Override
    public void delete(String id) {

    }
}

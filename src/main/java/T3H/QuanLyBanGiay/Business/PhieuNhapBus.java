package T3H.QuanLyBanGiay.Business;

import T3H.QuanLyBanGiay.DataAccess.ConnectSql;
import T3H.QuanLyBanGiay.model.Giay;
import T3H.QuanLyBanGiay.model.PhieuNhap;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class PhieuNhapBus extends BaseBus implements IBus<PhieuNhap>{

    @Override
    public List<PhieuNhap> getAll() {
        return null;
    }

    @Override
    public PhieuNhap getSingleByID(String id) {
        return null;
    }

    @Override
    public List<PhieuNhap> getByKeyword(String keyword) {
        return null;
    }

    @Override
    public void add(PhieuNhap info) {

    }

    @Override
    public void Update(PhieuNhap info) {

    }

    @Override
    public void delete(String id) {

    }
}

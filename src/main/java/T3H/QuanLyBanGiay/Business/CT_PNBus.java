package T3H.QuanLyBanGiay.Business;

import T3H.QuanLyBanGiay.DataAccess.ConnectSql;
import T3H.QuanLyBanGiay.model.CT_PN;
import T3H.QuanLyBanGiay.model.Giay;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class CT_PNBus extends BaseBus implements IBus<CT_PN>{

    @Override
    public List<CT_PN> getAll() {
        return null;
    }

    @Override
    public CT_PN getSingleByID(String id) {
        return null;
    }

    @Override
    public List<CT_PN> getByKeyword(String keyword) {
        return null;
    }

    @Override
    public void add(CT_PN info) {

    }

    @Override
    public void Update(CT_PN info) {

    }

    @Override
    public void delete(String id) {

    }
}

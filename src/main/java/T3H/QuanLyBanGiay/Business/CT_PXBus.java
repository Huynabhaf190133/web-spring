package T3H.QuanLyBanGiay.Business;

import T3H.QuanLyBanGiay.model.CT_PN;
import T3H.QuanLyBanGiay.model.CT_PX;
import T3H.QuanLyBanGiay.model.Giay;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class CT_PXBus extends BaseBus implements IBus<CT_PX>{

    @Override
    public List<CT_PX> getAll() {
        return null;
    }

    @Override
    public CT_PX getSingleByID(String id) {
        return null;
    }

    @Override
    public List<CT_PX> getByKeyword(String keyword) {
        return null;
    }

    @Override
    public void add(CT_PX info) {

    }

    @Override
    public void Update(CT_PX info) {

    }

    @Override
    public void delete(String id) {

    }
}

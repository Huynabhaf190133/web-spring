package T3H.QuanLyBanGiay.Business;

import T3H.QuanLyBanGiay.DataAccess.ConnectSql;

import java.util.ArrayList;
import java.util.List;

public class BaseBus {
    protected ConnectSql db;
    protected String query;
    List<String> parameters;

    public BaseBus() {
        db = new ConnectSql();
        parameters = new ArrayList<>();
    }

}

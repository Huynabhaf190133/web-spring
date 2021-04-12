package T3H.QuanLyBanGiay.Business;
import T3H.QuanLyBanGiay.model.*;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class initInfo {
    private ResultSet result_;

    public Giay initGiay(ResultSet result) throws SQLException{
        Giay giay=new Giay();
        giay= new Giay(
                result.getString("MaGiay"),
                result.getString("TenGiay"),
                result.getInt("Size"),
                result.getInt("SoLuong"),
                result.getString("MauSac"),
                result.getInt("Gia"),
                result.getString("MaLG"),
                result.getString("MaNSX"),
                result.getString("Anh"),
                result.getString("Mota")
        );
        return giay;

    }

}

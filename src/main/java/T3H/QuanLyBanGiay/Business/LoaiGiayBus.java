package T3H.QuanLyBanGiay.Business;

import T3H.QuanLyBanGiay.DataAccess.ConnectSql;
import T3H.QuanLyBanGiay.model.Giay;
import T3H.QuanLyBanGiay.model.LoaiGiay;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class LoaiGiayBus extends BaseBus implements IBus<LoaiGiay>{

    @Override
    public List<LoaiGiay> getAll() {
        List<LoaiGiay> loaiGiays=new ArrayList<>();
        query="select * from LoaiGiay";
        Connection conn=db.getConnection();
        if(conn!=null){
            try {
                PreparedStatement ps=(PreparedStatement)db.getConnection().prepareStatement(query);
                ResultSet resultSet=ps.executeQuery();
                initInfo initInfo=new initInfo();
                while (resultSet.next()){
                    loaiGiays.add(initInfo.initLoaiGiay(resultSet));
                }
                System.out.println(resultSet);
                ps.close();
            } catch (SQLException throwables) {
                throwables.printStackTrace();
            }
        }
        return loaiGiays;
    }

    @Override
    public LoaiGiay getSingleByID(String id) {
        return null;
    }

    @Override
    public List<LoaiGiay> getByKeyword(String keyword) {
        return null;
    }

    @Override
    public void add(LoaiGiay info) {

    }

    @Override
    public void Update(LoaiGiay info) {

    }

    @Override
    public void delete(String id) {

    }
}

package T3H.QuanLyBanGiay.Business;

import T3H.QuanLyBanGiay.model.Account;
import T3H.QuanLyBanGiay.model.NSX;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class NSXBus extends BaseBus implements IBus<NSX>{

    @Override
    public List<NSX> getAll() {
        List<NSX> nsxes=new ArrayList<>();
        query="select * from NSX";
        Connection conn=db.getConnection();
        if(conn!=null){
            try{
                PreparedStatement ps=(PreparedStatement)db.getConnection().prepareStatement(query);
                ResultSet resultSet=ps.executeQuery();
                initInfo initInfo=new initInfo();
                while (resultSet.next()){
                    nsxes.add(initInfo.initNXS(resultSet));
                }
                ps.close();
            }catch (Exception throwables) {
                throwables.printStackTrace();
            }


        }
        return nsxes;
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
    public Account add(NSX info) {

        return null;
    }

    @Override
    public void Update(NSX info) {

    }

    @Override
    public void delete(String id) {

    }
}

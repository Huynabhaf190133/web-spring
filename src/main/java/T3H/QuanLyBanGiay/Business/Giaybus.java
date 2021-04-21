package T3H.QuanLyBanGiay.Business;

import T3H.QuanLyBanGiay.model.Account;
import T3H.QuanLyBanGiay.model.Giay;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class Giaybus extends BaseBus implements IBus<Giay>{
    public List<Giay> getAll() {
        List<Giay> giays = new ArrayList<>();
        query = "Select * from Giay";
        Connection conn = db.getConnection();
        if (conn != null) {
            try {
                PreparedStatement ps = (PreparedStatement) db.getConnection().prepareStatement(query);

                ResultSet result = ps.executeQuery();
                initInfo initInfo=new initInfo();
                while (result.next()) {
                    giays.add(initInfo.initGiay(result));
                }
                ps.close();
            } catch (Exception throwables) {
                throwables.printStackTrace();
            }

        }
        return giays;

    }
    public Giay getSingleByID(String id) {
        Giay giay=null;
        query = "Select * from giay where Magiay=?";
        parameters.add(id);
        ResultSet resultSet=db.getTable(query,parameters);
        try{
            while (resultSet.next()){
                giay=new initInfo().initGiay(resultSet);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

        parameters.clear();
        db.closeConnection();
        return giay;
    }
    public List<Giay> getByKeyword(String keyword) {
        List<Giay> giays=new ArrayList<>();
        query = "Select * from giay where Magiay='%?%'";
        parameters.add(keyword);
        ResultSet result=db.getTable(query,parameters);
        initInfo initInfo=new initInfo();
        try{
            while (result.next()){
                giays.add(initInfo.initGiay(result));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }


        return giays;
    }

    @Override
    public Account add(Giay giay) {
        query="Insert into giay values(?,?,?,?,?,?,?,?,?,?)";
        parameters.add(null);
        parameters.add(giay.getTenGiay());
        parameters.add(String.valueOf(giay.getSize()));
        parameters.add(String.valueOf(giay.getSoLuong()));
        parameters.add(String.valueOf(giay.getMauSac()));
        parameters.add(String.valueOf(giay.getGia()));
        parameters.add(String.valueOf(giay.getMaLG()));
        parameters.add(String.valueOf(giay.getMaNSX()));
        parameters.add(giay.getAnh());
        parameters.add(giay.getMota());

        System.out.println(parameters);
        System.out.println(query);

        db.executeQuery(query,parameters);

        parameters.clear();
        return null;
    }

    @Override
    public void Update(Giay giay) {
        query="Update Giay set TenGiay=?,Anh=? Where MaGiay=?";
        parameters.add(giay.getTenGiay());
        parameters.add(giay.getAnh());
        parameters.add(giay.getMaLG());


        db.executeQuery(query,parameters);
    }


    public void delete(String id){
        query="DELETE giay where Magiay=?";
        parameters.add(id);
        db.executeQuery(query,parameters);
    }

}

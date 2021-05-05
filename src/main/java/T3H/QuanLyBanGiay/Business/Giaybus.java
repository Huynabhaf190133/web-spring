package T3H.QuanLyBanGiay.Business;

import T3H.QuanLyBanGiay.ViewModel.GiayViewModel;
import T3H.QuanLyBanGiay.model.Account;
import T3H.QuanLyBanGiay.model.Giay;
import T3H.QuanLyBanGiay.model.LoaiGiay;
import T3H.QuanLyBanGiay.model.NSX;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class Giaybus extends BaseBus implements IBus<Giay>{
    public List<Giay> getAll() {
        List<Giay> giays = new ArrayList<>();
        query = "Select * From Giay";
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
    public List<GiayViewModel> getAll2() {
        List<GiayViewModel> giays = new ArrayList<>();
        query = "Select MaGiay,TenGiay,Size,SoLuong,MauSac,Gia,Giay.MaLG,TenLG,Giay.MaNSX,Mota,TenNSX,Anh,DiaChi\n" +
                "from Giay inner join LoaiGiay on Giay.MaLG=LoaiGiay.MaLG inner join NSX on Giay.MaNSX=NSX.MaNSX";
        Connection conn = db.getConnection();
        if (conn != null) {
            try {
                PreparedStatement ps = (PreparedStatement) db.getConnection().prepareStatement(query);

                ResultSet result = ps.executeQuery();
                initInfo initInfo=new initInfo();
                while (result.next()) {
                    giays.add(initInfo.initGiay2(result));
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
    public List<Giay> getByKeyword(Giay giay) {
        List<Giay> giays=new ArrayList<>();
        query = "Select * from Giay where Magiay =?";
        parameters.add(giay.getMaGiay());
        ResultSet result=db.getTable(query,parameters);
        initInfo initInfo=new initInfo();
        try{
            while (result.next()){
                giays.add(initInfo.initGiay(result));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        parameters.clear();
        return giays;
    }

    @Override
    public Account add(Giay giay) {
        query="Insert into giay values(?,?,?,?,?,?,?,?,?)";
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
        query="Update Giay set TenGiay=?,Size=?,SoLuong=?,MauSac=?,Gia=?,MaLG=?,MaNSX=?,Mota=? Where MaGiay=?";
        parameters.add(giay.getTenGiay());
        parameters.add(String.valueOf(giay.getSize()));
        parameters.add(String.valueOf(giay.getSoLuong()));
        parameters.add(giay.getMauSac());
        parameters.add(String.valueOf(giay.getGia()));
        parameters.add(giay.getMaLG());
        parameters.add(giay.getMaNSX());
        parameters.add(giay.getMota());
        parameters.add(giay.getMaGiay());
        System.out.println(parameters);
        System.out.println(query);
        db.executeQuery(query,parameters);
        parameters.clear();
        db.closeConnection();
    }


    public void delete(Giay id){
        query="DELETE From Giay where MaGiay=?";
        parameters.add(id.getMaGiay());

        System.out.println(query);
        System.out.println(parameters);
        db.executeQuery(query,parameters);
        parameters.clear();
        db.closeConnection();
    }

}

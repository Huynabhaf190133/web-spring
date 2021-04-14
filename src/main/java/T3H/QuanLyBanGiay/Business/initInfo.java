package T3H.QuanLyBanGiay.Business;
import T3H.QuanLyBanGiay.model.*;
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
    public LoaiGiay initLoaiGiay(ResultSet result) throws SQLException{
        LoaiGiay loaiGiay=new LoaiGiay();
        loaiGiay=new LoaiGiay(
                result.getString("MaLG"),
                result.getString("TenLG")
        );
        return loaiGiay;
    }
    public NSX initNXS(ResultSet result) throws SQLException{
        NSX nsx=new NSX();
        nsx=new NSX(
                result.getString("MaNSX"),
                result.getString("TenNSX"),
                result.getString("DiaChi"),
                result.getInt("Sdt"),
                result.getString("Email"),
                result.getString("TruSo")
        );
        return nsx;
    }
    public NhanVien initNhanVien(ResultSet result) throws SQLException{
        NhanVien nhanVien=new NhanVien();
        nhanVien=new NhanVien(
                result.getString("MaNV"),
                result.getString("HoTen"),
                result.getString("GTinh"),
                result.getDate("Dob"),
                result.getString("QueQuan"),
                result.getInt("Sdt"),
                result.getString("DiaChi"),
                result.getString("Email"),
                result.getString("NgayVaoLam"),
                result.getDouble("Luong"),
                result.getString("ChucVu")
        );
        return nhanVien;
    }
    public Customer initCustomer(ResultSet result) throws SQLException{
        Customer customer=new Customer();
        customer=new Customer(
                result.getString("MaKH"),
                result.getString("Hoten"),
                result.getString("GTinh"),
                result.getDate("Dob"),
                result.getString("Que"),
                result.getInt("Sdt"),
                result.getString("Diachi"),
                result.getDouble("TongTien")
        );
        return customer;
    }
    public CT_PN initCT_PN(ResultSet result) throws SQLException{
        CT_PN ct_pn=new CT_PN();
        ct_pn=new CT_PN(
                result.getString("MaKN"),
                result.getString("MaGiay"),
                result.getInt("SoLuong"),
                result.getDouble("GiaNhap")
        );
        return ct_pn;
    }
    public CT_PX initCT_PX(ResultSet result) throws SQLException{
        CT_PX ct_px=new CT_PX();
        ct_px=new CT_PX(
                result.getString("MaPX"),
                result.getString("MaGiay"),
                result.getInt("Soluong"),
                result.getDouble("GiaXuat")

        );
        return ct_px;
    }
    public PhieuNhap initPhieuNhap(ResultSet result) throws SQLException{
        PhieuNhap phieuNhap=new PhieuNhap();
        phieuNhap=new PhieuNhap(
                result.getString("MaPN"),
                result.getString("NgayNhap"),
                result.getString("MaNV"),
                result.getString("MaNCC"),
                result.getDouble("TongTien")
        );
        return phieuNhap;
    }
    public PhieuXuat initPhieuXuat(ResultSet result) throws  SQLException{
        PhieuXuat phieuXuat=new PhieuXuat();
        phieuXuat=new PhieuXuat(
                result.getString("MaPX"),
                result.getDate("NgayXuat"),
                result.getString("MaNV"),
                result.getString("MaKH"),
                result.getDouble("TongTien")
        );
        return phieuXuat;
    }
    public Supplier initSupplier(ResultSet result) throws SQLException{
        Supplier supplier=new Supplier();
        supplier=new Supplier(
                result.getString("MaNCC"),
                result.getString("TenNCC"),
                result.getString("DiaChi"),
                result.getInt("Sdt"),
                result.getString("Email"),
                result.getString("TruSo")
        );
        return supplier;
    }

}

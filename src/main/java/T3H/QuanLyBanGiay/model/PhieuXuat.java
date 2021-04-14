package T3H.QuanLyBanGiay.model;

import java.util.Date;

public class PhieuXuat {
    private String MaPX;
    private Date NgayXuat;
    private String MaNV;
    private String MaKH;
    private double TongTien;
    public PhieuXuat(){

    }
    public PhieuXuat(String maPX, Date ngayXuat, String maNV, String maKH, double tongTien) {
        MaPX = maPX;
        NgayXuat = ngayXuat;
        MaNV = maNV;
        MaKH = maKH;
        TongTien = tongTien;
    }

    public String getMaPX() {
        return MaPX;
    }

    public void setMaPX(String maPX) {
        MaPX = maPX;
    }

    public Date getNgayXuat() {
        return NgayXuat;
    }

    public void setNgayXuat(Date ngayXuat) {
        NgayXuat = ngayXuat;
    }

    public String getMaNV() {
        return MaNV;
    }

    public void setMaNV(String maNV) {
        MaNV = maNV;
    }

    public String getMaKH() {
        return MaKH;
    }

    public void setMaKH(String maKH) {
        MaKH = maKH;
    }

    public double getTongTien() {
        return TongTien;
    }

    public void setTongTien(double tongTien) {
        TongTien = tongTien;
    }
}

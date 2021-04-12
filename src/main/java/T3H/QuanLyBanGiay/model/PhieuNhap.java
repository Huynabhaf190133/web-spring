package T3H.QuanLyBanGiay.model;

public class PhieuNhap {
    private String MaPN;
    private String NgayNhap;
    private String MaNV;
    private double TongTien;
    public PhieuNhap(){

    }

    public PhieuNhap(String maPN, String ngayNhap, String maNV, double tongTien) {
        MaPN = maPN;
        NgayNhap = ngayNhap;
        MaNV = maNV;
        TongTien = tongTien;
    }

    public String getMaPN() {
        return MaPN;
    }

    public void setMaPN(String maPN) {
        MaPN = maPN;
    }

    public String getNgayNhap() {
        return NgayNhap;
    }

    public void setNgayNhap(String ngayNhap) {
        NgayNhap = ngayNhap;
    }

    public String getMaNV() {
        return MaNV;
    }

    public void setMaNV(String maNV) {
        MaNV = maNV;
    }

    public double getTongTien() {
        return TongTien;
    }

    public void setTongTien(double tongTien) {
        TongTien = tongTien;
    }
}

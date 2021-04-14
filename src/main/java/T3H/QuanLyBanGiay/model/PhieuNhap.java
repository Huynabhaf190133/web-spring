package T3H.QuanLyBanGiay.model;

public class PhieuNhap {
    private String MaPN;
    private String NgayNhap;
    private String MaNV;
    private String MaNCC;
    private double TongTien;
    public PhieuNhap(){

    }

    public PhieuNhap(String maPN, String ngayNhap, String maNV, String maNCC, double tongTien) {
        MaPN = maPN;
        NgayNhap = ngayNhap;
        MaNV = maNV;
        MaNCC = maNCC;
        TongTien = tongTien;
    }

    public String getMaPN() {
        return MaPN;
    }

    public String getMaNCC() {
        return MaNCC;
    }

    public void setMaNCC(String maNCC) {
        MaNCC = maNCC;
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

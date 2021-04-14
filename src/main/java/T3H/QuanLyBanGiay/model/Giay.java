package T3H.QuanLyBanGiay.model;

public class Giay {
    private String MaGiay;
    private String TenGiay;
    private int Size;
    private int SoLuong;
    private String MauSac;
    private double Gia;
    private String MaLG;
    private String MaNSX;
    private String Anh;
    private String Mota;

    public Giay() {

    }

    public Giay(String maGiay, String tenGiay, int size, int soLuong, String mauSac, double gia, String maLG, String maNSX, String anh, String mota) {
        MaGiay = maGiay;
        TenGiay = tenGiay;
        Size = size;
        SoLuong = soLuong;
        MauSac = mauSac;
        Gia = gia;
        MaLG = maLG;
        MaNSX = maNSX;
        Anh = anh;
        Mota = mota;
    }

    public String getMaGiay() {
        return MaGiay;
    }

    public String getTenGiay() {
        return TenGiay;
    }

    public int getSize() {
        return Size;
    }

    public int getSoLuong() {
        return SoLuong;
    }

    public String getMauSac() {
        return MauSac;
    }

    public double getGia() {
        return Gia;
    }

    public String getMaLG() {
        return MaLG;
    }

    public String getMaNSX() {
        return MaNSX;
    }

    public String getAnh() {
        return Anh;
    }

    public String getMota() {
        return Mota;
    }

    public void setMaGiay(String maGiay) {
        MaGiay = maGiay;
    }

    public void setTenGiay(String tenGiay) {
        TenGiay = tenGiay;
    }

    public void setSize(int size) {
        Size = size;
    }

    public void setSoLuong(int soLuong) {
        SoLuong = soLuong;
    }

    public void setMauSac(String mauSac) {
        MauSac = mauSac;
    }

    public void setGia(double gia) {
        Gia = gia;
    }

    public void setMaLG(String maLG) {
        MaLG = maLG;
    }

    public void setMaNSX(String maNSX) {
        MaNSX = maNSX;
    }

    public void setAnh(String anh) {
        Anh = anh;
    }

    public void setMota(String mota) {
        Mota = mota;
    }
}

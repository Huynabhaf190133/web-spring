package T3H.QuanLyBanGiay.ViewModel;

public class GiayViewModel {
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
    private String TenLG;
    private String TenNSX;

    public GiayViewModel(){

    }
    public GiayViewModel(String maGiay, String tenGiay, int size, int soLuong, String mauSac, double gia, String maLG, String maNSX, String anh, String mota, String tenLG, String tenNSX) {
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
        TenLG = tenLG;
        TenNSX = tenNSX;
    }

    public String getMaGiay() {
        return MaGiay;
    }

    public void setMaGiay(String maGiay) {
        MaGiay = maGiay;
    }

    public String getTenGiay() {
        return TenGiay;
    }

    public void setTenGiay(String tenGiay) {
        TenGiay = tenGiay;
    }

    public int getSize() {
        return Size;
    }

    public void setSize(int size) {
        Size = size;
    }

    public int getSoLuong() {
        return SoLuong;
    }

    public void setSoLuong(int soLuong) {
        SoLuong = soLuong;
    }

    public String getMauSac() {
        return MauSac;
    }

    public void setMauSac(String mauSac) {
        MauSac = mauSac;
    }

    public double getGia() {
        return Gia;
    }

    public void setGia(double gia) {
        Gia = gia;
    }

    public String getMaLG() {
        return MaLG;
    }

    public void setMaLG(String maLG) {
        MaLG = maLG;
    }

    public String getMaNSX() {
        return MaNSX;
    }

    public void setMaNSX(String maNSX) {
        MaNSX = maNSX;
    }

    public String getAnh() {
        return Anh;
    }

    public void setAnh(String anh) {
        Anh = anh;
    }

    public String getMota() {
        return Mota;
    }

    public void setMota(String mota) {
        Mota = mota;
    }

    public String getTenLG() {
        return TenLG;
    }

    public void setTenLG(String tenLG) {
        TenLG = tenLG;
    }

    public String getTenNSX() {
        return TenNSX;
    }

    public void setTenNSX(String tenNSX) {
        TenNSX = tenNSX;
    }
}

package T3H.QuanLyBanGiay.model;

public class NSX {
    private String MaNSX;
    private String TenNSX;
    private String DiaChi;
    private int Sdt;
    private String Email;
    private String TruSo;

    public NSX(){}

    public NSX(String maNSX, String tenNSX, String diaChi, int sdt, String email, String truSo) {
        MaNSX = maNSX;
        TenNSX = tenNSX;
        DiaChi = diaChi;
        Sdt = sdt;
        Email = email;
        TruSo = truSo;
    }

    public String getMaNSX() {
        return MaNSX;
    }

    public void setMaNSX(String maNSX) {
        MaNSX = maNSX;
    }

    public String getTenNSX() {
        return TenNSX;
    }

    public void setTenNSX(String tenNSX) {
        TenNSX = tenNSX;
    }

    public String getDiaChi() {
        return DiaChi;
    }

    public void setDiaChi(String diaChi) {
        DiaChi = diaChi;
    }

    public int getSdt() {
        return Sdt;
    }

    public void setSdt(int sdt) {
        Sdt = sdt;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String email) {
        Email = email;
    }

    public String getTruSo() {
        return TruSo;
    }

    public void setTruSo(String truSo) {
        TruSo = truSo;
    }
}

package T3H.QuanLyBanGiay.model;

public class Supplier {
    private String MaNCC;
    private String TenNCC;
    private String DiaChi;
    private int Sdt;
    private String Email;
    private String TruSo;
    public Supplier(){

    }

    public Supplier(String maNCC, String tenNCC, String diaChi, int sdt, String email, String truSo) {
        MaNCC = maNCC;
        TenNCC = tenNCC;
        DiaChi = diaChi;
        Sdt = sdt;
        Email = email;
        TruSo = truSo;
    }

    public String getMaNCC() {
        return MaNCC;
    }

    public void setMaNCC(String maNCC) {
        MaNCC = maNCC;
    }

    public String getTenNCC() {
        return TenNCC;
    }

    public void setTenNCC(String tenNCC) {
        TenNCC = tenNCC;
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

package T3H.QuanLyBanGiay.model;

import java.util.Date;

public class NhanVien {
    private String MaNV;
    private String HoTen;
    private String GTinh;
    private Date Dob;
    private String QueQuan;
    private int Sdt;
    private String DiaChi;
    private String Email;
    private String NgayVaoLam;
    private Double Luong;
    private String ChucVu;
    public NhanVien(){

    }
    public NhanVien(String maNV, String hoTen, String GTinh, Date dob, String queQuan, int sdt, String diaChi, String email, String ngayVaoLam, Double luong, String chucVu) {
        MaNV = maNV;
        HoTen = hoTen;
        this.GTinh = GTinh;
        Dob = dob;
        QueQuan = queQuan;
        Sdt = sdt;
        DiaChi = diaChi;
        Email = email;
        NgayVaoLam = ngayVaoLam;
        Luong = luong;
        ChucVu = chucVu;
    }

    public String getMaNV() {
        return MaNV;
    }

    public void setMaNV(String maNV) {
        MaNV = maNV;
    }

    public String getHoTen() {
        return HoTen;
    }

    public void setHoTen(String hoTen) {
        HoTen = hoTen;
    }

    public String getGTinh() {
        return GTinh;
    }

    public void setGTinh(String GTinh) {
        this.GTinh = GTinh;
    }

    public Date getDob() {
        return Dob;
    }

    public void setDob(Date dob) {
        Dob = dob;
    }

    public String getQueQuan() {
        return QueQuan;
    }

    public void setQueQuan(String queQuan) {
        QueQuan = queQuan;
    }

    public int getSdt() {
        return Sdt;
    }

    public void setSdt(int sdt) {
        Sdt = sdt;
    }

    public String getDiaChi() {
        return DiaChi;
    }

    public void setDiaChi(String diaChi) {
        DiaChi = diaChi;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String email) {
        Email = email;
    }

    public String getNgayVaoLam() {
        return NgayVaoLam;
    }

    public void setNgayVaoLam(String ngayVaoLam) {
        NgayVaoLam = ngayVaoLam;
    }

    public Double getLuong() {
        return Luong;
    }

    public void setLuong(Double luong) {
        Luong = luong;
    }

    public String getChucVu() {
        return ChucVu;
    }

    public void setChucVu(String chucVu) {
        ChucVu = chucVu;
    }
}

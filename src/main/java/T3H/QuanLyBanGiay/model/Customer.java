package T3H.QuanLyBanGiay.model;

import java.util.Date;

public class Customer {
    private String MaKH;
    private String Hoten;
    private String GTinh;
    private Date Dob;
    private String Que;
    private int Sdt;
    private String Diachi;
    private double TongTien;
    public Customer(){

    }

    public Customer(String maKH, String hoten, String GTinh, Date dob, String que, int sdt, String diachi, double tongTien) {
        MaKH = maKH;
        Hoten = hoten;
        this.GTinh = GTinh;
        Dob = dob;
        Que = que;
        Sdt = sdt;
        Diachi = diachi;
        TongTien = tongTien;
    }

    public String getMaKH() {
        return MaKH;
    }

    public void setMaKH(String maKH) {
        MaKH = maKH;
    }

    public String getHoten() {
        return Hoten;
    }

    public void setHoten(String hoten) {
        Hoten = hoten;
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

    public String getQue() {
        return Que;
    }

    public void setQue(String que) {
        Que = que;
    }

    public int getSdt() {
        return Sdt;
    }

    public void setSdt(int sdt) {
        Sdt = sdt;
    }

    public String getDiachi() {
        return Diachi;
    }

    public void setDiachi(String diachi) {
        Diachi = diachi;
    }

    public double getTongTien() {
        return TongTien;
    }

    public void setTongTien(double tongTien) {
        TongTien = tongTien;
    }
}

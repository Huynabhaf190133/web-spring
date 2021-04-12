package T3H.QuanLyBanGiay.model;

public class CT_PN {
    private String MaPN;
    private String MaGiay;
    private int Soluong;
    private double GiaNhap;
    public CT_PN(){}

    public CT_PN(String maPN, String maGiay, int soluong, double giaNhap) {
        MaPN = maPN;
        MaGiay = maGiay;
        Soluong = soluong;
        GiaNhap = giaNhap;
    }

    public String getMaPN() {
        return MaPN;
    }

    public void setMaPN(String maPN) {
        MaPN = maPN;
    }

    public String getMaGiay() {
        return MaGiay;
    }

    public void setMaGiay(String maGiay) {
        MaGiay = maGiay;
    }

    public int getSoluong() {
        return Soluong;
    }

    public void setSoluong(int soluong) {
        Soluong = soluong;
    }

    public double getGiaNhap() {
        return GiaNhap;
    }

    public void setGiaNhap(double giaNhap) {
        GiaNhap = giaNhap;
    }
}

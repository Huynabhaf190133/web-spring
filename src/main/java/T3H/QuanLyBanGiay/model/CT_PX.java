package T3H.QuanLyBanGiay.model;

public class CT_PX {
    private String MaPX;
    private String MaGiay;
    private int Soluong;
    private Double GiaXuat;
    public CT_PX(){

    }

    public CT_PX(String maPX, String maGiay, int soluong, Double giaXuat) {
        MaPX = maPX;
        MaGiay = maGiay;
        Soluong = soluong;
        GiaXuat = giaXuat;
    }

    public String getMaPX() {
        return MaPX;
    }

    public void setMaPX(String maPX) {
        MaPX = maPX;
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

    public Double getGiaXuat() {
        return GiaXuat;
    }

    public void setGiaXuat(Double giaXuat) {
        GiaXuat = giaXuat;
    }
}

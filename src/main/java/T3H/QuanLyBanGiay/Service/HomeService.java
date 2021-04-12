package T3H.QuanLyBanGiay.Service;

import T3H.QuanLyBanGiay.model.*;

import java.util.List;

public interface HomeService {
    List<String> LoadMenu();
    List<Giay> LoadGiay();
    List<LoaiGiay> LoadLoaiGiay();
    List<CT_PN> LoadCT_PN();
    List<CT_PX> LoadCT_PX();
    List<Customer> LoadCustomer();
    List<NhanVien> LoadNhanVien();
    List<NSX> LoadNSX();
    List<PhieuNhap> LoadPhieuNhap();
    List<PhieuXuat> LoadPhieuXuat();
    List<Supplier> LoadSupplier();
}


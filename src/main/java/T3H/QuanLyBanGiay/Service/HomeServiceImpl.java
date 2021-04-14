package T3H.QuanLyBanGiay.Service;

import T3H.QuanLyBanGiay.Service.HomeService;
import T3H.QuanLyBanGiay.model.*;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
@Service

public class HomeServiceImpl implements HomeService {
    @Override
    public List<String> LoadMenu() {
        List<String> menus = new ArrayList<>();
        menus.add("Trang 1");
        menus.add("Trang 2");
        return menus;
    }

    @Override
    public List<Giay> LoadGiay() {
       List<Giay> giays=new ArrayList<>();

       return giays;
    }

    @Override
    public List<LoaiGiay> LoadLoaiGiay() {
        List<LoaiGiay> Loaigiays=new ArrayList<>();
        Loaigiays.add(new LoaiGiay("LG01","Giay alidas"));
        return Loaigiays;
    }

    @Override
    public List<CT_PN> LoadCT_PN() {
        List<CT_PN> CT_PNs=new ArrayList<>();
        CT_PNs.add(new CT_PN());
        return CT_PNs;
    }

    @Override
    public List<CT_PX> LoadCT_PX() {
        List<CT_PX> CT_PXs=new ArrayList<>();
        CT_PXs.add(new CT_PX());
        return CT_PXs;
    }

    @Override
    public List<Customer> LoadCustomer() {
        List<Customer> Customers=new ArrayList<>();
        Customers.add(new Customer());
        return Customers;
    }

    @Override
    public List<NhanVien> LoadNhanVien() {
        List<NhanVien> Nhanviens=new ArrayList<>();
        Nhanviens.add(new NhanVien());
        return Nhanviens;
    }

    @Override
    public List<NSX> LoadNSX() {
        List<NSX> NSXs=new ArrayList<>();
        NSXs.add(new NSX());
        return NSXs;
    }

    @Override
    public List<PhieuNhap> LoadPhieuNhap() {
        List<PhieuNhap> PhieuNhaps=new ArrayList<>();
        PhieuNhaps.add(new PhieuNhap());
        return PhieuNhaps;
    }

    @Override
    public List<PhieuXuat> LoadPhieuXuat() {
        List<PhieuXuat> PhieuXuats=new ArrayList<>();
        PhieuXuats.add(new PhieuXuat());
        return PhieuXuats;
    }

    @Override
    public List<Supplier> LoadSupplier() {
        List<Supplier> Suppliers=new ArrayList<>();
        Suppliers.add(new Supplier());
        return Suppliers;
    }


}

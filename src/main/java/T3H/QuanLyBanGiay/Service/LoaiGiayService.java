package T3H.QuanLyBanGiay.Service;

import T3H.QuanLyBanGiay.Business.LoaiGiayBus;
import T3H.QuanLyBanGiay.model.Giay;

import java.util.List;

public class LoaiGiayService implements IGiayService{
    private LoaiGiayBus bus;
    public LoaiGiayService(){
        bus=new LoaiGiayBus();
    }

    @Override
    public List<Giay> getAll() {
        return null;
    }

    @Override
    public Giay getByID(String id) {
        return null;
    }

    @Override
    public List<Giay> getByKeyWord(String keyword) {
        return null;
    }

    @Override
    public void add(Giay intro) {

    }

    @Override
    public void edit(Giay info) {

    }

    @Override
    public void delete(String id) {

    }
}

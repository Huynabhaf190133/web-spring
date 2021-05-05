package T3H.QuanLyBanGiay.Service;

import T3H.QuanLyBanGiay.Business.LoaiGiayBus;
import T3H.QuanLyBanGiay.model.Giay;
import T3H.QuanLyBanGiay.model.LoaiGiay;

import java.util.List;

public class LoaiGiayService implements IcommonService<LoaiGiay> {
    private LoaiGiayBus bus;
    public LoaiGiayService(){
        bus=new LoaiGiayBus();
    }


    @Override
    public List<LoaiGiay> getAll() {
        return bus.getAll();
    }

    @Override
    public LoaiGiay getByID(String id) {
        return null;
    }


    @Override
    public List<LoaiGiay> getByKeyWord(LoaiGiay keyword) {
        return null;
    }

    @Override
    public void add(LoaiGiay intro) {

    }

    @Override
    public void edit(LoaiGiay info) {

    }

    @Override
    public void delete(LoaiGiay id) {

    }

}

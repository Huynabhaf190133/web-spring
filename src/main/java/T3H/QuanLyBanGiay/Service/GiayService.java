package T3H.QuanLyBanGiay.Service;

import T3H.QuanLyBanGiay.Business.Giaybus;
import T3H.QuanLyBanGiay.ViewModel.GiayViewModel;
import T3H.QuanLyBanGiay.model.Giay;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class GiayService implements IGiayService{
    // tang bus: thao tac voi db
    // tang service: dung tang bus, thang controller se goi den thang service chu khong goi thang bus
    //
    private Giaybus bus;

    public GiayService(){bus=new Giaybus();}

    @Override
    public List<Giay> getAll() {
        return bus.getAll();
    }

    @Override
    public Giay getByID(String id) {
        return bus.getSingleByID(id);
    }

    public List<GiayViewModel> getAll2() {
        return bus.getAll2();
    }

    @Override
    public List<Giay> getByKeyWord(Giay keyword) {
        return bus.getByKeyword(keyword);
    }

    @Override
    public void add(Giay info) {
        bus.add(info);
    }

    @Override
    public void edit(Giay info) {
        bus.Update(info);
    }


    @Override
    public void delete(Giay giay) {
        bus.delete(giay);
    }


}

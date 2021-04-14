package T3H.QuanLyBanGiay.Service;

import T3H.QuanLyBanGiay.Business.Giaybus;
import T3H.QuanLyBanGiay.model.Giay;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class GiayService implements IGiayService{
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

    @Override
    public List<Giay> getByKeyWord(String keyword) {
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
    public void delete(String id) {
        bus.delete(id);
    }


}

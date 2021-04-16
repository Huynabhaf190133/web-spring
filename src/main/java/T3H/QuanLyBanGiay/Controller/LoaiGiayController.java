package T3H.QuanLyBanGiay.Controller;

import T3H.QuanLyBanGiay.Business.LoaiGiayBus;
import T3H.QuanLyBanGiay.Business.NSXBus;
import T3H.QuanLyBanGiay.Service.HomeService;
import T3H.QuanLyBanGiay.Service.LoaiGiayService;
import T3H.QuanLyBanGiay.model.LoaiGiay;
import T3H.QuanLyBanGiay.model.NSX;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
public class LoaiGiayController {
    private LoaiGiayService LoaiGiayService;
    public LoaiGiayController(){
        LoaiGiayService=new LoaiGiayService();
    }
    @RequestMapping(value = "/loaigiay/getloaigiay",method = RequestMethod.GET)
    @ResponseBody
    public List<LoaiGiay> getAll(){
        List<LoaiGiay> loaiGiays=new LoaiGiayBus().getAll();
        return loaiGiays;
    }
}

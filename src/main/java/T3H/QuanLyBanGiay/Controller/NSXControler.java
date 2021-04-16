package T3H.QuanLyBanGiay.Controller;

import T3H.QuanLyBanGiay.Business.NSXBus;
import T3H.QuanLyBanGiay.model.NSX;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
public class NSXControler {
    @RequestMapping(value = "/NSX/getnsx",method = RequestMethod.GET)
    @ResponseBody
    public List<NSX> getAll(){
        List<NSX> nsxes=new NSXBus().getAll();
        return nsxes;
    }

}

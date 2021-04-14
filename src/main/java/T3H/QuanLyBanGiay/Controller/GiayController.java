package T3H.QuanLyBanGiay.Controller;

import T3H.QuanLyBanGiay.Business.Giaybus;
import T3H.QuanLyBanGiay.Business.LoaiGiayBus;
import T3H.QuanLyBanGiay.Business.NSXBus;
import T3H.QuanLyBanGiay.Service.GiayService;
import T3H.QuanLyBanGiay.model.Giay;
import T3H.QuanLyBanGiay.model.LoaiGiay;
import T3H.QuanLyBanGiay.model.NSX;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Controller
public class GiayController {

    private GiayService giayService;

    public GiayController(){
        giayService = new GiayService();
    }

    @RequestMapping(value = "/giay/getAll",method = RequestMethod.GET)
    @ResponseBody
    public List<Giay> getAll(){
        List<Giay> giays=new Giaybus().getAll();

        return giays;
    }


    @RequestMapping(value = "/giay/index", method = RequestMethod.GET)
    @ResponseBody
    public ModelAndView createIndex(){
        ModelAndView modelAndView=new ModelAndView("/giay/index");


        return modelAndView;
    }

    @PostMapping(value = "/giay/create")
    public ModelAndView create(@ModelAttribute Giay giay){
        ModelAndView modelAndView=new ModelAndView("giay/index");
        //giayService.add(giay);
        Giaybus giaybus=new Giaybus();
        giaybus.add(giay);
        System.out.println(giaybus);
        //return modelAndView;
        return modelAndView;
    }
    @PostMapping(value = "/giay/edit")
    public ModelAndView edit(@ModelAttribute Giay giay){
        ModelAndView modelAndView=new ModelAndView("giay/index");
        giayService.edit(giay);
        return modelAndView;
    }


}

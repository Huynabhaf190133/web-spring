package T3H.QuanLyBanGiay.Controller;

import T3H.QuanLyBanGiay.Business.Giaybus;
import T3H.QuanLyBanGiay.Service.GiayService;
import T3H.QuanLyBanGiay.model.Giay;
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

    @RequestMapping(value = "/giay/getall",method = RequestMethod.GET)
    @ResponseBody
    public List<Giay> getAll(){
        List<Giay> giays=new Giaybus().getAll();
        return giays;
    }
    @RequestMapping(value = "/giay/index", method = RequestMethod.GET)
    @ResponseBody
    public ModelAndView create(){
        ModelAndView modelAndView=new ModelAndView("/giay/index");
        return modelAndView;
    }

    @PostMapping(value = "/giay/create")
    public ModelAndView create(@ModelAttribute Giay giay){
        ModelAndView modelAndView=new ModelAndView("giay/index");
        System.out.println(giay.getTenGiay());
        giayService.add(giay);
        System.out.println(giay.getTenGiay());
        return modelAndView;
    }

}

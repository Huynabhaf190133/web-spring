package T3H.QuanLyBanGiay.Controller;

import T3H.QuanLyBanGiay.Service.GiayService;
import T3H.QuanLyBanGiay.model.Account;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HomeController {
@Autowired
    private GiayService giayService;

    @RequestMapping(value = "/", method = RequestMethod.GET)
    public ModelAndView homePage() {
        ModelAndView mav = new ModelAndView("index");
        return mav;
    }


    @RequestMapping(value = "/index", method = RequestMethod.GET)
    @ResponseBody
    public ModelAndView createIndex(){
        ModelAndView modelAndView=new ModelAndView("/giay/index");
        return modelAndView;
    }


}
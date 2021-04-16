package T3H.QuanLyBanGiay.Controller;

import T3H.QuanLyBanGiay.Service.GiayService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HomeController {
@Autowired
    private GiayService giayService;

    @RequestMapping(value = "/", method = RequestMethod.GET)
    public ModelAndView homePage() {
        ModelAndView mav = new ModelAndView("index");

        //List<Giay> giays = new Giaybus().getAll();

       // mav.addObject("shoes",giays);
      //  m//av.addObject("LG",homeService.LoadLoaiGiay());
        return mav;
    }
    @RequestMapping(value = "/login",method = RequestMethod.GET)
    public ModelAndView login(){
        ModelAndView modelAndView=new ModelAndView("login");
        return modelAndView;
    }



}
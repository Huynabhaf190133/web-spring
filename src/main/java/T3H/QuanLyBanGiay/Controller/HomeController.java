package T3H.QuanLyBanGiay.Controller;

import T3H.QuanLyBanGiay.Business.Giaybus;
import T3H.QuanLyBanGiay.Service.GiayService;
import T3H.QuanLyBanGiay.model.Giay;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Controller
public class HomeController {
@Autowired
    private GiayService giayService;

    @RequestMapping(value = "/trang-chu", method = RequestMethod.GET)
    public ModelAndView homePage() {
        ModelAndView mav = new ModelAndView("home");

        //List<Giay> giays = new Giaybus().getAll();

       // mav.addObject("shoes",giays);
      //  m//av.addObject("LG",homeService.LoadLoaiGiay());
        return mav;
    }

    @RequestMapping(value = "/springmvc", method = RequestMethod.GET)
    public ModelAndView springMVCPage() {
        ModelAndView mav = new ModelAndView("springmvc");
      //  mav.addObject(homeService.LoadMenu());
        return mav;
    }

}
package T3H.QuanLyBanGiay.Controller;

import T3H.QuanLyBanGiay.Business.Giaybus;
import T3H.QuanLyBanGiay.Business.LoaiGiayBus;
import T3H.QuanLyBanGiay.Business.NSXBus;
import T3H.QuanLyBanGiay.Service.GiayService;
import T3H.QuanLyBanGiay.model.Giay;
import T3H.QuanLyBanGiay.model.LoaiGiay;
import T3H.QuanLyBanGiay.model.NSX;
import groovyjarjarantlr.preprocessor.Hierarchy;
import jdk.nashorn.internal.ir.RuntimeNode;
import org.springframework.beans.factory.HierarchicalBeanFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import javax.ws.rs.core.Request;
import java.util.List;

@Controller
@RequestMapping(value = "/giay/",method = RequestMethod.GET)
public class GiayController {
    @Autowired

    private GiayService giayService;

    public GiayController(){
        giayService = new GiayService();
    }

    @RequestMapping(value = "/getAll",method = RequestMethod.GET)
    @ResponseBody
    public List<Giay> getAll(){
        List<Giay> giays=giayService.getAll();

        return giays;
    }
    @GetMapping(value = "create")
    public ModelAndView create(HttpServletRequest request){
        ModelAndView modelAndView=new ModelAndView("/admin/giay/create");

        return modelAndView;

    }
    @PostMapping(value = "/index")
    public ModelAndView index(){
        ModelAndView modelAndView=new ModelAndView("/admin/giay/index");
        return modelAndView;

    }
    @PostMapping(value = "/add")
    @ResponseBody
    public void create(@RequestBody Giay giay){
        giayService.add(giay);
    }
    @PostMapping(value = "/edit")
    public Giay edit(@RequestParam Giay giay){
        giayService.edit(giay);
        return giay;
    }
    @PostMapping(value = "/delete")
    public void delete(@RequestParam String id){
        giayService.delete(id);
    }

    @RequestMapping(value = "/detail/{id}", method = RequestMethod.GET)
    @ResponseBody
    public Giay getDetails(@PathVariable("id") String id) {
        Giay giay = giayService.getByID(id);
        return giay;
    }

    @RequestMapping(value = "/detail/id={id}", method = RequestMethod.GET)
    public ModelAndView details(@PathVariable("id") String id) {
        ModelAndView mav = new ModelAndView("detail");
        mav.addObject("id",id);
        return mav;
    }
}

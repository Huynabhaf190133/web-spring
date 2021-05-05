package T3H.QuanLyBanGiay.Controller;
import T3H.QuanLyBanGiay.Service.GiayService;
import T3H.QuanLyBanGiay.ViewModel.GiayViewModel;
import T3H.QuanLyBanGiay.model.Giay;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
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

    // View admin
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
    @GetMapping("/index/getall")
    @ResponseBody
    public List<GiayViewModel> getAll2(){
        List<GiayViewModel> GiayViewModels=giayService.getAll2();
        return GiayViewModels;
    }
    @PostMapping(value = "/edit")
    public ModelAndView edit(){
        ModelAndView modelAndView=new ModelAndView("/admin/giay/edit");
        return modelAndView;
    }
    @RequestMapping(value = "/detail/id={id}", method = RequestMethod.GET)
    public ModelAndView details(@PathVariable("id") String id) {
        ModelAndView mav = new ModelAndView("detail");
        mav.addObject("id",id);
        return mav;
    }
    // Method

    @PostMapping(value = "/add")
    @ResponseBody
    public void create(@RequestBody Giay giay){
        giayService.add(giay);
    }


    @PostMapping(value = "/edit/send")
    @ResponseBody
    public void edit(@RequestBody Giay giay){
        System.out.println(giay);;giayService.edit(giay);
    }
    @PostMapping(value = "/delete")
    @ResponseBody
    public void delete(@RequestBody Giay giay){
        System.out.println(giay.getMaGiay());
        giayService.delete(giay);
    }

    @RequestMapping(value = "/detail/{id}", method = RequestMethod.GET)
    @ResponseBody
    public Giay getDetails(@PathVariable("id") String id) {
        Giay giay = giayService.getByID(id);
        return giay;
    }

    // Get By ID
    @PostMapping(value = "/getByKeyword")
    @ResponseBody
    public List<Giay> getByKeyWord(@RequestBody Giay giay){
        List<Giay> giay1=giayService.getByKeyWord(giay);
        return giay1;
    }


}

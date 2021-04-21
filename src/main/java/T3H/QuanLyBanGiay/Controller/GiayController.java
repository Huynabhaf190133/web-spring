package T3H.QuanLyBanGiay.Controller;
import T3H.QuanLyBanGiay.Service.GiayService;
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

    // View
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
    @PostMapping(value = "/edit")
    public ModelAndView edit(){
        ModelAndView modelAndView=new ModelAndView("/admin/giay/edit");
        return modelAndView;
    }

    // Method

    @PostMapping(value = "/add")
    public void create(@RequestBody Giay giay){
        giayService.add(giay);
    }


    @PostMapping(value = "/edit/send")
    public void edit(@RequestParam Giay giay){
        giayService.edit(giay);
    }
    @GetMapping(value = "/delete/{delete}")
    public ModelAndView delete(@PathVariable("delete") String id){
        giayService.delete(id);
        ModelAndView modelAndView=new ModelAndView("/admin/giay/edit");
        return modelAndView;
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

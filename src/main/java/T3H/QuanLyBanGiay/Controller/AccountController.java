package T3H.QuanLyBanGiay.Controller;
import T3H.QuanLyBanGiay.Service.AccountService;
import T3H.QuanLyBanGiay.model.Account;
import T3H.QuanLyBanGiay.model.Giay;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@Controller

public class AccountController {
    @Autowired
    private AccountService accountService;
    private AccountController(){accountService=new AccountService();}
    @RequestMapping(value = "/login", method = RequestMethod.GET)
    public String login() {
        return "login";
    }


    // Lấy tất cả tài khoản trong database ra
    @GetMapping(value = "/login/getall")
    @ResponseBody
    public List<Account> getAll(){
        List<Account> account=accountService.getAll();
        return account;
    }

    @PostMapping(value = "/login/send")
    @ResponseBody
    public Account login(@RequestBody Account json){
        Account account=accountService.login(json);

        return account;
    }
    @PostMapping(value = "/logup/add")
    @ResponseBody
    public void add(@RequestBody Account account){
        accountService.add(account);
    }

}

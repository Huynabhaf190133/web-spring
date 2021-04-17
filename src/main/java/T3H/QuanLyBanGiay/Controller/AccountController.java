package T3H.QuanLyBanGiay.Controller;

import T3H.QuanLyBanGiay.Business.AccountBus;
import T3H.QuanLyBanGiay.Service.AccountService;
import T3H.QuanLyBanGiay.model.Account;
import com.google.gson.JsonArray;
import com.sun.istack.NotNull;
import jdk.nashorn.internal.parser.JSONParser;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@Controller

public class AccountController {
    @Autowired
    private AccountService accountService;
    public AccountController(){accountService=new AccountService();}
    @RequestMapping(value = "/login",method = RequestMethod.GET)
    public String login(){
        return "login";
    }

    @PostMapping(value = "/login/send")
    @ResponseBody
    public List<Account> get(@RequestParam("username")String account,@RequestParam("password")String password){
        System.out.println(account);
        List<Account> account1=new AccountBus().login(account,password);

        return account1;
    }
}

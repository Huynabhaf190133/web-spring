package T3H.QuanLyBanGiay.Service;

import T3H.QuanLyBanGiay.model.Account;

import java.util.List;

public interface IAccountService extends IcommonService<Account>{
    public List<Account> login(String userName,String password);
}

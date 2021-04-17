package T3H.QuanLyBanGiay.Service;

import T3H.QuanLyBanGiay.Business.AccountBus;
import T3H.QuanLyBanGiay.model.Account;
import org.springframework.stereotype.Service;


import java.util.List;
@Service
public class AccountService implements IAccountService {
    private AccountBus bus;

    public AccountService() {
        bus=new AccountBus();
    }


    @Override
    public List<Account> login(String userID,String passowrd) {
        return bus.login(userID,passowrd);
    }

    @Override
    public List<Account> getAll() {
        return bus.getAll();
    }

    @Override
    public Account getByID(String id) {
        return null;
    }

    @Override
    public List<Account> getByKeyWord(String keyword) {
        return null;
    }

    @Override
    public void add(Account intro) {

    }

    @Override
    public void edit(Account info) {

    }

    @Override
    public void delete(String id) {

    }


}

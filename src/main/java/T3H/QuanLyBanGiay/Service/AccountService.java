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
    public Account login(Account account) {
        return bus.login(account);
    }

    @Override
    public List<Account> getAll() {
        return bus.getAll();
    }

    @Override
    public Account getByID(String id) {
        return bus.getSingleByID(id);
    }

    @Override
    public List<Account> getByKeyWord(Account keyword) {
        return bus.getByKeyword(keyword);
    }


    @Override
    public void add(Account intro) {
        bus.add(intro);
    }

    @Override
    public void edit(Account info) {

    }

    @Override
    public void delete(Account id) {

    }



}

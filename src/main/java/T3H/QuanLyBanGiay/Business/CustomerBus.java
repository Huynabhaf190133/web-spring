package T3H.QuanLyBanGiay.Business;

import T3H.QuanLyBanGiay.model.Account;
import T3H.QuanLyBanGiay.model.Customer;
import T3H.QuanLyBanGiay.model.Giay;

import java.util.List;

public class CustomerBus extends BaseBus implements IBus<Customer>{


    @Override
    public List<Customer> getAll() {
        return null;
    }

    @Override
    public Customer getSingleByID(String id) {
        return null;
    }

    @Override
    public List<Customer> getByKeyword(Customer keyword) {
        return null;
    }


    @Override
    public Account add(Customer info) {

        return null;
    }

    @Override
    public void Update(Customer info) {

    }

    @Override
    public void delete(Giay id) {

    }
}

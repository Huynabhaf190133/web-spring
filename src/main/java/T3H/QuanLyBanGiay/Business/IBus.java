package T3H.QuanLyBanGiay.Business;

import T3H.QuanLyBanGiay.model.Account;
import T3H.QuanLyBanGiay.model.Giay;

import java.util.List;

public interface IBus<T> {
        public List<T> getAll();
        public T getSingleByID(String id);
        public List<T> getByKeyword(T keyword);
        public Account add(T info);
        public void Update(T info);
        public void delete(Giay id);

}

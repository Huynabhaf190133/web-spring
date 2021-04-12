package T3H.QuanLyBanGiay.Business;

import java.util.List;

public interface IBus<T> {
        public List<T> getAll();
        public T getSingleByID(String id);
        public List<T> getByKeyword(String keyword);
        public void add(T info);
        public void Update(T info);
        public void delete(String id);


}

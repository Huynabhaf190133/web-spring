package T3H.QuanLyBanGiay.Service;

import java.util.List;

public interface IcommonService <T>{
    public List<T> getAll();
    public T getByID(String id);
    public List<T> getByKeyWord(String keyword);
    public void add(T intro);
    public void edit(T info);
    public void delete(String id);
}

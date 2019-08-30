package lk.ijse.absd.service.common;

import java.util.List;

public interface CRUDService<T> {
    public long add(T t);

    public long update(T t);

    public long delete(Long id);

    public List<T> getAll();
}

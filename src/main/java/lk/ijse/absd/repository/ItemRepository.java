package lk.ijse.absd.repository;

import lk.ijse.absd.entity.Item;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ItemRepository extends JpaRepository<Item,Long> {
}

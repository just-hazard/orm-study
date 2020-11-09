package just.hazard.ormstudy.repository;

import just.hazard.ormstudy.entity.Order;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepository extends JpaRepository<Order, Long> {
}

package just.hazard.ormstudy;

import just.hazard.ormstudy.repository.OrderRepository;
import lombok.RequiredArgsConstructor;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

@DataJpaTest
@RequiredArgsConstructor
public class OrderTests {

    private final OrderRepository orderRepository;

    @PersistenceContext
    private final EntityManager entityManager;


    @Test
    public void 데이터테스트() {

    }
}

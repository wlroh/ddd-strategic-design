package kitchenpos.eatinorder.order.domain;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface JpaEatInEatInOrderRepository extends EatInOrderRepository, JpaRepository<EatInOrder, UUID> {
}

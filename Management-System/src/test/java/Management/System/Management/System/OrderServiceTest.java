package Management.System.Management.System;

import Management.System.Management.System.repository.OrderRepository;
import Management.System.Management.System.service.OrderService;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.Collection;
import java.util.Collections;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;

@SpringBootTest
public class OrderServiceTest {

    @Mock
    private OrderRepository orderRepository;

    @InjectMocks
    private OrderService orderService;

    public OrderServiceTest() {
        MockitoAnnotations.openMocks(this);
    }
    @Test
    public void testGetAllOrders() {
        when(orderRepository.findAll()).thenReturn(Collections.emptyList());
        assertEquals(0, orderService.getAllOrders().size());
    }
}

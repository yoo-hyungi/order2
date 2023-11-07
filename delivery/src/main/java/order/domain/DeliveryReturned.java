package order.domain;

import java.time.LocalDate;
import java.util.*;
import lombok.*;
import order.domain.*;
import order.infra.AbstractEvent;

//<<< DDD / Domain Event
@Data
@ToString
public class DeliveryReturned extends AbstractEvent {

    private Long id;
    private String userId;
    private Long orderId;
    private Long productId;
    private String productName;
    private Integer qty;
    private String status;
    private Date deliveryDt;

    public DeliveryReturned(DeliveryManagement aggregate) {
        super(aggregate);
    }

    public DeliveryReturned() {
        super();
    }
}
//>>> DDD / Domain Event

package order.domain;

import java.time.LocalDate;
import java.util.*;
import lombok.*;
import order.domain.*;
import order.infra.AbstractEvent;

//<<< DDD / Domain Event
@Data
@ToString
public class ProductDecreased extends AbstractEvent {

    private Long id;
    private String productName;
    private String productImg;
    private Integer stock;

    public ProductDecreased(Inventory aggregate) {
        super(aggregate);
    }

    public ProductDecreased() {
        super();
    }
}
//>>> DDD / Domain Event

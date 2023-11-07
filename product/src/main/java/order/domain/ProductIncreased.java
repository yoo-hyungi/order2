package order.domain;

import java.time.LocalDate;
import java.util.*;
import lombok.*;
import order.domain.*;
import order.infra.AbstractEvent;

//<<< DDD / Domain Event
@Data
@ToString
public class ProductIncreased extends AbstractEvent {

    private Long id;
    private String productName;
    private String productImg;
    private Integer stock;

    public ProductIncreased(Inventory aggregate) {
        super(aggregate);
    }

    public ProductIncreased() {
        super();
    }
}
//>>> DDD / Domain Event

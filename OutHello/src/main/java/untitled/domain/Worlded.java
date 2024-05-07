package untitled.domain;

import java.time.LocalDate;
import java.util.*;
import lombok.*;
import untitled.domain.*;
import untitled.infra.AbstractEvent;

//<<< DDD / Domain Event
@Data
@ToString
public class Worlded extends AbstractEvent {

    private Long id;
    private String world;

    public Worlded(World aggregate) {
        super(aggregate);
    }

    public Worlded() {
        super();
    }
}
//>>> DDD / Domain Event

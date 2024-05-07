package untitled.domain;

import java.time.LocalDate;
import java.util.Date;
import java.util.List;
import javax.persistence.*;
import lombok.Data;
import untitled.OutHelloApplication;
import untitled.domain.Worlded;

@Entity
@Table(name = "World_table")
@Data
//<<< DDD / Aggregate Root
public class World {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String world;

    @PostPersist
    public void onPostPersist() {
        Worlded worlded = new Worlded(this);
        worlded.publishAfterCommit();
    }

    public static WorldRepository repository() {
        WorldRepository worldRepository = OutHelloApplication.applicationContext.getBean(
            WorldRepository.class
        );
        return worldRepository;
    }
}
//>>> DDD / Aggregate Root

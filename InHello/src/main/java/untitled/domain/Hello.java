package untitled.domain;

import java.time.LocalDate;
import java.util.Date;
import java.util.List;
import javax.persistence.*;
import lombok.Data;
import untitled.InHelloApplication;
import untitled.domain.Hellod;

@Entity
@Table(name = "Hello_table")
@Data
//<<< DDD / Aggregate Root
public class Hello {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String hello;

    @PostPersist
    public void onPostPersist() {
        Hellod hellod = new Hellod(this);
        hellod.publishAfterCommit();
        // Get request from Hello
        //untitled.external.Hello hello =
        //    Application.applicationContext.getBean(untitled.external.HelloService.class)
        //    .getHello(/** mapping value needed */);

    }

    public static HelloRepository repository() {
        HelloRepository helloRepository = InHelloApplication.applicationContext.getBean(
            HelloRepository.class
        );
        return helloRepository;
    }
}
//>>> DDD / Aggregate Root

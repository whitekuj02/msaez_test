package untitled.external;

import java.util.Date;
import java.util.List;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(name = "OutHello", url = "${api.url.OutHello}")
public interface WorldService {
    @GetMapping(path = "/worlds")
    public List<World> getWorld();

    @GetMapping(path = "/worlds/{id}")
    public World getWorld(@PathVariable("id") Long id);
}

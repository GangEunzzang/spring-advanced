package hello.advanced.app.v0;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class OrderControllerVO {

    private final OrderServiceV0 orderServiceV0;

    @GetMapping("/v0/request")
    public String request(@PathVariable String itemId) {
        orderServiceV0.orderItem(itemId);
        return "OK";
    }
}

package pl.pietrzam.metrics;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
class LogEndpoint { // @todo create real live example

    @PostMapping("/message")
    @ResponseBody
    String storeLog(@RequestBody String message) {
        log.info(message);
        return "OK";
    }
}
package pl.pietrzam.metrics.metrictype;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@AllArgsConstructor
class CounterController {

    private final CounterHolder counterHolder;
    
    @PostMapping("/counter/{counterType}")
    @ResponseBody
    double increment(@PathVariable String counterType) {
        final double count = counterHolder.increment(counterType);
        return count;
    }
}
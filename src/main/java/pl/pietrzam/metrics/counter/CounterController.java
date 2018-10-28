package pl.pietrzam.metrics.counter;

import io.micrometer.core.instrument.Counter;
import io.micrometer.core.instrument.MeterRegistry;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
class CounterController {

    private final Counter counter;

    CounterController(final MeterRegistry registry) {
        this.counter = registry.counter("different_counters");
    }

    @GetMapping("/counter")
    @ResponseBody
    double increment() {
        counter.increment();
        return counter.count();
    }
}
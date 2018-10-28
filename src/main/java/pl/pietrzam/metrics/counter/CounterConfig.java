package pl.pietrzam.metrics.counter;

import io.micrometer.core.instrument.Counter;
import io.micrometer.core.instrument.MeterRegistry;
import lombok.AllArgsConstructor;
import org.springframework.context.annotation.Configuration;

import javax.annotation.PostConstruct;

@Configuration
@AllArgsConstructor
class CounterConfig {

    final MeterRegistry registry;
    
    @PostConstruct
    void setup() {
        Counter.builder("different_counters")
                .description("Number of requests.")
                .register(registry);

    }
}

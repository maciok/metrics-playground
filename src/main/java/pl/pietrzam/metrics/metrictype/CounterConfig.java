package pl.pietrzam.metrics.metrictype;

import io.micrometer.prometheus.PrometheusMeterRegistry;
import io.prometheus.client.Counter;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
class CounterConfig {

    @Bean
    CounterHolder counterHolder(final PrometheusMeterRegistry registry) {
        final Counter counter = Counter.build()
                .name("different_counters")
                .help("Number of requests.")
                .labelNames("counterNames")
                .register(registry.getPrometheusRegistry());

        return new CounterHolder(counter);
    }
}

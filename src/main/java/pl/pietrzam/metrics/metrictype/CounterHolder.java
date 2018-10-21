package pl.pietrzam.metrics.metrictype;

import io.prometheus.client.Counter;
import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@AllArgsConstructor(access = AccessLevel.PACKAGE)
class CounterHolder {
    private final Counter counter;

    double increment(final String counterType) {
        log.info("Increasing {}", counterType);
        counter.labels(counterType)
               .inc();
        
        return counter.labels(counterType)
                      .get();
    }
}

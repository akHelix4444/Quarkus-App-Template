package org.helix4444.health.ready;

import org.eclipse.microprofile.health.HealthCheck;
import org.eclipse.microprofile.health.HealthCheckResponse;
import org.eclipse.microprofile.health.Readiness;

import javax.enterprise.context.ApplicationScoped;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

@Readiness
@ApplicationScoped
public class ExampleHealthCheck
        implements HealthCheck {

    @Override
    public HealthCheckResponse call() {
        var probeCheckTime = LocalDateTime.now().format(DateTimeFormatter.ISO_DATE_TIME);
        return HealthCheckResponse.named("Example health check")
                .up()
                .withData("probeCheckTime", probeCheckTime)
                .build();
    }

}

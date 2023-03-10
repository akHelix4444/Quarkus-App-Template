package org.helix4444.quarkus;

import io.quarkus.logging.Log;
import org.eclipse.microprofile.health.HealthCheck;
import org.eclipse.microprofile.health.HealthCheckResponse;
import org.eclipse.microprofile.health.Readiness;

import javax.enterprise.context.ApplicationScoped;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

@Readiness
@ApplicationScoped
public class Health
        implements HealthCheck {

    @Override
    public HealthCheckResponse call() {
        var probeCheckTime = LocalDateTime.now().format(DateTimeFormatter.ISO_DATE_TIME);

        Log.infov("Execute example readiness probe at: {0}", probeCheckTime);
        return HealthCheckResponse.named("Example health check")
                .up()
                .withData("probeCheckTime", probeCheckTime)
                .build();
    }

}

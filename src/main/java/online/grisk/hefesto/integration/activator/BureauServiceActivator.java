package online.grisk.hefesto.integration.activator;

import online.grisk.hefesto.domain.builder.BureauBuilder;
import org.springframework.messaging.handler.annotation.Headers;
import org.springframework.messaging.handler.annotation.Payload;
import org.springframework.stereotype.Component;

import java.io.IOException;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

@Component
public class BureauServiceActivator {

    public Map<String, Object> invoke(@Payload Map<String, Object> payload, @Headers Map<String, Object> header) throws IOException {
        payload.put("bureau", create(payload.get("rut").toString()));
        return payload;
    }

    public static Map<String, Object> create(String rut) throws IOException {
        Map<String, Object> report = new HashMap<>();
        report.put("status", "completed");
        report.put("uuid", UUID.randomUUID().toString());
        report.put("applicant", BureauBuilder.builder(rut));
        report.put("dateCreated", new Date().toString());
        report.put("dateModified", "--");
        return report;
    }
}
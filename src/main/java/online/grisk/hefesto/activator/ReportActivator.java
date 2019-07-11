package online.grisk.hefesto.activator;

import online.grisk.hefesto.entity.Report;
import org.springframework.integration.annotation.ServiceActivator;
import org.springframework.messaging.handler.annotation.Headers;
import org.springframework.messaging.handler.annotation.Payload;
import org.springframework.stereotype.Component;

import java.util.HashMap;
import java.util.Map;

@Component
public class ReportActivator {
    @ServiceActivator(inputChannel = "primaryChannel")
    public Map<String, Object> invoke(@Payload Map<String, Object> payload, @Headers Map<String, Object> header){
        return Report.create();
    }
}

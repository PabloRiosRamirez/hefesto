package online.grisk.hefesto.integration;

import org.springframework.integration.annotation.Gateway;
import org.springframework.integration.annotation.MessagingGateway;
import org.springframework.messaging.Message;

import java.util.Map;

@MessagingGateway(defaultRequestChannel = "primaryChannel")
public interface GatewayService {
    @Gateway
    Map process(Message message);
}

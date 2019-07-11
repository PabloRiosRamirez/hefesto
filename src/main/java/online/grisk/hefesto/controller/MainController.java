package online.grisk.hefesto.controller;

import online.grisk.hefesto.integration.GatewayService;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.messaging.support.MessageBuilder;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
public class MainController {

    private static final Log logger = LogFactory.getLog(MainController.class);

    @Autowired
    GatewayService gatewayService;

    @PostMapping(value = "/v1/rest/api/report")
    public Map<String, Object> report(@RequestBody Map payload) {
        return gatewayService.process(MessageBuilder.withPayload(payload).build());
    }
}

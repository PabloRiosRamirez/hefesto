package online.grisk.hefesto.controller;

import online.grisk.hefesto.controller.utils.ControllerUtils;
import online.grisk.hefesto.integration.gateway.GatewayService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.messaging.support.MessageBuilder;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.util.UUID;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

@RestController
public class MainController {

	@Autowired
	GatewayService gatewayService;

	@PostMapping(value = "/v1/rest/api/bureau")
	public ResponseEntity<?> report(@RequestBody HashMap<String, Object> payload) {
		Map<String, Object> responseMap = new HashMap<>();
		responseMap.put("uuid", UUID.randomUUID());
		responseMap.put("timestamp", new Date());
		if(payload.get("rut") == null) {
			responseMap.put("message", "Attribute 'rut' is required.");
			return new ResponseEntity<Map<String, Object>>(responseMap, HttpStatus.BAD_REQUEST);
		}
		responseMap.put("rut", payload.get("rut"));
		
		if(!ControllerUtils.validateRut(payload.get("rut").toString())) {
			responseMap.put("message", "Rut validation failed. Format must be XXXXXXXX-X and valid.");
			return new ResponseEntity<Map<String, Object>>(responseMap, HttpStatus.BAD_REQUEST);
		}
		
		Map<String, Object> map = gatewayService.process(MessageBuilder.withPayload(responseMap).build());
		
		return new ResponseEntity<Map<String, Object>>(map, HttpStatus.OK);
	}


}

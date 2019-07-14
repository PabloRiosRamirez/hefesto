package online.grisk.hefesto.controller;

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
		
		if(payload.get("rut") == null) {
			responseMap.put("message", "Attribute 'rut' is required.");
			return new ResponseEntity<Map<String, Object>>(responseMap, HttpStatus.BAD_REQUEST);
		}
		
		if(!validateRut(payload.get("rut").toString())) {
			responseMap.put("message", "Rut validation failed. Format must be XXXXXXXX-X and valid.");
			return new ResponseEntity<Map<String, Object>>(responseMap, HttpStatus.BAD_REQUEST);
		}
		
		responseMap.put("uuid", UUID.randomUUID());
		responseMap.put("timestamp", new Date());
		responseMap.put("rut", payload.get("rut"));
		
		Map<String, Object> map = gatewayService.process(MessageBuilder.withPayload(responseMap).build());
		
		return new ResponseEntity<Map<String, Object>>(map, HttpStatus.OK);
	}

	/**
	 * Validate format document number XXXXXXXX-X
	 */
	public Boolean validateRut(String rut) {
		Pattern pattern = Pattern.compile("^[0-9]+-[0-9kK]{1}$");
		Matcher matcher = pattern.matcher(rut);
		if (matcher.matches() == false)
			return false;
		String[] stringRut = rut.split("-");
		return stringRut[1].toLowerCase().equals(this.validateDv(stringRut[0]));
	}

	/**
	 * Validate dv
	 */
	public String validateDv(String rut) {
		Integer M = 0, S = 1, T = Integer.parseInt(rut);
		for (; T != 0; T = (int) Math.floor(T /= 10))
			S = (S + T % 10 * (9 - M++ % 6)) % 11;
		return (S > 0) ? String.valueOf(S - 1) : "k";
	}
}

package com.github.sandokandias.springbootapmagent;

import org.springframework.http.HttpStatus;
import org.springframework.util.MultiValueMap;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

import static org.springframework.http.MediaType.APPLICATION_FORM_URLENCODED_VALUE;
import static org.springframework.http.MediaType.APPLICATION_JSON_VALUE;

@RestController
public class ApmAgentController {

    @ResponseStatus(HttpStatus.OK)
    @ResponseBody
    @PostMapping(value = "/payments/json", consumes = APPLICATION_JSON_VALUE, produces = APPLICATION_JSON_VALUE)
    public Map<String, Object> json(@RequestBody Map<String, Object> body) {
        System.out.println("body = " + body);
        return new HashMap<String, Object>(1) {{
            put("id", UUID.randomUUID().toString());
        }};
    }

    @ResponseStatus(HttpStatus.OK)
    @PostMapping(value = "/payments/form", consumes = APPLICATION_FORM_URLENCODED_VALUE)
    public void form(@RequestBody MultiValueMap<String, Object> body) {
        System.out.println("body = " + body);
    }
}

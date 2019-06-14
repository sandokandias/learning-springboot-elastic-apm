package com.github.sandokandias.springbootapmagent;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

import static org.springframework.http.MediaType.APPLICATION_JSON_VALUE;

@RestController
public class ApmAgentController {

    @ResponseStatus(HttpStatus.OK)
    @ResponseBody
    @PostMapping(value = "/payments", consumes = APPLICATION_JSON_VALUE, produces = APPLICATION_JSON_VALUE)
    public Map<String, Object> post(@RequestBody Map<String, Object> body) {
        System.out.println("body = " + body);
        return new HashMap<String, Object>(1) {{
            put("id", UUID.randomUUID().toString());
        }};
    }
}

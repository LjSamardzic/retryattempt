package com.lyra.example.retrydemo;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Slf4j
public class RetryController {

    @Autowired
    private RetryService retryService;

    @GetMapping("/")
    public void hello() throws Exception {

        log.info("issuing a call to service");

        retryService.hello();
    }
}

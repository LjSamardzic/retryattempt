package com.lyra.example.retrydemo;

import lombok.extern.slf4j.Slf4j;
import org.springframework.retry.annotation.Retryable;
import org.springframework.stereotype.Service;

import java.sql.SQLException;

@Service
@Slf4j
public class RetryService {

    @Retryable
    void hello() throws Exception {
        log.info("inside the service");
        throw new SQLException();
    }
}

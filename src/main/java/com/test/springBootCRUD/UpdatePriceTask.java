package com.test.springBootCRUD;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;
import java.time.LocalDateTime;
import java.time.ZoneOffset;
import java.util.Random;

@Component
public class UpdatePriceTask {
    private static final Logger log = LoggerFactory.getLogger(UpdatePriceTask.class);

    @Scheduled(fixedRate = 60000)
    public void updatePrice() {
        Random random = new Random();
        double price = random.nextDouble();
        log.info("Update price is " +
                LocalDateTime.now().toEpochSecond(ZoneOffset.UTC));

    }
}

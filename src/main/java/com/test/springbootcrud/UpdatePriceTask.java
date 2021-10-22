package com.test.springbootcrud;

import com.test.springbootcrud.model.Product;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;
import java.text.SimpleDateFormat;
import java.util.Date;


@Component
public class UpdatePriceTask {
    private static final Logger log = LoggerFactory.getLogger(UpdatePriceTask.class);

    private static final SimpleDateFormat dateFormat = new SimpleDateFormat("HH:mm:ss");

 @Scheduled(fixedRate=5000)//specifies the interval between method invocations, measured from the start time of each invocation
    public void reportCurrentTime() {

     log.info("The time is now used fixedRate{}", dateFormat.format(new Date()));
    }
//    private Double initialPrice = null;
//    private double instancePrice;
//    @Scheduled(fixedRate =60000)
//    private double getInstancePrice(Product product){
//        try {
//
//            instancePrice = product.getPrice();
//            System.out.print(instancePrice);
//            if (initialPrice == null) {
//                initialPrice = instancePrice;
//            } else if (instancePrice > initialPrice) {
//               log.info("Price is",instancePrice);
//            }
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
//        return instancePrice;
//    }
}

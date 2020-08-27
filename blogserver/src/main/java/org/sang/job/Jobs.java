package org.sang.job;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

/**
 * 要在任务的类上写@Component
 * 要在任务方法上写@Scheduled
 * 定時任務類
 * @author C3006248
 * @create 26$ 9:03$
 */
@Component
public class Jobs {

    @Scheduled(fixedRate = 6000)
    public void test(){
       // System.out.println("執行定時任務=======test");
    }
}

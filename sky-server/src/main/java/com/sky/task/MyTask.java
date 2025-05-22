package com.sky.task;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

/**
 * 自定义定时任务类
 */
//实例化交给Spring管理
@Component
@Slf4j
public class MyTask {

    /**
     * 定时任务
     */
    // @Scheduled(cron = "0/5 * * * * ?")
    // public void executeTask(){
    //     log.info("定时任务开始执行：{}",new Date());
    // }
}

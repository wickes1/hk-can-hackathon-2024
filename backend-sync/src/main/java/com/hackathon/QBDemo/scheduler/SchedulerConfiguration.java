package com.hackathon.QBDemo.scheduler;

import com.hackathon.QBDemo.scheduler.processor.QBInventorySyncSchedulerProcessor;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.Scheduled;

@Configuration
@EnableScheduling
public class SchedulerConfiguration {
    Logger logger = LoggerFactory.getLogger(SchedulerConfiguration.class);

    @Value("${app.inventory.scheduler.enable}")
    private Boolean isInventorySchedulerEnabled;

    private final QBInventorySyncSchedulerProcessor qbInventorySyncScheduleProcessor;

    public SchedulerConfiguration(QBInventorySyncSchedulerProcessor qbInventorySyncScheduleProcessor){
        this.qbInventorySyncScheduleProcessor = qbInventorySyncScheduleProcessor;
    }

    @Scheduled(cron = "${app.inventory.scheduler.cron}")
    public void inventorySyncScheduler() throws Exception {
        if(isInventorySchedulerEnabled){
            qbInventorySyncScheduleProcessor.executeProcessor();
        }
    }

}

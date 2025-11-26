package com.pharmacy.code.service;


import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

@Component
public class EnableSchedulingForMessages {

    int count = 0;

    @Scheduled(cron = "*/2 * * * * *")
    public void scheduledCron() throws InterruptedException {

        Runnable runnable = () -> {
            try {
                this.count++;
                Thread.sleep(5000);
                System.out.println("You are in Thread");
            } catch (InterruptedException e) {
                System.out.println(e);
            }
        };

        Thread thread = new Thread(runnable);
        thread.start();
        thread.join();
        System.out.println("Hello World - " + this.count);

    }
    /*
                * ┌── second (0–59)
            │ ┌── minute (0–59)
            │ │ ┌── hour (0–23)
            │ │ │ ┌── day of month
            │ │ │ │ ┌── month
            │ │ │ │ │ ┌── day of week
            */ /* /* /* /* /*

            */
}

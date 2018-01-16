package com.steve.jobsjson.util;

import ch.qos.logback.core.encoder.EchoEncoder;

import java.util.concurrent.*;

public class RateLimiterDemo {

    private BlockingQueue<Double> queue ;

    public RateLimiterDemo(BlockingQueue<Double> queue) {
        this.queue = queue;
    }

    public BlockingQueue<Double> getQueue() {
        return queue;
    }

    public void setQueue(BlockingQueue<Double> queue) {
        this.queue = queue;
    }

    /**
     *  1
     * @param permitePerSecond
     */
    public static RateLimiterDemo create(double permitePerSecond){
        BlockingQueue<Double> queue = new ArrayBlockingQueue<Double>((int) permitePerSecond);
        ScheduledExecutorService executor = Executors.newScheduledThreadPool(10);
        while(true){
            executor.schedule(new Runnable() {
                @Override
                public void run() {
                    queue.offer(1.0);
                }
            },0,TimeUnit.SECONDS);
        }
    }

    public void acquire(){
        if(queue != null){
            try {
                queue.take();
            }catch (InterruptedException e) {
                e.printStackTrace();
            }
        }else{
            throw new RuntimeException("阻塞队列为空，请初始化一个 RatelimiterDemo 对象");
        }
    }

}

package com.steve.jobsjson.util;

import sun.text.resources.cldr.fur.FormatData_fur;

import java.util.LinkedList;
import java.util.List;
import java.util.concurrent.*;

public class FutureTaskForMultiComputer {

    private class ComputerTask implements Callable<Integer>{

        private Integer result = 0;

        public ComputerTask(Integer result) {
            this.result = result;
        }

        public Integer getResult() {
            return result;
        }

        public void setResult(Integer result) {
            this.result = result;
        }

        @Override
        public Integer call() throws Exception {
            for(int i=0;i<100;i++){
                result =+ i;
            }
            return result;
        }
    }

    public static void main(String[] args) {
        FutureTaskForMultiComputer ff = new FutureTaskForMultiComputer();
        List<FutureTask<Integer>> list = new LinkedList();
        ExecutorService executor = Executors.newFixedThreadPool(5);
        for(int i=0;i<10;i++){
            FutureTask<Integer> futureTask = new FutureTask(ff.new ComputerTask(i));
            list.add(futureTask);
            executor.submit(futureTask);
        }

        Integer result = 0;
        for(FutureTask<Integer> futureTask: list){
            try {
                result += futureTask.get();
            } catch (InterruptedException e) {
                e.printStackTrace();
            } catch (ExecutionException e) {
                e.printStackTrace();
            }
        }
        executor.shutdown();
        System.out.println(result);
    }
}

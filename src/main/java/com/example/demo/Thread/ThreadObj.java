package com.example.demo.Thread;


import lombok.extern.slf4j.Slf4j;
import java.text.SimpleDateFormat;
import java.util.Date;

@Slf4j
public class ThreadObj{
    public void method1(){
        synchronized (this){
        try {
            log.info("当前的线程名称:"+Thread.currentThread().getName());
            SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");//设置日期格式
            log.info("method1方法执行完成时间:"+df.format(new Date()));
            Thread.sleep(4000);
        } catch (InterruptedException e) {
            e.printStackTrace();
             }
         }
    }
    /** Thread Test*/
    public  void method2() {
        synchronized (this) {
            SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");//设置日期格式
            log.info("method2方法执行完成时间:" + df.format(new Date()));// new Date()为获取当前系统时间
        }
    }
    /** Git Test*/
    public static void main(String[] args) {
        //创建一个对象
        ThreadObj obj = new ThreadObj();

        Thread t1=new Thread (new Runnable() {
            @Override
            public void run() {
                obj.method1();
            }
        },"t1");
        Thread t2=new Thread (new Runnable() {
            @Override
            public void run() {
                obj.method2();
            }
        },"t2");
        t1.start();
        t2.start();
    }
}

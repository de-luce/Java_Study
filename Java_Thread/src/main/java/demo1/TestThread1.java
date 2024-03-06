package demo1;

//创建线程一：继承Thread类，重写run()方法，调用start()开启线程
public class TestThread1 extends Thread {
    @Override
    public void run() {
        //run方法线程体
        for (int i = 0; i < 20; i++) {
            System.out.println("run" + i);
        }
    }

    public static void main(String[] args) {
        //main线程，主线程

        //创建线程对象
        TestThread1 testThread1 = new TestThread1();

        //调用start()方法
        testThread1.start();

        for (int i = 0; i < 200; i++) {
            System.out.println("main" + i);
        }
    }
}

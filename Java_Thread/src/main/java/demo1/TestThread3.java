package demo1;

//创建线程二：实现runnable接口，。重写run()方法，线程执行时丢入runnable接口实现类
public class TestThread3 implements Runnable {
    @Override
    public void run() {
        //run方法线程体
        for (int i = 0; i < 20; i++) {
            System.out.println("run" + i);
        }
    }

    public static void main(String[] args) {
        //创建runnable接口得到实现类对象
        TestThread3 testThread3 = new TestThread3();

        //创建线程对象，通过线程对象开启线程，代理
        new Thread(testThread3).start();


        for (int i = 0; i < 200; i++) {
            System.out.println("main" + i);
        }
    }
}

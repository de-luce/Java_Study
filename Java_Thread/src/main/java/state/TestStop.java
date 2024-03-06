package state;

//测试stop
//1.线程自动停止-->次数
//2.标志位停止
public class TestStop implements Runnable {
    //1.设置标志位
    private boolean flag = true;

    @Override
    public void run() {
        while (flag) {
            System.out.println("run...Thread");
        }
    }

    //2.设置公开方法停止线程，转换标志位
    public void stop() {
        this.flag = false;
    }

    public static void main(String[] args) {
        TestStop testStop = new TestStop();
        new Thread(testStop).start();

        for (int i = 0; i < 100; i++) {
            System.out.println("main" + i);
            if (i == 90) {
                //调用stop方法切换标志位，停止线程
                testStop.stop();
                System.out.println("Thread...stop");
            }
        }
    }
}

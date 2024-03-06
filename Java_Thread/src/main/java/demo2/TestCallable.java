package demo2;


import org.apache.commons.io.FileUtils;

import java.io.File;
import java.io.IOException;
import java.net.URL;
import java.util.concurrent.*;

//线程创建三：实现callable接口
public class TestCallable implements Callable<Boolean> {

    private String url;     //下载地址
    private String name;    //保存文件名

    public TestCallable(String url, String name) {
        this.url = url;
        this.name = name;
    }

    @Override
    public Boolean call() {
        WebDownloader webDownloader = new WebDownloader();
        webDownloader.downloader(url, name);
        System.out.println("文件名" + name);
        return true;
    }

    public static void main(String[] args) throws ExecutionException, InterruptedException {
        TestCallable t1 = new TestCallable("https://kuangstudy.oss-cn-beijing.aliyuncs.com/bbs/2023/10/16/kuangstudyb67cc598-9e1a-4e17-a7de-f4ecdd7f8d32.jpg", "1.jpg");
        TestCallable t2 = new TestCallable("https://kuangstudy.oss-cn-beijing.aliyuncs.com/bbs/2021/07/21/kuangstudyb62b0ccb-55b5-4572-b067-347314beac15.jpg", "2.jpg");
        TestCallable t3 = new TestCallable("https://kuangstudy.oss-cn-beijing.aliyuncs.com/bbs/2021/07/21/kuangstudy69ec9992-bed7-4eec-a550-5fe2aeb44737.jpg", "3.jpg");

        //创建执行服务
        ExecutorService ser = Executors.newFixedThreadPool(3);

        //提交执行
        Future<Boolean> r1 = ser.submit(t1);
        Future<Boolean> r2 = ser.submit(t2);
        Future<Boolean> r3 = ser.submit(t3);

        //获取结果
        boolean b1 = r1.get();
        boolean b2 = r2.get();
        boolean b3 = r3.get();

        //关闭服务
        ser.shutdownNow();
    }

}

class WebDownloader {
    //下载方法
    public void downloader(String url, String name) {
        try {
            FileUtils.copyURLToFile(new URL(url), new File(name));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}

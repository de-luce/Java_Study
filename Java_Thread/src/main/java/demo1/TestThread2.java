package demo1;

import org.apache.commons.io.FileUtils;

import java.io.File;
import java.io.IOException;
import java.net.URL;

//Thread实现多线程下载图片
public class TestThread2 implements Runnable {

    private String url;     //下载地址
    private String name;    //保存文件名

    public TestThread2(String url, String name) {
        this.url = url;
        this.name = name;
    }

    @Override
    public void run() {
        WebDownloader webDownloader = new WebDownloader();
        webDownloader.downloader(url, name);
        System.out.println("文件名" + name);
    }

    public static void main(String[] args) {
        TestThread2 t1 = new TestThread2("https://kuangstudy.oss-cn-beijing.aliyuncs.com/bbs/2023/10/16/kuangstudyb67cc598-9e1a-4e17-a7de-f4ecdd7f8d32.jpg","1.jpg");
        TestThread2 t2 = new TestThread2("https://kuangstudy.oss-cn-beijing.aliyuncs.com/bbs/2021/07/21/kuangstudyb62b0ccb-55b5-4572-b067-347314beac15.jpg","2.jpg");
        TestThread2 t3 = new TestThread2("https://kuangstudy.oss-cn-beijing.aliyuncs.com/bbs/2021/07/21/kuangstudy69ec9992-bed7-4eec-a550-5fe2aeb44737.jpg","3.jpg");

        new Thread(t1).start();
        new Thread(t2).start();
        new Thread(t3).start();
    }
}

//下载器
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

package gz.lianxi;

import org.apache.commons.io.FileUtils;

import java.io.File;
import java.io.IOException;
import java.net.URL;

public class MyThreadTest implements Runnable{

    private String url;
    private String name;

    public MyThreadTest(String url ,String name){
        this.name = name;
        this.url = url;
    }


    @Override
    public void run() {
        DownLoad downLoad = new DownLoad();

        downLoad.downloadPic(url,name);
        System.out.println("下载已完成" + name);
    }


    public static void main(String[] args) {
        MyThreadTest myThreadTest1 = new MyThreadTest("https://t7.baidu.com/it/u=2168645659,3174029352&fm=193&f=GIF","1.jpg");
        MyThreadTest myThreadTest2 = new MyThreadTest("https://t7.baidu.com/it/u=3189270705,270986491&fm=193&f=GIF","2.jpg");
        MyThreadTest myThreadTest3 = new MyThreadTest("https://t7.baidu.com/it/u=595446146,2444232797&fm=193&f=GIF","3.jpg");

//        myThreadTest1.start();
//        myThreadTest2.start();
//        myThreadTest3.start();

        //用runnable接口实现
        new Thread(myThreadTest1).start();
        new Thread(myThreadTest2).start();
        new Thread(myThreadTest3).start();
    }

}

class DownLoad {

    public void downloadPic(String url ,String name){
        try {
            FileUtils.copyURLToFile(new URL(url),new File(name));
        } catch (IOException e) {
            e.printStackTrace();
            System.out.println("下载出错了");
        }
    }
}
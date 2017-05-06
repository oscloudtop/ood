package cn.oddcloud.www.Spider.Utils;

/**
 * Created by vog1g on 2017/5/3.
 */
public class RandomNubHits {


    //随机总点击量
    public synchronized static int allHits(){
        return ((int)(Math.random()*1000+1))*3000;
    }

    //随机天点击量
    public synchronized static int dayHits(){
        return ((int)(Math.random()*1000+1))*300;
    }

    //随机周点击量
    public synchronized static int weekHits(){
        return ((int)(Math.random()*1000+1))*800;
    }

    //随机月点击量
    public synchronized static int monthHits(){
        return ((int)(Math.random()*1000+1))*1500;
    }

}

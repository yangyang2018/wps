package com.wps.pp.share.base.serilize;

import java.io.File;
import java.io.IOException;
import java.io.Serializable;
import java.util.Date;

/**
 * Created by yy on 2018/3/6.
 */
public class Common implements Serializable {

    private  Date date = new Date();

    private static  String  name;

    private transient String  pwd;

    public Common() {
    }

    public Common(String name, String pwd) {
        this.name = name;
        this.pwd = pwd;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPwd() {
        return pwd;
    }

    public void setPwd(String pwd) {
        this.pwd = pwd;
    }

    @Override
    public String toString() {
        return "Common{" +
                "date=" + date +
                ", name='" + name + '\'' +
                ", pwd='" + pwd + '\'' +
                '}';
    }

    public static void main(String[] args) {

        Common  common = new Common("牟小华","123456");
        String fileName="F:\\demo\\transient.txt";
        File file = new File(fileName);
        if (!file.exists()) {
            try {
                file.createNewFile();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        ObjectFileUtil<Common> util= new ObjectFileUtil();
        util.write(common,fileName);

        /**
         * transient 修饰的变量序列化会被忽略
         * static 修饰的变量不能被序列化 --对象的静态变量是存在方法区里面的
         */
        common.setName("小明");
        Common com = util.read(fileName);

        System.out.println(com);

    }
}

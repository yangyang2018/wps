package com.wps.pp.share.base.serilize;

import java.io.*;

/**
 * Created by yy on 2018/3/6.
 */
public class ObjectFileUtil <T> {


    public void write(T t,String  fileName){

        ObjectOutputStream oos = null;
        try {
            oos = new ObjectOutputStream(new FileOutputStream(fileName,false));
            oos.writeObject(t);
            oos.flush();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (oos !=null) {
                try {
                    oos.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    public T read(String  fileName){
        ObjectInputStream ois = null;

        try {
            ois = new ObjectInputStream(new FileInputStream(fileName));
            return (T) ois.readObject();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }finally {
            if (ois!=null) {
                try {
                    ois.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
        return null;
    }
}

package com.wps.pp.share.base.file_operate;

import java.io.*;
import java.util.UUID;
import java.util.logging.Logger;

/**
 * Created by yy on 2018/3/6.
 */
public class ForFile {

    public static String pathname = "F:\\test\\";

    public static String fielname;
    private UUID uuid;


    public static void write(String name, String destText) {
        FileOutputStream fos = null;
        OutputStreamWriter osw = null;
        PrintWriter pw = null;
        try {
            if (createFile(name)) {
                fos = new FileOutputStream(fielname, true);
                osw = new OutputStreamWriter(fos);
                pw = new PrintWriter(osw);
                pw.write(destText.toString().toCharArray());
                pw.flush();
                if (pw != null) {
                    pw.close();
                }
                if (osw != null) {
                    osw.close();
                }
                if (fos != null) {
                    fos.close();
                }
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }


    }

    public static boolean createFile(String name) {
        fielname = pathname + name + ".properties";
        File file = new File(fielname);
        boolean bool = true;
        if (!file.exists()) {
            try {
                file.createNewFile();
                System.out.println("create file success " + fielname);
            } catch (IOException e) {
                e.printStackTrace();
            }
            bool = true;
        }
        return bool;
    }


    public static void main(String[] args) {

        UUID uuid = UUID.randomUUID();
        ForFile.write(uuid + "myfile", "我的梦说别停留等待,就让光芒折射泪湿的瞳孔,映出心中最想拥有的彩虹,带我奔向那片有你的天空,因为你是我的梦 我的梦");

    }


}

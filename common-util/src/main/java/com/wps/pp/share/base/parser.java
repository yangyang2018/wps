package com.wps.pp.share.base;

import com.alibaba.fastjson.JSONObject;
import com.google.common.collect.Maps;
import com.sun.org.apache.xpath.internal.SourceTree;

import java.util.HashMap;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by yangy on 2018/5/15.
 */
public class parser {

    private  static  void  parse(){
        String ss = "<?xml version=\"1.0\" encoding=\"UTF-8\"?><SiebelMessage IntObjectName=\"CTZJ Resume Asset IO For VBC\" IntObjectFormat=\"Siebel Hierarchical\"><ListOfCTZJResumeAssetIOForVBC><CTZJResponseMessage><ListOfCTZJResumeAssetVBC><CTZJResumeAssetVBC><ErrCode>-1</ErrCode><ErrMsg>无违章停机记录</ErrMsg></CTZJResumeAssetVBC></ListOfCTZJResumeAssetVBC></CTZJResponseMessage></ListOfCTZJResumeAssetIOForVBC></SiebelMessage>";

        String news = "{returnData :" +
                "\"qwe\"}";

        Map<String,String> resultMap = JSONObject.parseObject(news, HashMap.class);

        System.out.println(resultMap);






    }


        public static void maina(){

            // 按指定模式在字符串查找
            String line = "This order was placed for QT3000! OK?";
            String pattern = "(\\D*)(\\d+)(.*)";

            // 创建 Pattern 对象
            Pattern r = Pattern.compile(pattern);

            // 现在创建 matcher 对象
            Matcher m = r.matcher(line);
            if (m.find( )) {
                System.out.println("Found groupCount value: " + m.groupCount() );

                System.out.println("Found value: " + m.group(0) );
                System.out.println("Found value: " + m.group(1) );
                System.out.println("Found value: " + m.group(2) );
                System.out.println("Found value: " + m.group(3) );
            } else {
                System.out.println("NO MATCH");
            }
        }

    private  static  void  parseXml(){
        String ss = "<?xml version=\"1.0\" encoding=\"UTF-8\"?><SiebelMessage IntObjectName=\"CTZJ Resume Asset IO For VBC\" IntObjectFormat=\"Siebel Hierarchical\"><ListOfCTZJResumeAssetIOForVBC><CTZJResponseMessage><ListOfCTZJResumeAssetVBC><CTZJResumeAssetVBC><ErrCode>-1</ErrCode><ErrMsg>无违章停机记录</ErrMsg></CTZJResumeAssetVBC></ListOfCTZJResumeAssetVBC></CTZJResponseMessage></ListOfCTZJResumeAssetIOForVBC></SiebelMessage>";

        String rex1="<ErrCode>(.*)</ErrCode>";
        Pattern pattern = Pattern.compile(rex1);
        Matcher matcher = pattern.matcher(ss);
        if (matcher.find()){

            if(matcher.group(1).equals("0")){

                System.out.println("请求成功");
            }else {
                System.out.println("请求失败");
                String rex2="<ErrMsg>(.*)</ErrMsg>";
                Pattern pattern2 = Pattern.compile(rex2);
                Matcher matcher2 = pattern2.matcher(ss);
                if (matcher2.find()) {
                    System.out.println("请求失败原因："+matcher2.group(0));
                    System.out.println("请求失败原因："+matcher2.group(1));
                }
            }



        }


    }


    public static void main(String[] args) {
        parseXml();
//        maina();
    }









}

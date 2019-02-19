package com.kq.groovy

/**
 * ExecuteDemo
 *
 * @author1 kq
 * @date 2018-12-05
 */
class ExecuteDemo {

    public static void main(String[] args) {
//        def listFiles = 'ls'.execute()
        def proc = 'cmd /c dir'.execute()

//        println proc.text.encode("utf-8");
//          def str =  new String(proc.text.getBytes(),"utf-8");
          def str =  new String(proc.text.getBytes(),"gb2312");
            println str;

//          println java.net.URLEncoder.encode(str, "UTF-8")

//        URLEncoder.encode 'a b', 'UTF-8'

//        listFiles.each {
//            println it
//        }
    }

}

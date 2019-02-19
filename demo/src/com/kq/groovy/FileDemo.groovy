package com.kq.groovy

/**
 * FileDemo
 *
 * @author1 kq
 * @date 2018-12-05
 */
class FileDemo {

    public static void main(String[] args) {


        def file = new File('demo/src/resources/maven.xml')

        println file.name
        println file.absolutePath
        println file.canonicalPath
        println file.directory

        // 打印文件内容
        file.each {
            println it
        }


    }


}

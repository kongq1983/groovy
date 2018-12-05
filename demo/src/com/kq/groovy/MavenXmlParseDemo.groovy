package com.kq.groovy

/**
 * MavenXmlParseDemo
 *
 * @author1 kq
 * @date 2018-12-05
 */
class MavenXmlParseDemo {

    public static void main(String[] args) {

        def input =  MavenXmlParseDemo.class.getResourceAsStream("/resources/maven.xml")
        def dependencies = new XmlSlurper().parse(input)

        for(dependency in dependencies.dependency){
//          println "${dependency.@name} works for${dependency.@company}";

            println "groupId:${dependency.groupId}  artifactId:${dependency.artifactId} version:${dependency.version}"
        }


    }


}

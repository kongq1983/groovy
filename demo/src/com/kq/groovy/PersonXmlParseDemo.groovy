package com.kq.groovy

/**
 * PersonXmlParseDemo
 *
 * @author1 kq
 * @date 2018-12-05
 */
class PersonXmlParseDemo {

    public static void main(String[] args) {
        def input =  MavenXmlParseDemo.class.getResourceAsStream("/resources/person.xml")
        def persons = new XmlSlurper().parse(input)

        for(p in persons.person){
            println "id:${p.@id}  name:${p.@name} address:${p.address}"
        }
    }

}

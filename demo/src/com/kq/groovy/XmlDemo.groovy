package com.kq.groovy

/**
 * Created by qikong on 18/12/4.
 */
class XmlDemo {


    public static void main(String[] args) {
        def text = '''
    <list>
        <technology>
            <name>Groovy</name>
        </technology>
    </list>
'''

        def list = new XmlSlurper().parseText(text)

        assert list instanceof groovy.util.slurpersupport.GPathResult
        assert list.technology.name == 'Groovy'


        list = new XmlParser().parseText(text)

        assert list instanceof groovy.util.Node
        assert list.technology.name.text() == 'Groovy'
    }


}

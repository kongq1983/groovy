package com.kq.groovy

import groovy.json.JsonSlurper

/**
 * Created by qikong on 18/12/4.
 */
class JsonDemo {

    public static void main(String[] args) {

        def jsonSlurper = new JsonSlurper()
        def object = jsonSlurper.parseText('{ "name": "John Doe" } /* some comment */')

        assert object instanceof Map
        assert object.name == 'John Doe'

        println '-------------------------'


        jsonSlurper = new JsonSlurper()
        object = jsonSlurper.parseText('{ "myList": [4, 8, 15, 16, 23, 42] }')

        assert object instanceof Map
        assert object.myList instanceof List
        assert object.myList == [4, 8, 15, 16, 23, 42]

        jsonSlurper = new JsonSlurper()
        object = jsonSlurper.parseText '''
    { "simple": 123,
      "fraction": 123.66,
      "exponential": 123e12
    }'''

        assert object instanceof Map
        assert object.simple.class == Integer
        assert object.fraction.class == BigDecimal
        assert object.exponential.class == BigDecimal

    }



}

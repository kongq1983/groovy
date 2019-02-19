package com.kq.groovy

import groovy.grape.Grape

/**
 * ClassLoaderDemo
 *
 * @author1 kq
 * @date 2019-02-19
 */
class ClassLoaderDemo {

//    @Grab(group='mysql', module='mysql-connector-java', version='6.0.6'),
    static void main(String[] args) {
            ClassLoader classLoader = new groovy.lang.GroovyClassLoader()
            Map[] grapez = [[group : 'mysql', module : 'mysql-connector-java', version : '6.0.6']]
            Grape.grab(classLoader: classLoader, grapez)
            println "Class: " + classLoader.loadClass('com.mysql.cj.jdbc.Driver')
    }

}

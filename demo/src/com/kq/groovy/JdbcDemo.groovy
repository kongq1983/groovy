package com.kq.groovy

@GrabResolver(name='aliyun', root='http://maven.aliyun.com/nexus/content/groups/public/')
@Grapes([
        @Grab(group='mysql', module='mysql-connector-java', version='6.0.6'),
        @GrabConfig(systemClassLoader =  true)
])

import groovy.sql.Sql

/**
 * JdbcDemo
 *
 * @author1 kq
 * @date 2019-02-19
 */
class JdbcDemo {


    static void main(String[] args) {

        def clzLoader = JdbcDemo.getClass().getClassLoader();

        println 'classLoader '+clzLoader;

        def sql = Sql.newInstance("jdbc:mysql://localhost:3306/test?characterEncoding=UTF-8&serverTimezone=GMT&useSSL=false", "root",
                "123456", "com.mysql.cj.jdbc.Driver")

        sql.eachRow("select * from t_user"){ println it.id +  " ${it.username}"}

    }

}

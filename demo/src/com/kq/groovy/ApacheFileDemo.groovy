package com.kq.groovy


@GrabResolver(name='aliyun', root='http://maven.aliyun.com/nexus/content/groups/public/')

@Grapes([
        @Grab(group='commons-io', module='commons-io', version='2.6'),
        @GrabConfig(systemClassLoader =  true)
])


import org.apache.commons.io.FilenameUtils


/**
 * ApacheFileDemo
 *
 * @author1 kq
 * @date 2019-02-19
 */
class ApacheFileDemo {

    static void main(String[] args) {

//        FileUtils

    }

}

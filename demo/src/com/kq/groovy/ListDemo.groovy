package com.kq.groovy

/**
 * ListDemo
 *
 * @author1 kq
 * @date 2018-12-05
 */
class ListDemo {

    public static void main(String[] args) {
        def list = [1, 3, 5, 7]
        assert list instanceof ArrayList
        assert list.contains(3)
        for (j in list) {
            println "j=${j}"
        }
        list.each() { item ->
            println "item=${item}"
        }
        println list


        List myList = [1, 2, 3]

        assert myList instanceof ArrayList

        assert myList.contains(3)
//        assert 2.is(myList)
//        assert 2.isCase(myList)

        myList = []
        assert myList.size()==0

        List longList = (0..1000).toList()
        assert longList[555] == 555

        myList = ['a','b','c','d','e','f']
        assert myList[0..2] == ['a','b','c']
        assert myList[0,2,4] == ['a','c','e']

        myList[0..2] = ['x','y','z']
        assert myList == ['x','y','z','d','e','f']

        myList[3..5] = []
        assert myList == ['x','y','z']

        myList[1..1] = [0, 1, 2]
        assert myList == ['x', 0, 1, 2, 'z']

    }

}

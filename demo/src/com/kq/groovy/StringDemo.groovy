package com.kq.groovy

/**
 * StringDemo
 * @author1 kq
 * @date 2018-12-05
 */
class StringDemo {

    public static void main(String[] args) {

        def str = "Welcome to Groovy!";

        assert str.startsWith("Welcome")==true
        assert str.endsWith("Groovy!")
        assert str.substring(0,7).equals("Welcome");
        assert str.length() == str.size()
        def  strs = str.split(" ");
        assert  strs[0].equals("Welcome")
        assert  strs[0]=="Welcome"
        assert str.toLowerCase() == "welcome to groovy!"


        def sb = new StringBuilder()
        sb.append("welcome");
        sb.append(" to ");
        sb.append(" you");

        println sb


        def store = ''
        10.times{
            store += 'x'
        }
        assert store == 'xxxxxxxxxx'

        store = ''

        1.upto(5) { number ->
            store += number
        }
        assert store == '12345'

        store = ''
        2.downto(-2) { number ->
            store += number + ' '
        }
        assert store == '2 1 0 -1 -2 '
        store = ''
        0.step(0.5, 0.1){ number ->
            store += number + ' '
        }
        assert store == '0 0.1 0.2 0.3 0.4 '


    }

}

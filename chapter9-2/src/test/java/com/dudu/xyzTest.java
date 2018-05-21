package com.dudu;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@SpringBootTest
@RunWith(SpringRunner.class)
public class xyzTest {
    @Test
    public void test0() {
        String longString = "abcaungabcaunfganabcabciuanguoabcaingan";
        String shortString = "abc";
        int count = 0;
        char[] lString = longString.toCharArray();
        char[] sString = shortString.toCharArray();
//        for (int i = 0; i < lString.length - sString.length; i++) {
//            if (lString[i] == sString[0]) {
//                for (int j = 0; j <sString.length ; j++) {
//                    if (lString[i+j]==sString[j]){
//                        if (j==sString.length-1){
//                            count++;
//                        } else{
//                            continue;
//                        }
//                    } else{
//                        break;
//                    }
//                }
//            }
//        }
        System.out.println(longString.substring(0, shortString.length()));
        for (int i = 0; i < longString.length() - shortString.length(); i++) {
            if (longString.substring(i, i + shortString.length()).equals(shortString)) {
                count++;
            }
        }
        System.out.println(count);

    }
}

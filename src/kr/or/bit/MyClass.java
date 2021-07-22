package kr.or.bit;

import java.io.IOException;

/*
클래스 == 설계도 == 타입

이 클래스를 설계한 사람은 ..... 내 설계도를 통해서 객체를 만드는 사람이 ... 무엇인가 강제했으면 좋겠다.
강제 [예외 처리]

강제적으로 예외를 처리하게 할 수 있습니다..


 */
public class MyClass {
    public MyClass(String path) throws NullPointerException, IOException {
        System.out.println("path : " + path);
    }

}


























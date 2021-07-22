package bit;

import kr.or.bit.MyClass;

import java.io.IOException;

public class Ex04_Thorws {
    public static void main(String[] args) {
//        try {
//            MyClass myClass = new MyClass("C:\\temp");
//        } catch ( NullPointerException | IOException e) {
//            e.printStackTrace();
//        }

        try {
            MyClass m = new MyClass("C:\\Temp");

            //내부적으로 NullPointerException n = new NullPointerException();
            //e 변수가 생성된 예외객체의 주소값을 받는다.

        } catch (NullPointerException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}


























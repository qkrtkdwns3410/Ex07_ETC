package bit;
/*
오류
1. 에러(Error) : 네트워크 장애 , 메모리 , 하드웨어         >>       개발자가 코드적으로 해결이 불가능합니다
2. 예외(Exception) : 개발자의 코드 실수에 의해서 발생합니다.       >>      코드를 수정하는 것이 아니라     >>  방어적인 코드(예외처리)
2.1 방어적인 코드  : 프로그램 강제 종료되는 것을 막고 ... 문제점에 인지를 할 수 있게 하는 것

>>개발 ....예외가 발생 ..프로그램은 그 시점에서 종료됩니다. (비정상 종료)  .. 정상적인 종료를 하겠다.

try{}
    >>문제가 발생할 수 있는 코드
    >>문제가 발생 한다면 ... 알리거나 인지를 해야합니다.
    catch(Exception e){
        >>문제가 생기면 ... catch로 와서 문제를 파악하겠다.
        >>처리를 유도하겠다

        >>1.    관리자에게 메일 (문제가 발생)
        >>2.    로그파일에 기록
        >>3.    강제 종료되는 것을 막는다.

        결과  :   코드는 수정 되어야 한다   (개발자가...직접)
    }finally{
        >>문제가 발생 하던 , 문제가 발생하지 않던 무조건 (강제적으로) 수행되어야할 코드입니다.
        >>DB연결 해제

    }
    예외가 발생하면 개발자는 예외 발생에 대해서 파악 ( 어떤 자원에 , 어떤 행위에 의해 문제가 발생했는지 파악 )

    예외가 발생되면 ... 그 예외에 대한 정보를 담을 수 있는 클래스(객체) 자동 생성 ... 그 만들어진 객체가 다양한 정보를 갖게 됩니다.
 */

public class Ex01_Exception {
    public static void main(String[] args) {
        System.out.println("java main start");

        try {
            System.out.println(0 / 0); //java.lang.ArithmeticException: /by zero 0 으로 나눌 수 있다.
        } catch (Exception e) {//Exception 클래스는 ArithmeticException의 부모타입
//            System.out.println(e.getMessage()); // 메시지를 출력
            e.printStackTrace(); //예외메시지 발생시키고 .. 끝까지 코드 실행합니다.
        }
        System.out.println("0/0 결과");
    }

}


























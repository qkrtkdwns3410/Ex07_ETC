package bit;

/*

 */
public class Ex02_Exception {
    public static void main(String[] args) {
        int num = 100;
        int result = 0;
        System.out.println("main start");

        //예외처리 ....

        try {

            for (int i = 0; i < 10; i++) {
                result = num / (int) (Math.random() * 10); //0- 9 //0이 나오면 0으로 나누는 에러발생
                System.out.println("result : " + result + " i :" + i);

                //예외가 발생하면 객체 한 개 예외에 맞는 클래스 생성하고 그 주소를..
                //Exception 에게 전달
                //다형성 : Exception 예외 객체에 대한 부모타입입니다.
            }

            /*

            모든 사용자 예외에 대한 부모클래스 : Exception
            예외가 발생하면 내부적으로 그 예외에 대한 객체를 자동 생성합니다

            NumberFormatException 입력값이 숫자가 아니라면 자동으로
            가상머신 new NumberFormatException() >> 생성된 객체안에는 정보가 담겨있습니다.

            가독성 해석..catch(Exception e) 문제..

            */
        } catch (ArithmeticException e) {

            System.out.println("문자가 발생 로그 기록...  관리자에게 메일 발송");
            System.out.println(" 원인 : " + e.getMessage());
        } catch (NullPointerException e) {

        } catch (Exception e) {
            System.out.println("원인  :" + e.getMessage());
        }
        System.out.println("main end");


    }

}


























package bit;

//주민번호 : 뒷번호 첫자리 : 1,3 남자 , 2,4 여자 라고 출력 ... 하는 문제

//main 함수 Scanner  사용 주민번호 입력받고
//앞:6자리     뒷:7자리
//입력값 : 123456-1234567
//1. 자리수 체크 (기능)함수 (14 ok)  return true , false
//2. 뒷번호 첫번째 자리값 1~4까지의 값만 허용 기능함수  return true, false
//3. 뒷번호 첫번째 자리값을 가지고 1,3 남자 , 2,4 여자 출력 기능함수  void  출력

//최소에 코드로 구현해야합니다.

import sun.swing.BakedArrayList;

import java.util.Scanner;

//3개의 함수 static
public class Ex07_String_Total_Quiz {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        loop_1:
        while (true) {
            System.out.println("프로그램 종료는 0을 눌러주세요!");
            System.out.print("주민번호를 입력하시오 예시) 951103-1712121 : ");
            String jumin = sc.nextLine().replace("-", "");
            switch (jumin) {
                case "0":
                    System.out.println("프로그램을 종료합니다.\n");
                    break loop_1;
                default:
                    int backFirstValue = (Integer.parseInt(jumin.substring(6, 7)));


                    System.out.println("13 자리수가 맞는지 체크합니다.\n");
                    System.out.println(juminCheck(jumin));

                    if (juminCheck(jumin)) {
                        System.out.println("뒷자리 첫번쨰 값이 1~4까지인지 확인합니다.");
                        System.out.println(juminBackCheck(backFirstValue));
                        if (juminBackCheck(backFirstValue)) {
                            System.out.println("뒷자리 첫번째 자리값으로 남자인지 여자인지 출력합니다.");
                            juminGenderCheck(backFirstValue);
                        }
                    }

            }

        }
    }

    static boolean juminCheck(String jumin) {
        boolean bo = jumin.length() == 13 ? true : false;
        return bo;
    }

    static boolean juminBackCheck(int back) {
        boolean bo1 = back >= 1 && back <= 4 ? true : false;
        return bo1;
    }

    static void juminGenderCheck(int back) {
        String str = (back == 1 || back == 3) ? "남자" : (back == 2 || back == 4) ? "여자" : "잘못된 입력";
        System.out.println(str);

    }

}


























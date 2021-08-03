package bit;
/*

* Calendar 를 상속받아 완전히 구현한 클래스는
* GregorianCalendar
buddhisCalendar 있는데 getInstance()는 [시스템의 국가와 지역설정]을 [확인]해서
태국인 경우 buddhisCalendar 의 인스턴스를 반환하고 그 외에는 GregorianCalendar
의 인스턴스를 반환한다

GregorianCalendar 는 Calendar를 상속받아 오늘날 전세계 공통으로 사용하고 있는
그레고리력에 맞게 구현한 것으로 태국을 제외한 나머지 국가에서는 GregorianCalendar 사용
그래서 인스턴스를 직접 생성해서 사용하지 않고 메서드를 통해서 인스턴스를 반환받게하는
이유는 최소의 변경으로 프로그램 동작을 하도록 하기 위함

class MyApp{
static void main(){
Calendar cal = new GregorianCalendar();
다른 종류의 역법의 사용하는 국가에서 실행하면 변경...... } }

class MyApp{
static void main(){
Calendar cal = new getInstance();
다른 종류의 역법의 사용하는 국가에서 실행하면 변경...... } }
API : 생성자 Protected Calendar()

*/

import kr.or.bit.utils.Edu_Date;

import java.util.Calendar;
import java.util.Date;

/*
자바에서는 날짜를 처리는 함수가 2개가 있습니다.
 */
public class Ex08_Calender {
    public static void main(String[] args) {
        Date dt = new Date(); //구버전입니다.
        System.out.println(dt); //Tue Jul 27 16:14:11 KST 2021

        //신버전
        //캘린더의 static함수중에 getInstance를 가져옵니다.
        // Math 함수와 같은 논리입니다.
        Calendar cal = Calendar.getInstance(); //static함수를 통해서 생성된 객체의 주소를 받습니다.
        System.out.println(cal);

        //당신이 필요한 자원을 꺼내서 사용하십시오.
        System.out.println("년도 : " + cal.get(Calendar.YEAR));
        System.out.println("월 : " + (cal.get(Calendar.MONTH) + 1));
        System.out.println("일 : " + cal.get(Calendar.DAY_OF_MONTH));
        System.out.println("---------------------------------------------------------------");
        //cal.get() 리턴타입 >> 정수 >> 연산작업이 가능합니다.

        System.out.println("오늘이 몇 째주임?? " + cal.get(Calendar.WEEK_OF_MONTH));
        System.out.println("오늘이 이달의 몇일?? " + cal.get(Calendar.DAY_OF_MONTH));
        System.out.println("요일." + cal.get(Calendar.DAY_OF_WEEK));

        System.out.println("---------------------------------------------------------------");
        System.out.println("시 : " + cal.get(Calendar.HOUR));
        System.out.println("분 : " + cal.get(Calendar.MINUTE));
        System.out.println("초 : " + cal.get(Calendar.SECOND));
        System.out.println("오전 오후 : " + cal.get(Calendar.AM_PM));
        System.out.println("---------------------------------------------------------------");

        //A 페이지
        //DateUtil.date()

        //B 페이지
        //DateUtil.date()

        //요구사항 변경 >> date함수 1번 수정

        String date = Edu_Date.DateString(cal, "/");
        System.out.println(date);
        System.out.println("---------------------------------------------------------------");
        System.out.println(monthFormat_DateString(cal));
    }

    public static String monthFormat_DateString(Calendar date) {
        //if ,String함수
        int YEAR = date.get(Calendar.YEAR);
        int MONTH = date.get(Calendar.MONTH) + 1;
        int DATE = date.get(Calendar.DATE);

        if (MONTH >= 1 && MONTH <= 9) {
            String MONTH_S = ("0" + MONTH);
            return (YEAR + "년 " + MONTH_S + "월" + DATE+"일 ");
        } else {
            return (YEAR + "년" + MONTH + "월" + DATE+"일 ");
        }
    }

}

//프로젝트 진행 시
//날짜 관련
//문자열 조작
//별도의 클래스 만들어서 배포합니다...

//com.superstar .utils >> SuperstarDate 클래스 >> 각종 표현 함수 (static >> overloading)
//                                >> SuperstarString 클래스 >> 각종 표현 함수 (static >> overloading)

//개발자가 원하는 코드 : 유지보수.. >> 당장 돌아가는게 문제가 아닙니다.

























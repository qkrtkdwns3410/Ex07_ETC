package kr.or.bit.utils;

import java.util.Calendar;

//학사시스템에 날짜를 제어하는 클래스
//특정 함수 호출. >> 사용
//함수많이 사용 >> 편하게 >>  new 불편하잖아 >> static >> 여러개를 만들고 >> 편하게 >> 오버로딩
public class Edu_Date {
    public static String DateString(Calendar date) {
        return date.get(Calendar.YEAR) + "년" +
                (date.get(Calendar.MONTH) + 1) + "월" +
                date.get(Calendar.DATE) + "일";
    }
    public static String DateString(Calendar date , String opr){
        return date.get(Calendar.YEAR) + opr +
                (date.get(Calendar.MONTH) + 1) + opr +
                date.get(Calendar.DATE) + opr;
    }

    public static void main(String[] args) {

    }
}


























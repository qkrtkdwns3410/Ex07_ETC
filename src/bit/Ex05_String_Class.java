package bit;

/*
String >> 클래스 >> new 통해서 사용가능합니다 >> [그럼에도 불구하고 String 그냥 값타입처럼 쓰세요.]
String이 가지고 있는 수 많은 문자열 함수때문에 공부합니다. ( 데이터 대부분 문자열 ... 조작하는 것에 (합치고 자르고.., 붙이고 ....)

String은 다양한 함수 ( static 함수( 많이 사용하겠지..편하게 ) + 일반함수 ) >>static의 경우 final 상수를 사용하는 경우가 대부분입니다...

최소 15개 ~20개 암기(함수)...




 */
public class Ex05_String_Class {
    public static void main(String[] args) {
        String str = "";
        System.out.println("<" + str + ">");

        //일단 String 은 int , double 로 사용하십시오 ( 전제)
        String[] strArr = {"aaaa", "bbbb", "cccc"};
        for (String s : strArr) {
            System.out.println(s);
        }

        System.out.println("---------------------------------------------------------------");
        System.out.println("---------------------------------------------------------------");
        System.out.println("---------------------------------------------------------------");
        System.out.println("---------------------------------------------------------------");

        String str2 = "홍길동";
        System.out.println(str2.length());
        System.out.println(str2.toString());
        System.out.println(str2);

        //원칙
        String str3 = new String("김유신");
        for (int i = 0; i < str3.length(); i++) {
            System.out.println(str3.charAt(i));
        }
        //김유신이라는 문자열은
        //String 클래스 내부에 데이터 저장 >> char[]
        //[김][유][신]
        // class String extends Object{char[] value ... String toString() }
        //

        /*
            이것만은 기억하자!!
         */
        String str4 = "AAA";
        String str5 = "AAA";

        System.out.println(str4);
        System.out.println(str5.toString()); //toString은 자체로 생략되어있습니다.

        System.out.println(str4 == str5);
        // == 연산자 (값을 비교) >> str4 (주소) ==str5 (주소)
        //같은 주소?? >>

        //주소가 아니고 값을 비교(문자열 값을 )
        //무조건 암기 (String 은 비교시 == 쓰면 개호구 (주소비교)) , 값을 비교하려면 Equals를 사용해야합니다!
        System.out.println(str4.equals(str5)); // String의 비교 !!!

        String str6 = new String("BBB");
        String str7 = new String("BBB");

        System.out.println(str6 == str7); //false >> new String 으로 서로 다른 객체를 생성(주소가 다름)했습니다 >> 그래서 다름
        System.out.println(str6.equals(str7));

        //넌센스
        String s = "A";
        s += "B";
        s += "C";
        System.out.println(s);

        s = "A"; //기존에 있는 "A" 메모리의 주소값을 가져옵니다.

        //누적 문자열은  >> 성능향상을 위해 ... 아래놈을 사용하자!!
//        StringBuilder;
//        StringBuffer;


    }

}


























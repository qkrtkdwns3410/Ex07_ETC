package bit;

/*

 */
public class Ex06_String_Function {
    public static void main(String[] args) {

        //일반적으로 많이 다루는 데이터 : 숫자 , 문자열 , 날짜

        //문자열 조작하기 (String 함수 공부하기)

        String str = "hello";
        String concatStr = str.concat(" world"); //문자열 합치기
        System.out.println(concatStr);
        System.out.println("---------------------------------------------------------------");
        boolean bo = str.contains("ell"); //해당 문자열이 포함되어 있는지를 true  false 판단합니다.
        System.out.println(bo);

        System.out.println("---------------------------------------------------------------");
        String str2 = "a b c d"; //char[]  >> [a][ ][b][ ][c][ ][d]
        System.out.println(str2.length());
        System.out.println("---------------------------------------------------------------");

        String filename = "hello java world";
        System.out.println(filename.indexOf("j"));
        System.out.println(filename.indexOf("java"));
        System.out.println(filename.indexOf("배고파"));    //배열에 값이 없으면 ( -1 ) >>>

        System.out.println("---------------------------------------------------------------");

        //indexOf활용
        //index 값을 찾는 것이 목적
        //신문사설 ... 내용 (내가 원하는 단어가 포함 있는지 여부)
        //"투표" 단어가 있는지 확인
        //사설.indexOf("투표")  >>  -1  보다 큰 정수라면 ?? (최소 하나는 있습니다)
        // return -1 ... >> (투표라는 단어가 없음)

        System.out.println("---------------------------------------------------------------");
        if (filename.indexOf("java") != -1) { //wo 가 존재한다면..
            System.out.println("java라는 단어가 포함되어 있습니다.");
        } else {
            System.out.println("java라는 단어가 포함되어 있지 않습니다.");
        }

        System.out.println("---------------------------------------------------------------");

        System.out.println(filename.lastIndexOf("a")); //제일 마지막에 있는 a를 찾아서 index를 리턴합니다.

        //length() , indexOf() , subString() , replace() (치환), split() (분리)
        System.out.println("---------------------------------------------------------------");
        String result = "superman";
        System.out.println(result.substring(0));//superman
        System.out.println(result.substring(2)); //perman
        System.out.println(result.substring(1, 2)); //u 배열 1에서 2전까지. // (endIndex -1)
        System.out.println(result.substring(0, 0));
        System.out.println(result.substring(0, 1));


        //Quiz
        String filename2 = "jdkdsa.png"; //또는 hong.png 라고 할수도 있고 h.tmp 라고 할 수도 있음.
        //여기서 파일명과 확장자를 분리해서 출력
        //1. 파일명 > h.1111
        //2. 확장자 > jpeg
        int indexM = filename2.indexOf(".");
        System.out.println(filename2.substring(0, indexM));
        System.out.println(filename2.substring(indexM + 1));


        System.out.println("---------------------------------------------------------------");
        //치환 함수
        String str3 = "AKSDLKLASLDASDA";
        String result3 = str3.replace("인텔리제이", "비주얼스튜디오");
        System.out.println(result3);

        result3 = str3.replace("A", "a");
        System.out.println(result3);

        System.out.println("---------------------------------------------------------------");
        //ETC
        System.out.println(str3.charAt(0));
        System.out.println(str3.charAt(3));

        System.out.println(str3.endsWith("SDA")); //endwith >> 끝에서부터 result3를 포함하는 것이 있는지 없는지 알려주셈
        System.out.println(str3.endsWith("일기장")); //endwith >> 끝에서부터 result3를 포함하는 것이 있는지 없는지 알려주셈
        System.out.println(str3.equalsIgnoreCase("aksdLKLASLDASDA")); //대소문자 구별없이 같은거 찾아라.

        System.out.println("---------------------------------------------------------------");

        //Today Point   (Split 함수!!!!!!!!!!!)
        String str4 = "슈퍼맨,팬티,노랑색,우하하,우하하";
        String[] arr = str4.split(",");

        for (String s : arr) {
            System.out.println(s);
        }

        //파일확장자 Split으로 해결하기

        String filename3 = "h1111.jpeg";
        String[] names = filename3.split("\\."); // . 데이터 인지위해 \ 사용 >> 엥 에러! >> \\. 사용하면 역슬래쉬 . 모두 데이터로 인지를 가능합니다.
        for (String s : names) {
            System.out.println(s); //안나옴
        }

        //문제가 발생합니다.
        //정규표현식 ... 과제.
        //어떤 데이터가 정의된 어떤 Format에 맞는냐 틀리냐를 검증합니다.
        //주민번호 (앞자리 숫자 6자리  - 특수문자 뒷자리 숫자 7자리 ) >> 표현식
        //{\d6}-{\d7}  정규표현식
        //12345 - 1234567 (x)
        //999999 - 1234567 (0) 회원가입가능
        //핸드폰 번호, 차량번호  ,도메인 주소 , 이메일 주소 , 한글처리 , 등등...
        //조만간 조오별 과아제 로오 나아 가압 니이입 돠다.

        //java의 특수문자
        //이스케이프 문자.. > 특정 문자 앞에 \

        char sing = '\'';

        String str6 = "홍                길               동";
        System.out.println(str6.replace(" ", ""));

        String str7 = "             홍길동                  ";
        System.out.println(">" + str7.trim() + "<");
System.out.println("---------------------------------------------------------------");
        //함수가 1개 ..여러 개 사용시
        String str8 = "            홍         길           동                  ";
        String result5 = str8.trim();
        String result6 = result5.replace(" ", "");
        System.out.println(result6);

        System.out.println("---------------------------------------------------------------");

        //자바에서 여러개의 함수를 적용할 때에는  ( method chain 기법 )
        String result7 = str8.trim().replace(" ", "").substring(2);
        System.out.println(result7);

        System.out.println("---------------------------------------------------------------");

        //Quiz-1
        int sum=0;
        String[] numarr = {"1","2","3","4","5"};
        //문제: 배열에 있는 문자값들의 합을 sum 변수에 담아서 출력 : 결과 15
        for (String s : numarr) {
            sum += Integer.parseInt(s);
        }
        System.out.println(sum);

        System.out.println("---------------------------------------------------------------");

        //Quiz-2
        String jumin="123456-1234567";
//        위 주민번호의 합을 구하세요_1
        sum = 0;
        String[] juminSum = jumin.split("-");
        String juminSum2 = juminSum[0] + juminSum[1];

        for (int i = 0; i < juminSum2.length(); i++) {
            sum+= juminSum2.charAt(i) - '0';
        }

        System.out.println(sum);

        System.out.println("---------------------------------------------------------------");
        String[] numArr2 = jumin.replace("-", "").split("");
        int sum3 = 0;
        for (String s : numArr2) {
            sum3 += Integer.parseInt(s);
        }
        System.out.println("주민번호 합 : " + sum3);


        //3
        String jumin4 = jumin.replace("-", "");
        int sum4 = 0;
        for (int i = 0; i < jumin4.length(); i++) {
            sum4 += Integer.parseInt(String.valueOf(jumin4.charAt(i)));
            //char 하나를 뽑아서 '1' >> String.valueOf('1') >> String >> parseInt
        }
        System.out.println(sum4);




    }

}


























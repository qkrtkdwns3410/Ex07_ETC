package bit;

import java.io.IOException;

/*
게임 CD를 PC에 설치를 한다는 가정하에
1. 설치하면 C:\Temp 폴더
2. 복사한 파일 >> 게임 설치
3. 정상설치 >> C:\Temp 안에 복사용 파일 제거
4. 비정상적인 설치 >> 강제 종료 >> C:\Temp 안에 복사용 파일을 제거
 */
public class Ex03_Finally {
    static void startInstall() {
        System.out.println("INSTALL");
    }

    static void copyFiles() {
        System.out.println("COPY FILES");
    }

    static void fileDelete() {
        System.out.println("FILE DELETE");
    }

    public static void main(String[] args) {
        try {
            copyFiles();
            startInstall();
            //강제로 문제를 발생시키겠습니다.
            //예외 객체를 만들어서 던진다 ..catch 잡도록
            throw new IOException("mycom install 도중 문제 발생...."); //개발자가 임의로 에러 발생
        } catch (Exception e) {
            System.out.println("사용자 정의 예외 : " + e.getMessage());
            //예외 발생시에는 실행되긴함.. 근데 예외가 발생하지 않을 경우는 어떻게 처리하냐???>>finally

        }finally { //예외가 발생하던 ,예외가 발생하지 않던 강제적으로 실행되는 블럭입니다.
            fileDelete();
        }



        /*try {

        } catch (Exception e) {

        }finally {

        }*/
    }

}


























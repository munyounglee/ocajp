public class question10 {
    public static void main(String[] args){
        System.out.println("String main " + args[0]);
    }
}

/*
javac question.java
java question "1 2 3"

javac는 명령오는 텍스트 파일로 작성된 java 파일을 bytecode로 컴파일한다.
.class 파일로 저장됨
java명령어는 javac 명령어로 컴파일한 .class 파일을 실행시킬 수 있음.

출력결과는?
String main 1 2 3

 */

package question30;

public class Test {
    public static void main(String[] args){
        Student s1 = new Student();// s1의 주소는 10000번지이고 가르키는 값은 100번지
        Student s2 = new Student();// s2의 주소는 20000번지이고 가르키는 값은 200번지
        Student s3 = new Student();// s3의 주소는 30000번지이고 가르키는 값은 300번지
        System.out.println("s1 = " + s1);
        System.out.println("s2 = " + s2);
        System.out.println("s3 = " + s3);

        s1 = s3; // s1은 300번지
        s3 = s2; // s3에는 200번지
        s2 = null; // s2는 null

        /*
        s1 = 300번지 , s2 = null , s3= 200번지
         */

        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s3);
    }
}

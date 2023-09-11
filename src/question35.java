public class question35 {
    public static final int MIN =1;
    public static void main(String[] args) {
        int x = args.length;
        System.out.println("x = " + x);

        if (checkLimit(x)) { //line n1
            System.out.println("Java SE");

        } else {
            System.out.println("Java EE");
        }
    }
    public static boolean checkLimit(int x){
        return (x >= MIN) ? true : false;
    }
}

/*
javac question35.java
java question35

x=0
Java EE가 출력됨.


 */

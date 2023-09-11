public class question39 {
    public static void main(String[] args){
        String myStr = " Hello World ";
        myStr.trim();//이걸로는 안없어진다.
        System.out.println(myStr);
        String myStr1 = myStr.trim();
        System.out.println(myStr1);
        int i1 = myStr.indexOf(" " );
        int i2 = myStr.indexOf(" " );
        System.out.println(i1);
        System.out.println(i2);
    }
}

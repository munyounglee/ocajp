public class question31 {
    public static void main(String[] args){
        float var1 = (12_345.01 >= 123_45.00) ? 12_456 : 124_56f;
        float var2 = var1 + 1024;
        System.out.println("var1 = " + var1);
        System.out.println("var2 = " + var2);
        //12456 + 1024 = 13480.0
        System.out.println(var2);
    }
}

public class question20 {
    int a1;

    public static void doProduct(int a){
        a = a * a;
    }

    public static void doString(StringBuilder s) {
        s.append(" " + s);
    }

    public static void main(String[] args){
        question20 item = new question20();
        item.a1 = 11;
        StringBuilder sb = new StringBuilder("Hello");
        Integer i = 10;
        doProduct(i); // 딱히 변화가 없을텐데..?
        doString(sb);
        doProduct(item.a1);
        System.out.println(i + " " + sb + " " + item.a1);
    }
}

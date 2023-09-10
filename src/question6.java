public class question6 {

    /*
    그냥 9랑 5가 나오면 왜냐하면 저 이니셜라이즈에서 값을 제곱을 한다고는 하는데
    값 부르는게 call by reference가 아니라 call by value이기 때문에
    값은 안바뀌고 그냥 그대로 x,y 값 9랑 5가 나옴.
     */

    int x,y;

    public question6(int x, int y){
        initalize(x,y);
    }

    public void initalize(int x, int y){
        this.x = x * x;
        this.y = y * y;
    }

    public static void main(String[] args){
        int x=9, y=5;
        question6 obj = new question6(x,y);
        System.out.println(x + " " + y);
    }
}

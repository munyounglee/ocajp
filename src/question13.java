public class question13 {
    public static void main(String[] args){

        //int[] arr = (1,2,3,4);// 문제는 이렇게 나와있는데 이건 올바른 배열 선언이 아님.
        int[] arr = {1,2,3,4};

        int i=0;

        do {
            System.out.print(arr[i] + " " );
            i++;
        } while(i< arr.length-1);
    }
}

public class question7 {
    public static void main(String[] args){
        int n[][] = {{1,3} , {2,4}};
        /*
        i는 1부터 해서 1-- 하니까 1,0이 됨.
        j는 n[1]의 길이는 2 그래서 i가 1일때 j=1 j=0
        i가 0일때도 j=1 j=0
        순서대로하면 [1][1] [1][0] [0][1] [0][0]
        결론은
        4231
         */
        for(int i=n.length-1; i>=0; i--){
            for(int j=n[i].length-1; j>=0; j--){
                System.out.print(n[i][j]);
            }
        }
    }
}

public class question29 {
    public static void main(String[] args){
        int wd = 0;
        String days[] = {"sun", "mon", "wed", "sat"};
        for(String s: days){
            switch(s){
                case "sat":
                case "sun":
                    wd -=1;
                    break;
                case "mon":
                    wd++;
                case "wed":
                    wd +=2;
            }
        }
        /*
        sun일때는 -1, mon은 0 => 2 , wed +2 해서 4 sat는 -1해서 3.
         */

        System.out.println(wd);
    }
}

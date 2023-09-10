import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class question19 {
    public static void main(String[] args){
        String[] arr = {"Hi", "How", "Are", "YOu"};
        List<String> arrList = new ArrayList<>(Arrays.asList(arr));
        if(arrList.removeIf((String s) ->  s.length() <=2)){//removeif 저게 길이가 2이하인걸 지우란 뜻임.
            System.out.println(arrList.get(1) + "removed");
        }
    }
}

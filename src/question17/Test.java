package question17;

public class Test {
    public static void main(String[] args){
        Student[] students = new Student[3];
        students[1] = new Student("Richard");
        students[2] = new Student("Donald");
        //얜 초기화 안하면 초깃값이 null이네.
        System.out.println(students[0]);
//  향상된 for문을 사용할땐 nullpointerexception이 발생할 수 있음.
        //객체의 속성에 접근하려고 하면 nullpointerexception이 발생하는구나?
        //얘도 nullpointer;
//        for(Student s : students){
//            System.out.println(" " + s.name);
//        }

        for(int i=0; i<=2; i++){
            System.out.println(" " + students[i].name);
        }
    }
}

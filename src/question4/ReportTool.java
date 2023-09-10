package question4;

public class ReportTool extends Tool{



/*
여기서 commpliation fails가 발생함.
attempting to assign weaker access privileges ('package-private'); was 'public'

main()메서드가 없는 클래스는 대부분 외부 클래스에서 이용할 목적으로 설계된 라이브러리 클래스.
라이브러리 클래스는 외부클래스에서 접근할 수 있는 멤버와 접근할 수 없는 멤버를 구분하여 설계하는 것이 바람직함.

접근제한자 public < protected < default < private

class : public , default
member : public , protected , default , private

public :
모든 패키지에서 아무런 제한 없이 호출 할 수 있게 한다.
보통 생성자 또는 필드 , 메서드가 public이라면 클래스도 public 접근 제한을 가진다.

protectd :
default와 마찬가지로 같은 패키지에 속하는 클래스에서 호출 할 수 있게됨.
차이점은 다른 패키지에 속한 클래스가 해당 클래스의 자식(child) 클래스라면 호출할 수 있음.

 default:
 접근제한자를 생략했다면 default 접근제한을 가진다.
 같은 패키지 내에서는 제한없이 호출 할 수 있으나,다른 패키지에서는 호출할 수 없다.

Tool 부모보다 자식이 쎌 수 없음.


 */
     protected void export() {
        System.out.println("RTool1::export"); // line n2
    }
}

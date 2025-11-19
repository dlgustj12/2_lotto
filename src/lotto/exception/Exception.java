package lotto.exception;

//모든 커스텀 예외의 부모 클래스
//ErrorCode를 받아 생성자에서 [ERROR] 접두사 붙여서 메시지 설정
public class Exception extends IllegalArgumentException {
    //static -> 클래스 인스턴스를 생성하지 않고도 접근 가능
    private static final String EP = "[ERROR]";

    public Exception(ErrorCode ec){
        super(EP + ec.getMessage());
    }
}

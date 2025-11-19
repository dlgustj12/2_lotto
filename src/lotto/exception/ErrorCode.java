package lotto.exception;

//모든 예외 상황에 대한 오류 메시지 정의
public enum ErrorCode {

    //번호 범위 오류
    NUM_RANGE("로또 번호 범위는 1~45여야합니다."),
    //구입 금액 오류
    PAY_UNIT("금액 단위가 1000원이여야합니다."),
    //로또 번호 중복
    DUPLICATE_NUM("로또 번호는 중복되지 않아야합니다.")

    private final String message;

    ErrorCode(String message){
        this.message = message;
    }

    public String getMessage(){
        return message;
    }

}

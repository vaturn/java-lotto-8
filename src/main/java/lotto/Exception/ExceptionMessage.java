package lotto.Exception;

public enum ExceptionMessage {
    EMPTY_INPUT("입력이 비어있습니다."),
    INVALID_COUNT_LOTTO("로또 번호는 6개 입력해야합니다."),
    INVALID_NUMBER_LOTTO("로또 번호는 1~45입니다."),
    DUPLICATED_NUMBER_LOTTO("로또 번호는 중복될 수 없습니다."),
    INVALID_NUMBER("정수가 아닙니다.");

    private final String message;

    ExceptionMessage(String message) {
        this.message = message;
    }

    public String getMessage(){
        return "[ERROR]" + message;
    }
}

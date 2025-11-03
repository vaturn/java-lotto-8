package lotto.Parser;

import lotto.Exception.ExceptionMessage;

public interface Parser<T> {
    T parse(String input);
    default int parseToInt(String input){
        if(input == null || input.isBlank())
            throw new IllegalArgumentException(ExceptionMessage.EMPTY_INPUT.getMessage());

        try {
            return Integer.parseInt(input);
        } catch (NumberFormatException e) {
            throw new IllegalArgumentException(ExceptionMessage.INVALID_NUMBER.getMessage());
        }
    }
}

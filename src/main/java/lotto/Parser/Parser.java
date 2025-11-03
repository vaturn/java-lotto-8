package lotto.Parser;

public interface Parser<T> {
    T parse(String input);
    default int parseToInt(String input){
        try {
            return Integer.parseInt(input);
        } catch (NumberFormatException e) {
            throw new IllegalArgumentException();
        }
    }
}

package lotto.Model;

import lotto.Exception.ExceptionMessage;

import java.util.List;
import java.util.stream.Collectors;

public class Lotto {
    public static final int SIZE_LOTTO = 6;
    public static final int MIN_NUMBER = 1;
    public static final int MAX_NUMBER = 45;

    private final List<Integer> numbers;

    public Lotto(List<Integer> numbers) {
        validate(numbers);
        this.numbers = numbers;
    }

    public void printLotto(){
        System.out.println(formatLotto());
    }

    public int countOverlap(List<Integer> winningNumbers){
        return Math.toIntExact(numbers.stream()
                .filter(winningNumbers::contains)
                .count());
    }

    private String formatLotto(){
        return numbers.stream()
                .map(String::valueOf)
                .collect(Collectors.joining(", "));
    }

    private void validate(List<Integer> numbers) {
        if(!isCorrectSize())
            throw new IllegalArgumentException(ExceptionMessage.INVALID_COUNT_LOTTO.getMessage());

        if(!isCorrectRange())
            throw new IllegalArgumentException(ExceptionMessage.INVALID_NUMBER_LOTTO.getMessage());

        if(hasDuplicate())
            throw new IllegalArgumentException(ExceptionMessage.DUPLICATED_NUMBER_LOTTO.getMessage());
    }

    private boolean hasDuplicate() {
        return numbers.size() != numbers.stream().distinct().count();
    }

    private boolean isCorrectRange(){
        for(int number: numbers){
            if(number < MIN_NUMBER || number > MAX_NUMBER)
                return false;
        }
        return true;
    }

    private boolean isCorrectSize(){
        return numbers.size() == SIZE_LOTTO;
    }
}

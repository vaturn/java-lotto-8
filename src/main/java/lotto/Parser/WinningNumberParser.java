package lotto.Parser;

import lotto.Exception.ExceptionMessage;

import java.util.ArrayList;
import java.util.List;

public class WinningNumberParser implements Parser<List<Integer>>{

    @Override
    public List<Integer> parse(String input) {
        if (input == null || input.isBlank()) {
            throw new IllegalArgumentException(ExceptionMessage.EMPTY_INPUT.getMessage());
        }

        String[] parts = input.split(",");
        List<Integer> result = new ArrayList<>();

        for(String part: parts){
            result.add(parseToInt(part));
        }

        return result;
    }
}

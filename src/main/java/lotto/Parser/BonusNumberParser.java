package lotto.Parser;

public class BonusNumberParser implements Parser<Integer>{
    @Override
    public Integer parse(String input) {
        return parseToInt(input);
    }
}

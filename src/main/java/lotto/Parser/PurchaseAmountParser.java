package lotto.Parser;

public class PurchaseAmountParser implements Parser<Integer>{

    @Override
    public Integer parse(String input) {
        return parseToInt(input);
    }
}

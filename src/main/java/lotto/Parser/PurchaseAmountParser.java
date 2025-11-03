package lotto.Parser;

public class PurchaseAmountParser implements Parser<Integer>{

    @Override
    public Integer parse(String input) {
        try {
            return Integer.parseInt(input);
        } catch (NumberFormatException e) {
            throw new IllegalArgumentException();
        }
    }
}

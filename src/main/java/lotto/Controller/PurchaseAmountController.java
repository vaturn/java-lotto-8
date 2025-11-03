package lotto.Controller;

import lotto.InputConsole.ConsoleView;
import lotto.InputConsole.PurchaseAmountView;
import lotto.Parser.Parser;
import lotto.Parser.PurchaseAmountParser;

public class PurchaseAmountController {
    private static final int MAX_ATTEMPT_COUNT = 3;
    ConsoleView purchaseView = new PurchaseAmountView();
    Parser<Integer> purchasePaser = new PurchaseAmountParser();

    public int getPurchaseAmountWithRetry() {
        int currentAttemptCounts = 1;
        IllegalArgumentException illegalArgumentException = null;

        while (currentAttemptCounts <= MAX_ATTEMPT_COUNT) {
            try {
                return getPurchaseAmount();
            } catch (IllegalArgumentException e) {
                currentAttemptCounts++;
                illegalArgumentException = e;

                System.out.println(e.getMessage());
            }
        }
        throw illegalArgumentException;
    }
    private int getPurchaseAmount(){
        int purchaseAmount = purchasePaser.parse(purchaseView.getInput());
        return purchaseAmount / 1000;
    }
}

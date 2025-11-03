package lotto.Controller;

import lotto.InputConsole.ConsoleView;
import lotto.InputConsole.PurchaseAmountView;
import lotto.Parser.Parser;
import lotto.Parser.PurchaseAmountParser;
import lotto.Validater.PurchaseValid;

public class PurchaseAmountController {
    private static final int MAX_ATTEMPT_COUNT = 3;
    ConsoleView purchaseView = new PurchaseAmountView();
    Parser<Integer> purchasePaser = new PurchaseAmountParser();
    PurchaseValid purchaseValid = new PurchaseValid();

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
        purchaseValid.valid(purchaseAmount);
        return purchaseAmount / 1000;
    }
}

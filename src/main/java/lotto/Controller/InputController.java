package lotto.Controller;

import lotto.InputConsole.BonusNumber;
import lotto.InputConsole.ConsoleView;
import lotto.InputConsole.PurchaseAmountView;
import lotto.InputConsole.WinningNumberView;

public class InputController {
    private static final int MAX_ATTEMPT_COUNT = 3;
    ConsoleView purchaseView = new PurchaseAmountView();
    ConsoleView winningView = new WinningNumberView();
    ConsoleView bonusView = new BonusNumber();

    public String getPurchase(){
        int currentAttemptCounts = 1;
        IllegalArgumentException illegalArgumentException = null;

        while (currentAttemptCounts <= MAX_ATTEMPT_COUNT) {
            try {
                return purchaseView.getInput();
            } catch (IllegalArgumentException e) {
                currentAttemptCounts++;
                illegalArgumentException = e;

                System.out.println(e.getMessage());
            }
        }
        throw illegalArgumentException;
    }

    public String getWinning(){
        int currentAttemptCounts = 1;
        IllegalArgumentException illegalArgumentException = null;

        while (currentAttemptCounts <= MAX_ATTEMPT_COUNT) {
            try {
                return winningView.getInput();
            } catch (IllegalArgumentException e) {
                currentAttemptCounts++;
                illegalArgumentException = e;

                System.out.println(e.getMessage());
            }
        }
        throw illegalArgumentException;
    }

    public String getBonus(){
        int currentAttemptCounts = 1;
        IllegalArgumentException illegalArgumentException = null;

        while (currentAttemptCounts <= MAX_ATTEMPT_COUNT) {
            try {
                return bonusView.getInput();
            } catch (IllegalArgumentException e) {
                currentAttemptCounts++;
                illegalArgumentException = e;

                System.out.println(e.getMessage());
            }
        }
        throw illegalArgumentException;
    }
}

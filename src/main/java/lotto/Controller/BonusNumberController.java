package lotto.Controller;

import lotto.InputConsole.BonusNumber;
import lotto.InputConsole.ConsoleView;
import lotto.Parser.BonusNumberParser;
import lotto.Parser.Parser;

public class BonusNumberController {
    private static final int MAX_ATTEMPT_COUNT = 3;
    ConsoleView bonusNumberView = new BonusNumber();
    Parser<Integer> bonusNumberParser = new BonusNumberParser();

    public int getBonusNumberWithRetry() {
        int currentAttemptCounts = 1;
        IllegalArgumentException illegalArgumentException = null;

        while (currentAttemptCounts <= MAX_ATTEMPT_COUNT) {
            try {
                return getBonusNumber();
            } catch (IllegalArgumentException e) {
                currentAttemptCounts++;
                illegalArgumentException = e;

                System.out.println(e.getMessage());
            }
        }
        throw illegalArgumentException;
    }
    private int getBonusNumber(){
        int winningNumber = bonusNumberParser.parse(bonusNumberView.getInput());
        return winningNumber;
    }
}
package lotto.Controller;

import lotto.InputConsole.ConsoleView;
import lotto.InputConsole.WinningNumberView;
import lotto.Parser.Parser;
import lotto.Parser.WinningNumberParser;

import java.util.List;

public class WinningNumberController {
    private static final int MAX_ATTEMPT_COUNT = 3;
    ConsoleView winningNumberView = new WinningNumberView();
    Parser<List<Integer>> winningNumberParser = new WinningNumberParser();

    public List<Integer> getWinningNumberWithRetry() {
        int currentAttemptCounts = 1;
        IllegalArgumentException illegalArgumentException = null;

        while (currentAttemptCounts <= MAX_ATTEMPT_COUNT) {
            try {
                return getWinningNumber();
            } catch (IllegalArgumentException e) {
                currentAttemptCounts++;
                illegalArgumentException = e;

                System.out.println(e.getMessage());
            }
        }
        throw illegalArgumentException;
    }
    private List<Integer> getWinningNumber(){
        List<Integer> winningNumber = winningNumberParser.parse(winningNumberView.getInput());
        return winningNumber;
    }
}

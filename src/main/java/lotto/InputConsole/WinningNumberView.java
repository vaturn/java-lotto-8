package lotto.InputConsole;

public class WinningNumberView extends ConsoleView {
    private static final String PROMPT_BEFORE_WINNING_NUMBER_INPUT = "당첨 번호를 입력해 주세요.";

    @Override
    protected void printPromptBeforeInput() {
        System.out.println(PROMPT_BEFORE_WINNING_NUMBER_INPUT);
    }
}

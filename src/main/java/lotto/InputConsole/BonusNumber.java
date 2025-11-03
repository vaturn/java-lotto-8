package lotto.InputConsole;

public class BonusNumber extends ConsoleView{
    private static final String PROMPT_BEFORE_BONUS_NUMBER_INPUT = "보너스 번호를 입력해 주세요.";

    @Override
    protected void printPromptBeforeInput() {
        System.out.println(PROMPT_BEFORE_BONUS_NUMBER_INPUT);
    }
}

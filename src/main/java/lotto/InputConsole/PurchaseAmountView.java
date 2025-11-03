package lotto.InputConsole;


public class PurchaseAmountView extends ConsoleView{
    private static final String PROMPT_BEFORE_PURCHASE_INPUT = "구입금액을 입력해 주세요.";

    @Override
    protected void printPromptBeforeInput() {
        System.out.println(PROMPT_BEFORE_PURCHASE_INPUT);
    }

}

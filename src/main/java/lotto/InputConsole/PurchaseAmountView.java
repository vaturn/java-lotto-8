package lotto.InputConsole;

import java.util.List;

public class PurchaseAmountView extends ConsoleView{
    private static final String PROMPT_BEFORE_PURCHASE_INPUT = "구입금액을 입력해 주세요.";
    public int getPurchaseAmount(){
        return parsePurchase(getInput());
    }

    @Override
    protected void printPromptBeforeInput() {
        System.out.println(PROMPT_BEFORE_PURCHASE_INPUT);
    }

    private int parsePurchase(String userInput){
        return Integer.parseInt(userInput);
    };
}

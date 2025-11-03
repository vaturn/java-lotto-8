package lotto.Controller;

import lotto.Model.Lotto;

public class InputController {

    PurchaseAmountController purchaseAmountController = new PurchaseAmountController();
    WinningNumberController winningNumberController = new WinningNumberController();
    BonusNumberController bonusNumberController = new BonusNumberController();

    public int getPurchase(){
        return purchaseAmountController.getPurchaseAmountWithRetry();
    }

    public Lotto getWinning(){
        return new Lotto(winningNumberController.getWinningNumberWithRetry());
    }

    public int getBonus(){
        return bonusNumberController.getBonusNumberWithRetry();
    }
}

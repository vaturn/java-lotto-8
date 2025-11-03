package lotto.Controller;


public class MainController {
    InputController inputController = new InputController();
    LottoController lottoController = new LottoController();

    public void run(){
        int purchaseAmount = inputController.getPurchase();

        lottoController.purchaseLotto(purchaseAmount);

        inputController.getWinning();

        inputController.getBonus();
    }
}

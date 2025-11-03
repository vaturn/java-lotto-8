package lotto.Controller;


import lotto.Model.Lotto;

public class MainController {
    InputController inputController = new InputController();
    LottoController lottoController = new LottoController();

    public void run(){
        int purchaseAmount = inputController.getPurchase();

        lottoController.purchaseLottos(purchaseAmount);

        Lotto winningLotto = inputController.getWinning();

        int bonusNumber = inputController.getBonus();

        lottoController.showResult(winningLotto, bonusNumber);
    }
}

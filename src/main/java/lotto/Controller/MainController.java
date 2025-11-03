package lotto.Controller;


public class MainController {
    InputController inputController = new InputController();

    public void run(){
        inputController.getPurchase();

        inputController.getWinning();

        inputController.getBonus();
    }
}

package lotto.Validater;

import lotto.Exception.ExceptionMessage;

public class PurchaseValid {
    public void valid(int amount){
        isPositive(amount);

        isCorrectUnit(amount);
    }
    private void isPositive(int amount){
        if(amount <= 0)
            throw new IllegalArgumentException(ExceptionMessage.IS_NOT_POSITIVE.getMessage());
    }

    private void isCorrectUnit(int amount){
        if((amount % 1000) > 0)
            throw new IllegalArgumentException(ExceptionMessage.INVALID_UNIT.getMessage());
    }
}

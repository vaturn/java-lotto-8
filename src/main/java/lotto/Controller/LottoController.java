package lotto.Controller;

import camp.nextstep.edu.missionutils.Randoms;
import lotto.Model.Lotto;

import java.util.ArrayList;
import java.util.List;

public class LottoController {
    List<Lotto> lottos = new ArrayList<>();

    public void purchaseLottos(int amount){
        for(int count = 0;count < amount;count++){
            lottos.add(new Lotto(pickRandomNumbers()));
        }
        showLottos(amount);
    }

    private void showLottos(int amount){
        System.out.println(amount + "개를 구매했습니다.");
        for(Lotto lotto: lottos){
            lotto.printLotto();
        }
    }

    private List<Integer> pickRandomNumbers(){
        return Randoms.pickUniqueNumbersInRange(1, 45, 6);
    }
}

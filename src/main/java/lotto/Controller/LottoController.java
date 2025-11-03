package lotto.Controller;

import camp.nextstep.edu.missionutils.Randoms;
import lotto.Model.Lotto;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class LottoController {
    List<Lotto> lottos = new ArrayList<>();

    public void purchaseLotto(int amount){

    }

    private List<Integer> pickRandomNumbers(){
        return Randoms.pickUniqueNumbersInRange(1, 45, 6);
    }
}

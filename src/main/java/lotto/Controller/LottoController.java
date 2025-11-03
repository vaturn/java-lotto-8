package lotto.Controller;

import camp.nextstep.edu.missionutils.Randoms;
import lotto.Model.Lotto;

import java.util.ArrayList;
import java.util.List;

public class LottoController {
    List<Lotto> lottos = new ArrayList<>();
    private static final int[] PRIZE_MONEY = {
            0, 0, 0, 5_000, 50_000, 1_500_000, 2_000_000_000
    };

    private static final int BONUS_PRIZE_MONEY = 30_000_000;

    public void purchaseLottos(int amount){
        for(int count = 0;count < amount;count++){
            lottos.add(new Lotto(pickRandomNumbers()));
        }
        showLottos(amount);
    }

    public void showResult(Lotto winningLotto, int bonusNumber){
        int[] matchCounts = calculateResult(winningLotto, bonusNumber);

        System.out.println("당첨 통계\n---------------------");
        System.out.printf("3개 일치 (%,d원) - %d개%n", PRIZE_MONEY[3], matchCounts[3]);
        System.out.printf("4개 일치 (%,d원) - %d개%n", PRIZE_MONEY[4], matchCounts[4]);
        System.out.printf("5개 일치 (%,d원) - %d개%n", PRIZE_MONEY[5], matchCounts[5]);
        System.out.printf("5개 일치, 보너스 볼 일치 (%,d원) - %d개%n", BONUS_PRIZE_MONEY, matchCounts[7]);
        System.out.printf("6개 일치 (%,d원) - %d개%n", PRIZE_MONEY[6], matchCounts[6]);
    }

    private int[] calculateResult(Lotto winningLotto, int bonusNumber){
        int[] matchCounts = new int[8];

        for(Lotto lotto: lottos){
            int countSameNumber = lotto.countOverlap(winningLotto.getNumbers());

            if(countSameNumber == 5 && lotto.getNumbers().contains(bonusNumber))
                countSameNumber = 7;

            matchCounts[countSameNumber]++;
        }

        return matchCounts;
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

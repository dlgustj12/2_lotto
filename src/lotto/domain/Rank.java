package lotto.domain;

import java.util.Arrays;

//1등부터 5등까지 당첨기준과 상금을 상수로 정의
public enum Rank {

    //Winning에서 등수 판별 시 이 로직 활용

    //1등
    FIRST(6, 2000000000, false),
    // 5개 번호 + 보너스 번호 일치
    SECOND(5, 30000000 ,true),
    THIRD(5, 1500000, false),
    FOURTH(4, 50000, false),
    FIFTH(3, 5000, false),

    // 당첨되지 않은 경우
    NONE(0, 0, false);

    //멤버변수 캡슐화
    private final int cnt;
    private final int money;
    private final boolean bonus;

    //생성자
    Rank(int cnt, int money, boolean bonus){
        this.cnt = cnt;
        this.money = money;
        this.bonus = bonus;
    }

    //우리 getter 친구들~
    public int getCnt(){
        return cnt;
    }
    public int getMoney(){
        return money;
    }
    public boolean getBonus(){
        return bonus;
    }


    public long IntToLong(){
        return (long)money;
    }
    public boolean isWinningRank(){
        return this.money > 0;

    }

    //Rank 반환 메서드
    public static Rank valueOf(int cnt, boolean bonus){

        for (Rank rank : values()) {
            if (rank.cnt == cnt && rank.bonus == bonus) {
                // 일치하는 등수를 찾으면 즉시 반환
                return rank;
            }
        }

        // 3. 일치하는 등수가 없으면 NONE 반환
        return NONE;
    }


}

package pairmatching.domain.pair;

import camp.nextstep.edu.missionutils.Randoms;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import pairmatching.domain.wooteco.Crew;

public class Matcher {
    public static Pairs getPairs(List<Crew> names){
        List<Crew> shuffledCrew = Randoms.shuffle(names);
        List<Pair> pairs = new ArrayList<>();

        int i = 0;
        // 2명씩 Pair 생성
        while (i + 2 <= shuffledCrew.size() - 1) { // 최소 3명이 남을 때까지만 처리
            pairs.add(new Pair(Arrays.asList(shuffledCrew.get(i), shuffledCrew.get(i + 1))));
            i += 2;
        }

        // 마지막 3명을 하나의 Pair로 처리
        if (i < shuffledCrew.size()) {
            pairs.add(new Pair(shuffledCrew.subList(i, shuffledCrew.size())));
        }
        return new Pairs(pairs);
    }
}

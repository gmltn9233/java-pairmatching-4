package pairmatching.service;

import pairmatching.domain.pair.WootecoPair;
import pairmatching.domain.wooteco.Wooteco;

public class PairMatchingService {
    private final Wooteco wooteco;
    private final WootecoPair wootecoPair;

    public PairMatchingService(Wooteco wooteco, WootecoPair wootecoPair){
        this.wooteco = wooteco;
        this.wootecoPair = wootecoPair;
    }

}

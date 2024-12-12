package pairmatching.common;

import pairmatching.controller.PairMatchingController;
import pairmatching.domain.pair.LevelPair;
import pairmatching.domain.pair.MissionPair;
import pairmatching.domain.pair.UniquePair;
import pairmatching.domain.pair.WootecoPair;
import pairmatching.domain.wooteco.Wooteco;

public class PairMatchingConfig {
    public PairMatchingController providePairMatchingController(){
        WootecoLoader wootecoLoader = new WootecoLoader();
        Wooteco wooteco = wootecoLoader.regisetWooteco();
        UniquePair uniquePair = new UniquePair();
        MissionPair missionPair = new MissionPair();
        LevelPair levelPair = new LevelPair(uniquePair,missionPair);
    }
}

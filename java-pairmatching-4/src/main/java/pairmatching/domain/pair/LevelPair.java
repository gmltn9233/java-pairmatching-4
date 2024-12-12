package pairmatching.domain.pair;

import java.util.List;
import pairmatching.domain.wooteco.Crew;
import pairmatching.domain.wooteco.Wooteco;
import pairmatching.dto.MatchingRequest;
import pairmatching.dto.YesOrNoRequest;
import pairmatching.view.InputView;

public class LevelPair {
    private final UniquePair uniquePair;
    private final MissionPair missionPair;
    public LevelPair(UniquePair uniquePair, MissionPair missionPair){
        this.uniquePair = uniquePair;
        this.missionPair = missionPair;
    }

    public void makePair(MatchingRequest matchingRequest, Wooteco wooteco){
        if(missionPair.hasPairs(matchingRequest)){
           YesOrNoRequest yesOrNoRequest = InputView.rematchRequest();
           if(yesOrNoRequest.getResponse()){
               List<Crew> crews = wooteco.getCrews(matchingRequest);
               Pairs pairs = Matcher.getPairs(crews);
               if(uniquePair.isUnique(pairs)){
                   uniquePair.addUniquePair(pairs);
                   missionPair.addPairs(pairs,matchingRequest);
               }
           }
        }
    }

}

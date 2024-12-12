package pairmatching.domain.pair;

import java.util.Map;
import pairmatching.common.enums.Level;
import pairmatching.domain.wooteco.Wooteco;
import pairmatching.dto.MatchingRequest;

public class CoursePair {
    private final Map<Level, LevelPair> coursePair;
    public CoursePair(Map<Level, LevelPair> coursePair){
        this.coursePair = coursePair;
    }

    public void makePair(MatchingRequest matchingRequest, Wooteco wooteco){
        Level level = matchingRequest.getLevel();
        if(!coursePair.containsKey(level)){
            coursePair.put(level,new LevelPair(new UniquePair(),new MissionPair()));
        }
        LevelPair levelPair = coursePair.get(level);
        levelPair.makePair(matchingRequest,wooteco);
    }
}

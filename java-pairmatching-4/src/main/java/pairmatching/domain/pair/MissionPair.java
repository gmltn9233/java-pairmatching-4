package pairmatching.domain.pair;

import java.util.LinkedHashMap;
import java.util.Map;
import pairmatching.dto.MatchingRequest;

public class MissionPair {
    private final Map<String, Pairs> missionPair;

    public MissionPair() {
        this.missionPair = new LinkedHashMap<>();
    }

    public boolean hasPairs(MatchingRequest matchingRequest) {
        String mission = matchingRequest.getMission();
        return missionPair.containsKey(mission);
    }

    public void addPairs(Pairs pairs, MatchingRequest matchingRequest){
        String mission = matchingRequest.getMission();
        missionPair.put(mission,pairs);
    }
}

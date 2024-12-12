package pairmatching.domain.pair;

import pairmatching.common.enums.Course;
import pairmatching.domain.wooteco.Wooteco;
import pairmatching.dto.MatchingRequest;

public class WootecoPair {
    private final CoursePair backendPair;
    private final CoursePair frontendPair;

    public WootecoPair(CoursePair backendPair, CoursePair frontendPair) {
        this.backendPair = backendPair;
        this.frontendPair = frontendPair;
    }

    public void makePair(MatchingRequest matchingRequest, Wooteco wooteco) {
        if (matchingRequest.getCourse().equals(Course.BACKEND)) {
            backendPair.makePair(matchingRequest, wooteco);
        }
        if (matchingRequest.getCourse().equals(Course.FRONTEND)){
            frontendPair.makePair(matchingRequest, wooteco);
        }
    }
}

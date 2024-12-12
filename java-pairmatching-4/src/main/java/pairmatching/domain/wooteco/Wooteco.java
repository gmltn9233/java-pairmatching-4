package pairmatching.domain.wooteco;

import java.util.List;
import java.util.Map;
import pairmatching.common.enums.Course;
import pairmatching.domain.wooteco.Crews;
import pairmatching.dto.MatchingRequest;

public class Wooteco {
    private final Map<Course, Crews> wooteco;

    public Wooteco(Map<Course,Crews> wooteco){
        this.wooteco = wooteco;
    }

    public List<Crew> getCrews(MatchingRequest matchingRequest){
        Course course = matchingRequest.getCourse();
        Crews crews = wooteco.get(course);
        return crews.getCrews();
    }
}

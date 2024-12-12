package pairmatching.domain;

import java.util.Map;
import pairmatching.common.enums.Course;

public class Wooteco {
    private final Map<Course,Crews> wooteco;

    public Wooteco(Map<Course,Crews> wooteco){
        this.wooteco = wooteco;
    }
}

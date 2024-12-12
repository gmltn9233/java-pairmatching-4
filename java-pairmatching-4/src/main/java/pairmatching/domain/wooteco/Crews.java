package pairmatching.domain.wooteco;

import java.util.ArrayList;
import java.util.List;
import pairmatching.domain.wooteco.Crew;

public class Crews {
    private final List<Crew> crews;
    public Crews(List<Crew> crews){
        this.crews = crews;
    }

    public List<Crew> getCrews(){
        return crews;
    }
}

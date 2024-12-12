package pairmatching.common;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import pairmatching.common.enums.Course;
import pairmatching.common.enums.FilePath;
import pairmatching.domain.wooteco.Crew;
import pairmatching.domain.wooteco.Crews;
import pairmatching.domain.wooteco.Wooteco;

public class WootecoLoader {
    public Wooteco regisetWooteco(){
        Map<Course,Crews> wooteco = new HashMap<>();
        Crews backendCrews = registerCrews(FilePath.BACKEND);
        Crews frontendCrews = registerCrews(FilePath.FRONTEND);
        wooteco.put(Course.BACKEND,backendCrews);
        wooteco.put(Course.FRONTEND,frontendCrews);
        return new Wooteco(wooteco);
    }

    private Crews registerCrews(FilePath filePath){
        List<String> names = FileReader.readFile(filePath);
        List<Crew> crews = registerCrew(names);
        return new Crews(crews);
    }

    private List<Crew> registerCrew(List<String> names){
        List<Crew> crews = new ArrayList<>();
        for(String name : names){
            Crew crew = new Crew(name);
            crews.add(crew);
        }
        return crews;
    }
}

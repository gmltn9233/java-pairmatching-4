package pairmatching.domain.pair;

import java.util.List;
import pairmatching.domain.wooteco.Crew;

public class Pair {
    private final List<Crew> pair;

    public Pair(List<Crew> pair) {
        this.pair = pair;
    }

    @Override
    public boolean equals(Object obj) {
        if(this == obj) return true;
        if(obj == null || getClass() != obj.getClass()) return false;
        Pair pair = (Pair) obj;
        return this.pair.equals(pair.pair);
    }

    @Override
    public String toString() {
        StringBuilder output = new StringBuilder();
        for(Crew crew : pair){
            output.append(crew + " : ");
        }
        output.setLength(output.length()-3);
        return output.toString();
    }
}

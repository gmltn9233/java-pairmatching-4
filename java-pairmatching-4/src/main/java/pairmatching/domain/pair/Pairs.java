package pairmatching.domain.pair;

import java.util.List;

public class Pairs {
    private final List<Pair> pairs;
    public Pairs(List<Pair> pairs){
        this.pairs = pairs;
    }

    public List<Pair> getPairs() {
        return pairs;
    }

    @Override
    public String toString() {
        StringBuilder output = new StringBuilder();
        for(Pair pair : pairs){
            output.append(pair.toString() + "\r\n");
        }
        return output.toString();
    }
}

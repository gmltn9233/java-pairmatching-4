package pairmatching.domain.pair;

import java.util.HashSet;
import java.util.Set;

public class UniquePair {
    private final Set<Pair> uniquePair;

    public UniquePair() {
        this.uniquePair = new HashSet<>();
    }

    public void addUniquePair(Pairs pairs){
        for(Pair pair : pairs.getPairs()){
            uniquePair.add(pair);
        }
    }
    public boolean isUnique(Pairs pairs) {
        for(Pair pair : pairs.getPairs()){
            if(uniquePair.contains(pair)){
                return false;
            }
        }
        return true;
    }

}

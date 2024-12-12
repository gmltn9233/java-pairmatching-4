package pairmatching.common.enums;

import java.util.Arrays;
import java.util.List;
import pairmatching.common.exception.LevelException;
import pairmatching.common.exception.MissionException;

public enum Level {
    LEVEL1("레벨1", Arrays.asList("자동차경주","로또","숫자야구게임")),
    LEVEL2("레벨2",Arrays.asList("장바구니","결제","지하철노선도")),
    LEVEL3("레벨3",Arrays.asList("")),
    LEVEL4("레벨4",Arrays.asList("성능개선","배포")),
    LEVEL5("레벨5",Arrays.asList(""));

    private final String level;
    private final List<String> missions;
    Level(String level, List<String> missions) {
        this.level = level;
        this.missions = missions;
    }

    public static String levelToString(){
        StringBuilder output = new StringBuilder();
        output.append("미션:\r\n");
        for(Level level : values()){
            output.append(level.toString());
        }
        output.setLength(output.length()-2);
        return output.toString();
    }

    public static Level from(String input){
        for(Level level : values()){
            if(level.level.equals(input)){
                return level;
            }
        }
        throw new LevelException("존재하지 않는 레벨입니다.");
    }

    public static String from(String input, Level level){
        for(String mission : level.missions){
            if(mission.equals(input)){
                return mission;
            }
        }
        throw new MissionException("존재하지 않는 미션입니다.");
    }
    @Override
    public String toString() {
        StringBuilder output = new StringBuilder();
        output.append("  - "+ level + ": ");
        for(String mission : missions){
            output.append(mission +" | ");
        }
        output.setLength(output.length()-3);
        output.append("\r\n");
        return output.toString();
    }
}

package pairmatching.dto;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import pairmatching.common.enums.Course;
import pairmatching.common.enums.Level;
import pairmatching.common.exception.InputException;

public class MatchingRequest {
    private final Course course;
    private final Level level;
    private final String mission;

    public MatchingRequest(String input){
        List<String> parsedInput = parse(input);
        valid(parsedInput);
        this.course = Course.from(parsedInput.get(0));
        this.level = Level.from(parsedInput.get(1));
        this.mission = Level.from(parsedInput.get(2),level);
    }

    public Course getCourse() {
        return course;
    }

    public Level getLevel() {
        return level;
    }

    public String getMission() {
        return mission;
    }

    private List<String> parse(String input){
        String[] tokens = input.split(",");
        List<String> output = new ArrayList<>();
        Collections.addAll(output,tokens);
        return output;
    }

    private void valid(List<String> input){
        if(input.size()!=3){
            throw new InputException("올바르지 않은 입력입니다.");
        }
    }

}

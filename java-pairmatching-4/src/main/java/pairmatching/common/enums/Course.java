package pairmatching.common.enums;

import pairmatching.common.exception.CourseException;

public enum Course {
    BACKEND("백엔드"),
    FRONTEND("프론트엔드");

    private final String name;

    Course(String name){
        this.name = name;
    }

    public static Course from(String input){
        for(Course course : values()){
            if(course.name.equals(input)){
                return course;
            }
        }
        throw new CourseException("존재하지 않는 코스입니다.");
    }

    public static String courseToString(){
        StringBuilder output = new StringBuilder();
        output.append("과정: ");
        for(Course course : values()){
            output.append(course.name + " | ");
        }
        output.setLength(output.length()-3);
        return output.toString();
    }
}

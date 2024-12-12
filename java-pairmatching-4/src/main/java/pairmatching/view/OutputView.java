package pairmatching.view;

import pairmatching.common.enums.Course;
import pairmatching.common.enums.Level;

public class OutputView {

    public static void printMenu(){
        System.out.println("기능을 선택하세요.");
        System.out.println("1. 페어 매칭");
        System.out.println("2. 페어 조회");
        System.out.println("3. 페어 초기화");
        System.out.println("Q. 종료");
    }

    public static void printMatching(){
        System.out.println("과정, 레벨, 미션을 선택하세요.");
        System.out.println("ex) 백엔드, 레벨1, 자동차경주");
    }

    public static void printRematching(){
        System.out.println("매칭 정보가 있습니다. 다시 매칭하시겠습니까?");
        System.out.println("네 | 아니오");
    }
    public static void printCourseAndMissions(){
        printSharp();
        System.out.println(Course.courseToString());
        System.out.println(Level.levelToString());
        printSharp();
    }

    private static void printSharp(){
        System.out.println("#############################################");
    }
}
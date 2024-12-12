package pairmatching.view;

import camp.nextstep.edu.missionutils.Console;
import pairmatching.dto.MatchingRequest;
import pairmatching.dto.MenuRequest;
import pairmatching.dto.YesOrNoRequest;

public class InputView {
    public static MenuRequest menuRequest(){
        OutputView.printMenu();
        return new MenuRequest(Console.readLine());
    }

    public static MatchingRequest matchingRequest(){
        OutputView.printMatching();
        return new MatchingRequest(Console.readLine());
    }

    public static YesOrNoRequest rematchRequest(){
        OutputView.printRematching();
        return new YesOrNoRequest(Console.readLine());
    }

}

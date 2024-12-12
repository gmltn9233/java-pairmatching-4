package pairmatching.controller;

import pairmatching.common.enums.Menu;
import pairmatching.common.exception.PairMatchingException;
import pairmatching.dto.MatchingRequest;
import pairmatching.dto.MenuRequest;
import pairmatching.service.PairMatchingService;
import pairmatching.view.InputView;
import pairmatching.view.OutputView;

public class PairMatchingController {

    private final PairMatchingService pairMatchingService;
    public PairMatchingController(PairMatchingService pairMatchingService){
        this.pairMatchingService = pairMatchingService;
    }
    public void matchingStart(){
        while(true){
            MenuRequest menuRequest = getMenu();
            if(isExit(menuRequest)){
                break;
            }
            menuOption(menuRequest);
        }
    }

    private MenuRequest getMenu(){
        while(true){
            try{
                return InputView.menuRequest();
            }catch (PairMatchingException e){
                System.out.println(e.getMessage());
            }
        }
    }

    private void menuOption(MenuRequest menuRequest){
        if(menuRequest.equals(Menu.페어매칭)){

        }
        if(menuRequest.equals(Menu.페어조회)){

        }
        if(menuRequest.equals(Menu.페어초기화)){

        }

    }

    private void pairMatching(){
        OutputView.printCourseAndMissions();
        MatchingRequest matchingRequest = getMatching();
    }

    private MatchingRequest getMatching(){
        while(true){
            try{
                return InputView.matchingRequest();
            }catch (PairMatchingException e){
                System.out.println(e.getMessage());
            }
        }
    }

    private boolean isExit(MenuRequest menuRequest){
        return menuRequest.equals(Menu.종료);
    }
}

package pairmatching.dto;

import pairmatching.common.exception.InputException;

public class YesOrNoRequest {
    private final boolean response;
    public YesOrNoRequest(String response){
        valid(response);
        this.response = isYes(response);
    }

    public boolean getResponse(){
        return this.response;
    }

    private void valid(String response){
        if(!response.equals("네") && !response.equals("아니오")){
            throw new InputException("응답은 예 혹은 아니오 입니다.");
        }
    }

    private boolean isYes(String response){
        return response.equals("네");
    }
}

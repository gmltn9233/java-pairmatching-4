package pairmatching.dto;

import pairmatching.common.enums.Menu;

public class MenuRequest {
    private final Menu menu;
    public MenuRequest(String input){
        this.menu = Menu.from(input);
    }
}

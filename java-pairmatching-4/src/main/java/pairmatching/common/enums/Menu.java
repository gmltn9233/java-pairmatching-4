package pairmatching.common.enums;

import pairmatching.common.exception.MenuException;

public enum Menu {
    페어매칭("1"),
    페어조회("2"),
    페어초기화("3"),
    종료("Q");
    private final String menu;
    Menu(String menu){
        this.menu = menu;
    }

    public static Menu from(String input){
        for(Menu menu : values()){
            if(menu.menu.equals(input)){
                return menu;
            }
        }
        throw new MenuException("1,2,3,Q 명령어 중 선택하십시오.");
    }
}

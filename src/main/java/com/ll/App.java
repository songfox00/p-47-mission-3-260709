package com.ll;

import com.ll.global.AppContext;
import com.ll.wiseSaying.controller.WiseSayingController;

import java.util.Scanner;

public class App {

    Scanner sc;
    String cmd = "";
    WiseSayingController wiseSayingController = AppContext.wiseSayingController;

    public App(){
        this.sc =AppContext.sc;
    }

    public void run(){
        System.out.println("== 명언 앱 ==");

        while (!cmd.equals("종료")) {

            System.out.print("명령) ");
            cmd = sc.nextLine();

            if (cmd.equals("등록")) {
                wiseSayingController.actionWrite();
            } else if (cmd.equals("목록")) {
                wiseSayingController.actionList();
            } else if(cmd.startsWith("삭제")){
                wiseSayingController.actionDelete(cmd);
            } else if(cmd.startsWith("수정")){
                wiseSayingController.actionModify(cmd);
            }
        }
    }


}

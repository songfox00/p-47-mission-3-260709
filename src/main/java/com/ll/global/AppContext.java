package com.ll.global;

import com.ll.wiseSaying.controller.WiseSayingController;
import com.ll.wiseSaying.repository.WiseSayingRepository;
import com.ll.wiseSaying.service.WiseSayingService;

import java.util.Scanner;

public class AppContext {
    public static Scanner sc = new Scanner(System.in);

    public static WiseSayingRepository wiseSayingRepository = new WiseSayingRepository();
    public static WiseSayingService wiseSayingService = new WiseSayingService();
    public static WiseSayingController wiseSayingController = new WiseSayingController();

    public static void init(Scanner _sc){
        AppContext.sc = _sc;
        AppContext.wiseSayingRepository = new WiseSayingRepository();
        AppContext.wiseSayingService = new WiseSayingService();
        AppContext.wiseSayingController = new WiseSayingController();
    }

    public static void init() {
        init(new Scanner(System.in));
    }
}

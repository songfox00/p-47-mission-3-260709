package com.ll;

import com.ll.global.AppContext;

public class Main {
    static void main(String[] args) {
        AppContext.init();
        App app = new App();
        app.run();
    }
}

package com.glqdlt.ex.algorithm.stack;

import java.util.Scanner;

public class ExitButton extends Button implements ButtonAction {

    public ExitButton(Scanner scanner) {
        super(scanner);
    }

    @Override
    public void click() {
        System.out.println("종료");
        super.getScanner().close();
    }
}

package com.glqdlt.ex.algorithm.stack;

import java.util.Scanner;

public class InsertButton extends TextButton implements ButtonAction {
    InsertButton(Scanner scanner, SimpleTextEditor simpleTextEditor) {
        super(scanner, simpleTextEditor);
    }

    @Override
    final public void click() {
        System.out.println("문자를 입력하세요.");
        String t = super.getScanner().nextLine();
        super.getSimpleTextEditor().insert(t);
    }
}

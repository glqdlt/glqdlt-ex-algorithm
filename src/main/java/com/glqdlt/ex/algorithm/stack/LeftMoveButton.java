package com.glqdlt.ex.algorithm.stack;

import java.util.Scanner;

public class LeftMoveButton extends TextButton implements ButtonAction {
    public LeftMoveButton(Scanner scanner, SimpleTextEditor simpleTextEditor) {
        super(scanner, simpleTextEditor);
    }

    @Override
    final public void click() {
        System.out.println("왼쪽으로 이동");
        super.getSimpleTextEditor().moveToLeft();
    }
}

package com.glqdlt.ex.algorithm.stack;

import java.util.Scanner;

public class RightMoveButton extends TextButton implements ButtonAction {
    public RightMoveButton(Scanner scanner, SimpleTextEditor simpleTextEditor) {
        super(scanner, simpleTextEditor);
    }

    @Override
    final public void click() {
        System.out.println("오른쪽으로 이동");
        super.getSimpleTextEditor().moveToRight();
    }
}

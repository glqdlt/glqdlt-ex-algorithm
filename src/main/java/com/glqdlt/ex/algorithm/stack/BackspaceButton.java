package com.glqdlt.ex.algorithm.stack;

import java.util.Scanner;

public class BackspaceButton extends TextButton implements ButtonAction {
    BackspaceButton(Scanner scanner, SimpleTextEditor simpleTextEditor) {
        super(scanner, simpleTextEditor);
    }

    @Override
    final public void click() {
        System.out.println("현재 위치 좌측 글자 삭제");
        super.getSimpleTextEditor().backspace();
    }
}

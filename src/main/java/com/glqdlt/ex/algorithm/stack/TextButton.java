package com.glqdlt.ex.algorithm.stack;

import java.util.Scanner;

public class TextButton extends Button {
    private SimpleTextEditor simpleTextEditor;

    SimpleTextEditor getSimpleTextEditor() {
        return simpleTextEditor;
    }

    TextButton(Scanner scanner, SimpleTextEditor simpleTextEditor) {
        super(scanner);
        this.simpleTextEditor = simpleTextEditor;
    }
}

package com.glqdlt.ex.algorithm.stack;

import java.util.Arrays;
import java.util.Stack;

/**
 * 어떠한 에디터가 있다고 가정한다.
 * 에디터의 입력창에 문자abd 가 있고 마지막 글자 뒤에 커서가 있다.
 * 예) abd_
 * [특수 기능 1]← 키를 누르면 커서는 좌측으로 이동한다.
 * 예) ab_d
 * [특수 기능 2]→ 키를 누르면 커서는 우측으로 이동한다.
 * 예) abd_
 * [특수 기능 3]insert 키를 누르고 글자를 입력하면 커서 좌측에 삽입 된다.
 * 예) abde_
 * [특수 기능 4]backspace 키를 누르면 커서 좌측 글자가 삭제 된다.
 * 예) abd_
 * [특수 기능 5]delete 키를 누르면 커서 우측 글자가 삭제 된다.
 * 예) abd_
 * 예) ab_d
 * 예) ab_
 * 각 특수 기능을 입력하시오.
 *
 * @author glqdlt
 */
public class SimpleTextEditor {

    private final Stack<String> left = new Stack<>();
    private final Stack<String> right = new Stack<>();


    public String getText() {
        String a = String.join("", left);
        StringBuilder b = new StringBuilder();
        for (int i = right.size() - 1; i >= 0; i--) {
            b.append(right.get(i));
        }
        return a + b;
    }


    public SimpleTextEditor(String text) {
        String[] rr = text.split("");
        this.left.addAll(Arrays.asList(rr));
    }

    public Integer getCursorIndex() {
        return this.left.size();
    }

    public void moveToLeft() {
        if (this.left.size() == 0) {
            return;
        }
        String p = this.left.pop();
        this.right.add(p);
    }

    public void moveToRight() {
        if (this.right.size() == 0) {
            return;
        }
        String p = this.right.pop();
        this.left.add(p);
    }

    public void insert(String e) {
        this.left.addAll(Arrays.asList(e.split("")));
    }

    public void backspace() {
        if (this.left.size() == 0) {
            return;
        }
        this.left.pop();
    }

    public void delete() {
        if (this.right.size() == 0) {
            return;
        }
        this.right.pop();
    }
}

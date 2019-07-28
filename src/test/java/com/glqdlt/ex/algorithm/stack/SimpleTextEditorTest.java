package com.glqdlt.ex.algorithm.stack;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class SimpleTextEditorTest {


    private SimpleTextEditor simpleTextEditor;

    @Before
    public void setUp() throws Exception {
        this.simpleTextEditor = new SimpleTextEditor("abc");
    }

    @Test
    public void textInit() {
        Assert.assertEquals("abc", simpleTextEditor.getText());
    }

    @Test
    public void cursorPoint() {
        Assert.assertEquals(3, (long) simpleTextEditor.getCursorIndex());
    }

    @Test
    public void movement() {
        cursorPoint();
        simpleTextEditor.moveToLeft();
        Assert.assertEquals(2, (long) simpleTextEditor.getCursorIndex());
        Assert.assertEquals("abc", simpleTextEditor.getText());
        simpleTextEditor.moveToLeft();
        Assert.assertEquals(1, (long) simpleTextEditor.getCursorIndex());
        Assert.assertEquals("abc", simpleTextEditor.getText());
        simpleTextEditor.moveToLeft();
        Assert.assertEquals(0, (long) simpleTextEditor.getCursorIndex());
        Assert.assertEquals("abc", simpleTextEditor.getText());
        simpleTextEditor.moveToRight();
        Assert.assertEquals(1, (long) simpleTextEditor.getCursorIndex());
        Assert.assertEquals("abc", simpleTextEditor.getText());
    }

    @Test
    public void moveRightMax() {
        simpleTextEditor.moveToRight();
        Assert.assertEquals("abc", simpleTextEditor.getText());
        Assert.assertEquals(3, (long) simpleTextEditor.getCursorIndex());
    }

    @Test
    public void insert() {
        Assert.assertEquals("abc", simpleTextEditor.getText());
        Assert.assertEquals(3, (long) simpleTextEditor.getCursorIndex());
        simpleTextEditor.insert("e");
        Assert.assertEquals("abce", simpleTextEditor.getText());
        Assert.assertEquals(4, (long) simpleTextEditor.getCursorIndex());
        simpleTextEditor.insert("e");
        Assert.assertEquals("abcee", simpleTextEditor.getText());
        Assert.assertEquals(5, (long) simpleTextEditor.getCursorIndex());
    }

    @Test
    public void remove() {
        simpleTextEditor.backspace();
        Assert.assertEquals("ab", simpleTextEditor.getText());
        Assert.assertEquals(2, (long) simpleTextEditor.getCursorIndex());
        simpleTextEditor.moveToLeft();
        Assert.assertEquals("ab", simpleTextEditor.getText());
        Assert.assertEquals(1, (long) simpleTextEditor.getCursorIndex());
        simpleTextEditor.moveToLeft();
        Assert.assertEquals("ab", simpleTextEditor.getText());
        Assert.assertEquals(0, (long) simpleTextEditor.getCursorIndex());
        simpleTextEditor.delete();
        Assert.assertEquals("b", simpleTextEditor.getText());
        Assert.assertEquals(0, (long) simpleTextEditor.getCursorIndex());
        simpleTextEditor.insert("c");
        Assert.assertEquals("cb", simpleTextEditor.getText());
        Assert.assertEquals(1, (long) simpleTextEditor.getCursorIndex());
    }
}
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
}
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

}
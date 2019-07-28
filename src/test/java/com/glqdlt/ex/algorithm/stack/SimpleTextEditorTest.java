package com.glqdlt.ex.algorithm.stack;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class SimpleTextEditorTest {

    @Test
    public void textInit() {
        SimpleTextEditor simpleTextEditor = new SimpleTextEditor("abc");
        Assert.assertEquals("abc", simpleTextEditor.getText());
    }


}
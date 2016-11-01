package com.github.shareme.greenmaterialiconics.library_core.utils;

import android.text.SpannableStringBuilder;

import java.util.LinkedList;

public class TextStyleContainer {
    public SpannableStringBuilder spannableStringBuilder;
    public LinkedList<StyleContainer> styleContainers;

    public TextStyleContainer(SpannableStringBuilder spannableStringBuilder, LinkedList<StyleContainer> styleContainers) {
        this.spannableStringBuilder = spannableStringBuilder;
        this.styleContainers = styleContainers;
    }
}
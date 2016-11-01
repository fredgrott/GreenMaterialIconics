package com.github.shareme.greenmaterialiconics.library_core.view;

import android.content.Context;
import android.support.v7.widget.AppCompatButton;
import android.util.AttributeSet;

import com.github.shareme.greenmaterialiconics.library_core.Iconics;

@SuppressWarnings("unused")
public class IconicsCompatButton extends AppCompatButton {

    public IconicsCompatButton(Context context) {
        super(context);
    }

    public IconicsCompatButton(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    public IconicsCompatButton(Context context, AttributeSet attrs, int defStyle) {
        super(context, attrs, defStyle);
    }

    @Override
    public void setText(CharSequence text, BufferType type) {
        // NOTES:
        // 1. Need to disable the All Caps option to make Spannable work properly!
        // 2. This method will be called from the constructor of the super class
        setAllCaps(false);

        if (!isInEditMode()) {
            super.setText(new Iconics.IconicsBuilder().ctx(getContext()).on(text).build(), type);
        } else {
            super.setText(text, type);
        }
    }
}
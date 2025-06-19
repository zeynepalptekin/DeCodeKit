package com.google.android.material.textfield;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Point;
import android.graphics.Rect;
import android.os.Build;
import android.text.Editable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import androidx.annotation.h0;
import androidx.annotation.i0;
import androidx.appcompat.widget.l;
import c.a.b.c.a;
import com.google.android.material.internal.s;

/* loaded from: classes.dex */
public class TextInputEditText extends l {
    private final Rect g;
    private boolean h;

    public TextInputEditText(@h0 Context context) {
        this(context, null);
    }

    public TextInputEditText(@h0 Context context, @i0 AttributeSet attributeSet) {
        this(context, attributeSet, a.c.editTextStyle);
    }

    public TextInputEditText(@h0 Context context, @i0 AttributeSet attributeSet, int r11) {
        super(com.google.android.material.theme.a.a.c(context, attributeSet, r11, 0), attributeSet, r11);
        this.g = new Rect();
        TypedArray typedArrayJ = s.j(context, attributeSet, a.o.TextInputEditText, r11, a.n.Widget_Design_TextInputEditText, new int[0]);
        setTextInputLayoutFocusedRectEnabled(typedArrayJ.getBoolean(a.o.TextInputEditText_textInputLayoutFocusedRectEnabled, false));
        typedArrayJ.recycle();
    }

    @h0
    private String a(@h0 TextInputLayout textInputLayout) {
        Editable text = getText();
        CharSequence hint = textInputLayout.getHint();
        CharSequence helperText = textInputLayout.getHelperText();
        CharSequence error = textInputLayout.getError();
        boolean z = !TextUtils.isEmpty(text);
        boolean z2 = !TextUtils.isEmpty(hint);
        boolean z3 = !TextUtils.isEmpty(helperText);
        boolean z4 = !TextUtils.isEmpty(error);
        String str = "";
        String string = z2 ? hint.toString() : "";
        StringBuilder sb = new StringBuilder();
        sb.append(string);
        sb.append(((z4 || z3) && !TextUtils.isEmpty(string)) ? ", " : "");
        String string2 = sb.toString();
        StringBuilder sb2 = new StringBuilder();
        sb2.append(string2);
        if (z4) {
            helperText = error;
        } else if (!z3) {
            helperText = "";
        }
        sb2.append((Object) helperText);
        String string3 = sb2.toString();
        if (!z) {
            return !TextUtils.isEmpty(string3) ? string3 : "";
        }
        StringBuilder sb3 = new StringBuilder();
        sb3.append((Object) text);
        if (!TextUtils.isEmpty(string3)) {
            str = ", " + string3;
        }
        sb3.append(str);
        return sb3.toString();
    }

    @i0
    private CharSequence getHintFromLayout() {
        TextInputLayout textInputLayout = getTextInputLayout();
        if (textInputLayout != null) {
            return textInputLayout.getHint();
        }
        return null;
    }

    @i0
    private TextInputLayout getTextInputLayout() {
        for (ViewParent parent = getParent(); parent instanceof View; parent = parent.getParent()) {
            if (parent instanceof TextInputLayout) {
                return (TextInputLayout) parent;
            }
        }
        return null;
    }

    public boolean b() {
        return this.h;
    }

    @Override // android.widget.TextView, android.view.View
    public void getFocusedRect(@i0 Rect rect) {
        super.getFocusedRect(rect);
        TextInputLayout textInputLayout = getTextInputLayout();
        if (textInputLayout == null || !this.h || rect == null) {
            return;
        }
        textInputLayout.getFocusedRect(this.g);
        rect.bottom = this.g.bottom;
    }

    @Override // android.view.View
    public boolean getGlobalVisibleRect(@i0 Rect rect, @i0 Point point) {
        boolean globalVisibleRect = super.getGlobalVisibleRect(rect, point);
        TextInputLayout textInputLayout = getTextInputLayout();
        if (textInputLayout != null && this.h && rect != null) {
            textInputLayout.getGlobalVisibleRect(this.g, point);
            rect.bottom = this.g.bottom;
        }
        return globalVisibleRect;
    }

    @Override // android.widget.TextView
    @i0
    public CharSequence getHint() {
        TextInputLayout textInputLayout = getTextInputLayout();
        return (textInputLayout == null || !textInputLayout.X()) ? super.getHint() : textInputLayout.getHint();
    }

    @Override // android.widget.TextView, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        TextInputLayout textInputLayout = getTextInputLayout();
        if (textInputLayout != null && textInputLayout.X() && super.getHint() == null && com.google.android.material.internal.g.c()) {
            setHint("");
        }
    }

    @Override // androidx.appcompat.widget.l, android.widget.TextView, android.view.View
    @i0
    public InputConnection onCreateInputConnection(@h0 EditorInfo editorInfo) {
        InputConnection inputConnectionOnCreateInputConnection = super.onCreateInputConnection(editorInfo);
        if (inputConnectionOnCreateInputConnection != null && editorInfo.hintText == null) {
            editorInfo.hintText = getHintFromLayout();
        }
        return inputConnectionOnCreateInputConnection;
    }

    @Override // android.view.View
    public void onInitializeAccessibilityNodeInfo(@h0 AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        TextInputLayout textInputLayout = getTextInputLayout();
        if (Build.VERSION.SDK_INT >= 23 || textInputLayout == null) {
            return;
        }
        accessibilityNodeInfo.setText(a(textInputLayout));
    }

    @Override // android.view.View
    public boolean requestRectangleOnScreen(@i0 Rect rect) {
        boolean zRequestRectangleOnScreen = super.requestRectangleOnScreen(rect);
        TextInputLayout textInputLayout = getTextInputLayout();
        if (textInputLayout != null && this.h) {
            this.g.set(0, textInputLayout.getHeight() - getResources().getDimensionPixelOffset(a.f.mtrl_edittext_rectangle_top_offset), textInputLayout.getWidth(), textInputLayout.getHeight());
            textInputLayout.requestRectangleOnScreen(this.g, true);
        }
        return zRequestRectangleOnScreen;
    }

    public void setTextInputLayoutFocusedRectEnabled(boolean z) {
        this.h = z;
    }
}

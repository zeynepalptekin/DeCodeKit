package com.google.android.material.appbar;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import androidx.annotation.h0;
import androidx.annotation.i0;
import androidx.annotation.m0;
import androidx.appcompat.widget.Toolbar;
import b.i.p.f0;
import c.a.b.c.a;
import c.a.b.c.u.j;
import c.a.b.c.u.k;

/* loaded from: classes.dex */
public class MaterialToolbar extends Toolbar {
    private static final int T = a.n.Widget_MaterialComponents_Toolbar;

    public MaterialToolbar(@h0 Context context) {
        this(context, null);
    }

    public MaterialToolbar(@h0 Context context, @i0 AttributeSet attributeSet) {
        this(context, attributeSet, a.c.toolbarStyle);
    }

    public MaterialToolbar(@h0 Context context, @i0 AttributeSet attributeSet, int r4) {
        super(com.google.android.material.theme.a.a.c(context, attributeSet, r4, T), attributeSet, r4);
        S(getContext());
    }

    private void S(Context context) {
        Drawable background = getBackground();
        if (background == null || (background instanceof ColorDrawable)) {
            j jVar = new j();
            jVar.n0(ColorStateList.valueOf(background != null ? ((ColorDrawable) background).getColor() : 0));
            jVar.Y(context);
            jVar.m0(f0.P(this));
            f0.B1(this, jVar);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        k.e(this);
    }

    @Override // android.view.View
    @m0(21)
    public void setElevation(float f) {
        super.setElevation(f);
        k.d(this, f);
    }
}

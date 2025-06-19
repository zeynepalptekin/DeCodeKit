package com.google.android.material.tabs;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import androidx.appcompat.widget.a1;
import c.a.b.c.a;

/* loaded from: classes.dex */
public class a extends View {
    public final CharSequence d;
    public final Drawable e;
    public final int f;

    public a(Context context) {
        this(context, null);
    }

    public a(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        a1 a1VarF = a1.F(context, attributeSet, a.o.TabItem);
        this.d = a1VarF.x(a.o.TabItem_android_text);
        this.e = a1VarF.h(a.o.TabItem_android_icon);
        this.f = a1VarF.u(a.o.TabItem_android_layout, 0);
        a1VarF.I();
    }
}

package com.google.android.material.internal;

import android.annotation.SuppressLint;
import android.content.Context;
import android.util.AttributeSet;
import android.widget.ImageButton;
import androidx.annotation.p0;

@SuppressLint({"AppCompatCustomView"})
@p0({p0.a.LIBRARY_GROUP})
/* loaded from: classes.dex */
public class a0 extends ImageButton {
    private int d;

    public a0(Context context) {
        this(context, null);
    }

    public a0(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public a0(Context context, AttributeSet attributeSet, int r3) {
        super(context, attributeSet, r3);
        this.d = getVisibility();
    }

    public final void c(int r1, boolean z) {
        super.setVisibility(r1);
        if (z) {
            this.d = r1;
        }
    }

    public final int getUserSetVisibility() {
        return this.d;
    }

    @Override // android.widget.ImageView, android.view.View
    public void setVisibility(int r2) {
        c(r2, true);
    }
}

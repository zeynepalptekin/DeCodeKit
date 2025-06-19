package com.google.android.gms.ads.d0;

import android.annotation.TargetApi;
import android.content.Context;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import android.widget.ImageView;
import com.google.android.gms.internal.ads.u2;
import com.google.android.gms.internal.ads.w2;

/* loaded from: classes.dex */
public class b extends FrameLayout {
    private com.google.android.gms.ads.o d;
    private boolean e;
    private u2 f;
    private ImageView.ScaleType g;
    private boolean h;
    private w2 i;

    public b(Context context) {
        super(context);
    }

    public b(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public b(Context context, AttributeSet attributeSet, int r3) {
        super(context, attributeSet, r3);
    }

    @TargetApi(21)
    public b(Context context, AttributeSet attributeSet, int r3, int r4) {
        super(context, attributeSet, r3, r4);
    }

    protected final synchronized void a(u2 u2Var) {
        this.f = u2Var;
        if (this.e) {
            u2Var.a(this.d);
        }
    }

    protected final synchronized void b(w2 w2Var) {
        this.i = w2Var;
        if (this.h) {
            w2Var.a(this.g);
        }
    }

    public void setImageScaleType(ImageView.ScaleType scaleType) {
        this.h = true;
        this.g = scaleType;
        w2 w2Var = this.i;
        if (w2Var != null) {
            w2Var.a(scaleType);
        }
    }

    public void setMediaContent(com.google.android.gms.ads.o oVar) {
        this.e = true;
        this.d = oVar;
        u2 u2Var = this.f;
        if (u2Var != null) {
            u2Var.a(oVar);
        }
    }
}

package com.google.android.material.textfield;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.view.View;
import androidx.annotation.h0;
import androidx.annotation.i0;
import c.a.b.c.u.j;
import c.a.b.c.u.o;

/* loaded from: classes.dex */
class c extends j {

    @h0
    private final Paint G;

    @h0
    private final RectF H;
    private int I;

    c() {
        this(null);
    }

    c(@i0 o oVar) {
        super(oVar == null ? new o() : oVar);
        this.G = new Paint(1);
        V0();
        this.H = new RectF();
    }

    private void P0(@h0 Canvas canvas) {
        if (W0(getCallback())) {
            return;
        }
        canvas.restoreToCount(this.I);
    }

    private void Q0(@h0 Canvas canvas) {
        Drawable.Callback callback = getCallback();
        if (!W0(callback)) {
            S0(canvas);
            return;
        }
        View view = (View) callback;
        if (view.getLayerType() != 2) {
            view.setLayerType(2, null);
        }
    }

    private void S0(@h0 Canvas canvas) {
        this.I = Build.VERSION.SDK_INT >= 21 ? canvas.saveLayer(0.0f, 0.0f, canvas.getWidth(), canvas.getHeight(), null) : canvas.saveLayer(0.0f, 0.0f, canvas.getWidth(), canvas.getHeight(), null, 31);
    }

    private void V0() {
        this.G.setStyle(Paint.Style.FILL_AND_STROKE);
        this.G.setColor(-1);
        this.G.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OUT));
    }

    private boolean W0(Drawable.Callback callback) {
        return callback instanceof View;
    }

    boolean O0() {
        return !this.H.isEmpty();
    }

    void R0() {
        T0(0.0f, 0.0f, 0.0f, 0.0f);
    }

    void T0(float f, float f2, float f3, float f4) {
        RectF rectF = this.H;
        if (f == rectF.left && f2 == rectF.top && f3 == rectF.right && f4 == rectF.bottom) {
            return;
        }
        this.H.set(f, f2, f3, f4);
        invalidateSelf();
    }

    void U0(@h0 RectF rectF) {
        T0(rectF.left, rectF.top, rectF.right, rectF.bottom);
    }

    @Override // c.a.b.c.u.j, android.graphics.drawable.Drawable
    public void draw(@h0 Canvas canvas) {
        Q0(canvas);
        super.draw(canvas);
        canvas.drawRect(this.H, this.G);
        P0(canvas);
    }
}

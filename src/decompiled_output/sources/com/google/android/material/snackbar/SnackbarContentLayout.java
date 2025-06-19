package com.google.android.material.snackbar;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.h0;
import androidx.annotation.i0;
import androidx.annotation.p0;
import b.i.p.f0;
import c.a.b.c.a;

@p0({p0.a.LIBRARY_GROUP})
/* loaded from: classes.dex */
public class SnackbarContentLayout extends LinearLayout implements a {
    private TextView d;
    private Button e;
    private int f;
    private int g;

    public SnackbarContentLayout(@h0 Context context) {
        this(context, null);
    }

    public SnackbarContentLayout(@h0 Context context, @i0 AttributeSet attributeSet) {
        super(context, attributeSet);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, a.o.SnackbarLayout);
        this.f = typedArrayObtainStyledAttributes.getDimensionPixelSize(a.o.SnackbarLayout_android_maxWidth, -1);
        this.g = typedArrayObtainStyledAttributes.getDimensionPixelSize(a.o.SnackbarLayout_maxActionInlineWidth, -1);
        typedArrayObtainStyledAttributes.recycle();
    }

    private static void d(@h0 View view, int r3, int r4) {
        if (f0.T0(view)) {
            f0.V1(view, f0.h0(view), r3, f0.g0(view), r4);
        } else {
            view.setPadding(view.getPaddingLeft(), r3, view.getPaddingRight(), r4);
        }
    }

    private boolean e(int r3, int r4, int r5) {
        boolean z;
        if (r3 != getOrientation()) {
            setOrientation(r3);
            z = true;
        } else {
            z = false;
        }
        if (this.d.getPaddingTop() == r4 && this.d.getPaddingBottom() == r5) {
            return z;
        }
        d(this.d, r4, r5);
        return true;
    }

    @Override // com.google.android.material.snackbar.a
    public void a(int r8, int r9) {
        this.d.setAlpha(0.0f);
        long j = r9;
        long j2 = r8;
        this.d.animate().alpha(1.0f).setDuration(j).setStartDelay(j2).start();
        if (this.e.getVisibility() == 0) {
            this.e.setAlpha(0.0f);
            this.e.animate().alpha(1.0f).setDuration(j).setStartDelay(j2).start();
        }
    }

    @Override // com.google.android.material.snackbar.a
    public void b(int r8, int r9) {
        this.d.setAlpha(1.0f);
        long j = r9;
        long j2 = r8;
        this.d.animate().alpha(0.0f).setDuration(j).setStartDelay(j2).start();
        if (this.e.getVisibility() == 0) {
            this.e.setAlpha(1.0f);
            this.e.animate().alpha(0.0f).setDuration(j).setStartDelay(j2).start();
        }
    }

    void c(float f) {
        if (f != 1.0f) {
            this.e.setTextColor(c.a.b.c.i.a.g(c.a.b.c.i.a.d(this, a.c.colorSurface), this.e.getCurrentTextColor(), f));
        }
    }

    public Button getActionView() {
        return this.e;
    }

    public TextView getMessageView() {
        return this.d;
    }

    @Override // android.view.View
    protected void onFinishInflate() {
        super.onFinishInflate();
        this.d = (TextView) findViewById(a.h.snackbar_text);
        this.e = (Button) findViewById(a.h.snackbar_action);
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x0060  */
    @Override // android.widget.LinearLayout, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    protected void onMeasure(int r8, int r9) throws android.content.res.Resources.NotFoundException {
        /*
            r7 = this;
            super.onMeasure(r8, r9)
            int r0 = r7.f
            if (r0 <= 0) goto L18
            int r0 = r7.getMeasuredWidth()
            int r1 = r7.f
            if (r0 <= r1) goto L18
            r8 = 1073741824(0x40000000, float:2.0)
            int r8 = android.view.View.MeasureSpec.makeMeasureSpec(r1, r8)
            super.onMeasure(r8, r9)
        L18:
            android.content.res.Resources r0 = r7.getResources()
            int r1 = c.a.b.c.a.f.design_snackbar_padding_vertical_2lines
            int r0 = r0.getDimensionPixelSize(r1)
            android.content.res.Resources r1 = r7.getResources()
            int r2 = c.a.b.c.a.f.design_snackbar_padding_vertical
            int r1 = r1.getDimensionPixelSize(r2)
            android.widget.TextView r2 = r7.d
            android.text.Layout r2 = r2.getLayout()
            int r2 = r2.getLineCount()
            r3 = 0
            r4 = 1
            if (r2 <= r4) goto L3c
            r2 = 1
            goto L3d
        L3c:
            r2 = 0
        L3d:
            if (r2 == 0) goto L56
            int r5 = r7.g
            if (r5 <= 0) goto L56
            android.widget.Button r5 = r7.e
            int r5 = r5.getMeasuredWidth()
            int r6 = r7.g
            if (r5 <= r6) goto L56
            int r1 = r0 - r1
            boolean r0 = r7.e(r4, r0, r1)
            if (r0 == 0) goto L61
            goto L60
        L56:
            if (r2 == 0) goto L59
            goto L5a
        L59:
            r0 = r1
        L5a:
            boolean r0 = r7.e(r3, r0, r0)
            if (r0 == 0) goto L61
        L60:
            r3 = 1
        L61:
            if (r3 == 0) goto L66
            super.onMeasure(r8, r9)
        L66:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.snackbar.SnackbarContentLayout.onMeasure(int, int):void");
    }

    public void setMaxInlineActionWidth(int r1) {
        this.g = r1;
    }
}

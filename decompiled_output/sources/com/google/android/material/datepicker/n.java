package com.google.android.material.datepicker;

import android.app.DatePickerDialog;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Bundle;
import androidx.annotation.h0;
import androidx.annotation.i0;
import androidx.annotation.p0;
import androidx.annotation.t0;
import c.a.b.c.a;

@p0({p0.a.LIBRARY_GROUP, p0.a.TESTS})
/* loaded from: classes.dex */
public class n extends DatePickerDialog {

    @androidx.annotation.f
    private static final int f = 16843612;

    @t0
    private static final int g = a.n.MaterialAlertDialog_MaterialComponents_Picker_Date_Spinner;

    @h0
    private final Drawable d;

    @h0
    private final Rect e;

    public n(@h0 Context context) {
        this(context, 0);
    }

    public n(@h0 Context context, int r9) {
        this(context, r9, null, -1, -1, -1);
    }

    public n(@h0 Context context, int r2, @i0 DatePickerDialog.OnDateSetListener onDateSetListener, int r4, int r5, int r6) {
        super(context, r2, onDateSetListener, r4, r5, r6);
        Context context2 = getContext();
        int r22 = c.a.b.c.r.b.f(getContext(), a.c.colorSurface, n.class.getCanonicalName());
        c.a.b.c.u.j jVar = new c.a.b.c.u.j(context2, null, 16843612, g);
        jVar.n0(ColorStateList.valueOf(Build.VERSION.SDK_INT < 21 ? 0 : r22));
        Rect rectA = c.a.b.c.j.c.a(context2, 16843612, g);
        this.e = rectA;
        this.d = c.a.b.c.j.c.b(jVar, rectA);
    }

    public n(@h0 Context context, @i0 DatePickerDialog.OnDateSetListener onDateSetListener, int r10, int r11, int r12) {
        this(context, 0, onDateSetListener, r10, r11, r12);
    }

    @Override // android.app.AlertDialog, android.app.Dialog
    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        getWindow().setBackgroundDrawable(this.d);
        getWindow().getDecorView().setOnTouchListener(new c.a.b.c.j.a(this, this.e));
    }
}

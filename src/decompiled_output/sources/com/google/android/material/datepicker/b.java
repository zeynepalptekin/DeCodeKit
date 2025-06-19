package com.google.android.material.datepicker;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.InsetDrawable;
import android.graphics.drawable.RippleDrawable;
import android.os.Build;
import android.widget.TextView;
import androidx.annotation.h0;
import androidx.annotation.t0;
import b.i.p.f0;
import c.a.b.c.a;

/* loaded from: classes.dex */
final class b {

    /* renamed from: a, reason: collision with root package name */
    @h0
    private final Rect f6660a;

    /* renamed from: b, reason: collision with root package name */
    private final ColorStateList f6661b;

    /* renamed from: c, reason: collision with root package name */
    private final ColorStateList f6662c;
    private final ColorStateList d;
    private final int e;
    private final c.a.b.c.u.o f;

    private b(ColorStateList colorStateList, ColorStateList colorStateList2, ColorStateList colorStateList3, int r5, c.a.b.c.u.o oVar, @h0 Rect rect) {
        b.i.o.i.d(rect.left);
        b.i.o.i.d(rect.top);
        b.i.o.i.d(rect.right);
        b.i.o.i.d(rect.bottom);
        this.f6660a = rect;
        this.f6661b = colorStateList2;
        this.f6662c = colorStateList;
        this.d = colorStateList3;
        this.e = r5;
        this.f = oVar;
    }

    @h0
    static b a(@h0 Context context, @t0 int r13) throws Resources.NotFoundException {
        b.i.o.i.b(r13 != 0, "Cannot create a CalendarItemStyle with a styleResId of 0");
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(r13, a.o.MaterialCalendarItem);
        Rect rect = new Rect(typedArrayObtainStyledAttributes.getDimensionPixelOffset(a.o.MaterialCalendarItem_android_insetLeft, 0), typedArrayObtainStyledAttributes.getDimensionPixelOffset(a.o.MaterialCalendarItem_android_insetTop, 0), typedArrayObtainStyledAttributes.getDimensionPixelOffset(a.o.MaterialCalendarItem_android_insetRight, 0), typedArrayObtainStyledAttributes.getDimensionPixelOffset(a.o.MaterialCalendarItem_android_insetBottom, 0));
        ColorStateList colorStateListA = c.a.b.c.r.c.a(context, typedArrayObtainStyledAttributes, a.o.MaterialCalendarItem_itemFillColor);
        ColorStateList colorStateListA2 = c.a.b.c.r.c.a(context, typedArrayObtainStyledAttributes, a.o.MaterialCalendarItem_itemTextColor);
        ColorStateList colorStateListA3 = c.a.b.c.r.c.a(context, typedArrayObtainStyledAttributes, a.o.MaterialCalendarItem_itemStrokeColor);
        int dimensionPixelSize = typedArrayObtainStyledAttributes.getDimensionPixelSize(a.o.MaterialCalendarItem_itemStrokeWidth, 0);
        c.a.b.c.u.o oVarM = c.a.b.c.u.o.b(context, typedArrayObtainStyledAttributes.getResourceId(a.o.MaterialCalendarItem_itemShapeAppearance, 0), typedArrayObtainStyledAttributes.getResourceId(a.o.MaterialCalendarItem_itemShapeAppearanceOverlay, 0)).m();
        typedArrayObtainStyledAttributes.recycle();
        return new b(colorStateListA, colorStateListA2, colorStateListA3, dimensionPixelSize, oVarM, rect);
    }

    int b() {
        return this.f6660a.bottom;
    }

    int c() {
        return this.f6660a.left;
    }

    int d() {
        return this.f6660a.right;
    }

    int e() {
        return this.f6660a.top;
    }

    void f(@h0 TextView textView) {
        c.a.b.c.u.j jVar = new c.a.b.c.u.j();
        c.a.b.c.u.j jVar2 = new c.a.b.c.u.j();
        jVar.setShapeAppearanceModel(this.f);
        jVar2.setShapeAppearanceModel(this.f);
        jVar.n0(this.f6662c);
        jVar.D0(this.e, this.d);
        textView.setTextColor(this.f6661b);
        Drawable rippleDrawable = Build.VERSION.SDK_INT >= 21 ? new RippleDrawable(this.f6661b.withAlpha(30), jVar, jVar2) : jVar;
        Rect rect = this.f6660a;
        f0.B1(textView, new InsetDrawable(rippleDrawable, rect.left, rect.top, rect.right, rect.bottom));
    }
}

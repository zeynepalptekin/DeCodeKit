package com.google.android.material.datepicker;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Paint;
import androidx.annotation.h0;
import c.a.b.c.a;

/* loaded from: classes.dex */
final class c {

    /* renamed from: a, reason: collision with root package name */
    @h0
    final b f6663a;

    /* renamed from: b, reason: collision with root package name */
    @h0
    final b f6664b;

    /* renamed from: c, reason: collision with root package name */
    @h0
    final b f6665c;

    @h0
    final b d;

    @h0
    final b e;

    @h0
    final b f;

    @h0
    final b g;

    @h0
    final Paint h;

    c(@h0 Context context) throws Resources.NotFoundException {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(c.a.b.c.r.b.f(context, a.c.materialCalendarStyle, k.class.getCanonicalName()), a.o.MaterialCalendar);
        this.f6663a = b.a(context, typedArrayObtainStyledAttributes.getResourceId(a.o.MaterialCalendar_dayStyle, 0));
        this.g = b.a(context, typedArrayObtainStyledAttributes.getResourceId(a.o.MaterialCalendar_dayInvalidStyle, 0));
        this.f6664b = b.a(context, typedArrayObtainStyledAttributes.getResourceId(a.o.MaterialCalendar_daySelectedStyle, 0));
        this.f6665c = b.a(context, typedArrayObtainStyledAttributes.getResourceId(a.o.MaterialCalendar_dayTodayStyle, 0));
        ColorStateList colorStateListA = c.a.b.c.r.c.a(context, typedArrayObtainStyledAttributes, a.o.MaterialCalendar_rangeFillColor);
        this.d = b.a(context, typedArrayObtainStyledAttributes.getResourceId(a.o.MaterialCalendar_yearStyle, 0));
        this.e = b.a(context, typedArrayObtainStyledAttributes.getResourceId(a.o.MaterialCalendar_yearSelectedStyle, 0));
        this.f = b.a(context, typedArrayObtainStyledAttributes.getResourceId(a.o.MaterialCalendar_yearTodayStyle, 0));
        Paint paint = new Paint();
        this.h = paint;
        paint.setColor(colorStateListA.getDefaultColor());
        typedArrayObtainStyledAttributes.recycle();
    }
}

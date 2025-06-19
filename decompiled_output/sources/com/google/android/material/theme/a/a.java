package com.google.android.material.theme.a;

import android.R;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import androidx.annotation.f;
import androidx.annotation.h0;
import androidx.annotation.i0;
import androidx.annotation.t0;
import b.a.f.d;
import c.a.b.c.a;

/* loaded from: classes.dex */
public class a {

    /* renamed from: a, reason: collision with root package name */
    private static final int[] f6849a = {R.attr.theme, a.c.theme};

    /* renamed from: b, reason: collision with root package name */
    private static final int[] f6850b = {a.c.materialThemeOverlay};

    private a() {
    }

    @t0
    private static int a(@h0 Context context, AttributeSet attributeSet) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, f6849a);
        int resourceId = typedArrayObtainStyledAttributes.getResourceId(0, 0);
        int resourceId2 = typedArrayObtainStyledAttributes.getResourceId(1, 0);
        typedArrayObtainStyledAttributes.recycle();
        return resourceId != 0 ? resourceId : resourceId2;
    }

    @t0
    private static int b(@h0 Context context, @i0 AttributeSet attributeSet, @f int r3, @t0 int r4) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, f6850b, r3, r4);
        int resourceId = typedArrayObtainStyledAttributes.getResourceId(0, 0);
        typedArrayObtainStyledAttributes.recycle();
        return resourceId;
    }

    @h0
    public static Context c(@h0 Context context, @i0 AttributeSet attributeSet, @f int r3, @t0 int r4) {
        int r32 = b(context, attributeSet, r3, r4);
        boolean z = (context instanceof d) && ((d) context).c() == r32;
        if (r32 == 0 || z) {
            return context;
        }
        d dVar = new d(context, r32);
        int r1 = a(context, attributeSet);
        if (r1 != 0) {
            dVar.getTheme().applyStyle(r1, true);
        }
        return dVar;
    }
}

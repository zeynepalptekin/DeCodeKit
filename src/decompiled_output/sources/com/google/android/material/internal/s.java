package com.google.android.material.internal;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.TypedValue;
import androidx.annotation.h0;
import androidx.annotation.i0;
import androidx.annotation.p0;
import androidx.annotation.t0;
import androidx.annotation.u0;
import androidx.appcompat.widget.a1;
import c.a.b.c.a;

@p0({p0.a.LIBRARY_GROUP})
/* loaded from: classes.dex */
public final class s {

    /* renamed from: b, reason: collision with root package name */
    private static final String f6755b = "Theme.AppCompat";
    private static final String d = "Theme.MaterialComponents";

    /* renamed from: a, reason: collision with root package name */
    private static final int[] f6754a = {a.c.colorPrimary};

    /* renamed from: c, reason: collision with root package name */
    private static final int[] f6756c = {a.c.colorPrimaryVariant};

    private s() {
    }

    public static void a(@h0 Context context) {
        e(context, f6754a, f6755b);
    }

    private static void b(@h0 Context context, AttributeSet attributeSet, @androidx.annotation.f int r3, @t0 int r4) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, a.o.ThemeEnforcement, r3, r4);
        boolean z = typedArrayObtainStyledAttributes.getBoolean(a.o.ThemeEnforcement_enforceMaterialTheme, false);
        typedArrayObtainStyledAttributes.recycle();
        if (z) {
            TypedValue typedValue = new TypedValue();
            if (!context.getTheme().resolveAttribute(a.c.isMaterialTheme, typedValue, true) || (typedValue.type == 18 && typedValue.data == 0)) {
                c(context);
            }
        }
        a(context);
    }

    public static void c(@h0 Context context) {
        e(context, f6756c, d);
    }

    private static void d(@h0 Context context, AttributeSet attributeSet, @u0 @h0 int[] r5, @androidx.annotation.f int r6, @t0 int r7, @i0 @u0 int... r8) {
        boolean zG;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, a.o.ThemeEnforcement, r6, r7);
        if (!typedArrayObtainStyledAttributes.getBoolean(a.o.ThemeEnforcement_enforceTextAppearance, false)) {
            typedArrayObtainStyledAttributes.recycle();
            return;
        }
        if (r8 == null || r8.length == 0) {
            zG = typedArrayObtainStyledAttributes.getResourceId(a.o.ThemeEnforcement_android_textAppearance, -1) != -1;
        } else {
            zG = g(context, attributeSet, r5, r6, r7, r8);
        }
        typedArrayObtainStyledAttributes.recycle();
        if (!zG) {
            throw new IllegalArgumentException("This component requires that you specify a valid TextAppearance attribute. Update your app theme to inherit from Theme.MaterialComponents (or a descendant).");
        }
    }

    private static void e(@h0 Context context, @h0 int[] r2, String str) {
        if (i(context, r2)) {
            return;
        }
        throw new IllegalArgumentException("The style on this component requires your app theme to be " + str + " (or a descendant).");
    }

    public static boolean f(@h0 Context context) {
        return i(context, f6754a);
    }

    private static boolean g(@h0 Context context, AttributeSet attributeSet, @u0 @h0 int[] r3, @androidx.annotation.f int r4, @t0 int r5, @u0 @h0 int... r6) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, r3, r4, r5);
        for (int r0 : r6) {
            if (typedArrayObtainStyledAttributes.getResourceId(r0, -1) == -1) {
                typedArrayObtainStyledAttributes.recycle();
                return false;
            }
        }
        typedArrayObtainStyledAttributes.recycle();
        return true;
    }

    public static boolean h(@h0 Context context) {
        return i(context, f6756c);
    }

    private static boolean i(@h0 Context context, @h0 int[] r4) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(r4);
        for (int r1 = 0; r1 < r4.length; r1++) {
            if (!typedArrayObtainStyledAttributes.hasValue(r1)) {
                typedArrayObtainStyledAttributes.recycle();
                return false;
            }
        }
        typedArrayObtainStyledAttributes.recycle();
        return true;
    }

    @h0
    public static TypedArray j(@h0 Context context, AttributeSet attributeSet, @u0 @h0 int[] r2, @androidx.annotation.f int r3, @t0 int r4, @u0 int... r5) {
        b(context, attributeSet, r3, r4);
        d(context, attributeSet, r2, r3, r4, r5);
        return context.obtainStyledAttributes(attributeSet, r2, r3, r4);
    }

    public static a1 k(@h0 Context context, AttributeSet attributeSet, @u0 @h0 int[] r2, @androidx.annotation.f int r3, @t0 int r4, @u0 int... r5) {
        b(context, attributeSet, r3, r4);
        d(context, attributeSet, r2, r3, r4, r5);
        return a1.G(context, attributeSet, r2, r3, r4);
    }
}

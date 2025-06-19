package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import javax.annotation.ParametersAreNonnullByDefault;

@ParametersAreNonnullByDefault
/* loaded from: classes.dex */
public final class n0 {
    public static void a(l0 l0Var, @androidx.annotation.i0 i0 i0Var) {
        if (i0Var.a() == null) {
            throw new IllegalArgumentException("Context can't be null. Please set up context in CsiConfiguration.");
        }
        if (TextUtils.isEmpty(i0Var.b())) {
            throw new IllegalArgumentException("AfmaVersion can't be null or empty. Please set up afmaVersion in CsiConfiguration.");
        }
        l0Var.b(i0Var.a(), i0Var.b(), i0Var.c(), i0Var.d());
    }
}

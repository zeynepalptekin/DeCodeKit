package com.google.android.gms.internal.ads;

import android.view.View;
import android.view.ViewTreeObserver;

/* loaded from: classes.dex */
public final class ss {
    public static void a(View view, ViewTreeObserver.OnGlobalLayoutListener onGlobalLayoutListener) {
        new vs(view, onGlobalLayoutListener).a();
    }

    public static void b(View view, ViewTreeObserver.OnScrollChangedListener onScrollChangedListener) {
        new us(view, onScrollChangedListener).a();
    }
}

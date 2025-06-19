package com.google.android.gms.internal.ads;

import android.content.Context;
import android.text.TextUtils;
import java.lang.reflect.InvocationTargetException;

/* loaded from: classes.dex */
final class xx0 implements od0 {
    private final Context d;
    private final lm e;

    xx0(Context context, lm lmVar) {
        this.d = context;
        this.e = lmVar;
    }

    @Override // com.google.android.gms.internal.ads.od0
    public final void e0(wi wiVar) {
    }

    @Override // com.google.android.gms.internal.ads.od0
    public final void t(wm1 wm1Var) throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
        if (TextUtils.isEmpty(wm1Var.f5858b.f5551b.d)) {
            return;
        }
        this.e.d(this.d, wm1Var.f5857a.f5710a.d);
        this.e.z(this.d, wm1Var.f5858b.f5551b.d);
    }
}

package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import android.view.View;

/* loaded from: classes.dex */
final class ay1 implements Runnable {
    private final /* synthetic */ Context d;
    private final /* synthetic */ View e;
    private final /* synthetic */ Activity f;

    ay1(zw1 zw1Var, Context context, View view, Activity activity) {
        this.d = context;
        this.e = view;
        this.f = activity;
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            zw1.D.d(this.d, this.e, this.f);
        } catch (Exception e) {
            zw1.F.b(2020, -1L, e);
        }
    }
}

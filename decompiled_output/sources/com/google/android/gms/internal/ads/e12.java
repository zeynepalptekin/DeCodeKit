package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import android.view.View;

/* loaded from: classes.dex */
final class e12 implements Runnable {
    private final /* synthetic */ Context d;
    private final /* synthetic */ String e;
    private final /* synthetic */ View f;
    private final /* synthetic */ Activity g;

    e12(zw1 zw1Var, Context context, String str, View view, Activity activity) {
        this.d = context;
        this.e = str;
        this.f = view;
        this.g = activity;
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            zw1.D.g(this.d, this.e, this.f, this.g);
        } catch (Exception e) {
            zw1.F.b(2021, -1L, e);
        }
    }
}

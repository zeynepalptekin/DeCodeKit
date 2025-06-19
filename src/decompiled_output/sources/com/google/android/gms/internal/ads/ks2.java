package com.google.android.gms.internal.ads;

import android.webkit.ValueCallback;

/* loaded from: classes.dex */
final class ks2 implements ValueCallback<String> {

    /* renamed from: a, reason: collision with root package name */
    private final /* synthetic */ ls2 f4147a;

    ks2(ls2 ls2Var) {
        this.f4147a = ls2Var;
    }

    @Override // android.webkit.ValueCallback
    public final /* synthetic */ void onReceiveValue(String str) {
        ls2 ls2Var = this.f4147a;
        ls2Var.h.c(ls2Var.e, ls2Var.f, str, ls2Var.g);
    }
}

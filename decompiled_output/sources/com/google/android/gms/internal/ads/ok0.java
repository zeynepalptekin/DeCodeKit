package com.google.android.gms.internal.ads;

import java.lang.ref.WeakReference;
import java.util.Map;

/* loaded from: classes.dex */
final class ok0 implements z6<Object> {

    /* renamed from: a, reason: collision with root package name */
    private WeakReference<mk0> f4705a;

    private ok0(mk0 mk0Var) {
        this.f4705a = new WeakReference<>(mk0Var);
    }

    @Override // com.google.android.gms.internal.ads.z6
    public final void a(Object obj, Map<String, String> map) {
        mk0 mk0Var = this.f4705a.get();
        if (mk0Var != null && "_ac".equals(map.get("eventName"))) {
            mk0Var.h.p();
        }
    }
}

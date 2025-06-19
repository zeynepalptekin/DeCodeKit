package com.google.android.gms.internal.ads;

import android.view.View;

/* loaded from: classes.dex */
public final class z30 implements pe2<View> {

    /* renamed from: a, reason: collision with root package name */
    private final w30 f6215a;

    public z30(w30 w30Var) {
        this.f6215a = w30Var;
    }

    public static View a(w30 w30Var) {
        return (View) we2.b(w30Var.b(), "Cannot return null from a non-@Nullable @Provides method");
    }

    @Override // com.google.android.gms.internal.ads.ze2
    public final /* synthetic */ Object get() {
        return a(this.f6215a);
    }
}

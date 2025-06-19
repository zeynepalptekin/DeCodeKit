package com.google.android.gms.internal.ads;

import android.view.View;

/* loaded from: classes.dex */
public final class l50 implements pe2<View> {

    /* renamed from: a, reason: collision with root package name */
    private final h50 f4197a;

    public l50(h50 h50Var) {
        this.f4197a = h50Var;
    }

    public static View a(h50 h50Var) {
        return (View) we2.b(h50Var.c(), "Cannot return null from a non-@Nullable @Provides method");
    }

    @Override // com.google.android.gms.internal.ads.ze2
    public final /* synthetic */ Object get() {
        return a(this.f4197a);
    }
}

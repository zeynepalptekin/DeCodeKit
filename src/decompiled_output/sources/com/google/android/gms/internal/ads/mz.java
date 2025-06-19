package com.google.android.gms.internal.ads;

import android.content.Context;

/* loaded from: classes.dex */
public final class mz implements pe2<Context> {

    /* renamed from: a, reason: collision with root package name */
    private final jz f4466a;

    public mz(jz jzVar) {
        this.f4466a = jzVar;
    }

    public static Context a(jz jzVar) {
        return (Context) we2.b(jzVar.a(), "Cannot return null from a non-@Nullable @Provides method");
    }

    @Override // com.google.android.gms.internal.ads.ze2
    public final /* synthetic */ Object get() {
        return a(this.f4466a);
    }
}

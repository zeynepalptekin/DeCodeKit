package com.google.android.gms.internal.ads;

import android.content.Context;
import java.lang.ref.WeakReference;

/* loaded from: classes.dex */
public final class lz implements pe2<WeakReference<Context>> {

    /* renamed from: a, reason: collision with root package name */
    private final jz f4318a;

    public lz(jz jzVar) {
        this.f4318a = jzVar;
    }

    @Override // com.google.android.gms.internal.ads.ze2
    public final /* synthetic */ Object get() {
        return (WeakReference) we2.b(this.f4318a.b(), "Cannot return null from a non-@Nullable @Provides method");
    }
}

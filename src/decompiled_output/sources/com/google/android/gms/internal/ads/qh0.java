package com.google.android.gms.internal.ads;

import java.util.Set;

/* loaded from: classes.dex */
public final class qh0 implements pe2<mh0> {

    /* renamed from: a, reason: collision with root package name */
    private final ze2<Set<ch0<k7>>> f5012a;

    public qh0(ze2<Set<ch0<k7>>> ze2Var) {
        this.f5012a = ze2Var;
    }

    @Override // com.google.android.gms.internal.ads.ze2
    public final /* synthetic */ Object get() {
        return new mh0(this.f5012a.get());
    }
}

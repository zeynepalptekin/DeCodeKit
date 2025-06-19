package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.z;
import java.util.Set;

/* loaded from: classes.dex */
public final class ci0 implements pe2<vh0> {

    /* renamed from: a, reason: collision with root package name */
    private final ze2<Set<ch0<z.a>>> f2974a;

    private ci0(ze2<Set<ch0<z.a>>> ze2Var) {
        this.f2974a = ze2Var;
    }

    public static ci0 a(ze2<Set<ch0<z.a>>> ze2Var) {
        return new ci0(ze2Var);
    }

    @Override // com.google.android.gms.internal.ads.ze2
    public final /* synthetic */ Object get() {
        return new vh0(this.f2974a.get());
    }
}

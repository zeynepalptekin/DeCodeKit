package com.google.android.gms.internal.ads;

import java.util.Set;

/* loaded from: classes.dex */
public final class la1 implements pe2<ja1> {

    /* renamed from: a, reason: collision with root package name */
    private final ze2<Set<String>> f4233a;

    private la1(ze2<Set<String>> ze2Var) {
        this.f4233a = ze2Var;
    }

    public static la1 a(ze2<Set<String>> ze2Var) {
        return new la1(ze2Var);
    }

    public static ja1 b(Set<String> set) {
        return new ja1(set);
    }

    @Override // com.google.android.gms.internal.ads.ze2
    public final /* synthetic */ Object get() {
        return b(this.f4233a.get());
    }
}

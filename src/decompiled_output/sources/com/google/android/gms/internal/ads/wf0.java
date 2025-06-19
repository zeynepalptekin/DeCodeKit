package com.google.android.gms.internal.ads;

import java.util.Collections;
import java.util.Set;

/* loaded from: classes.dex */
public final class wf0 implements pe2<Set<ch0<nc0>>> {

    /* renamed from: a, reason: collision with root package name */
    private final qf0 f5828a;

    private wf0(qf0 qf0Var) {
        this.f5828a = qf0Var;
    }

    public static wf0 a(qf0 qf0Var) {
        return new wf0(qf0Var);
    }

    public static Set<ch0<nc0>> b(qf0 qf0Var) {
        return (Set) we2.b(Collections.emptySet(), "Cannot return null from a non-@Nullable @Provides method");
    }

    @Override // com.google.android.gms.internal.ads.ze2
    public final /* synthetic */ Object get() {
        return b(this.f5828a);
    }
}

package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.z;
import java.util.Collections;
import java.util.Set;

/* loaded from: classes.dex */
public final class pg0 implements pe2<Set<ch0<z.a>>> {

    /* renamed from: a, reason: collision with root package name */
    private final qf0 f4811a;

    private pg0(qf0 qf0Var) {
        this.f4811a = qf0Var;
    }

    public static pg0 a(qf0 qf0Var) {
        return new pg0(qf0Var);
    }

    @Override // com.google.android.gms.internal.ads.ze2
    public final /* synthetic */ Object get() {
        return (Set) we2.b(Collections.emptySet(), "Cannot return null from a non-@Nullable @Provides method");
    }
}

package com.google.android.gms.internal.ads;

import java.util.HashMap;
import java.util.Map;
import javax.annotation.ParametersAreNonnullByDefault;

@ParametersAreNonnullByDefault
/* loaded from: classes.dex */
public final class s0 {

    /* renamed from: a, reason: collision with root package name */
    private final Map<String, t0> f5206a = new HashMap();

    /* renamed from: b, reason: collision with root package name */
    @androidx.annotation.i0
    private final v0 f5207b;

    public s0(@androidx.annotation.i0 v0 v0Var) {
        this.f5207b = v0Var;
    }

    public final void a(String str, t0 t0Var) {
        this.f5206a.put(str, t0Var);
    }

    public final void b(String str, String str2, long j) {
        v0 v0Var = this.f5207b;
        t0 t0Var = this.f5206a.get(str2);
        String[] strArr = {str};
        if (v0Var != null && t0Var != null) {
            v0Var.a(t0Var, j, strArr);
        }
        Map<String, t0> map = this.f5206a;
        v0 v0Var2 = this.f5207b;
        map.put(str, v0Var2 == null ? null : v0Var2.c(j));
    }

    @androidx.annotation.i0
    public final v0 c() {
        return this.f5207b;
    }
}

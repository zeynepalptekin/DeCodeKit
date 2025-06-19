package com.google.android.gms.internal.ads;

import java.util.HashMap;
import java.util.Map;
import javax.annotation.Nullable;
import javax.annotation.concurrent.GuardedBy;

/* loaded from: classes.dex */
public final class as0 {

    /* renamed from: a, reason: collision with root package name */
    @GuardedBy("this")
    private final Map<String, bs0> f2742a = new HashMap();

    as0() {
    }

    final synchronized void a(String str, ye yeVar) {
        if (this.f2742a.containsKey(str)) {
            return;
        }
        try {
            this.f2742a.put(str, new bs0(str, yeVar.b1(), yeVar.I0()));
        } catch (Throwable unused) {
        }
    }

    final synchronized void b(String str, rn1 rn1Var) {
        if (this.f2742a.containsKey(str)) {
            return;
        }
        try {
            this.f2742a.put(str, new bs0(str, rn1Var.A(), rn1Var.B()));
        } catch (in1 unused) {
        }
    }

    @Nullable
    public final synchronized bs0 c(String str) {
        return this.f2742a.get(str);
    }
}

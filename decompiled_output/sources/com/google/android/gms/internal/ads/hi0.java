package com.google.android.gms.internal.ads;

import android.view.View;
import java.util.Collections;
import java.util.Set;
import java.util.concurrent.Executor;

/* loaded from: classes.dex */
public class hi0 {

    /* renamed from: a, reason: collision with root package name */
    private final pj0 f3677a;

    /* renamed from: b, reason: collision with root package name */
    @androidx.annotation.i0
    private final rw f3678b;

    public hi0(pj0 pj0Var) {
        this(pj0Var, null);
    }

    public hi0(pj0 pj0Var, @androidx.annotation.i0 rw rwVar) {
        this.f3677a = pj0Var;
        this.f3678b = rwVar;
    }

    @androidx.annotation.i0
    public final rw a() {
        return this.f3678b;
    }

    public final pj0 b() {
        return this.f3677a;
    }

    @androidx.annotation.i0
    public final View c() {
        rw rwVar = this.f3678b;
        if (rwVar != null) {
            return rwVar.getWebView();
        }
        return null;
    }

    @androidx.annotation.i0
    public final View d() {
        rw rwVar = this.f3678b;
        if (rwVar == null) {
            return null;
        }
        return rwVar.getWebView();
    }

    public final ch0<we0> e(Executor executor) {
        final rw rwVar = this.f3678b;
        return new ch0<>(new we0(rwVar) { // from class: com.google.android.gms.internal.ads.ji0
            private final rw d;

            {
                this.d = rwVar;
            }

            @Override // com.google.android.gms.internal.ads.we0
            public final void s() {
                rw rwVar2 = this.d;
                if (rwVar2.w0() != null) {
                    rwVar2.w0().z8();
                }
            }
        }, executor);
    }

    public Set<ch0<bb0>> f(w90 w90Var) {
        return Collections.singleton(ch0.a(w90Var, cs.f));
    }

    public Set<ch0<tg0>> g(w90 w90Var) {
        return Collections.singleton(ch0.a(w90Var, cs.f));
    }
}

package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;

/* loaded from: classes.dex */
public final class kz1 {

    /* renamed from: a, reason: collision with root package name */
    private final r42 f4164a;

    private kz1(r42 r42Var) {
        this.f4164a = r42Var;
    }

    static final kz1 a(r42 r42Var) throws GeneralSecurityException {
        if (r42Var == null || r42Var.J() <= 0) {
            throw new GeneralSecurityException("empty keyset");
        }
        return new kz1(r42Var);
    }

    final r42 b() {
        return this.f4164a;
    }

    public final String toString() {
        return b02.a(this.f4164a).toString();
    }
}

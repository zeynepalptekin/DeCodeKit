package com.google.android.gms.internal.ads;

import android.os.RemoteException;

/* loaded from: classes.dex */
final class b91 implements rx1<p91> {

    /* renamed from: a, reason: collision with root package name */
    private final /* synthetic */ en f2800a;

    /* renamed from: b, reason: collision with root package name */
    private final /* synthetic */ s81 f2801b;

    b91(s81 s81Var, en enVar) {
        this.f2801b = s81Var;
        this.f2800a = enVar;
    }

    @Override // com.google.android.gms.internal.ads.rx1
    public final void a(Throwable th) {
        try {
            en enVar = this.f2800a;
            String strValueOf = String.valueOf(th.getMessage());
            enVar.u1(strValueOf.length() != 0 ? "Internal error. ".concat(strValueOf) : new String("Internal error. "));
        } catch (RemoteException e) {
            tr.c("", e);
        }
    }

    @Override // com.google.android.gms.internal.ads.rx1
    public final /* synthetic */ void b(@androidx.annotation.i0 p91 p91Var) {
        p91 p91Var2 = p91Var;
        try {
            if (((Boolean) qx2.e().c(e0.X4)).booleanValue()) {
                if (this.f2801b.h.f >= ((Integer) qx2.e().c(e0.Z4)).intValue()) {
                    if (p91Var2 == null) {
                        this.f2800a.v1(null, null, null);
                        return;
                    } else {
                        this.f2800a.v1(p91Var2.f4786a, p91Var2.f4787b, p91Var2.f4788c);
                        return;
                    }
                }
            }
            if (p91Var2 == null) {
                this.f2800a.X7(null, null);
            } else {
                this.f2800a.X7(p91Var2.f4786a, p91Var2.f4787b);
            }
        } catch (RemoteException e) {
            tr.c("", e);
        }
    }
}

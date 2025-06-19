package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.RemoteException;

/* loaded from: classes.dex */
public final class b9 {

    /* renamed from: a, reason: collision with root package name */
    private final ow2 f2797a;

    /* renamed from: b, reason: collision with root package name */
    private final Context f2798b;

    /* renamed from: c, reason: collision with root package name */
    private final yx2 f2799c;

    b9(Context context, yx2 yx2Var) {
        this(context, yx2Var, ow2.f4752a);
    }

    private b9(Context context, yx2 yx2Var, ow2 ow2Var) {
        this.f2798b = context;
        this.f2799c = yx2Var;
        this.f2797a = ow2Var;
    }

    private final void c(c03 c03Var) {
        try {
            this.f2799c.I3(ow2.b(this.f2798b, c03Var));
        } catch (RemoteException e) {
            tr.e("#007 Could not call remote method.", e);
        }
    }

    @androidx.annotation.o0("android.permission.INTERNET")
    public final void a(com.google.android.gms.ads.e eVar) {
        c(eVar.k());
    }

    @androidx.annotation.o0("android.permission.INTERNET")
    public final void b(com.google.android.gms.ads.c0.d dVar) {
        c(dVar.n());
    }
}

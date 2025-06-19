package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.RemoteException;
import com.google.android.gms.ads.h0.a;

/* loaded from: classes.dex */
public final class a9 {

    /* renamed from: a, reason: collision with root package name */
    private final Context f2651a;

    /* renamed from: b, reason: collision with root package name */
    private final dy2 f2652b;

    private a9(Context context, dy2 dy2Var) {
        this.f2651a = context;
        this.f2652b = dy2Var;
    }

    public a9(Context context, String str) {
        this((Context) com.google.android.gms.common.internal.r.l(context, "context cannot be null"), qx2.b().j(context, str, new rc()));
    }

    public final a9 a(a.AbstractC0163a abstractC0163a) {
        try {
            this.f2652b.J1(new y8(abstractC0163a));
        } catch (RemoteException e) {
            tr.e("#007 Could not call remote method.", e);
        }
        return this;
    }

    public final a9 b(z8 z8Var) {
        try {
            this.f2652b.F2(new n8(z8Var));
        } catch (RemoteException e) {
            tr.e("#007 Could not call remote method.", e);
        }
        return this;
    }

    public final b9 c() {
        try {
            return new b9(this.f2651a, this.f2652b.C4());
        } catch (RemoteException e) {
            tr.e("#007 Could not call remote method.", e);
            return null;
        }
    }
}

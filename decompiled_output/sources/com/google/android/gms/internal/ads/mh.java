package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.RemoteException;
import javax.annotation.concurrent.GuardedBy;

/* loaded from: classes.dex */
public class mh {

    @GuardedBy("InternalQueryInfoGenerator.class")
    private static jn d;

    /* renamed from: a, reason: collision with root package name */
    private final Context f4413a;

    /* renamed from: b, reason: collision with root package name */
    private final com.google.android.gms.ads.b f4414b;

    /* renamed from: c, reason: collision with root package name */
    @androidx.annotation.i0
    private final c03 f4415c;

    public mh(Context context, com.google.android.gms.ads.b bVar, @androidx.annotation.i0 c03 c03Var) {
        this.f4413a = context;
        this.f4414b = bVar;
        this.f4415c = c03Var;
    }

    @androidx.annotation.i0
    public static jn b(Context context) {
        jn jnVar;
        synchronized (mh.class) {
            if (d == null) {
                d = qx2.b().c(context, new rc());
            }
            jnVar = d;
        }
        return jnVar;
    }

    public final void a(com.google.android.gms.ads.j0.c cVar) {
        String str;
        jn jnVarB = b(this.f4413a);
        if (jnVarB == null) {
            str = "Internal Error, query info generator is null.";
        } else {
            c.a.b.b.e.c cVarI2 = c.a.b.b.e.e.i2(this.f4413a);
            c03 c03Var = this.f4415c;
            try {
                jnVarB.T5(cVarI2, new pn(null, this.f4414b.name(), null, c03Var == null ? new mw2().a() : ow2.b(this.f4413a, c03Var)), new ph(this, cVar));
                return;
            } catch (RemoteException unused) {
                str = "Internal Error.";
            }
        }
        cVar.a(str);
    }
}

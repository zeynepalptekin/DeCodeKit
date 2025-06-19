package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import javax.annotation.concurrent.GuardedBy;

/* loaded from: classes.dex */
public final class c81 {

    /* renamed from: a, reason: collision with root package name */
    private final g81<e70> f2943a;

    /* renamed from: b, reason: collision with root package name */
    private final String f2944b;

    /* renamed from: c, reason: collision with root package name */
    @androidx.annotation.i0
    @GuardedBy("this")
    private tz2 f2945c;

    @GuardedBy("this")
    private boolean d = false;

    public c81(g81<e70> g81Var, String str) {
        this.f2943a = g81Var;
        this.f2944b = str;
    }

    static /* synthetic */ boolean e(c81 c81Var, boolean z) {
        c81Var.d = false;
        return false;
    }

    public final synchronized String a() {
        try {
            if (this.f2945c == null) {
                return null;
            }
            return this.f2945c.e();
        } catch (RemoteException e) {
            tr.e("#007 Could not call remote method.", e);
            return null;
        }
    }

    public final synchronized boolean b() throws RemoteException {
        return this.f2943a.Y();
    }

    public final synchronized void d(jw2 jw2Var, int r5) throws RemoteException {
        this.f2945c = null;
        this.d = this.f2943a.Z(jw2Var, this.f2944b, new h81(r5), new z71(this));
    }

    public final synchronized String f() {
        try {
            if (this.f2945c == null) {
                return null;
            }
            return this.f2945c.e();
        } catch (RemoteException e) {
            tr.e("#007 Could not call remote method.", e);
            return null;
        }
    }
}

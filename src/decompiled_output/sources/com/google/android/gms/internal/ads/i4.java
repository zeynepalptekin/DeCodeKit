package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.RemoteException;
import com.google.android.gms.ads.d0.c;
import com.google.android.gms.ads.d0.k;
import java.util.List;

/* loaded from: classes.dex */
public final class i4 implements com.google.android.gms.ads.d0.k {

    /* renamed from: b, reason: collision with root package name */
    private final h4 f3761b;

    /* renamed from: c, reason: collision with root package name */
    private final com.google.android.gms.ads.d0.b f3762c;
    private final com.google.android.gms.ads.z d = new com.google.android.gms.ads.z();
    private k.a e;

    @com.google.android.gms.common.util.d0
    public i4(h4 h4Var) {
        Context context;
        this.f3761b = h4Var;
        com.google.android.gms.ads.d0.b bVar = null;
        try {
            context = (Context) c.a.b.b.e.e.e2(h4Var.S3());
        } catch (RemoteException | NullPointerException e) {
            tr.c("", e);
            context = null;
        }
        if (context != null) {
            com.google.android.gms.ads.d0.b bVar2 = new com.google.android.gms.ads.d0.b(context);
            try {
                if (this.f3761b.g8(c.a.b.b.e.e.i2(bVar2))) {
                    bVar = bVar2;
                }
            } catch (RemoteException e2) {
                tr.c("", e2);
            }
        }
        this.f3762c = bVar;
    }

    @Override // com.google.android.gms.ads.d0.k
    public final List<String> D0() {
        try {
            return this.f3761b.D0();
        } catch (RemoteException e) {
            tr.c("", e);
            return null;
        }
    }

    @Override // com.google.android.gms.ads.d0.k
    public final void Q0(String str) {
        try {
            this.f3761b.Q0(str);
        } catch (RemoteException e) {
            tr.c("", e);
        }
    }

    @Override // com.google.android.gms.ads.d0.k
    public final String Z0() {
        try {
            return this.f3761b.Z0();
        } catch (RemoteException e) {
            tr.c("", e);
            return null;
        }
    }

    public final h4 a() {
        return this.f3761b;
    }

    @Override // com.google.android.gms.ads.d0.k
    public final c.b a1(String str) {
        try {
            k3 k3VarD6 = this.f3761b.D6(str);
            if (k3VarD6 != null) {
                return new l3(k3VarD6);
            }
            return null;
        } catch (RemoteException e) {
            tr.c("", e);
            return null;
        }
    }

    @Override // com.google.android.gms.ads.d0.k
    public final CharSequence b1(String str) {
        try {
            return this.f3761b.z4(str);
        } catch (RemoteException e) {
            tr.c("", e);
            return null;
        }
    }

    @Override // com.google.android.gms.ads.d0.k
    public final k.a c1() {
        try {
            if (this.e == null && this.f3761b.X1()) {
                this.e = new g3(this.f3761b);
            }
        } catch (RemoteException e) {
            tr.c("", e);
        }
        return this.e;
    }

    @Override // com.google.android.gms.ads.d0.k
    public final com.google.android.gms.ads.d0.b d1() {
        return this.f3762c;
    }

    @Override // com.google.android.gms.ads.d0.k
    public final void destroy() {
        try {
            this.f3761b.destroy();
        } catch (RemoteException e) {
            tr.c("", e);
        }
    }

    @Override // com.google.android.gms.ads.d0.k
    public final void g() {
        try {
            this.f3761b.g();
        } catch (RemoteException e) {
            tr.c("", e);
        }
    }

    @Override // com.google.android.gms.ads.d0.k
    public final com.google.android.gms.ads.z getVideoController() {
        try {
            uz2 videoController = this.f3761b.getVideoController();
            if (videoController != null) {
                this.d.o(videoController);
            }
        } catch (RemoteException e) {
            tr.c("Exception occurred while getting video controller", e);
        }
        return this.d;
    }
}

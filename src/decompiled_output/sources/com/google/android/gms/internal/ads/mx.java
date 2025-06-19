package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import java.util.HashMap;
import java.util.Map;
import javax.annotation.concurrent.GuardedBy;

/* loaded from: classes.dex */
public final class mx extends xz2 {
    private final zt e;
    private final boolean g;
    private final boolean h;

    @GuardedBy("lock")
    private int i;

    @GuardedBy("lock")
    private zz2 j;

    @GuardedBy("lock")
    private boolean k;

    @GuardedBy("lock")
    private float m;

    @GuardedBy("lock")
    private float n;

    @GuardedBy("lock")
    private float o;

    @GuardedBy("lock")
    private boolean p;

    @GuardedBy("lock")
    private boolean q;

    @GuardedBy("lock")
    private x4 r;
    private final Object f = new Object();

    @GuardedBy("lock")
    private boolean l = true;

    public mx(zt ztVar, float f, boolean z, boolean z2) {
        this.e = ztVar;
        this.m = f;
        this.g = z;
        this.h = z2;
    }

    private final void A8(final int r9, final int r10, final boolean z, final boolean z2) {
        cs.e.execute(new Runnable(this, r9, r10, z, z2) { // from class: com.google.android.gms.internal.ads.ox
            private final mx d;
            private final int e;
            private final int f;
            private final boolean g;
            private final boolean h;

            {
                this.d = this;
                this.e = r9;
                this.f = r10;
                this.g = z;
                this.h = z2;
            }

            @Override // java.lang.Runnable
            public final void run() {
                this.d.C8(this.e, this.f, this.g, this.h);
            }
        });
    }

    private final void F8(String str, @androidx.annotation.i0 Map<String, String> map) {
        final HashMap map2 = map == null ? new HashMap() : new HashMap(map);
        map2.put("action", str);
        cs.e.execute(new Runnable(this, map2) { // from class: com.google.android.gms.internal.ads.lx
            private final mx d;
            private final Map e;

            {
                this.d = this;
                this.e = map2;
            }

            @Override // java.lang.Runnable
            public final void run() {
                this.d.G8(this.e);
            }
        });
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0015  */
    @Override // com.google.android.gms.internal.ads.uz2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean A2() {
        /*
            r2 = this;
            boolean r0 = r2.M4()
            java.lang.Object r1 = r2.f
            monitor-enter(r1)
            if (r0 != 0) goto L15
            boolean r0 = r2.q     // Catch: java.lang.Throwable -> L13
            if (r0 == 0) goto L15
            boolean r0 = r2.h     // Catch: java.lang.Throwable -> L13
            if (r0 == 0) goto L15
            r0 = 1
            goto L16
        L13:
            r0 = move-exception
            goto L18
        L15:
            r0 = 0
        L16:
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L13
            return r0
        L18:
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L13
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.mx.A2():boolean");
    }

    @Override // com.google.android.gms.internal.ads.uz2
    public final void B5(boolean z) {
        F8(z ? "mute" : "unmute", null);
    }

    public final void B8() {
        boolean z;
        int r2;
        synchronized (this.f) {
            z = this.l;
            r2 = this.i;
            this.i = 3;
        }
        A8(r2, 3, z, z);
    }

    /* JADX WARN: Removed duplicated region for block: B:50:0x005e A[Catch: RemoteException -> 0x0044, all -> 0x007f, TryCatch #0 {RemoteException -> 0x0044, blocks: (B:36:0x003a, B:38:0x003e, B:42:0x0048, B:44:0x004c, B:46:0x0053, B:48:0x0057, B:50:0x005e, B:52:0x0062, B:53:0x0067, B:55:0x006e, B:57:0x0072), top: B:65:0x003a, outer: #1 }] */
    /* JADX WARN: Removed duplicated region for block: B:60:0x007d A[Catch: all -> 0x007f, DONT_GENERATE, TryCatch #1 {, blocks: (B:8:0x000a, B:30:0x002f, B:34:0x0036, B:36:0x003a, B:38:0x003e, B:42:0x0048, B:44:0x004c, B:46:0x0053, B:48:0x0057, B:50:0x005e, B:52:0x0062, B:53:0x0067, B:55:0x006e, B:57:0x0072, B:60:0x007d, B:59:0x0078), top: B:67:0x000a, inners: #0 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    final /* synthetic */ void C8(int r7, int r8, boolean r9, boolean r10) {
        /*
            r6 = this;
            java.lang.Object r0 = r6.f
            monitor-enter(r0)
            r1 = 0
            r2 = 1
            if (r7 == r8) goto L9
            r7 = 1
            goto La
        L9:
            r7 = 0
        La:
            boolean r3 = r6.k     // Catch: java.lang.Throwable -> L7f
            if (r3 != 0) goto L12
            if (r8 != r2) goto L12
            r3 = 1
            goto L13
        L12:
            r3 = 0
        L13:
            if (r7 == 0) goto L19
            if (r8 != r2) goto L19
            r4 = 1
            goto L1a
        L19:
            r4 = 0
        L1a:
            if (r7 == 0) goto L21
            r5 = 2
            if (r8 != r5) goto L21
            r5 = 1
            goto L22
        L21:
            r5 = 0
        L22:
            if (r7 == 0) goto L29
            r7 = 3
            if (r8 != r7) goto L29
            r7 = 1
            goto L2a
        L29:
            r7 = 0
        L2a:
            if (r9 == r10) goto L2e
            r8 = 1
            goto L2f
        L2e:
            r8 = 0
        L2f:
            boolean r9 = r6.k     // Catch: java.lang.Throwable -> L7f
            if (r9 != 0) goto L35
            if (r3 == 0) goto L36
        L35:
            r1 = 1
        L36:
            r6.k = r1     // Catch: java.lang.Throwable -> L7f
            if (r3 == 0) goto L46
            com.google.android.gms.internal.ads.zz2 r9 = r6.j     // Catch: android.os.RemoteException -> L44 java.lang.Throwable -> L7f
            if (r9 == 0) goto L46
            com.google.android.gms.internal.ads.zz2 r9 = r6.j     // Catch: android.os.RemoteException -> L44 java.lang.Throwable -> L7f
            r9.O0()     // Catch: android.os.RemoteException -> L44 java.lang.Throwable -> L7f
            goto L46
        L44:
            r7 = move-exception
            goto L78
        L46:
            if (r4 == 0) goto L51
            com.google.android.gms.internal.ads.zz2 r9 = r6.j     // Catch: android.os.RemoteException -> L44 java.lang.Throwable -> L7f
            if (r9 == 0) goto L51
            com.google.android.gms.internal.ads.zz2 r9 = r6.j     // Catch: android.os.RemoteException -> L44 java.lang.Throwable -> L7f
            r9.j0()     // Catch: android.os.RemoteException -> L44 java.lang.Throwable -> L7f
        L51:
            if (r5 == 0) goto L5c
            com.google.android.gms.internal.ads.zz2 r9 = r6.j     // Catch: android.os.RemoteException -> L44 java.lang.Throwable -> L7f
            if (r9 == 0) goto L5c
            com.google.android.gms.internal.ads.zz2 r9 = r6.j     // Catch: android.os.RemoteException -> L44 java.lang.Throwable -> L7f
            r9.g0()     // Catch: android.os.RemoteException -> L44 java.lang.Throwable -> L7f
        L5c:
            if (r7 == 0) goto L6c
            com.google.android.gms.internal.ads.zz2 r7 = r6.j     // Catch: android.os.RemoteException -> L44 java.lang.Throwable -> L7f
            if (r7 == 0) goto L67
            com.google.android.gms.internal.ads.zz2 r7 = r6.j     // Catch: android.os.RemoteException -> L44 java.lang.Throwable -> L7f
            r7.D1()     // Catch: android.os.RemoteException -> L44 java.lang.Throwable -> L7f
        L67:
            com.google.android.gms.internal.ads.zt r7 = r6.e     // Catch: android.os.RemoteException -> L44 java.lang.Throwable -> L7f
            r7.X()     // Catch: android.os.RemoteException -> L44 java.lang.Throwable -> L7f
        L6c:
            if (r8 == 0) goto L7d
            com.google.android.gms.internal.ads.zz2 r7 = r6.j     // Catch: android.os.RemoteException -> L44 java.lang.Throwable -> L7f
            if (r7 == 0) goto L7d
            com.google.android.gms.internal.ads.zz2 r7 = r6.j     // Catch: android.os.RemoteException -> L44 java.lang.Throwable -> L7f
            r7.c2(r10)     // Catch: android.os.RemoteException -> L44 java.lang.Throwable -> L7f
            goto L7d
        L78:
            java.lang.String r8 = "#007 Could not call remote method."
            com.google.android.gms.internal.ads.tr.e(r8, r7)     // Catch: java.lang.Throwable -> L7f
        L7d:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L7f
            return
        L7f:
            r7 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L7f
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.mx.C8(int, int, boolean, boolean):void");
    }

    public final void D8(m mVar) {
        boolean z = mVar.d;
        boolean z2 = mVar.e;
        boolean z3 = mVar.f;
        synchronized (this.f) {
            this.p = z2;
            this.q = z3;
        }
        F8("initialState", com.google.android.gms.common.util.h.e("muteStart", z ? "1" : "0", "customControlsRequested", z2 ? "1" : "0", "clickToExpandRequested", z3 ? "1" : "0"));
    }

    public final void E8(float f) {
        synchronized (this.f) {
            this.n = f;
        }
    }

    final /* synthetic */ void G8(Map map) {
        this.e.M("pubVideoCmd", map);
    }

    @Override // com.google.android.gms.internal.ads.uz2
    public final zz2 I5() throws RemoteException {
        zz2 zz2Var;
        synchronized (this.f) {
            zz2Var = this.j;
        }
        return zz2Var;
    }

    @Override // com.google.android.gms.internal.ads.uz2
    public final void J4() {
        F8("play", null);
    }

    @Override // com.google.android.gms.internal.ads.uz2
    public final float M() {
        float f;
        synchronized (this.f) {
            f = this.m;
        }
        return f;
    }

    @Override // com.google.android.gms.internal.ads.uz2
    public final int M0() {
        int r1;
        synchronized (this.f) {
            r1 = this.i;
        }
        return r1;
    }

    @Override // com.google.android.gms.internal.ads.uz2
    public final boolean M3() {
        boolean z;
        synchronized (this.f) {
            z = this.l;
        }
        return z;
    }

    @Override // com.google.android.gms.internal.ads.uz2
    public final boolean M4() {
        boolean z;
        synchronized (this.f) {
            z = this.g && this.p;
        }
        return z;
    }

    @Override // com.google.android.gms.internal.ads.uz2
    public final void P7(zz2 zz2Var) {
        synchronized (this.f) {
            this.j = zz2Var;
        }
    }

    @Override // com.google.android.gms.internal.ads.uz2
    public final float X() {
        float f;
        synchronized (this.f) {
            f = this.n;
        }
        return f;
    }

    @Override // com.google.android.gms.internal.ads.uz2
    public final float d0() {
        float f;
        synchronized (this.f) {
            f = this.o;
        }
        return f;
    }

    @Override // com.google.android.gms.internal.ads.uz2
    public final void stop() {
        F8("stop", null);
    }

    @Override // com.google.android.gms.internal.ads.uz2
    public final void t() {
        F8("pause", null);
    }

    public final void v7(x4 x4Var) {
        synchronized (this.f) {
            this.r = x4Var;
        }
    }

    public final void z8(float f, float f2, int r6, boolean z, float f3) {
        boolean z2;
        boolean z3;
        int r5;
        synchronized (this.f) {
            z2 = (f2 == this.m && f3 == this.o) ? false : true;
            this.m = f2;
            this.n = f;
            z3 = this.l;
            this.l = z;
            r5 = this.i;
            this.i = r6;
            float f4 = this.o;
            this.o = f3;
            if (Math.abs(f3 - f4) > 1.0E-4f) {
                this.e.getView().invalidate();
            }
        }
        if (z2) {
            try {
                if (this.r != null) {
                    this.r.Z4();
                }
            } catch (RemoteException e) {
                tr.e("#007 Could not call remote method.", e);
            }
        }
        A8(r5, r6, z3, z);
    }
}

package com.google.firebase.installations;

import android.text.TextUtils;
import androidx.annotation.h0;
import androidx.annotation.i0;
import androidx.annotation.u;
import androidx.annotation.x0;
import com.google.firebase.installations.k;
import com.google.firebase.installations.u.d;
import com.google.firebase.installations.u.e;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes.dex */
public class i implements j {
    private static final String m = "generatefid.lock";
    private static final String n = "CHIME_ANDROID_SDK";
    private static final int o = 0;
    private static final int p = 1;
    private static final long q = 30;

    /* renamed from: a, reason: collision with root package name */
    private final c.a.d.e f6960a;

    /* renamed from: b, reason: collision with root package name */
    private final com.google.firebase.installations.u.c f6961b;

    /* renamed from: c, reason: collision with root package name */
    private final com.google.firebase.installations.t.c f6962c;
    private final r d;
    private final com.google.firebase.installations.t.b e;
    private final p f;
    private final Object g;
    private final ExecutorService h;
    private final ExecutorService i;
    private String j;

    @u("lock")
    private final List<q> k;
    private static final Object l = new Object();
    private static final ThreadFactory r = new a();

    class a implements ThreadFactory {

        /* renamed from: a, reason: collision with root package name */
        private final AtomicInteger f6963a = new AtomicInteger(1);

        a() {
        }

        @Override // java.util.concurrent.ThreadFactory
        public Thread newThread(Runnable runnable) {
            return new Thread(runnable, String.format("firebase-installations-executor-%d", Integer.valueOf(this.f6963a.getAndIncrement())));
        }
    }

    static /* synthetic */ class b {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f6964a;

        /* renamed from: b, reason: collision with root package name */
        static final /* synthetic */ int[] f6965b;

        static {
            int[] r0 = new int[e.b.values().length];
            f6965b = r0;
            try {
                r0[e.b.OK.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f6965b[e.b.BAD_CONFIG.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f6965b[e.b.AUTH_ERROR.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            int[] r2 = new int[d.b.values().length];
            f6964a = r2;
            try {
                r2[d.b.OK.ordinal()] = 1;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f6964a[d.b.BAD_CONFIG.ordinal()] = 2;
            } catch (NoSuchFieldError unused5) {
            }
        }
    }

    i(c.a.d.e eVar, @i0 c.a.d.w.h hVar, @i0 c.a.d.r.c cVar) {
        this(new ThreadPoolExecutor(0, 1, q, TimeUnit.SECONDS, new LinkedBlockingQueue(), r), eVar, new com.google.firebase.installations.u.c(eVar.l(), hVar, cVar), new com.google.firebase.installations.t.c(eVar), new r(), new com.google.firebase.installations.t.b(eVar), new p());
    }

    i(ExecutorService executorService, c.a.d.e eVar, com.google.firebase.installations.u.c cVar, com.google.firebase.installations.t.c cVar2, r rVar, com.google.firebase.installations.t.b bVar, p pVar) {
        this.g = new Object();
        this.j = null;
        this.k = new ArrayList();
        this.f6960a = eVar;
        this.f6961b = cVar;
        this.f6962c = cVar2;
        this.d = rVar;
        this.e = bVar;
        this.f = pVar;
        this.h = executorService;
        this.i = new ThreadPoolExecutor(0, 1, q, TimeUnit.SECONDS, new LinkedBlockingQueue(), r);
    }

    private c.a.b.b.k.m<n> d() {
        c.a.b.b.k.n nVar = new c.a.b.b.k.n();
        m mVar = new m(this.d, nVar);
        synchronized (this.g) {
            this.k.add(mVar);
        }
        return nVar.a();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public Void e() throws k, IOException {
        this.j = null;
        com.google.firebase.installations.t.d dVarN = n();
        if (dVarN.k()) {
            try {
                this.f6961b.e(j(), dVarN.d(), q(), dVarN.f());
            } catch (c.a.d.h unused) {
                throw new k("Failed to delete a Firebase Installation.", k.a.BAD_CONFIG);
            }
        }
        r(dVarN.r());
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void f(boolean z) {
        com.google.firebase.installations.t.d dVarP = p();
        if (z) {
            dVarP = dVarP.p();
        }
        z(dVarP);
        this.i.execute(h.a(this, z));
    }

    private String g() {
        String str = this.j;
        if (str != null) {
            return str;
        }
        com.google.firebase.installations.t.d dVarP = p();
        this.i.execute(g.a(this));
        return dVarP.d();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void h(boolean z) {
        com.google.firebase.installations.t.d dVarX;
        Exception iOException;
        com.google.firebase.installations.t.d dVarN = n();
        try {
            if (dVarN.i() || dVarN.l()) {
                dVarX = x(dVarN);
            } else {
                if (!z && !this.d.b(dVarN)) {
                    return;
                }
                dVarX = i(dVarN);
            }
            r(dVarX);
            if (dVarX.k()) {
                this.j = dVarX.d();
            }
            if (dVarX.i()) {
                iOException = new k(k.a.BAD_CONFIG);
            } else {
                if (!dVarX.j()) {
                    z(dVarX);
                    return;
                }
                iOException = new IOException("cleared fid due to auth error");
            }
            y(dVarX, iOException);
        } catch (IOException e) {
            y(dVarN, e);
        }
    }

    private com.google.firebase.installations.t.d i(@h0 com.google.firebase.installations.t.d dVar) throws IOException {
        com.google.firebase.installations.u.e eVarF = this.f6961b.f(j(), dVar.d(), q(), dVar.f());
        int r1 = b.f6965b[eVarF.b().ordinal()];
        if (r1 == 1) {
            return dVar.o(eVarF.c(), eVarF.d(), this.d.a());
        }
        if (r1 == 2) {
            return dVar.q("BAD CONFIG");
        }
        if (r1 != 3) {
            throw new IOException();
        }
        this.j = null;
        return dVar.r();
    }

    @h0
    public static i l() {
        return m(c.a.d.e.n());
    }

    @h0
    public static i m(@h0 c.a.d.e eVar) {
        com.google.android.gms.common.internal.r.b(eVar != null, "Null is not a valid value of FirebaseApp.");
        return (i) eVar.j(j.class);
    }

    private com.google.firebase.installations.t.d n() {
        com.google.firebase.installations.t.d dVarD;
        synchronized (l) {
            d dVarA = d.a(this.f6960a.l(), m);
            try {
                dVarD = this.f6962c.d();
            } finally {
                if (dVarA != null) {
                    dVarA.b();
                }
            }
        }
        return dVarD;
    }

    private com.google.firebase.installations.t.d p() {
        com.google.firebase.installations.t.d dVarD;
        synchronized (l) {
            d dVarA = d.a(this.f6960a.l(), m);
            try {
                dVarD = this.f6962c.d();
                if (dVarD.j()) {
                    dVarD = this.f6962c.b(dVarD.t(w(dVarD)));
                }
            } finally {
                if (dVarA != null) {
                    dVarA.b();
                }
            }
        }
        return dVarD;
    }

    private void r(com.google.firebase.installations.t.d dVar) {
        synchronized (l) {
            d dVarA = d.a(this.f6960a.l(), m);
            try {
                this.f6962c.b(dVar);
            } finally {
                if (dVarA != null) {
                    dVarA.b();
                }
            }
        }
    }

    private void v() {
        com.google.android.gms.common.internal.r.g(k());
        com.google.android.gms.common.internal.r.g(q());
        com.google.android.gms.common.internal.r.g(j());
        com.google.android.gms.common.internal.r.b(r.d(k()), "Please set your Application ID. A valid Firebase App ID is required to communicate with Firebase server APIs: It identifies your application with Firebase.Please refer to https://firebase.google.com/support/privacy/init-options.");
        com.google.android.gms.common.internal.r.b(r.c(j()), "Please set a valid API key. A Firebase API key is required to communicate with Firebase server APIs: It authenticates your project with Google.Please refer to https://firebase.google.com/support/privacy/init-options.");
    }

    private String w(com.google.firebase.installations.t.d dVar) {
        if ((!this.f6960a.p().equals(n) && !this.f6960a.y()) || !dVar.m()) {
            return this.f.a();
        }
        String strF = this.e.f();
        return TextUtils.isEmpty(strF) ? this.f.a() : strF;
    }

    private com.google.firebase.installations.t.d x(com.google.firebase.installations.t.d dVar) throws IOException {
        com.google.firebase.installations.u.d dVarD = this.f6961b.d(j(), dVar.d(), q(), k(), dVar.d().length() == 11 ? this.e.i() : null);
        int r1 = b.f6964a[dVarD.e().ordinal()];
        if (r1 == 1) {
            return dVar.s(dVarD.c(), dVarD.d(), this.d.a(), dVarD.b().c(), dVarD.b().d());
        }
        if (r1 == 2) {
            return dVar.q("BAD CONFIG");
        }
        throw new IOException();
    }

    private void y(com.google.firebase.installations.t.d dVar, Exception exc) {
        synchronized (this.g) {
            Iterator<q> it = this.k.iterator();
            while (it.hasNext()) {
                if (it.next().a(dVar, exc)) {
                    it.remove();
                }
            }
        }
    }

    private void z(com.google.firebase.installations.t.d dVar) {
        synchronized (this.g) {
            Iterator<q> it = this.k.iterator();
            while (it.hasNext()) {
                if (it.next().b(dVar)) {
                    it.remove();
                }
            }
        }
    }

    @Override // com.google.firebase.installations.j
    @h0
    public c.a.b.b.k.m<String> J() {
        v();
        c.a.b.b.k.n nVar = new c.a.b.b.k.n();
        nVar.e(g());
        return nVar.a();
    }

    @Override // com.google.firebase.installations.j
    @h0
    public c.a.b.b.k.m<n> a(boolean z) {
        v();
        c.a.b.b.k.m<n> mVarD = d();
        this.h.execute(e.a(this, z));
        return mVarD;
    }

    @Override // com.google.firebase.installations.j
    @h0
    public c.a.b.b.k.m<Void> b() {
        return c.a.b.b.k.p.d(this.h, f.a(this));
    }

    @i0
    String j() {
        return this.f6960a.q().i();
    }

    @x0
    String k() {
        return this.f6960a.q().j();
    }

    @x0
    String o() {
        return this.f6960a.p();
    }

    @i0
    String q() {
        return this.f6960a.q().n();
    }
}

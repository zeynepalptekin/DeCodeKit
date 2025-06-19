package com.google.android.gms.ads.e0;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.os.RemoteException;
import android.os.SystemClock;
import android.util.Log;
import androidx.annotation.i0;
import c.a.b.b.d.f;
import c.a.b.b.d.g;
import c.a.b.b.d.h;
import c.a.b.b.g.a.e;
import com.google.android.gms.common.internal.r;
import com.google.android.gms.common.util.d0;
import java.io.IOException;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;
import javax.annotation.ParametersAreNonnullByDefault;
import javax.annotation.concurrent.GuardedBy;

@ParametersAreNonnullByDefault
@com.google.android.gms.common.annotation.a
/* loaded from: classes.dex */
public class a {

    /* renamed from: a, reason: collision with root package name */
    @i0
    @GuardedBy("this")
    private c.a.b.b.d.b f2384a;

    /* renamed from: b, reason: collision with root package name */
    @i0
    @GuardedBy("this")
    private e f2385b;

    /* renamed from: c, reason: collision with root package name */
    @GuardedBy("this")
    private boolean f2386c;
    private final Object d;

    @i0
    @GuardedBy("mAutoDisconnectTaskLock")
    private b e;

    @GuardedBy("this")
    private final Context f;
    private final boolean g;
    private final long h;

    @com.google.android.gms.common.annotation.c
    /* renamed from: com.google.android.gms.ads.e0.a$a, reason: collision with other inner class name */
    public static final class C0160a {

        /* renamed from: a, reason: collision with root package name */
        private final String f2387a;

        /* renamed from: b, reason: collision with root package name */
        private final boolean f2388b;

        public C0160a(String str, boolean z) {
            this.f2387a = str;
            this.f2388b = z;
        }

        public final String a() {
            return this.f2387a;
        }

        public final boolean b() {
            return this.f2388b;
        }

        public final String toString() {
            String str = this.f2387a;
            boolean z = this.f2388b;
            StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 7);
            sb.append("{");
            sb.append(str);
            sb.append("}");
            sb.append(z);
            return sb.toString();
        }
    }

    @d0
    static class b extends Thread {
        private WeakReference<a> d;
        private long e;
        CountDownLatch f = new CountDownLatch(1);
        boolean g = false;

        public b(a aVar, long j) {
            this.d = new WeakReference<>(aVar);
            this.e = j;
            start();
        }

        private final void a() {
            a aVar = this.d.get();
            if (aVar != null) {
                aVar.a();
                this.g = true;
            }
        }

        @Override // java.lang.Thread, java.lang.Runnable
        public final void run() {
            try {
                if (this.f.await(this.e, TimeUnit.MILLISECONDS)) {
                    return;
                }
                a();
            } catch (InterruptedException unused) {
                a();
            }
        }
    }

    @com.google.android.gms.common.annotation.a
    public a(Context context) {
        this(context, 30000L, false, false);
    }

    @d0
    private a(Context context, long j, boolean z, boolean z2) {
        Context applicationContext;
        this.d = new Object();
        r.k(context);
        if (z && (applicationContext = context.getApplicationContext()) != null) {
            context = applicationContext;
        }
        this.f = context;
        this.f2386c = false;
        this.h = j;
        this.g = z2;
    }

    @com.google.android.gms.common.annotation.a
    public static C0160a b(Context context) throws IllegalStateException, g, IOException, h {
        c cVar = new c(context);
        boolean zA = cVar.a("gads:ad_id_app_context:enabled", false);
        float fB = cVar.b("gads:ad_id_app_context:ping_ratio", 0.0f);
        String strC = cVar.c("gads:ad_id_use_shared_preference:experiment_id", "");
        a aVar = new a(context, -1L, zA, cVar.a("gads:ad_id_use_persistent_service:enabled", false));
        try {
            long jElapsedRealtime = SystemClock.elapsedRealtime();
            aVar.j(false);
            C0160a c0160aC = aVar.c();
            aVar.k(c0160aC, zA, fB, SystemClock.elapsedRealtime() - jElapsedRealtime, strC, null);
            return c0160aC;
        } finally {
        }
    }

    @com.google.android.gms.common.annotation.a
    public static boolean d(Context context) throws g, IOException, h {
        c cVar = new c(context);
        a aVar = new a(context, -1L, cVar.a("gads:ad_id_app_context:enabled", false), cVar.a("com.google.android.gms.ads.identifier.service.PERSISTENT_START", false));
        try {
            aVar.j(false);
            return aVar.l();
        } finally {
            aVar.a();
        }
    }

    @com.google.android.gms.common.annotation.a
    public static void e(boolean z) {
    }

    private static c.a.b.b.d.b g(Context context, boolean z) throws PackageManager.NameNotFoundException, g, IOException, h {
        try {
            context.getPackageManager().getPackageInfo("com.android.vending", 0);
            int r0 = f.i().k(context, 12451000);
            if (r0 != 0 && r0 != 2) {
                throw new IOException("Google Play services not available");
            }
            String str = z ? "com.google.android.gms.ads.identifier.service.PERSISTENT_START" : "com.google.android.gms.ads.identifier.service.START";
            c.a.b.b.d.b bVar = new c.a.b.b.d.b();
            Intent intent = new Intent(str);
            intent.setPackage("com.google.android.gms");
            try {
                if (com.google.android.gms.common.stats.a.b().a(context, intent, bVar, 1)) {
                    return bVar;
                }
                throw new IOException("Connection failure");
            } catch (Throwable th) {
                throw new IOException(th);
            }
        } catch (PackageManager.NameNotFoundException unused) {
            throw new g(9);
        }
    }

    @d0
    private static e h(Context context, c.a.b.b.d.b bVar) throws IOException {
        try {
            return c.a.b.b.g.a.f.L0(bVar.b(10000L, TimeUnit.MILLISECONDS));
        } catch (InterruptedException unused) {
            throw new IOException("Interrupted exception");
        } catch (Throwable th) {
            throw new IOException(th);
        }
    }

    private final void i() {
        synchronized (this.d) {
            if (this.e != null) {
                this.e.f.countDown();
                try {
                    this.e.join();
                } catch (InterruptedException unused) {
                }
            }
            if (this.h > 0) {
                this.e = new b(this, this.h);
            }
        }
    }

    @d0
    private final void j(boolean z) throws IllegalStateException, g, IOException, h {
        r.j("Calling this from your main thread can lead to deadlock");
        synchronized (this) {
            if (this.f2386c) {
                a();
            }
            c.a.b.b.d.b bVarG = g(this.f, this.g);
            this.f2384a = bVarG;
            this.f2385b = h(this.f, bVarG);
            this.f2386c = true;
            if (z) {
                i();
            }
        }
    }

    @d0
    private final boolean k(C0160a c0160a, boolean z, float f, long j, String str, Throwable th) {
        if (Math.random() > f) {
            return false;
        }
        HashMap map = new HashMap();
        map.put("app_context", z ? "1" : "0");
        if (c0160a != null) {
            map.put("limit_ad_tracking", c0160a.b() ? "1" : "0");
        }
        if (c0160a != null && c0160a.a() != null) {
            map.put("ad_id_size", Integer.toString(c0160a.a().length()));
        }
        if (th != null) {
            map.put("error", th.getClass().getName());
        }
        if (str != null && !str.isEmpty()) {
            map.put("experiment_id", str);
        }
        map.put("tag", "AdvertisingIdClient");
        map.put("time_spent", Long.toString(j));
        new com.google.android.gms.ads.e0.b(this, map).start();
        return true;
    }

    private final boolean l() throws IOException {
        boolean zC;
        r.j("Calling this from your main thread can lead to deadlock");
        synchronized (this) {
            if (this.f2386c) {
                r.k(this.f2384a);
                r.k(this.f2385b);
                zC = this.f2385b.c();
            } else {
                synchronized (this.d) {
                    if (this.e == null || !this.e.g) {
                        throw new IOException("AdvertisingIdClient is not connected.");
                    }
                }
                try {
                    j(false);
                    if (!this.f2386c) {
                        throw new IOException("AdvertisingIdClient cannot reconnect.");
                    }
                    r.k(this.f2384a);
                    r.k(this.f2385b);
                    try {
                        zC = this.f2385b.c();
                    } catch (RemoteException e) {
                        Log.i("AdvertisingIdClient", "GMS remote exception ", e);
                        throw new IOException("Remote exception");
                    }
                } catch (Exception e2) {
                    throw new IOException("AdvertisingIdClient cannot reconnect.", e2);
                }
            }
        }
        i();
        return zC;
    }

    public final void a() {
        r.j("Calling this from your main thread can lead to deadlock");
        synchronized (this) {
            if (this.f == null || this.f2384a == null) {
                return;
            }
            try {
                if (this.f2386c) {
                    com.google.android.gms.common.stats.a.b().c(this.f, this.f2384a);
                }
            } catch (Throwable th) {
                Log.i("AdvertisingIdClient", "AdvertisingIdClient unbindService failed.", th);
            }
            this.f2386c = false;
            this.f2385b = null;
            this.f2384a = null;
        }
    }

    @com.google.android.gms.common.annotation.a
    public C0160a c() throws IOException {
        C0160a c0160a;
        r.j("Calling this from your main thread can lead to deadlock");
        synchronized (this) {
            if (this.f2386c) {
                r.k(this.f2384a);
                r.k(this.f2385b);
                c0160a = new C0160a(this.f2385b.J(), this.f2385b.o1(true));
            } else {
                synchronized (this.d) {
                    if (this.e == null || !this.e.g) {
                        throw new IOException("AdvertisingIdClient is not connected.");
                    }
                }
                try {
                    j(false);
                    if (!this.f2386c) {
                        throw new IOException("AdvertisingIdClient cannot reconnect.");
                    }
                    r.k(this.f2384a);
                    r.k(this.f2385b);
                    try {
                        c0160a = new C0160a(this.f2385b.J(), this.f2385b.o1(true));
                    } catch (RemoteException e) {
                        Log.i("AdvertisingIdClient", "GMS remote exception ", e);
                        throw new IOException("Remote exception");
                    }
                } catch (Exception e2) {
                    throw new IOException("AdvertisingIdClient cannot reconnect.", e2);
                }
            }
        }
        i();
        return c0160a;
    }

    @com.google.android.gms.common.annotation.a
    public void f() throws IllegalStateException, g, IOException, h {
        j(true);
    }

    protected void finalize() throws Throwable {
        a();
        super.finalize();
    }
}

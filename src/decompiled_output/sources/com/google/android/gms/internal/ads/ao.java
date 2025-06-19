package com.google.android.gms.internal.ads;

import android.annotation.TargetApi;
import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import java.util.ArrayList;
import java.util.concurrent.Callable;
import java.util.concurrent.atomic.AtomicInteger;
import javax.annotation.ParametersAreNonnullByDefault;

@ParametersAreNonnullByDefault
/* loaded from: classes.dex */
public final class ao {

    /* renamed from: b, reason: collision with root package name */
    private lr2 f2723b;
    private Context f;
    private as g;

    @androidx.annotation.u("grantedPermissionLock")
    private dy1<ArrayList<String>> m;

    /* renamed from: a, reason: collision with root package name */
    private final Object f2722a = new Object();

    /* renamed from: c, reason: collision with root package name */
    private final po f2724c = new po();
    private final ho d = new ho(qx2.f(), this.f2724c);
    private boolean e = false;

    @androidx.annotation.i0
    private l0 h = null;

    @androidx.annotation.i0
    private Boolean i = null;
    private final AtomicInteger j = new AtomicInteger(0);
    private final bo k = new bo(null);
    private final Object l = new Object();

    @TargetApi(16)
    private static ArrayList<String> f(Context context) {
        ArrayList<String> arrayList = new ArrayList<>();
        try {
            PackageInfo packageInfoE = c.a.b.b.d.s.c.a(context).e(context.getApplicationInfo().packageName, 4096);
            if (packageInfoE.requestedPermissions != null && packageInfoE.requestedPermissionsFlags != null) {
                int r1 = 0;
                while (true) {
                    String[] strArr = packageInfoE.requestedPermissions;
                    if (r1 >= strArr.length) {
                        break;
                    }
                    if ((packageInfoE.requestedPermissionsFlags[r1] & 2) != 0) {
                        arrayList.add(strArr[r1]);
                    }
                    r1++;
                }
            }
        } catch (PackageManager.NameNotFoundException unused) {
        }
        return arrayList;
    }

    @androidx.annotation.i0
    public final Context a() {
        return this.f;
    }

    @androidx.annotation.i0
    public final Resources b() {
        if (this.g.g) {
            return this.f.getResources();
        }
        try {
            wr.b(this.f).getResources();
            return null;
        } catch (yr e) {
            tr.d("Cannot load resource from dynamite apk or local jar", e);
            return null;
        }
    }

    public final void d(Boolean bool) {
        synchronized (this.f2722a) {
            this.i = bool;
        }
    }

    public final void e(Throwable th, String str) {
        yh.f(this.f, this.g).b(th, str);
    }

    public final void h(Throwable th, String str) {
        yh.f(this.f, this.g).a(th, str, g2.g.a().floatValue());
    }

    @TargetApi(23)
    public final void k(Context context, as asVar) {
        synchronized (this.f2722a) {
            if (!this.e) {
                this.f = context.getApplicationContext();
                this.g = asVar;
                com.google.android.gms.ads.internal.p.f().d(this.d);
                l0 l0Var = null;
                this.f2724c.a(this.f, null, true);
                yh.f(this.f, this.g);
                this.f2723b = new lr2(context.getApplicationContext(), this.g);
                com.google.android.gms.ads.internal.p.l();
                if (t1.f5334c.a().booleanValue()) {
                    l0Var = new l0();
                } else {
                    oo.m("CsiReporterFactory: CSI is not enabled. No CSI reporter created.");
                }
                this.h = l0Var;
                if (l0Var != null) {
                    gs.a(new co(this).c(), "AppState.registerCsiReporter");
                }
                this.e = true;
                s();
            }
        }
        com.google.android.gms.ads.internal.p.c().m0(context, asVar.d);
    }

    @androidx.annotation.i0
    public final l0 l() {
        l0 l0Var;
        synchronized (this.f2722a) {
            l0Var = this.h;
        }
        return l0Var;
    }

    public final Boolean m() {
        Boolean bool;
        synchronized (this.f2722a) {
            bool = this.i;
        }
        return bool;
    }

    public final void n() {
        this.k.a();
    }

    public final void o() {
        this.j.incrementAndGet();
    }

    public final void p() {
        this.j.decrementAndGet();
    }

    public final int q() {
        return this.j.get();
    }

    public final qo r() {
        po poVar;
        synchronized (this.f2722a) {
            poVar = this.f2724c;
        }
        return poVar;
    }

    public final dy1<ArrayList<String>> s() {
        if (com.google.android.gms.common.util.v.e() && this.f != null) {
            if (!((Boolean) qx2.e().c(e0.I1)).booleanValue()) {
                synchronized (this.l) {
                    if (this.m != null) {
                        return this.m;
                    }
                    dy1<ArrayList<String>> dy1VarSubmit = cs.f3023a.submit(new Callable(this) { // from class: com.google.android.gms.internal.ads.zn

                        /* renamed from: a, reason: collision with root package name */
                        private final ao f6292a;

                        {
                            this.f6292a = this;
                        }

                        @Override // java.util.concurrent.Callable
                        public final Object call() {
                            return this.f6292a.u();
                        }
                    });
                    this.m = dy1VarSubmit;
                    return dy1VarSubmit;
                }
            }
        }
        return qx1.g(new ArrayList());
    }

    public final ho t() {
        return this.d;
    }

    final /* synthetic */ ArrayList u() throws Exception {
        return f(rj.c(this.f));
    }
}

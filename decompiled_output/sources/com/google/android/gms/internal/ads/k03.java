package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.RemoteException;
import com.google.android.gms.ads.g0.a;
import com.google.android.gms.ads.mediation.rtb.RtbAdapter;
import com.google.android.gms.ads.x;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.annotation.concurrent.GuardedBy;

/* loaded from: classes.dex */
public class k03 {

    @GuardedBy("InternalMobileAds.class")
    private static k03 i;

    /* renamed from: c, reason: collision with root package name */
    @GuardedBy("lock")
    private xy2 f4040c;
    private com.google.android.gms.ads.k0.c f;
    private com.google.android.gms.ads.g0.b h;

    /* renamed from: b, reason: collision with root package name */
    private final Object f4039b = new Object();
    private boolean d = false;
    private boolean e = false;

    @androidx.annotation.h0
    private com.google.android.gms.ads.x g = new x.a().a();

    /* renamed from: a, reason: collision with root package name */
    private ArrayList<com.google.android.gms.ads.g0.c> f4038a = new ArrayList<>();

    class a extends g8 {
        private a() {
        }

        /* synthetic */ a(k03 k03Var, n03 n03Var) {
            this();
        }

        @Override // com.google.android.gms.internal.ads.d8
        public final void p1(List<a8> list) throws RemoteException {
            int r1 = 0;
            k03.p(k03.this, false);
            k03.q(k03.this, true);
            com.google.android.gms.ads.g0.b bVarK = k03.k(k03.this, list);
            ArrayList arrayList = k03.v().f4038a;
            int size = arrayList.size();
            while (r1 < size) {
                Object obj = arrayList.get(r1);
                r1++;
                ((com.google.android.gms.ads.g0.c) obj).a(bVarK);
            }
            k03.v().f4038a.clear();
        }
    }

    private k03() {
    }

    static /* synthetic */ com.google.android.gms.ads.g0.b k(k03 k03Var, List list) {
        return r(list);
    }

    @GuardedBy("lock")
    private final void n(@androidx.annotation.h0 com.google.android.gms.ads.x xVar) {
        try {
            this.f4040c.w2(new g(xVar));
        } catch (RemoteException e) {
            tr.c("Unable to set request configuration parcel.", e);
        }
    }

    static /* synthetic */ boolean p(k03 k03Var, boolean z) {
        k03Var.d = false;
        return false;
    }

    static /* synthetic */ boolean q(k03 k03Var, boolean z) {
        k03Var.e = true;
        return true;
    }

    private static com.google.android.gms.ads.g0.b r(List<a8> list) {
        HashMap map = new HashMap();
        for (a8 a8Var : list) {
            map.put(a8Var.d, new i8(a8Var.e ? a.EnumC0162a.READY : a.EnumC0162a.NOT_READY, a8Var.g, a8Var.f));
        }
        return new h8(map);
    }

    @GuardedBy("lock")
    private final void s(Context context) {
        if (this.f4040c == null) {
            this.f4040c = new nx2(qx2.b(), context).b(context, false);
        }
    }

    public static k03 v() {
        k03 k03Var;
        synchronized (k03.class) {
            if (i == null) {
                i = new k03();
            }
            k03Var = i;
        }
        return k03Var;
    }

    public final void a(Context context) {
        synchronized (this.f4039b) {
            s(context);
            try {
                this.f4040c.c4();
            } catch (RemoteException unused) {
                tr.g("Unable to disable mediation adapter initialization.");
            }
        }
    }

    public final com.google.android.gms.ads.g0.b b() {
        synchronized (this.f4039b) {
            com.google.android.gms.common.internal.r.r(this.f4040c != null, "MobileAds.initialize() must be called prior to getting initialization status.");
            try {
                if (this.h != null) {
                    return this.h;
                }
                return r(this.f4040c.g6());
            } catch (RemoteException unused) {
                tr.g("Unable to get Initialization status.");
                return null;
            }
        }
    }

    @androidx.annotation.h0
    public final com.google.android.gms.ads.x c() {
        return this.g;
    }

    public final com.google.android.gms.ads.k0.c d(Context context) {
        synchronized (this.f4039b) {
            if (this.f != null) {
                return this.f;
            }
            jk jkVar = new jk(context, new ox2(qx2.b(), context, new rc()).b(context, false));
            this.f = jkVar;
            return jkVar;
        }
    }

    public final String e() {
        String strD;
        synchronized (this.f4039b) {
            com.google.android.gms.common.internal.r.r(this.f4040c != null, "MobileAds.initialize() must be called prior to getting version string.");
            try {
                strD = dv1.d(this.f4040c.i8());
            } catch (RemoteException e) {
                tr.c("Unable to get version string.", e);
                return "";
            }
        }
        return strD;
    }

    public final void f(Context context, String str) {
        synchronized (this.f4039b) {
            com.google.android.gms.common.internal.r.r(this.f4040c != null, "MobileAds.initialize() must be called prior to opening debug menu.");
            try {
                this.f4040c.T1(c.a.b.b.e.e.i2(context), str);
            } catch (RemoteException e) {
                tr.c("Unable to open debug menu.", e);
            }
        }
    }

    public final void g(Class<? extends RtbAdapter> cls) {
        synchronized (this.f4039b) {
            try {
                this.f4040c.t7(cls.getCanonicalName());
            } catch (RemoteException e) {
                tr.c("Unable to register RtbAdapter", e);
            }
        }
    }

    public final void h(boolean z) {
        synchronized (this.f4039b) {
            com.google.android.gms.common.internal.r.r(this.f4040c != null, "MobileAds.initialize() must be called prior to setting app muted state.");
            try {
                this.f4040c.L4(z);
            } catch (RemoteException e) {
                tr.c("Unable to set app mute state.", e);
            }
        }
    }

    public final void i(float f) {
        boolean z = true;
        com.google.android.gms.common.internal.r.b(0.0f <= f && f <= 1.0f, "The app volume must be a value between 0 and 1 inclusive.");
        synchronized (this.f4039b) {
            if (this.f4040c == null) {
                z = false;
            }
            com.google.android.gms.common.internal.r.r(z, "MobileAds.initialize() must be called prior to setting the app volume.");
            try {
                this.f4040c.b5(f);
            } catch (RemoteException e) {
                tr.c("Unable to set app volume.", e);
            }
        }
    }

    public final void j(@androidx.annotation.h0 com.google.android.gms.ads.x xVar) {
        com.google.android.gms.common.internal.r.b(xVar != null, "Null passed to setRequestConfiguration.");
        synchronized (this.f4039b) {
            com.google.android.gms.ads.x xVar2 = this.g;
            this.g = xVar;
            if (this.f4040c == null) {
                return;
            }
            if (xVar2.b() != xVar.b() || xVar2.c() != xVar.c()) {
                n(xVar);
            }
        }
    }

    public final void m(final Context context, String str, final com.google.android.gms.ads.g0.c cVar) {
        synchronized (this.f4039b) {
            if (this.d) {
                if (cVar != null) {
                    v().f4038a.add(cVar);
                }
                return;
            }
            if (this.e) {
                if (cVar != null) {
                    cVar.a(b());
                }
                return;
            }
            this.d = true;
            if (cVar != null) {
                v().f4038a.add(cVar);
            }
            if (context == null) {
                throw new IllegalArgumentException("Context cannot be null.");
            }
            try {
                hc.g().b(context, str);
                s(context);
                if (cVar != null) {
                    this.f4040c.G4(new a(this, null));
                }
                this.f4040c.S1(new rc());
                this.f4040c.E0();
                this.f4040c.u8(str, c.a.b.b.e.e.i2(new Runnable(this, context) { // from class: com.google.android.gms.internal.ads.j03
                    private final k03 d;
                    private final Context e;

                    {
                        this.d = this;
                        this.e = context;
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        this.d.d(this.e);
                    }
                }));
                if (this.g.b() != -1 || this.g.c() != -1) {
                    n(this.g);
                }
                e0.a(context);
                if (!((Boolean) qx2.e().c(e0.y3)).booleanValue() && !e().endsWith("0")) {
                    tr.g("Google Mobile Ads SDK initialization functionality unavailable for this session. Ad requests can be made at any time.");
                    this.h = new com.google.android.gms.ads.g0.b(this) { // from class: com.google.android.gms.internal.ads.l03

                        /* renamed from: a, reason: collision with root package name */
                        private final k03 f4175a;

                        {
                            this.f4175a = this;
                        }

                        @Override // com.google.android.gms.ads.g0.b
                        public final Map a() {
                            k03 k03Var = this.f4175a;
                            HashMap map = new HashMap();
                            map.put("com.google.android.gms.ads.MobileAds", new n03(k03Var));
                            return map;
                        }
                    };
                    if (cVar != null) {
                        jr.f4014b.post(new Runnable(this, cVar) { // from class: com.google.android.gms.internal.ads.m03
                            private final k03 d;
                            private final com.google.android.gms.ads.g0.c e;

                            {
                                this.d = this;
                                this.e = cVar;
                            }

                            @Override // java.lang.Runnable
                            public final void run() {
                                this.d.o(this.e);
                            }
                        });
                    }
                }
            } catch (RemoteException e) {
                tr.d("MobileAdsSettingManager initialization failed", e);
            }
        }
    }

    final /* synthetic */ void o(com.google.android.gms.ads.g0.c cVar) {
        cVar.a(this.h);
    }

    public final float t() {
        synchronized (this.f4039b) {
            float fM2 = 1.0f;
            if (this.f4040c == null) {
                return 1.0f;
            }
            try {
                fM2 = this.f4040c.M2();
            } catch (RemoteException e) {
                tr.c("Unable to get app volume.", e);
            }
            return fM2;
        }
    }

    public final boolean u() {
        synchronized (this.f4039b) {
            boolean zR7 = false;
            if (this.f4040c == null) {
                return false;
            }
            try {
                zR7 = this.f4040c.R7();
            } catch (RemoteException e) {
                tr.c("Unable to get app mute state.", e);
            }
            return zR7;
        }
    }
}

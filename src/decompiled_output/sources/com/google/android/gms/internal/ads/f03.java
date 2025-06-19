package com.google.android.gms.internal.ads;

import android.location.Location;
import android.os.Bundle;
import android.text.TextUtils;
import com.google.ads.mediation.admob.AdMobAdapter;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;

/* loaded from: classes.dex */
public final class f03 {
    private Date g;
    private String h;
    private Location k;
    private String m;
    private String n;
    private boolean p;
    private com.google.android.gms.ads.j0.a q;
    private String s;

    /* renamed from: a, reason: collision with root package name */
    private final HashSet<String> f3349a = new HashSet<>();

    /* renamed from: b, reason: collision with root package name */
    private final Bundle f3350b = new Bundle();

    /* renamed from: c, reason: collision with root package name */
    private final HashMap<Class<? extends com.google.android.gms.ads.mediation.b0>, com.google.android.gms.ads.mediation.b0> f3351c = new HashMap<>();
    private final HashSet<String> d = new HashSet<>();
    private final Bundle e = new Bundle();
    private final HashSet<String> f = new HashSet<>();
    private final List<String> i = new ArrayList();
    private int j = -1;
    private boolean l = false;
    private int o = -1;
    private int r = -1;

    @Deprecated
    public final void N(boolean z) {
        this.o = z ? 1 : 0;
    }

    public final void a(boolean z) {
        this.l = z;
    }

    public final void c(Location location) {
        this.k = location;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Deprecated
    public final void d(com.google.android.gms.ads.mediation.b0 b0Var) {
        if (b0Var instanceof com.google.android.gms.ads.mediation.g0.a) {
            f(AdMobAdapter.class, ((com.google.android.gms.ads.mediation.g0.a) b0Var).a());
        } else {
            this.f3351c.put(b0Var.getClass(), b0Var);
        }
    }

    public final void e(com.google.android.gms.ads.j0.a aVar) {
        this.q = aVar;
    }

    public final void f(Class<? extends com.google.android.gms.ads.mediation.m> cls, Bundle bundle) {
        this.f3350b.putBundle(cls.getName(), bundle);
    }

    @Deprecated
    public final void g(Date date) {
        this.g = date;
    }

    @Deprecated
    public final void h(boolean z) {
        this.p = z;
    }

    public final void j(Class<? extends com.google.android.gms.ads.mediation.customevent.a> cls, Bundle bundle) {
        if (this.f3350b.getBundle("com.google.android.gms.ads.mediation.customevent.CustomEventAdapter") == null) {
            this.f3350b.putBundle("com.google.android.gms.ads.mediation.customevent.CustomEventAdapter", new Bundle());
        }
        this.f3350b.getBundle("com.google.android.gms.ads.mediation.customevent.CustomEventAdapter").putBundle(cls.getName(), bundle);
    }

    public final void l(List<String> list) {
        this.i.clear();
        for (String str : list) {
            if (TextUtils.isEmpty(str)) {
                tr.i("neighboring content URL should not be null or empty");
            } else {
                this.i.add(str);
            }
        }
    }

    public final void m(String str) {
        this.f3349a.add(str);
    }

    public final void n(String str) {
        this.d.add(str);
    }

    public final void o(String str) {
        this.d.remove(str);
    }

    public final void p(String str) {
        this.h = str;
    }

    public final void q(String str) {
        this.m = str;
    }

    public final void r(String str) {
        this.n = str;
    }

    public final void s(String str) {
        this.f.add(str);
    }

    @Deprecated
    public final void t(String str) {
        if ("G".equals(str) || "PG".equals(str) || "T".equals(str) || "MA".equals(str)) {
            this.s = str;
        }
    }

    @Deprecated
    public final void v(int r1) {
        this.j = r1;
    }

    @Deprecated
    public final void w(int r2) {
        if (r2 == -1 || r2 == 0 || r2 == 1) {
            this.r = r2;
        }
    }

    public final void y(String str, String str2) {
        this.e.putString(str, str2);
    }
}

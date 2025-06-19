package com.google.android.gms.ads;

import android.content.Context;
import android.location.Location;
import android.os.Bundle;
import com.google.ads.mediation.admob.AdMobAdapter;
import com.google.android.gms.ads.mediation.b0;
import com.google.android.gms.common.util.d0;
import com.google.android.gms.internal.ads.c03;
import com.google.android.gms.internal.ads.f03;
import com.google.android.gms.internal.ads.tr;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.Date;
import java.util.List;
import java.util.Set;

@d0
/* loaded from: classes.dex */
public final class e {

    /* renamed from: b, reason: collision with root package name */
    public static final int f2380b = 0;

    /* renamed from: c, reason: collision with root package name */
    public static final int f2381c = 1;
    public static final int d = 2;
    public static final int e = 3;
    public static final int f = 8;
    public static final int g = 9;
    public static final int h = 0;
    public static final int i = 1;
    public static final int j = 2;

    @Deprecated
    public static final int k = 1;

    @Deprecated
    public static final int l = 0;

    @Deprecated
    public static final int m = -1;

    @Deprecated
    public static final String n = "G";

    @Deprecated
    public static final String o = "PG";

    @Deprecated
    public static final String p = "T";

    @Deprecated
    public static final String q = "MA";
    public static final int r = 512;
    public static final String s = "B3EEABB8EE11C2BE770B684D95219ECB";

    /* renamed from: a, reason: collision with root package name */
    private final c03 f2382a;

    @d0
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        private final f03 f2383a;

        public a() {
            f03 f03Var = new f03();
            this.f2383a = f03Var;
            f03Var.n("B3EEABB8EE11C2BE770B684D95219ECB");
        }

        public final a a(Class<? extends com.google.android.gms.ads.mediation.customevent.a> cls, Bundle bundle) {
            this.f2383a.j(cls, bundle);
            return this;
        }

        public final a b(String str) {
            this.f2383a.m(str);
            return this;
        }

        public final a c(b0 b0Var) {
            this.f2383a.d(b0Var);
            return this;
        }

        public final a d(Class<? extends com.google.android.gms.ads.mediation.m> cls, Bundle bundle) {
            this.f2383a.f(cls, bundle);
            if (cls.equals(AdMobAdapter.class) && bundle.getBoolean("_emulatorLiveAds")) {
                this.f2383a.o("B3EEABB8EE11C2BE770B684D95219ECB");
            }
            return this;
        }

        @Deprecated
        public final a e(String str) {
            this.f2383a.n(str);
            return this;
        }

        public final e f() {
            return new e(this);
        }

        @com.google.android.gms.common.annotation.a
        public final a g(com.google.android.gms.ads.j0.a aVar) {
            this.f2383a.e(aVar);
            return this;
        }

        @Deprecated
        public final a h(Date date) {
            this.f2383a.g(date);
            return this;
        }

        public final a i(String str) {
            com.google.android.gms.common.internal.r.l(str, "Content URL must be non-null.");
            com.google.android.gms.common.internal.r.h(str, "Content URL must be non-empty.");
            com.google.android.gms.common.internal.r.c(str.length() <= 512, "Content URL must not exceed %d in length.  Provided length was %d.", 512, Integer.valueOf(str.length()));
            this.f2383a.p(str);
            return this;
        }

        @Deprecated
        public final a j(int r2) {
            this.f2383a.v(r2);
            return this;
        }

        @Deprecated
        public final a k(boolean z) {
            this.f2383a.h(z);
            return this;
        }

        public final a l(Location location) {
            this.f2383a.c(location);
            return this;
        }

        @Deprecated
        public final a m(String str) {
            this.f2383a.t(str);
            return this;
        }

        public final a n(List<String> list) {
            if (list == null) {
                tr.i("neighboring content URLs list should not be null");
                return this;
            }
            this.f2383a.l(list);
            return this;
        }

        public final a o(String str) {
            this.f2383a.r(str);
            return this;
        }

        @Deprecated
        public final a p(int r2) {
            this.f2383a.w(r2);
            return this;
        }

        @Deprecated
        public final a q(boolean z) {
            this.f2383a.N(z);
            return this;
        }
    }

    @Retention(RetentionPolicy.SOURCE)
    @Deprecated
    public @interface b {
    }

    @Retention(RetentionPolicy.SOURCE)
    @Deprecated
    public @interface c {
    }

    private e(a aVar) {
        this.f2382a = new c03(aVar.f2383a);
    }

    @Deprecated
    public final Date a() {
        return this.f2382a.a();
    }

    public final String b() {
        return this.f2382a.b();
    }

    public final <T extends com.google.android.gms.ads.mediation.customevent.a> Bundle c(Class<T> cls) {
        return this.f2382a.c(cls);
    }

    @Deprecated
    public final int d() {
        return this.f2382a.e();
    }

    public final Set<String> e() {
        return this.f2382a.f();
    }

    public final Location f() {
        return this.f2382a.g();
    }

    public final List<String> g() {
        return this.f2382a.o();
    }

    @Deprecated
    public final <T extends b0> T h(Class<T> cls) {
        return (T) this.f2382a.j(cls);
    }

    public final <T extends com.google.android.gms.ads.mediation.m> Bundle i(Class<T> cls) {
        return this.f2382a.k(cls);
    }

    public final boolean j(Context context) {
        return this.f2382a.n(context);
    }

    public final c03 k() {
        return this.f2382a;
    }
}

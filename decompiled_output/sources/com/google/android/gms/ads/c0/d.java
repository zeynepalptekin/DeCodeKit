package com.google.android.gms.ads.c0;

import android.content.Context;
import android.location.Location;
import android.os.Bundle;
import android.text.TextUtils;
import com.google.android.gms.ads.mediation.b0;
import com.google.android.gms.ads.mediation.m;
import com.google.android.gms.common.internal.r;
import com.google.android.gms.common.util.d0;
import com.google.android.gms.internal.ads.c03;
import com.google.android.gms.internal.ads.f03;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.Date;
import java.util.List;
import java.util.Set;

@d0
/* loaded from: classes.dex */
public final class d {

    /* renamed from: b, reason: collision with root package name */
    public static final int f2347b = 0;

    /* renamed from: c, reason: collision with root package name */
    public static final int f2348c = 1;
    public static final int d = 2;
    public static final int e = 3;
    public static final int f = 0;
    public static final int g = 1;
    public static final int h = 2;

    @Deprecated
    public static final int i = 1;

    @Deprecated
    public static final int j = 0;

    @Deprecated
    public static final int k = -1;

    @Deprecated
    public static final String l = "G";

    @Deprecated
    public static final String m = "PG";

    @Deprecated
    public static final String n = "T";

    @Deprecated
    public static final String o = "MA";
    public static final String p = "B3EEABB8EE11C2BE770B684D95219ECB";

    /* renamed from: a, reason: collision with root package name */
    private final c03 f2349a;

    @d0
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        private final f03 f2350a = new f03();

        public final a a(String str) {
            this.f2350a.s(str);
            return this;
        }

        public final a b(Class<? extends com.google.android.gms.ads.mediation.customevent.a> cls, Bundle bundle) {
            this.f2350a.j(cls, bundle);
            return this;
        }

        public final a c(String str, String str2) {
            this.f2350a.y(str, str2);
            return this;
        }

        public final a d(String str, List<String> list) {
            if (list != null) {
                this.f2350a.y(str, TextUtils.join(",", list));
            }
            return this;
        }

        public final a e(String str) {
            this.f2350a.m(str);
            return this;
        }

        public final a f(b0 b0Var) {
            this.f2350a.d(b0Var);
            return this;
        }

        public final a g(Class<? extends m> cls, Bundle bundle) {
            this.f2350a.f(cls, bundle);
            return this;
        }

        @Deprecated
        public final a h(String str) {
            this.f2350a.n(str);
            return this;
        }

        public final d i() {
            return new d(this);
        }

        @com.google.android.gms.common.annotation.a
        public final a j(com.google.android.gms.ads.j0.a aVar) {
            this.f2350a.e(aVar);
            return this;
        }

        @Deprecated
        public final a k(Date date) {
            this.f2350a.g(date);
            return this;
        }

        public final a l(String str) {
            r.l(str, "Content URL must be non-null.");
            r.h(str, "Content URL must be non-empty.");
            r.c(str.length() <= 512, "Content URL must not exceed %d in length.  Provided length was %d.", 512, Integer.valueOf(str.length()));
            this.f2350a.p(str);
            return this;
        }

        @Deprecated
        public final a m(int r2) {
            this.f2350a.v(r2);
            return this;
        }

        @Deprecated
        public final a n(boolean z) {
            this.f2350a.h(z);
            return this;
        }

        public final a o(Location location) {
            this.f2350a.c(location);
            return this;
        }

        @Deprecated
        public final a p(boolean z) {
            this.f2350a.a(z);
            return this;
        }

        @Deprecated
        public final a q(String str) {
            this.f2350a.t(str);
            return this;
        }

        public final a r(String str) {
            this.f2350a.q(str);
            return this;
        }

        public final a s(String str) {
            this.f2350a.r(str);
            return this;
        }

        @Deprecated
        public final a t(int r2) {
            this.f2350a.w(r2);
            return this;
        }

        @Deprecated
        public final a u(boolean z) {
            this.f2350a.N(z);
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

    private d(a aVar) {
        this.f2349a = new c03(aVar.f2350a);
    }

    @com.google.android.gms.common.annotation.a
    @Deprecated
    public static void m() {
    }

    @Deprecated
    public final Date a() {
        return this.f2349a.a();
    }

    public final String b() {
        return this.f2349a.b();
    }

    public final <T extends com.google.android.gms.ads.mediation.customevent.a> Bundle c(Class<T> cls) {
        return this.f2349a.c(cls);
    }

    public final Bundle d() {
        return this.f2349a.d();
    }

    @Deprecated
    public final int e() {
        return this.f2349a.e();
    }

    public final Set<String> f() {
        return this.f2349a.f();
    }

    public final Location g() {
        return this.f2349a.g();
    }

    public final boolean h() {
        return this.f2349a.h();
    }

    @Deprecated
    public final <T extends b0> T i(Class<T> cls) {
        return (T) this.f2349a.j(cls);
    }

    public final <T extends m> Bundle j(Class<T> cls) {
        return this.f2349a.k(cls);
    }

    public final String k() {
        return this.f2349a.l();
    }

    public final boolean l(Context context) {
        return this.f2349a.n(context);
    }

    public final c03 n() {
        return this.f2349a;
    }
}

package com.google.android.gms.ads.n0;

import android.content.Context;
import android.location.Location;
import android.os.Bundle;
import com.google.android.gms.ads.mediation.b0;
import com.google.android.gms.ads.mediation.g;
import com.google.android.gms.internal.ads.c03;
import com.google.android.gms.internal.ads.f03;

@Deprecated
/* loaded from: classes.dex */
public final class b {

    /* renamed from: c, reason: collision with root package name */
    public static final int f2476c = 0;
    public static final int d = 1;
    public static final int e = 2;
    public static final int f = 3;
    public static final String g = "B3EEABB8EE11C2BE770B684D95219ECB";
    public static final int h = 0;
    public static final int i = 1;
    public static final int j = 2;
    public static final int k = 3;
    public static final int l = 0;
    public static final int m = 1;
    public static final int n = 2;

    /* renamed from: a, reason: collision with root package name */
    private final c03 f2477a;

    /* renamed from: b, reason: collision with root package name */
    private final String f2478b;

    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        private final f03 f2479a = new f03();

        /* renamed from: b, reason: collision with root package name */
        private String f2480b;

        public final a a(Class<? extends com.google.android.gms.ads.mediation.customevent.a> cls, Bundle bundle) {
            this.f2479a.j(cls, bundle);
            return this;
        }

        public final a b(b0 b0Var) {
            this.f2479a.d(b0Var);
            return this;
        }

        public final a c(Class<? extends g> cls, Bundle bundle) {
            this.f2479a.f(cls, bundle);
            return this;
        }

        @Deprecated
        public final a d(String str) {
            this.f2479a.n(str);
            return this;
        }

        public final b e() {
            return new b(this);
        }

        @Deprecated
        public final a f(int r1) {
            return this;
        }

        @Deprecated
        public final a g(int r1) {
            return this;
        }

        @Deprecated
        public final a h(int r1, int r2) {
            return this;
        }

        @Deprecated
        public final a i(int r1) {
            return this;
        }

        @Deprecated
        public final a j(int r1) {
            return this;
        }

        @Deprecated
        public final a k(int r1) {
            return this;
        }

        @Deprecated
        public final a l(int r1) {
            return this;
        }

        @Deprecated
        public final a m(String str) {
            return this;
        }

        @Deprecated
        public final a n(int r1) {
            return this;
        }

        @Deprecated
        public final a o(String str) {
            return this;
        }

        @Deprecated
        public final a p(int r1) {
            return this;
        }

        @Deprecated
        public final a q(int r1) {
            return this;
        }

        public final a r(Location location) {
            this.f2479a.c(location);
            return this;
        }

        public final a s(String str) {
            this.f2480b = str;
            return this;
        }

        public final a t(String str) {
            this.f2479a.r(str);
            return this;
        }

        public final a u(boolean z) {
            this.f2479a.N(z);
            return this;
        }
    }

    private b(a aVar) {
        this.f2478b = aVar.f2480b;
        this.f2477a = new c03(aVar.f2479a, this);
    }

    @Deprecated
    public final int a() {
        return 0;
    }

    @Deprecated
    public final int b() {
        return 0;
    }

    @Deprecated
    public final int c() {
        return 0;
    }

    @Deprecated
    public final int d() {
        return 0;
    }

    @Deprecated
    public final int e() {
        return 0;
    }

    @Deprecated
    public final int f() {
        return 0;
    }

    @Deprecated
    public final int g() {
        return 0;
    }

    @Deprecated
    public final int h() {
        return 0;
    }

    @Deprecated
    public final String i() {
        return null;
    }

    public final <T extends com.google.android.gms.ads.mediation.customevent.a> Bundle j(Class<T> cls) {
        return this.f2477a.c(cls);
    }

    @Deprecated
    public final int k() {
        return 0;
    }

    @Deprecated
    public final String l() {
        return null;
    }

    @Deprecated
    public final int m() {
        return 0;
    }

    @Deprecated
    public final int n() {
        return 0;
    }

    public final Location o() {
        return this.f2477a.g();
    }

    @Deprecated
    public final <T extends b0> T p(Class<T> cls) {
        return (T) this.f2477a.j(cls);
    }

    public final <T extends g> Bundle q(Class<T> cls) {
        return this.f2477a.k(cls);
    }

    public final String r() {
        return this.f2478b;
    }

    public final boolean s(Context context) {
        return this.f2477a.n(context);
    }

    final c03 t() {
        return this.f2477a;
    }
}

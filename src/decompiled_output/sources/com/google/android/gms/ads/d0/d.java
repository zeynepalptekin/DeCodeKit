package com.google.android.gms.ads.d0;

import androidx.annotation.i0;
import com.google.android.gms.ads.a0;

/* loaded from: classes.dex */
public final class d {

    @Deprecated
    public static final int h = 0;

    @Deprecated
    public static final int i = 1;

    @Deprecated
    public static final int j = 2;
    public static final int k = 0;
    public static final int l = 1;
    public static final int m = 2;
    public static final int n = 3;
    public static final int o = 4;
    public static final int p = 0;
    public static final int q = 1;
    public static final int r = 2;
    public static final int s = 3;

    /* renamed from: a, reason: collision with root package name */
    private final boolean f2358a;

    /* renamed from: b, reason: collision with root package name */
    private final int f2359b;

    /* renamed from: c, reason: collision with root package name */
    private final int f2360c;
    private final boolean d;
    private final int e;
    private final a0 f;
    private final boolean g;

    public @interface a {
    }

    public static final class b {
        private a0 e;

        /* renamed from: a, reason: collision with root package name */
        private boolean f2361a = false;

        /* renamed from: b, reason: collision with root package name */
        private int f2362b = -1;

        /* renamed from: c, reason: collision with root package name */
        private int f2363c = 0;
        private boolean d = false;
        private int f = 1;
        private boolean g = false;

        public final d a() {
            return new d(this);
        }

        public final b b(@a int r1) {
            this.f = r1;
            return this;
        }

        @Deprecated
        public final b c(int r1) {
            this.f2362b = r1;
            return this;
        }

        public final b d(@c int r1) {
            this.f2363c = r1;
            return this;
        }

        public final b e(boolean z) {
            this.g = z;
            return this;
        }

        public final b f(boolean z) {
            this.d = z;
            return this;
        }

        public final b g(boolean z) {
            this.f2361a = z;
            return this;
        }

        public final b h(a0 a0Var) {
            this.e = a0Var;
            return this;
        }
    }

    public @interface c {
    }

    private d(b bVar) {
        this.f2358a = bVar.f2361a;
        this.f2359b = bVar.f2362b;
        this.f2360c = bVar.f2363c;
        this.d = bVar.d;
        this.e = bVar.f;
        this.f = bVar.e;
        this.g = bVar.g;
    }

    public final int a() {
        return this.e;
    }

    @Deprecated
    public final int b() {
        return this.f2359b;
    }

    public final int c() {
        return this.f2360c;
    }

    @i0
    public final a0 d() {
        return this.f;
    }

    public final boolean e() {
        return this.d;
    }

    public final boolean f() {
        return this.f2358a;
    }

    public final boolean g() {
        return this.g;
    }
}

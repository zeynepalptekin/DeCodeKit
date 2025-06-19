package com.google.android.gms.ads;

/* loaded from: classes.dex */
public final class a0 {

    /* renamed from: a, reason: collision with root package name */
    private final boolean f2339a;

    /* renamed from: b, reason: collision with root package name */
    private final boolean f2340b;

    /* renamed from: c, reason: collision with root package name */
    private final boolean f2341c;

    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        private boolean f2342a = true;

        /* renamed from: b, reason: collision with root package name */
        private boolean f2343b = false;

        /* renamed from: c, reason: collision with root package name */
        private boolean f2344c = false;

        public final a0 a() {
            return new a0(this);
        }

        public final a b(boolean z) {
            this.f2344c = z;
            return this;
        }

        public final a c(boolean z) {
            this.f2343b = z;
            return this;
        }

        public final a d(boolean z) {
            this.f2342a = z;
            return this;
        }
    }

    private a0(a aVar) {
        this.f2339a = aVar.f2342a;
        this.f2340b = aVar.f2343b;
        this.f2341c = aVar.f2344c;
    }

    public a0(com.google.android.gms.internal.ads.m mVar) {
        this.f2339a = mVar.d;
        this.f2340b = mVar.e;
        this.f2341c = mVar.f;
    }

    public final boolean a() {
        return this.f2341c;
    }

    public final boolean b() {
        return this.f2340b;
    }

    public final boolean c() {
        return this.f2339a;
    }
}

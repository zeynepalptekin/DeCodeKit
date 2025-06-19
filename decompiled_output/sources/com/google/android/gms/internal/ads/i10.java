package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
public class i10 {

    /* renamed from: a, reason: collision with root package name */
    private a f3746a;

    public static abstract class a {
        public abstract aw a();

        public abstract jt b();

        public abstract yu2 c();

        public abstract km d();

        public abstract bh e();

        public abstract gc f();

        public abstract k1 g();
    }

    public i10(a aVar) {
        this.f3746a = aVar;
    }

    public final km a() {
        return this.f3746a.d();
    }

    public final bh b() {
        return this.f3746a.e();
    }

    public final gc c() {
        return this.f3746a.f();
    }

    public final k1 d() {
        return this.f3746a.g();
    }

    /* JADX WARN: Type inference failed for: r4v0, types: [com.google.android.gms.internal.ads.bm, com.google.android.gms.internal.ads.hm] */
    public final com.google.android.gms.ads.internal.b e() {
        a aVar = this.f3746a;
        return new com.google.android.gms.ads.internal.b(aVar.a(), aVar.b(), new bm(aVar.d()), aVar.c(), aVar.e(), aVar.g());
    }
}

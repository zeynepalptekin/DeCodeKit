package com.google.android.gms.ads.l0;

/* loaded from: classes.dex */
public class f {

    /* renamed from: a, reason: collision with root package name */
    private final String f2436a;

    /* renamed from: b, reason: collision with root package name */
    private final String f2437b;

    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        private String f2438a = "";

        /* renamed from: b, reason: collision with root package name */
        private String f2439b = "";

        public final f a() {
            return new f(this);
        }

        public final a b(String str) {
            this.f2439b = str;
            return this;
        }

        public final a c(String str) {
            this.f2438a = str;
            return this;
        }
    }

    private f(a aVar) {
        this.f2436a = aVar.f2438a;
        this.f2437b = aVar.f2439b;
    }

    public String a() {
        return this.f2437b;
    }

    public String b() {
        return this.f2436a;
    }
}

package com.google.firebase.components;

/* loaded from: classes.dex */
public final class p {

    /* renamed from: a, reason: collision with root package name */
    private final Class<?> f6932a;

    /* renamed from: b, reason: collision with root package name */
    private final int f6933b;

    /* renamed from: c, reason: collision with root package name */
    private final int f6934c;

    private p(Class<?> cls, int r3, int r4) {
        this.f6932a = (Class) w.c(cls, "Null dependency anInterface.");
        this.f6933b = r3;
        this.f6934c = r4;
    }

    public static p e(Class<?> cls) {
        return new p(cls, 0, 0);
    }

    public static p f(Class<?> cls) {
        return new p(cls, 0, 1);
    }

    public static p g(Class<?> cls) {
        return new p(cls, 1, 0);
    }

    public static p h(Class<?> cls) {
        return new p(cls, 1, 1);
    }

    public static p i(Class<?> cls) {
        return new p(cls, 2, 0);
    }

    public static p j(Class<?> cls) {
        return new p(cls, 2, 1);
    }

    public Class<?> a() {
        return this.f6932a;
    }

    public boolean b() {
        return this.f6934c == 0;
    }

    public boolean c() {
        return this.f6933b == 1;
    }

    public boolean d() {
        return this.f6933b == 2;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof p)) {
            return false;
        }
        p pVar = (p) obj;
        return this.f6932a == pVar.f6932a && this.f6933b == pVar.f6933b && this.f6934c == pVar.f6934c;
    }

    public int hashCode() {
        return ((((this.f6932a.hashCode() ^ 1000003) * 1000003) ^ this.f6933b) * 1000003) ^ this.f6934c;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("Dependency{anInterface=");
        sb.append(this.f6932a);
        sb.append(", type=");
        int r1 = this.f6933b;
        sb.append(r1 == 1 ? "required" : r1 == 0 ? "optional" : "set");
        sb.append(", direct=");
        sb.append(this.f6934c == 0);
        sb.append("}");
        return sb.toString();
    }
}

package c.a.b.b.g.c;

import java.util.List;

/* loaded from: classes.dex */
abstract class a8 {

    /* renamed from: a, reason: collision with root package name */
    private static final a8 f1653a;

    /* renamed from: b, reason: collision with root package name */
    private static final a8 f1654b;

    static {
        d8 d8Var = null;
        f1653a = new c8();
        f1654b = new f8();
    }

    private a8() {
    }

    static a8 a() {
        return f1653a;
    }

    static a8 d() {
        return f1654b;
    }

    abstract <L> List<L> b(Object obj, long j);

    abstract <L> void c(Object obj, Object obj2, long j);

    abstract void e(Object obj, long j);
}

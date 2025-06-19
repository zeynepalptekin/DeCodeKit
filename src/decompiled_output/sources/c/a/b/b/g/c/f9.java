package c.a.b.b.g.c;

import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

/* loaded from: classes.dex */
final class f9 {

    /* renamed from: c, reason: collision with root package name */
    private static final f9 f1686c = new f9();

    /* renamed from: b, reason: collision with root package name */
    private final ConcurrentMap<Class<?>, j9<?>> f1688b = new ConcurrentHashMap();

    /* renamed from: a, reason: collision with root package name */
    private final n9 f1687a = new h8();

    private f9() {
    }

    public static f9 a() {
        return f1686c;
    }

    public final <T> j9<T> b(Class<T> cls) {
        l7.f(cls, "messageType");
        j9<T> j9Var = (j9) this.f1688b.get(cls);
        if (j9Var != null) {
            return j9Var;
        }
        j9<T> j9VarA = this.f1687a.a(cls);
        l7.f(cls, "messageType");
        l7.f(j9VarA, "schema");
        j9<T> j9Var2 = (j9) this.f1688b.putIfAbsent(cls, j9VarA);
        return j9Var2 != null ? j9Var2 : j9VarA;
    }

    public final <T> j9<T> c(T t) {
        return b(t.getClass());
    }
}

package c.a.b.b.g.c;

import c.a.b.b.g.c.h7;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes.dex */
public class u6 {

    /* renamed from: b, reason: collision with root package name */
    private static volatile boolean f1833b = false;

    /* renamed from: c, reason: collision with root package name */
    private static boolean f1834c = true;
    private static volatile u6 d;
    private static volatile u6 e;
    private static final u6 f = new u6(true);

    /* renamed from: a, reason: collision with root package name */
    private final Map<a, h7.d<?, ?>> f1835a;

    private static final class a {

        /* renamed from: a, reason: collision with root package name */
        private final Object f1836a;

        /* renamed from: b, reason: collision with root package name */
        private final int f1837b;

        a(Object obj, int r2) {
            this.f1836a = obj;
            this.f1837b = r2;
        }

        public final boolean equals(Object obj) {
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return this.f1836a == aVar.f1836a && this.f1837b == aVar.f1837b;
        }

        public final int hashCode() {
            return (System.identityHashCode(this.f1836a) * b.i.g.b.a.f1046a) + this.f1837b;
        }
    }

    u6() {
        this.f1835a = new HashMap();
    }

    private u6(boolean z) {
        this.f1835a = Collections.emptyMap();
    }

    public static u6 a() {
        u6 u6Var = d;
        if (u6Var == null) {
            synchronized (u6.class) {
                u6Var = d;
                if (u6Var == null) {
                    u6Var = f;
                    d = u6Var;
                }
            }
        }
        return u6Var;
    }

    public static u6 c() {
        u6 u6Var = e;
        if (u6Var != null) {
            return u6Var;
        }
        synchronized (u6.class) {
            u6 u6Var2 = e;
            if (u6Var2 != null) {
                return u6Var2;
            }
            u6 u6VarB = g7.b(u6.class);
            e = u6VarB;
            return u6VarB;
        }
    }

    public final <ContainingType extends r8> h7.d<ContainingType, ?> b(ContainingType containingtype, int r4) {
        return (h7.d) this.f1835a.get(new a(containingtype, r4));
    }
}

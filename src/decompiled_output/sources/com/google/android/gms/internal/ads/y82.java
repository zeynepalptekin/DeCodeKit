package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.l92;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes.dex */
public class y82 {

    /* renamed from: b, reason: collision with root package name */
    private static volatile boolean f6103b = false;

    /* renamed from: c, reason: collision with root package name */
    private static boolean f6104c = true;
    private static volatile y82 d;
    private static volatile y82 e;
    private static final y82 f = new y82(true);

    /* renamed from: a, reason: collision with root package name */
    private final Map<a, l92.f<?, ?>> f6105a;

    static final class a {

        /* renamed from: a, reason: collision with root package name */
        private final Object f6106a;

        /* renamed from: b, reason: collision with root package name */
        private final int f6107b;

        a(Object obj, int r2) {
            this.f6106a = obj;
            this.f6107b = r2;
        }

        public final boolean equals(Object obj) {
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return this.f6106a == aVar.f6106a && this.f6107b == aVar.f6107b;
        }

        public final int hashCode() {
            return (System.identityHashCode(this.f6106a) * b.i.g.b.a.f1046a) + this.f6107b;
        }
    }

    y82() {
        this.f6105a = new HashMap();
    }

    private y82(boolean z) {
        this.f6105a = Collections.emptyMap();
    }

    public static y82 b() {
        y82 y82Var = d;
        if (y82Var == null) {
            synchronized (y82.class) {
                y82Var = d;
                if (y82Var == null) {
                    y82Var = f;
                    d = y82Var;
                }
            }
        }
        return y82Var;
    }

    public static y82 c() {
        y82 y82Var = e;
        if (y82Var != null) {
            return y82Var;
        }
        synchronized (y82.class) {
            y82 y82Var2 = e;
            if (y82Var2 != null) {
                return y82Var2;
            }
            y82 y82VarB = j92.b(y82.class);
            e = y82VarB;
            return y82VarB;
        }
    }

    public final <ContainingType extends xa2> l92.f<ContainingType, ?> a(ContainingType containingtype, int r4) {
        return (l92.f) this.f6105a.get(new a(containingtype, r4));
    }
}

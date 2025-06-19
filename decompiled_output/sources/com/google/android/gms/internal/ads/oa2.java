package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.l92;

/* loaded from: classes.dex */
final class oa2 implements xb2 {

    /* renamed from: b, reason: collision with root package name */
    private static final ya2 f4666b = new ma2();

    /* renamed from: a, reason: collision with root package name */
    private final ya2 f4667a;

    public oa2() {
        this(new qa2(n92.c(), c()));
    }

    private oa2(ya2 ya2Var) {
        this.f4667a = (ya2) o92.d(ya2Var, "messageInfoFactory");
    }

    private static boolean b(va2 va2Var) {
        return va2Var.c() == l92.e.i;
    }

    private static ya2 c() {
        try {
            return (ya2) Class.forName("com.google.protobuf.DescriptorMessageInfoFactory").getDeclaredMethod("getInstance", new Class[0]).invoke(null, new Object[0]);
        } catch (Exception unused) {
            return f4666b;
        }
    }

    @Override // com.google.android.gms.internal.ads.xb2
    public final <T> ub2<T> a(Class<T> cls) {
        wb2.O(cls);
        va2 va2VarB = this.f4667a.b(cls);
        if (va2VarB.a()) {
            return l92.class.isAssignableFrom(cls) ? db2.k(wb2.x(), b92.b(), va2VarB.b()) : db2.k(wb2.v(), b92.c(), va2VarB.b());
        }
        if (!l92.class.isAssignableFrom(cls)) {
            boolean zB = b(va2VarB);
            fb2 fb2VarA = hb2.a();
            ga2 ga2VarD = ga2.d();
            return zB ? bb2.q(cls, va2VarB, fb2VarA, ga2VarD, wb2.v(), b92.c(), wa2.a()) : bb2.q(cls, va2VarB, fb2VarA, ga2VarD, wb2.w(), null, wa2.a());
        }
        boolean zB2 = b(va2VarB);
        fb2 fb2VarB = hb2.b();
        ga2 ga2VarE = ga2.e();
        mc2<?, ?> mc2VarX = wb2.x();
        return zB2 ? bb2.q(cls, va2VarB, fb2VarB, ga2VarE, mc2VarX, b92.b(), wa2.b()) : bb2.q(cls, va2VarB, fb2VarB, ga2VarE, mc2VarX, null, wa2.b());
    }
}

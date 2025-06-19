package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.internal.ads.vc0;
import java.util.Map;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;

/* loaded from: classes.dex */
public final class xr1 {
    private static volatile vc0.a.c d = vc0.a.c.UNKNOWN;

    /* renamed from: a, reason: collision with root package name */
    private final Context f6028a;

    /* renamed from: b, reason: collision with root package name */
    private final Executor f6029b;

    /* renamed from: c, reason: collision with root package name */
    private final c.a.b.b.k.m<yu2> f6030c;

    private xr1(@androidx.annotation.h0 Context context, @androidx.annotation.h0 Executor executor, @androidx.annotation.h0 c.a.b.b.k.m<yu2> mVar) {
        this.f6028a = context;
        this.f6029b = executor;
        this.f6030c = mVar;
    }

    public static xr1 a(@androidx.annotation.h0 final Context context, @androidx.annotation.h0 Executor executor) {
        return new xr1(context, executor, c.a.b.b.k.p.d(executor, new Callable(context) { // from class: com.google.android.gms.internal.ads.wr1

            /* renamed from: a, reason: collision with root package name */
            private final Context f5882a;

            {
                this.f5882a = context;
            }

            @Override // java.util.concurrent.Callable
            public final Object call() {
                return xr1.g(this.f5882a);
            }
        }));
    }

    private final c.a.b.b.k.m<Boolean> c(final int r2, long j, Exception exc, String str, Map<String, String> map, String str2) {
        final vc0.a.C0186a c0186aW = vc0.a.U().x(this.f6028a.getPackageName()).w(j);
        c0186aW.v(d);
        if (exc != null) {
            c0186aW.z(fv1.a(exc)).A(exc.getClass().getName());
        }
        if (str2 != null) {
            c0186aW.C(str2);
        }
        if (str != null) {
            c0186aW.D(str);
        }
        return this.f6030c.n(this.f6029b, new c.a.b.b.k.c(c0186aW, r2) { // from class: com.google.android.gms.internal.ads.zr1

            /* renamed from: a, reason: collision with root package name */
            private final vc0.a.C0186a f6307a;

            /* renamed from: b, reason: collision with root package name */
            private final int f6308b;

            {
                this.f6307a = c0186aW;
                this.f6308b = r2;
            }

            @Override // c.a.b.b.k.c
            public final Object a(c.a.b.b.k.m mVar) {
                return xr1.e(this.f6307a, this.f6308b, mVar);
            }
        });
    }

    static final /* synthetic */ Boolean e(vc0.a.C0186a c0186a, int r2, c.a.b.b.k.m mVar) throws Exception {
        if (!mVar.v()) {
            return Boolean.FALSE;
        }
        dv2 dv2VarA = ((yu2) mVar.r()).a(((vc0.a) ((l92) c0186a.P())).f());
        dv2VarA.b(r2);
        dv2VarA.c();
        return Boolean.TRUE;
    }

    static void f(vc0.a.c cVar) {
        d = cVar;
    }

    static final /* synthetic */ yu2 g(Context context) throws Exception {
        return new yu2(context, "GLAS", null);
    }

    public final c.a.b.b.k.m<Boolean> b(int r9, long j, Exception exc) {
        return c(r9, j, exc, null, null, null);
    }

    public final c.a.b.b.k.m<Boolean> d(int r9, long j, String str, Map<String, String> map) {
        return c(r9, j, null, str, null, null);
    }

    public final c.a.b.b.k.m<Boolean> h(int r9, long j) {
        return c(r9, j, null, null, null, null);
    }

    public final c.a.b.b.k.m<Boolean> i(int r9, String str) {
        return c(4007, 0L, null, null, null, str);
    }
}

package com.google.android.gms.ads.h0;

import android.content.Context;
import com.google.android.gms.ads.c0.d;
import com.google.android.gms.ads.e;
import com.google.android.gms.ads.m;
import com.google.android.gms.ads.n;
import com.google.android.gms.ads.o;
import com.google.android.gms.ads.z;
import com.google.android.gms.common.internal.r;
import com.google.android.gms.internal.ads.a9;
import com.google.android.gms.internal.ads.z8;

/* loaded from: classes.dex */
public abstract class a {

    /* renamed from: com.google.android.gms.ads.h0.a$a, reason: collision with other inner class name */
    public static abstract class AbstractC0163a {
        @Deprecated
        public void a(int r1) {
        }

        public void b(m mVar) {
        }

        public void c(a aVar) {
        }
    }

    public static void g(Context context, String str, e eVar, @n int r5, AbstractC0163a abstractC0163a) {
        r.b(r5 == 2 || r5 == 3, "Instream ads only support Landscape and Portrait media aspect ratios");
        new a9(context, str).a(abstractC0163a).b(new z8(r5)).c().a(eVar);
    }

    public static void h(Context context, String str, AbstractC0163a abstractC0163a) {
        new a9(context, "").a(abstractC0163a).b(new z8(str)).c().b(new d.a().i());
    }

    public abstract void a();

    @Deprecated
    public abstract float b();

    public abstract o c();

    @Deprecated
    public abstract z d();

    @Deprecated
    public abstract float e();

    @Deprecated
    public abstract float f();

    protected abstract void i(b bVar);
}

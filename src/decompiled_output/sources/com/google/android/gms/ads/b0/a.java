package com.google.android.gms.ads.b0;

import android.app.Activity;
import android.content.Context;
import com.google.android.gms.ads.c0.d;
import com.google.android.gms.ads.e;
import com.google.android.gms.ads.k;
import com.google.android.gms.ads.m;
import com.google.android.gms.ads.y;
import com.google.android.gms.common.internal.r;
import com.google.android.gms.internal.ads.hy2;
import com.google.android.gms.internal.ads.mt2;
import com.google.android.gms.internal.ads.rt2;

/* loaded from: classes.dex */
public abstract class a {

    /* renamed from: a, reason: collision with root package name */
    public static final int f2345a = 1;

    /* renamed from: b, reason: collision with root package name */
    public static final int f2346b = 2;

    /* renamed from: com.google.android.gms.ads.b0.a$a, reason: collision with other inner class name */
    public static abstract class AbstractC0159a {
        @Deprecated
        public void a(int r1) {
        }

        public void b(m mVar) {
        }

        public void c(a aVar) {
        }
    }

    public @interface b {
    }

    public static void b(Context context, String str, e eVar, @b int r10, AbstractC0159a abstractC0159a) {
        r.l(context, "Context cannot be null.");
        r.l(str, "adUnitId cannot be null.");
        r.l(eVar, "AdRequest cannot be null.");
        new rt2(context, str, eVar.k(), r10, abstractC0159a).a();
    }

    public static void c(Context context, String str, d dVar, @b int r10, AbstractC0159a abstractC0159a) {
        r.l(context, "Context cannot be null.");
        r.l(str, "adUnitId cannot be null.");
        r.l(dVar, "PublisherAdRequest cannot be null.");
        new rt2(context, str, dVar.n(), r10, abstractC0159a).a();
    }

    public abstract y a();

    public abstract void d(Activity activity, k kVar);

    protected abstract void e(mt2 mt2Var);

    protected abstract hy2 f();
}

package com.google.android.gms.ads.m0;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import androidx.annotation.h0;
import androidx.annotation.i0;
import com.google.android.gms.ads.c0.d;
import com.google.android.gms.ads.e;
import com.google.android.gms.ads.k;
import com.google.android.gms.ads.l0.f;
import com.google.android.gms.ads.u;
import com.google.android.gms.ads.v;
import com.google.android.gms.ads.y;
import com.google.android.gms.common.internal.r;
import com.google.android.gms.internal.ads.vl;

/* loaded from: classes.dex */
public abstract class a {
    public static void d(@h0 Context context, @h0 String str, @h0 e eVar, @h0 b bVar) {
        r.l(context, "Context cannot be null.");
        r.l(str, "AdUnitId cannot be null.");
        r.l(eVar, "AdRequest cannot be null.");
        r.l(bVar, "LoadCallback cannot be null.");
        new vl(context, str).k(eVar.k(), bVar);
    }

    public static void e(@h0 Context context, @h0 String str, @h0 d dVar, @h0 b bVar) {
        r.l(context, "Context cannot be null.");
        r.l(str, "AdUnitId cannot be null.");
        r.l(dVar, "PublisherAdRequest cannot be null.");
        r.l(bVar, "LoadCallback cannot be null.");
        new vl(context, str).k(dVar.n(), bVar);
    }

    @h0
    public abstract Bundle a();

    @i0
    public abstract y b();

    @h0
    public abstract com.google.android.gms.ads.l0.b c();

    public abstract void f(@i0 k kVar);

    public abstract void g(@i0 com.google.android.gms.ads.l0.a aVar);

    public abstract void h(@i0 u uVar);

    public abstract void i(@i0 f fVar);

    public abstract void j(@i0 Activity activity, @h0 v vVar);
}

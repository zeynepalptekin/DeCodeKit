package com.google.android.gms.ads.j0;

import android.content.Context;
import android.os.Bundle;
import androidx.annotation.i0;
import com.google.android.gms.internal.ads.mh;
import com.google.android.gms.internal.ads.q03;

@com.google.android.gms.common.annotation.a
/* loaded from: classes.dex */
public class b {

    /* renamed from: a, reason: collision with root package name */
    private final q03 f2427a;

    public b(q03 q03Var) {
        this.f2427a = q03Var;
    }

    @com.google.android.gms.common.annotation.a
    public static void a(Context context, com.google.android.gms.ads.b bVar, @i0 com.google.android.gms.ads.e eVar, c cVar) {
        new mh(context, bVar, eVar == null ? null : eVar.k()).a(cVar);
    }

    @com.google.android.gms.common.annotation.a
    public String b() {
        return this.f2427a.a();
    }

    @com.google.android.gms.common.annotation.a
    public Bundle c() {
        return this.f2427a.b();
    }

    @com.google.android.gms.common.annotation.a
    public String d() {
        return q03.c(this);
    }
}

package com.google.android.gms.ads.mediation.rtb;

import android.content.Context;
import android.os.Bundle;
import androidx.annotation.i0;
import com.google.android.gms.ads.f;
import com.google.android.gms.ads.mediation.l;
import java.util.List;

/* loaded from: classes.dex */
public class a {

    /* renamed from: a, reason: collision with root package name */
    private final Context f2467a;

    /* renamed from: b, reason: collision with root package name */
    private final List<l> f2468b;

    /* renamed from: c, reason: collision with root package name */
    private final Bundle f2469c;

    @i0
    private final f d;

    public a(Context context, List<l> list, Bundle bundle, @i0 f fVar) {
        this.f2467a = context;
        this.f2468b = list;
        this.f2469c = bundle;
        this.d = fVar;
    }

    @i0
    public f a() {
        return this.d;
    }

    @Deprecated
    public l b() {
        List<l> list = this.f2468b;
        if (list == null || list.size() <= 0) {
            return null;
        }
        return this.f2468b.get(0);
    }

    public List<l> c() {
        return this.f2468b;
    }

    public Context d() {
        return this.f2467a;
    }

    public Bundle e() {
        return this.f2469c;
    }
}

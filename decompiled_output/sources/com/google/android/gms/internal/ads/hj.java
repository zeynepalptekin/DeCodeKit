package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.WeakHashMap;
import java.util.concurrent.Future;

/* loaded from: classes.dex */
public final class hj {

    /* renamed from: a, reason: collision with root package name */
    private WeakHashMap<Context, jj> f3682a = new WeakHashMap<>();

    public final Future<fj> b(Context context) {
        return cs.f3023a.submit(new gj(this, context));
    }
}

package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.ArrayList;
import java.util.WeakHashMap;
import javax.annotation.ParametersAreNonnullByDefault;

@ParametersAreNonnullByDefault
/* loaded from: classes.dex */
public final class lr2 {

    /* renamed from: a, reason: collision with root package name */
    private final Object f4300a = new Object();

    /* renamed from: b, reason: collision with root package name */
    private final WeakHashMap<Object, Object> f4301b = new WeakHashMap<>();

    /* renamed from: c, reason: collision with root package name */
    private final ArrayList<Object> f4302c = new ArrayList<>();
    private final Context d;
    private final as e;
    private final da f;

    public lr2(Context context, as asVar) {
        this.d = context.getApplicationContext();
        this.e = asVar;
        this.f = new da(context.getApplicationContext(), asVar, (String) qx2.e().c(e0.f3191b));
    }
}

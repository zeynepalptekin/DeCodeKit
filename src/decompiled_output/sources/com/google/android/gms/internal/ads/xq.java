package com.google.android.gms.internal.ads;

import android.graphics.Bitmap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes.dex */
public final class xq {

    /* renamed from: a, reason: collision with root package name */
    private Map<Integer, Bitmap> f6019a = new ConcurrentHashMap();

    /* renamed from: b, reason: collision with root package name */
    private AtomicInteger f6020b = new AtomicInteger(0);

    public final Bitmap a(Integer num) {
        return this.f6019a.get(num);
    }
}

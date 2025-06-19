package com.google.android.gms.internal.ads;

import android.annotation.TargetApi;
import android.graphics.SurfaceTexture;
import java.util.concurrent.TimeUnit;

@TargetApi(14)
/* loaded from: classes.dex */
public final class ut {

    /* renamed from: b, reason: collision with root package name */
    private long f5594b;

    /* renamed from: a, reason: collision with root package name */
    private final long f5593a = TimeUnit.MILLISECONDS.toNanos(((Long) qx2.e().c(e0.x)).longValue());

    /* renamed from: c, reason: collision with root package name */
    private boolean f5595c = true;

    ut() {
    }

    public final void a(SurfaceTexture surfaceTexture, ht htVar) {
        if (htVar == null) {
            return;
        }
        long timestamp = surfaceTexture.getTimestamp();
        if (this.f5595c || Math.abs(timestamp - this.f5594b) >= this.f5593a) {
            this.f5595c = false;
            this.f5594b = timestamp;
            to.h.post(new tt(this, htVar));
        }
    }

    public final void b() {
        this.f5595c = true;
    }
}

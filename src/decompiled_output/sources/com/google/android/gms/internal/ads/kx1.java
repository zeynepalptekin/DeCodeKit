package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.pw1;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* loaded from: classes.dex */
class kx1<V> extends lx1<V> implements pw1.j<V> {
    kx1() {
    }

    @Override // com.google.android.gms.internal.ads.pw1, java.util.concurrent.Future
    public final V get(long j, TimeUnit timeUnit) throws ExecutionException, InterruptedException, TimeoutException {
        return (V) super.get(j, timeUnit);
    }
}

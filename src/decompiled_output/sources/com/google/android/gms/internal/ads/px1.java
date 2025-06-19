package com.google.android.gms.internal.ads;

import java.util.concurrent.Executor;

/* loaded from: classes.dex */
public abstract class px1<V> extends mx1<V> implements dy1<V> {
    protected px1() {
    }

    @Override // com.google.android.gms.internal.ads.dy1
    public void e(Runnable runnable, Executor executor) {
        g().e(runnable, executor);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.gms.internal.ads.mx1
    /* renamed from: j, reason: merged with bridge method [inline-methods] */
    public abstract dy1<? extends V> g();
}

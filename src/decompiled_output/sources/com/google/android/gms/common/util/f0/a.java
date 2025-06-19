package com.google.android.gms.common.util.f0;

import android.os.Handler;
import android.os.Looper;
import androidx.annotation.RecentlyNonNull;
import c.a.b.b.g.b.i;
import java.util.concurrent.Executor;

@com.google.android.gms.common.annotation.a
/* loaded from: classes.dex */
public class a implements Executor {
    private final Handler d;

    @com.google.android.gms.common.annotation.a
    public a(@RecentlyNonNull Looper looper) {
        this.d = new i(looper);
    }

    @Override // java.util.concurrent.Executor
    public void execute(@RecentlyNonNull Runnable runnable) {
        this.d.post(runnable);
    }
}

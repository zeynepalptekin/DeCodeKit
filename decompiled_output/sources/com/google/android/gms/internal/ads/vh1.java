package com.google.android.gms.internal.ads;

import android.os.Build;
import java.util.HashMap;
import java.util.concurrent.Callable;

/* loaded from: classes.dex */
final /* synthetic */ class vh1 implements Callable {

    /* renamed from: a, reason: collision with root package name */
    static final Callable f5679a = new vh1();

    private vh1() {
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        HashMap map = new HashMap();
        String str = (String) qx2.e().c(e0.D);
        if (str != null && !str.isEmpty()) {
            if (Build.VERSION.SDK_INT >= ((Integer) qx2.e().c(e0.E)).intValue()) {
                for (String str2 : str.split(",", -1)) {
                    map.put(str2, hr.b(str2));
                }
            }
        }
        return new th1(map);
    }
}

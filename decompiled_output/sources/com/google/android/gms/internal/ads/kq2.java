package com.google.android.gms.internal.ads;

import android.os.Trace;

/* loaded from: classes.dex */
public final class kq2 {
    public static void a(String str) {
        if (nq2.f4592a >= 18) {
            Trace.beginSection(str);
        }
    }

    public static void b() {
        if (nq2.f4592a >= 18) {
            Trace.endSection();
        }
    }
}

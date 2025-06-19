package com.google.android.gms.measurement.internal;

import android.app.ActivityManager;
import android.os.Bundle;
import android.text.TextUtils;
import c.a.b.b.g.c.hc;
import java.lang.reflect.InvocationTargetException;

/* loaded from: classes.dex */
final class n9 {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ e9 f6470a;

    n9(e9 e9Var) {
        this.f6470a = e9Var;
    }

    @androidx.annotation.y0
    @com.google.android.gms.common.util.d0
    private final void c(long j, boolean z) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        this.f6470a.c();
        if (this.f6470a.f6543a.l()) {
            this.f6470a.i().u.b(j);
            this.f6470a.B().N().b("Session started, time", Long.valueOf(this.f6470a.z().c()));
            Long lValueOf = Long.valueOf(j / 1000);
            this.f6470a.l().c0("auto", "_sid", lValueOf, j);
            this.f6470a.i().r.a(false);
            Bundle bundle = new Bundle();
            bundle.putLong("_sid", lValueOf.longValue());
            if (this.f6470a.j().p(u.l0) && z) {
                bundle.putLong("_aib", 1L);
            }
            this.f6470a.l().W("auto", "_s", j, bundle);
            if (hc.b() && this.f6470a.j().p(u.q0)) {
                String strA = this.f6470a.i().z.a();
                if (TextUtils.isEmpty(strA)) {
                    return;
                }
                Bundle bundle2 = new Bundle();
                bundle2.putString("_ffr", strA);
                this.f6470a.l().W("auto", "_ssr", j, bundle2);
            }
        }
    }

    @androidx.annotation.y0
    final void a() {
        this.f6470a.c();
        if (this.f6470a.i().u(this.f6470a.z().a())) {
            this.f6470a.i().r.a(true);
            ActivityManager.RunningAppProcessInfo runningAppProcessInfo = new ActivityManager.RunningAppProcessInfo();
            ActivityManager.getMyMemoryState(runningAppProcessInfo);
            if (runningAppProcessInfo.importance == 100) {
                this.f6470a.B().N().a("Detected application was in foreground");
                c(this.f6470a.z().a(), false);
            }
        }
    }

    @androidx.annotation.y0
    final void b(long j, boolean z) {
        this.f6470a.c();
        this.f6470a.E();
        if (this.f6470a.i().u(j)) {
            this.f6470a.i().r.a(true);
        }
        this.f6470a.i().u.b(j);
        if (this.f6470a.i().r.b()) {
            c(j, z);
        }
    }
}

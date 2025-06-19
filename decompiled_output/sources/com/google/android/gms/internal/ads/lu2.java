package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Binder;
import java.io.InputStream;
import java.util.concurrent.Future;
import javax.annotation.concurrent.GuardedBy;

/* loaded from: classes.dex */
public final class lu2 {

    /* renamed from: a, reason: collision with root package name */
    @androidx.annotation.i0
    @GuardedBy("lock")
    private cu2 f4307a;

    /* renamed from: b, reason: collision with root package name */
    @GuardedBy("lock")
    private boolean f4308b;

    /* renamed from: c, reason: collision with root package name */
    private final Context f4309c;
    private final Object d = new Object();

    lu2(Context context) {
        this.f4309c = context;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void a() {
        synchronized (this.d) {
            if (this.f4307a == null) {
                return;
            }
            this.f4307a.e();
            this.f4307a = null;
            Binder.flushPendingCommands();
        }
    }

    static /* synthetic */ boolean c(lu2 lu2Var, boolean z) {
        lu2Var.f4308b = true;
        return true;
    }

    final Future<InputStream> e(fu2 fu2Var) {
        ku2 ku2Var = new ku2(this);
        nu2 nu2Var = new nu2(this, fu2Var, ku2Var);
        ru2 ru2Var = new ru2(this, ku2Var);
        synchronized (this.d) {
            cu2 cu2Var = new cu2(this.f4309c, com.google.android.gms.ads.internal.p.q().b(), nu2Var, ru2Var);
            this.f4307a = cu2Var;
            cu2Var.a();
        }
        return ku2Var;
    }
}

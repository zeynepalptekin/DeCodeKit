package com.google.android.gms.common.internal;

import android.content.Context;
import android.content.ServiceConnection;
import android.os.Handler;
import com.google.android.gms.common.internal.h;
import java.util.HashMap;
import javax.annotation.concurrent.GuardedBy;

/* loaded from: classes.dex */
final class g0 extends h {
    private final Context e;
    private final Handler f;

    @GuardedBy("connectionStatus")
    private final HashMap<h.a, i0> d = new HashMap<>();
    private final com.google.android.gms.common.stats.a g = com.google.android.gms.common.stats.a.b();
    private final long h = 5000;
    private final long i = 300000;

    g0(Context context) {
        this.e = context.getApplicationContext();
        this.f = new c.a.b.b.g.b.i(context.getMainLooper(), new h0(this));
    }

    @Override // com.google.android.gms.common.internal.h
    protected final boolean h(h.a aVar, ServiceConnection serviceConnection, String str) {
        boolean zD;
        r.l(serviceConnection, "ServiceConnection must not be null");
        synchronized (this.d) {
            i0 i0Var = this.d.get(aVar);
            if (i0Var == null) {
                i0Var = new i0(this, aVar);
                i0Var.a(serviceConnection, serviceConnection, str);
                i0Var.c(str);
                this.d.put(aVar, i0Var);
            } else {
                this.f.removeMessages(0, aVar);
                if (i0Var.e(serviceConnection)) {
                    String strValueOf = String.valueOf(aVar);
                    StringBuilder sb = new StringBuilder(String.valueOf(strValueOf).length() + 81);
                    sb.append("Trying to bind a GmsServiceConnection that was already connected before.  config=");
                    sb.append(strValueOf);
                    throw new IllegalStateException(sb.toString());
                }
                i0Var.a(serviceConnection, serviceConnection, str);
                int r5 = i0Var.f();
                if (r5 == 1) {
                    serviceConnection.onServiceConnected(i0Var.j(), i0Var.i());
                } else if (r5 == 2) {
                    i0Var.c(str);
                }
            }
            zD = i0Var.d();
        }
        return zD;
    }

    @Override // com.google.android.gms.common.internal.h
    protected final void i(h.a aVar, ServiceConnection serviceConnection, String str) {
        r.l(serviceConnection, "ServiceConnection must not be null");
        synchronized (this.d) {
            i0 i0Var = this.d.get(aVar);
            if (i0Var == null) {
                String strValueOf = String.valueOf(aVar);
                StringBuilder sb = new StringBuilder(String.valueOf(strValueOf).length() + 50);
                sb.append("Nonexistent connection status for service config: ");
                sb.append(strValueOf);
                throw new IllegalStateException(sb.toString());
            }
            if (!i0Var.e(serviceConnection)) {
                String strValueOf2 = String.valueOf(aVar);
                StringBuilder sb2 = new StringBuilder(String.valueOf(strValueOf2).length() + 76);
                sb2.append("Trying to unbind a GmsServiceConnection  that was not bound before.  config=");
                sb2.append(strValueOf2);
                throw new IllegalStateException(sb2.toString());
            }
            i0Var.b(serviceConnection, str);
            if (i0Var.h()) {
                this.f.sendMessageDelayed(this.f.obtainMessage(0, aVar), this.h);
            }
        }
    }
}

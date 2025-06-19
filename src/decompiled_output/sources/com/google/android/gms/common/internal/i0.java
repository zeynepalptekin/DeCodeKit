package com.google.android.gms.common.internal;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;
import com.google.android.gms.common.internal.h;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* loaded from: classes.dex */
final class i0 implements ServiceConnection, k0 {
    private final Map<ServiceConnection, ServiceConnection> d = new HashMap();
    private int e = 2;
    private boolean f;

    @androidx.annotation.i0
    private IBinder g;
    private final h.a h;
    private ComponentName i;
    private final /* synthetic */ g0 j;

    public i0(g0 g0Var, h.a aVar) {
        this.j = g0Var;
        this.h = aVar;
    }

    public final void a(ServiceConnection serviceConnection, ServiceConnection serviceConnection2, String str) {
        this.d.put(serviceConnection, serviceConnection2);
    }

    public final void b(ServiceConnection serviceConnection, String str) {
        this.d.remove(serviceConnection);
    }

    public final void c(String str) {
        this.e = 3;
        boolean zE = this.j.g.e(this.j.e, str, this.h.a(this.j.e), this, this.h.e());
        this.f = zE;
        if (zE) {
            this.j.f.sendMessageDelayed(this.j.f.obtainMessage(1, this.h), this.j.i);
        } else {
            this.e = 2;
            try {
                this.j.g.c(this.j.e, this);
            } catch (IllegalArgumentException unused) {
            }
        }
    }

    public final boolean d() {
        return this.f;
    }

    public final boolean e(ServiceConnection serviceConnection) {
        return this.d.containsKey(serviceConnection);
    }

    public final int f() {
        return this.e;
    }

    public final void g(String str) {
        this.j.f.removeMessages(1, this.h);
        this.j.g.c(this.j.e, this);
        this.f = false;
        this.e = 2;
    }

    public final boolean h() {
        return this.d.isEmpty();
    }

    @androidx.annotation.i0
    public final IBinder i() {
        return this.g;
    }

    public final ComponentName j() {
        return this.i;
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        synchronized (this.j.d) {
            this.j.f.removeMessages(1, this.h);
            this.g = iBinder;
            this.i = componentName;
            Iterator<ServiceConnection> it = this.d.values().iterator();
            while (it.hasNext()) {
                it.next().onServiceConnected(componentName, iBinder);
            }
            this.e = 1;
        }
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        synchronized (this.j.d) {
            this.j.f.removeMessages(1, this.h);
            this.g = null;
            this.i = componentName;
            Iterator<ServiceConnection> it = this.d.values().iterator();
            while (it.hasNext()) {
                it.next().onServiceDisconnected(componentName);
            }
            this.e = 2;
        }
    }
}

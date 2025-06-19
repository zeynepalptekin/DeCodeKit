package b.d.b;

import a.a.a.a;
import a.a.a.c;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.Bundle;
import android.os.IBinder;
import android.os.RemoteException;

/* loaded from: classes.dex */
public abstract class i implements ServiceConnection {
    private final Object d = new Object();
    private final a.a.a.a e;
    private a.a.a.c f;

    public i(g gVar) {
        this.e = a.AbstractBinderC0000a.L0(gVar.c());
    }

    public boolean a(Context context, String str) {
        Intent intent = new Intent();
        intent.setClassName(str, h.class.getName());
        return context.bindService(intent, this, 1);
    }

    public final boolean b(Bundle bundle) {
        if (this.f == null) {
            return false;
        }
        synchronized (this.d) {
            try {
                try {
                    this.f.O6(this.e, bundle);
                } catch (RemoteException unused) {
                    return false;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return true;
    }

    public void c() {
    }

    public void d() {
    }

    public final boolean e(String str, Bundle bundle) {
        if (this.f == null) {
            return false;
        }
        synchronized (this.d) {
            try {
                try {
                    this.f.m8(this.e, str, bundle);
                } catch (RemoteException unused) {
                    return false;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return true;
    }

    public void f(Context context) {
        context.unbindService(this);
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        this.f = c.a.L0(iBinder);
        c();
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        this.f = null;
        d();
    }
}

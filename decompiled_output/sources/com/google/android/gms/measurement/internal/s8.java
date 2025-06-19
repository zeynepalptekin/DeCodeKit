package com.google.android.gms.measurement.internal;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.Bundle;
import android.os.DeadObjectException;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import android.os.RemoteException;
import com.google.android.gms.common.internal.d;

@com.google.android.gms.common.util.d0
/* loaded from: classes.dex */
public final class s8 implements ServiceConnection, d.a, d.b {
    private volatile boolean d;
    private volatile t3 e;
    final /* synthetic */ x7 f;

    protected s8(x7 x7Var) {
        this.f = x7Var;
    }

    static /* synthetic */ boolean f(s8 s8Var, boolean z) {
        s8Var.d = false;
        return false;
    }

    @Override // com.google.android.gms.common.internal.d.a
    @androidx.annotation.e0
    public final void a(int r2) throws IllegalStateException {
        com.google.android.gms.common.internal.r.f("MeasurementServiceConnection.onConnectionSuspended");
        this.f.B().M().a("Service connection suspended");
        this.f.x().v(new w8(this));
    }

    @Override // com.google.android.gms.common.internal.d.b
    @androidx.annotation.e0
    public final void b(@androidx.annotation.h0 c.a.b.b.d.c cVar) throws IllegalStateException {
        com.google.android.gms.common.internal.r.f("MeasurementServiceConnection.onConnectionFailed");
        w3 w3VarY = this.f.f6543a.y();
        if (w3VarY != null) {
            w3VarY.I().b("Service connection failed", cVar);
        }
        synchronized (this) {
            this.d = false;
            this.e = null;
        }
        this.f.x().v(new z8(this));
    }

    @Override // com.google.android.gms.common.internal.d.a
    @androidx.annotation.e0
    public final void c(@androidx.annotation.i0 Bundle bundle) {
        com.google.android.gms.common.internal.r.f("MeasurementServiceConnection.onConnected");
        synchronized (this) {
            try {
                this.f.x().v(new x8(this, this.e.v()));
            } catch (DeadObjectException | IllegalStateException unused) {
                this.e = null;
                this.d = false;
            }
        }
    }

    @androidx.annotation.y0
    public final void d() {
        if (this.e != null && (this.e.D() || this.e.E())) {
            this.e.e();
        }
        this.e = null;
    }

    @androidx.annotation.y0
    public final void e(Intent intent) {
        this.f.c();
        Context contextF = this.f.F();
        com.google.android.gms.common.stats.a aVarB = com.google.android.gms.common.stats.a.b();
        synchronized (this) {
            if (this.d) {
                this.f.B().N().a("Connection attempt already in progress");
                return;
            }
            this.f.B().N().a("Using local app measurement service");
            this.d = true;
            aVarB.a(contextF, intent, this.f.f6559c, 129);
        }
    }

    @androidx.annotation.y0
    public final void g() {
        this.f.c();
        Context contextF = this.f.F();
        synchronized (this) {
            if (this.d) {
                this.f.B().N().a("Connection attempt already in progress");
                return;
            }
            if (this.e != null && (this.e.E() || this.e.D())) {
                this.f.B().N().a("Already awaiting connection attempt");
                return;
            }
            this.e = new t3(contextF, Looper.getMainLooper(), this, this);
            this.f.B().N().a("Connecting to remote service");
            this.d = true;
            this.e.a();
        }
    }

    @Override // android.content.ServiceConnection
    @androidx.annotation.e0
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        com.google.android.gms.common.internal.r.f("MeasurementServiceConnection.onServiceConnected");
        synchronized (this) {
            if (iBinder == null) {
                this.d = false;
                this.f.B().E().a("Service connected with null binder");
                return;
            }
            o3 q3Var = null;
            try {
                String interfaceDescriptor = iBinder.getInterfaceDescriptor();
                if ("com.google.android.gms.measurement.internal.IMeasurementService".equals(interfaceDescriptor)) {
                    if (iBinder != null) {
                        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.measurement.internal.IMeasurementService");
                        q3Var = iInterfaceQueryLocalInterface instanceof o3 ? (o3) iInterfaceQueryLocalInterface : new q3(iBinder);
                    }
                    this.f.B().N().a("Bound to IMeasurementService interface");
                } else {
                    this.f.B().E().b("Got binder with a wrong descriptor", interfaceDescriptor);
                }
            } catch (RemoteException unused) {
                this.f.B().E().a("Service connect failed to get IMeasurementService");
            }
            if (q3Var == null) {
                this.d = false;
                try {
                    com.google.android.gms.common.stats.a.b().c(this.f.F(), this.f.f6559c);
                } catch (IllegalArgumentException unused2) {
                }
            } else {
                this.f.x().v(new v8(this, q3Var));
            }
        }
    }

    @Override // android.content.ServiceConnection
    @androidx.annotation.e0
    public final void onServiceDisconnected(ComponentName componentName) throws IllegalStateException {
        com.google.android.gms.common.internal.r.f("MeasurementServiceConnection.onServiceDisconnected");
        this.f.B().M().a("Service disconnected");
        this.f.x().v(new u8(this, componentName));
    }
}

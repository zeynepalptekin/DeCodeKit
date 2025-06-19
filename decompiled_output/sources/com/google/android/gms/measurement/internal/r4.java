package com.google.android.gms.measurement.internal;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;

/* loaded from: classes.dex */
public final class r4 implements ServiceConnection {
    private final String d;
    final /* synthetic */ o4 e;

    r4(o4 o4Var, String str) {
        this.e = o4Var;
        this.d = str;
    }

    @Override // android.content.ServiceConnection
    @androidx.annotation.e0
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        if (iBinder == null) {
            this.e.f6477a.B().I().a("Install Referrer connection returned with null binder");
            return;
        }
        try {
            c.a.b.b.g.c.d2 d2VarB2 = c.a.b.b.g.c.g5.b2(iBinder);
            if (d2VarB2 == null) {
                this.e.f6477a.B().I().a("Install Referrer Service implementation was not found");
            } else {
                this.e.f6477a.B().N().a("Install Referrer Service connected");
                this.e.f6477a.x().v(new q4(this, d2VarB2, this));
            }
        } catch (Exception e) {
            this.e.f6477a.B().I().b("Exception occurred while calling Install Referrer API", e);
        }
    }

    @Override // android.content.ServiceConnection
    @androidx.annotation.e0
    public final void onServiceDisconnected(ComponentName componentName) {
        this.e.f6477a.B().N().a("Install Referrer Service disconnected");
    }
}

package com.google.android.gms.measurement.internal;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;

/* loaded from: classes.dex */
class h4 extends BroadcastReceiver {

    @com.google.android.gms.common.util.d0
    private static final String d = h4.class.getName();

    /* renamed from: a, reason: collision with root package name */
    private final t9 f6404a;

    /* renamed from: b, reason: collision with root package name */
    private boolean f6405b;

    /* renamed from: c, reason: collision with root package name */
    private boolean f6406c;

    h4(t9 t9Var) {
        com.google.android.gms.common.internal.r.k(t9Var);
        this.f6404a = t9Var;
    }

    @androidx.annotation.y0
    public final void b() {
        this.f6404a.i0();
        this.f6404a.x().c();
        if (this.f6405b) {
            return;
        }
        this.f6404a.F().registerReceiver(this, new IntentFilter("android.net.conn.CONNECTIVITY_CHANGE"));
        this.f6406c = this.f6404a.Y().w();
        this.f6404a.B().N().b("Registering connectivity change receiver. Network connected", Boolean.valueOf(this.f6406c));
        this.f6405b = true;
    }

    @androidx.annotation.y0
    public final void c() {
        this.f6404a.i0();
        this.f6404a.x().c();
        this.f6404a.x().c();
        if (this.f6405b) {
            this.f6404a.B().N().a("Unregistering connectivity change receiver");
            this.f6405b = false;
            this.f6406c = false;
            try {
                this.f6404a.F().unregisterReceiver(this);
            } catch (IllegalArgumentException e) {
                this.f6404a.B().E().b("Failed to unregister the network broadcast receiver", e);
            }
        }
    }

    @Override // android.content.BroadcastReceiver
    @androidx.annotation.e0
    public void onReceive(Context context, Intent intent) throws IllegalStateException {
        this.f6404a.i0();
        String action = intent.getAction();
        this.f6404a.B().N().b("NetworkBroadcastReceiver received action", action);
        if (!"android.net.conn.CONNECTIVITY_CHANGE".equals(action)) {
            this.f6404a.B().I().b("NetworkBroadcastReceiver received unknown action", action);
            return;
        }
        boolean zW = this.f6404a.Y().w();
        if (this.f6406c != zW) {
            this.f6406c = zW;
            this.f6404a.x().v(new g4(this, zW));
        }
    }
}

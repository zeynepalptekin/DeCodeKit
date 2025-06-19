package com.google.android.gms.measurement.internal;

import android.os.RemoteException;
import android.text.TextUtils;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes.dex */
final class t8 implements Runnable {
    private final /* synthetic */ AtomicReference d;
    private final /* synthetic */ String e;
    private final /* synthetic */ String f;
    private final /* synthetic */ String g;
    private final /* synthetic */ boolean h;
    private final /* synthetic */ ma i;
    private final /* synthetic */ x7 j;

    t8(x7 x7Var, AtomicReference atomicReference, String str, String str2, String str3, boolean z, ma maVar) {
        this.j = x7Var;
        this.d = atomicReference;
        this.e = str;
        this.f = str2;
        this.g = str3;
        this.h = z;
        this.i = maVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        AtomicReference atomicReference;
        o3 o3Var;
        AtomicReference atomicReference2;
        List<ca> listV3;
        synchronized (this.d) {
            try {
                try {
                    o3Var = this.j.d;
                } catch (RemoteException e) {
                    this.j.B().E().d("(legacy) Failed to get user properties; remote exception", w3.t(this.e), this.f, e);
                    this.d.set(Collections.emptyList());
                    atomicReference = this.d;
                }
                if (o3Var == null) {
                    this.j.B().E().d("(legacy) Failed to get user properties; not connected to service", w3.t(this.e), this.f, this.g);
                    this.d.set(Collections.emptyList());
                    return;
                }
                if (TextUtils.isEmpty(this.e)) {
                    atomicReference2 = this.d;
                    listV3 = o3Var.K1(this.f, this.g, this.h, this.i);
                } else {
                    atomicReference2 = this.d;
                    listV3 = o3Var.V3(this.e, this.f, this.g, this.h);
                }
                atomicReference2.set(listV3);
                this.j.f0();
                atomicReference = this.d;
                atomicReference.notify();
            } finally {
                this.d.notify();
            }
        }
    }
}

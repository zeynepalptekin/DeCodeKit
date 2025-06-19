package com.google.android.gms.measurement.internal;

import android.os.RemoteException;
import android.text.TextUtils;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes.dex */
final class r8 implements Runnable {
    private final /* synthetic */ AtomicReference d;
    private final /* synthetic */ String e;
    private final /* synthetic */ String f;
    private final /* synthetic */ String g;
    private final /* synthetic */ ma h;
    private final /* synthetic */ x7 i;

    r8(x7 x7Var, AtomicReference atomicReference, String str, String str2, String str3, ma maVar) {
        this.i = x7Var;
        this.d = atomicReference;
        this.e = str;
        this.f = str2;
        this.g = str3;
        this.h = maVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        AtomicReference atomicReference;
        o3 o3Var;
        AtomicReference atomicReference2;
        List<va> listZ7;
        synchronized (this.d) {
            try {
                try {
                    o3Var = this.i.d;
                } catch (RemoteException e) {
                    this.i.B().E().d("(legacy) Failed to get conditional properties; remote exception", w3.t(this.e), this.f, e);
                    this.d.set(Collections.emptyList());
                    atomicReference = this.d;
                }
                if (o3Var == null) {
                    this.i.B().E().d("(legacy) Failed to get conditional properties; not connected to service", w3.t(this.e), this.f, this.g);
                    this.d.set(Collections.emptyList());
                    return;
                }
                if (TextUtils.isEmpty(this.e)) {
                    atomicReference2 = this.d;
                    listZ7 = o3Var.H7(this.f, this.g, this.h);
                } else {
                    atomicReference2 = this.d;
                    listZ7 = o3Var.z7(this.e, this.f, this.g);
                }
                atomicReference2.set(listZ7);
                this.i.f0();
                atomicReference = this.d;
                atomicReference.notify();
            } finally {
                this.d.notify();
            }
        }
    }
}

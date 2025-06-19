package com.google.android.gms.common.internal;

import android.content.ComponentName;
import android.os.Handler;
import android.os.Message;
import android.util.Log;
import com.google.android.gms.common.internal.h;

/* loaded from: classes.dex */
final class h0 implements Handler.Callback {
    private final /* synthetic */ g0 d;

    private h0(g0 g0Var) {
        this.d = g0Var;
    }

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        int r0 = message.what;
        if (r0 == 0) {
            synchronized (this.d.d) {
                h.a aVar = (h.a) message.obj;
                i0 i0Var = (i0) this.d.d.get(aVar);
                if (i0Var != null && i0Var.h()) {
                    if (i0Var.d()) {
                        i0Var.g("GmsClientSupervisor");
                    }
                    this.d.d.remove(aVar);
                }
            }
            return true;
        }
        if (r0 != 1) {
            return false;
        }
        synchronized (this.d.d) {
            h.a aVar2 = (h.a) message.obj;
            i0 i0Var2 = (i0) this.d.d.get(aVar2);
            if (i0Var2 != null && i0Var2.f() == 3) {
                String strValueOf = String.valueOf(aVar2);
                StringBuilder sb = new StringBuilder(String.valueOf(strValueOf).length() + 47);
                sb.append("Timeout waiting for ServiceConnection callback ");
                sb.append(strValueOf);
                Log.e("GmsClientSupervisor", sb.toString(), new Exception());
                ComponentName componentNameJ = i0Var2.j();
                if (componentNameJ == null) {
                    componentNameJ = aVar2.c();
                }
                if (componentNameJ == null) {
                    componentNameJ = new ComponentName((String) r.k(aVar2.b()), b.i.k.d.f1056b);
                }
                i0Var2.onServiceDisconnected(componentNameJ);
            }
        }
        return true;
    }
}

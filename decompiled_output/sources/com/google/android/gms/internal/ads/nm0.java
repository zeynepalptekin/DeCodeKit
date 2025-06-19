package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import android.view.View;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes.dex */
public final class nm0 implements View.OnClickListener {
    private final up0 d;
    private final com.google.android.gms.common.util.g e;

    @androidx.annotation.i0
    private g5 f;

    @androidx.annotation.i0
    private z6<Object> g;

    @androidx.annotation.i0
    @androidx.annotation.x0
    String h;

    @androidx.annotation.i0
    @androidx.annotation.x0
    Long i;

    @androidx.annotation.i0
    @androidx.annotation.x0
    WeakReference<View> j;

    public nm0(up0 up0Var, com.google.android.gms.common.util.g gVar) {
        this.d = up0Var;
        this.e = gVar;
    }

    private final void d() {
        View view;
        this.h = null;
        this.i = null;
        WeakReference<View> weakReference = this.j;
        if (weakReference == null || (view = weakReference.get()) == null) {
            return;
        }
        view.setClickable(false);
        view.setOnClickListener(null);
        this.j = null;
    }

    public final void a() {
        if (this.f == null || this.i == null) {
            return;
        }
        d();
        try {
            this.f.z1();
        } catch (RemoteException e) {
            tr.e("#007 Could not call remote method.", e);
        }
    }

    public final void b(final g5 g5Var) {
        this.f = g5Var;
        z6<Object> z6Var = this.g;
        if (z6Var != null) {
            this.d.i("/unconfirmedClick", z6Var);
        }
        z6<Object> z6Var2 = new z6(this, g5Var) { // from class: com.google.android.gms.internal.ads.qm0

            /* renamed from: a, reason: collision with root package name */
            private final nm0 f5038a;

            /* renamed from: b, reason: collision with root package name */
            private final g5 f5039b;

            {
                this.f5038a = this;
                this.f5039b = g5Var;
            }

            @Override // com.google.android.gms.internal.ads.z6
            public final void a(Object obj, Map map) {
                nm0 nm0Var = this.f5038a;
                g5 g5Var2 = this.f5039b;
                try {
                    nm0Var.i = Long.valueOf(Long.parseLong((String) map.get("timestamp")));
                } catch (NumberFormatException unused) {
                    tr.g("Failed to call parse unconfirmedClickTimestamp.");
                }
                nm0Var.h = (String) map.get("id");
                String str = (String) map.get("asset_id");
                if (g5Var2 == null) {
                    tr.f("Received unconfirmed click but UnconfirmedClickListener is null.");
                    return;
                }
                try {
                    g5Var2.c1(str);
                } catch (RemoteException e) {
                    tr.e("#007 Could not call remote method.", e);
                }
            }
        };
        this.g = z6Var2;
        this.d.e("/unconfirmedClick", z6Var2);
    }

    @androidx.annotation.i0
    public final g5 c() {
        return this.f;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        WeakReference<View> weakReference = this.j;
        if (weakReference == null || weakReference.get() != view) {
            return;
        }
        if (this.h != null && this.i != null) {
            HashMap map = new HashMap();
            map.put("id", this.h);
            map.put("time_interval", String.valueOf(this.e.a() - this.i.longValue()));
            map.put("messageType", "onePointFiveClick");
            this.d.f("sendMessageToNativeJs", map);
        }
        d();
    }
}

package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import java.util.Map;

/* loaded from: classes.dex */
public final class vp0 implements z6<Object> {

    /* renamed from: a, reason: collision with root package name */
    @androidx.annotation.i0
    private final r4 f5717a;

    /* renamed from: b, reason: collision with root package name */
    private final up0 f5718b;

    /* renamed from: c, reason: collision with root package name */
    private final je2<op0> f5719c;

    public vp0(ul0 ul0Var, nl0 nl0Var, up0 up0Var, je2<op0> je2Var) {
        this.f5717a = ul0Var.i(nl0Var.e());
        this.f5718b = up0Var;
        this.f5719c = je2Var;
    }

    @Override // com.google.android.gms.internal.ads.z6
    public final void a(Object obj, Map<String, String> map) {
        String str = map.get("asset");
        try {
            this.f5717a.W0(this.f5719c.get(), str);
        } catch (RemoteException e) {
            StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 40);
            sb.append("Failed to call onCustomClick for asset ");
            sb.append(str);
            sb.append(".");
            tr.d(sb.toString(), e);
        }
    }

    public final void b() {
        if (this.f5717a == null) {
            return;
        }
        this.f5718b.e("/nativeAdCustomClick", this);
    }
}

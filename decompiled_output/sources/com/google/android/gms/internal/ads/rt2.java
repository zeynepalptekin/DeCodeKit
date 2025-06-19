package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.RemoteException;
import com.google.android.gms.ads.b0.a;

/* loaded from: classes.dex */
public final class rt2 {

    /* renamed from: a, reason: collision with root package name */
    private hy2 f5185a;

    /* renamed from: b, reason: collision with root package name */
    private final Context f5186b;

    /* renamed from: c, reason: collision with root package name */
    private final String f5187c;
    private final c03 d;

    @a.b
    private final int e;
    private final a.AbstractC0159a f;
    private final rc g = new rc();
    private final ow2 h = ow2.f4752a;

    public rt2(Context context, String str, c03 c03Var, @a.b int r5, a.AbstractC0159a abstractC0159a) {
        this.f5186b = context;
        this.f5187c = str;
        this.d = c03Var;
        this.e = r5;
        this.f = abstractC0159a;
    }

    public final void a() {
        try {
            this.f5185a = qx2.b().e(this.f5186b, qw2.u(), this.f5187c, this.g);
            this.f5185a.l8(new vw2(this.e));
            this.f5185a.v2(new bt2(this.f));
            this.f5185a.f5(ow2.b(this.f5186b, this.d));
        } catch (RemoteException e) {
            tr.e("#007 Could not call remote method.", e);
        }
    }
}

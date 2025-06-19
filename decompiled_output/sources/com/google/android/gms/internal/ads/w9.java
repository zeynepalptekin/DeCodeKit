package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.Map;
import javax.annotation.ParametersAreNonnullByDefault;
import org.json.JSONObject;

@ParametersAreNonnullByDefault
/* loaded from: classes.dex */
public final class w9 implements k9, u9 {
    private final rw d;

    public w9(Context context, as asVar, @androidx.annotation.i0 i52 i52Var, com.google.android.gms.ads.internal.b bVar) throws dx {
        com.google.android.gms.ads.internal.p.d();
        rw rwVarA = zw.a(context, hy.b(), "", false, false, i52Var, null, asVar, null, null, null, tu2.f(), null, false, null, null);
        this.d = rwVarA;
        rwVarA.getView().setWillNotDraw(true);
    }

    private static void D(Runnable runnable) {
        qx2.a();
        if (jr.y()) {
            runnable.run();
        } else {
            to.h.post(runnable);
        }
    }

    @Override // com.google.android.gms.internal.ads.u9
    public final void J(String str) {
        D(new z9(this, str));
    }

    @Override // com.google.android.gms.internal.ads.c9
    public final void M(String str, Map map) {
        o9.b(this, str, map);
    }

    final /* synthetic */ void Q(String str) {
        this.d.i(str);
    }

    @Override // com.google.android.gms.internal.ads.u9
    public final void c0(String str) {
        D(new ca(this, str));
    }

    @Override // com.google.android.gms.internal.ads.u9
    public final void destroy() {
        this.d.destroy();
    }

    @Override // com.google.android.gms.internal.ads.k9, com.google.android.gms.internal.ads.c9
    public final void e(String str, JSONObject jSONObject) {
        o9.d(this, str, jSONObject);
    }

    @Override // com.google.android.gms.internal.ads.u9
    public final void e0(t9 t9Var) {
        ey eyVarC0 = this.d.C0();
        t9Var.getClass();
        eyVarC0.b(x9.b(t9Var));
    }

    @Override // com.google.android.gms.internal.ads.u9
    public final boolean g() {
        return this.d.g();
    }

    @Override // com.google.android.gms.internal.ads.k9, com.google.android.gms.internal.ads.ea
    public final void i(final String str) {
        D(new Runnable(this, str) { // from class: com.google.android.gms.internal.ads.v9
            private final w9 d;
            private final String e;

            {
                this.d = this;
                this.e = str;
            }

            @Override // java.lang.Runnable
            public final void run() {
                this.d.Q(this.e);
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.cb
    public final void j(String str, final z6<? super cb> z6Var) {
        this.d.F(str, new com.google.android.gms.common.util.w(z6Var) { // from class: com.google.android.gms.internal.ads.y9

            /* renamed from: a, reason: collision with root package name */
            private final z6 f6108a;

            {
                this.f6108a = z6Var;
            }

            @Override // com.google.android.gms.common.util.w
            public final boolean a(Object obj) {
                z6 z6Var2 = (z6) obj;
                return (z6Var2 instanceof ba) && ((ba) z6Var2).f2804a.equals(this.f6108a);
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.cb
    public final void o(String str, z6<? super cb> z6Var) {
        this.d.o(str, new ba(this, z6Var));
    }

    @Override // com.google.android.gms.internal.ads.ea
    public final void q(String str, JSONObject jSONObject) {
        o9.c(this, str, jSONObject);
    }

    @Override // com.google.android.gms.internal.ads.u9
    public final void r0(String str) {
        D(new aa(this, String.format("<!DOCTYPE html><html><head><script src=\"%s\"></script></head><body></body></html>", str)));
    }

    @Override // com.google.android.gms.internal.ads.k9
    public final void s(String str, String str2) {
        o9.a(this, str, str2);
    }

    @Override // com.google.android.gms.internal.ads.u9
    public final fb u() {
        return new eb(this);
    }
}

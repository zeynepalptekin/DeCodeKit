package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.Map;
import javax.annotation.ParametersAreNonnullByDefault;
import org.json.JSONObject;

@ParametersAreNonnullByDefault
/* loaded from: classes.dex */
public final class f9 extends p9<cb> implements k9, u9 {
    private final wy f;
    private t9 g;

    public f9(Context context, as asVar) throws dx {
        try {
            wy wyVar = new wy(context, new m9(this));
            this.f = wyVar;
            wyVar.setWillNotDraw(true);
            this.f.addJavascriptInterface(new i9(this), "GoogleJsInterface");
            com.google.android.gms.ads.internal.p.c().k(context, asVar.d, this.f.getSettings());
            super.U(this);
        } catch (Throwable th) {
            throw new dx("Init failed.", th);
        }
    }

    final /* synthetic */ void F0(String str) {
        this.f.i(str);
    }

    final /* synthetic */ void G0(String str) {
        this.f.loadUrl(str);
    }

    final /* synthetic */ void H0(String str) {
        this.f.loadData(str, "text/html", "UTF-8");
    }

    @Override // com.google.android.gms.internal.ads.u9
    public final void J(final String str) {
        cs.e.execute(new Runnable(this, str) { // from class: com.google.android.gms.internal.ads.e9
            private final f9 d;
            private final String e;

            {
                this.d = this;
                this.e = str;
            }

            @Override // java.lang.Runnable
            public final void run() {
                this.d.H0(this.e);
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.c9
    public final void M(String str, Map map) {
        o9.b(this, str, map);
    }

    @Override // com.google.android.gms.internal.ads.u9
    public final void c0(final String str) {
        cs.e.execute(new Runnable(this, str) { // from class: com.google.android.gms.internal.ads.h9
            private final f9 d;
            private final String e;

            {
                this.d = this;
                this.e = str;
            }

            @Override // java.lang.Runnable
            public final void run() {
                this.d.G0(this.e);
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.u9
    public final void destroy() {
        this.f.destroy();
    }

    @Override // com.google.android.gms.internal.ads.k9, com.google.android.gms.internal.ads.c9
    public final void e(String str, JSONObject jSONObject) {
        o9.d(this, str, jSONObject);
    }

    @Override // com.google.android.gms.internal.ads.u9
    public final void e0(t9 t9Var) {
        this.g = t9Var;
    }

    @Override // com.google.android.gms.internal.ads.u9
    public final boolean g() {
        return this.f.g();
    }

    @Override // com.google.android.gms.internal.ads.k9, com.google.android.gms.internal.ads.ea
    public final void i(final String str) {
        cs.e.execute(new Runnable(this, str) { // from class: com.google.android.gms.internal.ads.g9
            private final f9 d;
            private final String e;

            {
                this.d = this;
                this.e = str;
            }

            @Override // java.lang.Runnable
            public final void run() {
                this.d.F0(this.e);
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.ea
    public final void q(String str, JSONObject jSONObject) {
        o9.c(this, str, jSONObject);
    }

    @Override // com.google.android.gms.internal.ads.u9
    public final void r0(String str) {
        J(String.format("<!DOCTYPE html><html><head><script src=\"%s\"></script></head></html>", str));
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

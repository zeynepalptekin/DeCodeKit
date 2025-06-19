package com.google.android.gms.internal.ads;

import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
final class dc implements h7 {

    /* renamed from: a, reason: collision with root package name */
    private final ks<O> f3110a;

    /* renamed from: b, reason: collision with root package name */
    private final /* synthetic */ bc f3111b;

    public dc(bc bcVar, ks<O> ksVar) {
        this.f3111b = bcVar;
        this.f3110a = ksVar;
    }

    @Override // com.google.android.gms.internal.ads.h7
    public final void S(@androidx.annotation.i0 String str) {
        try {
            if (str == null) {
                this.f3110a.b(new hb());
            } else {
                this.f3110a.b(new hb(str));
            }
        } catch (IllegalStateException unused) {
        }
    }

    @Override // com.google.android.gms.internal.ads.h7
    public final void a(JSONObject jSONObject) {
        try {
            this.f3110a.a(this.f3111b.f2818a.b(jSONObject));
        } catch (IllegalStateException unused) {
        } catch (JSONException e) {
            this.f3110a.b(e);
        }
    }
}

package com.google.android.gms.internal.ads;

import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
final class vb implements h7 {

    /* renamed from: a, reason: collision with root package name */
    private final va f5659a;

    /* renamed from: b, reason: collision with root package name */
    private final ks<O> f5660b;

    /* renamed from: c, reason: collision with root package name */
    private final /* synthetic */ ub f5661c;

    public vb(ub ubVar, va vaVar, ks<O> ksVar) {
        this.f5661c = ubVar;
        this.f5659a = vaVar;
        this.f5660b = ksVar;
    }

    @Override // com.google.android.gms.internal.ads.h7
    public final void S(@androidx.annotation.i0 String str) {
        try {
            if (str == null) {
                this.f5660b.b(new hb());
            } else {
                this.f5660b.b(new hb(str));
            }
        } catch (IllegalStateException unused) {
        } catch (Throwable th) {
            this.f5659a.f();
            throw th;
        }
        this.f5659a.f();
    }

    @Override // com.google.android.gms.internal.ads.h7
    public final void a(JSONObject jSONObject) {
        try {
            try {
                this.f5660b.a(this.f5661c.f5495a.b(jSONObject));
            } catch (IllegalStateException unused) {
            } catch (JSONException e) {
                this.f5660b.b(e);
            }
        } finally {
            this.f5659a.f();
        }
    }
}

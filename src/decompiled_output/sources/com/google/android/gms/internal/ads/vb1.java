package com.google.android.gms.internal.ads;

import java.util.concurrent.Callable;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class vb1 implements ff1<wb1> {

    /* renamed from: a, reason: collision with root package name */
    private final cy1 f5663a;

    /* renamed from: b, reason: collision with root package name */
    private final hs0 f5664b;

    /* renamed from: c, reason: collision with root package name */
    private final String f5665c;
    private final an1 d;

    public vb1(cy1 cy1Var, hs0 hs0Var, an1 an1Var, String str) {
        this.f5663a = cy1Var;
        this.f5664b = hs0Var;
        this.d = an1Var;
        this.f5665c = str;
    }

    @Override // com.google.android.gms.internal.ads.ff1
    public final dy1<wb1> a() {
        return this.f5663a.submit(new Callable(this) { // from class: com.google.android.gms.internal.ads.yb1

            /* renamed from: a, reason: collision with root package name */
            private final vb1 f6118a;

            {
                this.f6118a = this;
            }

            @Override // java.util.concurrent.Callable
            public final Object call() {
                return this.f6118a.b();
            }
        });
    }

    final /* synthetic */ wb1 b() throws Exception {
        JSONObject jSONObjectF;
        if (((Boolean) qx2.e().c(e0.z2)).booleanValue() && (jSONObjectF = this.f5664b.f(this.d.f, this.f5665c)) != null) {
            return new wb1(jSONObjectF.toString());
        }
        return null;
    }
}

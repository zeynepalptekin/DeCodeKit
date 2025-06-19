package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.concurrent.Callable;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class eg1 implements ff1<bg1> {

    /* renamed from: a, reason: collision with root package name */
    private final dj f3269a;

    /* renamed from: b, reason: collision with root package name */
    private final Context f3270b;

    /* renamed from: c, reason: collision with root package name */
    private final String f3271c;
    private final cy1 d;

    public eg1(@androidx.annotation.i0 dj djVar, Context context, String str, cy1 cy1Var) {
        this.f3269a = djVar;
        this.f3270b = context;
        this.f3271c = str;
        this.d = cy1Var;
    }

    @Override // com.google.android.gms.internal.ads.ff1
    public final dy1<bg1> a() {
        return this.d.submit(new Callable(this) { // from class: com.google.android.gms.internal.ads.dg1

            /* renamed from: a, reason: collision with root package name */
            private final eg1 f3123a;

            {
                this.f3123a = this;
            }

            @Override // java.util.concurrent.Callable
            public final Object call() {
                return this.f3123a.b();
            }
        });
    }

    final /* synthetic */ bg1 b() throws Exception {
        JSONObject jSONObject = new JSONObject();
        dj djVar = this.f3269a;
        if (djVar != null) {
            djVar.a(this.f3270b, this.f3271c, jSONObject);
        }
        return new bg1(jSONObject);
    }
}

package com.google.android.gms.internal.ads;

import android.os.Bundle;
import java.math.BigInteger;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.Callable;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class ma1 implements ff1<ka1> {

    /* renamed from: a, reason: collision with root package name */
    private final String f4372a;

    /* renamed from: b, reason: collision with root package name */
    private final cy1 f4373b;

    /* renamed from: c, reason: collision with root package name */
    private final fs0 f4374c;

    public ma1(String str, cy1 cy1Var, fs0 fs0Var) {
        this.f4372a = str;
        this.f4373b = cy1Var;
        this.f4374c = fs0Var;
    }

    private static Bundle c(rn1 rn1Var) {
        Bundle bundle = new Bundle();
        try {
            if (rn1Var.B() != null) {
                bundle.putString("sdk_version", rn1Var.B().toString());
            }
        } catch (in1 unused) {
        }
        try {
            if (rn1Var.A() != null) {
                bundle.putString("adapter_version", rn1Var.A().toString());
            }
        } catch (in1 unused2) {
        }
        return bundle;
    }

    @Override // com.google.android.gms.internal.ads.ff1
    public final dy1<ka1> a() {
        if (new BigInteger(this.f4372a).equals(BigInteger.ONE)) {
            if (!dv1.b((String) qx2.e().c(e0.i1))) {
                return this.f4373b.submit(new Callable(this) { // from class: com.google.android.gms.internal.ads.pa1

                    /* renamed from: a, reason: collision with root package name */
                    private final ma1 f4790a;

                    {
                        this.f4790a = this;
                    }

                    @Override // java.util.concurrent.Callable
                    public final Object call() {
                        return this.f4790a.b();
                    }
                });
            }
        }
        return qx1.g(new ka1(new Bundle()));
    }

    final /* synthetic */ ka1 b() throws Exception {
        List<String> listAsList = Arrays.asList(((String) qx2.e().c(e0.i1)).split(";"));
        Bundle bundle = new Bundle();
        for (String str : listAsList) {
            try {
                bundle.putBundle(str, c(this.f4374c.d(str, new JSONObject())));
            } catch (in1 unused) {
            }
        }
        return new ka1(bundle);
    }
}

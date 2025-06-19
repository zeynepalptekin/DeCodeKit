package com.google.android.gms.internal.ads;

import java.util.HashMap;
import java.util.Map;
import javax.annotation.concurrent.GuardedBy;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class a51 implements v01<rn1, o21> {

    /* renamed from: a, reason: collision with root package name */
    @GuardedBy("this")
    private final Map<String, w01<rn1, o21>> f2631a = new HashMap();

    /* renamed from: b, reason: collision with root package name */
    private final fs0 f2632b;

    public a51(fs0 fs0Var) {
        this.f2632b = fs0Var;
    }

    @Override // com.google.android.gms.internal.ads.v01
    public final w01<rn1, o21> a(String str, JSONObject jSONObject) throws in1 {
        synchronized (this) {
            w01<rn1, o21> w01Var = this.f2631a.get(str);
            if (w01Var == null) {
                rn1 rn1VarD = this.f2632b.d(str, jSONObject);
                if (rn1VarD == null) {
                    return null;
                }
                w01Var = new w01<>(rn1VarD, new o21(), str);
                this.f2631a.put(str, w01Var);
            }
            return w01Var;
        }
    }
}

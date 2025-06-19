package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import java.util.concurrent.Callable;

/* loaded from: classes.dex */
public final class oc1 implements ff1<pc1> {

    /* renamed from: a, reason: collision with root package name */
    private final Context f4676a;

    /* renamed from: b, reason: collision with root package name */
    private final cy1 f4677b;

    public oc1(Context context, cy1 cy1Var) {
        this.f4676a = context;
        this.f4677b = cy1Var;
    }

    @Override // com.google.android.gms.internal.ads.ff1
    public final dy1<pc1> a() {
        return this.f4677b.submit(new Callable(this) { // from class: com.google.android.gms.internal.ads.rc1

            /* renamed from: a, reason: collision with root package name */
            private final oc1 f5123a;

            {
                this.f5123a = this;
            }

            @Override // java.util.concurrent.Callable
            public final Object call() {
                String strP;
                String strB;
                String strJ;
                com.google.android.gms.ads.internal.p.c();
                js2 js2VarC = com.google.android.gms.ads.internal.p.g().r().C();
                Bundle bundle = null;
                if (js2VarC != null && js2VarC != null && (!com.google.android.gms.ads.internal.p.g().r().x() || !com.google.android.gms.ads.internal.p.g().r().j())) {
                    if (js2VarC.i()) {
                        js2VarC.a();
                    }
                    ds2 ds2VarG = js2VarC.g();
                    if (ds2VarG != null) {
                        strP = ds2VarG.i();
                        strJ = ds2VarG.j();
                        strB = ds2VarG.k();
                        if (strP != null) {
                            com.google.android.gms.ads.internal.p.g().r().z(strP);
                        }
                        if (strB != null) {
                            com.google.android.gms.ads.internal.p.g().r().F(strB);
                        }
                    } else {
                        strP = com.google.android.gms.ads.internal.p.g().r().p();
                        strB = com.google.android.gms.ads.internal.p.g().r().B();
                        strJ = null;
                    }
                    Bundle bundle2 = new Bundle(1);
                    if (!com.google.android.gms.ads.internal.p.g().r().j()) {
                        if (strB == null || TextUtils.isEmpty(strB)) {
                            strB = "no_hash";
                        }
                        bundle2.putString("v_fp_vertical", strB);
                    }
                    if (strP != null && !com.google.android.gms.ads.internal.p.g().r().x()) {
                        bundle2.putString("fingerprint", strP);
                        if (!strP.equals(strJ)) {
                            bundle2.putString("v_fp", strJ);
                        }
                    }
                    if (!bundle2.isEmpty()) {
                        bundle = bundle2;
                    }
                }
                return new pc1(bundle);
            }
        });
    }
}

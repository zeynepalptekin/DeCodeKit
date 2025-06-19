package com.google.android.gms.internal.ads;

import java.util.Iterator;
import javax.annotation.Nullable;

/* loaded from: classes.dex */
public final class i41 {

    /* renamed from: a, reason: collision with root package name */
    private final mn1 f3763a;

    /* renamed from: b, reason: collision with root package name */
    private final as0 f3764b;

    /* renamed from: c, reason: collision with root package name */
    private final hu0 f3765c;

    public i41(mn1 mn1Var, as0 as0Var, hu0 hu0Var) {
        this.f3763a = mn1Var;
        this.f3764b = as0Var;
        this.f3765c = hu0Var;
    }

    public final void a(lm1 lm1Var, km1 km1Var, int r5, @Nullable y01 y01Var, long j) {
        bs0 bs0VarC;
        gu0 gu0VarH = this.f3765c.b().a(lm1Var).g(km1Var).h("action", "adapter_status").h("adapter_l", String.valueOf(j));
        gu0VarH.h("sc", Integer.toString(r5));
        if (y01Var != null) {
            gu0VarH.h("arec", Integer.toString(y01Var.b().d));
            String strA = this.f3763a.a(y01Var.getMessage());
            if (strA != null) {
                gu0VarH.h("areec", strA);
            }
        }
        as0 as0Var = this.f3764b;
        Iterator<String> it = km1Var.s.iterator();
        while (true) {
            if (!it.hasNext()) {
                bs0VarC = null;
                break;
            } else {
                bs0VarC = as0Var.c(it.next());
                if (bs0VarC != null) {
                    break;
                }
            }
        }
        if (bs0VarC != null) {
            gu0VarH.h("ancn", bs0VarC.f2870a);
            mf mfVar = bs0VarC.f2871b;
            if (mfVar != null) {
                gu0VarH.h("adapter_v", mfVar.toString());
            }
            mf mfVar2 = bs0VarC.f2872c;
            if (mfVar2 != null) {
                gu0VarH.h("adapter_sv", mfVar2.toString());
            }
        }
        gu0VarH.c();
    }
}

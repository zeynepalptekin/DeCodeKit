package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class zn2 implements tn2 {
    private final tn2[] d;
    private final ArrayList<tn2> e;
    private xn2 g;
    private ni2 h;
    private Object i;
    private bo2 k;
    private final ti2 f = new ti2();
    private int j = -1;

    public zn2(tn2... tn2VarArr) {
        this.d = tn2VarArr;
        this.e = new ArrayList<>(Arrays.asList(tn2VarArr));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void d(int r5, ni2 ni2Var, Object obj) {
        bo2 bo2Var;
        if (this.k == null) {
            int r0 = ni2Var.g();
            int r2 = 0;
            while (true) {
                if (r2 >= r0) {
                    if (this.j == -1) {
                        this.j = ni2Var.h();
                    } else if (ni2Var.h() != this.j) {
                        bo2Var = new bo2(1);
                    }
                    bo2Var = null;
                } else {
                    if (ni2Var.d(r2, this.f, false).e) {
                        bo2Var = new bo2(0);
                        break;
                    }
                    r2++;
                }
            }
            this.k = bo2Var;
        }
        if (this.k != null) {
            return;
        }
        this.e.remove(this.d[r5]);
        if (r5 == 0) {
            this.h = ni2Var;
            this.i = obj;
        }
        if (this.e.isEmpty()) {
            this.g.d(this.h, this.i);
        }
    }

    @Override // com.google.android.gms.internal.ads.tn2
    public final void a(rh2 rh2Var, boolean z, xn2 xn2Var) {
        this.g = xn2Var;
        int r5 = 0;
        while (true) {
            tn2[] tn2VarArr = this.d;
            if (r5 >= tn2VarArr.length) {
                return;
            }
            tn2VarArr[r5].a(rh2Var, false, new yn2(this, r5));
            r5++;
        }
    }

    @Override // com.google.android.gms.internal.ads.tn2
    public final void b() throws IOException {
        bo2 bo2Var = this.k;
        if (bo2Var != null) {
            throw bo2Var;
        }
        for (tn2 tn2Var : this.d) {
            tn2Var.b();
        }
    }

    @Override // com.google.android.gms.internal.ads.tn2
    public final void c(rn2 rn2Var) {
        wn2 wn2Var = (wn2) rn2Var;
        int r0 = 0;
        while (true) {
            tn2[] tn2VarArr = this.d;
            if (r0 >= tn2VarArr.length) {
                return;
            }
            tn2VarArr[r0].c(wn2Var.d[r0]);
            r0++;
        }
    }

    @Override // com.google.android.gms.internal.ads.tn2
    public final rn2 e(int r5, gp2 gp2Var) {
        int length = this.d.length;
        rn2[] rn2VarArr = new rn2[length];
        for (int r2 = 0; r2 < length; r2++) {
            rn2VarArr[r2] = this.d[r2].e(r5, gp2Var);
        }
        return new wn2(rn2VarArr);
    }

    @Override // com.google.android.gms.internal.ads.tn2
    public final void f() {
        for (tn2 tn2Var : this.d) {
            tn2Var.f();
        }
    }
}

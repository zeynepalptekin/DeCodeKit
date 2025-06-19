package com.google.android.gms.internal.ads;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import java.util.Arrays;
import java.util.List;

/* loaded from: classes.dex */
public final class op0 extends f4 {
    private final Context e;
    private final nl0 f;
    private km0 g;
    private bl0 h;

    public op0(Context context, nl0 nl0Var, km0 km0Var, bl0 bl0Var) {
        this.e = context;
        this.f = nl0Var;
        this.g = km0Var;
        this.h = bl0Var;
    }

    @Override // com.google.android.gms.internal.ads.h4
    public final List<String> D0() {
        b.f.i<String, v2> iVarI = this.f.I();
        b.f.i<String, String> iVarK = this.f.K();
        String[] strArr = new String[iVarI.size() + iVarK.size()];
        int r3 = 0;
        int r4 = 0;
        int r5 = 0;
        while (r4 < iVarI.size()) {
            strArr[r5] = iVarI.i(r4);
            r4++;
            r5++;
        }
        while (r3 < iVarK.size()) {
            strArr[r5] = iVarK.i(r3);
            r3++;
            r5++;
        }
        return Arrays.asList(strArr);
    }

    @Override // com.google.android.gms.internal.ads.h4
    public final k3 D6(String str) {
        return this.f.I().get(str);
    }

    @Override // com.google.android.gms.internal.ads.h4
    public final c.a.b.b.e.c K() {
        return null;
    }

    @Override // com.google.android.gms.internal.ads.h4
    public final void L6(c.a.b.b.e.c cVar) {
        bl0 bl0Var;
        Object objE2 = c.a.b.b.e.e.e2(cVar);
        if (!(objE2 instanceof View) || this.f.H() == null || (bl0Var = this.h) == null) {
            return;
        }
        bl0Var.s((View) objE2);
    }

    @Override // com.google.android.gms.internal.ads.h4
    public final void Q0(String str) {
        bl0 bl0Var = this.h;
        if (bl0Var != null) {
            bl0Var.D(str);
        }
    }

    @Override // com.google.android.gms.internal.ads.h4
    public final c.a.b.b.e.c S3() {
        return c.a.b.b.e.e.i2(this.e);
    }

    @Override // com.google.android.gms.internal.ads.h4
    public final boolean X1() {
        bl0 bl0Var = this.h;
        return (bl0Var == null || bl0Var.w()) && this.f.G() != null && this.f.F() == null;
    }

    @Override // com.google.android.gms.internal.ads.h4
    public final String Z0() {
        return this.f.e();
    }

    @Override // com.google.android.gms.internal.ads.h4
    public final void destroy() {
        bl0 bl0Var = this.h;
        if (bl0Var != null) {
            bl0Var.a();
        }
        this.h = null;
        this.g = null;
    }

    @Override // com.google.android.gms.internal.ads.h4
    public final boolean e7() {
        c.a.b.b.e.c cVarH = this.f.H();
        if (cVarH != null) {
            com.google.android.gms.ads.internal.p.r().e(cVarH);
            return true;
        }
        tr.i("Trying to start OMID session before creation.");
        return false;
    }

    @Override // com.google.android.gms.internal.ads.h4
    public final void g() {
        bl0 bl0Var = this.h;
        if (bl0Var != null) {
            bl0Var.u();
        }
    }

    @Override // com.google.android.gms.internal.ads.h4
    public final boolean g8(c.a.b.b.e.c cVar) {
        Object objE2 = c.a.b.b.e.e.e2(cVar);
        if (!(objE2 instanceof ViewGroup)) {
            return false;
        }
        km0 km0Var = this.g;
        if (!(km0Var != null && km0Var.c((ViewGroup) objE2))) {
            return false;
        }
        this.f.F().n0(new rp0(this));
        return true;
    }

    @Override // com.google.android.gms.internal.ads.h4
    public final uz2 getVideoController() {
        return this.f.n();
    }

    @Override // com.google.android.gms.internal.ads.h4
    public final void p5() {
        String strJ = this.f.J();
        if ("Google".equals(strJ)) {
            tr.i("Illegal argument specified for omid partner name.");
            return;
        }
        bl0 bl0Var = this.h;
        if (bl0Var != null) {
            bl0Var.G(strJ, false);
        }
    }

    @Override // com.google.android.gms.internal.ads.h4
    public final String z4(String str) {
        return this.f.K().get(str);
    }
}

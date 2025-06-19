package com.google.android.gms.ads.c0;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.i0;
import androidx.annotation.o0;
import com.google.android.gms.ads.a0;
import com.google.android.gms.ads.j;
import com.google.android.gms.ads.y;
import com.google.android.gms.ads.z;
import com.google.android.gms.common.internal.r;
import com.google.android.gms.internal.ads.e03;
import com.google.android.gms.internal.ads.hy2;
import com.google.android.gms.internal.ads.tr;

/* loaded from: classes.dex */
public final class e extends ViewGroup {
    private final e03 d;

    public e(Context context) {
        super(context);
        this.d = new e03(this);
    }

    public e(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.d = new e03(this, attributeSet, true);
        r.l(context, "Context cannot be null");
    }

    public e(Context context, AttributeSet attributeSet, int r3) {
        super(context, attributeSet, r3);
        this.d = new e03(this, attributeSet, true);
    }

    public final void a() {
        this.d.a();
    }

    public final boolean b() {
        return this.d.l();
    }

    @o0("android.permission.INTERNET")
    public final void c(d dVar) {
        this.d.A(dVar.n());
    }

    public final void d() {
        this.d.m();
    }

    public final void e() {
        this.d.n();
    }

    public final void f() {
        this.d.o();
    }

    public final boolean g(hy2 hy2Var) {
        return this.d.C(hy2Var);
    }

    public final com.google.android.gms.ads.c getAdListener() {
        return this.d.b();
    }

    public final com.google.android.gms.ads.f getAdSize() {
        return this.d.c();
    }

    public final com.google.android.gms.ads.f[] getAdSizes() {
        return this.d.d();
    }

    public final String getAdUnitId() {
        return this.d.e();
    }

    public final a getAppEventListener() {
        return this.d.f();
    }

    @Deprecated
    public final String getMediationAdapterClassName() {
        return this.d.g();
    }

    public final c getOnCustomRenderedAdLoadedListener() {
        return this.d.h();
    }

    @i0
    public final y getResponseInfo() {
        return this.d.i();
    }

    public final z getVideoController() {
        return this.d.j();
    }

    public final a0 getVideoOptions() {
        return this.d.k();
    }

    @Override // android.view.ViewGroup, android.view.View
    protected final void onLayout(boolean z, int r4, int r5, int r6, int r7) {
        View childAt = getChildAt(0);
        if (childAt == null || childAt.getVisibility() == 8) {
            return;
        }
        int measuredWidth = childAt.getMeasuredWidth();
        int measuredHeight = childAt.getMeasuredHeight();
        int r62 = ((r6 - r4) - measuredWidth) / 2;
        int r72 = ((r7 - r5) - measuredHeight) / 2;
        childAt.layout(r62, r72, measuredWidth + r62, measuredHeight + r72);
    }

    @Override // android.view.View
    protected final void onMeasure(int r5, int r6) {
        int measuredHeight;
        int measuredWidth = 0;
        View childAt = getChildAt(0);
        if (childAt == null || childAt.getVisibility() == 8) {
            com.google.android.gms.ads.f adSize = null;
            try {
                adSize = getAdSize();
            } catch (NullPointerException e) {
                tr.c("Unable to retrieve ad size.", e);
            }
            if (adSize != null) {
                Context context = getContext();
                int r2 = adSize.m(context);
                measuredHeight = adSize.e(context);
                measuredWidth = r2;
            } else {
                measuredHeight = 0;
            }
        } else {
            measureChild(childAt, r5, r6);
            measuredWidth = childAt.getMeasuredWidth();
            measuredHeight = childAt.getMeasuredHeight();
        }
        setMeasuredDimension(View.resolveSize(Math.max(measuredWidth, getSuggestedMinimumWidth()), r5), View.resolveSize(Math.max(measuredHeight, getSuggestedMinimumHeight()), r6));
    }

    public final void setAdListener(com.google.android.gms.ads.c cVar) {
        this.d.p(cVar);
    }

    public final void setAdSizes(com.google.android.gms.ads.f... fVarArr) {
        if (fVarArr == null || fVarArr.length <= 0) {
            throw new IllegalArgumentException("The supported ad sizes must contain at least one valid ad size.");
        }
        this.d.B(fVarArr);
    }

    public final void setAdUnitId(String str) {
        this.d.r(str);
    }

    public final void setAppEventListener(a aVar) {
        this.d.s(aVar);
    }

    @com.google.android.gms.common.annotation.a
    @Deprecated
    public final void setCorrelator(j jVar) {
    }

    public final void setManualImpressionsEnabled(boolean z) {
        this.d.t(z);
    }

    public final void setOnCustomRenderedAdLoadedListener(c cVar) {
        this.d.u(cVar);
    }

    public final void setVideoOptions(a0 a0Var) {
        this.d.w(a0Var);
    }
}

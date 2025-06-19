package com.google.android.gms.ads;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.i0;
import com.google.android.gms.internal.ads.e03;
import com.google.android.gms.internal.ads.tr;
import com.google.android.gms.internal.ads.zv2;

/* loaded from: classes.dex */
class i extends ViewGroup {
    protected final e03 d;

    public i(Context context, int r2) {
        super(context);
        this.d = new e03(this, r2);
    }

    public i(Context context, AttributeSet attributeSet, int r4) {
        super(context, attributeSet);
        this.d = new e03(this, attributeSet, false, r4);
    }

    public i(Context context, AttributeSet attributeSet, int r3, int r4) {
        super(context, attributeSet, r3);
        this.d = new e03(this, attributeSet, false, r4);
    }

    public void a() {
        this.d.a();
    }

    public boolean b() {
        return this.d.l();
    }

    @androidx.annotation.o0("android.permission.INTERNET")
    public void c(e eVar) {
        this.d.A(eVar.k());
    }

    public void d() {
        this.d.m();
    }

    public void e() {
        this.d.o();
    }

    public c getAdListener() {
        return this.d.b();
    }

    public f getAdSize() {
        return this.d.c();
    }

    public String getAdUnitId() {
        return this.d.e();
    }

    @Deprecated
    public String getMediationAdapterClassName() {
        return this.d.g();
    }

    @i0
    public y getResponseInfo() {
        return this.d.i();
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z, int r4, int r5, int r6, int r7) {
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
    protected void onMeasure(int r5, int r6) {
        int measuredHeight;
        int measuredWidth = 0;
        View childAt = getChildAt(0);
        if (childAt == null || childAt.getVisibility() == 8) {
            f adSize = null;
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

    /* JADX WARN: Multi-variable type inference failed */
    public void setAdListener(c cVar) {
        this.d.p(cVar);
        if (cVar == 0) {
            this.d.z(null);
            this.d.s(null);
            return;
        }
        if (cVar instanceof zv2) {
            this.d.z((zv2) cVar);
        }
        if (cVar instanceof com.google.android.gms.ads.c0.a) {
            this.d.s((com.google.android.gms.ads.c0.a) cVar);
        }
    }

    public void setAdSize(f fVar) {
        this.d.q(fVar);
    }

    public void setAdUnitId(String str) {
        this.d.r(str);
    }

    public void setOnPaidEventListener(@i0 u uVar) {
        this.d.v(uVar);
    }
}

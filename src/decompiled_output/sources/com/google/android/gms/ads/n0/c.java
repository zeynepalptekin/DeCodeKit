package com.google.android.gms.ads.n0;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.o0;
import com.google.android.gms.ads.f;
import com.google.android.gms.internal.ads.e03;
import com.google.android.gms.internal.ads.tr;

/* loaded from: classes.dex */
public final class c extends ViewGroup {
    private final e03 d;

    public c(Context context) {
        super(context);
        this.d = new e03(this);
    }

    public c(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.d = new e03(this, attributeSet, false);
    }

    public c(Context context, AttributeSet attributeSet, int r3) {
        super(context, attributeSet, r3);
        this.d = new e03(this, attributeSet, false);
    }

    public final void a() {
        this.d.a();
    }

    @o0("android.permission.INTERNET")
    public final void b(a aVar) {
        if (!f.s.equals(getAdSize())) {
            throw new IllegalStateException("You must use AdSize.SEARCH for a DynamicHeightSearchAdRequest");
        }
        this.d.A(aVar.f());
    }

    @o0("android.permission.INTERNET")
    public final void c(b bVar) {
        this.d.A(bVar.t());
    }

    public final void d() {
        this.d.m();
    }

    public final void e() {
        this.d.o();
    }

    public final com.google.android.gms.ads.c getAdListener() {
        return this.d.b();
    }

    public final f getAdSize() {
        return this.d.c();
    }

    public final String getAdUnitId() {
        return this.d.e();
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

    public final void setAdListener(com.google.android.gms.ads.c cVar) {
        this.d.p(cVar);
    }

    public final void setAdSize(f fVar) {
        this.d.q(fVar);
    }

    public final void setAdUnitId(String str) {
        this.d.r(str);
    }
}

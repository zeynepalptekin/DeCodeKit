package com.google.android.gms.ads.b0;

import android.content.Context;
import android.os.RemoteException;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import c.a.b.b.e.e;
import com.google.android.gms.ads.f;
import com.google.android.gms.common.internal.r;
import com.google.android.gms.internal.ads.et2;
import com.google.android.gms.internal.ads.hy2;
import com.google.android.gms.internal.ads.qw2;
import com.google.android.gms.internal.ads.tr;

@Deprecated
/* loaded from: classes.dex */
public final class c extends ViewGroup {
    private a d;
    private b e;

    public c(Context context) {
        super(context);
        r.l(context, "Context cannot be null");
    }

    public c(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public c(Context context, AttributeSet attributeSet, int r3) {
        super(context, attributeSet, r3);
    }

    private final void a() {
        a aVar = this.d;
        if (aVar == null || this.e == null) {
            return;
        }
        aVar.e(new et2(this.e));
    }

    private final f getAdSize() {
        hy2 hy2VarF = this.d.f();
        if (hy2VarF == null) {
            return null;
        }
        try {
            qw2 qw2VarQ8 = hy2VarF.q8();
            if (qw2VarQ8 != null) {
                return qw2VarQ8.B();
            }
            return null;
        } catch (RemoteException e) {
            tr.e("#007 Could not call remote method.", e);
            return null;
        }
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

    public final void setAppOpenAd(a aVar) {
        c.a.b.b.e.c cVarQ4;
        try {
            hy2 hy2VarF = aVar.f();
            if (hy2VarF == null || (cVarQ4 = hy2VarF.Q4()) == null) {
                return;
            }
            View view = (View) e.e2(cVarQ4);
            if (view.getParent() != null) {
                tr.g("Trying to set AppOpenAd which is already in use.");
                return;
            }
            removeAllViews();
            addView(view);
            this.d = aVar;
            a();
        } catch (RemoteException e) {
            tr.e("#007 Could not call remote method.", e);
        }
    }

    public final void setAppOpenAdPresentationCallback(b bVar) {
        this.e = bVar;
        a();
    }
}

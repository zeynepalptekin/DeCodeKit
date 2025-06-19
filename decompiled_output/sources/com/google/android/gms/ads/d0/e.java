package com.google.android.gms.ads.d0;

import android.annotation.TargetApi;
import android.content.Context;
import android.os.RemoteException;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.google.android.gms.internal.ads.e0;
import com.google.android.gms.internal.ads.o3;
import com.google.android.gms.internal.ads.qx2;
import com.google.android.gms.internal.ads.tr;

@Deprecated
/* loaded from: classes.dex */
public class e extends FrameLayout {
    private final FrameLayout d;
    private final o3 e;

    public e(Context context) {
        super(context);
        this.d = d(context);
        this.e = e();
    }

    public e(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.d = d(context);
        this.e = e();
    }

    public e(Context context, AttributeSet attributeSet, int r3) {
        super(context, attributeSet, r3);
        this.d = d(context);
        this.e = e();
    }

    @TargetApi(21)
    public e(Context context, AttributeSet attributeSet, int r3, int r4) {
        super(context, attributeSet, r3, r4);
        this.d = d(context);
        this.e = e();
    }

    private final FrameLayout d(Context context) {
        FrameLayout frameLayout = new FrameLayout(context);
        frameLayout.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
        addView(frameLayout);
        return frameLayout;
    }

    private final o3 e() {
        com.google.android.gms.common.internal.r.l(this.d, "createDelegate must be called after mOverlayFrame has been created");
        if (isInEditMode()) {
            return null;
        }
        return qx2.b().a(this.d.getContext(), this, this.d);
    }

    public void a() {
        try {
            this.e.destroy();
        } catch (RemoteException e) {
            tr.c("Unable to destroy native ad view", e);
        }
    }

    @Override // android.view.ViewGroup
    public void addView(View view, int r2, ViewGroup.LayoutParams layoutParams) {
        super.addView(view, r2, layoutParams);
        super.bringChildToFront(this.d);
    }

    protected final void b(String str, View view) {
        try {
            this.e.j6(str, c.a.b.b.e.e.i2(view));
        } catch (RemoteException e) {
            tr.c("Unable to call setAssetView on delegate", e);
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void bringChildToFront(View view) {
        super.bringChildToFront(view);
        FrameLayout frameLayout = this.d;
        if (frameLayout != view) {
            super.bringChildToFront(frameLayout);
        }
    }

    protected final View c(String str) {
        try {
            c.a.b.b.e.c cVarJ3 = this.e.j3(str);
            if (cVarJ3 != null) {
                return (View) c.a.b.b.e.e.e2(cVarJ3);
            }
            return null;
        } catch (RemoteException e) {
            tr.c("Unable to call getAssetView on delegate", e);
            return null;
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        o3 o3Var;
        if (((Boolean) qx2.e().c(e0.U1)).booleanValue() && (o3Var = this.e) != null) {
            try {
                o3Var.r2(c.a.b.b.e.e.i2(motionEvent));
            } catch (RemoteException e) {
                tr.c("Unable to call handleTouchEvent on delegate", e);
            }
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    public a getAdChoicesView() {
        View viewC = c(c.f2357a);
        if (viewC instanceof a) {
            return (a) viewC;
        }
        return null;
    }

    @Override // android.view.View
    public void onVisibilityChanged(View view, int r3) {
        super.onVisibilityChanged(view, r3);
        o3 o3Var = this.e;
        if (o3Var != null) {
            try {
                o3Var.o2(c.a.b.b.e.e.i2(view), r3);
            } catch (RemoteException e) {
                tr.c("Unable to call onVisibilityChanged on delegate", e);
            }
        }
    }

    @Override // android.view.ViewGroup
    public void removeAllViews() {
        super.removeAllViews();
        super.addView(this.d);
    }

    @Override // android.view.ViewGroup, android.view.ViewManager
    public void removeView(View view) {
        if (this.d == view) {
            return;
        }
        super.removeView(view);
    }

    public void setAdChoicesView(a aVar) {
        b(c.f2357a, aVar);
    }

    public void setNativeAd(c cVar) {
        try {
            this.e.o0((c.a.b.b.e.c) cVar.d());
        } catch (RemoteException e) {
            tr.c("Unable to call setNativeAd on delegate", e);
        }
    }
}

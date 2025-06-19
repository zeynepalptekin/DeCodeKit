package com.google.android.gms.ads.d0;

import android.annotation.TargetApi;
import android.content.Context;
import android.os.RemoteException;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import com.google.android.gms.internal.ads.e0;
import com.google.android.gms.internal.ads.o3;
import com.google.android.gms.internal.ads.qx2;
import com.google.android.gms.internal.ads.t03;
import com.google.android.gms.internal.ads.tr;
import com.google.android.gms.internal.ads.u2;
import com.google.android.gms.internal.ads.w2;

/* loaded from: classes.dex */
public final class q extends FrameLayout {
    private final FrameLayout d;
    private final o3 e;

    public q(Context context) {
        super(context);
        this.d = f(context);
        this.e = g();
    }

    public q(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.d = f(context);
        this.e = g();
    }

    public q(Context context, AttributeSet attributeSet, int r3) {
        super(context, attributeSet, r3);
        this.d = f(context);
        this.e = g();
    }

    @TargetApi(21)
    public q(Context context, AttributeSet attributeSet, int r3, int r4) {
        super(context, attributeSet, r3, r4);
        this.d = f(context);
        this.e = g();
    }

    private final void d(String str, View view) {
        try {
            this.e.j6(str, c.a.b.b.e.e.i2(view));
        } catch (RemoteException e) {
            tr.c("Unable to call setAssetView on delegate", e);
        }
    }

    private final View e(String str) {
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

    private final FrameLayout f(Context context) {
        FrameLayout frameLayout = new FrameLayout(context);
        frameLayout.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
        addView(frameLayout);
        return frameLayout;
    }

    private final o3 g() {
        com.google.android.gms.common.internal.r.l(this.d, "createDelegate must be called after overlayFrame has been created");
        if (isInEditMode()) {
            return null;
        }
        return qx2.b().a(this.d.getContext(), this, this.d);
    }

    public final void a() {
        try {
            this.e.destroy();
        } catch (RemoteException e) {
            tr.c("Unable to destroy native ad view", e);
        }
    }

    @Override // android.view.ViewGroup
    public final void addView(View view, int r2, ViewGroup.LayoutParams layoutParams) {
        super.addView(view, r2, layoutParams);
        super.bringChildToFront(this.d);
    }

    final /* synthetic */ void b(ImageView.ScaleType scaleType) {
        if (scaleType != null) {
            try {
                this.e.J7(c.a.b.b.e.e.i2(scaleType));
            } catch (RemoteException e) {
                tr.c("Unable to call setMediaViewImageScaleType on delegate", e);
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void bringChildToFront(View view) {
        super.bringChildToFront(view);
        FrameLayout frameLayout = this.d;
        if (frameLayout != view) {
            super.bringChildToFront(frameLayout);
        }
    }

    final /* synthetic */ void c(com.google.android.gms.ads.o oVar) {
        try {
            if (oVar instanceof t03) {
                this.e.l4(((t03) oVar).a());
            } else if (oVar == null) {
                this.e.l4(null);
            } else {
                tr.f("Use MediaContent provided by UnifiedNativeAd.getMediaContent");
            }
        } catch (RemoteException e) {
            tr.c("Unable to call setMediaContent on delegate", e);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
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

    public final a getAdChoicesView() {
        View viewE = e(p.k);
        if (viewE instanceof a) {
            return (a) viewE;
        }
        return null;
    }

    public final View getAdvertiserView() {
        return e(p.e);
    }

    public final View getBodyView() {
        return e(p.d);
    }

    public final View getCallToActionView() {
        return e(p.f2376b);
    }

    public final View getHeadlineView() {
        return e(p.f2375a);
    }

    public final View getIconView() {
        return e(p.f2377c);
    }

    public final View getImageView() {
        return e(p.h);
    }

    public final b getMediaView() {
        View viewE = e(p.j);
        if (viewE instanceof b) {
            return (b) viewE;
        }
        if (viewE == null) {
            return null;
        }
        tr.f("View is not an instance of MediaView");
        return null;
    }

    public final View getPriceView() {
        return e(p.g);
    }

    public final View getStarRatingView() {
        return e(p.i);
    }

    public final View getStoreView() {
        return e(p.f);
    }

    @Override // android.view.View
    public final void onVisibilityChanged(View view, int r3) {
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
    public final void removeAllViews() {
        super.removeAllViews();
        super.addView(this.d);
    }

    @Override // android.view.ViewGroup, android.view.ViewManager
    public final void removeView(View view) {
        if (this.d == view) {
            return;
        }
        super.removeView(view);
    }

    public final void setAdChoicesView(a aVar) {
        d(p.k, aVar);
    }

    public final void setAdvertiserView(View view) {
        d(p.e, view);
    }

    public final void setBodyView(View view) {
        d(p.d, view);
    }

    public final void setCallToActionView(View view) {
        d(p.f2376b, view);
    }

    public final void setClickConfirmingView(View view) {
        try {
            this.e.T0(c.a.b.b.e.e.i2(view));
        } catch (RemoteException e) {
            tr.c("Unable to call setClickConfirmingView on delegate", e);
        }
    }

    public final void setHeadlineView(View view) {
        d(p.f2375a, view);
    }

    public final void setIconView(View view) {
        d(p.f2377c, view);
    }

    public final void setImageView(View view) {
        d(p.h, view);
    }

    public final void setMediaView(b bVar) {
        d(p.j, bVar);
        if (bVar != null) {
            bVar.a(new u2(this) { // from class: com.google.android.gms.ads.d0.u

                /* renamed from: a, reason: collision with root package name */
                private final q f2378a;

                {
                    this.f2378a = this;
                }

                @Override // com.google.android.gms.internal.ads.u2
                public final void a(com.google.android.gms.ads.o oVar) {
                    this.f2378a.c(oVar);
                }
            });
            bVar.b(new w2(this) { // from class: com.google.android.gms.ads.d0.v

                /* renamed from: a, reason: collision with root package name */
                private final q f2379a;

                {
                    this.f2379a = this;
                }

                @Override // com.google.android.gms.internal.ads.w2
                public final void a(ImageView.ScaleType scaleType) {
                    this.f2379a.b(scaleType);
                }
            });
        }
    }

    public final void setNativeAd(o oVar) {
        try {
            this.e.o0((c.a.b.b.e.c) oVar.D());
        } catch (RemoteException e) {
            tr.c("Unable to call setNativeAd on delegate", e);
        }
    }

    public final void setPriceView(View view) {
        d(p.g, view);
    }

    public final void setStarRatingView(View view) {
        d(p.i, view);
    }

    public final void setStoreView(View view) {
        d(p.f, view);
    }
}

package com.google.android.gms.ads.d0;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import com.google.android.gms.internal.ads.tr;

@Deprecated
/* loaded from: classes.dex */
public final class h extends e {
    public h(Context context) {
        super(context);
    }

    public h(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public h(Context context, AttributeSet attributeSet, int r3) {
        super(context, attributeSet, r3);
    }

    public h(Context context, AttributeSet attributeSet, int r3, int r4) {
        super(context, attributeSet, r3, r4);
    }

    public final View getBodyView() {
        return super.c(g.e);
    }

    public final View getCallToActionView() {
        return super.c(g.f2368c);
    }

    public final View getHeadlineView() {
        return super.c(g.f2367b);
    }

    public final View getIconView() {
        return super.c(g.d);
    }

    public final View getImageView() {
        return super.c(g.h);
    }

    public final b getMediaView() {
        View viewC = super.c(g.j);
        if (viewC instanceof b) {
            return (b) viewC;
        }
        if (viewC == null) {
            return null;
        }
        tr.f("View is not an instance of MediaView");
        return null;
    }

    public final View getPriceView() {
        return super.c(g.g);
    }

    public final View getStarRatingView() {
        return super.c(g.i);
    }

    public final View getStoreView() {
        return super.c(g.f);
    }

    public final void setBodyView(View view) {
        super.b(g.e, view);
    }

    public final void setCallToActionView(View view) {
        super.b(g.f2368c, view);
    }

    public final void setHeadlineView(View view) {
        super.b(g.f2367b, view);
    }

    public final void setIconView(View view) {
        super.b(g.d, view);
    }

    public final void setImageView(View view) {
        super.b(g.h, view);
    }

    public final void setMediaView(b bVar) {
        super.b(g.j, bVar);
    }

    public final void setPriceView(View view) {
        super.b(g.g, view);
    }

    public final void setStarRatingView(View view) {
        super.b(g.i, view);
    }

    public final void setStoreView(View view) {
        super.b(g.f, view);
    }
}

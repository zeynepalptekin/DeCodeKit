package com.google.android.gms.ads.d0;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import com.google.android.gms.internal.ads.tr;

@Deprecated
/* loaded from: classes.dex */
public final class j extends e {
    public j(Context context) {
        super(context);
    }

    public j(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public j(Context context, AttributeSet attributeSet, int r3) {
        super(context, attributeSet, r3);
    }

    public j(Context context, AttributeSet attributeSet, int r3, int r4) {
        super(context, attributeSet, r3, r4);
    }

    public final View getAdvertiserView() {
        return super.c(i.e);
    }

    public final View getBodyView() {
        return super.c(i.f2370c);
    }

    public final View getCallToActionView() {
        return super.c(i.d);
    }

    public final View getHeadlineView() {
        return super.c(i.f2369b);
    }

    public final View getImageView() {
        return super.c(i.f);
    }

    public final View getLogoView() {
        return super.c(i.g);
    }

    public final b getMediaView() {
        View viewC = super.c(i.i);
        if (viewC instanceof b) {
            return (b) viewC;
        }
        if (viewC == null) {
            return null;
        }
        tr.f("View is not an instance of MediaView");
        return null;
    }

    public final void setAdvertiserView(View view) {
        super.b(i.e, view);
    }

    public final void setBodyView(View view) {
        super.b(i.f2370c, view);
    }

    public final void setCallToActionView(View view) {
        super.b(i.d, view);
    }

    public final void setHeadlineView(View view) {
        super.b(i.f2369b, view);
    }

    public final void setImageView(View view) {
        super.b(i.f, view);
    }

    public final void setLogoView(View view) {
        super.b(i.g, view);
    }

    public final void setMediaView(b bVar) {
        super.b(i.i, bVar);
    }
}

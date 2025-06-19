package com.google.android.gms.ads.h0;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import com.google.android.gms.common.internal.r;

/* loaded from: classes.dex */
public final class b extends FrameLayout {
    public b(Context context) {
        super(context);
        r.l(context, "Context cannot be null");
    }

    public b(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public b(Context context, AttributeSet attributeSet, int r3) {
        super(context, attributeSet, r3);
    }

    public final void setInstreamAd(a aVar) {
        if (aVar != null) {
            aVar.i(this);
        }
    }
}

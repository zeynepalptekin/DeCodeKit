package com.google.android.gms.ads.internal.overlay;

import android.content.Context;
import android.view.MotionEvent;
import android.widget.RelativeLayout;
import com.google.android.gms.common.util.d0;
import com.google.android.gms.internal.ads.pp;

@d0
/* loaded from: classes.dex */
final class h extends RelativeLayout {

    @d0
    private pp d;

    @d0
    boolean e;

    public h(Context context, String str, String str2) {
        super(context);
        pp ppVar = new pp(context, str);
        this.d = ppVar;
        ppVar.g(str2);
    }

    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (this.e) {
            return false;
        }
        this.d.h(motionEvent);
        return false;
    }
}

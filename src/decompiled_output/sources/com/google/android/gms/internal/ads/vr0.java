package com.google.android.gms.internal.ads;

import android.content.Context;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import java.util.ArrayList;

/* loaded from: classes.dex */
public final class vr0 extends FrameLayout {
    private final pp d;

    public vr0(Context context, @androidx.annotation.h0 View view, @androidx.annotation.h0 pp ppVar) {
        super(context);
        setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
        addView(view);
        this.d = ppVar;
    }

    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        this.d.h(motionEvent);
        return false;
    }

    @Override // android.view.ViewGroup
    public final void removeAllViews() {
        ArrayList arrayList = new ArrayList();
        int r1 = 0;
        for (int r2 = 0; r2 < getChildCount(); r2++) {
            KeyEvent.Callback childAt = getChildAt(r2);
            if (childAt != null && (childAt instanceof rw)) {
                arrayList.add((rw) childAt);
            }
        }
        super.removeAllViews();
        int size = arrayList.size();
        while (r1 < size) {
            Object obj = arrayList.get(r1);
            r1++;
            ((rw) obj).destroy();
        }
    }
}

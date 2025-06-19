package com.google.android.gms.internal.ads;

import android.view.MotionEvent;

/* loaded from: classes.dex */
public final class f1 {

    /* renamed from: a, reason: collision with root package name */
    private MotionEvent f3352a = MotionEvent.obtain(0, 0, 1, 0.0f, 0.0f, 0);

    /* renamed from: b, reason: collision with root package name */
    private MotionEvent f3353b = MotionEvent.obtain(0, 0, 0, 0.0f, 0.0f, 0);

    public final void a(MotionEvent motionEvent) {
        if (motionEvent.getAction() == 1 && motionEvent.getEventTime() > this.f3352a.getEventTime()) {
            this.f3352a = MotionEvent.obtain(motionEvent);
        } else {
            if (motionEvent.getAction() != 0 || motionEvent.getEventTime() <= this.f3353b.getEventTime()) {
                return;
            }
            this.f3353b = MotionEvent.obtain(motionEvent);
        }
    }

    public final MotionEvent b() {
        return this.f3352a;
    }

    public final MotionEvent c() {
        return this.f3353b;
    }
}

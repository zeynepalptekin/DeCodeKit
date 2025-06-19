package com.google.android.gms.internal.ads;

import android.view.MotionEvent;
import android.view.ViewGroup;
import org.json.JSONObject;

/* loaded from: classes.dex */
final class lm0 implements x2 {

    /* renamed from: a, reason: collision with root package name */
    private final /* synthetic */ jn0 f4271a;

    /* renamed from: b, reason: collision with root package name */
    private final /* synthetic */ ViewGroup f4272b;

    /* renamed from: c, reason: collision with root package name */
    private final /* synthetic */ km0 f4273c;

    lm0(km0 km0Var, jn0 jn0Var, ViewGroup viewGroup) {
        this.f4273c = km0Var;
        this.f4271a = jn0Var;
        this.f4272b = viewGroup;
    }

    @Override // com.google.android.gms.internal.ads.x2
    public final JSONObject L0() {
        return this.f4271a.L0();
    }

    @Override // com.google.android.gms.internal.ads.x2
    public final void M0(MotionEvent motionEvent) {
        this.f4271a.onTouch(null, motionEvent);
    }

    @Override // com.google.android.gms.internal.ads.x2
    public final void N0() {
        km0 km0Var = this.f4273c;
        if (km0.e(this.f4271a, im0.r)) {
            this.f4271a.onClick(this.f4272b);
        }
    }
}

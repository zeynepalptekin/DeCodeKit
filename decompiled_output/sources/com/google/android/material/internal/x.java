package com.google.android.material.internal;

import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewOverlay;
import androidx.annotation.h0;
import androidx.annotation.m0;

@m0(18)
/* loaded from: classes.dex */
class x implements y {

    /* renamed from: a, reason: collision with root package name */
    private final ViewOverlay f6759a;

    x(@h0 View view) {
        this.f6759a = view.getOverlay();
    }

    @Override // com.google.android.material.internal.y
    public void b(@h0 Drawable drawable) {
        this.f6759a.add(drawable);
    }

    @Override // com.google.android.material.internal.y
    public void d(@h0 Drawable drawable) {
        this.f6759a.remove(drawable);
    }
}

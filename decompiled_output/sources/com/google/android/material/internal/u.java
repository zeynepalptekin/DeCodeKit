package com.google.android.material.internal;

import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewGroupOverlay;
import androidx.annotation.h0;
import androidx.annotation.m0;

@m0(18)
/* loaded from: classes.dex */
class u implements v {

    /* renamed from: a, reason: collision with root package name */
    private final ViewGroupOverlay f6757a;

    u(@h0 ViewGroup viewGroup) {
        this.f6757a = viewGroup.getOverlay();
    }

    @Override // com.google.android.material.internal.v
    public void a(@h0 View view) {
        this.f6757a.add(view);
    }

    @Override // com.google.android.material.internal.y
    public void b(@h0 Drawable drawable) {
        this.f6757a.add(drawable);
    }

    @Override // com.google.android.material.internal.v
    public void c(@h0 View view) {
        this.f6757a.remove(view);
    }

    @Override // com.google.android.material.internal.y
    public void d(@h0 Drawable drawable) {
        this.f6757a.remove(drawable);
    }
}

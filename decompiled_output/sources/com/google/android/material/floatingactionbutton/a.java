package com.google.android.material.floatingactionbutton;

import android.animation.Animator;
import androidx.annotation.i0;

/* loaded from: classes.dex */
class a {

    /* renamed from: a, reason: collision with root package name */
    @i0
    private Animator f6701a;

    a() {
    }

    public void a() {
        Animator animator = this.f6701a;
        if (animator != null) {
            animator.cancel();
        }
    }

    public void b() {
        this.f6701a = null;
    }

    public void c(Animator animator) {
        a();
        this.f6701a = animator;
    }
}

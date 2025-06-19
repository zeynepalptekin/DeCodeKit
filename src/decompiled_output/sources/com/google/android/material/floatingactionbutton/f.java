package com.google.android.material.floatingactionbutton;

import android.animation.Animator;
import android.animation.AnimatorSet;
import androidx.annotation.h0;
import androidx.annotation.i0;
import c.a.b.c.b.h;
import com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton;
import java.util.List;

/* loaded from: classes.dex */
interface f {
    void a(@h0 Animator.AnimatorListener animatorListener);

    void b();

    void c();

    h d();

    void e(@i0 h hVar);

    @androidx.annotation.b
    int f();

    void g();

    @i0
    h h();

    AnimatorSet i();

    List<Animator.AnimatorListener> j();

    void k(@i0 ExtendedFloatingActionButton.h hVar);

    boolean l();

    void m(@h0 Animator.AnimatorListener animatorListener);

    void onAnimationStart(Animator animator);
}

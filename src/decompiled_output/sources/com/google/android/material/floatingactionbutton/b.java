package com.google.android.material.floatingactionbutton;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.content.Context;
import android.view.View;
import androidx.annotation.h0;
import androidx.annotation.i;
import androidx.annotation.i0;
import c.a.b.c.b.h;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
abstract class b implements f {

    /* renamed from: a, reason: collision with root package name */
    private final Context f6702a;

    /* renamed from: b, reason: collision with root package name */
    @h0
    private final ExtendedFloatingActionButton f6703b;

    /* renamed from: c, reason: collision with root package name */
    private final ArrayList<Animator.AnimatorListener> f6704c = new ArrayList<>();
    private final a d;

    @i0
    private h e;

    @i0
    private h f;

    b(@h0 ExtendedFloatingActionButton extendedFloatingActionButton, a aVar) {
        this.f6703b = extendedFloatingActionButton;
        this.f6702a = extendedFloatingActionButton.getContext();
        this.d = aVar;
    }

    @Override // com.google.android.material.floatingactionbutton.f
    public final void a(@h0 Animator.AnimatorListener animatorListener) {
        this.f6704c.add(animatorListener);
    }

    @Override // com.google.android.material.floatingactionbutton.f
    @i
    public void b() {
        this.d.b();
    }

    @Override // com.google.android.material.floatingactionbutton.f
    @i
    public void c() {
        this.d.b();
    }

    @Override // com.google.android.material.floatingactionbutton.f
    public final h d() {
        h hVar = this.f;
        if (hVar != null) {
            return hVar;
        }
        if (this.e == null) {
            this.e = h.d(this.f6702a, f());
        }
        return (h) b.i.o.i.f(this.e);
    }

    @Override // com.google.android.material.floatingactionbutton.f
    public final void e(@i0 h hVar) {
        this.f = hVar;
    }

    @Override // com.google.android.material.floatingactionbutton.f
    @i0
    public h h() {
        return this.f;
    }

    @Override // com.google.android.material.floatingactionbutton.f
    public AnimatorSet i() {
        return n(d());
    }

    @Override // com.google.android.material.floatingactionbutton.f
    @h0
    public final List<Animator.AnimatorListener> j() {
        return this.f6704c;
    }

    @Override // com.google.android.material.floatingactionbutton.f
    public final void m(@h0 Animator.AnimatorListener animatorListener) {
        this.f6704c.remove(animatorListener);
    }

    @h0
    AnimatorSet n(@h0 h hVar) {
        ArrayList arrayList = new ArrayList();
        if (hVar.j("opacity")) {
            arrayList.add(hVar.f("opacity", this.f6703b, View.ALPHA));
        }
        if (hVar.j("scale")) {
            arrayList.add(hVar.f("scale", this.f6703b, View.SCALE_Y));
            arrayList.add(hVar.f("scale", this.f6703b, View.SCALE_X));
        }
        if (hVar.j("width")) {
            arrayList.add(hVar.f("width", this.f6703b, ExtendedFloatingActionButton.L));
        }
        if (hVar.j("height")) {
            arrayList.add(hVar.f("height", this.f6703b, ExtendedFloatingActionButton.M));
        }
        AnimatorSet animatorSet = new AnimatorSet();
        c.a.b.c.b.b.a(animatorSet, arrayList);
        return animatorSet;
    }

    @Override // com.google.android.material.floatingactionbutton.f
    @i
    public void onAnimationStart(Animator animator) {
        this.d.c(animator);
    }
}

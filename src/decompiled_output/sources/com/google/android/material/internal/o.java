package com.google.android.material.internal;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.util.StateSet;
import androidx.annotation.h0;
import androidx.annotation.i0;
import androidx.annotation.p0;
import java.util.ArrayList;

@p0({p0.a.LIBRARY_GROUP})
/* loaded from: classes.dex */
public final class o {

    /* renamed from: a, reason: collision with root package name */
    private final ArrayList<b> f6739a = new ArrayList<>();

    /* renamed from: b, reason: collision with root package name */
    @i0
    private b f6740b = null;

    /* renamed from: c, reason: collision with root package name */
    @i0
    ValueAnimator f6741c = null;
    private final Animator.AnimatorListener d = new a();

    class a extends AnimatorListenerAdapter {
        a() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            o oVar = o.this;
            if (oVar.f6741c == animator) {
                oVar.f6741c = null;
            }
        }
    }

    static class b {

        /* renamed from: a, reason: collision with root package name */
        final int[] f6743a;

        /* renamed from: b, reason: collision with root package name */
        final ValueAnimator f6744b;

        b(int[] r1, ValueAnimator valueAnimator) {
            this.f6743a = r1;
            this.f6744b = valueAnimator;
        }
    }

    private void b() {
        ValueAnimator valueAnimator = this.f6741c;
        if (valueAnimator != null) {
            valueAnimator.cancel();
            this.f6741c = null;
        }
    }

    private void e(@h0 b bVar) {
        ValueAnimator valueAnimator = bVar.f6744b;
        this.f6741c = valueAnimator;
        valueAnimator.start();
    }

    public void a(int[] r2, ValueAnimator valueAnimator) {
        b bVar = new b(r2, valueAnimator);
        valueAnimator.addListener(this.d);
        this.f6739a.add(bVar);
    }

    public void c() {
        ValueAnimator valueAnimator = this.f6741c;
        if (valueAnimator != null) {
            valueAnimator.end();
            this.f6741c = null;
        }
    }

    public void d(int[] r5) {
        b bVar;
        int size = this.f6739a.size();
        int r1 = 0;
        while (true) {
            if (r1 >= size) {
                bVar = null;
                break;
            }
            bVar = this.f6739a.get(r1);
            if (StateSet.stateSetMatches(bVar.f6743a, r5)) {
                break;
            } else {
                r1++;
            }
        }
        b bVar2 = this.f6740b;
        if (bVar == bVar2) {
            return;
        }
        if (bVar2 != null) {
            b();
        }
        this.f6740b = bVar;
        if (bVar != null) {
            e(bVar);
        }
    }
}

package c.a.b.c.z.w;

import android.animation.Animator;
import android.animation.ObjectAnimator;
import android.animation.PropertyValuesHolder;
import android.util.Property;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.h0;
import androidx.annotation.i0;
import androidx.annotation.m0;

@m0(21)
/* loaded from: classes.dex */
public final class s implements w {

    /* renamed from: a, reason: collision with root package name */
    private float f2156a;

    /* renamed from: b, reason: collision with root package name */
    private float f2157b;

    /* renamed from: c, reason: collision with root package name */
    private float f2158c;
    private float d;
    private boolean e;
    private boolean f;

    public s() {
        this(true);
    }

    public s(boolean z) {
        this.f2156a = 1.0f;
        this.f2157b = 1.1f;
        this.f2158c = 0.8f;
        this.d = 1.0f;
        this.f = true;
        this.e = z;
    }

    private static Animator c(View view, float f, float f2) {
        return ObjectAnimator.ofPropertyValuesHolder(view, PropertyValuesHolder.ofFloat((Property<?, Float>) View.SCALE_X, f, f2), PropertyValuesHolder.ofFloat((Property<?, Float>) View.SCALE_Y, f, f2));
    }

    @Override // c.a.b.c.z.w.w
    @i0
    public Animator a(@h0 ViewGroup viewGroup, @h0 View view) {
        float f;
        float f2;
        if (this.e) {
            f = this.f2158c;
            f2 = this.d;
        } else {
            f = this.f2157b;
            f2 = this.f2156a;
        }
        return c(view, f, f2);
    }

    @Override // c.a.b.c.z.w.w
    @i0
    public Animator b(@h0 ViewGroup viewGroup, @h0 View view) {
        float f;
        float f2;
        if (!this.f) {
            return null;
        }
        if (this.e) {
            f = this.f2156a;
            f2 = this.f2157b;
        } else {
            f = this.d;
            f2 = this.f2158c;
        }
        return c(view, f, f2);
    }

    public float d() {
        return this.d;
    }

    public float e() {
        return this.f2158c;
    }

    public float f() {
        return this.f2157b;
    }

    public float g() {
        return this.f2156a;
    }

    public boolean h() {
        return this.e;
    }

    public boolean i() {
        return this.f;
    }

    public void j(boolean z) {
        this.e = z;
    }

    public void k(float f) {
        this.d = f;
    }

    public void l(float f) {
        this.f2158c = f;
    }

    public void m(float f) {
        this.f2157b = f;
    }

    public void n(float f) {
        this.f2156a = f;
    }

    public void o(boolean z) {
        this.f = z;
    }
}

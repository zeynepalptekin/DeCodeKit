package c.a.b.c.z;

import android.animation.Animator;
import android.animation.ObjectAnimator;
import android.animation.PropertyValuesHolder;
import android.util.Property;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.h0;
import androidx.annotation.i0;

/* loaded from: classes.dex */
public final class r implements v {

    /* renamed from: a, reason: collision with root package name */
    private float f2099a;

    /* renamed from: b, reason: collision with root package name */
    private float f2100b;

    /* renamed from: c, reason: collision with root package name */
    private float f2101c;
    private float d;
    private boolean e;
    private boolean f;

    public r() {
        this(true);
    }

    public r(boolean z) {
        this.f2099a = 1.0f;
        this.f2100b = 1.1f;
        this.f2101c = 0.8f;
        this.d = 1.0f;
        this.f = true;
        this.e = z;
    }

    private static Animator c(View view, float f, float f2) {
        return ObjectAnimator.ofPropertyValuesHolder(view, PropertyValuesHolder.ofFloat((Property<?, Float>) View.SCALE_X, f, f2), PropertyValuesHolder.ofFloat((Property<?, Float>) View.SCALE_Y, f, f2));
    }

    @Override // c.a.b.c.z.v
    @i0
    public Animator a(@h0 ViewGroup viewGroup, @h0 View view) {
        float f;
        float f2;
        if (this.e) {
            f = this.f2101c;
            f2 = this.d;
        } else {
            f = this.f2100b;
            f2 = this.f2099a;
        }
        return c(view, f, f2);
    }

    @Override // c.a.b.c.z.v
    @i0
    public Animator b(@h0 ViewGroup viewGroup, @h0 View view) {
        float f;
        float f2;
        if (!this.f) {
            return null;
        }
        if (this.e) {
            f = this.f2099a;
            f2 = this.f2100b;
        } else {
            f = this.d;
            f2 = this.f2101c;
        }
        return c(view, f, f2);
    }

    public float d() {
        return this.d;
    }

    public float e() {
        return this.f2101c;
    }

    public float f() {
        return this.f2100b;
    }

    public float g() {
        return this.f2099a;
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
        this.f2101c = f;
    }

    public void m(float f) {
        this.f2100b = f;
    }

    public void n(float f) {
        this.f2099a = f;
    }

    public void o(boolean z) {
        this.f = z;
    }
}

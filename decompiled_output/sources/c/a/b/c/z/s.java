package c.a.b.c.z;

import android.animation.Animator;
import android.animation.ObjectAnimator;
import android.animation.PropertyValuesHolder;
import android.content.Context;
import android.util.Property;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.h0;
import androidx.annotation.i0;
import androidx.annotation.k0;
import androidx.annotation.p0;
import b.i.p.f0;
import c.a.b.c.a;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/* loaded from: classes.dex */
public final class s implements v {

    /* renamed from: c, reason: collision with root package name */
    private static final int f2102c = -1;

    /* renamed from: a, reason: collision with root package name */
    private int f2103a;

    /* renamed from: b, reason: collision with root package name */
    @k0
    private int f2104b = -1;

    @Retention(RetentionPolicy.SOURCE)
    @p0({p0.a.LIBRARY_GROUP})
    public @interface a {
    }

    public s(int r2) {
        this.f2103a = r2;
    }

    private static Animator c(View view, View view2, int r4, @k0 int r5) {
        if (r4 == 3) {
            return e(view2, r5, 0.0f);
        }
        if (r4 == 5) {
            return e(view2, -r5, 0.0f);
        }
        if (r4 == 48) {
            return f(view2, -r5, 0.0f);
        }
        if (r4 == 80) {
            return f(view2, r5, 0.0f);
        }
        if (r4 == 8388611) {
            return e(view2, j(view) ? r5 : -r5, 0.0f);
        }
        if (r4 == 8388613) {
            return e(view2, j(view) ? -r5 : r5, 0.0f);
        }
        throw new IllegalArgumentException("Invalid slide direction: " + r4);
    }

    private static Animator d(View view, View view2, int r4, @k0 int r5) {
        if (r4 == 3) {
            return e(view2, 0.0f, -r5);
        }
        if (r4 == 5) {
            return e(view2, 0.0f, r5);
        }
        if (r4 == 48) {
            return f(view2, 0.0f, r5);
        }
        if (r4 == 80) {
            return f(view2, 0.0f, -r5);
        }
        if (r4 == 8388611) {
            return e(view2, 0.0f, j(view) ? -r5 : r5);
        }
        if (r4 == 8388613) {
            return e(view2, 0.0f, j(view) ? r5 : -r5);
        }
        throw new IllegalArgumentException("Invalid slide direction: " + r4);
    }

    private static Animator e(View view, float f, float f2) {
        return ObjectAnimator.ofPropertyValuesHolder(view, PropertyValuesHolder.ofFloat((Property<?, Float>) View.TRANSLATION_X, f, f2));
    }

    private static Animator f(View view, float f, float f2) {
        return ObjectAnimator.ofPropertyValuesHolder(view, PropertyValuesHolder.ofFloat((Property<?, Float>) View.TRANSLATION_Y, f, f2));
    }

    private int h(Context context) {
        int r0 = this.f2104b;
        return r0 != -1 ? r0 : context.getResources().getDimensionPixelSize(a.f.mtrl_transition_shared_axis_slide_distance);
    }

    private static boolean j(View view) {
        return f0.W(view) == 1;
    }

    @Override // c.a.b.c.z.v
    @i0
    public Animator a(@h0 ViewGroup viewGroup, @h0 View view) {
        return c(viewGroup, view, this.f2103a, h(view.getContext()));
    }

    @Override // c.a.b.c.z.v
    @i0
    public Animator b(@h0 ViewGroup viewGroup, @h0 View view) {
        return d(viewGroup, view, this.f2103a, h(view.getContext()));
    }

    @k0
    public int g() {
        return this.f2104b;
    }

    public int i() {
        return this.f2103a;
    }

    public void k(@k0 int r2) {
        if (r2 < 0) {
            throw new IllegalArgumentException("Slide distance must be positive. If attempting to reverse the direction of the slide, use setSlideEdge(int) instead.");
        }
        this.f2104b = r2;
    }

    public void l(int r1) {
        this.f2103a = r1;
    }
}

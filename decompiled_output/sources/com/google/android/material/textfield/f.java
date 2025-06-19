package com.google.android.material.textfield;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Typeface;
import android.os.Build;
import android.text.TextUtils;
import android.util.Property;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.h0;
import androidx.annotation.i0;
import androidx.annotation.k;
import androidx.annotation.t0;
import androidx.appcompat.widget.a0;
import androidx.core.widget.m;
import b.i.p.f0;
import c.a.b.c.a;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
final class f {
    static final int A = 2;
    private static final int B = 0;
    private static final int C = 1;
    private static final int D = 2;
    private static final int w = 217;
    private static final int x = 167;
    static final int y = 0;
    static final int z = 1;

    /* renamed from: a, reason: collision with root package name */
    private final Context f6841a;

    /* renamed from: b, reason: collision with root package name */
    @h0
    private final TextInputLayout f6842b;

    /* renamed from: c, reason: collision with root package name */
    private LinearLayout f6843c;
    private int d;
    private FrameLayout e;
    private int f;

    @i0
    private Animator g;
    private final float h;
    private int i;
    private int j;

    @i0
    private CharSequence k;
    private boolean l;

    @i0
    private TextView m;

    @i0
    private CharSequence n;
    private int o;

    @i0
    private ColorStateList p;
    private CharSequence q;
    private boolean r;

    @i0
    private TextView s;
    private int t;

    @i0
    private ColorStateList u;
    private Typeface v;

    class a extends AnimatorListenerAdapter {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ int f6844a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ TextView f6845b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ int f6846c;
        final /* synthetic */ TextView d;

        a(int r2, TextView textView, int r4, TextView textView2) {
            this.f6844a = r2;
            this.f6845b = textView;
            this.f6846c = r4;
            this.d = textView2;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            f.this.i = this.f6844a;
            f.this.g = null;
            TextView textView = this.f6845b;
            if (textView != null) {
                textView.setVisibility(4);
                if (this.f6846c == 1 && f.this.m != null) {
                    f.this.m.setText((CharSequence) null);
                }
            }
            TextView textView2 = this.d;
            if (textView2 != null) {
                textView2.setTranslationY(0.0f);
                this.d.setAlpha(1.0f);
            }
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            TextView textView = this.d;
            if (textView != null) {
                textView.setVisibility(0);
            }
        }
    }

    public f(@h0 TextInputLayout textInputLayout) {
        this.f6841a = textInputLayout.getContext();
        this.f6842b = textInputLayout;
        this.h = r0.getResources().getDimensionPixelSize(a.f.design_textinput_caption_translate_y);
    }

    private void E(int r3, int r4) {
        TextView textViewM;
        TextView textViewM2;
        if (r3 == r4) {
            return;
        }
        if (r4 != 0 && (textViewM2 = m(r4)) != null) {
            textViewM2.setVisibility(0);
            textViewM2.setAlpha(1.0f);
        }
        if (r3 != 0 && (textViewM = m(r3)) != null) {
            textViewM.setVisibility(4);
            if (r3 == 1) {
                textViewM.setText((CharSequence) null);
            }
        }
        this.i = r4;
    }

    private void M(@i0 TextView textView, Typeface typeface) {
        if (textView != null) {
            textView.setTypeface(typeface);
        }
    }

    private void O(@h0 ViewGroup viewGroup, int r2) {
        if (r2 == 0) {
            viewGroup.setVisibility(8);
        }
    }

    private boolean P(@i0 TextView textView, @i0 CharSequence charSequence) {
        return f0.P0(this.f6842b) && this.f6842b.isEnabled() && !(this.j == this.i && textView != null && TextUtils.equals(textView.getText(), charSequence));
    }

    private void S(int r14, int r15, boolean z2) {
        if (r14 == r15) {
            return;
        }
        if (z2) {
            AnimatorSet animatorSet = new AnimatorSet();
            this.g = animatorSet;
            ArrayList arrayList = new ArrayList();
            h(arrayList, this.r, this.s, 2, r14, r15);
            h(arrayList, this.l, this.m, 1, r14, r15);
            c.a.b.c.b.b.a(animatorSet, arrayList);
            animatorSet.addListener(new a(r15, m(r14), r14, m(r15)));
            animatorSet.start();
        } else {
            E(r14, r15);
        }
        this.f6842b.A0();
        this.f6842b.E0(z2);
        this.f6842b.O0();
    }

    private boolean f() {
        return (this.f6843c == null || this.f6842b.getEditText() == null) ? false : true;
    }

    private void h(@h0 List<Animator> list, boolean z2, @i0 TextView textView, int r4, int r5, int r6) {
        if (textView == null || !z2) {
            return;
        }
        if (r4 == r6 || r4 == r5) {
            list.add(i(textView, r6 == r4));
            if (r6 == r4) {
                list.add(j(textView));
            }
        }
    }

    private ObjectAnimator i(TextView textView, boolean z2) {
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(textView, (Property<TextView, Float>) View.ALPHA, z2 ? 1.0f : 0.0f);
        objectAnimatorOfFloat.setDuration(167L);
        objectAnimatorOfFloat.setInterpolator(c.a.b.c.b.a.f1935a);
        return objectAnimatorOfFloat;
    }

    private ObjectAnimator j(TextView textView) {
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(textView, (Property<TextView, Float>) View.TRANSLATION_Y, -this.h, 0.0f);
        objectAnimatorOfFloat.setDuration(217L);
        objectAnimatorOfFloat.setInterpolator(c.a.b.c.b.a.d);
        return objectAnimatorOfFloat;
    }

    @i0
    private TextView m(int r2) {
        if (r2 == 1) {
            return this.m;
        }
        if (r2 != 2) {
            return null;
        }
        return this.s;
    }

    private boolean y(int r2) {
        return (r2 != 1 || this.m == null || TextUtils.isEmpty(this.k)) ? false : true;
    }

    private boolean z(int r2) {
        return (r2 != 2 || this.s == null || TextUtils.isEmpty(this.q)) ? false : true;
    }

    boolean A(int r2) {
        return r2 == 0 || r2 == 1;
    }

    boolean B() {
        return this.l;
    }

    boolean C() {
        return this.r;
    }

    void D(TextView textView, int r3) {
        FrameLayout frameLayout;
        if (this.f6843c == null) {
            return;
        }
        if (!A(r3) || (frameLayout = this.e) == null) {
            this.f6843c.removeView(textView);
        } else {
            int r0 = this.f - 1;
            this.f = r0;
            O(frameLayout, r0);
            this.e.removeView(textView);
        }
        int r2 = this.d - 1;
        this.d = r2;
        O(this.f6843c, r2);
    }

    void F(@i0 CharSequence charSequence) {
        this.n = charSequence;
        TextView textView = this.m;
        if (textView != null) {
            textView.setContentDescription(charSequence);
        }
    }

    void G(boolean z2) {
        if (this.l == z2) {
            return;
        }
        g();
        if (z2) {
            a0 a0Var = new a0(this.f6841a);
            this.m = a0Var;
            a0Var.setId(a.h.textinput_error);
            if (Build.VERSION.SDK_INT >= 17) {
                this.m.setTextAlignment(5);
            }
            Typeface typeface = this.v;
            if (typeface != null) {
                this.m.setTypeface(typeface);
            }
            H(this.o);
            I(this.p);
            F(this.n);
            this.m.setVisibility(4);
            f0.w1(this.m, 1);
            d(this.m, 0);
        } else {
            w();
            D(this.m, 0);
            this.m = null;
            this.f6842b.A0();
            this.f6842b.O0();
        }
        this.l = z2;
    }

    void H(@t0 int r3) {
        this.o = r3;
        TextView textView = this.m;
        if (textView != null) {
            this.f6842b.o0(textView, r3);
        }
    }

    void I(@i0 ColorStateList colorStateList) {
        this.p = colorStateList;
        TextView textView = this.m;
        if (textView == null || colorStateList == null) {
            return;
        }
        textView.setTextColor(colorStateList);
    }

    void J(@t0 int r2) {
        this.t = r2;
        TextView textView = this.s;
        if (textView != null) {
            m.E(textView, r2);
        }
    }

    void K(boolean z2) {
        if (this.r == z2) {
            return;
        }
        g();
        if (z2) {
            a0 a0Var = new a0(this.f6841a);
            this.s = a0Var;
            a0Var.setId(a.h.textinput_helper_text);
            if (Build.VERSION.SDK_INT >= 17) {
                this.s.setTextAlignment(5);
            }
            Typeface typeface = this.v;
            if (typeface != null) {
                this.s.setTypeface(typeface);
            }
            this.s.setVisibility(4);
            f0.w1(this.s, 1);
            J(this.t);
            L(this.u);
            d(this.s, 1);
        } else {
            x();
            D(this.s, 1);
            this.s = null;
            this.f6842b.A0();
            this.f6842b.O0();
        }
        this.r = z2;
    }

    void L(@i0 ColorStateList colorStateList) {
        this.u = colorStateList;
        TextView textView = this.s;
        if (textView == null || colorStateList == null) {
            return;
        }
        textView.setTextColor(colorStateList);
    }

    void N(Typeface typeface) {
        if (typeface != this.v) {
            this.v = typeface;
            M(this.m, typeface);
            M(this.s, typeface);
        }
    }

    void Q(CharSequence charSequence) {
        g();
        this.k = charSequence;
        this.m.setText(charSequence);
        if (this.i != 1) {
            this.j = 1;
        }
        S(this.i, this.j, P(this.m, charSequence));
    }

    void R(CharSequence charSequence) {
        g();
        this.q = charSequence;
        this.s.setText(charSequence);
        if (this.i != 2) {
            this.j = 2;
        }
        S(this.i, this.j, P(this.s, charSequence));
    }

    void d(TextView textView, int r7) {
        if (this.f6843c == null && this.e == null) {
            LinearLayout linearLayout = new LinearLayout(this.f6841a);
            this.f6843c = linearLayout;
            linearLayout.setOrientation(0);
            this.f6842b.addView(this.f6843c, -1, -2);
            this.e = new FrameLayout(this.f6841a);
            this.f6843c.addView(this.e, new LinearLayout.LayoutParams(0, -2, 1.0f));
            if (this.f6842b.getEditText() != null) {
                e();
            }
        }
        if (A(r7)) {
            this.e.setVisibility(0);
            this.e.addView(textView);
            this.f++;
        } else {
            this.f6843c.addView(textView, new LinearLayout.LayoutParams(-2, -2));
        }
        this.f6843c.setVisibility(0);
        this.d++;
    }

    void e() {
        if (f()) {
            f0.V1(this.f6843c, f0.h0(this.f6842b.getEditText()), 0, f0.g0(this.f6842b.getEditText()), 0);
        }
    }

    void g() {
        Animator animator = this.g;
        if (animator != null) {
            animator.cancel();
        }
    }

    boolean k() {
        return y(this.i);
    }

    boolean l() {
        return y(this.j);
    }

    @i0
    CharSequence n() {
        return this.n;
    }

    @i0
    CharSequence o() {
        return this.k;
    }

    @k
    int p() {
        TextView textView = this.m;
        if (textView != null) {
            return textView.getCurrentTextColor();
        }
        return -1;
    }

    @i0
    ColorStateList q() {
        TextView textView = this.m;
        if (textView != null) {
            return textView.getTextColors();
        }
        return null;
    }

    CharSequence r() {
        return this.q;
    }

    @i0
    ColorStateList s() {
        TextView textView = this.s;
        if (textView != null) {
            return textView.getTextColors();
        }
        return null;
    }

    @k
    int t() {
        TextView textView = this.s;
        if (textView != null) {
            return textView.getCurrentTextColor();
        }
        return -1;
    }

    boolean u() {
        return z(this.i);
    }

    boolean v() {
        return z(this.j);
    }

    void w() {
        this.k = null;
        g();
        if (this.i == 1) {
            this.j = (!this.r || TextUtils.isEmpty(this.q)) ? 0 : 2;
        }
        S(this.i, this.j, P(this.m, null));
    }

    void x() {
        g();
        if (this.i == 2) {
            this.j = 0;
        }
        S(this.i, this.j, P(this.s, null));
    }
}

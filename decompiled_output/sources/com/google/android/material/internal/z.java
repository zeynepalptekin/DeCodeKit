package com.google.android.material.internal;

import android.R;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.os.Build;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.inputmethod.InputMethodManager;
import androidx.annotation.h0;
import androidx.annotation.i0;
import androidx.annotation.p0;
import b.i.p.f0;
import b.i.p.o0;
import c.a.b.c.a;

@p0({p0.a.LIBRARY_GROUP})
/* loaded from: classes.dex */
public class z {

    static class a implements Runnable {
        final /* synthetic */ View d;

        a(View view) {
            this.d = view;
        }

        @Override // java.lang.Runnable
        public void run() {
            ((InputMethodManager) this.d.getContext().getSystemService("input_method")).showSoftInput(this.d, 1);
        }
    }

    static class b implements e {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ boolean f6760a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ boolean f6761b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ boolean f6762c;
        final /* synthetic */ e d;

        b(boolean z, boolean z2, boolean z3, e eVar) {
            this.f6760a = z;
            this.f6761b = z2;
            this.f6762c = z3;
            this.d = eVar;
        }

        @Override // com.google.android.material.internal.z.e
        @h0
        public o0 a(View view, @h0 o0 o0Var, @h0 f fVar) {
            if (this.f6760a) {
                fVar.d += o0Var.l();
            }
            boolean zI = z.i(view);
            if (this.f6761b) {
                if (zI) {
                    fVar.f6767c += o0Var.m();
                } else {
                    fVar.f6765a += o0Var.m();
                }
            }
            if (this.f6762c) {
                if (zI) {
                    fVar.f6765a += o0Var.n();
                } else {
                    fVar.f6767c += o0Var.n();
                }
            }
            fVar.a(view);
            e eVar = this.d;
            return eVar != null ? eVar.a(view, o0Var, fVar) : o0Var;
        }
    }

    static class c implements b.i.p.y {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ e f6763a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ f f6764b;

        c(e eVar, f fVar) {
            this.f6763a = eVar;
            this.f6764b = fVar;
        }

        @Override // b.i.p.y
        public o0 a(View view, o0 o0Var) {
            return this.f6763a.a(view, o0Var, new f(this.f6764b));
        }
    }

    static class d implements View.OnAttachStateChangeListener {
        d() {
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewAttachedToWindow(@h0 View view) {
            view.removeOnAttachStateChangeListener(this);
            f0.o1(view);
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewDetachedFromWindow(View view) {
        }
    }

    public interface e {
        o0 a(View view, o0 o0Var, f fVar);
    }

    public static class f {

        /* renamed from: a, reason: collision with root package name */
        public int f6765a;

        /* renamed from: b, reason: collision with root package name */
        public int f6766b;

        /* renamed from: c, reason: collision with root package name */
        public int f6767c;
        public int d;

        public f(int r1, int r2, int r3, int r4) {
            this.f6765a = r1;
            this.f6766b = r2;
            this.f6767c = r3;
            this.d = r4;
        }

        public f(@h0 f fVar) {
            this.f6765a = fVar.f6765a;
            this.f6766b = fVar.f6766b;
            this.f6767c = fVar.f6767c;
            this.d = fVar.d;
        }

        public void a(View view) {
            f0.V1(view, this.f6765a, this.f6766b, this.f6767c, this.d);
        }
    }

    private z() {
    }

    public static void a(@h0 View view, @i0 AttributeSet attributeSet, int r3, int r4) {
        b(view, attributeSet, r3, r4, null);
    }

    public static void b(@h0 View view, @i0 AttributeSet attributeSet, int r4, int r5, @i0 e eVar) {
        TypedArray typedArrayObtainStyledAttributes = view.getContext().obtainStyledAttributes(attributeSet, a.o.Insets, r4, r5);
        boolean z = typedArrayObtainStyledAttributes.getBoolean(a.o.Insets_paddingBottomSystemWindowInsets, false);
        boolean z2 = typedArrayObtainStyledAttributes.getBoolean(a.o.Insets_paddingLeftSystemWindowInsets, false);
        boolean z3 = typedArrayObtainStyledAttributes.getBoolean(a.o.Insets_paddingRightSystemWindowInsets, false);
        typedArrayObtainStyledAttributes.recycle();
        c(view, new b(z, z2, z3, eVar));
    }

    public static void c(@h0 View view, @h0 e eVar) {
        f0.T1(view, new c(eVar, new f(f0.h0(view), view.getPaddingTop(), f0.g0(view), view.getPaddingBottom())));
        k(view);
    }

    public static float d(@h0 Context context, @androidx.annotation.p(unit = 0) int r2) {
        return TypedValue.applyDimension(1, r2, context.getResources().getDisplayMetrics());
    }

    @i0
    public static ViewGroup e(@i0 View view) {
        if (view == null) {
            return null;
        }
        View rootView = view.getRootView();
        ViewGroup viewGroup = (ViewGroup) rootView.findViewById(R.id.content);
        if (viewGroup != null) {
            return viewGroup;
        }
        if (rootView == view || !(rootView instanceof ViewGroup)) {
            return null;
        }
        return (ViewGroup) rootView;
    }

    @i0
    public static y f(@h0 View view) {
        return g(e(view));
    }

    @i0
    public static y g(@i0 View view) {
        if (view == null) {
            return null;
        }
        return Build.VERSION.SDK_INT >= 18 ? new x(view) : w.e(view);
    }

    public static float h(@h0 View view) {
        float fP = 0.0f;
        for (ViewParent parent = view.getParent(); parent instanceof View; parent = parent.getParent()) {
            fP += f0.P((View) parent);
        }
        return fP;
    }

    public static boolean i(View view) {
        return f0.W(view) == 1;
    }

    public static PorterDuff.Mode j(int r1, PorterDuff.Mode mode) {
        if (r1 == 3) {
            return PorterDuff.Mode.SRC_OVER;
        }
        if (r1 == 5) {
            return PorterDuff.Mode.SRC_IN;
        }
        if (r1 == 9) {
            return PorterDuff.Mode.SRC_ATOP;
        }
        switch (r1) {
            case 14:
                return PorterDuff.Mode.MULTIPLY;
            case 15:
                return PorterDuff.Mode.SCREEN;
            case 16:
                return PorterDuff.Mode.ADD;
            default:
                return mode;
        }
    }

    public static void k(@h0 View view) {
        if (f0.J0(view)) {
            f0.o1(view);
        } else {
            view.addOnAttachStateChangeListener(new d());
        }
    }

    public static void l(@h0 View view) {
        view.requestFocus();
        view.post(new a(view));
    }
}

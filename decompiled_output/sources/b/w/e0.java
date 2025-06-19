package b.w;

import android.animation.Animator;
import android.animation.TimeInterpolator;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.DecelerateInterpolator;
import androidx.annotation.p0;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import org.xmlpull.v1.XmlPullParser;

/* loaded from: classes.dex */
public class e0 extends f1 {
    private static final String k0 = "android:slide:screenPosition";
    private g g0;
    private int h0;
    private static final TimeInterpolator i0 = new DecelerateInterpolator();
    private static final TimeInterpolator j0 = new AccelerateInterpolator();
    private static final g l0 = new a();
    private static final g m0 = new b();
    private static final g n0 = new c();
    private static final g o0 = new d();
    private static final g p0 = new e();
    private static final g q0 = new f();

    static class a extends h {
        a() {
            super(null);
        }

        @Override // b.w.e0.g
        public float b(ViewGroup viewGroup, View view) {
            return view.getTranslationX() - viewGroup.getWidth();
        }
    }

    static class b extends h {
        b() {
            super(null);
        }

        @Override // b.w.e0.g
        public float b(ViewGroup viewGroup, View view) {
            boolean z = b.i.p.f0.W(viewGroup) == 1;
            float translationX = view.getTranslationX();
            float width = viewGroup.getWidth();
            return z ? translationX + width : translationX - width;
        }
    }

    static class c extends i {
        c() {
            super(null);
        }

        @Override // b.w.e0.g
        public float a(ViewGroup viewGroup, View view) {
            return view.getTranslationY() - viewGroup.getHeight();
        }
    }

    static class d extends h {
        d() {
            super(null);
        }

        @Override // b.w.e0.g
        public float b(ViewGroup viewGroup, View view) {
            return view.getTranslationX() + viewGroup.getWidth();
        }
    }

    static class e extends h {
        e() {
            super(null);
        }

        @Override // b.w.e0.g
        public float b(ViewGroup viewGroup, View view) {
            boolean z = b.i.p.f0.W(viewGroup) == 1;
            float translationX = view.getTranslationX();
            float width = viewGroup.getWidth();
            return z ? translationX - width : translationX + width;
        }
    }

    static class f extends i {
        f() {
            super(null);
        }

        @Override // b.w.e0.g
        public float a(ViewGroup viewGroup, View view) {
            return view.getTranslationY() + viewGroup.getHeight();
        }
    }

    private interface g {
        float a(ViewGroup viewGroup, View view);

        float b(ViewGroup viewGroup, View view);
    }

    private static abstract class h implements g {
        private h() {
        }

        /* synthetic */ h(a aVar) {
            this();
        }

        @Override // b.w.e0.g
        public float a(ViewGroup viewGroup, View view) {
            return view.getTranslationY();
        }
    }

    private static abstract class i implements g {
        private i() {
        }

        /* synthetic */ i(a aVar) {
            this();
        }

        @Override // b.w.e0.g
        public float b(ViewGroup viewGroup, View view) {
            return view.getTranslationX();
        }
    }

    @Retention(RetentionPolicy.SOURCE)
    @androidx.annotation.p0({p0.a.LIBRARY_GROUP_PREFIX})
    public @interface j {
    }

    public e0() {
        this.g0 = q0;
        this.h0 = 80;
        V0(80);
    }

    public e0(int r2) {
        this.g0 = q0;
        this.h0 = 80;
        V0(r2);
    }

    @SuppressLint({"RestrictedApi"})
    public e0(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.g0 = q0;
        this.h0 = 80;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, f0.h);
        int r5 = b.i.c.j.h.k(typedArrayObtainStyledAttributes, (XmlPullParser) attributeSet, "slideEdge", 0, 80);
        typedArrayObtainStyledAttributes.recycle();
        V0(r5);
    }

    private void L0(n0 n0Var) {
        int[] r1 = new int[2];
        n0Var.f1494b.getLocationOnScreen(r1);
        n0Var.f1493a.put(k0, r1);
    }

    @Override // b.w.f1
    public Animator P0(ViewGroup viewGroup, View view, n0 n0Var, n0 n0Var2) {
        if (n0Var2 == null) {
            return null;
        }
        int[] r13 = (int[]) n0Var2.f1493a.get(k0);
        float translationX = view.getTranslationX();
        float translationY = view.getTranslationY();
        return p0.a(view, n0Var2, r13[0], r13[1], this.g0.b(viewGroup, view), this.g0.a(viewGroup, view), translationX, translationY, i0, this);
    }

    @Override // b.w.f1
    public Animator R0(ViewGroup viewGroup, View view, n0 n0Var, n0 n0Var2) {
        if (n0Var == null) {
            return null;
        }
        int[] r14 = (int[]) n0Var.f1493a.get(k0);
        return p0.a(view, n0Var, r14[0], r14[1], view.getTranslationX(), view.getTranslationY(), this.g0.b(viewGroup, view), this.g0.a(viewGroup, view), j0, this);
    }

    public int U0() {
        return this.h0;
    }

    public void V0(int r2) {
        g gVar;
        if (r2 == 3) {
            gVar = l0;
        } else if (r2 == 5) {
            gVar = o0;
        } else if (r2 == 48) {
            gVar = n0;
        } else if (r2 == 80) {
            gVar = q0;
        } else if (r2 == 8388611) {
            gVar = m0;
        } else {
            if (r2 != 8388613) {
                throw new IllegalArgumentException("Invalid slide direction");
            }
            gVar = p0;
        }
        this.g0 = gVar;
        this.h0 = r2;
        d0 d0Var = new d0();
        d0Var.k(r2);
        G0(d0Var);
    }

    @Override // b.w.f1, b.w.g0
    public void n(@androidx.annotation.h0 n0 n0Var) {
        super.n(n0Var);
        L0(n0Var);
    }

    @Override // b.w.f1, b.w.g0
    public void q(@androidx.annotation.h0 n0 n0Var) {
        super.q(n0Var);
        L0(n0Var);
    }
}

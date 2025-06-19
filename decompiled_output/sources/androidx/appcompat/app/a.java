package androidx.appcompat.app;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.SpinnerAdapter;
import androidx.annotation.h0;
import androidx.annotation.i0;
import androidx.annotation.p0;
import androidx.annotation.s0;
import androidx.fragment.app.r;
import b.a.a;
import b.a.f.b;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/* loaded from: classes.dex */
public abstract class a {

    /* renamed from: a, reason: collision with root package name */
    @Deprecated
    public static final int f33a = 0;

    /* renamed from: b, reason: collision with root package name */
    @Deprecated
    public static final int f34b = 1;

    /* renamed from: c, reason: collision with root package name */
    @Deprecated
    public static final int f35c = 2;
    public static final int d = 1;
    public static final int e = 2;
    public static final int f = 4;
    public static final int g = 8;
    public static final int h = 16;

    @Retention(RetentionPolicy.SOURCE)
    @p0({p0.a.LIBRARY_GROUP_PREFIX})
    /* renamed from: androidx.appcompat.app.a$a, reason: collision with other inner class name */
    public @interface InterfaceC0011a {
    }

    public static class b extends ViewGroup.MarginLayoutParams {

        /* renamed from: a, reason: collision with root package name */
        public int f36a;

        public b(int r3) {
            this(-2, -1, r3);
        }

        public b(int r1, int r2) {
            super(r1, r2);
            this.f36a = 0;
            this.f36a = 8388627;
        }

        public b(int r1, int r2, int r3) {
            super(r1, r2);
            this.f36a = 0;
            this.f36a = r3;
        }

        public b(@h0 Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            this.f36a = 0;
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, a.m.ActionBarLayout);
            this.f36a = typedArrayObtainStyledAttributes.getInt(a.m.ActionBarLayout_android_layout_gravity, 0);
            typedArrayObtainStyledAttributes.recycle();
        }

        public b(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
            this.f36a = 0;
        }

        public b(b bVar) {
            super((ViewGroup.MarginLayoutParams) bVar);
            this.f36a = 0;
            this.f36a = bVar.f36a;
        }
    }

    @Retention(RetentionPolicy.SOURCE)
    @p0({p0.a.LIBRARY_GROUP_PREFIX})
    public @interface c {
    }

    public interface d {
        void a(boolean z);
    }

    @Deprecated
    public interface e {
        boolean a(int r1, long j);
    }

    @Deprecated
    public static abstract class f {

        /* renamed from: a, reason: collision with root package name */
        public static final int f37a = -1;

        public abstract CharSequence a();

        public abstract View b();

        public abstract Drawable c();

        public abstract int d();

        public abstract Object e();

        public abstract CharSequence f();

        public abstract void g();

        public abstract f h(@s0 int r1);

        public abstract f i(CharSequence charSequence);

        public abstract f j(int r1);

        public abstract f k(View view);

        public abstract f l(@androidx.annotation.q int r1);

        public abstract f m(Drawable drawable);

        public abstract f n(g gVar);

        public abstract f o(Object obj);

        public abstract f p(int r1);

        public abstract f q(CharSequence charSequence);
    }

    @Deprecated
    public interface g {
        void a(f fVar, r rVar);

        void b(f fVar, r rVar);

        void c(f fVar, r rVar);
    }

    @i0
    public abstract CharSequence A();

    @p0({p0.a.LIBRARY_GROUP_PREFIX})
    public void A0(CharSequence charSequence) {
    }

    public abstract void B();

    public abstract void B0();

    @p0({p0.a.LIBRARY_GROUP_PREFIX})
    public boolean C() {
        return false;
    }

    @p0({p0.a.LIBRARY_GROUP_PREFIX})
    public b.a.f.b C0(b.a aVar) {
        return null;
    }

    public boolean D() {
        return false;
    }

    public abstract boolean E();

    @p0({p0.a.LIBRARY_GROUP_PREFIX})
    public boolean F() {
        return false;
    }

    @Deprecated
    public abstract f G();

    @p0({p0.a.LIBRARY_GROUP_PREFIX})
    public void H(Configuration configuration) {
    }

    void I() {
    }

    @p0({p0.a.LIBRARY_GROUP_PREFIX})
    public boolean J(int r1, KeyEvent keyEvent) {
        return false;
    }

    @p0({p0.a.LIBRARY_GROUP_PREFIX})
    public boolean K(KeyEvent keyEvent) {
        return false;
    }

    @p0({p0.a.LIBRARY_GROUP_PREFIX})
    public boolean L() {
        return false;
    }

    @Deprecated
    public abstract void M();

    public abstract void N(d dVar);

    @Deprecated
    public abstract void O(f fVar);

    @Deprecated
    public abstract void P(int r1);

    @p0({p0.a.LIBRARY_GROUP_PREFIX})
    boolean Q() {
        return false;
    }

    @Deprecated
    public abstract void R(f fVar);

    public abstract void S(@i0 Drawable drawable);

    public abstract void T(int r1);

    public abstract void U(View view);

    public abstract void V(View view, b bVar);

    @p0({p0.a.LIBRARY_GROUP_PREFIX})
    public void W(boolean z) {
    }

    public abstract void X(boolean z);

    public abstract void Y(int r1);

    public abstract void Z(int r1, int r2);

    public abstract void a0(boolean z);

    public abstract void b0(boolean z);

    public abstract void c0(boolean z);

    public abstract void d0(boolean z);

    public void e0(float f2) {
        if (f2 != 0.0f) {
            throw new UnsupportedOperationException("Setting a non-zero elevation is not supported in this action bar configuration.");
        }
    }

    public abstract void f(d dVar);

    public void f0(int r2) {
        if (r2 != 0) {
            throw new UnsupportedOperationException("Setting an explicit action bar hide offset is not supported in this action bar configuration.");
        }
    }

    @Deprecated
    public abstract void g(f fVar);

    public void g0(boolean z) {
        if (z) {
            throw new UnsupportedOperationException("Hide on content scroll is not supported in this action bar configuration.");
        }
    }

    @Deprecated
    public abstract void h(f fVar, int r2);

    public void h0(@s0 int r1) {
    }

    @Deprecated
    public abstract void i(f fVar, int r2, boolean z);

    public void i0(@i0 CharSequence charSequence) {
    }

    @Deprecated
    public abstract void j(f fVar, boolean z);

    public void j0(@androidx.annotation.q int r1) {
    }

    @p0({p0.a.LIBRARY_GROUP_PREFIX})
    public boolean k() {
        return false;
    }

    public void k0(@i0 Drawable drawable) {
    }

    @p0({p0.a.LIBRARY_GROUP_PREFIX})
    public boolean l() {
        return false;
    }

    public void l0(boolean z) {
    }

    @p0({p0.a.LIBRARY_GROUP_PREFIX})
    public void m(boolean z) {
    }

    public abstract void m0(@androidx.annotation.q int r1);

    public abstract View n();

    public abstract void n0(Drawable drawable);

    public abstract int o();

    @Deprecated
    public abstract void o0(SpinnerAdapter spinnerAdapter, e eVar);

    public float p() {
        return 0.0f;
    }

    public abstract void p0(@androidx.annotation.q int r1);

    public abstract int q();

    public abstract void q0(Drawable drawable);

    public int r() {
        return 0;
    }

    @Deprecated
    public abstract void r0(int r1);

    @Deprecated
    public abstract int s();

    @Deprecated
    public abstract void s0(int r1);

    @Deprecated
    public abstract int t();

    @p0({p0.a.LIBRARY_GROUP_PREFIX})
    public void t0(boolean z) {
    }

    @Deprecated
    public abstract int u();

    public void u0(Drawable drawable) {
    }

    @i0
    @Deprecated
    public abstract f v();

    public void v0(Drawable drawable) {
    }

    @i0
    public abstract CharSequence w();

    public abstract void w0(int r1);

    @Deprecated
    public abstract f x(int r1);

    public abstract void x0(CharSequence charSequence);

    @Deprecated
    public abstract int y();

    public abstract void y0(@s0 int r1);

    public Context z() {
        return null;
    }

    public abstract void z0(CharSequence charSequence);
}

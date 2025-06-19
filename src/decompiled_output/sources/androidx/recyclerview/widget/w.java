package androidx.recyclerview.widget;

import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;

/* loaded from: classes.dex */
public abstract class w {
    private static final int d = Integer.MIN_VALUE;
    public static final int e = 0;
    public static final int f = 1;

    /* renamed from: a, reason: collision with root package name */
    protected final RecyclerView.o f743a;

    /* renamed from: b, reason: collision with root package name */
    private int f744b;

    /* renamed from: c, reason: collision with root package name */
    final Rect f745c;

    static class a extends w {
        a(RecyclerView.o oVar) {
            super(oVar, null);
        }

        @Override // androidx.recyclerview.widget.w
        public int d(View view) {
            return this.f743a.b0(view) + ((ViewGroup.MarginLayoutParams) ((RecyclerView.p) view.getLayoutParams())).rightMargin;
        }

        @Override // androidx.recyclerview.widget.w
        public int e(View view) {
            RecyclerView.p pVar = (RecyclerView.p) view.getLayoutParams();
            return this.f743a.a0(view) + ((ViewGroup.MarginLayoutParams) pVar).leftMargin + ((ViewGroup.MarginLayoutParams) pVar).rightMargin;
        }

        @Override // androidx.recyclerview.widget.w
        public int f(View view) {
            RecyclerView.p pVar = (RecyclerView.p) view.getLayoutParams();
            return this.f743a.Z(view) + ((ViewGroup.MarginLayoutParams) pVar).topMargin + ((ViewGroup.MarginLayoutParams) pVar).bottomMargin;
        }

        @Override // androidx.recyclerview.widget.w
        public int g(View view) {
            return this.f743a.Y(view) - ((ViewGroup.MarginLayoutParams) ((RecyclerView.p) view.getLayoutParams())).leftMargin;
        }

        @Override // androidx.recyclerview.widget.w
        public int h() {
            return this.f743a.z0();
        }

        @Override // androidx.recyclerview.widget.w
        public int i() {
            return this.f743a.z0() - this.f743a.p0();
        }

        @Override // androidx.recyclerview.widget.w
        public int j() {
            return this.f743a.p0();
        }

        @Override // androidx.recyclerview.widget.w
        public int l() {
            return this.f743a.A0();
        }

        @Override // androidx.recyclerview.widget.w
        public int m() {
            return this.f743a.f0();
        }

        @Override // androidx.recyclerview.widget.w
        public int n() {
            return this.f743a.o0();
        }

        @Override // androidx.recyclerview.widget.w
        public int o() {
            return (this.f743a.z0() - this.f743a.o0()) - this.f743a.p0();
        }

        @Override // androidx.recyclerview.widget.w
        public int q(View view) {
            this.f743a.y0(view, true, this.f745c);
            return this.f745c.right;
        }

        @Override // androidx.recyclerview.widget.w
        public int r(View view) {
            this.f743a.y0(view, true, this.f745c);
            return this.f745c.left;
        }

        @Override // androidx.recyclerview.widget.w
        public void s(View view, int r2) {
            view.offsetLeftAndRight(r2);
        }

        @Override // androidx.recyclerview.widget.w
        public void t(int r2) {
            this.f743a.T0(r2);
        }
    }

    static class b extends w {
        b(RecyclerView.o oVar) {
            super(oVar, null);
        }

        @Override // androidx.recyclerview.widget.w
        public int d(View view) {
            return this.f743a.W(view) + ((ViewGroup.MarginLayoutParams) ((RecyclerView.p) view.getLayoutParams())).bottomMargin;
        }

        @Override // androidx.recyclerview.widget.w
        public int e(View view) {
            RecyclerView.p pVar = (RecyclerView.p) view.getLayoutParams();
            return this.f743a.Z(view) + ((ViewGroup.MarginLayoutParams) pVar).topMargin + ((ViewGroup.MarginLayoutParams) pVar).bottomMargin;
        }

        @Override // androidx.recyclerview.widget.w
        public int f(View view) {
            RecyclerView.p pVar = (RecyclerView.p) view.getLayoutParams();
            return this.f743a.a0(view) + ((ViewGroup.MarginLayoutParams) pVar).leftMargin + ((ViewGroup.MarginLayoutParams) pVar).rightMargin;
        }

        @Override // androidx.recyclerview.widget.w
        public int g(View view) {
            return this.f743a.c0(view) - ((ViewGroup.MarginLayoutParams) ((RecyclerView.p) view.getLayoutParams())).topMargin;
        }

        @Override // androidx.recyclerview.widget.w
        public int h() {
            return this.f743a.e0();
        }

        @Override // androidx.recyclerview.widget.w
        public int i() {
            return this.f743a.e0() - this.f743a.m0();
        }

        @Override // androidx.recyclerview.widget.w
        public int j() {
            return this.f743a.m0();
        }

        @Override // androidx.recyclerview.widget.w
        public int l() {
            return this.f743a.f0();
        }

        @Override // androidx.recyclerview.widget.w
        public int m() {
            return this.f743a.A0();
        }

        @Override // androidx.recyclerview.widget.w
        public int n() {
            return this.f743a.r0();
        }

        @Override // androidx.recyclerview.widget.w
        public int o() {
            return (this.f743a.e0() - this.f743a.r0()) - this.f743a.m0();
        }

        @Override // androidx.recyclerview.widget.w
        public int q(View view) {
            this.f743a.y0(view, true, this.f745c);
            return this.f745c.bottom;
        }

        @Override // androidx.recyclerview.widget.w
        public int r(View view) {
            this.f743a.y0(view, true, this.f745c);
            return this.f745c.top;
        }

        @Override // androidx.recyclerview.widget.w
        public void s(View view, int r2) {
            view.offsetTopAndBottom(r2);
        }

        @Override // androidx.recyclerview.widget.w
        public void t(int r2) {
            this.f743a.U0(r2);
        }
    }

    private w(RecyclerView.o oVar) {
        this.f744b = Integer.MIN_VALUE;
        this.f745c = new Rect();
        this.f743a = oVar;
    }

    /* synthetic */ w(RecyclerView.o oVar, a aVar) {
        this(oVar);
    }

    public static w a(RecyclerView.o oVar) {
        return new a(oVar);
    }

    public static w b(RecyclerView.o oVar, int r2) {
        if (r2 == 0) {
            return a(oVar);
        }
        if (r2 == 1) {
            return c(oVar);
        }
        throw new IllegalArgumentException("invalid orientation");
    }

    public static w c(RecyclerView.o oVar) {
        return new b(oVar);
    }

    public abstract int d(View view);

    public abstract int e(View view);

    public abstract int f(View view);

    public abstract int g(View view);

    public abstract int h();

    public abstract int i();

    public abstract int j();

    public RecyclerView.o k() {
        return this.f743a;
    }

    public abstract int l();

    public abstract int m();

    public abstract int n();

    public abstract int o();

    public int p() {
        if (Integer.MIN_VALUE == this.f744b) {
            return 0;
        }
        return o() - this.f744b;
    }

    public abstract int q(View view);

    public abstract int r(View view);

    public abstract void s(View view, int r2);

    public abstract void t(int r1);

    public void u() {
        this.f744b = o();
    }
}

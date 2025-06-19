package androidx.recyclerview.widget;

import android.content.Context;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.animation.DecelerateInterpolator;
import android.widget.Scroller;
import androidx.annotation.i0;
import androidx.appcompat.widget.ActivityChooserView;
import androidx.recyclerview.widget.RecyclerView;

/* loaded from: classes.dex */
public abstract class b0 extends RecyclerView.r {
    static final float d = 100.0f;

    /* renamed from: a, reason: collision with root package name */
    RecyclerView f612a;

    /* renamed from: b, reason: collision with root package name */
    private Scroller f613b;

    /* renamed from: c, reason: collision with root package name */
    private final RecyclerView.t f614c = new a();

    class a extends RecyclerView.t {

        /* renamed from: a, reason: collision with root package name */
        boolean f615a = false;

        a() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.t
        public void a(RecyclerView recyclerView, int r2) {
            super.a(recyclerView, r2);
            if (r2 == 0 && this.f615a) {
                this.f615a = false;
                b0.this.l();
            }
        }

        @Override // androidx.recyclerview.widget.RecyclerView.t
        public void b(RecyclerView recyclerView, int r2, int r3) {
            if (r2 == 0 && r3 == 0) {
                return;
            }
            this.f615a = true;
        }
    }

    class b extends q {
        b(Context context) {
            super(context);
        }

        @Override // androidx.recyclerview.widget.q, androidx.recyclerview.widget.RecyclerView.b0
        protected void p(View view, RecyclerView.c0 c0Var, RecyclerView.b0.a aVar) {
            b0 b0Var = b0.this;
            RecyclerView recyclerView = b0Var.f612a;
            if (recyclerView == null) {
                return;
            }
            int[] r3 = b0Var.c(recyclerView.getLayoutManager(), view);
            int r4 = r3[0];
            int r32 = r3[1];
            int r0 = x(Math.max(Math.abs(r4), Math.abs(r32)));
            if (r0 > 0) {
                aVar.l(r4, r32, r0, this.j);
            }
        }

        @Override // androidx.recyclerview.widget.q
        protected float w(DisplayMetrics displayMetrics) {
            return b0.d / displayMetrics.densityDpi;
        }
    }

    private void g() {
        this.f612a.t1(this.f614c);
        this.f612a.setOnFlingListener(null);
    }

    private void j() throws IllegalStateException {
        if (this.f612a.getOnFlingListener() != null) {
            throw new IllegalStateException("An instance of OnFlingListener already set.");
        }
        this.f612a.r(this.f614c);
        this.f612a.setOnFlingListener(this);
    }

    private boolean k(@androidx.annotation.h0 RecyclerView.o oVar, int r4, int r5) {
        RecyclerView.b0 b0VarE;
        int i;
        if (!(oVar instanceof RecyclerView.b0.b) || (b0VarE = e(oVar)) == null || (i = i(oVar, r4, r5)) == -1) {
            return false;
        }
        b0VarE.q(i);
        oVar.g2(b0VarE);
        return true;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.r
    public boolean a(int r5, int r6) {
        RecyclerView.o layoutManager = this.f612a.getLayoutManager();
        if (layoutManager == null || this.f612a.getAdapter() == null) {
            return false;
        }
        int minFlingVelocity = this.f612a.getMinFlingVelocity();
        return (Math.abs(r6) > minFlingVelocity || Math.abs(r5) > minFlingVelocity) && k(layoutManager, r5, r6);
    }

    public void b(@i0 RecyclerView recyclerView) throws IllegalStateException {
        RecyclerView recyclerView2 = this.f612a;
        if (recyclerView2 == recyclerView) {
            return;
        }
        if (recyclerView2 != null) {
            g();
        }
        this.f612a = recyclerView;
        if (recyclerView != null) {
            j();
            this.f613b = new Scroller(this.f612a.getContext(), new DecelerateInterpolator());
            l();
        }
    }

    @i0
    public abstract int[] c(@androidx.annotation.h0 RecyclerView.o oVar, @androidx.annotation.h0 View view);

    public int[] d(int r11, int r12) {
        this.f613b.fling(0, 0, r11, r12, Integer.MIN_VALUE, ActivityChooserView.f.j, Integer.MIN_VALUE, ActivityChooserView.f.j);
        return new int[]{this.f613b.getFinalX(), this.f613b.getFinalY()};
    }

    @i0
    protected RecyclerView.b0 e(RecyclerView.o oVar) {
        return f(oVar);
    }

    @i0
    @Deprecated
    protected q f(RecyclerView.o oVar) {
        if (oVar instanceof RecyclerView.b0.b) {
            return new b(this.f612a.getContext());
        }
        return null;
    }

    @i0
    public abstract View h(RecyclerView.o oVar);

    public abstract int i(RecyclerView.o oVar, int r2, int r3);

    void l() {
        RecyclerView.o layoutManager;
        View viewH;
        RecyclerView recyclerView = this.f612a;
        if (recyclerView == null || (layoutManager = recyclerView.getLayoutManager()) == null || (viewH = h(layoutManager)) == null) {
            return;
        }
        int[] r0 = c(layoutManager, viewH);
        if (r0[0] == 0 && r0[1] == 0) {
            return;
        }
        this.f612a.G1(r0[0], r0[1]);
    }
}

package com.google.android.material.datepicker;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.os.Build;
import android.os.Bundle;
import android.view.ContextThemeWrapper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.GridView;
import android.widget.ListAdapter;
import androidx.annotation.h0;
import androidx.annotation.i0;
import androidx.annotation.k0;
import androidx.annotation.p0;
import androidx.annotation.x0;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import b.i.p.f0;
import c.a.b.c.a;
import com.google.android.material.button.MaterialButton;
import java.util.Calendar;
import java.util.Iterator;

@p0({p0.a.LIBRARY_GROUP})
/* loaded from: classes.dex */
public final class k<S> extends t<S> {
    private static final String r0 = "THEME_RES_ID_KEY";
    private static final String s0 = "GRID_SELECTOR_KEY";
    private static final String t0 = "CALENDAR_CONSTRAINTS_KEY";
    private static final String u0 = "CURRENT_MONTH_KEY";
    private static final int v0 = 3;

    @x0
    static final Object w0 = "MONTHS_VIEW_GROUP_TAG";

    @x0
    static final Object x0 = "NAVIGATION_PREV_TAG";

    @x0
    static final Object y0 = "NAVIGATION_NEXT_TAG";

    @x0
    static final Object z0 = "SELECTOR_TOGGLE_TAG";
    private int h0;

    @i0
    private com.google.android.material.datepicker.f<S> i0;

    @i0
    private com.google.android.material.datepicker.a j0;

    @i0
    private p k0;
    private EnumC0197k l0;
    private com.google.android.material.datepicker.c m0;
    private RecyclerView n0;
    private RecyclerView o0;
    private View p0;
    private View q0;

    class a implements Runnable {
        final /* synthetic */ int d;

        a(int r2) {
            this.d = r2;
        }

        @Override // java.lang.Runnable
        public void run() {
            k.this.o0.K1(this.d);
        }
    }

    class b extends b.i.p.a {
        b() {
        }

        @Override // b.i.p.a
        public void g(View view, @h0 b.i.p.p0.d dVar) {
            super.g(view, dVar);
            dVar.V0(null);
        }
    }

    class c extends w {
        final /* synthetic */ int P;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(Context context, int r3, boolean z, int r5) {
            super(context, r3, z);
            this.P = r5;
        }

        @Override // androidx.recyclerview.widget.LinearLayoutManager
        protected void k2(@h0 RecyclerView.c0 c0Var, @h0 int[] r4) {
            if (this.P == 0) {
                r4[0] = k.this.o0.getWidth();
                r4[1] = k.this.o0.getWidth();
            } else {
                r4[0] = k.this.o0.getHeight();
                r4[1] = k.this.o0.getHeight();
            }
        }
    }

    class d implements l {
        d() {
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.google.android.material.datepicker.k.l
        public void a(long j) {
            if (k.this.j0.f().s(j)) {
                k.this.i0.Q(j);
                Iterator<s<S>> it = k.this.g0.iterator();
                while (it.hasNext()) {
                    it.next().b(k.this.i0.G());
                }
                k.this.o0.getAdapter().j();
                if (k.this.n0 != null) {
                    k.this.n0.getAdapter().j();
                }
            }
        }
    }

    class e extends RecyclerView.n {

        /* renamed from: a, reason: collision with root package name */
        private final Calendar f6667a = y.v();

        /* renamed from: b, reason: collision with root package name */
        private final Calendar f6668b = y.v();

        e() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.n
        public void i(@h0 Canvas canvas, @h0 RecyclerView recyclerView, @h0 RecyclerView.c0 c0Var) {
            if ((recyclerView.getAdapter() instanceof z) && (recyclerView.getLayoutManager() instanceof GridLayoutManager)) {
                z zVar = (z) recyclerView.getAdapter();
                GridLayoutManager gridLayoutManager = (GridLayoutManager) recyclerView.getLayoutManager();
                for (b.i.o.f<Long, Long> fVar : k.this.i0.r()) {
                    Long l = fVar.f1147a;
                    if (l != null && fVar.f1148b != null) {
                        this.f6667a.setTimeInMillis(l.longValue());
                        this.f6668b.setTimeInMillis(fVar.f1148b.longValue());
                        int r4 = zVar.H(this.f6667a.get(1));
                        int r5 = zVar.H(this.f6668b.get(1));
                        View viewJ = gridLayoutManager.J(r4);
                        View viewJ2 = gridLayoutManager.J(r5);
                        int r42 = r4 / gridLayoutManager.H3();
                        int r52 = r5 / gridLayoutManager.H3();
                        int r8 = r42;
                        while (r8 <= r52) {
                            if (gridLayoutManager.J(gridLayoutManager.H3() * r8) != null) {
                                canvas.drawRect(r8 == r42 ? viewJ.getLeft() + (viewJ.getWidth() / 2) : 0, r9.getTop() + k.this.m0.d.e(), r8 == r52 ? viewJ2.getLeft() + (viewJ2.getWidth() / 2) : recyclerView.getWidth(), r9.getBottom() - k.this.m0.d.b(), k.this.m0.h);
                            }
                            r8++;
                        }
                    }
                }
            }
        }
    }

    class f extends b.i.p.a {
        f() {
        }

        @Override // b.i.p.a
        public void g(View view, @h0 b.i.p.p0.d dVar) {
            k kVar;
            int r0;
            super.g(view, dVar);
            if (k.this.q0.getVisibility() == 0) {
                kVar = k.this;
                r0 = a.m.mtrl_picker_toggle_to_year_selection;
            } else {
                kVar = k.this;
                r0 = a.m.mtrl_picker_toggle_to_day_selection;
            }
            dVar.i1(kVar.Q(r0));
        }
    }

    class g extends RecyclerView.t {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ r f6670a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ MaterialButton f6671b;

        g(r rVar, MaterialButton materialButton) {
            this.f6670a = rVar;
            this.f6671b = materialButton;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.t
        public void a(@h0 RecyclerView recyclerView, int r4) {
            if (r4 == 0) {
                CharSequence text = this.f6671b.getText();
                if (Build.VERSION.SDK_INT >= 16) {
                    recyclerView.announceForAccessibility(text);
                } else {
                    recyclerView.sendAccessibilityEvent(2048);
                }
            }
        }

        @Override // androidx.recyclerview.widget.RecyclerView.t
        public void b(@h0 RecyclerView recyclerView, int r2, int r3) {
            LinearLayoutManager linearLayoutManagerF2 = k.this.F2();
            int r1 = r2 < 0 ? linearLayoutManagerF2.y2() : linearLayoutManagerF2.C2();
            k.this.k0 = this.f6670a.G(r1);
            this.f6671b.setText(this.f6670a.H(r1));
        }
    }

    class h implements View.OnClickListener {
        h() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            k.this.K2();
        }
    }

    class i implements View.OnClickListener {
        final /* synthetic */ r d;

        i(r rVar) {
            this.d = rVar;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            int r3 = k.this.F2().y2() + 1;
            if (r3 < k.this.o0.getAdapter().e()) {
                k.this.I2(this.d.G(r3));
            }
        }
    }

    class j implements View.OnClickListener {
        final /* synthetic */ r d;

        j(r rVar) {
            this.d = rVar;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            int r3 = k.this.F2().C2() - 1;
            if (r3 >= 0) {
                k.this.I2(this.d.G(r3));
            }
        }
    }

    /* renamed from: com.google.android.material.datepicker.k$k, reason: collision with other inner class name */
    enum EnumC0197k {
        DAY,
        YEAR
    }

    interface l {
        void a(long j);
    }

    @h0
    private RecyclerView.n A2() {
        return new e();
    }

    @k0
    static int E2(@h0 Context context) {
        return context.getResources().getDimensionPixelSize(a.f.mtrl_calendar_day_height);
    }

    @h0
    static <T> k<T> G2(com.google.android.material.datepicker.f<T> fVar, int r4, @h0 com.google.android.material.datepicker.a aVar) {
        k<T> kVar = new k<>();
        Bundle bundle = new Bundle();
        bundle.putInt(r0, r4);
        bundle.putParcelable(s0, fVar);
        bundle.putParcelable(t0, aVar);
        bundle.putParcelable(u0, aVar.i());
        kVar.N1(bundle);
        return kVar;
    }

    private void H2(int r3) {
        this.o0.post(new a(r3));
    }

    private void z2(@h0 View view, @h0 r rVar) {
        MaterialButton materialButton = (MaterialButton) view.findViewById(a.h.month_navigation_fragment_toggle);
        materialButton.setTag(z0);
        f0.u1(materialButton, new f());
        MaterialButton materialButton2 = (MaterialButton) view.findViewById(a.h.month_navigation_previous);
        materialButton2.setTag(x0);
        MaterialButton materialButton3 = (MaterialButton) view.findViewById(a.h.month_navigation_next);
        materialButton3.setTag(y0);
        this.p0 = view.findViewById(a.h.mtrl_calendar_year_selector_frame);
        this.q0 = view.findViewById(a.h.mtrl_calendar_day_selector_frame);
        J2(EnumC0197k.DAY);
        materialButton.setText(this.k0.p());
        this.o0.r(new g(rVar, materialButton));
        materialButton.setOnClickListener(new h());
        materialButton3.setOnClickListener(new i(rVar));
        materialButton2.setOnClickListener(new j(rVar));
    }

    @i0
    com.google.android.material.datepicker.a B2() {
        return this.j0;
    }

    @Override // androidx.fragment.app.Fragment
    @h0
    public View C0(@h0 LayoutInflater layoutInflater, @i0 ViewGroup viewGroup, @i0 Bundle bundle) throws IllegalStateException, Resources.NotFoundException {
        int r1;
        int r9;
        ContextThemeWrapper contextThemeWrapper = new ContextThemeWrapper(u(), this.h0);
        this.m0 = new com.google.android.material.datepicker.c(contextThemeWrapper);
        LayoutInflater layoutInflaterCloneInContext = layoutInflater.cloneInContext(contextThemeWrapper);
        p pVarJ = this.j0.j();
        if (com.google.android.material.datepicker.l.b3(contextThemeWrapper)) {
            r1 = a.k.mtrl_calendar_vertical;
            r9 = 1;
        } else {
            r1 = a.k.mtrl_calendar_horizontal;
            r9 = 0;
        }
        View viewInflate = layoutInflaterCloneInContext.inflate(r1, viewGroup, false);
        GridView gridView = (GridView) viewInflate.findViewById(a.h.mtrl_calendar_days_of_week);
        f0.u1(gridView, new b());
        gridView.setAdapter((ListAdapter) new com.google.android.material.datepicker.j());
        gridView.setNumColumns(pVarJ.h);
        gridView.setEnabled(false);
        this.o0 = (RecyclerView) viewInflate.findViewById(a.h.mtrl_calendar_months);
        this.o0.setLayoutManager(new c(u(), r9, false, r9));
        this.o0.setTag(w0);
        r rVar = new r(contextThemeWrapper, this.i0, this.j0, new d());
        this.o0.setAdapter(rVar);
        int integer = contextThemeWrapper.getResources().getInteger(a.i.mtrl_calendar_year_selector_span);
        RecyclerView recyclerView = (RecyclerView) viewInflate.findViewById(a.h.mtrl_calendar_year_selector_frame);
        this.n0 = recyclerView;
        if (recyclerView != null) {
            recyclerView.setHasFixedSize(true);
            this.n0.setLayoutManager(new GridLayoutManager((Context) contextThemeWrapper, integer, 1, false));
            this.n0.setAdapter(new z(this));
            this.n0.n(A2());
        }
        if (viewInflate.findViewById(a.h.month_navigation_fragment_toggle) != null) {
            z2(viewInflate, rVar);
        }
        if (!com.google.android.material.datepicker.l.b3(contextThemeWrapper)) {
            new androidx.recyclerview.widget.r().b(this.o0);
        }
        this.o0.C1(rVar.I(this.k0));
        return viewInflate;
    }

    com.google.android.material.datepicker.c C2() {
        return this.m0;
    }

    @i0
    p D2() {
        return this.k0;
    }

    @h0
    LinearLayoutManager F2() {
        return (LinearLayoutManager) this.o0.getLayoutManager();
    }

    void I2(p pVar) {
        RecyclerView recyclerView;
        int r02;
        r rVar = (r) this.o0.getAdapter();
        int I = rVar.I(pVar);
        int I2 = I - rVar.I(this.k0);
        boolean z = Math.abs(I2) > 3;
        boolean z2 = I2 > 0;
        this.k0 = pVar;
        if (!z || !z2) {
            if (z) {
                recyclerView = this.o0;
                r02 = I + 3;
            }
            H2(I);
        }
        recyclerView = this.o0;
        r02 = I - 3;
        recyclerView.C1(r02);
        H2(I);
    }

    void J2(EnumC0197k enumC0197k) {
        this.l0 = enumC0197k;
        if (enumC0197k == EnumC0197k.YEAR) {
            this.n0.getLayoutManager().R1(((z) this.n0.getAdapter()).H(this.k0.g));
            this.p0.setVisibility(0);
            this.q0.setVisibility(8);
        } else if (enumC0197k == EnumC0197k.DAY) {
            this.p0.setVisibility(8);
            this.q0.setVisibility(0);
            I2(this.k0);
        }
    }

    void K2() {
        EnumC0197k enumC0197k;
        EnumC0197k enumC0197k2 = this.l0;
        if (enumC0197k2 == EnumC0197k.YEAR) {
            enumC0197k = EnumC0197k.DAY;
        } else if (enumC0197k2 != EnumC0197k.DAY) {
            return;
        } else {
            enumC0197k = EnumC0197k.YEAR;
        }
        J2(enumC0197k);
    }

    @Override // androidx.fragment.app.Fragment
    public void U0(@h0 Bundle bundle) {
        super.U0(bundle);
        bundle.putInt(r0, this.h0);
        bundle.putParcelable(s0, this.i0);
        bundle.putParcelable(t0, this.j0);
        bundle.putParcelable(u0, this.k0);
    }

    @Override // com.google.android.material.datepicker.t
    @i0
    public com.google.android.material.datepicker.f<S> q2() {
        return this.i0;
    }

    @Override // androidx.fragment.app.Fragment
    public void y0(@i0 Bundle bundle) {
        super.y0(bundle);
        if (bundle == null) {
            bundle = s();
        }
        this.h0 = bundle.getInt(r0);
        this.i0 = (com.google.android.material.datepicker.f) bundle.getParcelable(s0);
        this.j0 = (com.google.android.material.datepicker.a) bundle.getParcelable(t0);
        this.k0 = (p) bundle.getParcelable(u0);
    }
}

package androidx.recyclerview.widget;

import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseIntArray;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import b.i.p.p0.d;

/* loaded from: classes.dex */
public class GridLayoutManager extends LinearLayoutManager {
    private static final boolean X = false;
    private static final String Y = "GridLayoutManager";
    public static final int Z = -1;
    boolean O;
    int P;
    int[] Q;
    View[] R;
    final SparseIntArray S;
    final SparseIntArray T;
    c U;
    final Rect V;
    private boolean W;

    public static final class a extends c {
        @Override // androidx.recyclerview.widget.GridLayoutManager.c
        public int e(int r1, int r2) {
            return r1 % r2;
        }

        @Override // androidx.recyclerview.widget.GridLayoutManager.c
        public int f(int r1) {
            return 1;
        }
    }

    public static class b extends RecyclerView.p {
        public static final int g = -1;
        int e;
        int f;

        public b(int r1, int r2) {
            super(r1, r2);
            this.e = -1;
            this.f = 0;
        }

        public b(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            this.e = -1;
            this.f = 0;
        }

        public b(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
            this.e = -1;
            this.f = 0;
        }

        public b(ViewGroup.MarginLayoutParams marginLayoutParams) {
            super(marginLayoutParams);
            this.e = -1;
            this.f = 0;
        }

        public b(RecyclerView.p pVar) {
            super(pVar);
            this.e = -1;
            this.f = 0;
        }

        public int h() {
            return this.e;
        }

        public int i() {
            return this.f;
        }
    }

    public static abstract class c {

        /* renamed from: a, reason: collision with root package name */
        final SparseIntArray f537a = new SparseIntArray();

        /* renamed from: b, reason: collision with root package name */
        final SparseIntArray f538b = new SparseIntArray();

        /* renamed from: c, reason: collision with root package name */
        private boolean f539c = false;
        private boolean d = false;

        static int a(SparseIntArray sparseIntArray, int r5) {
            int size = sparseIntArray.size() - 1;
            int r1 = 0;
            while (r1 <= size) {
                int r2 = (r1 + size) >>> 1;
                if (sparseIntArray.keyAt(r2) < r5) {
                    r1 = r2 + 1;
                } else {
                    size = r2 - 1;
                }
            }
            int r12 = r1 - 1;
            if (r12 < 0 || r12 >= sparseIntArray.size()) {
                return -1;
            }
            return sparseIntArray.keyAt(r12);
        }

        int b(int r3, int r4) {
            if (!this.d) {
                return d(r3, r4);
            }
            int r0 = this.f538b.get(r3, -1);
            if (r0 != -1) {
                return r0;
            }
            int r42 = d(r3, r4);
            this.f538b.put(r3, r42);
            return r42;
        }

        int c(int r3, int r4) {
            if (!this.f539c) {
                return e(r3, r4);
            }
            int r0 = this.f537a.get(r3, -1);
            if (r0 != -1) {
                return r0;
            }
            int r42 = e(r3, r4);
            this.f537a.put(r3, r42);
            return r42;
        }

        /* JADX WARN: Removed duplicated region for block: B:13:0x002d  */
        /* JADX WARN: Removed duplicated region for block: B:21:0x0043  */
        /* JADX WARN: Removed duplicated region for block: B:27:? A[RETURN, SYNTHETIC] */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public int d(int r7, int r8) {
            /*
                r6 = this;
                boolean r0 = r6.d
                r1 = 0
                if (r0 == 0) goto L24
                android.util.SparseIntArray r0 = r6.f538b
                int r0 = a(r0, r7)
                r2 = -1
                if (r0 == r2) goto L24
                android.util.SparseIntArray r2 = r6.f538b
                int r2 = r2.get(r0)
                int r3 = r0 + 1
                int r4 = r6.c(r0, r8)
                int r0 = r6.f(r0)
                int r4 = r4 + r0
                if (r4 != r8) goto L27
                int r2 = r2 + 1
                goto L26
            L24:
                r2 = 0
                r3 = 0
            L26:
                r4 = 0
            L27:
                int r0 = r6.f(r7)
            L2b:
                if (r3 >= r7) goto L40
                int r5 = r6.f(r3)
                int r4 = r4 + r5
                if (r4 != r8) goto L38
                int r2 = r2 + 1
                r4 = 0
                goto L3d
            L38:
                if (r4 <= r8) goto L3d
                int r2 = r2 + 1
                r4 = r5
            L3d:
                int r3 = r3 + 1
                goto L2b
            L40:
                int r4 = r4 + r0
                if (r4 <= r8) goto L45
                int r2 = r2 + 1
            L45:
                return r2
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.GridLayoutManager.c.d(int, int):int");
        }

        /* JADX WARN: Removed duplicated region for block: B:12:0x0024  */
        /* JADX WARN: Removed duplicated region for block: B:18:0x0033  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:14:0x002b -> B:17:0x0030). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:15:0x002d -> B:17:0x0030). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:16:0x002f -> B:17:0x0030). Please report as a decompilation issue!!! */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public int e(int r6, int r7) {
            /*
                r5 = this;
                int r0 = r5.f(r6)
                r1 = 0
                if (r0 != r7) goto L8
                return r1
            L8:
                boolean r2 = r5.f539c
                if (r2 == 0) goto L20
                android.util.SparseIntArray r2 = r5.f537a
                int r2 = a(r2, r6)
                if (r2 < 0) goto L20
                android.util.SparseIntArray r3 = r5.f537a
                int r3 = r3.get(r2)
                int r4 = r5.f(r2)
                int r3 = r3 + r4
                goto L30
            L20:
                r2 = 0
                r3 = 0
            L22:
                if (r2 >= r6) goto L33
                int r4 = r5.f(r2)
                int r3 = r3 + r4
                if (r3 != r7) goto L2d
                r3 = 0
                goto L30
            L2d:
                if (r3 <= r7) goto L30
                r3 = r4
            L30:
                int r2 = r2 + 1
                goto L22
            L33:
                int r0 = r0 + r3
                if (r0 > r7) goto L37
                return r3
            L37:
                return r1
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.GridLayoutManager.c.e(int, int):int");
        }

        public abstract int f(int r1);

        public void g() {
            this.f538b.clear();
        }

        public void h() {
            this.f537a.clear();
        }

        public boolean i() {
            return this.d;
        }

        public boolean j() {
            return this.f539c;
        }

        public void k(boolean z) {
            if (!z) {
                this.f538b.clear();
            }
            this.d = z;
        }

        public void l(boolean z) {
            if (!z) {
                this.f538b.clear();
            }
            this.f539c = z;
        }
    }

    public GridLayoutManager(Context context, int r2) {
        super(context);
        this.O = false;
        this.P = -1;
        this.S = new SparseIntArray();
        this.T = new SparseIntArray();
        this.U = new a();
        this.V = new Rect();
        Q3(r2);
    }

    public GridLayoutManager(Context context, int r2, int r3, boolean z) {
        super(context, r3, z);
        this.O = false;
        this.P = -1;
        this.S = new SparseIntArray();
        this.T = new SparseIntArray();
        this.U = new a();
        this.V = new Rect();
        Q3(r2);
    }

    public GridLayoutManager(Context context, AttributeSet attributeSet, int r4, int r5) {
        super(context, attributeSet, r4, r5);
        this.O = false;
        this.P = -1;
        this.S = new SparseIntArray();
        this.T = new SparseIntArray();
        this.U = new a();
        this.V = new Rect();
        Q3(RecyclerView.o.t0(context, attributeSet, r4, r5).f582b);
    }

    static int[] A3(int[] r5, int r6, int r7) {
        int r4;
        if (r5 == null || r5.length != r6 + 1 || r5[r5.length - 1] != r7) {
            r5 = new int[r6 + 1];
        }
        int r1 = 0;
        r5[0] = 0;
        int r2 = r7 / r6;
        int r72 = r7 % r6;
        int r3 = 0;
        for (int r0 = 1; r0 <= r6; r0++) {
            r1 += r72;
            if (r1 <= 0 || r6 - r1 >= r72) {
                r4 = r2;
            } else {
                r4 = r2 + 1;
                r1 -= r6;
            }
            r3 += r4;
            r5[r0] = r3;
        }
        return r5;
    }

    private void B3() {
        this.S.clear();
        this.T.clear();
    }

    private int C3(RecyclerView.c0 c0Var) {
        if (Q() != 0 && c0Var.d() != 0) {
            r2();
            boolean zV2 = V2();
            View viewX2 = x2(!zV2, true);
            View viewW2 = w2(!zV2, true);
            if (viewX2 != null && viewW2 != null) {
                int r5 = this.U.b(s0(viewX2), this.P);
                int r6 = this.U.b(s0(viewW2), this.P);
                int r10 = this.x ? Math.max(0, ((this.U.b(c0Var.d() - 1, this.P) + 1) - Math.max(r5, r6)) - 1) : Math.max(0, Math.min(r5, r6));
                if (zV2) {
                    return Math.round((r10 * (Math.abs(this.u.d(viewW2) - this.u.g(viewX2)) / ((this.U.b(s0(viewW2), this.P) - this.U.b(s0(viewX2), this.P)) + 1))) + (this.u.n() - this.u.g(viewX2)));
                }
                return r10;
            }
        }
        return 0;
    }

    private int D3(RecyclerView.c0 c0Var) {
        if (Q() != 0 && c0Var.d() != 0) {
            r2();
            View viewX2 = x2(!V2(), true);
            View viewW2 = w2(!V2(), true);
            if (viewX2 != null && viewW2 != null) {
                if (!V2()) {
                    return this.U.b(c0Var.d() - 1, this.P) + 1;
                }
                int r1 = this.u.d(viewW2) - this.u.g(viewX2);
                int r0 = this.U.b(s0(viewX2), this.P);
                return (int) ((r1 / ((this.U.b(s0(viewW2), this.P) - r0) + 1)) * (this.U.b(c0Var.d() - 1, this.P) + 1));
            }
        }
        return 0;
    }

    private void E3(RecyclerView.w wVar, RecyclerView.c0 c0Var, LinearLayoutManager.a aVar, int r8) {
        boolean z = r8 == 1;
        int r1 = J3(wVar, c0Var, aVar.f541b);
        if (z) {
            while (r1 > 0) {
                int r82 = aVar.f541b;
                if (r82 <= 0) {
                    return;
                }
                int r83 = r82 - 1;
                aVar.f541b = r83;
                r1 = J3(wVar, c0Var, r83);
            }
            return;
        }
        int r84 = c0Var.d() - 1;
        int r0 = aVar.f541b;
        while (r0 < r84) {
            int r2 = r0 + 1;
            int r3 = J3(wVar, c0Var, r2);
            if (r3 <= r1) {
                break;
            }
            r0 = r2;
            r1 = r3;
        }
        aVar.f541b = r0;
    }

    private void F3() {
        View[] viewArr = this.R;
        if (viewArr == null || viewArr.length != this.P) {
            this.R = new View[this.P];
        }
    }

    private int I3(RecyclerView.w wVar, RecyclerView.c0 c0Var, int r3) {
        if (!c0Var.j()) {
            return this.U.b(r3, this.P);
        }
        int r1 = wVar.g(r3);
        if (r1 != -1) {
            return this.U.b(r1, this.P);
        }
        Log.w(Y, "Cannot find span size for pre layout position. " + r3);
        return 0;
    }

    private int J3(RecyclerView.w wVar, RecyclerView.c0 c0Var, int r4) {
        if (!c0Var.j()) {
            return this.U.c(r4, this.P);
        }
        int r3 = this.T.get(r4, -1);
        if (r3 != -1) {
            return r3;
        }
        int r2 = wVar.g(r4);
        if (r2 != -1) {
            return this.U.c(r2, this.P);
        }
        Log.w(Y, "Cannot find span size for pre layout position. It is not cached, not in the adapter. Pos:" + r4);
        return 0;
    }

    private int K3(RecyclerView.w wVar, RecyclerView.c0 c0Var, int r4) {
        if (!c0Var.j()) {
            return this.U.f(r4);
        }
        int r3 = this.S.get(r4, -1);
        if (r3 != -1) {
            return r3;
        }
        int r2 = wVar.g(r4);
        if (r2 != -1) {
            return this.U.f(r2);
        }
        Log.w(Y, "Cannot find span size for pre layout position. It is not cached, not in the adapter. Pos:" + r4);
        return 1;
    }

    private void M3(float f, int r3) {
        z3(Math.max(Math.round(f * this.P), r3));
    }

    private void O3(View view, int r10, boolean z) {
        int r0;
        int r102;
        b bVar = (b) view.getLayoutParams();
        Rect rect = bVar.f585b;
        int r2 = rect.top + rect.bottom + ((ViewGroup.MarginLayoutParams) bVar).topMargin + ((ViewGroup.MarginLayoutParams) bVar).bottomMargin;
        int r3 = rect.left + rect.right + ((ViewGroup.MarginLayoutParams) bVar).leftMargin + ((ViewGroup.MarginLayoutParams) bVar).rightMargin;
        int r1 = G3(bVar.e, bVar.f);
        if (this.s == 1) {
            r102 = RecyclerView.o.R(r1, r10, r3, ((ViewGroup.MarginLayoutParams) bVar).width, false);
            r0 = RecyclerView.o.R(this.u.o(), f0(), r2, ((ViewGroup.MarginLayoutParams) bVar).height, true);
        } else {
            int r103 = RecyclerView.o.R(r1, r10, r2, ((ViewGroup.MarginLayoutParams) bVar).height, false);
            int r02 = RecyclerView.o.R(this.u.o(), A0(), r3, ((ViewGroup.MarginLayoutParams) bVar).width, true);
            r0 = r103;
            r102 = r02;
        }
        P3(view, r102, r0, z);
    }

    private void P3(View view, int r3, int r4, boolean z) {
        RecyclerView.p pVar = (RecyclerView.p) view.getLayoutParams();
        if (z ? e2(view, r3, r4, pVar) : c2(view, r3, r4, pVar)) {
            view.measure(r3, r4);
        }
    }

    private void T3() {
        int r0;
        int r1;
        if (Q2() == 1) {
            r0 = z0() - p0();
            r1 = o0();
        } else {
            r0 = e0() - m0();
            r1 = r0();
        }
        z3(r0 - r1);
    }

    private void x3(RecyclerView.w wVar, RecyclerView.c0 c0Var, int r7, boolean z) {
        int r72;
        int r8;
        int r0 = 0;
        int r1 = -1;
        if (z) {
            r1 = r7;
            r72 = 0;
            r8 = 1;
        } else {
            r72 = r7 - 1;
            r8 = -1;
        }
        while (r72 != r1) {
            View view = this.R[r72];
            b bVar = (b) view.getLayoutParams();
            int r2 = K3(wVar, c0Var, s0(view));
            bVar.f = r2;
            bVar.e = r0;
            r0 += r2;
            r72 += r8;
        }
    }

    private void y3() {
        int r0 = Q();
        for (int r1 = 0; r1 < r0; r1++) {
            b bVar = (b) P(r1).getLayoutParams();
            int r3 = bVar.b();
            this.S.put(r3, bVar.i());
            this.T.put(r3, bVar.h());
        }
    }

    private void z3(int r3) {
        this.Q = A3(this.Q, this.P, r3);
    }

    int G3(int r4, int r5) {
        if (this.s != 1 || !U2()) {
            int[] r0 = this.Q;
            return r0[r5 + r4] - r0[r4];
        }
        int[] r02 = this.Q;
        int r1 = this.P;
        return r02[r1 - r4] - r02[(r1 - r4) - r5];
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager
    View H2(RecyclerView.w wVar, RecyclerView.c0 c0Var, int r10, int r11, int r12) {
        r2();
        int r0 = this.u.n();
        int i = this.u.i();
        int r2 = r11 > r10 ? 1 : -1;
        View view = null;
        View view2 = null;
        while (r10 != r11) {
            View viewP = P(r10);
            int r6 = s0(viewP);
            if (r6 >= 0 && r6 < r12 && J3(wVar, c0Var, r6) == 0) {
                if (((RecyclerView.p) viewP.getLayoutParams()).e()) {
                    if (view2 == null) {
                        view2 = viewP;
                    }
                } else {
                    if (this.u.g(viewP) < i && this.u.d(viewP) >= r0) {
                        return viewP;
                    }
                    if (view == null) {
                        view = viewP;
                    }
                }
            }
            r10 += r2;
        }
        return view != null ? view : view2;
    }

    public int H3() {
        return this.P;
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.o
    public RecyclerView.p K() {
        return this.s == 0 ? new b(-2, -1) : new b(-1, -2);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public RecyclerView.p L(Context context, AttributeSet attributeSet) {
        return new b(context, attributeSet);
    }

    public c L3() {
        return this.U;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public RecyclerView.p M(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof ViewGroup.MarginLayoutParams ? new b((ViewGroup.MarginLayoutParams) layoutParams) : new b(layoutParams);
    }

    public boolean N3() {
        return this.W;
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.o
    public int Q1(int r1, RecyclerView.w wVar, RecyclerView.c0 c0Var) {
        T3();
        F3();
        return super.Q1(r1, wVar, c0Var);
    }

    public void Q3(int r4) {
        if (r4 == this.P) {
            return;
        }
        this.O = true;
        if (r4 >= 1) {
            this.P = r4;
            this.U.h();
            N1();
        } else {
            throw new IllegalArgumentException("Span count should be at least 1. Provided " + r4);
        }
    }

    public void R3(c cVar) {
        this.U = cVar;
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.o
    public int S1(int r1, RecyclerView.w wVar, RecyclerView.c0 c0Var) {
        T3();
        F3();
        return super.S1(r1, wVar, c0Var);
    }

    public void S3(boolean z) {
        this.W = z;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public int V(RecyclerView.w wVar, RecyclerView.c0 c0Var) {
        if (this.s == 1) {
            return this.P;
        }
        if (c0Var.d() < 1) {
            return 0;
        }
        return I3(wVar, c0Var, c0Var.d() - 1) + 1;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:98:0x0219  */
    /* JADX WARN: Type inference failed for: r5v0 */
    /* JADX WARN: Type inference failed for: r5v1, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r5v19 */
    @Override // androidx.recyclerview.widget.LinearLayoutManager
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    void W2(androidx.recyclerview.widget.RecyclerView.w r18, androidx.recyclerview.widget.RecyclerView.c0 r19, androidx.recyclerview.widget.LinearLayoutManager.c r20, androidx.recyclerview.widget.LinearLayoutManager.b r21) {
        /*
            Method dump skipped, instructions count: 564
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.GridLayoutManager.W2(androidx.recyclerview.widget.RecyclerView$w, androidx.recyclerview.widget.RecyclerView$c0, androidx.recyclerview.widget.LinearLayoutManager$c, androidx.recyclerview.widget.LinearLayoutManager$b):void");
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public void Y1(Rect rect, int r6, int r7) {
        int r62;
        int r5;
        if (this.Q == null) {
            super.Y1(rect, r6, r7);
        }
        int r0 = o0() + p0();
        int r1 = r0() + m0();
        if (this.s == 1) {
            r5 = RecyclerView.o.q(r7, rect.height() + r1, k0());
            int[] r72 = this.Q;
            r62 = RecyclerView.o.q(r6, r72[r72.length - 1] + r0, l0());
        } else {
            r62 = RecyclerView.o.q(r6, rect.width() + r0, l0());
            int[] r52 = this.Q;
            r5 = RecyclerView.o.q(r7, r52[r52.length - 1] + r1, k0());
        }
        X1(r62, r5);
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager
    void Z2(RecyclerView.w wVar, RecyclerView.c0 c0Var, LinearLayoutManager.a aVar, int r5) {
        super.Z2(wVar, c0Var, aVar, r5);
        T3();
        if (c0Var.d() > 0 && !c0Var.j()) {
            E3(wVar, c0Var, aVar, r5);
        }
        F3();
    }

    /* JADX WARN: Code restructure failed: missing block: B:59:0x00d6, code lost:
    
        if (r13 == (r2 > r15)) goto L49;
     */
    /* JADX WARN: Removed duplicated region for block: B:79:0x0107  */
    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.o
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public android.view.View a1(android.view.View r24, int r25, androidx.recyclerview.widget.RecyclerView.w r26, androidx.recyclerview.widget.RecyclerView.c0 r27) {
        /*
            Method dump skipped, instructions count: 337
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.GridLayoutManager.a1(android.view.View, int, androidx.recyclerview.widget.RecyclerView$w, androidx.recyclerview.widget.RecyclerView$c0):android.view.View");
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public void g1(RecyclerView.w wVar, RecyclerView.c0 c0Var, View view, b.i.p.p0.d dVar) {
        int i;
        int r3;
        int i2;
        boolean z;
        boolean z2;
        int r1;
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (!(layoutParams instanceof b)) {
            super.f1(view, dVar);
            return;
        }
        b bVar = (b) layoutParams;
        int r8 = I3(wVar, c0Var, bVar.b());
        if (this.s == 0) {
            r1 = bVar.h();
            i = bVar.i();
            i2 = 1;
            z = false;
            z2 = false;
            r3 = r8;
        } else {
            i = 1;
            r3 = bVar.h();
            i2 = bVar.i();
            z = false;
            z2 = false;
            r1 = r8;
        }
        dVar.W0(d.c.h(r1, i, r3, i2, z, z2));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public void i1(RecyclerView recyclerView, int r2, int r3) {
        this.U.h();
        this.U.g();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public void j1(RecyclerView recyclerView) {
        this.U.h();
        this.U.g();
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.o
    public boolean j2() {
        return this.D == null && !this.O;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public void k1(RecyclerView recyclerView, int r2, int r3, int r4) {
        this.U.h();
        this.U.g();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public void l1(RecyclerView recyclerView, int r2, int r3) {
        this.U.h();
        this.U.g();
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager
    void l2(RecyclerView.c0 c0Var, LinearLayoutManager.c cVar, RecyclerView.o.c cVar2) {
        int r0 = this.P;
        for (int r2 = 0; r2 < this.P && cVar.c(c0Var) && r0 > 0; r2++) {
            int r3 = cVar.d;
            cVar2.a(r3, Math.max(0, cVar.g));
            r0 -= this.U.f(r3);
            cVar.d += cVar.e;
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public void n1(RecyclerView recyclerView, int r2, int r3, Object obj) {
        this.U.h();
        this.U.g();
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager
    public void n3(boolean z) {
        if (z) {
            throw new UnsupportedOperationException("GridLayoutManager does not support stack from end. Consider using reverse layout");
        }
        super.n3(false);
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.o
    public void o1(RecyclerView.w wVar, RecyclerView.c0 c0Var) {
        if (c0Var.j()) {
            y3();
        }
        super.o1(wVar, c0Var);
        B3();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public boolean p(RecyclerView.p pVar) {
        return pVar instanceof b;
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.o
    public void p1(RecyclerView.c0 c0Var) {
        super.p1(c0Var);
        this.O = false;
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.o
    public int u(RecyclerView.c0 c0Var) {
        return this.W ? C3(c0Var) : super.u(c0Var);
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.o
    public int v(RecyclerView.c0 c0Var) {
        return this.W ? D3(c0Var) : super.v(c0Var);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public int v0(RecyclerView.w wVar, RecyclerView.c0 c0Var) {
        if (this.s == 0) {
            return this.P;
        }
        if (c0Var.d() < 1) {
            return 0;
        }
        return I3(wVar, c0Var, c0Var.d() - 1) + 1;
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.o
    public int x(RecyclerView.c0 c0Var) {
        return this.W ? C3(c0Var) : super.x(c0Var);
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.o
    public int y(RecyclerView.c0 c0Var) {
        return this.W ? D3(c0Var) : super.y(c0Var);
    }
}

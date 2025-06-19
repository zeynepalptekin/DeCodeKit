package androidx.recyclerview.widget;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.PointF;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import androidx.annotation.p0;
import androidx.appcompat.widget.ActivityChooserView;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.m;
import java.util.List;

/* loaded from: classes.dex */
public class LinearLayoutManager extends RecyclerView.o implements m.j, RecyclerView.b0.b {
    private static final String I = "LinearLayoutManager";
    static final boolean J = false;
    public static final int K = 0;
    public static final int L = 1;
    public static final int M = Integer.MIN_VALUE;
    private static final float N = 0.33333334f;
    int A;
    int B;
    private boolean C;
    d D;
    final a E;
    private final b F;
    private int G;
    private int[] H;
    int s;
    private c t;
    w u;
    private boolean v;
    private boolean w;
    boolean x;
    private boolean y;
    private boolean z;

    static class a {

        /* renamed from: a, reason: collision with root package name */
        w f540a;

        /* renamed from: b, reason: collision with root package name */
        int f541b;

        /* renamed from: c, reason: collision with root package name */
        int f542c;
        boolean d;
        boolean e;

        a() {
            e();
        }

        void a() {
            this.f542c = this.d ? this.f540a.i() : this.f540a.n();
        }

        public void b(View view, int r3) {
            this.f542c = this.d ? this.f540a.d(view) + this.f540a.p() : this.f540a.g(view);
            this.f541b = r3;
        }

        public void c(View view, int r6) {
            int r0 = this.f540a.p();
            if (r0 >= 0) {
                b(view, r6);
                return;
            }
            this.f541b = r6;
            if (this.d) {
                int i = (this.f540a.i() - r0) - this.f540a.d(view);
                this.f542c = this.f540a.i() - i;
                if (i > 0) {
                    int r2 = this.f542c - this.f540a.e(view);
                    int r02 = this.f540a.n();
                    int r22 = r2 - (r02 + Math.min(this.f540a.g(view) - r02, 0));
                    if (r22 < 0) {
                        this.f542c += Math.min(i, -r22);
                        return;
                    }
                    return;
                }
                return;
            }
            int r62 = this.f540a.g(view);
            int r23 = r62 - this.f540a.n();
            this.f542c = r62;
            if (r23 > 0) {
                int i2 = (this.f540a.i() - Math.min(0, (this.f540a.i() - r0) - this.f540a.d(view))) - (r62 + this.f540a.e(view));
                if (i2 < 0) {
                    this.f542c -= Math.min(r23, -i2);
                }
            }
        }

        boolean d(View view, RecyclerView.c0 c0Var) {
            RecyclerView.p pVar = (RecyclerView.p) view.getLayoutParams();
            return !pVar.e() && pVar.b() >= 0 && pVar.b() < c0Var.d();
        }

        void e() {
            this.f541b = -1;
            this.f542c = Integer.MIN_VALUE;
            this.d = false;
            this.e = false;
        }

        public String toString() {
            return "AnchorInfo{mPosition=" + this.f541b + ", mCoordinate=" + this.f542c + ", mLayoutFromEnd=" + this.d + ", mValid=" + this.e + '}';
        }
    }

    protected static class b {

        /* renamed from: a, reason: collision with root package name */
        public int f543a;

        /* renamed from: b, reason: collision with root package name */
        public boolean f544b;

        /* renamed from: c, reason: collision with root package name */
        public boolean f545c;
        public boolean d;

        protected b() {
        }

        void a() {
            this.f543a = 0;
            this.f544b = false;
            this.f545c = false;
            this.d = false;
        }
    }

    static class c {
        static final String n = "LLM#LayoutState";
        static final int o = -1;
        static final int p = 1;
        static final int q = Integer.MIN_VALUE;
        static final int r = -1;
        static final int s = 1;
        static final int t = Integer.MIN_VALUE;

        /* renamed from: b, reason: collision with root package name */
        int f547b;

        /* renamed from: c, reason: collision with root package name */
        int f548c;
        int d;
        int e;
        int f;
        int g;
        int k;
        boolean m;

        /* renamed from: a, reason: collision with root package name */
        boolean f546a = true;
        int h = 0;
        int i = 0;
        boolean j = false;
        List<RecyclerView.f0> l = null;

        c() {
        }

        private View f() {
            int size = this.l.size();
            for (int r1 = 0; r1 < size; r1++) {
                View view = this.l.get(r1).f561a;
                RecyclerView.p pVar = (RecyclerView.p) view.getLayoutParams();
                if (!pVar.e() && this.d == pVar.b()) {
                    b(view);
                    return view;
                }
            }
            return null;
        }

        public void a() {
            b(null);
        }

        public void b(View view) {
            View viewG = g(view);
            this.d = viewG == null ? -1 : ((RecyclerView.p) viewG.getLayoutParams()).b();
        }

        boolean c(RecyclerView.c0 c0Var) {
            int r0 = this.d;
            return r0 >= 0 && r0 < c0Var.d();
        }

        void d() {
            Log.d(n, "avail:" + this.f548c + ", ind:" + this.d + ", dir:" + this.e + ", offset:" + this.f547b + ", layoutDir:" + this.f);
        }

        View e(RecyclerView.w wVar) {
            if (this.l != null) {
                return f();
            }
            View viewP = wVar.p(this.d);
            this.d += this.e;
            return viewP;
        }

        public View g(View view) {
            int r5;
            int size = this.l.size();
            View view2 = null;
            int r2 = ActivityChooserView.f.j;
            for (int r3 = 0; r3 < size; r3++) {
                View view3 = this.l.get(r3).f561a;
                RecyclerView.p pVar = (RecyclerView.p) view3.getLayoutParams();
                if (view3 != view && !pVar.e() && (r5 = (pVar.b() - this.d) * this.e) >= 0 && r5 < r2) {
                    view2 = view3;
                    if (r5 == 0) {
                        break;
                    }
                    r2 = r5;
                }
            }
            return view2;
        }
    }

    @SuppressLint({"BanParcelableUsage"})
    @p0({p0.a.LIBRARY})
    public static class d implements Parcelable {
        public static final Parcelable.Creator<d> CREATOR = new a();
        int d;
        int e;
        boolean f;

        static class a implements Parcelable.Creator<d> {
            a() {
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public d createFromParcel(Parcel parcel) {
                return new d(parcel);
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public d[] newArray(int r1) {
                return new d[r1];
            }
        }

        public d() {
        }

        d(Parcel parcel) {
            this.d = parcel.readInt();
            this.e = parcel.readInt();
            this.f = parcel.readInt() == 1;
        }

        public d(d dVar) {
            this.d = dVar.d;
            this.e = dVar.e;
            this.f = dVar.f;
        }

        boolean a() {
            return this.d >= 0;
        }

        void b() {
            this.d = -1;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int r2) {
            parcel.writeInt(this.d);
            parcel.writeInt(this.e);
            parcel.writeInt(this.f ? 1 : 0);
        }
    }

    public LinearLayoutManager(Context context) {
        this(context, 1, false);
    }

    public LinearLayoutManager(Context context, int r3, boolean z) {
        this.s = 1;
        this.w = false;
        this.x = false;
        this.y = false;
        this.z = true;
        this.A = -1;
        this.B = Integer.MIN_VALUE;
        this.D = null;
        this.E = new a();
        this.F = new b();
        this.G = 2;
        this.H = new int[2];
        j3(r3);
        l3(z);
    }

    public LinearLayoutManager(Context context, AttributeSet attributeSet, int r5, int r6) {
        this.s = 1;
        this.w = false;
        this.x = false;
        this.y = false;
        this.z = true;
        this.A = -1;
        this.B = Integer.MIN_VALUE;
        this.D = null;
        this.E = new a();
        this.F = new b();
        this.G = 2;
        this.H = new int[2];
        RecyclerView.o.d dVarT0 = RecyclerView.o.t0(context, attributeSet, r5, r6);
        j3(dVarT0.f581a);
        l3(dVarT0.f583c);
        n3(dVarT0.d);
    }

    private View A2() {
        return D2(Q() - 1, -1);
    }

    private View B2(RecyclerView.w wVar, RecyclerView.c0 c0Var) {
        return H2(wVar, c0Var, Q() - 1, -1, c0Var.d());
    }

    private View F2() {
        return this.x ? u2() : A2();
    }

    private View G2() {
        return this.x ? A2() : u2();
    }

    private View I2(RecyclerView.w wVar, RecyclerView.c0 c0Var) {
        return this.x ? v2(wVar, c0Var) : B2(wVar, c0Var);
    }

    private View J2(RecyclerView.w wVar, RecyclerView.c0 c0Var) {
        return this.x ? B2(wVar, c0Var) : v2(wVar, c0Var);
    }

    private int K2(int r2, RecyclerView.w wVar, RecyclerView.c0 c0Var, boolean z) {
        int i;
        int i2 = this.u.i() - r2;
        if (i2 <= 0) {
            return 0;
        }
        int r3 = -g3(-i2, wVar, c0Var);
        int r22 = r2 + r3;
        if (!z || (i = this.u.i() - r22) <= 0) {
            return r3;
        }
        this.u.t(i);
        return i + r3;
    }

    private int L2(int r2, RecyclerView.w wVar, RecyclerView.c0 c0Var, boolean z) {
        int r22;
        int r0 = r2 - this.u.n();
        if (r0 <= 0) {
            return 0;
        }
        int r3 = -g3(r0, wVar, c0Var);
        int r23 = r2 + r3;
        if (!z || (r22 = r23 - this.u.n()) <= 0) {
            return r3;
        }
        this.u.t(-r22);
        return r3 - r22;
    }

    private View M2() {
        return P(this.x ? 0 : Q() - 1);
    }

    private View N2() {
        return P(this.x ? Q() - 1 : 0);
    }

    private void X2(RecyclerView.w wVar, RecyclerView.c0 c0Var, int r18, int r19) {
        if (!c0Var.n() || Q() == 0 || c0Var.j() || !j2()) {
            return;
        }
        List<RecyclerView.f0> listL = wVar.l();
        int size = listL.size();
        int r6 = s0(P(0));
        int r8 = 0;
        int r9 = 0;
        for (int r7 = 0; r7 < size; r7++) {
            RecyclerView.f0 f0Var = listL.get(r7);
            if (!f0Var.w()) {
                char c2 = (f0Var.m() < r6) != this.x ? (char) 65535 : (char) 1;
                int r10 = this.u.e(f0Var.f561a);
                if (c2 == 65535) {
                    r8 += r10;
                } else {
                    r9 += r10;
                }
            }
        }
        this.t.l = listL;
        if (r8 > 0) {
            u3(s0(N2()), r18);
            c cVar = this.t;
            cVar.h = r8;
            cVar.f548c = 0;
            cVar.a();
            s2(wVar, this.t, c0Var, false);
        }
        if (r9 > 0) {
            s3(s0(M2()), r19);
            c cVar2 = this.t;
            cVar2.h = r9;
            cVar2.f548c = 0;
            cVar2.a();
            s2(wVar, this.t, c0Var, false);
        }
        this.t.l = null;
    }

    private void Y2() {
        Log.d(I, "internal representation of views on the screen");
        for (int r1 = 0; r1 < Q(); r1++) {
            View viewP = P(r1);
            Log.d(I, "item " + s0(viewP) + ", coord:" + this.u.g(viewP));
        }
        Log.d(I, "==============");
    }

    private void a3(RecyclerView.w wVar, c cVar) {
        if (!cVar.f546a || cVar.m) {
            return;
        }
        int r0 = cVar.g;
        int r1 = cVar.i;
        if (cVar.f == -1) {
            c3(wVar, r0, r1);
        } else {
            d3(wVar, r0, r1);
        }
    }

    private void b3(RecyclerView.w wVar, int r2, int r3) {
        if (r2 == r3) {
            return;
        }
        if (r3 <= r2) {
            while (r2 > r3) {
                G1(r2, wVar);
                r2--;
            }
        } else {
            for (int r32 = r3 - 1; r32 >= r2; r32--) {
                G1(r32, wVar);
            }
        }
    }

    private void c3(RecyclerView.w wVar, int r6, int r7) {
        int r0 = Q();
        if (r6 < 0) {
            return;
        }
        int r1 = (this.u.h() - r6) + r7;
        if (this.x) {
            for (int r72 = 0; r72 < r0; r72++) {
                View viewP = P(r72);
                if (this.u.g(viewP) < r1 || this.u.r(viewP) < r1) {
                    b3(wVar, 0, r72);
                    return;
                }
            }
            return;
        }
        int r02 = r0 - 1;
        for (int r62 = r02; r62 >= 0; r62--) {
            View viewP2 = P(r62);
            if (this.u.g(viewP2) < r1 || this.u.r(viewP2) < r1) {
                b3(wVar, r02, r62);
                return;
            }
        }
    }

    private void d3(RecyclerView.w wVar, int r6, int r7) {
        if (r6 < 0) {
            return;
        }
        int r62 = r6 - r7;
        int r72 = Q();
        if (!this.x) {
            for (int r1 = 0; r1 < r72; r1++) {
                View viewP = P(r1);
                if (this.u.d(viewP) > r62 || this.u.q(viewP) > r62) {
                    b3(wVar, 0, r1);
                    return;
                }
            }
            return;
        }
        int r73 = r72 - 1;
        for (int r0 = r73; r0 >= 0; r0--) {
            View viewP2 = P(r0);
            if (this.u.d(viewP2) > r62 || this.u.q(viewP2) > r62) {
                b3(wVar, r73, r0);
                return;
            }
        }
    }

    private void f3() {
        this.x = (this.s == 1 || !U2()) ? this.w : !this.w;
    }

    private int m2(RecyclerView.c0 c0Var) {
        if (Q() == 0) {
            return 0;
        }
        r2();
        return z.a(c0Var, this.u, x2(!this.z, true), w2(!this.z, true), this, this.z);
    }

    private int n2(RecyclerView.c0 c0Var) {
        if (Q() == 0) {
            return 0;
        }
        r2();
        return z.b(c0Var, this.u, x2(!this.z, true), w2(!this.z, true), this, this.z, this.x);
    }

    private int o2(RecyclerView.c0 c0Var) {
        if (Q() == 0) {
            return 0;
        }
        r2();
        return z.c(c0Var, this.u, x2(!this.z, true), w2(!this.z, true), this, this.z);
    }

    private boolean o3(RecyclerView.w wVar, RecyclerView.c0 c0Var, a aVar) {
        if (Q() == 0) {
            return false;
        }
        View viewD0 = d0();
        if (viewD0 != null && aVar.d(viewD0, c0Var)) {
            aVar.c(viewD0, s0(viewD0));
            return true;
        }
        if (this.v != this.y) {
            return false;
        }
        View viewI2 = aVar.d ? I2(wVar, c0Var) : J2(wVar, c0Var);
        if (viewI2 == null) {
            return false;
        }
        aVar.b(viewI2, s0(viewI2));
        if (!c0Var.j() && j2()) {
            if (this.u.g(viewI2) >= this.u.i() || this.u.d(viewI2) < this.u.n()) {
                aVar.f542c = aVar.d ? this.u.i() : this.u.n();
            }
        }
        return true;
    }

    private boolean p3(RecyclerView.c0 c0Var, a aVar) {
        int r0;
        if (!c0Var.j() && (r0 = this.A) != -1) {
            if (r0 >= 0 && r0 < c0Var.d()) {
                aVar.f541b = this.A;
                d dVar = this.D;
                if (dVar != null && dVar.a()) {
                    boolean z = this.D.f;
                    aVar.d = z;
                    aVar.f542c = z ? this.u.i() - this.D.e : this.u.n() + this.D.e;
                    return true;
                }
                if (this.B != Integer.MIN_VALUE) {
                    boolean z2 = this.x;
                    aVar.d = z2;
                    aVar.f542c = z2 ? this.u.i() - this.B : this.u.n() + this.B;
                    return true;
                }
                View viewJ = J(this.A);
                if (viewJ == null) {
                    if (Q() > 0) {
                        aVar.d = (this.A < s0(P(0))) == this.x;
                    }
                    aVar.a();
                } else {
                    if (this.u.e(viewJ) > this.u.o()) {
                        aVar.a();
                        return true;
                    }
                    if (this.u.g(viewJ) - this.u.n() < 0) {
                        aVar.f542c = this.u.n();
                        aVar.d = false;
                        return true;
                    }
                    if (this.u.i() - this.u.d(viewJ) < 0) {
                        aVar.f542c = this.u.i();
                        aVar.d = true;
                        return true;
                    }
                    aVar.f542c = aVar.d ? this.u.d(viewJ) + this.u.p() : this.u.g(viewJ);
                }
                return true;
            }
            this.A = -1;
            this.B = Integer.MIN_VALUE;
        }
        return false;
    }

    private void q3(RecyclerView.w wVar, RecyclerView.c0 c0Var, a aVar) {
        if (p3(c0Var, aVar) || o3(wVar, c0Var, aVar)) {
            return;
        }
        aVar.a();
        aVar.f541b = this.y ? c0Var.d() - 1 : 0;
    }

    private void r3(int r5, int r6, boolean z, RecyclerView.c0 c0Var) {
        int r52;
        this.t.m = e3();
        this.t.f = r5;
        int[] r0 = this.H;
        r0[0] = 0;
        r0[1] = 0;
        k2(c0Var, r0);
        int r8 = Math.max(0, this.H[0]);
        int r02 = Math.max(0, this.H[1]);
        boolean z2 = r5 == 1;
        this.t.h = z2 ? r02 : r8;
        c cVar = this.t;
        if (!z2) {
            r8 = r02;
        }
        cVar.i = r8;
        if (z2) {
            this.t.h += this.u.j();
            View viewM2 = M2();
            this.t.e = this.x ? -1 : 1;
            c cVar2 = this.t;
            int r03 = s0(viewM2);
            c cVar3 = this.t;
            cVar2.d = r03 + cVar3.e;
            cVar3.f547b = this.u.d(viewM2);
            r52 = this.u.d(viewM2) - this.u.i();
        } else {
            View viewN2 = N2();
            this.t.h += this.u.n();
            this.t.e = this.x ? 1 : -1;
            c cVar4 = this.t;
            int r04 = s0(viewN2);
            c cVar5 = this.t;
            cVar4.d = r04 + cVar5.e;
            cVar5.f547b = this.u.g(viewN2);
            r52 = (-this.u.g(viewN2)) + this.u.n();
        }
        c cVar6 = this.t;
        cVar6.f548c = r6;
        if (z) {
            cVar6.f548c = r6 - r52;
        }
        this.t.g = r52;
    }

    private void s3(int r4, int r5) {
        this.t.f548c = this.u.i() - r5;
        this.t.e = this.x ? -1 : 1;
        c cVar = this.t;
        cVar.d = r4;
        cVar.f = 1;
        cVar.f547b = r5;
        cVar.g = Integer.MIN_VALUE;
    }

    private void t3(a aVar) {
        s3(aVar.f541b, aVar.f542c);
    }

    private View u2() {
        return D2(0, Q());
    }

    private void u3(int r3, int r4) {
        this.t.f548c = r4 - this.u.n();
        c cVar = this.t;
        cVar.d = r3;
        cVar.e = this.x ? 1 : -1;
        c cVar2 = this.t;
        cVar2.f = -1;
        cVar2.f547b = r4;
        cVar2.g = Integer.MIN_VALUE;
    }

    private View v2(RecyclerView.w wVar, RecyclerView.c0 c0Var) {
        return H2(wVar, c0Var, 0, Q(), c0Var.d());
    }

    private void v3(a aVar) {
        u3(aVar.f541b, aVar.f542c);
    }

    public int C2() {
        View viewE2 = E2(Q() - 1, -1, false, true);
        if (viewE2 == null) {
            return -1;
        }
        return s0(viewE2);
    }

    View D2(int r4, int r5) {
        int r0;
        int r1;
        r2();
        if ((r5 > r4 ? (char) 1 : r5 < r4 ? (char) 65535 : (char) 0) == 0) {
            return P(r4);
        }
        if (this.u.g(P(r4)) < this.u.n()) {
            r0 = 16644;
            r1 = 16388;
        } else {
            r0 = 4161;
            r1 = androidx.fragment.app.r.H;
        }
        return (this.s == 0 ? this.e : this.f).a(r4, r5, r0, r1);
    }

    View E2(int r2, int r3, boolean z, boolean z2) {
        r2();
        return (this.s == 0 ? this.e : this.f).a(r2, r3, z ? 24579 : 320, z2 ? 320 : 0);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public boolean F0() {
        return true;
    }

    View H2(RecyclerView.w wVar, RecyclerView.c0 c0Var, int r8, int r9, int r10) {
        r2();
        int r6 = this.u.n();
        int i = this.u.i();
        int r0 = r9 > r8 ? 1 : -1;
        View view = null;
        View view2 = null;
        while (r8 != r9) {
            View viewP = P(r8);
            int r4 = s0(viewP);
            if (r4 >= 0 && r4 < r10) {
                if (((RecyclerView.p) viewP.getLayoutParams()).e()) {
                    if (view2 == null) {
                        view2 = viewP;
                    }
                } else {
                    if (this.u.g(viewP) < i && this.u.d(viewP) >= r6) {
                        return viewP;
                    }
                    if (view == null) {
                        view = viewP;
                    }
                }
            }
            r8 += r0;
        }
        return view != null ? view : view2;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public View J(int r3) {
        int r0 = Q();
        if (r0 == 0) {
            return null;
        }
        int r1 = r3 - s0(P(0));
        if (r1 >= 0 && r1 < r0) {
            View viewP = P(r1);
            if (s0(viewP) == r3) {
                return viewP;
            }
        }
        return super.J(r3);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public RecyclerView.p K() {
        return new RecyclerView.p(-2, -2);
    }

    @Deprecated
    protected int O2(RecyclerView.c0 c0Var) {
        if (c0Var.h()) {
            return this.u.o();
        }
        return 0;
    }

    public int P2() {
        return this.G;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public int Q1(int r3, RecyclerView.w wVar, RecyclerView.c0 c0Var) {
        if (this.s == 1) {
            return 0;
        }
        return g3(r3, wVar, c0Var);
    }

    public int Q2() {
        return this.s;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public void R1(int r1) {
        this.A = r1;
        this.B = Integer.MIN_VALUE;
        d dVar = this.D;
        if (dVar != null) {
            dVar.b();
        }
        N1();
    }

    public boolean R2() {
        return this.C;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public int S1(int r2, RecyclerView.w wVar, RecyclerView.c0 c0Var) {
        if (this.s == 0) {
            return 0;
        }
        return g3(r2, wVar, c0Var);
    }

    public boolean S2() {
        return this.w;
    }

    public boolean T2() {
        return this.y;
    }

    protected boolean U2() {
        return i0() == 1;
    }

    public boolean V2() {
        return this.z;
    }

    void W2(RecyclerView.w wVar, RecyclerView.c0 c0Var, c cVar, b bVar) {
        int r3;
        int r4;
        int r5;
        int r2;
        int r0;
        View viewE = cVar.e(wVar);
        if (viewE == null) {
            bVar.f544b = true;
            return;
        }
        RecyclerView.p pVar = (RecyclerView.p) viewE.getLayoutParams();
        if (cVar.l == null) {
            if (this.x == (cVar.f == -1)) {
                e(viewE);
            } else {
                f(viewE, 0);
            }
        } else {
            if (this.x == (cVar.f == -1)) {
                c(viewE);
            } else {
                d(viewE, 0);
            }
        }
        R0(viewE, 0, 0);
        bVar.f543a = this.u.e(viewE);
        if (this.s == 1) {
            if (U2()) {
                r0 = z0() - p0();
                r2 = r0 - this.u.f(viewE);
            } else {
                r2 = o0();
                r0 = this.u.f(viewE) + r2;
            }
            int r32 = cVar.f;
            int r10 = cVar.f547b;
            if (r32 == -1) {
                r5 = r10;
                r4 = r0;
                r3 = r10 - bVar.f543a;
            } else {
                r3 = r10;
                r4 = r0;
                r5 = bVar.f543a + r10;
            }
        } else {
            int r02 = r0();
            int r22 = this.u.f(viewE) + r02;
            int r33 = cVar.f;
            int r102 = cVar.f547b;
            if (r33 == -1) {
                r4 = r102;
                r3 = r02;
                r5 = r22;
                r2 = r102 - bVar.f543a;
            } else {
                r3 = r02;
                r4 = bVar.f543a + r102;
                r5 = r22;
                r2 = r102;
            }
        }
        P0(viewE, r2, r3, r4, r5);
        if (pVar.e() || pVar.d()) {
            bVar.f545c = true;
        }
        bVar.d = viewE.hasFocusable();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public void Z0(RecyclerView recyclerView, RecyclerView.w wVar) {
        super.Z0(recyclerView, wVar);
        if (this.C) {
            D1(wVar);
            wVar.d();
        }
    }

    void Z2(RecyclerView.w wVar, RecyclerView.c0 c0Var, a aVar, int r4) {
    }

    @Override // androidx.recyclerview.widget.RecyclerView.b0.b
    public PointF a(int r4) {
        if (Q() == 0) {
            return null;
        }
        int r2 = (r4 < s0(P(0))) != this.x ? -1 : 1;
        return this.s == 0 ? new PointF(r2, 0.0f) : new PointF(0.0f, r2);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public View a1(View view, int r5, RecyclerView.w wVar, RecyclerView.c0 c0Var) {
        int r4;
        f3();
        if (Q() == 0 || (r4 = p2(r5)) == Integer.MIN_VALUE) {
            return null;
        }
        r2();
        r3(r4, (int) (this.u.o() * N), false, c0Var);
        c cVar = this.t;
        cVar.g = Integer.MIN_VALUE;
        cVar.f546a = false;
        s2(wVar, cVar, c0Var, true);
        View viewG2 = r4 == -1 ? G2() : F2();
        View viewN2 = r4 == -1 ? N2() : M2();
        if (!viewN2.hasFocusable()) {
            return viewG2;
        }
        if (viewG2 == null) {
            return null;
        }
        return viewN2;
    }

    @Override // androidx.recyclerview.widget.m.j
    public void b(@androidx.annotation.h0 View view, @androidx.annotation.h0 View view2, int r6, int r7) {
        int i;
        i("Cannot drop a view during a scroll or layout calculation");
        r2();
        f3();
        int r62 = s0(view);
        int r72 = s0(view2);
        char c2 = r62 < r72 ? (char) 1 : (char) 65535;
        if (this.x) {
            if (c2 == 1) {
                h3(r72, this.u.i() - (this.u.g(view2) + this.u.e(view)));
                return;
            }
            i = this.u.i() - this.u.d(view2);
        } else {
            if (c2 != 65535) {
                h3(r72, this.u.d(view2) - this.u.e(view));
                return;
            }
            i = this.u.g(view2);
        }
        h3(r72, i);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public void b1(AccessibilityEvent accessibilityEvent) {
        super.b1(accessibilityEvent);
        if (Q() > 0) {
            accessibilityEvent.setFromIndex(y2());
            accessibilityEvent.setToIndex(C2());
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    boolean d2() {
        return (f0() == 1073741824 || A0() == 1073741824 || !B0()) ? false : true;
    }

    boolean e3() {
        return this.u.l() == 0 && this.u.h() == 0;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public void f2(RecyclerView recyclerView, RecyclerView.c0 c0Var, int r3) {
        q qVar = new q(recyclerView.getContext());
        qVar.q(r3);
        g2(qVar);
    }

    int g3(int r6, RecyclerView.w wVar, RecyclerView.c0 c0Var) {
        if (Q() == 0 || r6 == 0) {
            return 0;
        }
        r2();
        this.t.f546a = true;
        int r0 = r6 > 0 ? 1 : -1;
        int r3 = Math.abs(r6);
        r3(r0, r3, true, c0Var);
        c cVar = this.t;
        int r4 = cVar.g + s2(wVar, cVar, c0Var, false);
        if (r4 < 0) {
            return 0;
        }
        if (r3 > r4) {
            r6 = r0 * r4;
        }
        this.u.t(-r6);
        this.t.k = r6;
        return r6;
    }

    public void h3(int r1, int r2) {
        this.A = r1;
        this.B = r2;
        d dVar = this.D;
        if (dVar != null) {
            dVar.b();
        }
        N1();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public void i(String str) {
        if (this.D == null) {
            super.i(str);
        }
    }

    public void i3(int r1) {
        this.G = r1;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public boolean j2() {
        return this.D == null && this.v == this.y;
    }

    public void j3(int r4) {
        if (r4 != 0 && r4 != 1) {
            throw new IllegalArgumentException("invalid orientation:" + r4);
        }
        i(null);
        if (r4 != this.s || this.u == null) {
            w wVarB = w.b(this, r4);
            this.u = wVarB;
            this.E.f540a = wVarB;
            this.s = r4;
            N1();
        }
    }

    protected void k2(@androidx.annotation.h0 RecyclerView.c0 c0Var, @androidx.annotation.h0 int[] r5) {
        int r0;
        int r4 = O2(c0Var);
        if (this.t.f == -1) {
            r0 = 0;
        } else {
            r0 = r4;
            r4 = 0;
        }
        r5[0] = r4;
        r5[1] = r0;
    }

    public void k3(boolean z) {
        this.C = z;
    }

    void l2(RecyclerView.c0 c0Var, c cVar, RecyclerView.o.c cVar2) {
        int r0 = cVar.d;
        if (r0 < 0 || r0 >= c0Var.d()) {
            return;
        }
        cVar2.a(r0, Math.max(0, cVar.g));
    }

    public void l3(boolean z) {
        i(null);
        if (z == this.w) {
            return;
        }
        this.w = z;
        N1();
    }

    public void m3(boolean z) {
        this.z = z;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public boolean n() {
        return this.s == 0;
    }

    public void n3(boolean z) {
        i(null);
        if (this.y == z) {
            return;
        }
        this.y = z;
        N1();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public boolean o() {
        return this.s == 1;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public void o1(RecyclerView.w wVar, RecyclerView.c0 c0Var) {
        int r3;
        int r1;
        int r12;
        int r32;
        int r0;
        int r5;
        View viewJ;
        int r52;
        int i;
        int r13 = -1;
        if (!(this.D == null && this.A == -1) && c0Var.d() == 0) {
            D1(wVar);
            return;
        }
        d dVar = this.D;
        if (dVar != null && dVar.a()) {
            this.A = this.D.d;
        }
        r2();
        this.t.f546a = false;
        f3();
        View viewD0 = d0();
        if (!this.E.e || this.A != -1 || this.D != null) {
            this.E.e();
            a aVar = this.E;
            aVar.d = this.x ^ this.y;
            q3(wVar, c0Var, aVar);
            this.E.e = true;
        } else if (viewD0 != null && (this.u.g(viewD0) >= this.u.i() || this.u.d(viewD0) <= this.u.n())) {
            this.E.c(viewD0, s0(viewD0));
        }
        c cVar = this.t;
        cVar.f = cVar.k >= 0 ? 1 : -1;
        int[] r02 = this.H;
        r02[0] = 0;
        r02[1] = 0;
        k2(c0Var, r02);
        int r03 = Math.max(0, this.H[0]) + this.u.n();
        int r33 = Math.max(0, this.H[1]) + this.u.j();
        if (c0Var.j() && (r5 = this.A) != -1 && this.B != Integer.MIN_VALUE && (viewJ = J(r5)) != null) {
            if (this.x) {
                i = this.u.i() - this.u.d(viewJ);
                r52 = this.B;
            } else {
                r52 = this.u.g(viewJ) - this.u.n();
                i = this.B;
            }
            int r6 = i - r52;
            if (r6 > 0) {
                r03 += r6;
            } else {
                r33 -= r6;
            }
        }
        if (!this.E.d ? !this.x : this.x) {
            r13 = 1;
        }
        Z2(wVar, c0Var, this.E, r13);
        z(wVar);
        this.t.m = e3();
        this.t.j = c0Var.j();
        this.t.i = 0;
        a aVar2 = this.E;
        if (aVar2.d) {
            v3(aVar2);
            c cVar2 = this.t;
            cVar2.h = r03;
            s2(wVar, cVar2, c0Var, false);
            c cVar3 = this.t;
            r1 = cVar3.f547b;
            int r53 = cVar3.d;
            int r04 = cVar3.f548c;
            if (r04 > 0) {
                r33 += r04;
            }
            t3(this.E);
            c cVar4 = this.t;
            cVar4.h = r33;
            cVar4.d += cVar4.e;
            s2(wVar, cVar4, c0Var, false);
            c cVar5 = this.t;
            r3 = cVar5.f547b;
            int r05 = cVar5.f548c;
            if (r05 > 0) {
                u3(r53, r1);
                c cVar6 = this.t;
                cVar6.h = r05;
                s2(wVar, cVar6, c0Var, false);
                r1 = this.t.f547b;
            }
        } else {
            t3(aVar2);
            c cVar7 = this.t;
            cVar7.h = r33;
            s2(wVar, cVar7, c0Var, false);
            c cVar8 = this.t;
            r3 = cVar8.f547b;
            int r54 = cVar8.d;
            int r14 = cVar8.f548c;
            if (r14 > 0) {
                r03 += r14;
            }
            v3(this.E);
            c cVar9 = this.t;
            cVar9.h = r03;
            cVar9.d += cVar9.e;
            s2(wVar, cVar9, c0Var, false);
            c cVar10 = this.t;
            r1 = cVar10.f547b;
            int r06 = cVar10.f548c;
            if (r06 > 0) {
                s3(r54, r3);
                c cVar11 = this.t;
                cVar11.h = r06;
                s2(wVar, cVar11, c0Var, false);
                r3 = this.t.f547b;
            }
        }
        if (Q() > 0) {
            if (this.x ^ this.y) {
                int r07 = K2(r3, wVar, c0Var, true);
                r12 = r1 + r07;
                r32 = r3 + r07;
                r0 = L2(r12, wVar, c0Var, false);
            } else {
                int r08 = L2(r1, wVar, c0Var, true);
                r12 = r1 + r08;
                r32 = r3 + r08;
                r0 = K2(r32, wVar, c0Var, false);
            }
            r1 = r12 + r0;
            r3 = r32 + r0;
        }
        X2(wVar, c0Var, r1, r3);
        if (c0Var.j()) {
            this.E.e();
        } else {
            this.u.u();
        }
        this.v = this.y;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public void p1(RecyclerView.c0 c0Var) {
        super.p1(c0Var);
        this.D = null;
        this.A = -1;
        this.B = Integer.MIN_VALUE;
        this.E.e();
    }

    int p2(int r5) {
        return r5 != 1 ? r5 != 2 ? r5 != 17 ? r5 != 33 ? r5 != 66 ? (r5 == 130 && this.s == 1) ? 1 : Integer.MIN_VALUE : this.s == 0 ? 1 : Integer.MIN_VALUE : this.s == 1 ? -1 : Integer.MIN_VALUE : this.s == 0 ? -1 : Integer.MIN_VALUE : (this.s != 1 && U2()) ? -1 : 1 : (this.s != 1 && U2()) ? 1 : -1;
    }

    c q2() {
        return new c();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public void r(int r2, int r3, RecyclerView.c0 c0Var, RecyclerView.o.c cVar) {
        if (this.s != 0) {
            r2 = r3;
        }
        if (Q() == 0 || r2 == 0) {
            return;
        }
        r2();
        r3(r2 > 0 ? 1 : -1, Math.abs(r2), true, c0Var);
        l2(c0Var, this.t, cVar);
    }

    void r2() {
        if (this.t == null) {
            this.t = q2();
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public void s(int r6, RecyclerView.o.c cVar) {
        boolean z;
        int r0;
        d dVar = this.D;
        if (dVar == null || !dVar.a()) {
            f3();
            z = this.x;
            r0 = this.A;
            if (r0 == -1) {
                r0 = z ? r6 - 1 : 0;
            }
        } else {
            d dVar2 = this.D;
            z = dVar2.f;
            r0 = dVar2.d;
        }
        int r1 = z ? -1 : 1;
        for (int r3 = 0; r3 < this.G && r0 >= 0 && r0 < r6; r3++) {
            cVar.a(r0, 0);
            r0 += r1;
        }
    }

    int s2(RecyclerView.w wVar, c cVar, RecyclerView.c0 c0Var, boolean z) {
        int r0 = cVar.f548c;
        int r1 = cVar.g;
        if (r1 != Integer.MIN_VALUE) {
            if (r0 < 0) {
                cVar.g = r1 + r0;
            }
            a3(wVar, cVar);
        }
        int r12 = cVar.f548c + cVar.h;
        b bVar = this.F;
        while (true) {
            if ((!cVar.m && r12 <= 0) || !cVar.c(c0Var)) {
                break;
            }
            bVar.a();
            W2(wVar, c0Var, cVar, bVar);
            if (!bVar.f544b) {
                cVar.f547b += bVar.f543a * cVar.f;
                if (!bVar.f545c || cVar.l != null || !c0Var.j()) {
                    int r4 = cVar.f548c;
                    int r5 = bVar.f543a;
                    cVar.f548c = r4 - r5;
                    r12 -= r5;
                }
                int r42 = cVar.g;
                if (r42 != Integer.MIN_VALUE) {
                    int r43 = r42 + bVar.f543a;
                    cVar.g = r43;
                    int r52 = cVar.f548c;
                    if (r52 < 0) {
                        cVar.g = r43 + r52;
                    }
                    a3(wVar, cVar);
                }
                if (z && bVar.d) {
                    break;
                }
            } else {
                break;
            }
        }
        return r0 - cVar.f548c;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public int t(RecyclerView.c0 c0Var) {
        return m2(c0Var);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public void t1(Parcelable parcelable) {
        if (parcelable instanceof d) {
            this.D = (d) parcelable;
            N1();
        }
    }

    public int t2() {
        View viewE2 = E2(0, Q(), true, false);
        if (viewE2 == null) {
            return -1;
        }
        return s0(viewE2);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public int u(RecyclerView.c0 c0Var) {
        return n2(c0Var);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public Parcelable u1() {
        if (this.D != null) {
            return new d(this.D);
        }
        d dVar = new d();
        if (Q() > 0) {
            r2();
            boolean z = this.v ^ this.x;
            dVar.f = z;
            if (z) {
                View viewM2 = M2();
                dVar.e = this.u.i() - this.u.d(viewM2);
                dVar.d = s0(viewM2);
            } else {
                View viewN2 = N2();
                dVar.d = s0(viewN2);
                dVar.e = this.u.g(viewN2) - this.u.n();
            }
        } else {
            dVar.b();
        }
        return dVar;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public int v(RecyclerView.c0 c0Var) {
        return o2(c0Var);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public int w(RecyclerView.c0 c0Var) {
        return m2(c0Var);
    }

    View w2(boolean z, boolean z2) {
        int r0;
        int r1;
        if (this.x) {
            r0 = 0;
            r1 = Q();
        } else {
            r0 = Q() - 1;
            r1 = -1;
        }
        return E2(r0, r1, z, z2);
    }

    void w3() {
        Log.d(I, "validating child count " + Q());
        if (Q() < 1) {
            return;
        }
        int r2 = s0(P(0));
        int r3 = this.u.g(P(0));
        if (this.x) {
            for (int r4 = 1; r4 < Q(); r4++) {
                View viewP = P(r4);
                int r8 = s0(viewP);
                int r7 = this.u.g(viewP);
                if (r8 < r2) {
                    Y2();
                    StringBuilder sb = new StringBuilder();
                    sb.append("detected invalid position. loc invalid? ");
                    sb.append(r7 < r3);
                    throw new RuntimeException(sb.toString());
                }
                if (r7 > r3) {
                    Y2();
                    throw new RuntimeException("detected invalid location");
                }
            }
            return;
        }
        for (int r42 = 1; r42 < Q(); r42++) {
            View viewP2 = P(r42);
            int r82 = s0(viewP2);
            int r72 = this.u.g(viewP2);
            if (r82 < r2) {
                Y2();
                StringBuilder sb2 = new StringBuilder();
                sb2.append("detected invalid position. loc invalid? ");
                sb2.append(r72 < r3);
                throw new RuntimeException(sb2.toString());
            }
            if (r72 < r3) {
                Y2();
                throw new RuntimeException("detected invalid location");
            }
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public int x(RecyclerView.c0 c0Var) {
        return n2(c0Var);
    }

    View x2(boolean z, boolean z2) {
        int r0;
        int r1;
        if (this.x) {
            r0 = Q() - 1;
            r1 = -1;
        } else {
            r0 = 0;
            r1 = Q();
        }
        return E2(r0, r1, z, z2);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public int y(RecyclerView.c0 c0Var) {
        return o2(c0Var);
    }

    public int y2() {
        View viewE2 = E2(0, Q(), false, true);
        if (viewE2 == null) {
            return -1;
        }
        return s0(viewE2);
    }

    public int z2() {
        View viewE2 = E2(Q() - 1, -1, true, false);
        if (viewE2 == null) {
            return -1;
        }
        return s0(viewE2);
    }
}

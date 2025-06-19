package b.w;

import android.animation.TimeInterpolator;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.util.AndroidRuntimeException;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.p0;
import b.w.g0;
import java.util.ArrayList;
import java.util.Iterator;

/* loaded from: classes.dex */
public class l0 extends g0 {
    private static final int e0 = 1;
    private static final int f0 = 2;
    private static final int g0 = 4;
    private static final int h0 = 8;
    public static final int i0 = 0;
    public static final int j0 = 1;
    private ArrayList<g0> Z;
    private boolean a0;
    int b0;
    boolean c0;
    private int d0;

    class a extends i0 {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ g0 f1473a;

        a(g0 g0Var) {
            this.f1473a = g0Var;
        }

        @Override // b.w.i0, b.w.g0.h
        public void e(@androidx.annotation.h0 g0 g0Var) {
            this.f1473a.z0();
            g0Var.s0(this);
        }
    }

    static class b extends i0 {

        /* renamed from: a, reason: collision with root package name */
        l0 f1475a;

        b(l0 l0Var) {
            this.f1475a = l0Var;
        }

        @Override // b.w.i0, b.w.g0.h
        public void a(@androidx.annotation.h0 g0 g0Var) {
            l0 l0Var = this.f1475a;
            if (l0Var.c0) {
                return;
            }
            l0Var.J0();
            this.f1475a.c0 = true;
        }

        @Override // b.w.i0, b.w.g0.h
        public void e(@androidx.annotation.h0 g0 g0Var) {
            l0 l0Var = this.f1475a;
            int r1 = l0Var.b0 - 1;
            l0Var.b0 = r1;
            if (r1 == 0) {
                l0Var.c0 = false;
                l0Var.w();
            }
            g0Var.s0(this);
        }
    }

    public l0() {
        this.Z = new ArrayList<>();
        this.a0 = true;
        this.c0 = false;
        this.d0 = 0;
    }

    @SuppressLint({"RestrictedApi"})
    public l0(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.Z = new ArrayList<>();
        this.a0 = true;
        this.c0 = false;
        this.d0 = 0;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, f0.i);
        d1(b.i.c.j.h.k(typedArrayObtainStyledAttributes, (XmlResourceParser) attributeSet, "transitionOrdering", 0, 0));
        typedArrayObtainStyledAttributes.recycle();
    }

    private void R0(@androidx.annotation.h0 g0 g0Var) {
        this.Z.add(g0Var);
        g0Var.u = this;
    }

    private void g1() {
        b bVar = new b(this);
        Iterator<g0> it = this.Z.iterator();
        while (it.hasNext()) {
            it.next().b(bVar);
        }
        this.b0 = this.Z.size();
    }

    @Override // b.w.g0
    void A0(boolean z) {
        super.A0(z);
        int size = this.Z.size();
        for (int r1 = 0; r1 < size; r1++) {
            this.Z.get(r1).A0(z);
        }
    }

    @Override // b.w.g0
    public void C0(g0.f fVar) {
        super.C0(fVar);
        this.d0 |= 8;
        int size = this.Z.size();
        for (int r1 = 0; r1 < size; r1++) {
            this.Z.get(r1).C0(fVar);
        }
    }

    @Override // b.w.g0
    @androidx.annotation.h0
    public g0 F(int r3, boolean z) {
        for (int r0 = 0; r0 < this.Z.size(); r0++) {
            this.Z.get(r0).F(r3, z);
        }
        return super.F(r3, z);
    }

    @Override // b.w.g0
    public void F0(w wVar) {
        super.F0(wVar);
        this.d0 |= 4;
        if (this.Z != null) {
            for (int r0 = 0; r0 < this.Z.size(); r0++) {
                this.Z.get(r0).F0(wVar);
            }
        }
    }

    @Override // b.w.g0
    @androidx.annotation.h0
    public g0 G(@androidx.annotation.h0 View view, boolean z) {
        for (int r0 = 0; r0 < this.Z.size(); r0++) {
            this.Z.get(r0).G(view, z);
        }
        return super.G(view, z);
    }

    @Override // b.w.g0
    public void G0(k0 k0Var) {
        super.G0(k0Var);
        this.d0 |= 2;
        int size = this.Z.size();
        for (int r1 = 0; r1 < size; r1++) {
            this.Z.get(r1).G0(k0Var);
        }
    }

    @Override // b.w.g0
    @androidx.annotation.h0
    public g0 J(@androidx.annotation.h0 Class<?> cls, boolean z) {
        for (int r0 = 0; r0 < this.Z.size(); r0++) {
            this.Z.get(r0).J(cls, z);
        }
        return super.J(cls, z);
    }

    @Override // b.w.g0
    @androidx.annotation.h0
    public g0 K(@androidx.annotation.h0 String str, boolean z) {
        for (int r0 = 0; r0 < this.Z.size(); r0++) {
            this.Z.get(r0).K(str, z);
        }
        return super.K(str, z);
    }

    @Override // b.w.g0
    String K0(String str) {
        String strK0 = super.K0(str);
        for (int r1 = 0; r1 < this.Z.size(); r1++) {
            StringBuilder sb = new StringBuilder();
            sb.append(strK0);
            sb.append("\n");
            sb.append(this.Z.get(r1).K0(str + "  "));
            strK0 = sb.toString();
        }
        return strK0;
    }

    @Override // b.w.g0
    @androidx.annotation.h0
    /* renamed from: L0, reason: merged with bridge method [inline-methods] */
    public l0 b(@androidx.annotation.h0 g0.h hVar) {
        return (l0) super.b(hVar);
    }

    @Override // b.w.g0
    @androidx.annotation.h0
    /* renamed from: M0, reason: merged with bridge method [inline-methods] */
    public l0 c(@androidx.annotation.w int r3) {
        for (int r0 = 0; r0 < this.Z.size(); r0++) {
            this.Z.get(r0).c(r3);
        }
        return (l0) super.c(r3);
    }

    @Override // b.w.g0
    @androidx.annotation.p0({p0.a.LIBRARY_GROUP_PREFIX})
    void N(ViewGroup viewGroup) {
        super.N(viewGroup);
        int size = this.Z.size();
        for (int r1 = 0; r1 < size; r1++) {
            this.Z.get(r1).N(viewGroup);
        }
    }

    @Override // b.w.g0
    @androidx.annotation.h0
    /* renamed from: N0, reason: merged with bridge method [inline-methods] */
    public l0 d(@androidx.annotation.h0 View view) {
        for (int r0 = 0; r0 < this.Z.size(); r0++) {
            this.Z.get(r0).d(view);
        }
        return (l0) super.d(view);
    }

    @Override // b.w.g0
    @androidx.annotation.h0
    /* renamed from: O0, reason: merged with bridge method [inline-methods] */
    public l0 e(@androidx.annotation.h0 Class<?> cls) {
        for (int r0 = 0; r0 < this.Z.size(); r0++) {
            this.Z.get(r0).e(cls);
        }
        return (l0) super.e(cls);
    }

    @Override // b.w.g0
    @androidx.annotation.h0
    /* renamed from: P0, reason: merged with bridge method [inline-methods] */
    public l0 f(@androidx.annotation.h0 String str) {
        for (int r0 = 0; r0 < this.Z.size(); r0++) {
            this.Z.get(r0).f(str);
        }
        return (l0) super.f(str);
    }

    @androidx.annotation.h0
    public l0 Q0(@androidx.annotation.h0 g0 g0Var) {
        R0(g0Var);
        long j = this.f;
        if (j >= 0) {
            g0Var.B0(j);
        }
        if ((this.d0 & 1) != 0) {
            g0Var.D0(S());
        }
        if ((this.d0 & 2) != 0) {
            g0Var.G0(X());
        }
        if ((this.d0 & 4) != 0) {
            g0Var.F0(W());
        }
        if ((this.d0 & 8) != 0) {
            g0Var.C0(R());
        }
        return this;
    }

    public int S0() {
        return !this.a0 ? 1 : 0;
    }

    @androidx.annotation.i0
    public g0 T0(int r2) {
        if (r2 < 0 || r2 >= this.Z.size()) {
            return null;
        }
        return this.Z.get(r2);
    }

    public int U0() {
        return this.Z.size();
    }

    @Override // b.w.g0
    @androidx.annotation.h0
    /* renamed from: V0, reason: merged with bridge method [inline-methods] */
    public l0 s0(@androidx.annotation.h0 g0.h hVar) {
        return (l0) super.s0(hVar);
    }

    @Override // b.w.g0
    @androidx.annotation.h0
    /* renamed from: W0, reason: merged with bridge method [inline-methods] */
    public l0 t0(@androidx.annotation.w int r3) {
        for (int r0 = 0; r0 < this.Z.size(); r0++) {
            this.Z.get(r0).t0(r3);
        }
        return (l0) super.t0(r3);
    }

    @Override // b.w.g0
    @androidx.annotation.h0
    /* renamed from: X0, reason: merged with bridge method [inline-methods] */
    public l0 u0(@androidx.annotation.h0 View view) {
        for (int r0 = 0; r0 < this.Z.size(); r0++) {
            this.Z.get(r0).u0(view);
        }
        return (l0) super.u0(view);
    }

    @Override // b.w.g0
    @androidx.annotation.h0
    /* renamed from: Y0, reason: merged with bridge method [inline-methods] */
    public l0 v0(@androidx.annotation.h0 Class<?> cls) {
        for (int r0 = 0; r0 < this.Z.size(); r0++) {
            this.Z.get(r0).v0(cls);
        }
        return (l0) super.v0(cls);
    }

    @Override // b.w.g0
    @androidx.annotation.h0
    /* renamed from: Z0, reason: merged with bridge method [inline-methods] */
    public l0 w0(@androidx.annotation.h0 String str) {
        for (int r0 = 0; r0 < this.Z.size(); r0++) {
            this.Z.get(r0).w0(str);
        }
        return (l0) super.w0(str);
    }

    @androidx.annotation.h0
    public l0 a1(@androidx.annotation.h0 g0 g0Var) {
        this.Z.remove(g0Var);
        g0Var.u = null;
        return this;
    }

    @Override // b.w.g0
    @androidx.annotation.h0
    /* renamed from: b1, reason: merged with bridge method [inline-methods] */
    public l0 B0(long j) {
        ArrayList<g0> arrayList;
        super.B0(j);
        if (this.f >= 0 && (arrayList = this.Z) != null) {
            int size = arrayList.size();
            for (int r1 = 0; r1 < size; r1++) {
                this.Z.get(r1).B0(j);
            }
        }
        return this;
    }

    @Override // b.w.g0
    @androidx.annotation.h0
    /* renamed from: c1, reason: merged with bridge method [inline-methods] */
    public l0 D0(@androidx.annotation.i0 TimeInterpolator timeInterpolator) {
        this.d0 |= 1;
        ArrayList<g0> arrayList = this.Z;
        if (arrayList != null) {
            int size = arrayList.size();
            for (int r1 = 0; r1 < size; r1++) {
                this.Z.get(r1).D0(timeInterpolator);
            }
        }
        return (l0) super.D0(timeInterpolator);
    }

    @androidx.annotation.h0
    public l0 d1(int r4) {
        if (r4 == 0) {
            this.a0 = true;
        } else {
            if (r4 != 1) {
                throw new AndroidRuntimeException("Invalid parameter for TransitionSet ordering: " + r4);
            }
            this.a0 = false;
        }
        return this;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // b.w.g0
    /* renamed from: e1, reason: merged with bridge method [inline-methods] */
    public l0 H0(ViewGroup viewGroup) {
        super.H0(viewGroup);
        int size = this.Z.size();
        for (int r1 = 0; r1 < size; r1++) {
            this.Z.get(r1).H0(viewGroup);
        }
        return this;
    }

    @Override // b.w.g0
    @androidx.annotation.h0
    /* renamed from: f1, reason: merged with bridge method [inline-methods] */
    public l0 I0(long j) {
        return (l0) super.I0(j);
    }

    @Override // b.w.g0
    @androidx.annotation.p0({p0.a.LIBRARY_GROUP_PREFIX})
    protected void m() {
        super.m();
        int size = this.Z.size();
        for (int r1 = 0; r1 < size; r1++) {
            this.Z.get(r1).m();
        }
    }

    @Override // b.w.g0
    public void n(@androidx.annotation.h0 n0 n0Var) {
        if (i0(n0Var.f1494b)) {
            Iterator<g0> it = this.Z.iterator();
            while (it.hasNext()) {
                g0 next = it.next();
                if (next.i0(n0Var.f1494b)) {
                    next.n(n0Var);
                    n0Var.f1495c.add(next);
                }
            }
        }
    }

    @Override // b.w.g0
    void p(n0 n0Var) {
        super.p(n0Var);
        int size = this.Z.size();
        for (int r1 = 0; r1 < size; r1++) {
            this.Z.get(r1).p(n0Var);
        }
    }

    @Override // b.w.g0
    public void q(@androidx.annotation.h0 n0 n0Var) {
        if (i0(n0Var.f1494b)) {
            Iterator<g0> it = this.Z.iterator();
            while (it.hasNext()) {
                g0 next = it.next();
                if (next.i0(n0Var.f1494b)) {
                    next.q(n0Var);
                    n0Var.f1495c.add(next);
                }
            }
        }
    }

    @Override // b.w.g0
    @androidx.annotation.p0({p0.a.LIBRARY_GROUP_PREFIX})
    public void q0(View view) {
        super.q0(view);
        int size = this.Z.size();
        for (int r1 = 0; r1 < size; r1++) {
            this.Z.get(r1).q0(view);
        }
    }

    @Override // b.w.g0
    /* renamed from: t */
    public g0 clone() {
        l0 l0Var = (l0) super.clone();
        l0Var.Z = new ArrayList<>();
        int size = this.Z.size();
        for (int r2 = 0; r2 < size; r2++) {
            l0Var.R0(this.Z.get(r2).clone());
        }
        return l0Var;
    }

    @Override // b.w.g0
    @androidx.annotation.p0({p0.a.LIBRARY_GROUP_PREFIX})
    protected void v(ViewGroup viewGroup, o0 o0Var, o0 o0Var2, ArrayList<n0> arrayList, ArrayList<n0> arrayList2) {
        long jZ = Z();
        int size = this.Z.size();
        for (int r4 = 0; r4 < size; r4++) {
            g0 g0Var = this.Z.get(r4);
            if (jZ > 0 && (this.a0 || r4 == 0)) {
                long jZ2 = g0Var.Z();
                if (jZ2 > 0) {
                    g0Var.I0(jZ2 + jZ);
                } else {
                    g0Var.I0(jZ);
                }
            }
            g0Var.v(viewGroup, o0Var, o0Var2, arrayList, arrayList2);
        }
    }

    @Override // b.w.g0
    @androidx.annotation.p0({p0.a.LIBRARY_GROUP_PREFIX})
    public void x0(View view) {
        super.x0(view);
        int size = this.Z.size();
        for (int r1 = 0; r1 < size; r1++) {
            this.Z.get(r1).x0(view);
        }
    }

    @Override // b.w.g0
    @androidx.annotation.p0({p0.a.LIBRARY_GROUP_PREFIX})
    protected void z0() {
        if (this.Z.isEmpty()) {
            J0();
            w();
            return;
        }
        g1();
        if (this.a0) {
            Iterator<g0> it = this.Z.iterator();
            while (it.hasNext()) {
                it.next().z0();
            }
            return;
        }
        for (int r0 = 1; r0 < this.Z.size(); r0++) {
            this.Z.get(r0 - 1).b(new a(this.Z.get(r0)));
        }
        g0 g0Var = this.Z.get(0);
        if (g0Var != null) {
            g0Var.z0();
        }
    }
}

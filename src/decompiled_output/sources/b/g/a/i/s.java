package b.g.a.i;

import androidx.appcompat.widget.ActivityChooserView;
import java.util.ArrayList;

/* loaded from: classes.dex */
public class s extends h {
    protected ArrayList<h> c1;

    public s() {
        this.c1 = new ArrayList<>();
    }

    public s(int r1, int r2) {
        super(r1, r2);
        this.c1 = new ArrayList<>();
    }

    public s(int r1, int r2, int r3, int r4) {
        super(r1, r2, r3, r4);
        this.c1 = new ArrayList<>();
    }

    public static n T1(ArrayList<h> arrayList) {
        n nVar = new n();
        if (arrayList.size() == 0) {
            return nVar;
        }
        int size = arrayList.size();
        int r2 = ActivityChooserView.f.j;
        int r3 = ActivityChooserView.f.j;
        int r5 = 0;
        int r6 = 0;
        for (int r4 = 0; r4 < size; r4++) {
            h hVar = arrayList.get(r4);
            if (hVar.s0() < r2) {
                r2 = hVar.s0();
            }
            if (hVar.t0() < r3) {
                r3 = hVar.t0();
            }
            if (hVar.e0() > r5) {
                r5 = hVar.e0();
            }
            if (hVar.w() > r6) {
                r6 = hVar.w();
            }
        }
        nVar.f(r2, r3, r5 - r2, r6 - r3);
        return nVar;
    }

    @Override // b.g.a.i.h
    public void I0() {
        this.c1.clear();
        super.I0();
    }

    @Override // b.g.a.i.h
    public void M1() {
        super.M1();
        ArrayList<h> arrayList = this.c1;
        if (arrayList == null) {
            return;
        }
        int size = arrayList.size();
        for (int r1 = 0; r1 < size; r1++) {
            h hVar = this.c1.get(r1);
            hVar.t1(H(), I());
            if (!(hVar instanceof i)) {
                hVar.M1();
            }
        }
    }

    @Override // b.g.a.i.h
    public void O0(b.g.a.c cVar) {
        super.O0(cVar);
        int size = this.c1.size();
        for (int r1 = 0; r1 < size; r1++) {
            this.c1.get(r1).O0(cVar);
        }
    }

    public void P1(h hVar) {
        this.c1.add(hVar);
        if (hVar.a0() != null) {
            ((s) hVar.a0()).X1(hVar);
        }
        hVar.v1(this);
    }

    public void Q1(h... hVarArr) {
        for (h hVar : hVarArr) {
            P1(hVar);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:27:0x006d A[PHI: r3
  0x006d: PHI (r3v5 b.g.a.i.s) = (r3v8 b.g.a.i.s), (r3v9 b.g.a.i.s) binds: [B:26:0x006b, B:17:0x0044] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Type inference failed for: r3v4, types: [b.g.a.i.h] */
    /* JADX WARN: Type inference failed for: r3v7, types: [b.g.a.i.h] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public b.g.a.i.h R1(float r9, float r10) {
        /*
            r8 = this;
            int r0 = r8.H()
            int r1 = r8.I()
            int r2 = r8.p0()
            int r2 = r2 + r0
            int r3 = r8.J()
            int r3 = r3 + r1
            float r0 = (float) r0
            int r0 = (r9 > r0 ? 1 : (r9 == r0 ? 0 : -1))
            if (r0 < 0) goto L28
            float r0 = (float) r2
            int r0 = (r9 > r0 ? 1 : (r9 == r0 ? 0 : -1))
            if (r0 > 0) goto L28
            float r0 = (float) r1
            int r0 = (r10 > r0 ? 1 : (r10 == r0 ? 0 : -1))
            if (r0 < 0) goto L28
            float r0 = (float) r3
            int r0 = (r10 > r0 ? 1 : (r10 == r0 ? 0 : -1))
            if (r0 > 0) goto L28
            r0 = r8
            goto L29
        L28:
            r0 = 0
        L29:
            r1 = 0
            java.util.ArrayList<b.g.a.i.h> r2 = r8.c1
            int r2 = r2.size()
        L30:
            if (r1 >= r2) goto L71
            java.util.ArrayList<b.g.a.i.h> r3 = r8.c1
            java.lang.Object r3 = r3.get(r1)
            b.g.a.i.h r3 = (b.g.a.i.h) r3
            boolean r4 = r3 instanceof b.g.a.i.s
            if (r4 == 0) goto L47
            b.g.a.i.s r3 = (b.g.a.i.s) r3
            b.g.a.i.h r3 = r3.R1(r9, r10)
            if (r3 == 0) goto L6e
            goto L6d
        L47:
            int r4 = r3.H()
            int r5 = r3.I()
            int r6 = r3.p0()
            int r6 = r6 + r4
            int r7 = r3.J()
            int r7 = r7 + r5
            float r4 = (float) r4
            int r4 = (r9 > r4 ? 1 : (r9 == r4 ? 0 : -1))
            if (r4 < 0) goto L6e
            float r4 = (float) r6
            int r4 = (r9 > r4 ? 1 : (r9 == r4 ? 0 : -1))
            if (r4 > 0) goto L6e
            float r4 = (float) r5
            int r4 = (r10 > r4 ? 1 : (r10 == r4 ? 0 : -1))
            if (r4 < 0) goto L6e
            float r4 = (float) r7
            int r4 = (r10 > r4 ? 1 : (r10 == r4 ? 0 : -1))
            if (r4 > 0) goto L6e
        L6d:
            r0 = r3
        L6e:
            int r1 = r1 + 1
            goto L30
        L71:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: b.g.a.i.s.R1(float, float):b.g.a.i.h");
    }

    public ArrayList<h> S1(int r7, int r8, int r9, int r10) {
        ArrayList<h> arrayList = new ArrayList<>();
        n nVar = new n();
        nVar.f(r7, r8, r9, r10);
        int size = this.c1.size();
        for (int r82 = 0; r82 < size; r82++) {
            h hVar = this.c1.get(r82);
            n nVar2 = new n();
            nVar2.f(hVar.H(), hVar.I(), hVar.p0(), hVar.J());
            if (nVar.e(nVar2)) {
                arrayList.add(hVar);
            }
        }
        return arrayList;
    }

    public ArrayList<h> U1() {
        return this.c1;
    }

    public i V1() {
        h hVarA0 = a0();
        i iVar = this instanceof i ? (i) this : null;
        while (hVarA0 != null) {
            h hVarA02 = hVarA0.a0();
            if (hVarA0 instanceof i) {
                iVar = (i) hVarA0;
            }
            hVarA0 = hVarA02;
        }
        return iVar;
    }

    public void W1() {
        M1();
        ArrayList<h> arrayList = this.c1;
        if (arrayList == null) {
            return;
        }
        int size = arrayList.size();
        for (int r1 = 0; r1 < size; r1++) {
            h hVar = this.c1.get(r1);
            if (hVar instanceof s) {
                ((s) hVar).W1();
            }
        }
    }

    public void X1(h hVar) {
        this.c1.remove(hVar);
        hVar.v1(null);
    }

    public void Y1() {
        this.c1.clear();
    }

    @Override // b.g.a.i.h
    public void t1(int r4, int r5) {
        super.t1(r4, r5);
        int size = this.c1.size();
        for (int r52 = 0; r52 < size; r52++) {
            this.c1.get(r52).t1(g0(), h0());
        }
    }
}

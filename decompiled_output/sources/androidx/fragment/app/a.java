package androidx.fragment.app;

import android.util.Log;
import androidx.annotation.h0;
import androidx.annotation.i0;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.i;
import androidx.fragment.app.j;
import androidx.fragment.app.r;
import androidx.lifecycle.g;
import java.io.PrintWriter;
import java.util.ArrayList;

/* loaded from: classes.dex */
final class a extends r implements i.a, j.k {
    static final String N = "FragmentManager";
    final j K;
    boolean L;
    int M = -1;

    public a(j jVar) {
        this.K = jVar;
    }

    private static boolean Y(r.a aVar) {
        Fragment fragment = aVar.f466b;
        return (fragment == null || !fragment.n || fragment.J == null || fragment.C || fragment.B || !fragment.m0()) ? false : true;
    }

    @Override // androidx.fragment.app.r
    @h0
    public r I(@h0 Fragment fragment, @h0 g.b bVar) {
        if (fragment.u != this.K) {
            throw new IllegalArgumentException("Cannot setMaxLifecycle for Fragment not attached to FragmentManager " + this.K);
        }
        if (bVar.e(g.b.CREATED)) {
            return super.I(fragment, bVar);
        }
        throw new IllegalArgumentException("Cannot set maximum Lifecycle below " + g.b.CREATED);
    }

    @Override // androidx.fragment.app.i.a
    public int J() {
        return this.M;
    }

    @Override // androidx.fragment.app.r
    @h0
    public r K(@i0 Fragment fragment) {
        j jVar;
        if (fragment == null || (jVar = fragment.u) == null || jVar == this.K) {
            return super.K(fragment);
        }
        throw new IllegalStateException("Cannot setPrimaryNavigation for Fragment attached to a different FragmentManager. Fragment " + fragment.toString() + " is already attached to a FragmentManager.");
    }

    @Override // androidx.fragment.app.r
    @h0
    public r O(@h0 Fragment fragment) {
        j jVar = fragment.u;
        if (jVar == null || jVar == this.K) {
            return super.O(fragment);
        }
        throw new IllegalStateException("Cannot show Fragment attached to a different FragmentManager. Fragment " + fragment.toString() + " is already attached to a FragmentManager.");
    }

    void P(int r7) {
        if (this.h) {
            if (j.L) {
                Log.v(N, "Bump nesting in " + this + " by " + r7);
            }
            int size = this.f462a.size();
            for (int r2 = 0; r2 < size; r2++) {
                r.a aVar = this.f462a.get(r2);
                Fragment fragment = aVar.f466b;
                if (fragment != null) {
                    fragment.t += r7;
                    if (j.L) {
                        Log.v(N, "Bump nesting of " + aVar.f466b + " to " + aVar.f466b.t);
                    }
                }
            }
        }
    }

    int Q(boolean z) {
        if (this.L) {
            throw new IllegalStateException("commit already called");
        }
        if (j.L) {
            Log.v(N, "Commit: " + this);
            PrintWriter printWriter = new PrintWriter(new b.i.o.d(N));
            R("  ", printWriter);
            printWriter.close();
        }
        this.L = true;
        this.M = this.h ? this.K.G(this) : -1;
        this.K.B0(this, z);
        return this.M;
    }

    public void R(String str, PrintWriter printWriter) {
        S(str, printWriter, true);
    }

    public void S(String str, PrintWriter printWriter, boolean z) {
        String str2;
        if (z) {
            printWriter.print(str);
            printWriter.print("mName=");
            printWriter.print(this.j);
            printWriter.print(" mIndex=");
            printWriter.print(this.M);
            printWriter.print(" mCommitted=");
            printWriter.println(this.L);
            if (this.f != 0) {
                printWriter.print(str);
                printWriter.print("mTransition=#");
                printWriter.print(Integer.toHexString(this.f));
                printWriter.print(" mTransitionStyle=#");
                printWriter.println(Integer.toHexString(this.g));
            }
            if (this.f463b != 0 || this.f464c != 0) {
                printWriter.print(str);
                printWriter.print("mEnterAnim=#");
                printWriter.print(Integer.toHexString(this.f463b));
                printWriter.print(" mExitAnim=#");
                printWriter.println(Integer.toHexString(this.f464c));
            }
            if (this.d != 0 || this.e != 0) {
                printWriter.print(str);
                printWriter.print("mPopEnterAnim=#");
                printWriter.print(Integer.toHexString(this.d));
                printWriter.print(" mPopExitAnim=#");
                printWriter.println(Integer.toHexString(this.e));
            }
            if (this.k != 0 || this.l != null) {
                printWriter.print(str);
                printWriter.print("mBreadCrumbTitleRes=#");
                printWriter.print(Integer.toHexString(this.k));
                printWriter.print(" mBreadCrumbTitleText=");
                printWriter.println(this.l);
            }
            if (this.m != 0 || this.n != null) {
                printWriter.print(str);
                printWriter.print("mBreadCrumbShortTitleRes=#");
                printWriter.print(Integer.toHexString(this.m));
                printWriter.print(" mBreadCrumbShortTitleText=");
                printWriter.println(this.n);
            }
        }
        if (this.f462a.isEmpty()) {
            return;
        }
        printWriter.print(str);
        printWriter.println("Operations:");
        int size = this.f462a.size();
        for (int r1 = 0; r1 < size; r1++) {
            r.a aVar = this.f462a.get(r1);
            switch (aVar.f465a) {
                case 0:
                    str2 = "NULL";
                    break;
                case 1:
                    str2 = "ADD";
                    break;
                case 2:
                    str2 = "REPLACE";
                    break;
                case 3:
                    str2 = "REMOVE";
                    break;
                case 4:
                    str2 = "HIDE";
                    break;
                case 5:
                    str2 = "SHOW";
                    break;
                case 6:
                    str2 = "DETACH";
                    break;
                case 7:
                    str2 = "ATTACH";
                    break;
                case 8:
                    str2 = "SET_PRIMARY_NAV";
                    break;
                case 9:
                    str2 = "UNSET_PRIMARY_NAV";
                    break;
                case 10:
                    str2 = "OP_SET_MAX_LIFECYCLE";
                    break;
                default:
                    str2 = "cmd=" + aVar.f465a;
                    break;
            }
            printWriter.print(str);
            printWriter.print("  Op #");
            printWriter.print(r1);
            printWriter.print(": ");
            printWriter.print(str2);
            printWriter.print(" ");
            printWriter.println(aVar.f466b);
            if (z) {
                if (aVar.f467c != 0 || aVar.d != 0) {
                    printWriter.print(str);
                    printWriter.print("enterAnim=#");
                    printWriter.print(Integer.toHexString(aVar.f467c));
                    printWriter.print(" exitAnim=#");
                    printWriter.println(Integer.toHexString(aVar.d));
                }
                if (aVar.e != 0 || aVar.f != 0) {
                    printWriter.print(str);
                    printWriter.print("popEnterAnim=#");
                    printWriter.print(Integer.toHexString(aVar.e));
                    printWriter.print(" popExitAnim=#");
                    printWriter.println(Integer.toHexString(aVar.f));
                }
            }
        }
    }

    void T() {
        int size = this.f462a.size();
        for (int r2 = 0; r2 < size; r2++) {
            r.a aVar = this.f462a.get(r2);
            Fragment fragment = aVar.f466b;
            if (fragment != null) {
                fragment.X1(this.f, this.g);
            }
            switch (aVar.f465a) {
                case 1:
                    fragment.W1(aVar.f467c);
                    this.K.E(fragment, false);
                    break;
                case 2:
                default:
                    throw new IllegalArgumentException("Unknown cmd: " + aVar.f465a);
                case 3:
                    fragment.W1(aVar.d);
                    this.K.n1(fragment);
                    break;
                case 4:
                    fragment.W1(aVar.d);
                    this.K.U0(fragment);
                    break;
                case 5:
                    fragment.W1(aVar.f467c);
                    this.K.C1(fragment);
                    break;
                case 6:
                    fragment.W1(aVar.d);
                    this.K.Q(fragment);
                    break;
                case 7:
                    fragment.W1(aVar.f467c);
                    this.K.J(fragment);
                    break;
                case 8:
                    this.K.B1(fragment);
                    break;
                case 9:
                    this.K.B1(null);
                    break;
                case 10:
                    this.K.A1(fragment, aVar.h);
                    break;
            }
            if (!this.q && aVar.f465a != 1 && fragment != null) {
                this.K.e1(fragment);
            }
        }
        if (this.q) {
            return;
        }
        j jVar = this.K;
        jVar.f1(jVar.t, true);
    }

    void U(boolean z) {
        for (int size = this.f462a.size() - 1; size >= 0; size--) {
            r.a aVar = this.f462a.get(size);
            Fragment fragment = aVar.f466b;
            if (fragment != null) {
                fragment.X1(j.u1(this.f), this.g);
            }
            switch (aVar.f465a) {
                case 1:
                    fragment.W1(aVar.f);
                    this.K.n1(fragment);
                    break;
                case 2:
                default:
                    throw new IllegalArgumentException("Unknown cmd: " + aVar.f465a);
                case 3:
                    fragment.W1(aVar.e);
                    this.K.E(fragment, false);
                    break;
                case 4:
                    fragment.W1(aVar.e);
                    this.K.C1(fragment);
                    break;
                case 5:
                    fragment.W1(aVar.f);
                    this.K.U0(fragment);
                    break;
                case 6:
                    fragment.W1(aVar.e);
                    this.K.J(fragment);
                    break;
                case 7:
                    fragment.W1(aVar.f);
                    this.K.Q(fragment);
                    break;
                case 8:
                    this.K.B1(null);
                    break;
                case 9:
                    this.K.B1(fragment);
                    break;
                case 10:
                    this.K.A1(fragment, aVar.g);
                    break;
            }
            if (!this.q && aVar.f465a != 3 && fragment != null) {
                this.K.e1(fragment);
            }
        }
        if (this.q || !z) {
            return;
        }
        j jVar = this.K;
        jVar.f1(jVar.t, true);
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x00b2  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    androidx.fragment.app.Fragment V(java.util.ArrayList<androidx.fragment.app.Fragment> r17, androidx.fragment.app.Fragment r18) {
        /*
            r16 = this;
            r0 = r16
            r1 = r17
            r3 = r18
            r4 = 0
        L7:
            java.util.ArrayList<androidx.fragment.app.r$a> r5 = r0.f462a
            int r5 = r5.size()
            if (r4 >= r5) goto Lba
            java.util.ArrayList<androidx.fragment.app.r$a> r5 = r0.f462a
            java.lang.Object r5 = r5.get(r4)
            androidx.fragment.app.r$a r5 = (androidx.fragment.app.r.a) r5
            int r6 = r5.f465a
            r7 = 0
            r8 = 1
            if (r6 == r8) goto Lb2
            r9 = 2
            r10 = 3
            r11 = 9
            if (r6 == r9) goto L58
            if (r6 == r10) goto L41
            r9 = 6
            if (r6 == r9) goto L41
            r7 = 7
            if (r6 == r7) goto Lb2
            r7 = 8
            if (r6 == r7) goto L31
            goto Lb7
        L31:
            java.util.ArrayList<androidx.fragment.app.r$a> r6 = r0.f462a
            androidx.fragment.app.r$a r7 = new androidx.fragment.app.r$a
            r7.<init>(r11, r3)
            r6.add(r4, r7)
            int r4 = r4 + 1
            androidx.fragment.app.Fragment r3 = r5.f466b
            goto Lb7
        L41:
            androidx.fragment.app.Fragment r6 = r5.f466b
            r1.remove(r6)
            androidx.fragment.app.Fragment r5 = r5.f466b
            if (r5 != r3) goto Lb7
            java.util.ArrayList<androidx.fragment.app.r$a> r3 = r0.f462a
            androidx.fragment.app.r$a r6 = new androidx.fragment.app.r$a
            r6.<init>(r11, r5)
            r3.add(r4, r6)
            int r4 = r4 + 1
            r3 = r7
            goto Lb7
        L58:
            androidx.fragment.app.Fragment r6 = r5.f466b
            int r9 = r6.z
            int r12 = r17.size()
            int r12 = r12 - r8
            r13 = 0
        L62:
            if (r12 < 0) goto La2
            java.lang.Object r14 = r1.get(r12)
            androidx.fragment.app.Fragment r14 = (androidx.fragment.app.Fragment) r14
            int r15 = r14.z
            if (r15 != r9) goto L9f
            if (r14 != r6) goto L72
            r13 = 1
            goto L9f
        L72:
            if (r14 != r3) goto L81
            java.util.ArrayList<androidx.fragment.app.r$a> r3 = r0.f462a
            androidx.fragment.app.r$a r15 = new androidx.fragment.app.r$a
            r15.<init>(r11, r14)
            r3.add(r4, r15)
            int r4 = r4 + 1
            r3 = r7
        L81:
            androidx.fragment.app.r$a r15 = new androidx.fragment.app.r$a
            r15.<init>(r10, r14)
            int r2 = r5.f467c
            r15.f467c = r2
            int r2 = r5.e
            r15.e = r2
            int r2 = r5.d
            r15.d = r2
            int r2 = r5.f
            r15.f = r2
            java.util.ArrayList<androidx.fragment.app.r$a> r2 = r0.f462a
            r2.add(r4, r15)
            r1.remove(r14)
            int r4 = r4 + r8
        L9f:
            int r12 = r12 + (-1)
            goto L62
        La2:
            if (r13 == 0) goto Lac
            java.util.ArrayList<androidx.fragment.app.r$a> r2 = r0.f462a
            r2.remove(r4)
            int r4 = r4 + (-1)
            goto Lb7
        Lac:
            r5.f465a = r8
            r1.add(r6)
            goto Lb7
        Lb2:
            androidx.fragment.app.Fragment r2 = r5.f466b
            r1.add(r2)
        Lb7:
            int r4 = r4 + r8
            goto L7
        Lba:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.fragment.app.a.V(java.util.ArrayList, androidx.fragment.app.Fragment):androidx.fragment.app.Fragment");
    }

    boolean W(int r5) {
        int size = this.f462a.size();
        for (int r2 = 0; r2 < size; r2++) {
            Fragment fragment = this.f462a.get(r2).f466b;
            int r3 = fragment != null ? fragment.z : 0;
            if (r3 != 0 && r3 == r5) {
                return true;
            }
        }
        return false;
    }

    boolean X(ArrayList<a> arrayList, int r11, int r12) {
        if (r12 == r11) {
            return false;
        }
        int size = this.f462a.size();
        int r2 = -1;
        for (int r3 = 0; r3 < size; r3++) {
            Fragment fragment = this.f462a.get(r3).f466b;
            int r4 = fragment != null ? fragment.z : 0;
            if (r4 != 0 && r4 != r2) {
                for (int r22 = r11; r22 < r12; r22++) {
                    a aVar = arrayList.get(r22);
                    int size2 = aVar.f462a.size();
                    for (int r7 = 0; r7 < size2; r7++) {
                        Fragment fragment2 = aVar.f462a.get(r7).f466b;
                        if ((fragment2 != null ? fragment2.z : 0) == r4) {
                            return true;
                        }
                    }
                }
                r2 = r4;
            }
        }
        return false;
    }

    boolean Z() {
        for (int r1 = 0; r1 < this.f462a.size(); r1++) {
            if (Y(this.f462a.get(r1))) {
                return true;
            }
        }
        return false;
    }

    @Override // androidx.fragment.app.i.a
    @i0
    public CharSequence a() {
        return this.k != 0 ? this.K.u.h().getText(this.k) : this.l;
    }

    public void a0() {
        if (this.r != null) {
            for (int r0 = 0; r0 < this.r.size(); r0++) {
                this.r.get(r0).run();
            }
            this.r = null;
        }
    }

    @Override // androidx.fragment.app.i.a
    @i0
    public String b() {
        return this.j;
    }

    void b0(Fragment.f fVar) {
        for (int r0 = 0; r0 < this.f462a.size(); r0++) {
            r.a aVar = this.f462a.get(r0);
            if (Y(aVar)) {
                aVar.f466b.Y1(fVar);
            }
        }
    }

    @Override // androidx.fragment.app.j.k
    public boolean c(ArrayList<a> arrayList, ArrayList<Boolean> arrayList2) {
        if (j.L) {
            Log.v(N, "Run: " + this);
        }
        arrayList.add(this);
        arrayList2.add(Boolean.FALSE);
        if (!this.h) {
            return true;
        }
        this.K.D(this);
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0027  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x002d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    androidx.fragment.app.Fragment c0(java.util.ArrayList<androidx.fragment.app.Fragment> r6, androidx.fragment.app.Fragment r7) {
        /*
            r5 = this;
            java.util.ArrayList<androidx.fragment.app.r$a> r0 = r5.f462a
            int r0 = r0.size()
            r1 = 1
            int r0 = r0 - r1
        L8:
            if (r0 < 0) goto L35
            java.util.ArrayList<androidx.fragment.app.r$a> r2 = r5.f462a
            java.lang.Object r2 = r2.get(r0)
            androidx.fragment.app.r$a r2 = (androidx.fragment.app.r.a) r2
            int r3 = r2.f465a
            if (r3 == r1) goto L2d
            r4 = 3
            if (r3 == r4) goto L27
            switch(r3) {
                case 6: goto L27;
                case 7: goto L2d;
                case 8: goto L25;
                case 9: goto L22;
                case 10: goto L1d;
                default: goto L1c;
            }
        L1c:
            goto L32
        L1d:
            androidx.lifecycle.g$b r3 = r2.g
            r2.h = r3
            goto L32
        L22:
            androidx.fragment.app.Fragment r7 = r2.f466b
            goto L32
        L25:
            r7 = 0
            goto L32
        L27:
            androidx.fragment.app.Fragment r2 = r2.f466b
            r6.add(r2)
            goto L32
        L2d:
            androidx.fragment.app.Fragment r2 = r2.f466b
            r6.remove(r2)
        L32:
            int r0 = r0 + (-1)
            goto L8
        L35:
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.fragment.app.a.c0(java.util.ArrayList, androidx.fragment.app.Fragment):androidx.fragment.app.Fragment");
    }

    @Override // androidx.fragment.app.i.a
    public int d() {
        return this.k;
    }

    @Override // androidx.fragment.app.i.a
    public int e() {
        return this.m;
    }

    @Override // androidx.fragment.app.i.a
    @i0
    public CharSequence f() {
        return this.m != 0 ? this.K.u.h().getText(this.m) : this.n;
    }

    @Override // androidx.fragment.app.r
    public int n() {
        return Q(false);
    }

    @Override // androidx.fragment.app.r
    public int o() {
        return Q(true);
    }

    @Override // androidx.fragment.app.r
    public void p() {
        s();
        this.K.F0(this, false);
    }

    @Override // androidx.fragment.app.r
    public void q() {
        s();
        this.K.F0(this, true);
    }

    @Override // androidx.fragment.app.r
    @h0
    public r r(@h0 Fragment fragment) {
        j jVar = fragment.u;
        if (jVar == null || jVar == this.K) {
            return super.r(fragment);
        }
        throw new IllegalStateException("Cannot detach Fragment attached to a different FragmentManager. Fragment " + fragment.toString() + " is already attached to a FragmentManager.");
    }

    @Override // androidx.fragment.app.r
    void t(int r1, Fragment fragment, @i0 String str, int r4) {
        super.t(r1, fragment, str, r4);
        fragment.u = this.K;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder(128);
        sb.append("BackStackEntry{");
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        if (this.M >= 0) {
            sb.append(" #");
            sb.append(this.M);
        }
        if (this.j != null) {
            sb.append(" ");
            sb.append(this.j);
        }
        sb.append("}");
        return sb.toString();
    }

    @Override // androidx.fragment.app.r
    @h0
    public r u(@h0 Fragment fragment) {
        j jVar = fragment.u;
        if (jVar == null || jVar == this.K) {
            return super.u(fragment);
        }
        throw new IllegalStateException("Cannot hide Fragment attached to a different FragmentManager. Fragment " + fragment.toString() + " is already attached to a FragmentManager.");
    }

    @Override // androidx.fragment.app.r
    public boolean w() {
        return this.f462a.isEmpty();
    }

    @Override // androidx.fragment.app.r
    @h0
    public r x(@h0 Fragment fragment) {
        j jVar = fragment.u;
        if (jVar == null || jVar == this.K) {
            return super.x(fragment);
        }
        throw new IllegalStateException("Cannot remove Fragment attached to a different FragmentManager. Fragment " + fragment.toString() + " is already attached to a FragmentManager.");
    }
}

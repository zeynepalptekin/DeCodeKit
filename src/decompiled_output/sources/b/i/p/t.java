package b.i.p;

import android.view.View;
import android.view.ViewParent;

/* loaded from: classes.dex */
public class t {

    /* renamed from: a, reason: collision with root package name */
    private ViewParent f1288a;

    /* renamed from: b, reason: collision with root package name */
    private ViewParent f1289b;

    /* renamed from: c, reason: collision with root package name */
    private final View f1290c;
    private boolean d;
    private int[] e;

    public t(@androidx.annotation.h0 View view) {
        this.f1290c = view;
    }

    private boolean h(int r16, int r17, int r18, int r19, @androidx.annotation.i0 int[] r20, int r21, @androidx.annotation.i0 int[] r22) {
        ViewParent viewParentI;
        int r13;
        int r14;
        int[] r11;
        if (!m() || (viewParentI = i(r21)) == null) {
            return false;
        }
        if (r16 == 0 && r17 == 0 && r18 == 0 && r19 == 0) {
            if (r20 != null) {
                r20[0] = 0;
                r20[1] = 0;
            }
            return false;
        }
        if (r20 != null) {
            this.f1290c.getLocationInWindow(r20);
            r13 = r20[0];
            r14 = r20[1];
        } else {
            r13 = 0;
            r14 = 0;
        }
        if (r22 == null) {
            int[] r5 = j();
            r5[0] = 0;
            r5[1] = 0;
            r11 = r5;
        } else {
            r11 = r22;
        }
        i0.i(viewParentI, this.f1290c, r16, r17, r18, r19, r21, r11);
        if (r20 != null) {
            this.f1290c.getLocationInWindow(r20);
            r20[0] = r20[0] - r13;
            r20[1] = r20[1] - r14;
        }
        return true;
    }

    private ViewParent i(int r2) {
        if (r2 == 0) {
            return this.f1288a;
        }
        if (r2 != 1) {
            return null;
        }
        return this.f1289b;
    }

    private int[] j() {
        if (this.e == null) {
            this.e = new int[2];
        }
        return this.e;
    }

    private void q(int r2, ViewParent viewParent) {
        if (r2 == 0) {
            this.f1288a = viewParent;
        } else {
            if (r2 != 1) {
                return;
            }
            this.f1289b = viewParent;
        }
    }

    public boolean a(float f, float f2, boolean z) {
        ViewParent viewParentI;
        if (!m() || (viewParentI = i(0)) == null) {
            return false;
        }
        return i0.c(viewParentI, this.f1290c, f, f2, z);
    }

    public boolean b(float f, float f2) {
        ViewParent viewParentI;
        if (!m() || (viewParentI = i(0)) == null) {
            return false;
        }
        return i0.d(viewParentI, this.f1290c, f, f2);
    }

    public boolean c(int r7, int r8, @androidx.annotation.i0 int[] r9, @androidx.annotation.i0 int[] r10) {
        return d(r7, r8, r9, r10, 0);
    }

    public boolean d(int r11, int r12, @androidx.annotation.i0 int[] r13, @androidx.annotation.i0 int[] r14, int r15) {
        ViewParent viewParentI;
        int r8;
        int r9;
        if (!m() || (viewParentI = i(r15)) == null) {
            return false;
        }
        if (r11 == 0 && r12 == 0) {
            if (r14 == null) {
                return false;
            }
            r14[0] = 0;
            r14[1] = 0;
            return false;
        }
        if (r14 != null) {
            this.f1290c.getLocationInWindow(r14);
            r8 = r14[0];
            r9 = r14[1];
        } else {
            r8 = 0;
            r9 = 0;
        }
        if (r13 == null) {
            r13 = j();
        }
        r13[0] = 0;
        r13[1] = 0;
        i0.f(viewParentI, this.f1290c, r11, r12, r13, r15);
        if (r14 != null) {
            this.f1290c.getLocationInWindow(r14);
            r14[0] = r14[0] - r8;
            r14[1] = r14[1] - r9;
        }
        return (r13[0] == 0 && r13[1] == 0) ? false : true;
    }

    public void e(int r1, int r2, int r3, int r4, @androidx.annotation.i0 int[] r5, int r6, @androidx.annotation.i0 int[] r7) {
        h(r1, r2, r3, r4, r5, r6, r7);
    }

    public boolean f(int r9, int r10, int r11, int r12, @androidx.annotation.i0 int[] r13) {
        return h(r9, r10, r11, r12, r13, 0, null);
    }

    public boolean g(int r9, int r10, int r11, int r12, @androidx.annotation.i0 int[] r13, int r14) {
        return h(r9, r10, r11, r12, r13, r14, null);
    }

    public boolean k() {
        return l(0);
    }

    public boolean l(int r1) {
        return i(r1) != null;
    }

    public boolean m() {
        return this.d;
    }

    public void n() {
        f0.u2(this.f1290c);
    }

    public void o(@androidx.annotation.h0 View view) {
        f0.u2(this.f1290c);
    }

    public void p(boolean z) {
        if (this.d) {
            f0.u2(this.f1290c);
        }
        this.d = z;
    }

    public boolean r(int r2) {
        return s(r2, 0);
    }

    public boolean s(int r5, int r6) {
        if (l(r6)) {
            return true;
        }
        if (!m()) {
            return false;
        }
        View view = this.f1290c;
        for (ViewParent parent = this.f1290c.getParent(); parent != null; parent = parent.getParent()) {
            if (i0.m(parent, view, this.f1290c, r5, r6)) {
                q(r6, parent);
                i0.k(parent, view, this.f1290c, r5, r6);
                return true;
            }
            if (parent instanceof View) {
                view = (View) parent;
            }
        }
        return false;
    }

    public void t() {
        u(0);
    }

    public void u(int r3) {
        ViewParent viewParentI = i(r3);
        if (viewParentI != null) {
            i0.o(viewParentI, this.f1290c, r3);
            q(r3, null);
        }
    }
}

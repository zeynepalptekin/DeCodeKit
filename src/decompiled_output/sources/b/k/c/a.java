package b.k.c;

import android.graphics.Rect;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import androidx.annotation.h0;
import androidx.annotation.i0;
import androidx.appcompat.widget.ActivityChooserView;
import b.f.j;
import b.i.p.f0;
import b.i.p.p0.d;
import b.i.p.p0.e;
import b.i.p.p0.f;
import b.k.c.b;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public abstract class a extends b.i.p.a {
    public static final int n = Integer.MIN_VALUE;
    public static final int o = -1;
    private static final String p = "android.view.View";
    private static final Rect q = new Rect(ActivityChooserView.f.j, ActivityChooserView.f.j, Integer.MIN_VALUE, Integer.MIN_VALUE);
    private static final b.a<d> r = new C0080a();
    private static final b.InterfaceC0081b<j<d>, d> s = new b();
    private final AccessibilityManager h;
    private final View i;
    private c j;
    private final Rect d = new Rect();
    private final Rect e = new Rect();
    private final Rect f = new Rect();
    private final int[] g = new int[2];
    int k = Integer.MIN_VALUE;
    int l = Integer.MIN_VALUE;
    private int m = Integer.MIN_VALUE;

    /* renamed from: b.k.c.a$a, reason: collision with other inner class name */
    static class C0080a implements b.a<d> {
        C0080a() {
        }

        @Override // b.k.c.b.a
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public void a(d dVar, Rect rect) {
            dVar.r(rect);
        }
    }

    static class b implements b.InterfaceC0081b<j<d>, d> {
        b() {
        }

        @Override // b.k.c.b.InterfaceC0081b
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public d a(j<d> jVar, int r2) {
            return jVar.D(r2);
        }

        @Override // b.k.c.b.InterfaceC0081b
        /* renamed from: d, reason: merged with bridge method [inline-methods] */
        public int b(j<d> jVar) {
            return jVar.C();
        }
    }

    private class c extends e {
        c() {
        }

        @Override // b.i.p.p0.e
        public d a(int r2) {
            return d.D0(a.this.L(r2));
        }

        @Override // b.i.p.p0.e
        public d c(int r2) {
            int r22 = r2 == 2 ? a.this.k : a.this.l;
            if (r22 == Integer.MIN_VALUE) {
                return null;
            }
            return a(r22);
        }

        @Override // b.i.p.p0.e
        public boolean e(int r2, int r3, Bundle bundle) {
            return a.this.T(r2, r3, bundle);
        }
    }

    public a(@h0 View view) {
        if (view == null) {
            throw new IllegalArgumentException("View may not be null");
        }
        this.i = view;
        this.h = (AccessibilityManager) view.getContext().getSystemService("accessibility");
        view.setFocusable(true);
        if (f0.S(view) == 0) {
            f0.K1(view, 1);
        }
    }

    private static Rect E(@h0 View view, int r5, @h0 Rect rect) {
        int width = view.getWidth();
        int height = view.getHeight();
        if (r5 == 17) {
            rect.set(width, 0, width, height);
        } else if (r5 == 33) {
            rect.set(0, height, width, height);
        } else if (r5 == 66) {
            rect.set(-1, 0, -1, height);
        } else {
            if (r5 != 130) {
                throw new IllegalArgumentException("direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
            }
            rect.set(0, -1, width, -1);
        }
        return rect;
    }

    private boolean I(Rect rect) {
        if (rect == null || rect.isEmpty() || this.i.getWindowVisibility() != 0) {
            return false;
        }
        View view = this.i;
        do {
            Object parent = view.getParent();
            if (!(parent instanceof View)) {
                return parent != null;
            }
            view = (View) parent;
            if (view.getAlpha() <= 0.0f) {
                break;
            }
        } while (view.getVisibility() == 0);
        return false;
    }

    private static int J(int r1) {
        if (r1 == 19) {
            return 33;
        }
        if (r1 != 21) {
            return r1 != 22 ? 130 : 66;
        }
        return 17;
    }

    private boolean K(int r10, @i0 Rect rect) {
        Object objD;
        j<d> jVarY = y();
        int r0 = this.l;
        d dVarK = r0 == Integer.MIN_VALUE ? null : jVarY.k(r0);
        if (r10 == 1 || r10 == 2) {
            objD = b.k.c.b.d(jVarY, s, r, dVarK, r10, f0.W(this.i) == 1, false);
        } else {
            if (r10 != 17 && r10 != 33 && r10 != 66 && r10 != 130) {
                throw new IllegalArgumentException("direction must be one of {FOCUS_FORWARD, FOCUS_BACKWARD, FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
            }
            Rect rect2 = new Rect();
            int r02 = this.l;
            if (r02 != Integer.MIN_VALUE) {
                z(r02, rect2);
            } else if (rect != null) {
                rect2.set(rect);
            } else {
                E(this.i, r10, rect2);
            }
            objD = b.k.c.b.c(jVarY, s, r, dVarK, rect2, r10);
        }
        d dVar = (d) objD;
        return X(dVar != null ? jVarY.p(jVarY.n(dVar)) : Integer.MIN_VALUE);
    }

    private boolean U(int r2, int r3, Bundle bundle) {
        return r3 != 1 ? r3 != 2 ? r3 != 64 ? r3 != 128 ? N(r2, r3, bundle) : n(r2) : W(r2) : o(r2) : X(r2);
    }

    private boolean V(int r2, Bundle bundle) {
        return f0.f1(this.i, r2, bundle);
    }

    private boolean W(int r3) {
        int r0;
        if (!this.h.isEnabled() || !this.h.isTouchExplorationEnabled() || (r0 = this.k) == r3) {
            return false;
        }
        if (r0 != Integer.MIN_VALUE) {
            n(r0);
        }
        this.k = r3;
        this.i.invalidate();
        Y(r3, 32768);
        return true;
    }

    private void Z(int r3) {
        int r0 = this.m;
        if (r0 == r3) {
            return;
        }
        this.m = r3;
        Y(r3, 128);
        Y(r0, 256);
    }

    private boolean n(int r2) {
        if (this.k != r2) {
            return false;
        }
        this.k = Integer.MIN_VALUE;
        this.i.invalidate();
        Y(r2, 65536);
        return true;
    }

    private boolean p() {
        int r0 = this.l;
        return r0 != Integer.MIN_VALUE && N(r0, 16, null);
    }

    private AccessibilityEvent q(int r2, int r3) {
        return r2 != -1 ? r(r2, r3) : s(r3);
    }

    private AccessibilityEvent r(int r4, int r5) {
        AccessibilityEvent accessibilityEventObtain = AccessibilityEvent.obtain(r5);
        d dVarL = L(r4);
        accessibilityEventObtain.getText().add(dVarL.S());
        accessibilityEventObtain.setContentDescription(dVarL.z());
        accessibilityEventObtain.setScrollable(dVarL.v0());
        accessibilityEventObtain.setPassword(dVarL.t0());
        accessibilityEventObtain.setEnabled(dVarL.m0());
        accessibilityEventObtain.setChecked(dVarL.g0());
        P(r4, accessibilityEventObtain);
        if (accessibilityEventObtain.getText().isEmpty() && accessibilityEventObtain.getContentDescription() == null) {
            throw new RuntimeException("Callbacks must add text or a content description in populateEventForVirtualViewId()");
        }
        accessibilityEventObtain.setClassName(dVarL.v());
        f.Y(accessibilityEventObtain, this.i, r4);
        accessibilityEventObtain.setPackageName(this.i.getContext().getPackageName());
        return accessibilityEventObtain;
    }

    private AccessibilityEvent s(int r2) {
        AccessibilityEvent accessibilityEventObtain = AccessibilityEvent.obtain(r2);
        this.i.onInitializeAccessibilityEvent(accessibilityEventObtain);
        return accessibilityEventObtain;
    }

    @h0
    private d t(int r8) {
        d dVarA0 = d.A0();
        dVarA0.d1(true);
        dVarA0.f1(true);
        dVarA0.T0(p);
        dVarA0.O0(q);
        dVarA0.P0(q);
        dVarA0.w1(this.i);
        R(r8, dVarA0);
        if (dVarA0.S() == null && dVarA0.z() == null) {
            throw new RuntimeException("Callbacks must add text or a content description in populateNodeForVirtualViewId()");
        }
        dVarA0.r(this.e);
        if (this.e.equals(q)) {
            throw new RuntimeException("Callbacks must set parent bounds in populateNodeForVirtualViewId()");
        }
        int r2 = dVarA0.p();
        if ((r2 & 64) != 0) {
            throw new RuntimeException("Callbacks must not add ACTION_ACCESSIBILITY_FOCUS in populateNodeForVirtualViewId()");
        }
        if ((r2 & 128) != 0) {
            throw new RuntimeException("Callbacks must not add ACTION_CLEAR_ACCESSIBILITY_FOCUS in populateNodeForVirtualViewId()");
        }
        dVarA0.u1(this.i.getContext().getPackageName());
        dVarA0.G1(this.i, r8);
        if (this.k == r8) {
            dVarA0.M0(true);
            dVarA0.a(128);
        } else {
            dVarA0.M0(false);
            dVarA0.a(64);
        }
        boolean z = this.l == r8;
        if (z) {
            dVarA0.a(2);
        } else if (dVarA0.n0()) {
            dVarA0.a(1);
        }
        dVarA0.g1(z);
        this.i.getLocationOnScreen(this.g);
        dVarA0.s(this.d);
        if (this.d.equals(q)) {
            dVarA0.r(this.d);
            if (dVarA0.f1251b != -1) {
                d dVarA02 = d.A0();
                for (int r3 = dVarA0.f1251b; r3 != -1; r3 = dVarA02.f1251b) {
                    dVarA02.x1(this.i, -1);
                    dVarA02.O0(q);
                    R(r3, dVarA02);
                    dVarA02.r(this.e);
                    Rect rect = this.d;
                    Rect rect2 = this.e;
                    rect.offset(rect2.left, rect2.top);
                }
                dVarA02.G0();
            }
            this.d.offset(this.g[0] - this.i.getScrollX(), this.g[1] - this.i.getScrollY());
        }
        if (this.i.getLocalVisibleRect(this.f)) {
            this.f.offset(this.g[0] - this.i.getScrollX(), this.g[1] - this.i.getScrollY());
            if (this.d.intersect(this.f)) {
                dVarA0.P0(this.d);
                if (I(this.d)) {
                    dVarA0.R1(true);
                }
            }
        }
        return dVarA0;
    }

    @h0
    private d u() {
        d dVarB0 = d.B0(this.i);
        f0.c1(this.i, dVarB0);
        ArrayList arrayList = new ArrayList();
        D(arrayList);
        if (dVarB0.u() > 0 && arrayList.size() > 0) {
            throw new RuntimeException("Views cannot have both real and virtual children");
        }
        int size = arrayList.size();
        for (int r2 = 0; r2 < size; r2++) {
            dVarB0.d(this.i, ((Integer) arrayList.get(r2)).intValue());
        }
        return dVarB0;
    }

    private j<d> y() {
        ArrayList arrayList = new ArrayList();
        D(arrayList);
        j<d> jVar = new j<>();
        for (int r2 = 0; r2 < arrayList.size(); r2++) {
            jVar.q(r2, t(r2));
        }
        return jVar;
    }

    private void z(int r1, Rect rect) {
        L(r1).r(rect);
    }

    @Deprecated
    public int A() {
        return x();
    }

    public final int B() {
        return this.l;
    }

    protected abstract int C(float f, float f2);

    protected abstract void D(List<Integer> list);

    public final void F() {
        H(-1, 1);
    }

    public final void G(int r2) {
        H(r2, 0);
    }

    public final void H(int r3, int r4) {
        ViewParent parent;
        if (r3 == Integer.MIN_VALUE || !this.h.isEnabled() || (parent = this.i.getParent()) == null) {
            return;
        }
        AccessibilityEvent accessibilityEventQ = q(r3, 2048);
        b.i.p.p0.b.i(accessibilityEventQ, r4);
        b.i.p.i0.p(parent, this.i, accessibilityEventQ);
    }

    @h0
    d L(int r2) {
        return r2 == -1 ? u() : t(r2);
    }

    public final void M(boolean z, int r4, @i0 Rect rect) {
        int r0 = this.l;
        if (r0 != Integer.MIN_VALUE) {
            o(r0);
        }
        if (z) {
            K(r4, rect);
        }
    }

    protected abstract boolean N(int r1, int r2, @i0 Bundle bundle);

    protected void O(@h0 AccessibilityEvent accessibilityEvent) {
    }

    protected void P(int r1, @h0 AccessibilityEvent accessibilityEvent) {
    }

    protected void Q(@h0 d dVar) {
    }

    protected abstract void R(int r1, @h0 d dVar);

    protected void S(int r1, boolean z) {
    }

    boolean T(int r2, int r3, Bundle bundle) {
        return r2 != -1 ? U(r2, r3, bundle) : V(r3, bundle);
    }

    public final boolean X(int r3) {
        int r0;
        if ((!this.i.isFocused() && !this.i.requestFocus()) || (r0 = this.l) == r3) {
            return false;
        }
        if (r0 != Integer.MIN_VALUE) {
            o(r0);
        }
        this.l = r3;
        S(r3, true);
        Y(r3, 8);
        return true;
    }

    public final boolean Y(int r3, int r4) {
        ViewParent parent;
        if (r3 == Integer.MIN_VALUE || !this.h.isEnabled() || (parent = this.i.getParent()) == null) {
            return false;
        }
        return b.i.p.i0.p(parent, this.i, q(r3, r4));
    }

    @Override // b.i.p.a
    public e b(View view) {
        if (this.j == null) {
            this.j = new c();
        }
        return this.j;
    }

    @Override // b.i.p.a
    public void f(View view, AccessibilityEvent accessibilityEvent) {
        super.f(view, accessibilityEvent);
        O(accessibilityEvent);
    }

    @Override // b.i.p.a
    public void g(View view, d dVar) {
        super.g(view, dVar);
        Q(dVar);
    }

    public final boolean o(int r3) {
        if (this.l != r3) {
            return false;
        }
        this.l = Integer.MIN_VALUE;
        S(r3, false);
        Y(r3, 8);
        return true;
    }

    public final boolean v(@h0 MotionEvent motionEvent) {
        if (!this.h.isEnabled() || !this.h.isTouchExplorationEnabled()) {
            return false;
        }
        int action = motionEvent.getAction();
        if (action == 7 || action == 9) {
            int r6 = C(motionEvent.getX(), motionEvent.getY());
            Z(r6);
            return r6 != Integer.MIN_VALUE;
        }
        if (action != 10 || this.m == Integer.MIN_VALUE) {
            return false;
        }
        Z(Integer.MIN_VALUE);
        return true;
    }

    public final boolean w(@h0 KeyEvent keyEvent) {
        int r1 = 0;
        if (keyEvent.getAction() == 1) {
            return false;
        }
        int keyCode = keyEvent.getKeyCode();
        if (keyCode == 61) {
            if (keyEvent.hasNoModifiers()) {
                return K(2, null);
            }
            if (keyEvent.hasModifiers(1)) {
                return K(1, null);
            }
            return false;
        }
        if (keyCode != 66) {
            switch (keyCode) {
                case 19:
                case 20:
                case 21:
                case 22:
                    if (!keyEvent.hasNoModifiers()) {
                        return false;
                    }
                    int r0 = J(keyCode);
                    int repeatCount = keyEvent.getRepeatCount() + 1;
                    boolean z = false;
                    while (r1 < repeatCount && K(r0, null)) {
                        r1++;
                        z = true;
                    }
                    return z;
                case 23:
                    break;
                default:
                    return false;
            }
        }
        if (!keyEvent.hasNoModifiers() || keyEvent.getRepeatCount() != 0) {
            return false;
        }
        p();
        return true;
    }

    public final int x() {
        return this.k;
    }
}

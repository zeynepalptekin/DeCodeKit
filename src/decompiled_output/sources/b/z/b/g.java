package b.z.b;

import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.h0;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import b.z.b.h;
import java.util.Locale;

/* loaded from: classes.dex */
final class g extends RecyclerView.t {
    private static final int n = 0;
    private static final int o = 1;
    private static final int p = 2;
    private static final int q = 3;
    private static final int r = 4;
    private static final int s = -1;

    /* renamed from: a, reason: collision with root package name */
    private h.j f1565a;

    /* renamed from: b, reason: collision with root package name */
    @h0
    private final h f1566b;

    /* renamed from: c, reason: collision with root package name */
    @h0
    private final RecyclerView f1567c;

    @h0
    private final LinearLayoutManager d;
    private int e;
    private int f;
    private a g;
    private int h;
    private int i;
    private boolean j;
    private boolean k;
    private boolean l;
    private boolean m;

    private static final class a {

        /* renamed from: a, reason: collision with root package name */
        int f1568a;

        /* renamed from: b, reason: collision with root package name */
        float f1569b;

        /* renamed from: c, reason: collision with root package name */
        int f1570c;

        a() {
        }

        void a() {
            this.f1568a = -1;
            this.f1569b = 0.0f;
            this.f1570c = 0;
        }
    }

    g(@h0 h hVar) {
        this.f1566b = hVar;
        RecyclerView recyclerView = hVar.m;
        this.f1567c = recyclerView;
        this.d = (LinearLayoutManager) recyclerView.getLayoutManager();
        this.g = new a();
        q();
    }

    private void c(int r2, float f, int r4) {
        h.j jVar = this.f1565a;
        if (jVar != null) {
            jVar.b(r2, f, r4);
        }
    }

    private void d(int r2) {
        h.j jVar = this.f1565a;
        if (jVar != null) {
            jVar.c(r2);
        }
    }

    private void e(int r3) {
        if ((this.e == 3 && this.f == 0) || this.f == r3) {
            return;
        }
        this.f = r3;
        h.j jVar = this.f1565a;
        if (jVar != null) {
            jVar.a(r3);
        }
    }

    private int f() {
        return this.d.y2();
    }

    private boolean l() {
        int r0 = this.e;
        return r0 == 1 || r0 == 4;
    }

    private void q() {
        this.e = 0;
        this.f = 0;
        this.g.a();
        this.h = -1;
        this.i = -1;
        this.j = false;
        this.k = false;
        this.m = false;
        this.l = false;
    }

    private void s(boolean z) {
        this.m = z;
        this.e = z ? 4 : 1;
        int r3 = this.i;
        if (r3 != -1) {
            this.h = r3;
            this.i = -1;
        } else if (this.h == -1) {
            this.h = f();
        }
        e(1);
    }

    private void t() {
        int top;
        a aVar = this.g;
        int r1 = this.d.y2();
        aVar.f1568a = r1;
        if (r1 == -1) {
            aVar.a();
            return;
        }
        View viewJ = this.d.J(r1);
        if (viewJ == null) {
            aVar.a();
            return;
        }
        int r2 = this.d.j0(viewJ);
        int r3 = this.d.u0(viewJ);
        int r4 = this.d.x0(viewJ);
        int r5 = this.d.O(viewJ);
        ViewGroup.LayoutParams layoutParams = viewJ.getLayoutParams();
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
            r2 += marginLayoutParams.leftMargin;
            r3 += marginLayoutParams.rightMargin;
            r4 += marginLayoutParams.topMargin;
            r5 += marginLayoutParams.bottomMargin;
        }
        int height = viewJ.getHeight() + r4 + r5;
        int width = viewJ.getWidth() + r2 + r3;
        if (this.d.Q2() == 0) {
            top = (viewJ.getLeft() - r2) - this.f1567c.getPaddingLeft();
            if (this.f1566b.k()) {
                top = -top;
            }
            height = width;
        } else {
            top = (viewJ.getTop() - r4) - this.f1567c.getPaddingTop();
        }
        int r12 = -top;
        aVar.f1570c = r12;
        if (r12 >= 0) {
            aVar.f1569b = height == 0 ? 0.0f : r12 / height;
        } else {
            if (!new b.z.b.a(this.d).d()) {
                throw new IllegalStateException(String.format(Locale.US, "Page can only be offset by a positive amount, not by %d", Integer.valueOf(aVar.f1570c)));
            }
            throw new IllegalStateException("Page(s) contain a ViewGroup with a LayoutTransition (or animateLayoutChanges=\"true\"), which interferes with the scrolling animation. Make sure to call getLayoutTransition().setAnimateParentHierarchy(false) on all ViewGroups with a LayoutTransition before an animation is started.");
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.t
    public void a(@h0 RecyclerView recyclerView, int r7) {
        boolean z = true;
        if (!(this.e == 1 && this.f == 1) && r7 == 1) {
            s(false);
            return;
        }
        if (l() && r7 == 2) {
            if (this.k) {
                e(2);
                this.j = true;
                return;
            }
            return;
        }
        if (l() && r7 == 0) {
            t();
            if (this.k) {
                a aVar = this.g;
                if (aVar.f1570c == 0) {
                    int r4 = this.h;
                    int r6 = aVar.f1568a;
                    if (r4 != r6) {
                        d(r6);
                    }
                } else {
                    z = false;
                }
            } else {
                int r62 = this.g.f1568a;
                if (r62 != -1) {
                    c(r62, 0.0f, 0);
                }
            }
            if (z) {
                e(0);
                q();
            }
        }
        if (this.e == 2 && r7 == 0 && this.l) {
            t();
            a aVar2 = this.g;
            if (aVar2.f1570c == 0) {
                int r72 = this.i;
                int r63 = aVar2.f1568a;
                if (r72 != r63) {
                    if (r63 == -1) {
                        r63 = 0;
                    }
                    d(r63);
                }
                e(0);
                q();
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0022  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0025  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x002f  */
    @Override // androidx.recyclerview.widget.RecyclerView.t
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void b(@androidx.annotation.h0 androidx.recyclerview.widget.RecyclerView r4, int r5, int r6) {
        /*
            r3 = this;
            r4 = 1
            r3.k = r4
            r3.t()
            boolean r0 = r3.j
            r1 = -1
            r2 = 0
            if (r0 == 0) goto L3a
            r3.j = r2
            if (r6 > 0) goto L22
            if (r6 != 0) goto L20
            if (r5 >= 0) goto L16
            r5 = 1
            goto L17
        L16:
            r5 = 0
        L17:
            b.z.b.h r6 = r3.f1566b
            boolean r6 = r6.k()
            if (r5 != r6) goto L20
            goto L22
        L20:
            r5 = 0
            goto L23
        L22:
            r5 = 1
        L23:
            if (r5 == 0) goto L2f
            b.z.b.g$a r5 = r3.g
            int r6 = r5.f1570c
            if (r6 == 0) goto L2f
            int r5 = r5.f1568a
            int r5 = r5 + r4
            goto L33
        L2f:
            b.z.b.g$a r5 = r3.g
            int r5 = r5.f1568a
        L33:
            r3.i = r5
            int r6 = r3.h
            if (r6 == r5) goto L48
            goto L45
        L3a:
            int r5 = r3.e
            if (r5 != 0) goto L48
            b.z.b.g$a r5 = r3.g
            int r5 = r5.f1568a
            if (r5 != r1) goto L45
            r5 = 0
        L45:
            r3.d(r5)
        L48:
            b.z.b.g$a r5 = r3.g
            int r5 = r5.f1568a
            if (r5 != r1) goto L4f
            r5 = 0
        L4f:
            b.z.b.g$a r6 = r3.g
            float r0 = r6.f1569b
            int r6 = r6.f1570c
            r3.c(r5, r0, r6)
            b.z.b.g$a r5 = r3.g
            int r5 = r5.f1568a
            int r6 = r3.i
            if (r5 == r6) goto L62
            if (r6 != r1) goto L72
        L62:
            b.z.b.g$a r5 = r3.g
            int r5 = r5.f1570c
            if (r5 != 0) goto L72
            int r5 = r3.f
            if (r5 == r4) goto L72
            r3.e(r2)
            r3.q()
        L72:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: b.z.b.g.b(androidx.recyclerview.widget.RecyclerView, int, int):void");
    }

    double g() {
        t();
        a aVar = this.g;
        return aVar.f1568a + aVar.f1569b;
    }

    int h() {
        return this.f;
    }

    boolean i() {
        return this.f == 1;
    }

    boolean j() {
        return this.m;
    }

    boolean k() {
        return this.f == 0;
    }

    void m() {
        this.e = 4;
        s(true);
    }

    void n() {
        this.l = true;
    }

    void o() {
        if (!i() || this.m) {
            this.m = false;
            t();
            a aVar = this.g;
            if (aVar.f1570c != 0) {
                e(2);
                return;
            }
            int r1 = aVar.f1568a;
            if (r1 != this.h) {
                d(r1);
            }
            e(0);
            q();
        }
    }

    void p(int r3, boolean z) {
        this.e = z ? 2 : 3;
        this.m = false;
        boolean z2 = this.i != r3;
        this.i = r3;
        e(2);
        if (z2) {
            d(r3);
        }
    }

    void r(h.j jVar) {
        this.f1565a = jVar;
    }
}

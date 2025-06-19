package androidx.recyclerview.widget;

import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
class g {
    private static final boolean d = false;
    private static final String e = "ChildrenHelper";

    /* renamed from: a, reason: collision with root package name */
    final b f646a;

    /* renamed from: b, reason: collision with root package name */
    final a f647b = new a();

    /* renamed from: c, reason: collision with root package name */
    final List<View> f648c = new ArrayList();

    static class a {

        /* renamed from: c, reason: collision with root package name */
        static final int f649c = 64;
        static final long d = Long.MIN_VALUE;

        /* renamed from: a, reason: collision with root package name */
        long f650a = 0;

        /* renamed from: b, reason: collision with root package name */
        a f651b;

        a() {
        }

        private void c() {
            if (this.f651b == null) {
                this.f651b = new a();
            }
        }

        void a(int r5) {
            if (r5 < 64) {
                this.f650a &= ~(1 << r5);
                return;
            }
            a aVar = this.f651b;
            if (aVar != null) {
                aVar.a(r5 - 64);
            }
        }

        int b(int r7) {
            a aVar = this.f651b;
            return aVar == null ? r7 >= 64 ? Long.bitCount(this.f650a) : Long.bitCount(this.f650a & ((1 << r7) - 1)) : r7 < 64 ? Long.bitCount(this.f650a & ((1 << r7) - 1)) : aVar.b(r7 - 64) + Long.bitCount(this.f650a);
        }

        boolean d(int r5) {
            if (r5 < 64) {
                return (this.f650a & (1 << r5)) != 0;
            }
            c();
            return this.f651b.d(r5 - 64);
        }

        void e(int r11, boolean z) {
            if (r11 >= 64) {
                c();
                this.f651b.e(r11 - 64, z);
                return;
            }
            boolean z2 = (this.f650a & d) != 0;
            long j = (1 << r11) - 1;
            long j2 = this.f650a;
            this.f650a = ((j2 & (~j)) << 1) | (j2 & j);
            if (z) {
                h(r11);
            } else {
                a(r11);
            }
            if (z2 || this.f651b != null) {
                c();
                this.f651b.e(0, z2);
            }
        }

        boolean f(int r12) {
            if (r12 >= 64) {
                c();
                return this.f651b.f(r12 - 64);
            }
            long j = 1 << r12;
            boolean z = (this.f650a & j) != 0;
            long j2 = this.f650a & (~j);
            this.f650a = j2;
            long j3 = j - 1;
            this.f650a = (j2 & j3) | Long.rotateRight((~j3) & j2, 1);
            a aVar = this.f651b;
            if (aVar != null) {
                if (aVar.d(0)) {
                    h(63);
                }
                this.f651b.f(0);
            }
            return z;
        }

        void g() {
            this.f650a = 0L;
            a aVar = this.f651b;
            if (aVar != null) {
                aVar.g();
            }
        }

        void h(int r5) {
            if (r5 < 64) {
                this.f650a |= 1 << r5;
            } else {
                c();
                this.f651b.h(r5 - 64);
            }
        }

        public String toString() {
            if (this.f651b == null) {
                return Long.toBinaryString(this.f650a);
            }
            return this.f651b.toString() + "xx" + Long.toBinaryString(this.f650a);
        }
    }

    interface b {
        View a(int r1);

        void b(View view);

        RecyclerView.f0 c(View view);

        void d(int r1);

        void e(View view);

        void f(View view, int r2);

        int g();

        void h(int r1);

        void i();

        void j(View view, int r2, ViewGroup.LayoutParams layoutParams);

        int k(View view);
    }

    g(b bVar) {
        this.f646a = bVar;
    }

    private int h(int r5) {
        if (r5 < 0) {
            return -1;
        }
        int r1 = this.f646a.g();
        int r2 = r5;
        while (r2 < r1) {
            int r3 = r5 - (r2 - this.f647b.b(r2));
            if (r3 == 0) {
                while (this.f647b.d(r2)) {
                    r2++;
                }
                return r2;
            }
            r2 += r3;
        }
        return -1;
    }

    private void l(View view) {
        this.f648c.add(view);
        this.f646a.b(view);
    }

    private boolean t(View view) {
        if (!this.f648c.remove(view)) {
            return false;
        }
        this.f646a.e(view);
        return true;
    }

    void a(View view, int r3, boolean z) {
        int r32 = r3 < 0 ? this.f646a.g() : h(r3);
        this.f647b.e(r32, z);
        if (z) {
            l(view);
        }
        this.f646a.f(view, r32);
    }

    void b(View view, boolean z) {
        a(view, -1, z);
    }

    void c(View view, int r3, ViewGroup.LayoutParams layoutParams, boolean z) {
        int r32 = r3 < 0 ? this.f646a.g() : h(r3);
        this.f647b.e(r32, z);
        if (z) {
            l(view);
        }
        this.f646a.j(view, r32, layoutParams);
    }

    void d(int r2) {
        int r22 = h(r2);
        this.f647b.f(r22);
        this.f646a.d(r22);
    }

    View e(int r6) {
        int size = this.f648c.size();
        for (int r1 = 0; r1 < size; r1++) {
            View view = this.f648c.get(r1);
            RecyclerView.f0 f0VarC = this.f646a.c(view);
            if (f0VarC.m() == r6 && !f0VarC.u() && !f0VarC.w()) {
                return view;
            }
        }
        return null;
    }

    View f(int r2) {
        return this.f646a.a(h(r2));
    }

    int g() {
        return this.f646a.g() - this.f648c.size();
    }

    View i(int r2) {
        return this.f646a.a(r2);
    }

    int j() {
        return this.f646a.g();
    }

    void k(View view) {
        int r0 = this.f646a.k(view);
        if (r0 >= 0) {
            this.f647b.h(r0);
            l(view);
        } else {
            throw new IllegalArgumentException("view is not a child, cannot hide " + view);
        }
    }

    int m(View view) {
        int r3 = this.f646a.k(view);
        if (r3 == -1 || this.f647b.d(r3)) {
            return -1;
        }
        return r3 - this.f647b.b(r3);
    }

    boolean n(View view) {
        return this.f648c.contains(view);
    }

    void o() {
        this.f647b.g();
        for (int size = this.f648c.size() - 1; size >= 0; size--) {
            this.f646a.e(this.f648c.get(size));
            this.f648c.remove(size);
        }
        this.f646a.i();
    }

    void p(View view) {
        int r0 = this.f646a.k(view);
        if (r0 < 0) {
            return;
        }
        if (this.f647b.f(r0)) {
            t(view);
        }
        this.f646a.h(r0);
    }

    void q(int r3) {
        int r32 = h(r3);
        View viewA = this.f646a.a(r32);
        if (viewA == null) {
            return;
        }
        if (this.f647b.f(r32)) {
            t(viewA);
        }
        this.f646a.h(r32);
    }

    boolean r(View view) {
        int r0 = this.f646a.k(view);
        if (r0 == -1) {
            t(view);
            return true;
        }
        if (!this.f647b.d(r0)) {
            return false;
        }
        this.f647b.f(r0);
        t(view);
        this.f646a.h(r0);
        return true;
    }

    void s(View view) {
        int r0 = this.f646a.k(view);
        if (r0 < 0) {
            throw new IllegalArgumentException("view is not a child, cannot hide " + view);
        }
        if (this.f647b.d(r0)) {
            this.f647b.a(r0);
            t(view);
        } else {
            throw new RuntimeException("trying to unhide a view that was not hidden" + view);
        }
    }

    public String toString() {
        return this.f647b.toString() + ", hidden list:" + this.f648c.size();
    }
}

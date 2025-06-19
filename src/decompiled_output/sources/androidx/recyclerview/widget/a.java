package androidx.recyclerview.widget;

import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.v;
import b.i.o.h;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* loaded from: classes.dex */
class a implements v.a {
    static final int i = 0;
    static final int j = 1;
    private static final boolean k = false;
    private static final String l = "AHT";

    /* renamed from: a, reason: collision with root package name */
    private h.a<b> f606a;

    /* renamed from: b, reason: collision with root package name */
    final ArrayList<b> f607b;

    /* renamed from: c, reason: collision with root package name */
    final ArrayList<b> f608c;
    final InterfaceC0032a d;
    Runnable e;
    final boolean f;
    final v g;
    private int h;

    /* renamed from: androidx.recyclerview.widget.a$a, reason: collision with other inner class name */
    interface InterfaceC0032a {
        void a(int r1, int r2);

        void b(b bVar);

        RecyclerView.f0 c(int r1);

        void d(int r1, int r2);

        void e(int r1, int r2);

        void f(int r1, int r2);

        void g(b bVar);

        void h(int r1, int r2, Object obj);
    }

    static class b {
        static final int e = 1;
        static final int f = 2;
        static final int g = 4;
        static final int h = 8;
        static final int i = 30;

        /* renamed from: a, reason: collision with root package name */
        int f609a;

        /* renamed from: b, reason: collision with root package name */
        int f610b;

        /* renamed from: c, reason: collision with root package name */
        Object f611c;
        int d;

        b(int r1, int r2, int r3, Object obj) {
            this.f609a = r1;
            this.f610b = r2;
            this.d = r3;
            this.f611c = obj;
        }

        String a() {
            int r0 = this.f609a;
            return r0 != 1 ? r0 != 2 ? r0 != 4 ? r0 != 8 ? "??" : "mv" : "up" : "rm" : "add";
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || b.class != obj.getClass()) {
                return false;
            }
            b bVar = (b) obj;
            int r2 = this.f609a;
            if (r2 != bVar.f609a) {
                return false;
            }
            if (r2 == 8 && Math.abs(this.d - this.f610b) == 1 && this.d == bVar.f610b && this.f610b == bVar.d) {
                return true;
            }
            if (this.d != bVar.d || this.f610b != bVar.f610b) {
                return false;
            }
            Object obj2 = this.f611c;
            Object obj3 = bVar.f611c;
            if (obj2 != null) {
                if (!obj2.equals(obj3)) {
                    return false;
                }
            } else if (obj3 != null) {
                return false;
            }
            return true;
        }

        public int hashCode() {
            return (((this.f609a * 31) + this.f610b) * 31) + this.d;
        }

        public String toString() {
            return Integer.toHexString(System.identityHashCode(this)) + "[" + a() + ",s:" + this.f610b + "c:" + this.d + ",p:" + this.f611c + "]";
        }
    }

    a(InterfaceC0032a interfaceC0032a) {
        this(interfaceC0032a, false);
    }

    a(InterfaceC0032a interfaceC0032a, boolean z) {
        this.f606a = new h.b(30);
        this.f607b = new ArrayList<>();
        this.f608c = new ArrayList<>();
        this.h = 0;
        this.d = interfaceC0032a;
        this.f = z;
        this.g = new v(this);
    }

    /* JADX WARN: Removed duplicated region for block: B:56:0x00a6  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private int A(int r8, int r9) {
        /*
            r7 = this;
            java.util.ArrayList<androidx.recyclerview.widget.a$b> r0 = r7.f608c
            int r0 = r0.size()
            r1 = 1
            int r0 = r0 - r1
        L8:
            r2 = 8
            if (r0 < 0) goto L84
            java.util.ArrayList<androidx.recyclerview.widget.a$b> r3 = r7.f608c
            java.lang.Object r3 = r3.get(r0)
            androidx.recyclerview.widget.a$b r3 = (androidx.recyclerview.widget.a.b) r3
            int r4 = r3.f609a
            r5 = 2
            if (r4 != r2) goto L65
            int r2 = r3.f610b
            int r4 = r3.d
            if (r2 >= r4) goto L20
            goto L23
        L20:
            r6 = r4
            r4 = r2
            r2 = r6
        L23:
            if (r8 < r2) goto L4b
            if (r8 > r4) goto L4b
            int r4 = r3.f610b
            if (r2 != r4) goto L3c
            if (r9 != r1) goto L33
            int r2 = r3.d
            int r2 = r2 + r1
        L30:
            r3.d = r2
            goto L39
        L33:
            if (r9 != r5) goto L39
            int r2 = r3.d
            int r2 = r2 - r1
            goto L30
        L39:
            int r8 = r8 + 1
            goto L81
        L3c:
            if (r9 != r1) goto L43
            int r4 = r4 + 1
        L40:
            r3.f610b = r4
            goto L48
        L43:
            if (r9 != r5) goto L48
            int r4 = r4 + (-1)
            goto L40
        L48:
            int r8 = r8 + (-1)
            goto L81
        L4b:
            int r2 = r3.f610b
            if (r8 >= r2) goto L81
            if (r9 != r1) goto L5b
            int r2 = r2 + 1
            r3.f610b = r2
            int r2 = r3.d
            int r2 = r2 + r1
        L58:
            r3.d = r2
            goto L81
        L5b:
            if (r9 != r5) goto L81
            int r2 = r2 + (-1)
            r3.f610b = r2
            int r2 = r3.d
            int r2 = r2 - r1
            goto L58
        L65:
            int r2 = r3.f610b
            if (r2 > r8) goto L75
            if (r4 != r1) goto L6f
            int r2 = r3.d
            int r8 = r8 - r2
            goto L81
        L6f:
            if (r4 != r5) goto L81
            int r2 = r3.d
            int r8 = r8 + r2
            goto L81
        L75:
            if (r9 != r1) goto L7c
            int r2 = r2 + 1
        L79:
            r3.f610b = r2
            goto L81
        L7c:
            if (r9 != r5) goto L81
            int r2 = r2 + (-1)
            goto L79
        L81:
            int r0 = r0 + (-1)
            goto L8
        L84:
            java.util.ArrayList<androidx.recyclerview.widget.a$b> r9 = r7.f608c
            int r9 = r9.size()
            int r9 = r9 - r1
        L8b:
            if (r9 < 0) goto Lb1
            java.util.ArrayList<androidx.recyclerview.widget.a$b> r0 = r7.f608c
            java.lang.Object r0 = r0.get(r9)
            androidx.recyclerview.widget.a$b r0 = (androidx.recyclerview.widget.a.b) r0
            int r1 = r0.f609a
            if (r1 != r2) goto La2
            int r1 = r0.d
            int r3 = r0.f610b
            if (r1 == r3) goto La6
            if (r1 >= 0) goto Lae
            goto La6
        La2:
            int r1 = r0.d
            if (r1 > 0) goto Lae
        La6:
            java.util.ArrayList<androidx.recyclerview.widget.a$b> r1 = r7.f608c
            r1.remove(r9)
            r7.a(r0)
        Lae:
            int r9 = r9 + (-1)
            goto L8b
        Lb1:
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.a.A(int, int):int");
    }

    private void d(b bVar) {
        w(bVar);
    }

    private void e(b bVar) {
        w(bVar);
    }

    private void g(b bVar) {
        boolean z;
        char c2;
        int r0 = bVar.f610b;
        int r1 = bVar.d + r0;
        char c3 = 65535;
        int r4 = r0;
        int r5 = 0;
        while (r4 < r1) {
            if (this.d.c(r4) != null || i(r4)) {
                if (c3 == 0) {
                    l(b(2, r0, r5, null));
                    z = true;
                } else {
                    z = false;
                }
                c2 = 1;
            } else {
                if (c3 == 1) {
                    w(b(2, r0, r5, null));
                    z = true;
                } else {
                    z = false;
                }
                c2 = 0;
            }
            if (z) {
                r4 -= r5;
                r1 -= r5;
                r5 = 1;
            } else {
                r5++;
            }
            r4++;
            c3 = c2;
        }
        if (r5 != bVar.d) {
            a(bVar);
            bVar = b(2, r0, r5, null);
        }
        if (c3 == 0) {
            l(bVar);
        } else {
            w(bVar);
        }
    }

    private void h(b bVar) {
        int r0 = bVar.f610b;
        int r1 = bVar.d + r0;
        int r3 = r0;
        char c2 = 65535;
        int r5 = 0;
        while (r0 < r1) {
            if (this.d.c(r0) != null || i(r0)) {
                if (c2 == 0) {
                    l(b(4, r3, r5, bVar.f611c));
                    r3 = r0;
                    r5 = 0;
                }
                c2 = 1;
            } else {
                if (c2 == 1) {
                    w(b(4, r3, r5, bVar.f611c));
                    r3 = r0;
                    r5 = 0;
                }
                c2 = 0;
            }
            r5++;
            r0++;
        }
        if (r5 != bVar.d) {
            Object obj = bVar.f611c;
            a(bVar);
            bVar = b(4, r3, r5, obj);
        }
        if (c2 == 0) {
            l(bVar);
        } else {
            w(bVar);
        }
    }

    private boolean i(int r8) {
        int size = this.f608c.size();
        for (int r2 = 0; r2 < size; r2++) {
            b bVar = this.f608c.get(r2);
            int r4 = bVar.f609a;
            if (r4 == 8) {
                if (o(bVar.d, r2 + 1) == r8) {
                    return true;
                }
            } else if (r4 == 1) {
                int r42 = bVar.f610b;
                int r3 = bVar.d + r42;
                while (r42 < r3) {
                    if (o(r42, r2 + 1) == r8) {
                        return true;
                    }
                    r42++;
                }
            } else {
                continue;
            }
        }
        return false;
    }

    private void l(b bVar) {
        int r3;
        int r0 = bVar.f609a;
        if (r0 == 1 || r0 == 8) {
            throw new IllegalArgumentException("should not dispatch add or move for pre layout");
        }
        int r02 = A(bVar.f610b, r0);
        int r2 = bVar.f610b;
        int r32 = bVar.f609a;
        if (r32 == 2) {
            r3 = 0;
        } else {
            if (r32 != 4) {
                throw new IllegalArgumentException("op should be remove or update." + bVar);
            }
            r3 = 1;
        }
        int r8 = 1;
        for (int r7 = 1; r7 < bVar.d; r7++) {
            int r9 = A(bVar.f610b + (r3 * r7), bVar.f609a);
            int r10 = bVar.f609a;
            if (r10 == 2 ? r9 == r02 : r10 == 4 && r9 == r02 + 1) {
                r8++;
            } else {
                b bVarB = b(bVar.f609a, r02, r8, bVar.f611c);
                m(bVarB, r2);
                a(bVarB);
                if (bVar.f609a == 4) {
                    r2 += r8;
                }
                r02 = r9;
                r8 = 1;
            }
        }
        Object obj = bVar.f611c;
        a(bVar);
        if (r8 > 0) {
            b bVarB2 = b(bVar.f609a, r02, r8, obj);
            m(bVarB2, r2);
            a(bVarB2);
        }
    }

    private void w(b bVar) {
        this.f608c.add(bVar);
        int r0 = bVar.f609a;
        if (r0 == 1) {
            this.d.e(bVar.f610b, bVar.d);
            return;
        }
        if (r0 == 2) {
            this.d.d(bVar.f610b, bVar.d);
            return;
        }
        if (r0 == 4) {
            this.d.h(bVar.f610b, bVar.d, bVar.f611c);
        } else {
            if (r0 == 8) {
                this.d.a(bVar.f610b, bVar.d);
                return;
            }
            throw new IllegalArgumentException("Unknown update op type for " + bVar);
        }
    }

    @Override // androidx.recyclerview.widget.v.a
    public void a(b bVar) {
        if (this.f) {
            return;
        }
        bVar.f611c = null;
        this.f606a.a(bVar);
    }

    @Override // androidx.recyclerview.widget.v.a
    public b b(int r2, int r3, int r4, Object obj) {
        b bVarB = this.f606a.b();
        if (bVarB == null) {
            return new b(r2, r3, r4, obj);
        }
        bVarB.f609a = r2;
        bVarB.f610b = r3;
        bVarB.d = r4;
        bVarB.f611c = obj;
        return bVarB;
    }

    a c(b... bVarArr) {
        Collections.addAll(this.f607b, bVarArr);
        return this;
    }

    public int f(int r6) {
        int size = this.f607b.size();
        for (int r1 = 0; r1 < size; r1++) {
            b bVar = this.f607b.get(r1);
            int r3 = bVar.f609a;
            if (r3 != 1) {
                if (r3 == 2) {
                    int r32 = bVar.f610b;
                    if (r32 <= r6) {
                        int r2 = bVar.d;
                        if (r32 + r2 > r6) {
                            return -1;
                        }
                        r6 -= r2;
                    } else {
                        continue;
                    }
                } else if (r3 == 8) {
                    int r33 = bVar.f610b;
                    if (r33 == r6) {
                        r6 = bVar.d;
                    } else {
                        if (r33 < r6) {
                            r6--;
                        }
                        if (bVar.d <= r6) {
                            r6++;
                        }
                    }
                }
            } else if (bVar.f610b <= r6) {
                r6 += bVar.d;
            }
        }
        return r6;
    }

    void j() {
        int size = this.f608c.size();
        for (int r2 = 0; r2 < size; r2++) {
            this.d.b(this.f608c.get(r2));
        }
        y(this.f608c);
        this.h = 0;
    }

    void k() {
        j();
        int size = this.f607b.size();
        for (int r2 = 0; r2 < size; r2++) {
            b bVar = this.f607b.get(r2);
            int r4 = bVar.f609a;
            if (r4 == 1) {
                this.d.b(bVar);
                this.d.e(bVar.f610b, bVar.d);
            } else if (r4 == 2) {
                this.d.b(bVar);
                this.d.f(bVar.f610b, bVar.d);
            } else if (r4 == 4) {
                this.d.b(bVar);
                this.d.h(bVar.f610b, bVar.d, bVar.f611c);
            } else if (r4 == 8) {
                this.d.b(bVar);
                this.d.a(bVar.f610b, bVar.d);
            }
            Runnable runnable = this.e;
            if (runnable != null) {
                runnable.run();
            }
        }
        y(this.f607b);
        this.h = 0;
    }

    void m(b bVar, int r4) {
        this.d.g(bVar);
        int r0 = bVar.f609a;
        if (r0 == 2) {
            this.d.f(r4, bVar.d);
        } else {
            if (r0 != 4) {
                throw new IllegalArgumentException("only remove and update ops can be dispatched in first pass");
            }
            this.d.h(r4, bVar.d, bVar.f611c);
        }
    }

    int n(int r2) {
        return o(r2, 0);
    }

    int o(int r6, int r7) {
        int size = this.f608c.size();
        while (r7 < size) {
            b bVar = this.f608c.get(r7);
            int r2 = bVar.f609a;
            if (r2 == 8) {
                int r22 = bVar.f610b;
                if (r22 == r6) {
                    r6 = bVar.d;
                } else {
                    if (r22 < r6) {
                        r6--;
                    }
                    if (bVar.d <= r6) {
                        r6++;
                    }
                }
            } else {
                int r3 = bVar.f610b;
                if (r3 > r6) {
                    continue;
                } else if (r2 == 2) {
                    int r1 = bVar.d;
                    if (r6 < r3 + r1) {
                        return -1;
                    }
                    r6 -= r1;
                } else if (r2 == 1) {
                    r6 += bVar.d;
                }
            }
            r7++;
        }
        return r6;
    }

    boolean p(int r2) {
        return (r2 & this.h) != 0;
    }

    boolean q() {
        return this.f607b.size() > 0;
    }

    boolean r() {
        return (this.f608c.isEmpty() || this.f607b.isEmpty()) ? false : true;
    }

    boolean s(int r5, int r6, Object obj) {
        if (r6 < 1) {
            return false;
        }
        this.f607b.add(b(4, r5, r6, obj));
        this.h |= 4;
        return this.f607b.size() == 1;
    }

    boolean t(int r5, int r6) {
        if (r6 < 1) {
            return false;
        }
        this.f607b.add(b(1, r5, r6, null));
        this.h |= 1;
        return this.f607b.size() == 1;
    }

    boolean u(int r5, int r6, int r7) {
        if (r5 == r6) {
            return false;
        }
        if (r7 != 1) {
            throw new IllegalArgumentException("Moving more than 1 item is not supported yet");
        }
        this.f607b.add(b(8, r5, r6, null));
        this.h |= 8;
        return this.f607b.size() == 1;
    }

    boolean v(int r6, int r7) {
        if (r7 < 1) {
            return false;
        }
        this.f607b.add(b(2, r6, r7, null));
        this.h |= 2;
        return this.f607b.size() == 1;
    }

    void x() {
        this.g.b(this.f607b);
        int size = this.f607b.size();
        for (int r1 = 0; r1 < size; r1++) {
            b bVar = this.f607b.get(r1);
            int r3 = bVar.f609a;
            if (r3 == 1) {
                d(bVar);
            } else if (r3 == 2) {
                g(bVar);
            } else if (r3 == 4) {
                h(bVar);
            } else if (r3 == 8) {
                e(bVar);
            }
            Runnable runnable = this.e;
            if (runnable != null) {
                runnable.run();
            }
        }
        this.f607b.clear();
    }

    void y(List<b> list) {
        int size = list.size();
        for (int r1 = 0; r1 < size; r1++) {
            a(list.get(r1));
        }
        list.clear();
    }

    void z() {
        y(this.f607b);
        y(this.f608c);
        this.h = 0;
    }
}

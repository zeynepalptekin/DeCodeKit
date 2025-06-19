package com.google.android.material.behavior;

import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.annotation.h0;
import androidx.annotation.i0;
import androidx.annotation.x0;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import b.i.p.f0;
import b.i.p.p0.d;
import b.i.p.p0.g;
import b.k.c.c;

/* loaded from: classes.dex */
public class SwipeDismissBehavior<V extends View> extends CoordinatorLayout.c<V> {
    public static final int k = 0;
    public static final int l = 1;
    public static final int m = 2;
    public static final int n = 0;
    public static final int o = 1;
    public static final int p = 2;
    private static final float q = 0.5f;
    private static final float r = 0.0f;
    private static final float s = 0.5f;

    /* renamed from: a, reason: collision with root package name */
    b.k.c.c f6616a;

    /* renamed from: b, reason: collision with root package name */
    c f6617b;

    /* renamed from: c, reason: collision with root package name */
    private boolean f6618c;
    private boolean e;
    private float d = 0.0f;
    int f = 2;
    float g = 0.5f;
    float h = 0.0f;
    float i = 0.5f;
    private final c.AbstractC0082c j = new a();

    class a extends c.AbstractC0082c {
        private static final int d = -1;

        /* renamed from: a, reason: collision with root package name */
        private int f6619a;

        /* renamed from: b, reason: collision with root package name */
        private int f6620b = -1;

        a() {
        }

        private boolean n(@h0 View view, float f) {
            if (f == 0.0f) {
                return Math.abs(view.getLeft() - this.f6619a) >= Math.round(((float) view.getWidth()) * SwipeDismissBehavior.this.g);
            }
            boolean z = f0.W(view) == 1;
            int r4 = SwipeDismissBehavior.this.f;
            if (r4 == 2) {
                return true;
            }
            if (r4 == 0) {
                if (z) {
                    if (f >= 0.0f) {
                        return false;
                    }
                } else if (f <= 0.0f) {
                    return false;
                }
                return true;
            }
            if (r4 != 1) {
                return false;
            }
            if (z) {
                if (f <= 0.0f) {
                    return false;
                }
            } else if (f >= 0.0f) {
                return false;
            }
            return true;
        }

        /* JADX WARN: Removed duplicated region for block: B:10:0x001c  */
        /* JADX WARN: Removed duplicated region for block: B:9:0x0012  */
        @Override // b.k.c.c.AbstractC0082c
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public int a(@androidx.annotation.h0 android.view.View r3, int r4, int r5) {
            /*
                r2 = this;
                int r5 = b.i.p.f0.W(r3)
                r0 = 1
                if (r5 != r0) goto L9
                r5 = 1
                goto La
            L9:
                r5 = 0
            La:
                com.google.android.material.behavior.SwipeDismissBehavior r1 = com.google.android.material.behavior.SwipeDismissBehavior.this
                int r1 = r1.f
                if (r1 != 0) goto L24
                if (r5 == 0) goto L1c
            L12:
                int r5 = r2.f6619a
                int r3 = r3.getWidth()
                int r5 = r5 - r3
                int r3 = r2.f6619a
                goto L37
            L1c:
                int r5 = r2.f6619a
                int r3 = r3.getWidth()
                int r3 = r3 + r5
                goto L37
            L24:
                if (r1 != r0) goto L29
                if (r5 == 0) goto L12
                goto L1c
            L29:
                int r5 = r2.f6619a
                int r0 = r3.getWidth()
                int r5 = r5 - r0
                int r0 = r2.f6619a
                int r3 = r3.getWidth()
                int r3 = r3 + r0
            L37:
                int r3 = com.google.android.material.behavior.SwipeDismissBehavior.I(r5, r4, r3)
                return r3
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.behavior.SwipeDismissBehavior.a.a(android.view.View, int, int):int");
        }

        @Override // b.k.c.c.AbstractC0082c
        public int b(@h0 View view, int r2, int r3) {
            return view.getTop();
        }

        @Override // b.k.c.c.AbstractC0082c
        public int d(@h0 View view) {
            return view.getWidth();
        }

        @Override // b.k.c.c.AbstractC0082c
        public void i(@h0 View view, int r2) {
            this.f6620b = r2;
            this.f6619a = view.getLeft();
            ViewParent parent = view.getParent();
            if (parent != null) {
                parent.requestDisallowInterceptTouchEvent(true);
            }
        }

        @Override // b.k.c.c.AbstractC0082c
        public void j(int r2) {
            c cVar = SwipeDismissBehavior.this.f6617b;
            if (cVar != null) {
                cVar.b(r2);
            }
        }

        @Override // b.k.c.c.AbstractC0082c
        public void k(@h0 View view, int r4, int r5, int r6, int r7) {
            float width = this.f6619a + (view.getWidth() * SwipeDismissBehavior.this.h);
            float width2 = this.f6619a + (view.getWidth() * SwipeDismissBehavior.this.i);
            float f = r4;
            if (f <= width) {
                view.setAlpha(1.0f);
            } else if (f >= width2) {
                view.setAlpha(0.0f);
            } else {
                view.setAlpha(SwipeDismissBehavior.H(0.0f, 1.0f - SwipeDismissBehavior.K(width, width2, f), 1.0f));
            }
        }

        @Override // b.k.c.c.AbstractC0082c
        public void l(@h0 View view, float f, float f2) {
            int r0;
            boolean z;
            c cVar;
            this.f6620b = -1;
            int width = view.getWidth();
            if (n(view, f)) {
                int left = view.getLeft();
                int r02 = this.f6619a;
                r0 = left < r02 ? r02 - width : r02 + width;
                z = true;
            } else {
                r0 = this.f6619a;
                z = false;
            }
            if (SwipeDismissBehavior.this.f6616a.T(r0, view.getTop())) {
                f0.i1(view, new d(view, z));
            } else {
                if (!z || (cVar = SwipeDismissBehavior.this.f6617b) == null) {
                    return;
                }
                cVar.a(view);
            }
        }

        @Override // b.k.c.c.AbstractC0082c
        public boolean m(View view, int r4) {
            int r0 = this.f6620b;
            return (r0 == -1 || r0 == r4) && SwipeDismissBehavior.this.G(view);
        }
    }

    class b implements g {
        b() {
        }

        @Override // b.i.p.p0.g
        public boolean a(@h0 View view, @i0 g.a aVar) {
            boolean z = false;
            if (!SwipeDismissBehavior.this.G(view)) {
                return false;
            }
            boolean z2 = f0.W(view) == 1;
            if ((SwipeDismissBehavior.this.f == 0 && z2) || (SwipeDismissBehavior.this.f == 1 && !z2)) {
                z = true;
            }
            int width = view.getWidth();
            if (z) {
                width = -width;
            }
            f0.Y0(view, width);
            view.setAlpha(0.0f);
            c cVar = SwipeDismissBehavior.this.f6617b;
            if (cVar != null) {
                cVar.a(view);
            }
            return true;
        }
    }

    public interface c {
        void a(View view);

        void b(int r1);
    }

    private class d implements Runnable {
        private final View d;
        private final boolean e;

        d(View view, boolean z) {
            this.d = view;
            this.e = z;
        }

        @Override // java.lang.Runnable
        public void run() {
            c cVar;
            b.k.c.c cVar2 = SwipeDismissBehavior.this.f6616a;
            if (cVar2 != null && cVar2.o(true)) {
                f0.i1(this.d, this);
            } else {
                if (!this.e || (cVar = SwipeDismissBehavior.this.f6617b) == null) {
                    return;
                }
                cVar.a(this.d);
            }
        }
    }

    static float H(float f, float f2, float f3) {
        return Math.min(Math.max(f, f2), f3);
    }

    static int I(int r0, int r1, int r2) {
        return Math.min(Math.max(r0, r1), r2);
    }

    private void J(ViewGroup viewGroup) {
        if (this.f6616a == null) {
            this.f6616a = this.e ? b.k.c.c.p(viewGroup, this.d, this.j) : b.k.c.c.q(viewGroup, this.j);
        }
    }

    static float K(float f, float f2, float f3) {
        return (f3 - f) / (f2 - f);
    }

    private void T(View view) {
        f0.k1(view, 1048576);
        if (G(view)) {
            f0.n1(view, d.a.z, null, new b());
        }
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public boolean E(CoordinatorLayout coordinatorLayout, V v, MotionEvent motionEvent) {
        b.k.c.c cVar = this.f6616a;
        if (cVar == null) {
            return false;
        }
        cVar.L(motionEvent);
        return true;
    }

    public boolean G(@h0 View view) {
        return true;
    }

    public int L() {
        b.k.c.c cVar = this.f6616a;
        if (cVar != null) {
            return cVar.E();
        }
        return 0;
    }

    @i0
    @x0
    public c M() {
        return this.f6617b;
    }

    public void N(float f) {
        this.g = H(0.0f, f, 1.0f);
    }

    public void O(float f) {
        this.i = H(0.0f, f, 1.0f);
    }

    public void P(@i0 c cVar) {
        this.f6617b = cVar;
    }

    public void Q(float f) {
        this.d = f;
        this.e = true;
    }

    public void R(float f) {
        this.h = H(0.0f, f, 1.0f);
    }

    public void S(int r1) {
        this.f = r1;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public boolean l(@h0 CoordinatorLayout coordinatorLayout, @h0 V v, @h0 MotionEvent motionEvent) {
        boolean zG = this.f6618c;
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            zG = coordinatorLayout.G(v, (int) motionEvent.getX(), (int) motionEvent.getY());
            this.f6618c = zG;
        } else if (actionMasked == 1 || actionMasked == 3) {
            this.f6618c = false;
        }
        if (!zG) {
            return false;
        }
        J(coordinatorLayout);
        return this.f6616a.U(motionEvent);
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public boolean m(@h0 CoordinatorLayout coordinatorLayout, @h0 V v, int r3) {
        boolean zM = super.m(coordinatorLayout, v, r3);
        if (f0.S(v) == 0) {
            f0.K1(v, 1);
            T(v);
        }
        return zM;
    }
}

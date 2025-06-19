package b.a.c.a;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Outline;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.SystemClock;
import android.util.SparseArray;
import androidx.annotation.h0;
import androidx.annotation.i0;
import androidx.annotation.m0;
import androidx.annotation.p0;

@p0({p0.a.LIBRARY_GROUP_PREFIX})
/* loaded from: classes.dex */
class b extends Drawable implements Drawable.Callback {
    private static final boolean p = false;
    private static final String q = "DrawableContainer";
    private static final boolean r = true;
    private c d;
    private Rect e;
    private Drawable f;
    private Drawable g;
    private boolean i;
    private boolean k;
    private Runnable l;
    private long m;
    private long n;
    private C0040b o;
    private int h = 255;
    private int j = -1;

    class a implements Runnable {
        a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            b.this.a(b.r);
            b.this.invalidateSelf();
        }
    }

    /* renamed from: b.a.c.a.b$b, reason: collision with other inner class name */
    static class C0040b implements Drawable.Callback {
        private Drawable.Callback d;

        C0040b() {
        }

        public Drawable.Callback a() {
            Drawable.Callback callback = this.d;
            this.d = null;
            return callback;
        }

        public C0040b b(Drawable.Callback callback) {
            this.d = callback;
            return this;
        }

        @Override // android.graphics.drawable.Drawable.Callback
        public void invalidateDrawable(@h0 Drawable drawable) {
        }

        @Override // android.graphics.drawable.Drawable.Callback
        public void scheduleDrawable(@h0 Drawable drawable, @h0 Runnable runnable, long j) {
            Drawable.Callback callback = this.d;
            if (callback != null) {
                callback.scheduleDrawable(drawable, runnable, j);
            }
        }

        @Override // android.graphics.drawable.Drawable.Callback
        public void unscheduleDrawable(@h0 Drawable drawable, @h0 Runnable runnable) {
            Drawable.Callback callback = this.d;
            if (callback != null) {
                callback.unscheduleDrawable(drawable, runnable);
            }
        }
    }

    static abstract class c extends Drawable.ConstantState {
        int A;
        int B;
        boolean C;
        ColorFilter D;
        boolean E;
        ColorStateList F;
        PorterDuff.Mode G;
        boolean H;
        boolean I;

        /* renamed from: a, reason: collision with root package name */
        final b f807a;

        /* renamed from: b, reason: collision with root package name */
        Resources f808b;

        /* renamed from: c, reason: collision with root package name */
        int f809c;
        int d;
        int e;
        SparseArray<Drawable.ConstantState> f;
        Drawable[] g;
        int h;
        boolean i;
        boolean j;
        Rect k;
        boolean l;
        boolean m;
        int n;
        int o;
        int p;
        int q;
        boolean r;
        int s;
        boolean t;
        boolean u;
        boolean v;
        boolean w;
        boolean x;
        boolean y;
        int z;

        c(c cVar, b bVar, Resources resources) {
            this.f809c = 160;
            this.i = false;
            this.l = false;
            this.x = b.r;
            this.A = 0;
            this.B = 0;
            this.f807a = bVar;
            this.f808b = resources != null ? resources : cVar != null ? cVar.f808b : null;
            int r4 = b.g(resources, cVar != null ? cVar.f809c : 0);
            this.f809c = r4;
            if (cVar == null) {
                this.g = new Drawable[10];
                this.h = 0;
                return;
            }
            this.d = cVar.d;
            this.e = cVar.e;
            this.v = b.r;
            this.w = b.r;
            this.i = cVar.i;
            this.l = cVar.l;
            this.x = cVar.x;
            this.y = cVar.y;
            this.z = cVar.z;
            this.A = cVar.A;
            this.B = cVar.B;
            this.C = cVar.C;
            this.D = cVar.D;
            this.E = cVar.E;
            this.F = cVar.F;
            this.G = cVar.G;
            this.H = cVar.H;
            this.I = cVar.I;
            if (cVar.f809c == r4) {
                if (cVar.j) {
                    this.k = new Rect(cVar.k);
                    this.j = b.r;
                }
                if (cVar.m) {
                    this.n = cVar.n;
                    this.o = cVar.o;
                    this.p = cVar.p;
                    this.q = cVar.q;
                    this.m = b.r;
                }
            }
            if (cVar.r) {
                this.s = cVar.s;
                this.r = b.r;
            }
            if (cVar.t) {
                this.u = cVar.u;
                this.t = b.r;
            }
            Drawable[] drawableArr = cVar.g;
            this.g = new Drawable[drawableArr.length];
            this.h = cVar.h;
            SparseArray<Drawable.ConstantState> sparseArray = cVar.f;
            this.f = sparseArray != null ? sparseArray.clone() : new SparseArray<>(this.h);
            int r3 = this.h;
            for (int r0 = 0; r0 < r3; r0++) {
                if (drawableArr[r0] != null) {
                    Drawable.ConstantState constantState = drawableArr[r0].getConstantState();
                    if (constantState != null) {
                        this.f.put(r0, constantState);
                    } else {
                        this.g[r0] = drawableArr[r0];
                    }
                }
            }
        }

        private void f() {
            SparseArray<Drawable.ConstantState> sparseArray = this.f;
            if (sparseArray != null) {
                int size = sparseArray.size();
                for (int r1 = 0; r1 < size; r1++) {
                    this.g[this.f.keyAt(r1)] = w(this.f.valueAt(r1).newDrawable(this.f808b));
                }
                this.f = null;
            }
        }

        private Drawable w(Drawable drawable) {
            if (Build.VERSION.SDK_INT >= 23) {
                drawable.setLayoutDirection(this.z);
            }
            Drawable drawableMutate = drawable.mutate();
            drawableMutate.setCallback(this.f807a);
            return drawableMutate;
        }

        final boolean A(int r8, int r9) {
            int r0 = this.h;
            Drawable[] drawableArr = this.g;
            boolean z = false;
            for (int r3 = 0; r3 < r0; r3++) {
                if (drawableArr[r3] != null) {
                    boolean layoutDirection = Build.VERSION.SDK_INT >= 23 ? drawableArr[r3].setLayoutDirection(r8) : false;
                    if (r3 == r9) {
                        z = layoutDirection;
                    }
                }
            }
            this.z = r8;
            return z;
        }

        public final void B(boolean z) {
            this.i = z;
        }

        final void C(Resources resources) {
            if (resources != null) {
                this.f808b = resources;
                int r2 = b.g(resources, this.f809c);
                int r0 = this.f809c;
                this.f809c = r2;
                if (r0 != r2) {
                    this.m = false;
                    this.j = false;
                }
            }
        }

        public final int a(Drawable drawable) {
            int r0 = this.h;
            if (r0 >= this.g.length) {
                r(r0, r0 + 10);
            }
            drawable.mutate();
            drawable.setVisible(false, b.r);
            drawable.setCallback(this.f807a);
            this.g[r0] = drawable;
            this.h++;
            this.e = drawable.getChangingConfigurations() | this.e;
            s();
            this.k = null;
            this.j = false;
            this.m = false;
            this.v = false;
            return r0;
        }

        @m0(21)
        final void b(Resources.Theme theme) {
            if (theme != null) {
                f();
                int r0 = this.h;
                Drawable[] drawableArr = this.g;
                for (int r2 = 0; r2 < r0; r2++) {
                    if (drawableArr[r2] != null && drawableArr[r2].canApplyTheme()) {
                        drawableArr[r2].applyTheme(theme);
                        this.e |= drawableArr[r2].getChangingConfigurations();
                    }
                }
                C(theme.getResources());
            }
        }

        public synchronized boolean c() {
            if (this.v) {
                return this.w;
            }
            f();
            this.v = b.r;
            int r1 = this.h;
            Drawable[] drawableArr = this.g;
            for (int r4 = 0; r4 < r1; r4++) {
                if (drawableArr[r4].getConstantState() == null) {
                    this.w = false;
                    return false;
                }
            }
            this.w = b.r;
            return b.r;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        @m0(21)
        public boolean canApplyTheme() {
            int r0 = this.h;
            Drawable[] drawableArr = this.g;
            for (int r3 = 0; r3 < r0; r3++) {
                Drawable drawable = drawableArr[r3];
                if (drawable == null) {
                    Drawable.ConstantState constantState = this.f.get(r3);
                    if (constantState != null && constantState.canApplyTheme()) {
                        return b.r;
                    }
                } else if (drawable.canApplyTheme()) {
                    return b.r;
                }
            }
            return false;
        }

        final void d() {
            this.y = false;
        }

        protected void e() {
            this.m = b.r;
            f();
            int r0 = this.h;
            Drawable[] drawableArr = this.g;
            this.o = -1;
            this.n = -1;
            this.q = 0;
            this.p = 0;
            for (int r2 = 0; r2 < r0; r2++) {
                Drawable drawable = drawableArr[r2];
                int intrinsicWidth = drawable.getIntrinsicWidth();
                if (intrinsicWidth > this.n) {
                    this.n = intrinsicWidth;
                }
                int intrinsicHeight = drawable.getIntrinsicHeight();
                if (intrinsicHeight > this.o) {
                    this.o = intrinsicHeight;
                }
                int minimumWidth = drawable.getMinimumWidth();
                if (minimumWidth > this.p) {
                    this.p = minimumWidth;
                }
                int minimumHeight = drawable.getMinimumHeight();
                if (minimumHeight > this.q) {
                    this.q = minimumHeight;
                }
            }
        }

        final int g() {
            return this.g.length;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public int getChangingConfigurations() {
            return this.d | this.e;
        }

        public final Drawable h(int r5) {
            int r0;
            Drawable drawable = this.g[r5];
            if (drawable != null) {
                return drawable;
            }
            SparseArray<Drawable.ConstantState> sparseArray = this.f;
            if (sparseArray == null || (r0 = sparseArray.indexOfKey(r5)) < 0) {
                return null;
            }
            Drawable drawableW = w(this.f.valueAt(r0).newDrawable(this.f808b));
            this.g[r5] = drawableW;
            this.f.removeAt(r0);
            if (this.f.size() == 0) {
                this.f = null;
            }
            return drawableW;
        }

        public final int i() {
            return this.h;
        }

        public final int j() {
            if (!this.m) {
                e();
            }
            return this.o;
        }

        public final int k() {
            if (!this.m) {
                e();
            }
            return this.q;
        }

        public final int l() {
            if (!this.m) {
                e();
            }
            return this.p;
        }

        public final Rect m() {
            Rect rect = null;
            if (this.i) {
                return null;
            }
            if (this.k != null || this.j) {
                return this.k;
            }
            f();
            Rect rect2 = new Rect();
            int r2 = this.h;
            Drawable[] drawableArr = this.g;
            for (int r5 = 0; r5 < r2; r5++) {
                if (drawableArr[r5].getPadding(rect2)) {
                    if (rect == null) {
                        rect = new Rect(0, 0, 0, 0);
                    }
                    int r6 = rect2.left;
                    if (r6 > rect.left) {
                        rect.left = r6;
                    }
                    int r62 = rect2.top;
                    if (r62 > rect.top) {
                        rect.top = r62;
                    }
                    int r63 = rect2.right;
                    if (r63 > rect.right) {
                        rect.right = r63;
                    }
                    int r64 = rect2.bottom;
                    if (r64 > rect.bottom) {
                        rect.bottom = r64;
                    }
                }
            }
            this.j = b.r;
            this.k = rect;
            return rect;
        }

        public final int n() {
            if (!this.m) {
                e();
            }
            return this.n;
        }

        public final int o() {
            return this.A;
        }

        public final int p() {
            return this.B;
        }

        public final int q() {
            if (this.r) {
                return this.s;
            }
            f();
            int r0 = this.h;
            Drawable[] drawableArr = this.g;
            int opacity = r0 > 0 ? drawableArr[0].getOpacity() : -2;
            for (int r4 = 1; r4 < r0; r4++) {
                opacity = Drawable.resolveOpacity(opacity, drawableArr[r4].getOpacity());
            }
            this.s = opacity;
            this.r = b.r;
            return opacity;
        }

        public void r(int r3, int r4) {
            Drawable[] drawableArr = new Drawable[r4];
            System.arraycopy(this.g, 0, drawableArr, 0, r3);
            this.g = drawableArr;
        }

        void s() {
            this.r = false;
            this.t = false;
        }

        public final boolean t() {
            return this.l;
        }

        public final boolean u() {
            if (this.t) {
                return this.u;
            }
            f();
            int r0 = this.h;
            Drawable[] drawableArr = this.g;
            boolean z = false;
            int r3 = 0;
            while (true) {
                if (r3 >= r0) {
                    break;
                }
                if (drawableArr[r3].isStateful()) {
                    z = b.r;
                    break;
                }
                r3++;
            }
            this.u = z;
            this.t = b.r;
            return z;
        }

        void v() {
            int r0 = this.h;
            Drawable[] drawableArr = this.g;
            for (int r2 = 0; r2 < r0; r2++) {
                if (drawableArr[r2] != null) {
                    drawableArr[r2].mutate();
                }
            }
            this.y = b.r;
        }

        public final void x(boolean z) {
            this.l = z;
        }

        public final void y(int r1) {
            this.A = r1;
        }

        public final void z(int r1) {
            this.B = r1;
        }
    }

    b() {
    }

    private void e(Drawable drawable) {
        if (this.o == null) {
            this.o = new C0040b();
        }
        drawable.setCallback(this.o.b(drawable.getCallback()));
        try {
            if (this.d.A <= 0 && this.i) {
                drawable.setAlpha(this.h);
            }
            if (this.d.E) {
                drawable.setColorFilter(this.d.D);
            } else {
                if (this.d.H) {
                    androidx.core.graphics.drawable.a.o(drawable, this.d.F);
                }
                if (this.d.I) {
                    androidx.core.graphics.drawable.a.p(drawable, this.d.G);
                }
            }
            drawable.setVisible(isVisible(), r);
            drawable.setDither(this.d.x);
            drawable.setState(getState());
            drawable.setLevel(getLevel());
            drawable.setBounds(getBounds());
            if (Build.VERSION.SDK_INT >= 23) {
                drawable.setLayoutDirection(getLayoutDirection());
            }
            if (Build.VERSION.SDK_INT >= 19) {
                drawable.setAutoMirrored(this.d.C);
            }
            Rect rect = this.e;
            if (Build.VERSION.SDK_INT >= 21 && rect != null) {
                drawable.setHotspotBounds(rect.left, rect.top, rect.right, rect.bottom);
            }
        } finally {
            drawable.setCallback(this.o.a());
        }
    }

    private boolean f() {
        if (isAutoMirrored() && androidx.core.graphics.drawable.a.f(this) == 1) {
            return r;
        }
        return false;
    }

    static int g(@i0 Resources resources, int r1) {
        if (resources != null) {
            r1 = resources.getDisplayMetrics().densityDpi;
        }
        if (r1 == 0) {
            return 160;
        }
        return r1;
    }

    void a(boolean z) {
        boolean z2;
        boolean z3 = r;
        this.i = r;
        long jUptimeMillis = SystemClock.uptimeMillis();
        Drawable drawable = this.f;
        if (drawable != null) {
            long j = this.m;
            if (j == 0) {
                z2 = false;
            } else if (j <= jUptimeMillis) {
                drawable.setAlpha(this.h);
                this.m = 0L;
                z2 = false;
            } else {
                drawable.setAlpha(((255 - (((int) ((j - jUptimeMillis) * 255)) / this.d.A)) * this.h) / 255);
                z2 = r;
            }
        } else {
            this.m = 0L;
            z2 = false;
        }
        Drawable drawable2 = this.g;
        if (drawable2 != null) {
            long j2 = this.n;
            if (j2 == 0) {
                z3 = z2;
            } else if (j2 <= jUptimeMillis) {
                drawable2.setVisible(false, false);
                this.g = null;
                this.n = 0L;
                z3 = z2;
            } else {
                drawable2.setAlpha(((((int) ((j2 - jUptimeMillis) * 255)) / this.d.B) * this.h) / 255);
            }
        } else {
            this.n = 0L;
            z3 = z2;
        }
        if (z && z3) {
            scheduleSelf(this.l, jUptimeMillis + 16);
        }
    }

    @Override // android.graphics.drawable.Drawable
    @m0(21)
    public void applyTheme(@h0 Resources.Theme theme) {
        this.d.b(theme);
    }

    void b() {
        this.d.d();
        this.k = false;
    }

    c c() {
        return this.d;
    }

    @Override // android.graphics.drawable.Drawable
    @m0(21)
    public boolean canApplyTheme() {
        return this.d.canApplyTheme();
    }

    int d() {
        return this.j;
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(@h0 Canvas canvas) {
        Drawable drawable = this.f;
        if (drawable != null) {
            drawable.draw(canvas);
        }
        Drawable drawable2 = this.g;
        if (drawable2 != null) {
            drawable2.draw(canvas);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public int getAlpha() {
        return this.h;
    }

    @Override // android.graphics.drawable.Drawable
    public int getChangingConfigurations() {
        return super.getChangingConfigurations() | this.d.getChangingConfigurations();
    }

    @Override // android.graphics.drawable.Drawable
    public final Drawable.ConstantState getConstantState() {
        if (!this.d.c()) {
            return null;
        }
        this.d.d = getChangingConfigurations();
        return this.d;
    }

    @Override // android.graphics.drawable.Drawable
    @h0
    public Drawable getCurrent() {
        return this.f;
    }

    @Override // android.graphics.drawable.Drawable
    public void getHotspotBounds(@h0 Rect rect) {
        Rect rect2 = this.e;
        if (rect2 != null) {
            rect.set(rect2);
        } else {
            super.getHotspotBounds(rect);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicHeight() {
        if (this.d.t()) {
            return this.d.j();
        }
        Drawable drawable = this.f;
        if (drawable != null) {
            return drawable.getIntrinsicHeight();
        }
        return -1;
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicWidth() {
        if (this.d.t()) {
            return this.d.n();
        }
        Drawable drawable = this.f;
        if (drawable != null) {
            return drawable.getIntrinsicWidth();
        }
        return -1;
    }

    @Override // android.graphics.drawable.Drawable
    public int getMinimumHeight() {
        if (this.d.t()) {
            return this.d.k();
        }
        Drawable drawable = this.f;
        if (drawable != null) {
            return drawable.getMinimumHeight();
        }
        return 0;
    }

    @Override // android.graphics.drawable.Drawable
    public int getMinimumWidth() {
        if (this.d.t()) {
            return this.d.l();
        }
        Drawable drawable = this.f;
        if (drawable != null) {
            return drawable.getMinimumWidth();
        }
        return 0;
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        Drawable drawable = this.f;
        if (drawable == null || !drawable.isVisible()) {
            return -2;
        }
        return this.d.q();
    }

    @Override // android.graphics.drawable.Drawable
    @m0(21)
    public void getOutline(@h0 Outline outline) {
        Drawable drawable = this.f;
        if (drawable != null) {
            drawable.getOutline(outline);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public boolean getPadding(@h0 Rect rect) {
        boolean padding;
        Rect rectM = this.d.m();
        if (rectM != null) {
            rect.set(rectM);
            padding = (rectM.right | ((rectM.left | rectM.top) | rectM.bottom)) != 0 ? r : false;
        } else {
            Drawable drawable = this.f;
            padding = drawable != null ? drawable.getPadding(rect) : super.getPadding(rect);
        }
        if (f()) {
            int r1 = rect.left;
            rect.left = rect.right;
            rect.right = r1;
        }
        return padding;
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x0055  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    boolean h(int r10) {
        /*
            r9 = this;
            int r0 = r9.j
            r1 = 0
            if (r10 != r0) goto L6
            return r1
        L6:
            long r2 = android.os.SystemClock.uptimeMillis()
            b.a.c.a.b$c r0 = r9.d
            int r0 = r0.B
            r4 = 0
            r5 = 0
            if (r0 <= 0) goto L2e
            android.graphics.drawable.Drawable r0 = r9.g
            if (r0 == 0) goto L1a
            r0.setVisible(r1, r1)
        L1a:
            android.graphics.drawable.Drawable r0 = r9.f
            if (r0 == 0) goto L29
            r9.g = r0
            b.a.c.a.b$c r0 = r9.d
            int r0 = r0.B
            long r0 = (long) r0
            long r0 = r0 + r2
            r9.n = r0
            goto L35
        L29:
            r9.g = r4
            r9.n = r5
            goto L35
        L2e:
            android.graphics.drawable.Drawable r0 = r9.f
            if (r0 == 0) goto L35
            r0.setVisible(r1, r1)
        L35:
            if (r10 < 0) goto L55
            b.a.c.a.b$c r0 = r9.d
            int r1 = r0.h
            if (r10 >= r1) goto L55
            android.graphics.drawable.Drawable r0 = r0.h(r10)
            r9.f = r0
            r9.j = r10
            if (r0 == 0) goto L5a
            b.a.c.a.b$c r10 = r9.d
            int r10 = r10.A
            if (r10 <= 0) goto L51
            long r7 = (long) r10
            long r2 = r2 + r7
            r9.m = r2
        L51:
            r9.e(r0)
            goto L5a
        L55:
            r9.f = r4
            r10 = -1
            r9.j = r10
        L5a:
            long r0 = r9.m
            r10 = 1
            int r2 = (r0 > r5 ? 1 : (r0 == r5 ? 0 : -1))
            if (r2 != 0) goto L67
            long r0 = r9.n
            int r2 = (r0 > r5 ? 1 : (r0 == r5 ? 0 : -1))
            if (r2 == 0) goto L79
        L67:
            java.lang.Runnable r0 = r9.l
            if (r0 != 0) goto L73
            b.a.c.a.b$a r0 = new b.a.c.a.b$a
            r0.<init>()
            r9.l = r0
            goto L76
        L73:
            r9.unscheduleSelf(r0)
        L76:
            r9.a(r10)
        L79:
            r9.invalidateSelf()
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: b.a.c.a.b.h(int):boolean");
    }

    void i(c cVar) {
        this.d = cVar;
        int r0 = this.j;
        if (r0 >= 0) {
            Drawable drawableH = cVar.h(r0);
            this.f = drawableH;
            if (drawableH != null) {
                e(drawableH);
            }
        }
        this.g = null;
    }

    public void invalidateDrawable(@h0 Drawable drawable) {
        c cVar = this.d;
        if (cVar != null) {
            cVar.s();
        }
        if (drawable != this.f || getCallback() == null) {
            return;
        }
        getCallback().invalidateDrawable(this);
    }

    @Override // android.graphics.drawable.Drawable
    public boolean isAutoMirrored() {
        return this.d.C;
    }

    @Override // android.graphics.drawable.Drawable
    public boolean isStateful() {
        return this.d.u();
    }

    void j(int r1) {
        h(r1);
    }

    @Override // android.graphics.drawable.Drawable
    public void jumpToCurrentState() {
        boolean z;
        Drawable drawable = this.g;
        boolean z2 = r;
        if (drawable != null) {
            drawable.jumpToCurrentState();
            this.g = null;
            z = r;
        } else {
            z = false;
        }
        Drawable drawable2 = this.f;
        if (drawable2 != null) {
            drawable2.jumpToCurrentState();
            if (this.i) {
                this.f.setAlpha(this.h);
            }
        }
        if (this.n != 0) {
            this.n = 0L;
            z = r;
        }
        if (this.m != 0) {
            this.m = 0L;
        } else {
            z2 = z;
        }
        if (z2) {
            invalidateSelf();
        }
    }

    public void k(int r2) {
        this.d.A = r2;
    }

    public void l(int r2) {
        this.d.B = r2;
    }

    final void m(Resources resources) {
        this.d.C(resources);
    }

    @Override // android.graphics.drawable.Drawable
    @h0
    public Drawable mutate() {
        if (!this.k && super.mutate() == this) {
            c cVarC = c();
            cVarC.v();
            i(cVarC);
            this.k = r;
        }
        return this;
    }

    @Override // android.graphics.drawable.Drawable
    protected void onBoundsChange(Rect rect) {
        Drawable drawable = this.g;
        if (drawable != null) {
            drawable.setBounds(rect);
        }
        Drawable drawable2 = this.f;
        if (drawable2 != null) {
            drawable2.setBounds(rect);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public boolean onLayoutDirectionChanged(int r3) {
        return this.d.A(r3, d());
    }

    @Override // android.graphics.drawable.Drawable
    protected boolean onLevelChange(int r2) {
        Drawable drawable = this.g;
        if (drawable != null) {
            return drawable.setLevel(r2);
        }
        Drawable drawable2 = this.f;
        if (drawable2 != null) {
            return drawable2.setLevel(r2);
        }
        return false;
    }

    @Override // android.graphics.drawable.Drawable
    protected boolean onStateChange(int[] r2) {
        Drawable drawable = this.g;
        if (drawable != null) {
            return drawable.setState(r2);
        }
        Drawable drawable2 = this.f;
        if (drawable2 != null) {
            return drawable2.setState(r2);
        }
        return false;
    }

    public void scheduleDrawable(@h0 Drawable drawable, @h0 Runnable runnable, long j) {
        if (drawable != this.f || getCallback() == null) {
            return;
        }
        getCallback().scheduleDrawable(this, runnable, j);
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int r7) {
        if (this.i && this.h == r7) {
            return;
        }
        this.i = r;
        this.h = r7;
        Drawable drawable = this.f;
        if (drawable != null) {
            if (this.m == 0) {
                drawable.setAlpha(r7);
            } else {
                a(false);
            }
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setAutoMirrored(boolean z) {
        c cVar = this.d;
        if (cVar.C != z) {
            cVar.C = z;
            Drawable drawable = this.f;
            if (drawable != null) {
                androidx.core.graphics.drawable.a.j(drawable, z);
            }
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
        c cVar = this.d;
        cVar.E = r;
        if (cVar.D != colorFilter) {
            cVar.D = colorFilter;
            Drawable drawable = this.f;
            if (drawable != null) {
                drawable.setColorFilter(colorFilter);
            }
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setDither(boolean z) {
        c cVar = this.d;
        if (cVar.x != z) {
            cVar.x = z;
            Drawable drawable = this.f;
            if (drawable != null) {
                drawable.setDither(z);
            }
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setHotspot(float f, float f2) {
        Drawable drawable = this.f;
        if (drawable != null) {
            androidx.core.graphics.drawable.a.k(drawable, f, f2);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setHotspotBounds(int r2, int r3, int r4, int r5) {
        Rect rect = this.e;
        if (rect == null) {
            this.e = new Rect(r2, r3, r4, r5);
        } else {
            rect.set(r2, r3, r4, r5);
        }
        Drawable drawable = this.f;
        if (drawable != null) {
            androidx.core.graphics.drawable.a.l(drawable, r2, r3, r4, r5);
        }
    }

    @Override // android.graphics.drawable.Drawable, androidx.core.graphics.drawable.e
    public void setTintList(ColorStateList colorStateList) {
        c cVar = this.d;
        cVar.H = r;
        if (cVar.F != colorStateList) {
            cVar.F = colorStateList;
            androidx.core.graphics.drawable.a.o(this.f, colorStateList);
        }
    }

    @Override // android.graphics.drawable.Drawable, androidx.core.graphics.drawable.e
    public void setTintMode(@h0 PorterDuff.Mode mode) {
        c cVar = this.d;
        cVar.I = r;
        if (cVar.G != mode) {
            cVar.G = mode;
            androidx.core.graphics.drawable.a.p(this.f, mode);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public boolean setVisible(boolean z, boolean z2) {
        boolean visible = super.setVisible(z, z2);
        Drawable drawable = this.g;
        if (drawable != null) {
            drawable.setVisible(z, z2);
        }
        Drawable drawable2 = this.f;
        if (drawable2 != null) {
            drawable2.setVisible(z, z2);
        }
        return visible;
    }

    public void unscheduleDrawable(@h0 Drawable drawable, @h0 Runnable runnable) {
        if (drawable != this.f || getCallback() == null) {
            return;
        }
        getCallback().unscheduleDrawable(this, runnable);
    }
}

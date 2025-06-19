package b.a.f;

import android.view.View;
import android.view.animation.Interpolator;
import androidx.annotation.p0;
import b.i.p.j0;
import b.i.p.k0;
import b.i.p.l0;
import java.util.ArrayList;
import java.util.Iterator;

@p0({p0.a.LIBRARY_GROUP_PREFIX})
/* loaded from: classes.dex */
public class h {

    /* renamed from: c, reason: collision with root package name */
    private Interpolator f833c;
    k0 d;
    private boolean e;

    /* renamed from: b, reason: collision with root package name */
    private long f832b = -1;
    private final l0 f = new a();

    /* renamed from: a, reason: collision with root package name */
    final ArrayList<j0> f831a = new ArrayList<>();

    class a extends l0 {

        /* renamed from: a, reason: collision with root package name */
        private boolean f834a = false;

        /* renamed from: b, reason: collision with root package name */
        private int f835b = 0;

        a() {
        }

        @Override // b.i.p.l0, b.i.p.k0
        public void b(View view) {
            int r2 = this.f835b + 1;
            this.f835b = r2;
            if (r2 == h.this.f831a.size()) {
                k0 k0Var = h.this.d;
                if (k0Var != null) {
                    k0Var.b(null);
                }
                d();
            }
        }

        @Override // b.i.p.l0, b.i.p.k0
        public void c(View view) {
            if (this.f834a) {
                return;
            }
            this.f834a = true;
            k0 k0Var = h.this.d;
            if (k0Var != null) {
                k0Var.c(null);
            }
        }

        void d() {
            this.f835b = 0;
            this.f834a = false;
            h.this.b();
        }
    }

    public void a() {
        if (this.e) {
            Iterator<j0> it = this.f831a.iterator();
            while (it.hasNext()) {
                it.next().c();
            }
            this.e = false;
        }
    }

    void b() {
        this.e = false;
    }

    public h c(j0 j0Var) {
        if (!this.e) {
            this.f831a.add(j0Var);
        }
        return this;
    }

    public h d(j0 j0Var, j0 j0Var2) {
        this.f831a.add(j0Var);
        j0Var2.u(j0Var.d());
        this.f831a.add(j0Var2);
        return this;
    }

    public h e(long j) {
        if (!this.e) {
            this.f832b = j;
        }
        return this;
    }

    public h f(Interpolator interpolator) {
        if (!this.e) {
            this.f833c = interpolator;
        }
        return this;
    }

    public h g(k0 k0Var) {
        if (!this.e) {
            this.d = k0Var;
        }
        return this;
    }

    public void h() {
        if (this.e) {
            return;
        }
        Iterator<j0> it = this.f831a.iterator();
        while (it.hasNext()) {
            j0 next = it.next();
            long j = this.f832b;
            if (j >= 0) {
                next.q(j);
            }
            Interpolator interpolator = this.f833c;
            if (interpolator != null) {
                next.r(interpolator);
            }
            if (this.d != null) {
                next.s(this.f);
            }
            next.w();
        }
        this.e = true;
    }
}

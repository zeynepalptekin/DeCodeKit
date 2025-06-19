package androidx.recyclerview.widget;

import android.view.View;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/* loaded from: classes.dex */
class g0 {

    /* renamed from: c, reason: collision with root package name */
    static final int f652c = 1;
    static final int d = 2;
    static final int e = 4;
    static final int f = 0;
    static final int g = 1;
    static final int h = 2;
    static final int i = 4;
    static final int j = 4;
    static final int k = 16;
    static final int l = 32;
    static final int m = 64;
    static final int n = 8;
    static final int o = 256;
    static final int p = 512;
    static final int q = 1024;
    static final int r = 12;
    static final int s = 4096;
    static final int t = 8192;
    static final int u = 16384;
    static final int v = 7;

    /* renamed from: a, reason: collision with root package name */
    final b f653a;

    /* renamed from: b, reason: collision with root package name */
    a f654b = new a();

    static class a {

        /* renamed from: a, reason: collision with root package name */
        int f655a = 0;

        /* renamed from: b, reason: collision with root package name */
        int f656b;

        /* renamed from: c, reason: collision with root package name */
        int f657c;
        int d;
        int e;

        a() {
        }

        void a(int r2) {
            this.f655a = r2 | this.f655a;
        }

        boolean b() {
            int r0 = this.f655a;
            if ((r0 & 7) != 0 && (r0 & (c(this.d, this.f656b) << 0)) == 0) {
                return false;
            }
            int r02 = this.f655a;
            if ((r02 & 112) != 0 && (r02 & (c(this.d, this.f657c) << 4)) == 0) {
                return false;
            }
            int r03 = this.f655a;
            if ((r03 & 1792) != 0 && (r03 & (c(this.e, this.f656b) << 8)) == 0) {
                return false;
            }
            int r04 = this.f655a;
            return (r04 & 28672) == 0 || (r04 & (c(this.e, this.f657c) << 12)) != 0;
        }

        int c(int r1, int r2) {
            if (r1 > r2) {
                return 1;
            }
            return r1 == r2 ? 2 : 4;
        }

        void d() {
            this.f655a = 0;
        }

        void e(int r1, int r2, int r3, int r4) {
            this.f656b = r1;
            this.f657c = r2;
            this.d = r3;
            this.e = r4;
        }
    }

    interface b {
        View a(int r1);

        int b();

        int c(View view);

        int d();

        int e(View view);
    }

    @Retention(RetentionPolicy.SOURCE)
    public @interface c {
    }

    g0(b bVar) {
        this.f653a = bVar;
    }

    View a(int r9, int r10, int r11, int r12) {
        int r0 = this.f653a.d();
        int r1 = this.f653a.b();
        int r2 = r10 > r9 ? 1 : -1;
        View view = null;
        while (r9 != r10) {
            View viewA = this.f653a.a(r9);
            this.f654b.e(r0, r1, this.f653a.c(viewA), this.f653a.e(viewA));
            if (r11 != 0) {
                this.f654b.d();
                this.f654b.a(r11);
                if (this.f654b.b()) {
                    return viewA;
                }
            }
            if (r12 != 0) {
                this.f654b.d();
                this.f654b.a(r12);
                if (this.f654b.b()) {
                    view = viewA;
                }
            }
            r9 += r2;
        }
        return view;
    }

    boolean b(View view, int r7) {
        this.f654b.e(this.f653a.d(), this.f653a.b(), this.f653a.c(view), this.f653a.e(view));
        if (r7 == 0) {
            return false;
        }
        this.f654b.d();
        this.f654b.a(r7);
        return this.f654b.b();
    }
}

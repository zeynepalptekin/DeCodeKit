package c.a.b.c.u;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Path;
import android.graphics.RectF;
import androidx.annotation.h0;
import androidx.annotation.m0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes.dex */
public class q {
    private static final float j = 270.0f;
    protected static final float k = 180.0f;

    /* renamed from: a, reason: collision with root package name */
    @Deprecated
    public float f2035a;

    /* renamed from: b, reason: collision with root package name */
    @Deprecated
    public float f2036b;

    /* renamed from: c, reason: collision with root package name */
    @Deprecated
    public float f2037c;

    @Deprecated
    public float d;

    @Deprecated
    public float e;

    @Deprecated
    public float f;
    private final List<g> g = new ArrayList();
    private final List<i> h = new ArrayList();
    private boolean i;

    class a extends i {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ List f2038b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ Matrix f2039c;

        a(List list, Matrix matrix) {
            this.f2038b = list;
            this.f2039c = matrix;
        }

        @Override // c.a.b.c.u.q.i
        public void a(Matrix matrix, c.a.b.c.t.b bVar, int r5, Canvas canvas) {
            Iterator it = this.f2038b.iterator();
            while (it.hasNext()) {
                ((i) it.next()).a(this.f2039c, bVar, r5, canvas);
            }
        }
    }

    static class b extends i {

        /* renamed from: b, reason: collision with root package name */
        private final d f2040b;

        public b(d dVar) {
            this.f2040b = dVar;
        }

        @Override // c.a.b.c.u.q.i
        public void a(Matrix matrix, @h0 c.a.b.c.t.b bVar, int r11, @h0 Canvas canvas) {
            bVar.a(canvas, matrix, new RectF(this.f2040b.k(), this.f2040b.o(), this.f2040b.l(), this.f2040b.j()), r11, this.f2040b.m(), this.f2040b.n());
        }
    }

    static class c extends i {

        /* renamed from: b, reason: collision with root package name */
        private final f f2041b;

        /* renamed from: c, reason: collision with root package name */
        private final float f2042c;
        private final float d;

        public c(f fVar, float f, float f2) {
            this.f2041b = fVar;
            this.f2042c = f;
            this.d = f2;
        }

        @Override // c.a.b.c.u.q.i
        public void a(Matrix matrix, @h0 c.a.b.c.t.b bVar, int r8, @h0 Canvas canvas) {
            RectF rectF = new RectF(0.0f, 0.0f, (float) Math.hypot(this.f2041b.f2048c - this.d, this.f2041b.f2047b - this.f2042c), 0.0f);
            Matrix matrix2 = new Matrix(matrix);
            matrix2.preTranslate(this.f2042c, this.d);
            matrix2.preRotate(c());
            bVar.b(canvas, matrix2, rectF, r8);
        }

        float c() {
            return (float) Math.toDegrees(Math.atan((this.f2041b.f2048c - this.d) / (this.f2041b.f2047b - this.f2042c)));
        }
    }

    public static class d extends g {
        private static final RectF h = new RectF();

        /* renamed from: b, reason: collision with root package name */
        @Deprecated
        public float f2043b;

        /* renamed from: c, reason: collision with root package name */
        @Deprecated
        public float f2044c;

        @Deprecated
        public float d;

        @Deprecated
        public float e;

        @Deprecated
        public float f;

        @Deprecated
        public float g;

        public d(float f, float f2, float f3, float f4) {
            q(f);
            u(f2);
            r(f3);
            p(f4);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public float j() {
            return this.e;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public float k() {
            return this.f2043b;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public float l() {
            return this.d;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public float m() {
            return this.f;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public float n() {
            return this.g;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public float o() {
            return this.f2044c;
        }

        private void p(float f) {
            this.e = f;
        }

        private void q(float f) {
            this.f2043b = f;
        }

        private void r(float f) {
            this.d = f;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void s(float f) {
            this.f = f;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void t(float f) {
            this.g = f;
        }

        private void u(float f) {
            this.f2044c = f;
        }

        @Override // c.a.b.c.u.q.g
        public void a(@h0 Matrix matrix, @h0 Path path) {
            Matrix matrix2 = this.f2049a;
            matrix.invert(matrix2);
            path.transform(matrix2);
            h.set(k(), o(), l(), j());
            path.arcTo(h, m(), n(), false);
            path.transform(matrix);
        }
    }

    public static class e extends g {

        /* renamed from: b, reason: collision with root package name */
        private float f2045b;

        /* renamed from: c, reason: collision with root package name */
        private float f2046c;
        private float d;
        private float e;
        private float f;
        private float g;

        public e(float f, float f2, float f3, float f4, float f5, float f6) {
            h(f);
            j(f2);
            i(f3);
            k(f4);
            l(f5);
            m(f6);
        }

        private float b() {
            return this.f2045b;
        }

        private float c() {
            return this.d;
        }

        private float d() {
            return this.f2046c;
        }

        private float e() {
            return this.f2046c;
        }

        private float f() {
            return this.f;
        }

        private float g() {
            return this.g;
        }

        private void h(float f) {
            this.f2045b = f;
        }

        private void i(float f) {
            this.d = f;
        }

        private void j(float f) {
            this.f2046c = f;
        }

        private void k(float f) {
            this.e = f;
        }

        private void l(float f) {
            this.f = f;
        }

        private void m(float f) {
            this.g = f;
        }

        @Override // c.a.b.c.u.q.g
        public void a(@h0 Matrix matrix, @h0 Path path) {
            Matrix matrix2 = this.f2049a;
            matrix.invert(matrix2);
            path.transform(matrix2);
            path.cubicTo(this.f2045b, this.f2046c, this.d, this.e, this.f, this.g);
            path.transform(matrix);
        }
    }

    public static class f extends g {

        /* renamed from: b, reason: collision with root package name */
        private float f2047b;

        /* renamed from: c, reason: collision with root package name */
        private float f2048c;

        @Override // c.a.b.c.u.q.g
        public void a(@h0 Matrix matrix, @h0 Path path) {
            Matrix matrix2 = this.f2049a;
            matrix.invert(matrix2);
            path.transform(matrix2);
            path.lineTo(this.f2047b, this.f2048c);
            path.transform(matrix);
        }
    }

    public static abstract class g {

        /* renamed from: a, reason: collision with root package name */
        protected final Matrix f2049a = new Matrix();

        public abstract void a(Matrix matrix, Path path);
    }

    public static class h extends g {

        /* renamed from: b, reason: collision with root package name */
        @Deprecated
        public float f2050b;

        /* renamed from: c, reason: collision with root package name */
        @Deprecated
        public float f2051c;

        @Deprecated
        public float d;

        @Deprecated
        public float e;

        private float f() {
            return this.f2050b;
        }

        private float g() {
            return this.f2051c;
        }

        private float h() {
            return this.d;
        }

        private float i() {
            return this.e;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void j(float f) {
            this.f2050b = f;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void k(float f) {
            this.f2051c = f;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void l(float f) {
            this.d = f;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void m(float f) {
            this.e = f;
        }

        @Override // c.a.b.c.u.q.g
        public void a(@h0 Matrix matrix, @h0 Path path) {
            Matrix matrix2 = this.f2049a;
            matrix.invert(matrix2);
            path.transform(matrix2);
            path.quadTo(f(), g(), h(), i());
            path.transform(matrix);
        }
    }

    static abstract class i {

        /* renamed from: a, reason: collision with root package name */
        static final Matrix f2052a = new Matrix();

        i() {
        }

        public abstract void a(Matrix matrix, c.a.b.c.t.b bVar, int r3, Canvas canvas);

        public final void b(c.a.b.c.t.b bVar, int r3, Canvas canvas) {
            a(f2052a, bVar, r3, canvas);
        }
    }

    public q() {
        p(0.0f, 0.0f);
    }

    public q(float f2, float f3) {
        p(f2, f3);
    }

    private void b(float f2) {
        if (h() == f2) {
            return;
        }
        float fH = ((f2 - h()) + 360.0f) % 360.0f;
        if (fH > k) {
            return;
        }
        d dVar = new d(j(), k(), j(), k());
        dVar.s(h());
        dVar.t(fH);
        this.h.add(new b(dVar));
        r(f2);
    }

    private void c(i iVar, float f2, float f3) {
        b(f2);
        this.h.add(iVar);
        r(f3);
    }

    private float h() {
        return this.e;
    }

    private float i() {
        return this.f;
    }

    private void r(float f2) {
        this.e = f2;
    }

    private void s(float f2) {
        this.f = f2;
    }

    private void t(float f2) {
        this.f2037c = f2;
    }

    private void u(float f2) {
        this.d = f2;
    }

    private void v(float f2) {
        this.f2035a = f2;
    }

    private void w(float f2) {
        this.f2036b = f2;
    }

    public void a(float f2, float f3, float f4, float f5, float f6, float f7) {
        d dVar = new d(f2, f3, f4, f5);
        dVar.s(f6);
        dVar.t(f7);
        this.g.add(dVar);
        b bVar = new b(dVar);
        float f8 = f6 + f7;
        boolean z = f7 < 0.0f;
        if (z) {
            f6 = (f6 + k) % 360.0f;
        }
        c(bVar, f6, z ? (k + f8) % 360.0f : f8);
        double d2 = f8;
        t(((f2 + f4) * 0.5f) + (((f4 - f2) / 2.0f) * ((float) Math.cos(Math.toRadians(d2)))));
        u(((f3 + f5) * 0.5f) + (((f5 - f3) / 2.0f) * ((float) Math.sin(Math.toRadians(d2)))));
    }

    public void d(Matrix matrix, Path path) {
        int size = this.g.size();
        for (int r1 = 0; r1 < size; r1++) {
            this.g.get(r1).a(matrix, path);
        }
    }

    boolean e() {
        return this.i;
    }

    @h0
    i f(Matrix matrix) {
        b(i());
        return new a(new ArrayList(this.h), matrix);
    }

    @m0(21)
    public void g(float f2, float f3, float f4, float f5, float f6, float f7) {
        this.g.add(new e(f2, f3, f4, f5, f6, f7));
        this.i = true;
        t(f6);
        u(f7);
    }

    float j() {
        return this.f2037c;
    }

    float k() {
        return this.d;
    }

    float l() {
        return this.f2035a;
    }

    float m() {
        return this.f2036b;
    }

    public void n(float f2, float f3) {
        f fVar = new f();
        fVar.f2047b = f2;
        fVar.f2048c = f3;
        this.g.add(fVar);
        c cVar = new c(fVar, j(), k());
        c(cVar, cVar.c() + j, cVar.c() + j);
        t(f2);
        u(f3);
    }

    @m0(21)
    public void o(float f2, float f3, float f4, float f5) {
        h hVar = new h();
        hVar.j(f2);
        hVar.k(f3);
        hVar.l(f4);
        hVar.m(f5);
        this.g.add(hVar);
        this.i = true;
        t(f4);
        u(f5);
    }

    public void p(float f2, float f3) {
        q(f2, f3, j, 0.0f);
    }

    public void q(float f2, float f3, float f4, float f5) {
        v(f2);
        w(f3);
        t(f2);
        u(f3);
        r(f4);
        s((f4 + f5) % 360.0f);
        this.g.clear();
        this.h.clear();
        this.i = false;
    }
}

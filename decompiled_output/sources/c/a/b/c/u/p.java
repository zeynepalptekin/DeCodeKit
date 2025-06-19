package c.a.b.c.u;

import android.graphics.Matrix;
import android.graphics.Path;
import android.graphics.PointF;
import android.graphics.RectF;
import android.os.Build;
import androidx.annotation.h0;
import androidx.annotation.i0;
import androidx.annotation.m0;
import androidx.annotation.p0;

/* loaded from: classes.dex */
public class p {

    /* renamed from: a, reason: collision with root package name */
    private final q[] f2029a = new q[4];

    /* renamed from: b, reason: collision with root package name */
    private final Matrix[] f2030b = new Matrix[4];

    /* renamed from: c, reason: collision with root package name */
    private final Matrix[] f2031c = new Matrix[4];
    private final PointF d = new PointF();
    private final Path e = new Path();
    private final Path f = new Path();
    private final q g = new q();
    private final float[] h = new float[2];
    private final float[] i = new float[2];
    private boolean j = true;

    @p0({p0.a.LIBRARY_GROUP})
    public interface a {
        void a(q qVar, Matrix matrix, int r3);

        void b(q qVar, Matrix matrix, int r3);
    }

    static final class b {

        /* renamed from: a, reason: collision with root package name */
        @h0
        public final o f2032a;

        /* renamed from: b, reason: collision with root package name */
        @h0
        public final Path f2033b;

        /* renamed from: c, reason: collision with root package name */
        @h0
        public final RectF f2034c;

        @i0
        public final a d;
        public final float e;

        b(@h0 o oVar, float f, RectF rectF, @i0 a aVar, Path path) {
            this.d = aVar;
            this.f2032a = oVar;
            this.e = f;
            this.f2034c = rectF;
            this.f2033b = path;
        }
    }

    public p() {
        for (int r1 = 0; r1 < 4; r1++) {
            this.f2029a[r1] = new q();
            this.f2030b[r1] = new Matrix();
            this.f2031c[r1] = new Matrix();
        }
    }

    private float a(int r1) {
        return (r1 + 1) * 90;
    }

    private void b(@h0 b bVar, int r6) {
        this.h[0] = this.f2029a[r6].l();
        this.h[1] = this.f2029a[r6].m();
        this.f2030b[r6].mapPoints(this.h);
        Path path = bVar.f2033b;
        float[] fArr = this.h;
        if (r6 == 0) {
            path.moveTo(fArr[0], fArr[1]);
        } else {
            path.lineTo(fArr[0], fArr[1]);
        }
        this.f2029a[r6].d(this.f2030b[r6], bVar.f2033b);
        a aVar = bVar.d;
        if (aVar != null) {
            aVar.b(this.f2029a[r6], this.f2030b[r6], r6);
        }
    }

    private void c(@h0 b bVar, int r10) {
        q qVar;
        Matrix matrix;
        Path path;
        int r0 = (r10 + 1) % 4;
        this.h[0] = this.f2029a[r10].j();
        this.h[1] = this.f2029a[r10].k();
        this.f2030b[r10].mapPoints(this.h);
        this.i[0] = this.f2029a[r0].l();
        this.i[1] = this.f2029a[r0].m();
        this.f2030b[r0].mapPoints(this.i);
        float f = this.h[0];
        float[] fArr = this.i;
        float fMax = Math.max(((float) Math.hypot(f - fArr[0], r1[1] - fArr[1])) - 0.001f, 0.0f);
        float fI = i(bVar.f2034c, r10);
        this.g.p(0.0f, 0.0f);
        g gVarJ = j(r10, bVar.f2032a);
        gVarJ.c(fMax, fI, bVar.e, this.g);
        Path path2 = new Path();
        this.g.d(this.f2031c[r10], path2);
        if (this.j && Build.VERSION.SDK_INT >= 19 && (gVarJ.b() || k(path2, r10) || k(path2, r0))) {
            path2.op(path2, this.f, Path.Op.DIFFERENCE);
            this.h[0] = this.g.l();
            this.h[1] = this.g.m();
            this.f2031c[r10].mapPoints(this.h);
            Path path3 = this.e;
            float[] fArr2 = this.h;
            path3.moveTo(fArr2[0], fArr2[1]);
            qVar = this.g;
            matrix = this.f2031c[r10];
            path = this.e;
        } else {
            qVar = this.g;
            matrix = this.f2031c[r10];
            path = bVar.f2033b;
        }
        qVar.d(matrix, path);
        a aVar = bVar.d;
        if (aVar != null) {
            aVar.a(this.g, this.f2031c[r10], r10);
        }
    }

    private void f(int r2, @h0 RectF rectF, @h0 PointF pointF) {
        float f;
        float f2;
        if (r2 == 1) {
            f = rectF.right;
        } else {
            if (r2 != 2) {
                f = r2 != 3 ? rectF.right : rectF.left;
                f2 = rectF.top;
                pointF.set(f, f2);
            }
            f = rectF.left;
        }
        f2 = rectF.bottom;
        pointF.set(f, f2);
    }

    private d g(int r2, @h0 o oVar) {
        return r2 != 1 ? r2 != 2 ? r2 != 3 ? oVar.t() : oVar.r() : oVar.j() : oVar.l();
    }

    private e h(int r2, @h0 o oVar) {
        return r2 != 1 ? r2 != 2 ? r2 != 3 ? oVar.s() : oVar.q() : oVar.i() : oVar.k();
    }

    private float i(@h0 RectF rectF, int r6) {
        float fCenterX;
        float f;
        float[] fArr = this.h;
        q[] qVarArr = this.f2029a;
        fArr[0] = qVarArr[r6].f2037c;
        fArr[1] = qVarArr[r6].d;
        this.f2030b[r6].mapPoints(fArr);
        if (r6 == 1 || r6 == 3) {
            fCenterX = rectF.centerX();
            f = this.h[0];
        } else {
            fCenterX = rectF.centerY();
            f = this.h[1];
        }
        return Math.abs(fCenterX - f);
    }

    private g j(int r2, @h0 o oVar) {
        return r2 != 1 ? r2 != 2 ? r2 != 3 ? oVar.o() : oVar.p() : oVar.n() : oVar.h();
    }

    @m0(19)
    private boolean k(Path path, int r5) {
        Path path2 = new Path();
        this.f2029a[r5].d(this.f2030b[r5], path2);
        RectF rectF = new RectF();
        path.computeBounds(rectF, true);
        path2.computeBounds(rectF, true);
        path.op(path2, Path.Op.INTERSECT);
        path.computeBounds(rectF, true);
        if (rectF.isEmpty()) {
            return rectF.width() > 1.0f && rectF.height() > 1.0f;
        }
        return true;
    }

    private void l(@h0 b bVar, int r9) {
        h(r9, bVar.f2032a).c(this.f2029a[r9], 90.0f, bVar.e, bVar.f2034c, g(r9, bVar.f2032a));
        float fA = a(r9);
        this.f2030b[r9].reset();
        f(r9, bVar.f2034c, this.d);
        Matrix matrix = this.f2030b[r9];
        PointF pointF = this.d;
        matrix.setTranslate(pointF.x, pointF.y);
        this.f2030b[r9].preRotate(fA);
    }

    private void n(int r6) {
        this.h[0] = this.f2029a[r6].j();
        this.h[1] = this.f2029a[r6].k();
        this.f2030b[r6].mapPoints(this.h);
        float fA = a(r6);
        this.f2031c[r6].reset();
        Matrix matrix = this.f2031c[r6];
        float[] fArr = this.h;
        matrix.setTranslate(fArr[0], fArr[1]);
        this.f2031c[r6].preRotate(fA);
    }

    public void d(o oVar, float f, RectF rectF, @h0 Path path) {
        e(oVar, f, rectF, null, path);
    }

    @p0({p0.a.LIBRARY_GROUP})
    public void e(o oVar, float f, RectF rectF, a aVar, @h0 Path path) {
        path.rewind();
        this.e.rewind();
        this.f.rewind();
        this.f.addRect(rectF, Path.Direction.CW);
        b bVar = new b(oVar, f, rectF, aVar, path);
        for (int r10 = 0; r10 < 4; r10++) {
            l(bVar, r10);
            n(r10);
        }
        for (int r9 = 0; r9 < 4; r9++) {
            b(bVar, r9);
            c(bVar, r9);
        }
        path.close();
        this.e.close();
        if (Build.VERSION.SDK_INT < 19 || this.e.isEmpty()) {
            return;
        }
        path.op(this.e, Path.Op.UNION);
    }

    void m(boolean z) {
        this.j = z;
    }
}

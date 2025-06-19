package c.a.b.c.z;

import android.graphics.Canvas;
import android.graphics.Path;
import android.graphics.RectF;
import android.graphics.Region;
import android.os.Build;
import c.a.b.c.z.l;

/* loaded from: classes.dex */
class j {

    /* renamed from: a, reason: collision with root package name */
    private final Path f2081a = new Path();

    /* renamed from: b, reason: collision with root package name */
    private final Path f2082b = new Path();

    /* renamed from: c, reason: collision with root package name */
    private final Path f2083c = new Path();
    private final c.a.b.c.u.p d = new c.a.b.c.u.p();
    private c.a.b.c.u.o e;

    j() {
    }

    void a(Canvas canvas) {
        if (Build.VERSION.SDK_INT >= 23) {
            canvas.clipPath(this.f2081a);
        } else {
            canvas.clipPath(this.f2082b);
            canvas.clipPath(this.f2083c, Region.Op.UNION);
        }
    }

    void b(float f, c.a.b.c.u.o oVar, c.a.b.c.u.o oVar2, RectF rectF, RectF rectF2, RectF rectF3, l.e eVar) {
        c.a.b.c.u.o oVarN = u.n(oVar, oVar2, rectF, rectF3, eVar.d(), eVar.c(), f);
        this.e = oVarN;
        this.d.d(oVarN, 1.0f, rectF2, this.f2082b);
        this.d.d(this.e, 1.0f, rectF3, this.f2083c);
        if (Build.VERSION.SDK_INT >= 23) {
            this.f2081a.op(this.f2082b, this.f2083c, Path.Op.UNION);
        }
    }

    c.a.b.c.u.o c() {
        return this.e;
    }

    Path d() {
        return this.f2081a;
    }
}

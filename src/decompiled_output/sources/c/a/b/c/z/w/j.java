package c.a.b.c.z.w;

import android.graphics.Canvas;
import android.graphics.Path;
import android.graphics.RectF;
import android.graphics.Region;
import android.os.Build;
import androidx.annotation.m0;
import c.a.b.c.z.w.l;

@m0(21)
/* loaded from: classes.dex */
class j {

    /* renamed from: a, reason: collision with root package name */
    private final Path f2129a = new Path();

    /* renamed from: b, reason: collision with root package name */
    private final Path f2130b = new Path();

    /* renamed from: c, reason: collision with root package name */
    private final Path f2131c = new Path();
    private final c.a.b.c.u.p d = new c.a.b.c.u.p();
    private c.a.b.c.u.o e;

    j() {
    }

    void a(Canvas canvas) {
        if (Build.VERSION.SDK_INT >= 23) {
            canvas.clipPath(this.f2129a);
        } else {
            canvas.clipPath(this.f2130b);
            canvas.clipPath(this.f2131c, Region.Op.UNION);
        }
    }

    void b(float f, c.a.b.c.u.o oVar, c.a.b.c.u.o oVar2, RectF rectF, RectF rectF2, RectF rectF3, l.e eVar) {
        c.a.b.c.u.o oVarN = v.n(oVar, oVar2, rectF, rectF3, eVar.d(), eVar.c(), f);
        this.e = oVarN;
        this.d.d(oVarN, 1.0f, rectF2, this.f2130b);
        this.d.d(this.e, 1.0f, rectF3, this.f2131c);
        if (Build.VERSION.SDK_INT >= 23) {
            this.f2129a.op(this.f2130b, this.f2131c, Path.Op.UNION);
        }
    }

    c.a.b.c.u.o c() {
        return this.e;
    }

    Path d() {
        return this.f2129a;
    }
}

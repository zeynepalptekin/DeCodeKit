package c.a.b.c.z;

import android.graphics.Path;
import android.graphics.PointF;
import androidx.annotation.h0;
import b.w.w;

/* loaded from: classes.dex */
public final class k extends w {
    private static PointF b(float f, float f2, float f3, float f4) {
        return f2 > f4 ? new PointF(f3, f2) : new PointF(f, f4);
    }

    @Override // b.w.w
    @h0
    public Path a(float f, float f2, float f3, float f4) {
        Path path = new Path();
        path.moveTo(f, f2);
        PointF pointFB = b(f, f2, f3, f4);
        path.quadTo(pointFB.x, pointFB.y, f3, f4);
        return path;
    }
}

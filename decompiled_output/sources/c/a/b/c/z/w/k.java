package c.a.b.c.z.w;

import android.graphics.Path;
import android.graphics.PointF;
import android.transition.PathMotion;
import androidx.annotation.h0;
import androidx.annotation.m0;

@m0(21)
/* loaded from: classes.dex */
public final class k extends PathMotion {
    private static PointF a(float f, float f2, float f3, float f4) {
        return f2 > f4 ? new PointF(f3, f2) : new PointF(f, f4);
    }

    @Override // android.transition.PathMotion
    @h0
    public Path getPath(float f, float f2, float f3, float f4) {
        Path path = new Path();
        path.moveTo(f, f2);
        PointF pointFA = a(f, f2, f3, f4);
        path.quadTo(pointFA.x, pointFA.y, f3, f4);
        return path;
    }
}

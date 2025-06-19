package c.a.b.c.b;

import android.animation.TimeInterpolator;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.LinearInterpolator;
import androidx.annotation.p0;

@p0({p0.a.LIBRARY_GROUP})
/* loaded from: classes.dex */
public class a {

    /* renamed from: a, reason: collision with root package name */
    public static final TimeInterpolator f1935a = new LinearInterpolator();

    /* renamed from: b, reason: collision with root package name */
    public static final TimeInterpolator f1936b = new b.o.b.a.b();

    /* renamed from: c, reason: collision with root package name */
    public static final TimeInterpolator f1937c = new b.o.b.a.a();
    public static final TimeInterpolator d = new b.o.b.a.c();
    public static final TimeInterpolator e = new DecelerateInterpolator();

    public static float a(float f, float f2, float f3) {
        return f + (f3 * (f2 - f));
    }

    public static int b(int r0, int r1, float f) {
        return r0 + Math.round(f * (r1 - r0));
    }
}

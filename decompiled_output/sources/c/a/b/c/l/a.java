package c.a.b.c.l;

import android.content.Context;
import android.graphics.Color;
import android.view.View;
import androidx.annotation.h0;
import androidx.annotation.k;
import b.i.e.e;
import c.a.b.c.a;
import c.a.b.c.r.b;
import com.google.android.material.internal.z;

/* loaded from: classes.dex */
public class a {
    private static final float e = 4.5f;
    private static final float f = 2.0f;

    /* renamed from: a, reason: collision with root package name */
    private final boolean f1976a;

    /* renamed from: b, reason: collision with root package name */
    private final int f1977b;

    /* renamed from: c, reason: collision with root package name */
    private final int f1978c;
    private final float d;

    public a(@h0 Context context) {
        this.f1976a = b.b(context, a.c.elevationOverlayEnabled, false);
        this.f1977b = c.a.b.c.i.a.b(context, a.c.elevationOverlayColor, 0);
        this.f1978c = c.a.b.c.i.a.b(context, a.c.colorSurface, 0);
        this.d = context.getResources().getDisplayMetrics().density;
    }

    private boolean m(@k int r2) {
        return e.B(r2, 255) == this.f1978c;
    }

    public int a(float f2) {
        return Math.round(b(f2) * 255.0f);
    }

    public float b(float f2) {
        if (this.d <= 0.0f || f2 <= 0.0f) {
            return 0.0f;
        }
        return Math.min(((((float) Math.log1p(f2 / r0)) * e) + f) / 100.0f, 1.0f);
    }

    @k
    public int c(@k int r3, float f2) {
        float fB = b(f2);
        return e.B(c.a.b.c.i.a.g(e.B(r3, 255), this.f1977b, fB), Color.alpha(r3));
    }

    @k
    public int d(@k int r1, float f2, @h0 View view) {
        return c(r1, f2 + i(view));
    }

    @k
    public int e(@k int r2, float f2) {
        return (this.f1976a && m(r2)) ? c(r2, f2) : r2;
    }

    @k
    public int f(@k int r1, float f2, @h0 View view) {
        return e(r1, f2 + i(view));
    }

    @k
    public int g(float f2) {
        return e(this.f1978c, f2);
    }

    @k
    public int h(float f2, @h0 View view) {
        return g(f2 + i(view));
    }

    public float i(@h0 View view) {
        return z.h(view);
    }

    @k
    public int j() {
        return this.f1977b;
    }

    @k
    public int k() {
        return this.f1978c;
    }

    public boolean l() {
        return this.f1976a;
    }
}

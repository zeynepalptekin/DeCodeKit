package c.a.b.c.i;

import android.content.Context;
import android.graphics.Color;
import android.util.TypedValue;
import android.view.View;
import androidx.annotation.f;
import androidx.annotation.h0;
import androidx.annotation.k;
import androidx.annotation.r;
import androidx.annotation.z;
import b.i.e.e;
import c.a.b.c.r.b;
import com.google.android.material.transformation.FabTransformationScrimBehavior;

/* loaded from: classes.dex */
public class a {

    /* renamed from: a, reason: collision with root package name */
    public static final float f1972a = 1.0f;

    /* renamed from: b, reason: collision with root package name */
    public static final float f1973b = 0.54f;

    /* renamed from: c, reason: collision with root package name */
    public static final float f1974c = 0.38f;
    public static final float d = 0.32f;
    public static final float e = 0.12f;

    private a() {
    }

    @k
    public static int a(@k int r1, @z(from = FabTransformationScrimBehavior.j, to = 255) int r2) {
        return e.B(r1, (Color.alpha(r1) * r2) / 255);
    }

    @k
    public static int b(@h0 Context context, @f int r1, @k int r2) {
        TypedValue typedValueA = b.a(context, r1);
        return typedValueA != null ? typedValueA.data : r2;
    }

    @k
    public static int c(Context context, @f int r1, String str) {
        return b.f(context, r1, str);
    }

    @k
    public static int d(@h0 View view, @f int r1) {
        return b.g(view, r1);
    }

    @k
    public static int e(@h0 View view, @f int r1, @k int r2) {
        return b(view.getContext(), r1, r2);
    }

    @k
    public static int f(@k int r0, @k int r1) {
        return e.t(r1, r0);
    }

    @k
    public static int g(@k int r1, @k int r2, @r(from = 0.0d, to = 1.0d) float f) {
        return f(r1, e.B(r2, Math.round(Color.alpha(r2) * f)));
    }

    @k
    public static int h(@h0 View view, @f int r2, @f int r3) {
        return i(view, r2, r3, 1.0f);
    }

    @k
    public static int i(@h0 View view, @f int r1, @f int r2, @r(from = 0.0d, to = 1.0d) float f) {
        return g(d(view, r1), d(view, r2), f);
    }
}

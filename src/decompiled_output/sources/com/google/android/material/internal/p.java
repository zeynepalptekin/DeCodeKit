package com.google.android.material.internal;

import android.os.Build;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextDirectionHeuristic;
import android.text.TextDirectionHeuristics;
import android.text.TextPaint;
import android.text.TextUtils;
import androidx.annotation.h0;
import androidx.annotation.i0;
import androidx.annotation.p0;
import androidx.appcompat.widget.ActivityChooserView;
import com.google.android.material.transformation.FabTransformationScrimBehavior;
import java.lang.reflect.Constructor;

@p0({p0.a.LIBRARY_GROUP})
/* loaded from: classes.dex */
final class p {
    private static final String k = "android.text.TextDirectionHeuristic";
    private static final String l = "android.text.TextDirectionHeuristics";
    private static final String m = "LTR";
    private static final String n = "RTL";
    private static boolean o;

    @i0
    private static Constructor<StaticLayout> p;

    @i0
    private static Object q;

    /* renamed from: a, reason: collision with root package name */
    private CharSequence f6745a;

    /* renamed from: b, reason: collision with root package name */
    private final TextPaint f6746b;

    /* renamed from: c, reason: collision with root package name */
    private final int f6747c;
    private int e;
    private boolean i;
    private int d = 0;
    private Layout.Alignment f = Layout.Alignment.ALIGN_NORMAL;
    private int g = ActivityChooserView.f.j;
    private boolean h = true;

    @i0
    private TextUtils.TruncateAt j = null;

    static class a extends Exception {
        a(Throwable th) {
            super("Error thrown initializing StaticLayout " + th.getMessage(), th);
        }
    }

    private p(CharSequence charSequence, TextPaint textPaint, int r3) {
        this.f6745a = charSequence;
        this.f6746b = textPaint;
        this.f6747c = r3;
        this.e = charSequence.length();
    }

    private void b() throws NoSuchMethodException, SecurityException, ClassNotFoundException, a {
        Class<?> cls;
        if (o) {
            return;
        }
        try {
            boolean z = this.i && Build.VERSION.SDK_INT >= 23;
            if (Build.VERSION.SDK_INT >= 18) {
                cls = TextDirectionHeuristic.class;
                q = z ? TextDirectionHeuristics.RTL : TextDirectionHeuristics.LTR;
            } else {
                ClassLoader classLoader = p.class.getClassLoader();
                String str = this.i ? n : m;
                Class<?> clsLoadClass = classLoader.loadClass(k);
                Class<?> clsLoadClass2 = classLoader.loadClass(l);
                q = clsLoadClass2.getField(str).get(clsLoadClass2);
                cls = clsLoadClass;
            }
            Constructor<StaticLayout> declaredConstructor = StaticLayout.class.getDeclaredConstructor(CharSequence.class, Integer.TYPE, Integer.TYPE, TextPaint.class, Integer.TYPE, Layout.Alignment.class, cls, Float.TYPE, Float.TYPE, Boolean.TYPE, TextUtils.TruncateAt.class, Integer.TYPE, Integer.TYPE);
            p = declaredConstructor;
            declaredConstructor.setAccessible(true);
            o = true;
        } catch (Exception e) {
            throw new a(e);
        }
    }

    @h0
    public static p c(@h0 CharSequence charSequence, @h0 TextPaint textPaint, @androidx.annotation.z(from = FabTransformationScrimBehavior.j) int r3) {
        return new p(charSequence, textPaint, r3);
    }

    public StaticLayout a() throws NoSuchMethodException, SecurityException, ClassNotFoundException, a {
        if (this.f6745a == null) {
            this.f6745a = "";
        }
        int r0 = Math.max(0, this.f6747c);
        CharSequence charSequenceEllipsize = this.f6745a;
        if (this.g == 1) {
            charSequenceEllipsize = TextUtils.ellipsize(charSequenceEllipsize, this.f6746b, r0, this.j);
        }
        this.e = Math.min(charSequenceEllipsize.length(), this.e);
        if (Build.VERSION.SDK_INT < 23) {
            b();
            try {
                return (StaticLayout) ((Constructor) b.i.o.i.f(p)).newInstance(charSequenceEllipsize, Integer.valueOf(this.d), Integer.valueOf(this.e), this.f6746b, Integer.valueOf(r0), this.f, b.i.o.i.f(q), Float.valueOf(1.0f), Float.valueOf(0.0f), Boolean.valueOf(this.h), null, Integer.valueOf(r0), Integer.valueOf(this.g));
            } catch (Exception e) {
                throw new a(e);
            }
        }
        if (this.i) {
            this.f = Layout.Alignment.ALIGN_OPPOSITE;
        }
        StaticLayout.Builder builderObtain = StaticLayout.Builder.obtain(charSequenceEllipsize, this.d, this.e, this.f6746b, r0);
        builderObtain.setAlignment(this.f);
        builderObtain.setIncludePad(this.h);
        builderObtain.setTextDirection(this.i ? TextDirectionHeuristics.RTL : TextDirectionHeuristics.LTR);
        TextUtils.TruncateAt truncateAt = this.j;
        if (truncateAt != null) {
            builderObtain.setEllipsize(truncateAt);
        }
        builderObtain.setMaxLines(this.g);
        return builderObtain.build();
    }

    @h0
    public p d(@h0 Layout.Alignment alignment) {
        this.f = alignment;
        return this;
    }

    @h0
    public p e(@i0 TextUtils.TruncateAt truncateAt) {
        this.j = truncateAt;
        return this;
    }

    @h0
    public p f(@androidx.annotation.z(from = FabTransformationScrimBehavior.j) int r1) {
        this.e = r1;
        return this;
    }

    @h0
    public p g(boolean z) {
        this.h = z;
        return this;
    }

    public p h(boolean z) {
        this.i = z;
        return this;
    }

    @h0
    public p i(@androidx.annotation.z(from = FabTransformationScrimBehavior.j) int r1) {
        this.g = r1;
        return this;
    }

    @h0
    public p j(@androidx.annotation.z(from = FabTransformationScrimBehavior.j) int r1) {
        this.d = r1;
        return this;
    }
}

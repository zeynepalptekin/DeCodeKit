package c.a.b.c.h;

import android.animation.TypeEvaluator;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.util.Property;
import androidx.annotation.h0;
import androidx.annotation.i0;
import androidx.annotation.k;
import c.a.b.c.h.d;

/* loaded from: classes.dex */
public interface g extends d.a {

    public static class b implements TypeEvaluator<e> {

        /* renamed from: b, reason: collision with root package name */
        public static final TypeEvaluator<e> f1965b = new b();

        /* renamed from: a, reason: collision with root package name */
        private final e f1966a = new e();

        @Override // android.animation.TypeEvaluator
        @h0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public e evaluate(float f, @h0 e eVar, @h0 e eVar2) {
            this.f1966a.b(c.a.b.c.o.a.f(eVar.f1969a, eVar2.f1969a, f), c.a.b.c.o.a.f(eVar.f1970b, eVar2.f1970b, f), c.a.b.c.o.a.f(eVar.f1971c, eVar2.f1971c, f));
            return this.f1966a;
        }
    }

    public static class c extends Property<g, e> {

        /* renamed from: a, reason: collision with root package name */
        public static final Property<g, e> f1967a = new c("circularReveal");

        private c(String str) {
            super(e.class, str);
        }

        @Override // android.util.Property
        @i0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public e get(@h0 g gVar) {
            return gVar.getRevealInfo();
        }

        @Override // android.util.Property
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public void set(@h0 g gVar, @i0 e eVar) {
            gVar.setRevealInfo(eVar);
        }
    }

    public static class d extends Property<g, Integer> {

        /* renamed from: a, reason: collision with root package name */
        public static final Property<g, Integer> f1968a = new d("circularRevealScrimColor");

        private d(String str) {
            super(Integer.class, str);
        }

        @Override // android.util.Property
        @h0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public Integer get(@h0 g gVar) {
            return Integer.valueOf(gVar.getCircularRevealScrimColor());
        }

        @Override // android.util.Property
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public void set(@h0 g gVar, @h0 Integer num) {
            gVar.setCircularRevealScrimColor(num.intValue());
        }
    }

    public static class e {
        public static final float d = Float.MAX_VALUE;

        /* renamed from: a, reason: collision with root package name */
        public float f1969a;

        /* renamed from: b, reason: collision with root package name */
        public float f1970b;

        /* renamed from: c, reason: collision with root package name */
        public float f1971c;

        private e() {
        }

        public e(float f, float f2, float f3) {
            this.f1969a = f;
            this.f1970b = f2;
            this.f1971c = f3;
        }

        public e(@h0 e eVar) {
            this(eVar.f1969a, eVar.f1970b, eVar.f1971c);
        }

        public boolean a() {
            return this.f1971c == Float.MAX_VALUE;
        }

        public void b(float f, float f2, float f3) {
            this.f1969a = f;
            this.f1970b = f2;
            this.f1971c = f3;
        }

        public void c(@h0 e eVar) {
            b(eVar.f1969a, eVar.f1970b, eVar.f1971c);
        }
    }

    void a();

    void c();

    void draw(Canvas canvas);

    @i0
    Drawable getCircularRevealOverlayDrawable();

    @k
    int getCircularRevealScrimColor();

    @i0
    e getRevealInfo();

    boolean isOpaque();

    void setCircularRevealOverlayDrawable(@i0 Drawable drawable);

    void setCircularRevealScrimColor(@k int r1);

    void setRevealInfo(@i0 e eVar);
}

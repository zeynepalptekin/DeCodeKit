package c.a.b.c.r;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Typeface;
import android.text.TextPaint;
import android.util.Log;
import androidx.annotation.h0;
import androidx.annotation.i0;
import androidx.annotation.p0;
import androidx.annotation.s;
import androidx.annotation.t0;
import androidx.annotation.x0;
import b.i.c.j.g;
import b.i.p.f0;
import c.a.b.c.a;

@p0({p0.a.LIBRARY_GROUP})
/* loaded from: classes.dex */
public class d {
    private static final String p = "TextAppearance";
    private static final int q = 1;
    private static final int r = 2;
    private static final int s = 3;

    /* renamed from: a, reason: collision with root package name */
    public final float f1988a;

    /* renamed from: b, reason: collision with root package name */
    @i0
    public final ColorStateList f1989b;

    /* renamed from: c, reason: collision with root package name */
    @i0
    public final ColorStateList f1990c;

    @i0
    public final ColorStateList d;
    public final int e;
    public final int f;

    @i0
    public final String g;
    public final boolean h;

    @i0
    public final ColorStateList i;
    public final float j;
    public final float k;
    public final float l;

    @s
    private final int m;
    private boolean n = false;
    private Typeface o;

    class a extends g.a {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ f f1991a;

        a(f fVar) {
            this.f1991a = fVar;
        }

        @Override // b.i.c.j.g.a
        public void c(int r3) {
            d.this.n = true;
            this.f1991a.a(r3);
        }

        @Override // b.i.c.j.g.a
        public void d(@h0 Typeface typeface) {
            d dVar = d.this;
            dVar.o = Typeface.create(typeface, dVar.e);
            d.this.n = true;
            this.f1991a.b(d.this.o, false);
        }
    }

    class b extends f {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ TextPaint f1993a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ f f1994b;

        b(TextPaint textPaint, f fVar) {
            this.f1993a = textPaint;
            this.f1994b = fVar;
        }

        @Override // c.a.b.c.r.f
        public void a(int r2) {
            this.f1994b.a(r2);
        }

        @Override // c.a.b.c.r.f
        public void b(@h0 Typeface typeface, boolean z) {
            d.this.k(this.f1993a, typeface);
            this.f1994b.b(typeface, z);
        }
    }

    public d(@h0 Context context, @t0 int r6) throws Resources.NotFoundException {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(r6, a.o.TextAppearance);
        this.f1988a = typedArrayObtainStyledAttributes.getDimension(a.o.TextAppearance_android_textSize, 0.0f);
        this.f1989b = c.a(context, typedArrayObtainStyledAttributes, a.o.TextAppearance_android_textColor);
        this.f1990c = c.a(context, typedArrayObtainStyledAttributes, a.o.TextAppearance_android_textColorHint);
        this.d = c.a(context, typedArrayObtainStyledAttributes, a.o.TextAppearance_android_textColorLink);
        this.e = typedArrayObtainStyledAttributes.getInt(a.o.TextAppearance_android_textStyle, 0);
        this.f = typedArrayObtainStyledAttributes.getInt(a.o.TextAppearance_android_typeface, 1);
        int r1 = c.e(typedArrayObtainStyledAttributes, a.o.TextAppearance_fontFamily, a.o.TextAppearance_android_fontFamily);
        this.m = typedArrayObtainStyledAttributes.getResourceId(r1, 0);
        this.g = typedArrayObtainStyledAttributes.getString(r1);
        this.h = typedArrayObtainStyledAttributes.getBoolean(a.o.TextAppearance_textAllCaps, false);
        this.i = c.a(context, typedArrayObtainStyledAttributes, a.o.TextAppearance_android_shadowColor);
        this.j = typedArrayObtainStyledAttributes.getFloat(a.o.TextAppearance_android_shadowDx, 0.0f);
        this.k = typedArrayObtainStyledAttributes.getFloat(a.o.TextAppearance_android_shadowDy, 0.0f);
        this.l = typedArrayObtainStyledAttributes.getFloat(a.o.TextAppearance_android_shadowRadius, 0.0f);
        typedArrayObtainStyledAttributes.recycle();
    }

    private void d() {
        String str;
        if (this.o == null && (str = this.g) != null) {
            this.o = Typeface.create(str, this.e);
        }
        if (this.o == null) {
            int r0 = this.f;
            this.o = r0 != 1 ? r0 != 2 ? r0 != 3 ? Typeface.DEFAULT : Typeface.MONOSPACE : Typeface.SERIF : Typeface.SANS_SERIF;
            this.o = Typeface.create(this.o, this.e);
        }
    }

    public Typeface e() {
        d();
        return this.o;
    }

    @h0
    @x0
    public Typeface f(@h0 Context context) {
        if (this.n) {
            return this.o;
        }
        if (!context.isRestricted()) {
            try {
                Typeface typefaceF = g.f(context, this.m);
                this.o = typefaceF;
                if (typefaceF != null) {
                    this.o = Typeface.create(typefaceF, this.e);
                }
            } catch (Resources.NotFoundException | UnsupportedOperationException unused) {
            } catch (Exception e) {
                Log.d(p, "Error loading font " + this.g, e);
            }
        }
        d();
        this.n = true;
        return this.o;
    }

    public void g(@h0 Context context, @h0 TextPaint textPaint, @h0 f fVar) {
        k(textPaint, e());
        h(context, new b(textPaint, fVar));
    }

    public void h(@h0 Context context, @h0 f fVar) {
        if (e.b()) {
            f(context);
        } else {
            d();
        }
        if (this.m == 0) {
            this.n = true;
        }
        if (this.n) {
            fVar.b(this.o, true);
            return;
        }
        try {
            g.h(context, this.m, new a(fVar), null);
        } catch (Resources.NotFoundException unused) {
            this.n = true;
            fVar.a(1);
        } catch (Exception e) {
            Log.d(p, "Error loading font " + this.g, e);
            this.n = true;
            fVar.a(-3);
        }
    }

    public void i(@h0 Context context, @h0 TextPaint textPaint, @h0 f fVar) {
        j(context, textPaint, fVar);
        ColorStateList colorStateList = this.f1989b;
        textPaint.setColor(colorStateList != null ? colorStateList.getColorForState(textPaint.drawableState, colorStateList.getDefaultColor()) : f0.t);
        float f = this.l;
        float f2 = this.j;
        float f3 = this.k;
        ColorStateList colorStateList2 = this.i;
        textPaint.setShadowLayer(f, f2, f3, colorStateList2 != null ? colorStateList2.getColorForState(textPaint.drawableState, colorStateList2.getDefaultColor()) : 0);
    }

    public void j(@h0 Context context, @h0 TextPaint textPaint, @h0 f fVar) {
        if (e.b()) {
            k(textPaint, f(context));
        } else {
            g(context, textPaint, fVar);
        }
    }

    public void k(@h0 TextPaint textPaint, @h0 Typeface typeface) {
        textPaint.setTypeface(typeface);
        int r3 = (~typeface.getStyle()) & this.e;
        textPaint.setFakeBoldText((r3 & 1) != 0);
        textPaint.setTextSkewX((r3 & 2) != 0 ? -0.25f : 0.0f);
        textPaint.setTextSize(this.f1988a);
    }
}

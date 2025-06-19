package b.e.b;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Color;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import androidx.annotation.h0;
import androidx.annotation.i0;
import androidx.annotation.k;
import androidx.annotation.k0;
import b.e.a;

/* loaded from: classes.dex */
public class a extends FrameLayout {
    private static final int[] k = {R.attr.colorBackground};
    private static final f l;
    private boolean d;
    private boolean e;
    int f;
    int g;
    final Rect h;
    final Rect i;
    private final e j;

    /* renamed from: b.e.b.a$a, reason: collision with other inner class name */
    class C0051a implements e {

        /* renamed from: a, reason: collision with root package name */
        private Drawable f874a;

        C0051a() {
        }

        @Override // b.e.b.e
        public void b(int r4, int r5, int r6, int r7) {
            a.this.i.set(r4, r5, r6, r7);
            a aVar = a.this;
            Rect rect = aVar.h;
            a.super.setPadding(r4 + rect.left, r5 + rect.top, r6 + rect.right, r7 + rect.bottom);
        }

        @Override // b.e.b.e
        public View c() {
            return a.this;
        }

        @Override // b.e.b.e
        public void d(int r3, int r4) {
            a aVar = a.this;
            if (r3 > aVar.f) {
                a.super.setMinimumWidth(r3);
            }
            a aVar2 = a.this;
            if (r4 > aVar2.g) {
                a.super.setMinimumHeight(r4);
            }
        }

        @Override // b.e.b.e
        public void e(Drawable drawable) {
            this.f874a = drawable;
            a.this.setBackgroundDrawable(drawable);
        }

        @Override // b.e.b.e
        public boolean f() {
            return a.this.getPreventCornerOverlap();
        }

        @Override // b.e.b.e
        public boolean g() {
            return a.this.getUseCompatPadding();
        }

        @Override // b.e.b.e
        public Drawable h() {
            return this.f874a;
        }
    }

    static {
        int r0 = Build.VERSION.SDK_INT;
        l = r0 >= 21 ? new c() : r0 >= 17 ? new b() : new d();
        l.g();
    }

    public a(@h0 Context context) {
        this(context, null);
    }

    public a(@h0 Context context, @i0 AttributeSet attributeSet) {
        this(context, attributeSet, a.C0050a.cardViewStyle);
    }

    public a(@h0 Context context, @i0 AttributeSet attributeSet, int r11) {
        Resources resources;
        int r1;
        ColorStateList colorStateListValueOf;
        super(context, attributeSet, r11);
        this.h = new Rect();
        this.i = new Rect();
        this.j = new C0051a();
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, a.e.CardView, r11, a.d.CardView);
        if (typedArrayObtainStyledAttributes.hasValue(a.e.CardView_cardBackgroundColor)) {
            colorStateListValueOf = typedArrayObtainStyledAttributes.getColorStateList(a.e.CardView_cardBackgroundColor);
        } else {
            TypedArray typedArrayObtainStyledAttributes2 = getContext().obtainStyledAttributes(k);
            int color = typedArrayObtainStyledAttributes2.getColor(0, 0);
            typedArrayObtainStyledAttributes2.recycle();
            float[] fArr = new float[3];
            Color.colorToHSV(color, fArr);
            if (fArr[2] > 0.5f) {
                resources = getResources();
                r1 = a.b.cardview_light_background;
            } else {
                resources = getResources();
                r1 = a.b.cardview_dark_background;
            }
            colorStateListValueOf = ColorStateList.valueOf(resources.getColor(r1));
        }
        ColorStateList colorStateList = colorStateListValueOf;
        float dimension = typedArrayObtainStyledAttributes.getDimension(a.e.CardView_cardCornerRadius, 0.0f);
        float dimension2 = typedArrayObtainStyledAttributes.getDimension(a.e.CardView_cardElevation, 0.0f);
        float dimension3 = typedArrayObtainStyledAttributes.getDimension(a.e.CardView_cardMaxElevation, 0.0f);
        this.d = typedArrayObtainStyledAttributes.getBoolean(a.e.CardView_cardUseCompatPadding, false);
        this.e = typedArrayObtainStyledAttributes.getBoolean(a.e.CardView_cardPreventCornerOverlap, true);
        int dimensionPixelSize = typedArrayObtainStyledAttributes.getDimensionPixelSize(a.e.CardView_contentPadding, 0);
        this.h.left = typedArrayObtainStyledAttributes.getDimensionPixelSize(a.e.CardView_contentPaddingLeft, dimensionPixelSize);
        this.h.top = typedArrayObtainStyledAttributes.getDimensionPixelSize(a.e.CardView_contentPaddingTop, dimensionPixelSize);
        this.h.right = typedArrayObtainStyledAttributes.getDimensionPixelSize(a.e.CardView_contentPaddingRight, dimensionPixelSize);
        this.h.bottom = typedArrayObtainStyledAttributes.getDimensionPixelSize(a.e.CardView_contentPaddingBottom, dimensionPixelSize);
        float f = dimension2 > dimension3 ? dimension2 : dimension3;
        this.f = typedArrayObtainStyledAttributes.getDimensionPixelSize(a.e.CardView_android_minWidth, 0);
        this.g = typedArrayObtainStyledAttributes.getDimensionPixelSize(a.e.CardView_android_minHeight, 0);
        typedArrayObtainStyledAttributes.recycle();
        l.c(this.j, context, colorStateList, dimension, dimension2, f);
    }

    @h0
    public ColorStateList getCardBackgroundColor() {
        return l.b(this.j);
    }

    public float getCardElevation() {
        return l.e(this.j);
    }

    @k0
    public int getContentPaddingBottom() {
        return this.h.bottom;
    }

    @k0
    public int getContentPaddingLeft() {
        return this.h.left;
    }

    @k0
    public int getContentPaddingRight() {
        return this.h.right;
    }

    @k0
    public int getContentPaddingTop() {
        return this.h.top;
    }

    public float getMaxCardElevation() {
        return l.a(this.j);
    }

    public boolean getPreventCornerOverlap() {
        return this.e;
    }

    public float getRadius() {
        return l.h(this.j);
    }

    public boolean getUseCompatPadding() {
        return this.d;
    }

    public void h(@k0 int r2, @k0 int r3, @k0 int r4, @k0 int r5) {
        this.h.set(r2, r3, r4, r5);
        l.f(this.j);
    }

    @Override // android.widget.FrameLayout, android.view.View
    protected void onMeasure(int r6, int r7) {
        if (!(l instanceof c)) {
            int mode = View.MeasureSpec.getMode(r6);
            if (mode == Integer.MIN_VALUE || mode == 1073741824) {
                r6 = View.MeasureSpec.makeMeasureSpec(Math.max((int) Math.ceil(l.j(this.j)), View.MeasureSpec.getSize(r6)), mode);
            }
            int mode2 = View.MeasureSpec.getMode(r7);
            if (mode2 == Integer.MIN_VALUE || mode2 == 1073741824) {
                r7 = View.MeasureSpec.makeMeasureSpec(Math.max((int) Math.ceil(l.i(this.j)), View.MeasureSpec.getSize(r7)), mode2);
            }
        }
        super.onMeasure(r6, r7);
    }

    public void setCardBackgroundColor(@k int r3) {
        l.n(this.j, ColorStateList.valueOf(r3));
    }

    public void setCardBackgroundColor(@i0 ColorStateList colorStateList) {
        l.n(this.j, colorStateList);
    }

    public void setCardElevation(float f) {
        l.l(this.j, f);
    }

    public void setMaxCardElevation(float f) {
        l.o(this.j, f);
    }

    @Override // android.view.View
    public void setMinimumHeight(int r1) {
        this.g = r1;
        super.setMinimumHeight(r1);
    }

    @Override // android.view.View
    public void setMinimumWidth(int r1) {
        this.f = r1;
        super.setMinimumWidth(r1);
    }

    @Override // android.view.View
    public void setPadding(int r1, int r2, int r3, int r4) {
    }

    @Override // android.view.View
    public void setPaddingRelative(int r1, int r2, int r3, int r4) {
    }

    public void setPreventCornerOverlap(boolean z) {
        if (z != this.e) {
            this.e = z;
            l.m(this.j);
        }
    }

    public void setRadius(float f) {
        l.d(this.j, f);
    }

    public void setUseCompatPadding(boolean z) {
        if (this.d != z) {
            this.d = z;
            l.k(this.j);
        }
    }
}

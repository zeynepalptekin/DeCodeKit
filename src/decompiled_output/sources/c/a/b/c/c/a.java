package c.a.b.c.c;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.f;
import androidx.annotation.h0;
import androidx.annotation.i0;
import androidx.annotation.j0;
import androidx.annotation.k;
import androidx.annotation.p;
import androidx.annotation.p0;
import androidx.annotation.s0;
import androidx.annotation.t0;
import androidx.annotation.u0;
import androidx.annotation.z0;
import b.i.p.f0;
import c.a.b.c.a;
import c.a.b.c.r.c;
import c.a.b.c.r.d;
import c.a.b.c.u.j;
import com.google.android.material.internal.q;
import com.google.android.material.internal.s;
import java.io.IOException;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.ref.WeakReference;
import org.xmlpull.v1.XmlPullParserException;

/* loaded from: classes.dex */
public class a extends Drawable implements q.b {

    @t0
    private static final int A = a.n.Widget_MaterialComponents_Badge;

    @f
    private static final int B = a.c.badgeStyle;
    static final String C = "+";
    public static final int t = 8388661;
    public static final int u = 8388659;
    public static final int v = 8388693;
    public static final int w = 8388691;
    private static final int x = 4;
    private static final int y = -1;
    private static final int z = 9;

    @h0
    private final WeakReference<Context> d;

    @h0
    private final j e;

    @h0
    private final q f;

    @h0
    private final Rect g;
    private final float h;
    private final float i;
    private final float j;

    @h0
    private final b k;
    private float l;
    private float m;
    private int n;
    private float o;
    private float p;
    private float q;

    @i0
    private WeakReference<View> r;

    @i0
    private WeakReference<ViewGroup> s;

    @Retention(RetentionPolicy.SOURCE)
    /* renamed from: c.a.b.c.c.a$a, reason: collision with other inner class name */
    public @interface InterfaceC0133a {
    }

    @p0({p0.a.LIBRARY_GROUP})
    public static final class b implements Parcelable {
        public static final Parcelable.Creator<b> CREATOR = new C0134a();

        @k
        private int d;

        @k
        private int e;
        private int f;
        private int g;
        private int h;

        @i0
        private CharSequence i;

        @j0
        private int j;

        @s0
        private int k;
        private int l;

        @p(unit = 1)
        private int m;

        @p(unit = 1)
        private int n;

        /* renamed from: c.a.b.c.c.a$b$a, reason: collision with other inner class name */
        static class C0134a implements Parcelable.Creator<b> {
            C0134a() {
            }

            @Override // android.os.Parcelable.Creator
            @h0
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public b createFromParcel(@h0 Parcel parcel) {
                return new b(parcel);
            }

            @Override // android.os.Parcelable.Creator
            @h0
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public b[] newArray(int r1) {
                return new b[r1];
            }
        }

        public b(@h0 Context context) {
            this.f = 255;
            this.g = -1;
            this.e = new d(context, a.n.TextAppearance_MaterialComponents_Badge).f1989b.getDefaultColor();
            this.i = context.getString(a.m.mtrl_badge_numberless_content_description);
            this.j = a.l.mtrl_badge_content_description;
            this.k = a.m.mtrl_exceed_max_badge_number_content_description;
        }

        protected b(@h0 Parcel parcel) {
            this.f = 255;
            this.g = -1;
            this.d = parcel.readInt();
            this.e = parcel.readInt();
            this.f = parcel.readInt();
            this.g = parcel.readInt();
            this.h = parcel.readInt();
            this.i = parcel.readString();
            this.j = parcel.readInt();
            this.l = parcel.readInt();
            this.m = parcel.readInt();
            this.n = parcel.readInt();
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(@h0 Parcel parcel, int r2) {
            parcel.writeInt(this.d);
            parcel.writeInt(this.e);
            parcel.writeInt(this.f);
            parcel.writeInt(this.g);
            parcel.writeInt(this.h);
            parcel.writeString(this.i.toString());
            parcel.writeInt(this.j);
            parcel.writeInt(this.l);
            parcel.writeInt(this.m);
            parcel.writeInt(this.n);
        }
    }

    private a(@h0 Context context) throws Resources.NotFoundException {
        this.d = new WeakReference<>(context);
        s.c(context);
        Resources resources = context.getResources();
        this.g = new Rect();
        this.e = new j();
        this.h = resources.getDimensionPixelSize(a.f.mtrl_badge_radius);
        this.j = resources.getDimensionPixelSize(a.f.mtrl_badge_long_text_horizontal_padding);
        this.i = resources.getDimensionPixelSize(a.f.mtrl_badge_with_text_radius);
        q qVar = new q(this);
        this.f = qVar;
        qVar.e().setTextAlign(Paint.Align.CENTER);
        this.k = new b(context);
        G(a.n.TextAppearance_MaterialComponents_Badge);
    }

    private void F(@i0 d dVar) throws Resources.NotFoundException {
        Context context;
        if (this.f.d() == dVar || (context = this.d.get()) == null) {
            return;
        }
        this.f.i(dVar, context);
        K();
    }

    private void G(@t0 int r3) throws Resources.NotFoundException {
        Context context = this.d.get();
        if (context == null) {
            return;
        }
        F(new d(context, r3));
    }

    private void K() throws Resources.NotFoundException {
        Context context = this.d.get();
        WeakReference<View> weakReference = this.r;
        View view = weakReference != null ? weakReference.get() : null;
        if (context == null || view == null) {
            return;
        }
        Rect rect = new Rect();
        rect.set(this.g);
        Rect rect2 = new Rect();
        view.getDrawingRect(rect2);
        WeakReference<ViewGroup> weakReference2 = this.s;
        ViewGroup viewGroup = weakReference2 != null ? weakReference2.get() : null;
        if (viewGroup != null || c.a.b.c.c.b.f1955a) {
            if (viewGroup == null) {
                viewGroup = (ViewGroup) view.getParent();
            }
            viewGroup.offsetDescendantRectToMyCoords(view, rect2);
        }
        b(context, rect2, view);
        c.a.b.c.c.b.f(this.g, this.l, this.m, this.p, this.q);
        this.e.j0(this.o);
        if (rect.equals(this.g)) {
            return;
        }
        this.e.setBounds(this.g);
    }

    private void L() {
        this.n = ((int) Math.pow(10.0d, o() - 1.0d)) - 1;
    }

    private void b(@h0 Context context, @h0 Rect rect, @h0 View view) throws Resources.NotFoundException {
        float f;
        int r0 = this.k.l;
        this.m = (r0 == 8388691 || r0 == 8388693) ? rect.bottom - this.k.n : rect.top + this.k.n;
        if (p() <= 9) {
            f = !s() ? this.h : this.i;
            this.o = f;
            this.q = f;
        } else {
            float f2 = this.i;
            this.o = f2;
            this.q = f2;
            f = (this.f.f(k()) / 2.0f) + this.j;
        }
        this.p = f;
        int dimensionPixelSize = context.getResources().getDimensionPixelSize(s() ? a.f.mtrl_badge_text_horizontal_edge_offset : a.f.mtrl_badge_horizontal_edge_offset);
        int r02 = this.k.l;
        this.l = (r02 == 8388659 || r02 == 8388691 ? f0.W(view) != 0 : f0.W(view) == 0) ? ((rect.right + this.p) - dimensionPixelSize) - this.k.m : (rect.left - this.p) + dimensionPixelSize + this.k.m;
    }

    @h0
    public static a d(@h0 Context context) {
        return e(context, null, B, A);
    }

    @h0
    private static a e(@h0 Context context, AttributeSet attributeSet, @f int r3, @t0 int r4) throws Resources.NotFoundException {
        a aVar = new a(context);
        aVar.t(context, attributeSet, r3, r4);
        return aVar;
    }

    @h0
    public static a f(@h0 Context context, @z0 int r3) throws XmlPullParserException, Resources.NotFoundException, IOException {
        AttributeSet attributeSetA = c.a.b.c.k.a.a(context, r3, "badge");
        int styleAttribute = attributeSetA.getStyleAttribute();
        if (styleAttribute == 0) {
            styleAttribute = A;
        }
        return e(context, attributeSetA, B, styleAttribute);
    }

    @h0
    static a g(@h0 Context context, @h0 b bVar) throws Resources.NotFoundException {
        a aVar = new a(context);
        aVar.v(bVar);
        return aVar;
    }

    private void h(Canvas canvas) {
        Rect rect = new Rect();
        String strK = k();
        this.f.e().getTextBounds(strK, 0, strK.length(), rect);
        canvas.drawText(strK, this.l, this.m + (rect.height() / 2), this.f.e());
    }

    @h0
    private String k() {
        if (p() <= this.n) {
            return Integer.toString(p());
        }
        Context context = this.d.get();
        return context == null ? "" : context.getString(a.m.mtrl_exceed_max_badge_number_suffix, Integer.valueOf(this.n), C);
    }

    private void t(Context context, AttributeSet attributeSet, @f int r10, @t0 int r11) throws Resources.NotFoundException {
        TypedArray typedArrayJ = s.j(context, attributeSet, a.o.Badge, r10, r11, new int[0]);
        D(typedArrayJ.getInt(a.o.Badge_maxCharacterCount, 4));
        if (typedArrayJ.hasValue(a.o.Badge_number)) {
            E(typedArrayJ.getInt(a.o.Badge_number, 0));
        }
        w(u(context, typedArrayJ, a.o.Badge_backgroundColor));
        if (typedArrayJ.hasValue(a.o.Badge_badgeTextColor)) {
            y(u(context, typedArrayJ, a.o.Badge_badgeTextColor));
        }
        x(typedArrayJ.getInt(a.o.Badge_badgeGravity, t));
        C(typedArrayJ.getDimensionPixelOffset(a.o.Badge_horizontalOffset, 0));
        H(typedArrayJ.getDimensionPixelOffset(a.o.Badge_verticalOffset, 0));
        typedArrayJ.recycle();
    }

    private static int u(Context context, @h0 TypedArray typedArray, @u0 int r2) {
        return c.a(context, typedArray, r2).getDefaultColor();
    }

    private void v(@h0 b bVar) throws Resources.NotFoundException {
        D(bVar.h);
        if (bVar.g != -1) {
            E(bVar.g);
        }
        w(bVar.d);
        y(bVar.e);
        x(bVar.l);
        C(bVar.m);
        H(bVar.n);
    }

    public void A(CharSequence charSequence) {
        this.k.i = charSequence;
    }

    public void B(@s0 int r2) {
        this.k.j = r2;
    }

    public void C(int r2) throws Resources.NotFoundException {
        this.k.m = r2;
        K();
    }

    public void D(int r2) throws Resources.NotFoundException {
        if (this.k.h != r2) {
            this.k.h = r2;
            L();
            this.f.j(true);
            K();
            invalidateSelf();
        }
    }

    public void E(int r2) throws Resources.NotFoundException {
        int r22 = Math.max(0, r2);
        if (this.k.g != r22) {
            this.k.g = r22;
            this.f.j(true);
            K();
            invalidateSelf();
        }
    }

    public void H(int r2) throws Resources.NotFoundException {
        this.k.n = r2;
        K();
    }

    public void I(boolean z2) {
        setVisible(z2, false);
    }

    public void J(@h0 View view, @i0 ViewGroup viewGroup) {
        this.r = new WeakReference<>(view);
        this.s = new WeakReference<>(viewGroup);
        K();
        invalidateSelf();
    }

    @Override // com.google.android.material.internal.q.b
    @p0({p0.a.LIBRARY_GROUP})
    public void a() {
        invalidateSelf();
    }

    public void c() {
        this.k.g = -1;
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(@h0 Canvas canvas) {
        if (getBounds().isEmpty() || getAlpha() == 0 || !isVisible()) {
            return;
        }
        this.e.draw(canvas);
        if (s()) {
            h(canvas);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public int getAlpha() {
        return this.k.f;
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicHeight() {
        return this.g.height();
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicWidth() {
        return this.g.width();
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        return -3;
    }

    @k
    public int i() {
        return this.e.y().getDefaultColor();
    }

    @Override // android.graphics.drawable.Drawable
    public boolean isStateful() {
        return false;
    }

    public int j() {
        return this.k.l;
    }

    @k
    public int l() {
        return this.f.e().getColor();
    }

    @i0
    public CharSequence m() {
        Context context;
        if (!isVisible()) {
            return null;
        }
        if (!s()) {
            return this.k.i;
        }
        if (this.k.j <= 0 || (context = this.d.get()) == null) {
            return null;
        }
        return p() <= this.n ? context.getResources().getQuantityString(this.k.j, p(), Integer.valueOf(p())) : context.getString(this.k.k, Integer.valueOf(this.n));
    }

    public int n() {
        return this.k.m;
    }

    public int o() {
        return this.k.h;
    }

    @Override // android.graphics.drawable.Drawable, com.google.android.material.internal.q.b
    public boolean onStateChange(int[] r1) {
        return super.onStateChange(r1);
    }

    public int p() {
        if (s()) {
            return this.k.g;
        }
        return 0;
    }

    @h0
    public b q() {
        return this.k;
    }

    public int r() {
        return this.k.n;
    }

    public boolean s() {
        return this.k.g != -1;
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int r2) {
        this.k.f = r2;
        this.f.e().setAlpha(r2);
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
    }

    public void w(@k int r2) {
        this.k.d = r2;
        ColorStateList colorStateListValueOf = ColorStateList.valueOf(r2);
        if (this.e.y() != colorStateListValueOf) {
            this.e.n0(colorStateListValueOf);
            invalidateSelf();
        }
    }

    public void x(int r2) {
        if (this.k.l != r2) {
            this.k.l = r2;
            WeakReference<View> weakReference = this.r;
            if (weakReference == null || weakReference.get() == null) {
                return;
            }
            View view = this.r.get();
            WeakReference<ViewGroup> weakReference2 = this.s;
            J(view, weakReference2 != null ? weakReference2.get() : null);
        }
    }

    public void y(@k int r2) {
        this.k.e = r2;
        if (this.f.e().getColor() != r2) {
            this.f.e().setColor(r2);
            invalidateSelf();
        }
    }

    public void z(@s0 int r2) {
        this.k.k = r2;
    }
}

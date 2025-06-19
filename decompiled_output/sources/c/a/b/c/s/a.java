package c.a.b.c.s;

import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import androidx.annotation.h0;
import androidx.annotation.i0;
import androidx.annotation.k;
import androidx.annotation.p0;
import androidx.core.graphics.drawable.e;
import c.a.b.c.u.j;
import c.a.b.c.u.o;
import c.a.b.c.u.s;

@p0({p0.a.LIBRARY_GROUP})
/* loaded from: classes.dex */
public class a extends Drawable implements s, e {
    private b d;

    static final class b extends Drawable.ConstantState {

        /* renamed from: a, reason: collision with root package name */
        @h0
        j f1997a;

        /* renamed from: b, reason: collision with root package name */
        boolean f1998b;

        public b(@h0 b bVar) {
            this.f1997a = (j) bVar.f1997a.getConstantState().newDrawable();
            this.f1998b = bVar.f1998b;
        }

        public b(j jVar) {
            this.f1997a = jVar;
            this.f1998b = false;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        @h0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public a newDrawable() {
            return new a(new b(this));
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public int getChangingConfigurations() {
            return 0;
        }
    }

    private a(b bVar) {
        this.d = bVar;
    }

    public a(o oVar) {
        this(new b(new j(oVar)));
    }

    @Override // android.graphics.drawable.Drawable
    @h0
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public a mutate() {
        this.d = new b(this.d);
        return this;
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        b bVar = this.d;
        if (bVar.f1998b) {
            bVar.f1997a.draw(canvas);
        }
    }

    @Override // android.graphics.drawable.Drawable
    @i0
    public Drawable.ConstantState getConstantState() {
        return this.d;
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        return this.d.f1997a.getOpacity();
    }

    @Override // c.a.b.c.u.s
    @h0
    public o getShapeAppearanceModel() {
        return this.d.f1997a.getShapeAppearanceModel();
    }

    @Override // android.graphics.drawable.Drawable
    public boolean isStateful() {
        return true;
    }

    @Override // android.graphics.drawable.Drawable
    protected void onBoundsChange(@h0 Rect rect) {
        super.onBoundsChange(rect);
        this.d.f1997a.setBounds(rect);
    }

    @Override // android.graphics.drawable.Drawable
    protected boolean onStateChange(@h0 int[] r5) {
        boolean zOnStateChange = super.onStateChange(r5);
        if (this.d.f1997a.setState(r5)) {
            zOnStateChange = true;
        }
        boolean zE = c.a.b.c.s.b.e(r5);
        b bVar = this.d;
        if (bVar.f1998b == zE) {
            return zOnStateChange;
        }
        bVar.f1998b = zE;
        return true;
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int r2) {
        this.d.f1997a.setAlpha(r2);
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(@i0 ColorFilter colorFilter) {
        this.d.f1997a.setColorFilter(colorFilter);
    }

    @Override // c.a.b.c.u.s
    public void setShapeAppearanceModel(@h0 o oVar) {
        this.d.f1997a.setShapeAppearanceModel(oVar);
    }

    @Override // android.graphics.drawable.Drawable, androidx.core.graphics.drawable.e
    public void setTint(@k int r2) {
        this.d.f1997a.setTint(r2);
    }

    @Override // android.graphics.drawable.Drawable, androidx.core.graphics.drawable.e
    public void setTintList(@i0 ColorStateList colorStateList) {
        this.d.f1997a.setTintList(colorStateList);
    }

    @Override // android.graphics.drawable.Drawable, androidx.core.graphics.drawable.e
    public void setTintMode(@i0 PorterDuff.Mode mode) {
        this.d.f1997a.setTintMode(mode);
    }
}

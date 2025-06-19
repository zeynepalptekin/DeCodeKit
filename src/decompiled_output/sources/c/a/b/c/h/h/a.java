package c.a.b.c.h.h;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import androidx.annotation.h0;
import androidx.annotation.i0;
import androidx.annotation.k;
import c.a.b.c.h.d;
import c.a.b.c.h.g;

/* loaded from: classes.dex */
public class a extends c.a.b.c.f.a implements g {

    @h0
    private final d x;

    public a(Context context) {
        this(context, null);
    }

    public a(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.x = new d(this);
    }

    @Override // c.a.b.c.h.g
    public void a() {
        this.x.b();
    }

    @Override // c.a.b.c.h.d.a
    public void b(Canvas canvas) {
        super.draw(canvas);
    }

    @Override // c.a.b.c.h.g
    public void c() {
        this.x.a();
    }

    @Override // c.a.b.c.h.d.a
    public boolean d() {
        return super.isOpaque();
    }

    @Override // android.view.View, c.a.b.c.h.g
    public void draw(Canvas canvas) {
        d dVar = this.x;
        if (dVar != null) {
            dVar.c(canvas);
        } else {
            super.draw(canvas);
        }
    }

    @Override // c.a.b.c.h.g
    @i0
    public Drawable getCircularRevealOverlayDrawable() {
        return this.x.g();
    }

    @Override // c.a.b.c.h.g
    public int getCircularRevealScrimColor() {
        return this.x.h();
    }

    @Override // c.a.b.c.h.g
    @i0
    public g.e getRevealInfo() {
        return this.x.j();
    }

    @Override // android.view.View, c.a.b.c.h.g
    public boolean isOpaque() {
        d dVar = this.x;
        return dVar != null ? dVar.l() : super.isOpaque();
    }

    @Override // c.a.b.c.h.g
    public void setCircularRevealOverlayDrawable(@i0 Drawable drawable) {
        this.x.m(drawable);
    }

    @Override // c.a.b.c.h.g
    public void setCircularRevealScrimColor(@k int r2) {
        this.x.n(r2);
    }

    @Override // c.a.b.c.h.g
    public void setRevealInfo(@i0 g.e eVar) {
        this.x.o(eVar);
    }
}

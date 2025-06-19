package c.a.b.c.h.i;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import androidx.annotation.h0;
import androidx.annotation.i0;
import androidx.annotation.k;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import c.a.b.c.h.d;
import c.a.b.c.h.g;

/* loaded from: classes.dex */
public class a extends CoordinatorLayout implements g {

    @h0
    private final d I;

    public a(@h0 Context context) {
        this(context, null);
    }

    public a(@h0 Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.I = new d(this);
    }

    @Override // c.a.b.c.h.g
    public void a() {
        this.I.b();
    }

    @Override // c.a.b.c.h.d.a
    public void b(Canvas canvas) {
        super.draw(canvas);
    }

    @Override // c.a.b.c.h.g
    public void c() {
        this.I.a();
    }

    @Override // c.a.b.c.h.d.a
    public boolean d() {
        return super.isOpaque();
    }

    @Override // android.view.View, c.a.b.c.h.g
    public void draw(Canvas canvas) {
        d dVar = this.I;
        if (dVar != null) {
            dVar.c(canvas);
        } else {
            super.draw(canvas);
        }
    }

    @Override // c.a.b.c.h.g
    @i0
    public Drawable getCircularRevealOverlayDrawable() {
        return this.I.g();
    }

    @Override // c.a.b.c.h.g
    public int getCircularRevealScrimColor() {
        return this.I.h();
    }

    @Override // c.a.b.c.h.g
    @i0
    public g.e getRevealInfo() {
        return this.I.j();
    }

    @Override // android.view.View, c.a.b.c.h.g
    public boolean isOpaque() {
        d dVar = this.I;
        return dVar != null ? dVar.l() : super.isOpaque();
    }

    @Override // c.a.b.c.h.g
    public void setCircularRevealOverlayDrawable(@i0 Drawable drawable) {
        this.I.m(drawable);
    }

    @Override // c.a.b.c.h.g
    public void setCircularRevealScrimColor(@k int r2) {
        this.I.n(r2);
    }

    @Override // c.a.b.c.h.g
    public void setRevealInfo(@i0 g.e eVar) {
        this.I.o(eVar);
    }
}

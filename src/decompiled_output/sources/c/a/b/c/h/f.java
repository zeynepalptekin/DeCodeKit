package c.a.b.c.h;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.widget.RelativeLayout;
import androidx.annotation.h0;
import androidx.annotation.i0;
import androidx.annotation.k;
import c.a.b.c.h.g;

/* loaded from: classes.dex */
public class f extends RelativeLayout implements g {

    @h0
    private final d d;

    public f(Context context) {
        this(context, null);
    }

    public f(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.d = new d(this);
    }

    @Override // c.a.b.c.h.g
    public void a() {
        this.d.b();
    }

    @Override // c.a.b.c.h.d.a
    public void b(Canvas canvas) {
        super.draw(canvas);
    }

    @Override // c.a.b.c.h.g
    public void c() {
        this.d.a();
    }

    @Override // c.a.b.c.h.d.a
    public boolean d() {
        return super.isOpaque();
    }

    @Override // android.view.View, c.a.b.c.h.g
    public void draw(@h0 Canvas canvas) {
        d dVar = this.d;
        if (dVar != null) {
            dVar.c(canvas);
        } else {
            super.draw(canvas);
        }
    }

    @Override // c.a.b.c.h.g
    @i0
    public Drawable getCircularRevealOverlayDrawable() {
        return this.d.g();
    }

    @Override // c.a.b.c.h.g
    public int getCircularRevealScrimColor() {
        return this.d.h();
    }

    @Override // c.a.b.c.h.g
    @i0
    public g.e getRevealInfo() {
        return this.d.j();
    }

    @Override // android.view.View, c.a.b.c.h.g
    public boolean isOpaque() {
        d dVar = this.d;
        return dVar != null ? dVar.l() : super.isOpaque();
    }

    @Override // c.a.b.c.h.g
    public void setCircularRevealOverlayDrawable(@i0 Drawable drawable) {
        this.d.m(drawable);
    }

    @Override // c.a.b.c.h.g
    public void setCircularRevealScrimColor(@k int r2) {
        this.d.n(r2);
    }

    @Override // c.a.b.c.h.g
    public void setRevealInfo(@i0 g.e eVar) {
        this.d.o(eVar);
    }
}

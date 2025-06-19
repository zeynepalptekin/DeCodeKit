package b.w;

import android.annotation.SuppressLint;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import b.w.a0;
import java.lang.reflect.InvocationTargetException;

@SuppressLint({"ViewConstructor"})
/* loaded from: classes.dex */
class r extends ViewGroup implements o {
    ViewGroup d;
    View e;
    final View f;
    int g;

    @androidx.annotation.i0
    private Matrix h;
    private final ViewTreeObserver.OnPreDrawListener i;

    class a implements ViewTreeObserver.OnPreDrawListener {
        a() {
        }

        @Override // android.view.ViewTreeObserver.OnPreDrawListener
        public boolean onPreDraw() {
            View view;
            b.i.p.f0.g1(r.this);
            r rVar = r.this;
            ViewGroup viewGroup = rVar.d;
            if (viewGroup == null || (view = rVar.e) == null) {
                return true;
            }
            viewGroup.endViewTransition(view);
            b.i.p.f0.g1(r.this.d);
            r rVar2 = r.this;
            rVar2.d = null;
            rVar2.e = null;
            return true;
        }
    }

    r(View view) {
        super(view.getContext());
        this.i = new a();
        this.f = view;
        setWillNotDraw(false);
        setLayerType(2, null);
    }

    static r b(View view, ViewGroup viewGroup, Matrix matrix) throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
        p pVar;
        if (!(view.getParent() instanceof ViewGroup)) {
            throw new IllegalArgumentException("Ghosted views must be parented by a ViewGroup");
        }
        p pVarB = p.b(viewGroup);
        r rVarE = e(view);
        int r2 = 0;
        if (rVarE != null && (pVar = (p) rVarE.getParent()) != pVarB) {
            r2 = rVarE.g;
            pVar.removeView(rVarE);
            rVarE = null;
        }
        if (rVarE == null) {
            if (matrix == null) {
                matrix = new Matrix();
                c(view, viewGroup, matrix);
            }
            rVarE = new r(view);
            rVarE.h(matrix);
            if (pVarB == null) {
                pVarB = new p(viewGroup);
            } else {
                pVarB.g();
            }
            d(viewGroup, pVarB);
            d(viewGroup, rVarE);
            pVarB.a(rVarE);
            rVarE.g = r2;
        } else if (matrix != null) {
            rVarE.h(matrix);
        }
        rVarE.g++;
        return rVarE;
    }

    static void c(View view, ViewGroup viewGroup, Matrix matrix) {
        ViewGroup viewGroup2 = (ViewGroup) view.getParent();
        matrix.reset();
        y0.j(viewGroup2, matrix);
        matrix.preTranslate(-viewGroup2.getScrollX(), -viewGroup2.getScrollY());
        y0.k(viewGroup, matrix);
    }

    static void d(View view, View view2) throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
        y0.g(view2, view2.getLeft(), view2.getTop(), view2.getLeft() + view.getWidth(), view2.getTop() + view.getHeight());
    }

    static r e(View view) {
        return (r) view.getTag(a0.e.ghost_view);
    }

    static void f(View view) {
        r rVarE = e(view);
        if (rVarE != null) {
            int r0 = rVarE.g - 1;
            rVarE.g = r0;
            if (r0 <= 0) {
                ((p) rVarE.getParent()).removeView(rVarE);
            }
        }
    }

    static void g(@androidx.annotation.h0 View view, @androidx.annotation.i0 r rVar) {
        view.setTag(a0.e.ghost_view, rVar);
    }

    @Override // b.w.o
    public void a(ViewGroup viewGroup, View view) {
        this.d = viewGroup;
        this.e = view;
    }

    void h(@androidx.annotation.h0 Matrix matrix) {
        this.h = matrix;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() throws IllegalAccessException, NoSuchFieldException, IllegalArgumentException {
        super.onAttachedToWindow();
        g(this.f, this);
        this.f.getViewTreeObserver().addOnPreDrawListener(this.i);
        y0.i(this.f, 4);
        if (this.f.getParent() != null) {
            ((View) this.f.getParent()).invalidate();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() throws IllegalAccessException, NoSuchFieldException, IllegalArgumentException {
        this.f.getViewTreeObserver().removeOnPreDrawListener(this.i);
        y0.i(this.f, 0);
        g(this.f, null);
        if (this.f.getParent() != null) {
            ((View) this.f.getParent()).invalidate();
        }
        super.onDetachedFromWindow();
    }

    @Override // android.view.View
    protected void onDraw(Canvas canvas) throws IllegalAccessException, NoSuchFieldException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
        d.a(canvas, true);
        canvas.setMatrix(this.h);
        y0.i(this.f, 0);
        this.f.invalidate();
        y0.i(this.f, 4);
        drawChild(canvas, this.f, getDrawingTime());
        d.a(canvas, false);
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z, int r2, int r3, int r4, int r5) {
    }

    @Override // android.view.View, b.w.o
    public void setVisibility(int r2) throws IllegalAccessException, NoSuchFieldException, IllegalArgumentException {
        super.setVisibility(r2);
        if (e(this.f) == this) {
            y0.i(this.f, r2 == 0 ? 4 : 0);
        }
    }
}

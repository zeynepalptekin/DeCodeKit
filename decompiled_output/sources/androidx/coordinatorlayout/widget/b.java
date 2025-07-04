package androidx.coordinatorlayout.widget;

import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.RectF;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.annotation.p0;

@p0({p0.a.LIBRARY})
/* loaded from: classes.dex */
public class b {

    /* renamed from: a, reason: collision with root package name */
    private static final ThreadLocal<Matrix> f253a = new ThreadLocal<>();

    /* renamed from: b, reason: collision with root package name */
    private static final ThreadLocal<RectF> f254b = new ThreadLocal<>();

    private b() {
    }

    public static void a(ViewGroup viewGroup, View view, Rect rect) {
        rect.set(0, 0, view.getWidth(), view.getHeight());
        c(viewGroup, view, rect);
    }

    private static void b(ViewParent viewParent, View view, Matrix matrix) {
        Object parent = view.getParent();
        if ((parent instanceof View) && parent != viewParent) {
            b(viewParent, (View) parent, matrix);
            matrix.preTranslate(-r0.getScrollX(), -r0.getScrollY());
        }
        matrix.preTranslate(view.getLeft(), view.getTop());
        if (view.getMatrix().isIdentity()) {
            return;
        }
        matrix.preConcat(view.getMatrix());
    }

    static void c(ViewGroup viewGroup, View view, Rect rect) {
        Matrix matrix = f253a.get();
        if (matrix == null) {
            matrix = new Matrix();
            f253a.set(matrix);
        } else {
            matrix.reset();
        }
        b(viewGroup, view, matrix);
        RectF rectF = f254b.get();
        if (rectF == null) {
            rectF = new RectF();
            f254b.set(rectF);
        }
        rectF.set(rect);
        matrix.mapRect(rectF);
        rect.set((int) (rectF.left + 0.5f), (int) (rectF.top + 0.5f), (int) (rectF.right + 0.5f), (int) (rectF.bottom + 0.5f));
    }
}

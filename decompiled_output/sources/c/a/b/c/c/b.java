package c.a.b.c.c;

import android.content.Context;
import android.graphics.Rect;
import android.os.Build;
import android.util.SparseArray;
import android.view.View;
import android.widget.FrameLayout;
import androidx.annotation.h0;
import androidx.annotation.i0;
import androidx.annotation.p0;
import c.a.b.c.c.a;
import com.google.android.material.internal.k;

@p0({p0.a.LIBRARY})
/* loaded from: classes.dex */
public class b {

    /* renamed from: a, reason: collision with root package name */
    public static final boolean f1955a;

    static {
        f1955a = Build.VERSION.SDK_INT < 18;
    }

    private b() {
    }

    public static void a(@h0 a aVar, @h0 View view, @h0 FrameLayout frameLayout) {
        e(aVar, view, frameLayout);
        if (f1955a) {
            frameLayout.setForeground(aVar);
        } else {
            view.getOverlay().add(aVar);
        }
    }

    @h0
    public static SparseArray<a> b(Context context, @h0 k kVar) {
        SparseArray<a> sparseArray = new SparseArray<>(kVar.size());
        for (int r1 = 0; r1 < kVar.size(); r1++) {
            int r2 = kVar.keyAt(r1);
            a.b bVar = (a.b) kVar.valueAt(r1);
            if (bVar == null) {
                throw new IllegalArgumentException("BadgeDrawable's savedState cannot be null");
            }
            sparseArray.put(r2, a.g(context, bVar));
        }
        return sparseArray;
    }

    @h0
    public static k c(@h0 SparseArray<a> sparseArray) {
        k kVar = new k();
        for (int r1 = 0; r1 < sparseArray.size(); r1++) {
            int r2 = sparseArray.keyAt(r1);
            a aVarValueAt = sparseArray.valueAt(r1);
            if (aVarValueAt == null) {
                throw new IllegalArgumentException("badgeDrawable cannot be null");
            }
            kVar.put(r2, aVarValueAt.q());
        }
        return kVar;
    }

    public static void d(@i0 a aVar, @h0 View view, @h0 FrameLayout frameLayout) {
        if (aVar == null) {
            return;
        }
        if (f1955a) {
            frameLayout.setForeground(null);
        } else {
            view.getOverlay().remove(aVar);
        }
    }

    public static void e(@h0 a aVar, @h0 View view, @h0 FrameLayout frameLayout) {
        Rect rect = new Rect();
        (f1955a ? frameLayout : view).getDrawingRect(rect);
        aVar.setBounds(rect);
        aVar.J(view, frameLayout);
    }

    public static void f(@h0 Rect rect, float f, float f2, float f3, float f4) {
        rect.set((int) (f - f3), (int) (f2 - f4), (int) (f + f3), (int) (f2 + f4));
    }
}

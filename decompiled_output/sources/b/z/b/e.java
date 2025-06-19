package b.z.b;

import android.view.View;
import android.view.ViewParent;
import androidx.annotation.h0;
import androidx.annotation.k0;
import androidx.recyclerview.widget.RecyclerView;
import b.i.o.i;
import b.z.b.h;

/* loaded from: classes.dex */
public final class e implements h.m {

    /* renamed from: a, reason: collision with root package name */
    private final int f1562a;

    public e(@k0 int r2) {
        i.e(r2, "Margin must be non-negative");
        this.f1562a = r2;
    }

    private h b(@h0 View view) {
        ViewParent parent = view.getParent();
        ViewParent parent2 = parent.getParent();
        if ((parent instanceof RecyclerView) && (parent2 instanceof h)) {
            return (h) parent2;
        }
        throw new IllegalStateException("Expected the page view to be managed by a ViewPager2 instance.");
    }

    @Override // b.z.b.h.m
    public void a(@h0 View view, float f) {
        h hVarB = b(view);
        float f2 = this.f1562a * f;
        if (hVarB.getOrientation() != 0) {
            view.setTranslationY(f2);
            return;
        }
        if (hVarB.k()) {
            f2 = -f2;
        }
        view.setTranslationX(f2);
    }
}

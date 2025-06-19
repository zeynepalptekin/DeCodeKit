package b.z.b;

import android.view.View;
import androidx.annotation.i0;
import androidx.recyclerview.widget.LinearLayoutManager;
import b.z.b.h;
import java.util.Locale;

/* loaded from: classes.dex */
final class f extends h.j {

    /* renamed from: a, reason: collision with root package name */
    private final LinearLayoutManager f1563a;

    /* renamed from: b, reason: collision with root package name */
    private h.m f1564b;

    f(LinearLayoutManager linearLayoutManager) {
        this.f1563a = linearLayoutManager;
    }

    @Override // b.z.b.h.j
    public void a(int r1) {
    }

    @Override // b.z.b.h.j
    public void b(int r5, float f, int r7) {
        if (this.f1564b == null) {
            return;
        }
        float f2 = -f;
        for (int r0 = 0; r0 < this.f1563a.Q(); r0++) {
            View viewP = this.f1563a.P(r0);
            if (viewP == null) {
                throw new IllegalStateException(String.format(Locale.US, "LayoutManager returned a null child at pos %d/%d while transforming pages", Integer.valueOf(r0), Integer.valueOf(this.f1563a.Q())));
            }
            this.f1564b.a(viewP, (this.f1563a.s0(viewP) - r5) + f2);
        }
    }

    @Override // b.z.b.h.j
    public void c(int r1) {
    }

    h.m d() {
        return this.f1564b;
    }

    void e(@i0 h.m mVar) {
        this.f1564b = mVar;
    }
}

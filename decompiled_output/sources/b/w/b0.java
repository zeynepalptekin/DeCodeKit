package b.w;

import android.animation.TypeEvaluator;
import android.graphics.Rect;

/* loaded from: classes.dex */
class b0 implements TypeEvaluator<Rect> {

    /* renamed from: a, reason: collision with root package name */
    private Rect f1379a;

    b0() {
    }

    b0(Rect rect) {
        this.f1379a = rect;
    }

    @Override // android.animation.TypeEvaluator
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public Rect evaluate(float f, Rect rect, Rect rect2) {
        int r0 = rect.left + ((int) ((rect2.left - r0) * f));
        int r1 = rect.top + ((int) ((rect2.top - r1) * f));
        int r2 = rect.right + ((int) ((rect2.right - r2) * f));
        int r6 = rect.bottom + ((int) ((rect2.bottom - r6) * f));
        Rect rect3 = this.f1379a;
        if (rect3 == null) {
            return new Rect(r0, r1, r2, r6);
        }
        rect3.set(r0, r1, r2, r6);
        return this.f1379a;
    }
}

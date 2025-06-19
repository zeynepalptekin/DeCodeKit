package b.i.p;

import android.view.View;
import android.view.ViewGroup;

/* loaded from: classes.dex */
public class x {

    /* renamed from: a, reason: collision with root package name */
    private int f1291a;

    /* renamed from: b, reason: collision with root package name */
    private int f1292b;

    public x(@androidx.annotation.h0 ViewGroup viewGroup) {
    }

    public int a() {
        return this.f1291a | this.f1292b;
    }

    public void b(@androidx.annotation.h0 View view, @androidx.annotation.h0 View view2, int r4) {
        c(view, view2, r4, 0);
    }

    public void c(@androidx.annotation.h0 View view, @androidx.annotation.h0 View view2, int r3, int r4) {
        if (r4 == 1) {
            this.f1292b = r3;
        } else {
            this.f1291a = r3;
        }
    }

    public void d(@androidx.annotation.h0 View view) {
        e(view, 0);
    }

    public void e(@androidx.annotation.h0 View view, int r3) {
        if (r3 == 1) {
            this.f1292b = 0;
        } else {
            this.f1291a = 0;
        }
    }
}

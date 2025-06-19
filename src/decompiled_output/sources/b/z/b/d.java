package b.z.b;

import android.os.SystemClock;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.ViewConfiguration;
import androidx.annotation.w0;
import androidx.recyclerview.widget.RecyclerView;

/* loaded from: classes.dex */
final class d {

    /* renamed from: a, reason: collision with root package name */
    private final h f1559a;

    /* renamed from: b, reason: collision with root package name */
    private final g f1560b;

    /* renamed from: c, reason: collision with root package name */
    private final RecyclerView f1561c;
    private VelocityTracker d;
    private int e;
    private float f;
    private int g;
    private long h;

    d(h hVar, g gVar, RecyclerView recyclerView) {
        this.f1559a = hVar;
        this.f1560b = gVar;
        this.f1561c = recyclerView;
    }

    private void a(long j, int r11, float f, float f2) {
        MotionEvent motionEventObtain = MotionEvent.obtain(this.h, j, r11, f, f2, 0);
        this.d.addMovement(motionEventObtain);
        motionEventObtain.recycle();
    }

    private void c() {
        VelocityTracker velocityTracker = this.d;
        if (velocityTracker != null) {
            velocityTracker.clear();
        } else {
            this.d = VelocityTracker.obtain();
            this.e = ViewConfiguration.get(this.f1559a.getContext()).getScaledMaximumFlingVelocity();
        }
    }

    @w0
    boolean b() {
        if (this.f1560b.i()) {
            return false;
        }
        this.g = 0;
        this.f = 0;
        this.h = SystemClock.uptimeMillis();
        c();
        this.f1560b.m();
        if (!this.f1560b.k()) {
            this.f1561c.N1();
        }
        a(this.h, 0, 0.0f, 0.0f);
        return true;
    }

    @w0
    boolean d() {
        if (!this.f1560b.j()) {
            return false;
        }
        this.f1560b.o();
        VelocityTracker velocityTracker = this.d;
        velocityTracker.computeCurrentVelocity(1000, this.e);
        if (this.f1561c.l0((int) velocityTracker.getXVelocity(), (int) velocityTracker.getYVelocity())) {
            return true;
        }
        this.f1559a.v();
        return true;
    }

    @w0
    boolean e(float f) {
        if (!this.f1560b.j()) {
            return false;
        }
        float f2 = this.f - f;
        this.f = f2;
        int r10 = Math.round(f2 - this.g);
        this.g += r10;
        long jUptimeMillis = SystemClock.uptimeMillis();
        boolean z = this.f1559a.getOrientation() == 0;
        int r2 = z ? r10 : 0;
        int r1 = z ? 0 : r10;
        float f3 = z ? this.f : 0.0f;
        float f4 = z ? 0.0f : this.f;
        this.f1561c.scrollBy(r2, r1);
        a(jUptimeMillis, 2, f3, f4);
        return true;
    }

    boolean f() {
        return this.f1560b.j();
    }
}

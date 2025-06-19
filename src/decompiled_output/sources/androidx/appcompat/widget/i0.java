package androidx.appcompat.widget;

import android.os.SystemClock;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewParent;
import androidx.annotation.p0;

@androidx.annotation.p0({p0.a.LIBRARY_GROUP_PREFIX})
/* loaded from: classes.dex */
public abstract class i0 implements View.OnTouchListener, View.OnAttachStateChangeListener {
    private final float d;
    private final int e;
    private final int f;
    final View g;
    private Runnable h;
    private Runnable i;
    private boolean j;
    private int k;
    private final int[] l = new int[2];

    private class a implements Runnable {
        a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            ViewParent parent = i0.this.g.getParent();
            if (parent != null) {
                parent.requestDisallowInterceptTouchEvent(true);
            }
        }
    }

    private class b implements Runnable {
        b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            i0.this.e();
        }
    }

    public i0(View view) {
        this.g = view;
        view.setLongClickable(true);
        view.addOnAttachStateChangeListener(this);
        this.d = ViewConfiguration.get(view.getContext()).getScaledTouchSlop();
        int tapTimeout = ViewConfiguration.getTapTimeout();
        this.e = tapTimeout;
        this.f = (tapTimeout + ViewConfiguration.getLongPressTimeout()) / 2;
    }

    private void a() {
        Runnable runnable = this.i;
        if (runnable != null) {
            this.g.removeCallbacks(runnable);
        }
        Runnable runnable2 = this.h;
        if (runnable2 != null) {
            this.g.removeCallbacks(runnable2);
        }
    }

    private boolean f(MotionEvent motionEvent) throws IllegalAccessException, IllegalArgumentException {
        g0 g0Var;
        View view = this.g;
        androidx.appcompat.view.menu.q qVarB = b();
        if (qVarB == null || !qVarB.z() || (g0Var = (g0) qVarB.A()) == null || !g0Var.isShown()) {
            return false;
        }
        MotionEvent motionEventObtainNoHistory = MotionEvent.obtainNoHistory(motionEvent);
        i(view, motionEventObtainNoHistory);
        j(g0Var, motionEventObtainNoHistory);
        boolean zF = g0Var.f(motionEventObtainNoHistory, this.k);
        motionEventObtainNoHistory.recycle();
        int actionMasked = motionEvent.getActionMasked();
        return zF && (actionMasked != 1 && actionMasked != 3);
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x003d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private boolean g(android.view.MotionEvent r6) {
        /*
            r5 = this;
            android.view.View r0 = r5.g
            boolean r1 = r0.isEnabled()
            r2 = 0
            if (r1 != 0) goto La
            return r2
        La:
            int r1 = r6.getActionMasked()
            if (r1 == 0) goto L41
            r3 = 1
            if (r1 == r3) goto L3d
            r4 = 2
            if (r1 == r4) goto L1a
            r6 = 3
            if (r1 == r6) goto L3d
            goto L6d
        L1a:
            int r1 = r5.k
            int r1 = r6.findPointerIndex(r1)
            if (r1 < 0) goto L6d
            float r4 = r6.getX(r1)
            float r6 = r6.getY(r1)
            float r1 = r5.d
            boolean r6 = h(r0, r4, r6, r1)
            if (r6 != 0) goto L6d
            r5.a()
            android.view.ViewParent r6 = r0.getParent()
            r6.requestDisallowInterceptTouchEvent(r3)
            return r3
        L3d:
            r5.a()
            goto L6d
        L41:
            int r6 = r6.getPointerId(r2)
            r5.k = r6
            java.lang.Runnable r6 = r5.h
            if (r6 != 0) goto L52
            androidx.appcompat.widget.i0$a r6 = new androidx.appcompat.widget.i0$a
            r6.<init>()
            r5.h = r6
        L52:
            java.lang.Runnable r6 = r5.h
            int r1 = r5.e
            long r3 = (long) r1
            r0.postDelayed(r6, r3)
            java.lang.Runnable r6 = r5.i
            if (r6 != 0) goto L65
            androidx.appcompat.widget.i0$b r6 = new androidx.appcompat.widget.i0$b
            r6.<init>()
            r5.i = r6
        L65:
            java.lang.Runnable r6 = r5.i
            int r1 = r5.f
            long r3 = (long) r1
            r0.postDelayed(r6, r3)
        L6d:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.i0.g(android.view.MotionEvent):boolean");
    }

    private static boolean h(View view, float f, float f2, float f3) {
        float f4 = -f3;
        return f >= f4 && f2 >= f4 && f < ((float) (view.getRight() - view.getLeft())) + f3 && f2 < ((float) (view.getBottom() - view.getTop())) + f3;
    }

    private boolean i(View view, MotionEvent motionEvent) {
        view.getLocationOnScreen(this.l);
        motionEvent.offsetLocation(r0[0], r0[1]);
        return true;
    }

    private boolean j(View view, MotionEvent motionEvent) {
        view.getLocationOnScreen(this.l);
        motionEvent.offsetLocation(-r0[0], -r0[1]);
        return true;
    }

    public abstract androidx.appcompat.view.menu.q b();

    protected boolean c() {
        androidx.appcompat.view.menu.q qVarB = b();
        if (qVarB == null || qVarB.z()) {
            return true;
        }
        qVarB.y();
        return true;
    }

    protected boolean d() {
        androidx.appcompat.view.menu.q qVarB = b();
        if (qVarB == null || !qVarB.z()) {
            return true;
        }
        qVarB.dismiss();
        return true;
    }

    void e() {
        a();
        View view = this.g;
        if (view.isEnabled() && !view.isLongClickable() && c()) {
            view.getParent().requestDisallowInterceptTouchEvent(true);
            long jUptimeMillis = SystemClock.uptimeMillis();
            MotionEvent motionEventObtain = MotionEvent.obtain(jUptimeMillis, jUptimeMillis, 3, 0.0f, 0.0f, 0);
            view.onTouchEvent(motionEventObtain);
            motionEventObtain.recycle();
            this.j = true;
        }
    }

    @Override // android.view.View.OnTouchListener
    public boolean onTouch(View view, MotionEvent motionEvent) {
        boolean z;
        boolean z2 = this.j;
        if (z2) {
            z = f(motionEvent) || !d();
        } else {
            z = g(motionEvent) && c();
            if (z) {
                long jUptimeMillis = SystemClock.uptimeMillis();
                MotionEvent motionEventObtain = MotionEvent.obtain(jUptimeMillis, jUptimeMillis, 3, 0.0f, 0.0f, 0);
                this.g.onTouchEvent(motionEventObtain);
                motionEventObtain.recycle();
            }
        }
        this.j = z;
        return z || z2;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public void onViewAttachedToWindow(View view) {
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public void onViewDetachedFromWindow(View view) {
        this.j = false;
        this.k = -1;
        Runnable runnable = this.h;
        if (runnable != null) {
            this.g.removeCallbacks(runnable);
        }
    }
}

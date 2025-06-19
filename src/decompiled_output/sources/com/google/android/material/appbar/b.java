package com.google.android.material.appbar;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.OverScroller;
import androidx.annotation.h0;
import androidx.annotation.i0;
import androidx.appcompat.widget.ActivityChooserView;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import b.i.p.f0;

/* loaded from: classes.dex */
abstract class b<V extends View> extends d<V> {
    private static final int k = -1;

    @i0
    private Runnable d;
    OverScroller e;
    private boolean f;
    private int g;
    private int h;
    private int i;

    @i0
    private VelocityTracker j;

    private class a implements Runnable {
        private final CoordinatorLayout d;
        private final V e;

        a(CoordinatorLayout coordinatorLayout, V v) {
            this.d = coordinatorLayout;
            this.e = v;
        }

        @Override // java.lang.Runnable
        public void run() {
            OverScroller overScroller;
            if (this.e == null || (overScroller = b.this.e) == null) {
                return;
            }
            if (!overScroller.computeScrollOffset()) {
                b.this.V(this.d, this.e);
                return;
            }
            b bVar = b.this;
            bVar.X(this.d, this.e, bVar.e.getCurrY());
            f0.i1(this.e, this);
        }
    }

    public b() {
        this.g = -1;
        this.i = -1;
    }

    public b(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.g = -1;
        this.i = -1;
    }

    private void Q() {
        if (this.j == null) {
            this.j = VelocityTracker.obtain();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0085  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x008c A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:37:? A[ADDED_TO_REGION, RETURN, SYNTHETIC] */
    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean E(@androidx.annotation.h0 androidx.coordinatorlayout.widget.CoordinatorLayout r12, @androidx.annotation.h0 V r13, @androidx.annotation.h0 android.view.MotionEvent r14) {
        /*
            r11 = this;
            int r0 = r14.getActionMasked()
            r1 = -1
            r2 = 1
            r3 = 0
            if (r0 == r2) goto L4e
            r4 = 2
            if (r0 == r4) goto L2d
            r12 = 3
            if (r0 == r12) goto L72
            r12 = 6
            if (r0 == r12) goto L13
            goto L4c
        L13:
            int r12 = r14.getActionIndex()
            if (r12 != 0) goto L1b
            r12 = 1
            goto L1c
        L1b:
            r12 = 0
        L1c:
            int r13 = r14.getPointerId(r12)
            r11.g = r13
            float r12 = r14.getY(r12)
            r13 = 1056964608(0x3f000000, float:0.5)
            float r12 = r12 + r13
            int r12 = (int) r12
            r11.h = r12
            goto L4c
        L2d:
            int r0 = r11.g
            int r0 = r14.findPointerIndex(r0)
            if (r0 != r1) goto L36
            return r3
        L36:
            float r0 = r14.getY(r0)
            int r0 = (int) r0
            int r1 = r11.h
            int r7 = r1 - r0
            r11.h = r0
            int r8 = r11.S(r13)
            r9 = 0
            r4 = r11
            r5 = r12
            r6 = r13
            r4.W(r5, r6, r7, r8, r9)
        L4c:
            r12 = 0
            goto L81
        L4e:
            android.view.VelocityTracker r0 = r11.j
            if (r0 == 0) goto L72
            r0.addMovement(r14)
            android.view.VelocityTracker r0 = r11.j
            r4 = 1000(0x3e8, float:1.401E-42)
            r0.computeCurrentVelocity(r4)
            android.view.VelocityTracker r0 = r11.j
            int r4 = r11.g
            float r10 = r0.getYVelocity(r4)
            int r0 = r11.T(r13)
            int r8 = -r0
            r9 = 0
            r5 = r11
            r6 = r12
            r7 = r13
            r5.R(r6, r7, r8, r9, r10)
            r12 = 1
            goto L73
        L72:
            r12 = 0
        L73:
            r11.f = r3
            r11.g = r1
            android.view.VelocityTracker r13 = r11.j
            if (r13 == 0) goto L81
            r13.recycle()
            r13 = 0
            r11.j = r13
        L81:
            android.view.VelocityTracker r13 = r11.j
            if (r13 == 0) goto L88
            r13.addMovement(r14)
        L88:
            boolean r13 = r11.f
            if (r13 != 0) goto L90
            if (r12 == 0) goto L8f
            goto L90
        L8f:
            r2 = 0
        L90:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.appbar.b.E(androidx.coordinatorlayout.widget.CoordinatorLayout, android.view.View, android.view.MotionEvent):boolean");
    }

    boolean P(V v) {
        return false;
    }

    final boolean R(CoordinatorLayout coordinatorLayout, @h0 V v, int r16, int r17, float f) {
        Runnable runnable = this.d;
        if (runnable != null) {
            v.removeCallbacks(runnable);
            this.d = null;
        }
        if (this.e == null) {
            this.e = new OverScroller(v.getContext());
        }
        this.e.fling(0, H(), 0, Math.round(f), 0, 0, r16, r17);
        if (!this.e.computeScrollOffset()) {
            V(coordinatorLayout, v);
            return false;
        }
        a aVar = new a(coordinatorLayout, v);
        this.d = aVar;
        f0.i1(v, aVar);
        return true;
    }

    int S(@h0 V v) {
        return -v.getHeight();
    }

    int T(@h0 V v) {
        return v.getHeight();
    }

    int U() {
        return H();
    }

    void V(CoordinatorLayout coordinatorLayout, V v) {
    }

    final int W(CoordinatorLayout coordinatorLayout, V v, int r10, int r11, int r12) {
        return Y(coordinatorLayout, v, U() - r10, r11, r12);
    }

    int X(CoordinatorLayout coordinatorLayout, V v, int r9) {
        return Y(coordinatorLayout, v, r9, Integer.MIN_VALUE, ActivityChooserView.f.j);
    }

    int Y(CoordinatorLayout coordinatorLayout, V v, int r3, int r4, int r5) {
        int r2;
        int r1 = H();
        if (r4 == 0 || r1 < r4 || r1 > r5 || r1 == (r2 = b.i.i.a.c(r3, r4, r5))) {
            return 0;
        }
        N(r2);
        return r1 - r2;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public boolean l(@h0 CoordinatorLayout coordinatorLayout, @h0 V v, @h0 MotionEvent motionEvent) {
        int r0;
        if (this.i < 0) {
            this.i = ViewConfiguration.get(coordinatorLayout.getContext()).getScaledTouchSlop();
        }
        if (motionEvent.getActionMasked() == 2 && this.f) {
            int r02 = this.g;
            if (r02 == -1 || (r0 = motionEvent.findPointerIndex(r02)) == -1) {
                return false;
            }
            int y = (int) motionEvent.getY(r0);
            if (Math.abs(y - this.h) > this.i) {
                this.h = y;
                return true;
            }
        }
        if (motionEvent.getActionMasked() == 0) {
            this.g = -1;
            int x = (int) motionEvent.getX();
            int y2 = (int) motionEvent.getY();
            boolean z = P(v) && coordinatorLayout.G(v, x, y2);
            this.f = z;
            if (z) {
                this.h = y2;
                this.g = motionEvent.getPointerId(0);
                Q();
                OverScroller overScroller = this.e;
                if (overScroller != null && !overScroller.isFinished()) {
                    this.e.abortAnimation();
                    return true;
                }
            }
        }
        VelocityTracker velocityTracker = this.j;
        if (velocityTracker != null) {
            velocityTracker.addMovement(motionEvent);
        }
        return false;
    }
}

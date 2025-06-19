package b.i.p;

import android.content.Context;
import android.os.Build;
import android.os.Handler;
import android.os.Message;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.ViewConfiguration;

/* loaded from: classes.dex */
public final class g {

    /* renamed from: a, reason: collision with root package name */
    private final a f1189a;

    interface a {
        void a(boolean z);

        boolean b(MotionEvent motionEvent);

        boolean c();

        void d(GestureDetector.OnDoubleTapListener onDoubleTapListener);
    }

    static class b implements a {
        private static final int A = 3;
        private static final int v = ViewConfiguration.getLongPressTimeout();
        private static final int w = ViewConfiguration.getTapTimeout();
        private static final int x = ViewConfiguration.getDoubleTapTimeout();
        private static final int y = 1;
        private static final int z = 2;

        /* renamed from: a, reason: collision with root package name */
        private int f1190a;

        /* renamed from: b, reason: collision with root package name */
        private int f1191b;

        /* renamed from: c, reason: collision with root package name */
        private int f1192c;
        private int d;
        private final Handler e;
        final GestureDetector.OnGestureListener f;
        GestureDetector.OnDoubleTapListener g;
        boolean h;
        boolean i;
        private boolean j;
        private boolean k;
        private boolean l;
        MotionEvent m;
        private MotionEvent n;
        private boolean o;
        private float p;
        private float q;
        private float r;
        private float s;
        private boolean t;
        private VelocityTracker u;

        private class a extends Handler {
            a() {
            }

            a(Handler handler) {
                super(handler.getLooper());
            }

            @Override // android.os.Handler
            public void handleMessage(Message message) {
                int r0 = message.what;
                if (r0 == 1) {
                    b bVar = b.this;
                    bVar.f.onShowPress(bVar.m);
                    return;
                }
                if (r0 == 2) {
                    b.this.g();
                    return;
                }
                if (r0 != 3) {
                    throw new RuntimeException("Unknown message " + message);
                }
                b bVar2 = b.this;
                GestureDetector.OnDoubleTapListener onDoubleTapListener = bVar2.g;
                if (onDoubleTapListener != null) {
                    if (bVar2.h) {
                        bVar2.i = true;
                    } else {
                        onDoubleTapListener.onSingleTapConfirmed(bVar2.m);
                    }
                }
            }
        }

        b(Context context, GestureDetector.OnGestureListener onGestureListener, Handler handler) {
            if (handler != null) {
                this.e = new a(handler);
            } else {
                this.e = new a();
            }
            this.f = onGestureListener;
            if (onGestureListener instanceof GestureDetector.OnDoubleTapListener) {
                d((GestureDetector.OnDoubleTapListener) onGestureListener);
            }
            h(context);
        }

        private void e() {
            this.e.removeMessages(1);
            this.e.removeMessages(2);
            this.e.removeMessages(3);
            this.u.recycle();
            this.u = null;
            this.o = false;
            this.h = false;
            this.k = false;
            this.l = false;
            this.i = false;
            if (this.j) {
                this.j = false;
            }
        }

        private void f() {
            this.e.removeMessages(1);
            this.e.removeMessages(2);
            this.e.removeMessages(3);
            this.o = false;
            this.k = false;
            this.l = false;
            this.i = false;
            if (this.j) {
                this.j = false;
            }
        }

        private void h(Context context) {
            if (context == null) {
                throw new IllegalArgumentException("Context must not be null");
            }
            if (this.f == null) {
                throw new IllegalArgumentException("OnGestureListener must not be null");
            }
            this.t = true;
            ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
            int scaledTouchSlop = viewConfiguration.getScaledTouchSlop();
            int scaledDoubleTapSlop = viewConfiguration.getScaledDoubleTapSlop();
            this.f1192c = viewConfiguration.getScaledMinimumFlingVelocity();
            this.d = viewConfiguration.getScaledMaximumFlingVelocity();
            this.f1190a = scaledTouchSlop * scaledTouchSlop;
            this.f1191b = scaledDoubleTapSlop * scaledDoubleTapSlop;
        }

        private boolean i(MotionEvent motionEvent, MotionEvent motionEvent2, MotionEvent motionEvent3) {
            if (!this.l || motionEvent3.getEventTime() - motionEvent2.getEventTime() > x) {
                return false;
            }
            int x2 = ((int) motionEvent.getX()) - ((int) motionEvent3.getX());
            int y2 = ((int) motionEvent.getY()) - ((int) motionEvent3.getY());
            return (x2 * x2) + (y2 * y2) < this.f1191b;
        }

        @Override // b.i.p.g.a
        public void a(boolean z2) {
            this.t = z2;
        }

        @Override // b.i.p.g.a
        public boolean b(MotionEvent motionEvent) {
            boolean zOnDoubleTap;
            MotionEvent motionEvent2;
            boolean zOnFling;
            GestureDetector.OnDoubleTapListener onDoubleTapListener;
            int action = motionEvent.getAction();
            if (this.u == null) {
                this.u = VelocityTracker.obtain();
            }
            this.u.addMovement(motionEvent);
            int r0 = action & 255;
            boolean z2 = r0 == 6;
            int actionIndex = z2 ? motionEvent.getActionIndex() : -1;
            int pointerCount = motionEvent.getPointerCount();
            float x2 = 0.0f;
            float y2 = 0.0f;
            for (int r8 = 0; r8 < pointerCount; r8++) {
                if (actionIndex != r8) {
                    x2 += motionEvent.getX(r8);
                    y2 += motionEvent.getY(r8);
                }
            }
            float f = z2 ? pointerCount - 1 : pointerCount;
            float f2 = x2 / f;
            float f3 = y2 / f;
            if (r0 == 0) {
                if (this.g == null) {
                    zOnDoubleTap = false;
                } else {
                    boolean zHasMessages = this.e.hasMessages(3);
                    if (zHasMessages) {
                        this.e.removeMessages(3);
                    }
                    MotionEvent motionEvent3 = this.m;
                    if (motionEvent3 == null || (motionEvent2 = this.n) == null || !zHasMessages || !i(motionEvent3, motionEvent2, motionEvent)) {
                        this.e.sendEmptyMessageDelayed(3, x);
                        zOnDoubleTap = false;
                    } else {
                        this.o = true;
                        zOnDoubleTap = this.g.onDoubleTap(this.m) | false | this.g.onDoubleTapEvent(motionEvent);
                    }
                }
                this.p = f2;
                this.r = f2;
                this.q = f3;
                this.s = f3;
                MotionEvent motionEvent4 = this.m;
                if (motionEvent4 != null) {
                    motionEvent4.recycle();
                }
                this.m = MotionEvent.obtain(motionEvent);
                this.k = true;
                this.l = true;
                this.h = true;
                this.j = false;
                this.i = false;
                if (this.t) {
                    this.e.removeMessages(2);
                    this.e.sendEmptyMessageAtTime(2, this.m.getDownTime() + w + v);
                }
                this.e.sendEmptyMessageAtTime(1, this.m.getDownTime() + w);
                return zOnDoubleTap | this.f.onDown(motionEvent);
            }
            if (r0 == 1) {
                this.h = false;
                MotionEvent motionEventObtain = MotionEvent.obtain(motionEvent);
                if (this.o) {
                    zOnFling = this.g.onDoubleTapEvent(motionEvent) | false;
                } else {
                    if (this.j) {
                        this.e.removeMessages(3);
                        this.j = false;
                    } else if (this.k) {
                        boolean zOnSingleTapUp = this.f.onSingleTapUp(motionEvent);
                        if (this.i && (onDoubleTapListener = this.g) != null) {
                            onDoubleTapListener.onSingleTapConfirmed(motionEvent);
                        }
                        zOnFling = zOnSingleTapUp;
                    } else {
                        VelocityTracker velocityTracker = this.u;
                        int pointerId = motionEvent.getPointerId(0);
                        velocityTracker.computeCurrentVelocity(1000, this.d);
                        float yVelocity = velocityTracker.getYVelocity(pointerId);
                        float xVelocity = velocityTracker.getXVelocity(pointerId);
                        if (Math.abs(yVelocity) > this.f1192c || Math.abs(xVelocity) > this.f1192c) {
                            zOnFling = this.f.onFling(this.m, motionEvent, xVelocity, yVelocity);
                        }
                    }
                    zOnFling = false;
                }
                MotionEvent motionEvent5 = this.n;
                if (motionEvent5 != null) {
                    motionEvent5.recycle();
                }
                this.n = motionEventObtain;
                VelocityTracker velocityTracker2 = this.u;
                if (velocityTracker2 != null) {
                    velocityTracker2.recycle();
                    this.u = null;
                }
                this.o = false;
                this.i = false;
                this.e.removeMessages(1);
                this.e.removeMessages(2);
            } else {
                if (r0 != 2) {
                    if (r0 == 3) {
                        e();
                        return false;
                    }
                    if (r0 == 5) {
                        this.p = f2;
                        this.r = f2;
                        this.q = f3;
                        this.s = f3;
                        f();
                        return false;
                    }
                    if (r0 != 6) {
                        return false;
                    }
                    this.p = f2;
                    this.r = f2;
                    this.q = f3;
                    this.s = f3;
                    this.u.computeCurrentVelocity(1000, this.d);
                    int actionIndex2 = motionEvent.getActionIndex();
                    int pointerId2 = motionEvent.getPointerId(actionIndex2);
                    float xVelocity2 = this.u.getXVelocity(pointerId2);
                    float yVelocity2 = this.u.getYVelocity(pointerId2);
                    for (int r4 = 0; r4 < pointerCount; r4++) {
                        if (r4 != actionIndex2) {
                            int pointerId3 = motionEvent.getPointerId(r4);
                            if ((this.u.getXVelocity(pointerId3) * xVelocity2) + (this.u.getYVelocity(pointerId3) * yVelocity2) < 0.0f) {
                                this.u.clear();
                                return false;
                            }
                        }
                    }
                    return false;
                }
                if (this.j) {
                    return false;
                }
                float f4 = this.p - f2;
                float f5 = this.q - f3;
                if (this.o) {
                    return false | this.g.onDoubleTapEvent(motionEvent);
                }
                if (!this.k) {
                    if (Math.abs(f4) < 1.0f && Math.abs(f5) < 1.0f) {
                        return false;
                    }
                    boolean zOnScroll = this.f.onScroll(this.m, motionEvent, f4, f5);
                    this.p = f2;
                    this.q = f3;
                    return zOnScroll;
                }
                int r6 = (int) (f2 - this.r);
                int r7 = (int) (f3 - this.s);
                int r62 = (r6 * r6) + (r7 * r7);
                if (r62 > this.f1190a) {
                    zOnFling = this.f.onScroll(this.m, motionEvent, f4, f5);
                    this.p = f2;
                    this.q = f3;
                    this.k = false;
                    this.e.removeMessages(3);
                    this.e.removeMessages(1);
                    this.e.removeMessages(2);
                } else {
                    zOnFling = false;
                }
                if (r62 > this.f1190a) {
                    this.l = false;
                }
            }
            return zOnFling;
        }

        @Override // b.i.p.g.a
        public boolean c() {
            return this.t;
        }

        @Override // b.i.p.g.a
        public void d(GestureDetector.OnDoubleTapListener onDoubleTapListener) {
            this.g = onDoubleTapListener;
        }

        void g() {
            this.e.removeMessages(3);
            this.i = false;
            this.j = true;
            this.f.onLongPress(this.m);
        }
    }

    static class c implements a {

        /* renamed from: a, reason: collision with root package name */
        private final GestureDetector f1194a;

        c(Context context, GestureDetector.OnGestureListener onGestureListener, Handler handler) {
            this.f1194a = new GestureDetector(context, onGestureListener, handler);
        }

        @Override // b.i.p.g.a
        public void a(boolean z) {
            this.f1194a.setIsLongpressEnabled(z);
        }

        @Override // b.i.p.g.a
        public boolean b(MotionEvent motionEvent) {
            return this.f1194a.onTouchEvent(motionEvent);
        }

        @Override // b.i.p.g.a
        public boolean c() {
            return this.f1194a.isLongpressEnabled();
        }

        @Override // b.i.p.g.a
        public void d(GestureDetector.OnDoubleTapListener onDoubleTapListener) {
            this.f1194a.setOnDoubleTapListener(onDoubleTapListener);
        }
    }

    public g(Context context, GestureDetector.OnGestureListener onGestureListener) {
        this(context, onGestureListener, null);
    }

    public g(Context context, GestureDetector.OnGestureListener onGestureListener, Handler handler) {
        this.f1189a = Build.VERSION.SDK_INT > 17 ? new c(context, onGestureListener, handler) : new b(context, onGestureListener, handler);
    }

    public boolean a() {
        return this.f1189a.c();
    }

    public boolean b(MotionEvent motionEvent) {
        return this.f1189a.b(motionEvent);
    }

    public void c(boolean z) {
        this.f1189a.a(z);
    }

    public void d(GestureDetector.OnDoubleTapListener onDoubleTapListener) {
        this.f1189a.d(onDoubleTapListener);
    }
}

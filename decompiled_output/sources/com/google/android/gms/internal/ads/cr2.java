package com.google.android.gms.internal.ads;

import android.os.Handler;
import android.os.HandlerThread;
import android.os.Message;
import android.view.Choreographer;

/* loaded from: classes.dex */
final class cr2 implements Handler.Callback, Choreographer.FrameCallback {
    private static final cr2 i = new cr2();
    public volatile long d;
    private final Handler e;
    private final HandlerThread f;
    private Choreographer g;
    private int h;

    private cr2() {
        HandlerThread handlerThread = new HandlerThread("ChoreographerOwner:Handler");
        this.f = handlerThread;
        handlerThread.start();
        Handler handler = new Handler(this.f.getLooper(), this);
        this.e = handler;
        handler.sendEmptyMessage(0);
    }

    public static cr2 a() {
        return i;
    }

    public final void b() {
        this.e.sendEmptyMessage(1);
    }

    public final void c() {
        this.e.sendEmptyMessage(2);
    }

    @Override // android.view.Choreographer.FrameCallback
    public final void doFrame(long j) {
        this.d = j;
        this.g.postFrameCallbackDelayed(this, 500L);
    }

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        int r4 = message.what;
        if (r4 == 0) {
            this.g = Choreographer.getInstance();
            return true;
        }
        if (r4 == 1) {
            int r42 = this.h + 1;
            this.h = r42;
            if (r42 == 1) {
                this.g.postFrameCallback(this);
            }
            return true;
        }
        if (r4 != 2) {
            return false;
        }
        int r43 = this.h - 1;
        this.h = r43;
        if (r43 == 0) {
            this.g.removeFrameCallback(this);
            this.d = 0L;
        }
        return true;
    }
}

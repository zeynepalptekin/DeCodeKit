package com.google.android.gms.internal.ads;

import android.annotation.SuppressLint;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.SystemClock;
import android.util.Log;
import com.google.android.gms.internal.ads.up2;
import java.io.IOException;

@SuppressLint({"HandlerLeak"})
/* loaded from: classes.dex */
final class rp2<T extends up2> extends Handler implements Runnable {
    private final T d;
    private final sp2<T> e;
    public final int f;
    private final long g;
    private IOException h;
    private int i;
    private volatile Thread j;
    private volatile boolean k;
    private final /* synthetic */ pp2 l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public rp2(pp2 pp2Var, Looper looper, T t, sp2<T> sp2Var, int r5, long j) {
        super(looper);
        this.l = pp2Var;
        this.d = t;
        this.e = sp2Var;
        this.f = r5;
        this.g = j;
    }

    private final void a() {
        this.h = null;
        this.l.f4864a.execute(this.l.f4865b);
    }

    private final void b() {
        this.l.f4865b = null;
    }

    public final void c(int r3) throws IOException {
        IOException iOException = this.h;
        if (iOException != null && this.i > r3) {
            throw iOException;
        }
    }

    public final void d(long j) {
        vp2.e(this.l.f4865b == null);
        this.l.f4865b = this;
        if (j > 0) {
            sendEmptyMessageDelayed(0, j);
        } else {
            a();
        }
    }

    public final void e(boolean z) {
        this.k = z;
        this.h = null;
        if (hasMessages(0)) {
            removeMessages(0);
            if (!z) {
                sendEmptyMessage(1);
            }
        } else {
            this.d.b();
            if (this.j != null) {
                this.j.interrupt();
            }
        }
        if (z) {
            b();
            long jElapsedRealtime = SystemClock.elapsedRealtime();
            this.e.i(this.d, jElapsedRealtime, jElapsedRealtime - this.g, true);
        }
    }

    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        if (this.k) {
            return;
        }
        int r0 = message.what;
        if (r0 == 0) {
            a();
            return;
        }
        if (r0 == 4) {
            throw ((Error) message.obj);
        }
        b();
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        long j = jElapsedRealtime - this.g;
        if (this.d.c()) {
            this.e.i(this.d, jElapsedRealtime, j, false);
            return;
        }
        int r02 = message.what;
        if (r02 == 1) {
            this.e.i(this.d, jElapsedRealtime, j, false);
            return;
        }
        if (r02 == 2) {
            this.e.p(this.d, jElapsedRealtime, j);
            return;
        }
        if (r02 != 3) {
            return;
        }
        IOException iOException = (IOException) message.obj;
        this.h = iOException;
        int r12 = this.e.c(this.d, jElapsedRealtime, j, iOException);
        if (r12 == 3) {
            this.l.f4866c = this.h;
        } else if (r12 != 2) {
            this.i = r12 == 1 ? 1 : this.i + 1;
            d(Math.min((r12 - 1) * 1000, 5000));
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            this.j = Thread.currentThread();
            if (!this.d.c()) {
                String strValueOf = String.valueOf(this.d.getClass().getSimpleName());
                kq2.a(strValueOf.length() != 0 ? "load:".concat(strValueOf) : new String("load:"));
                try {
                    this.d.a();
                    kq2.b();
                } catch (Throwable th) {
                    kq2.b();
                    throw th;
                }
            }
            if (this.k) {
                return;
            }
            sendEmptyMessage(2);
        } catch (IOException e) {
            if (this.k) {
                return;
            }
            obtainMessage(3, e).sendToTarget();
        } catch (Exception e2) {
            Log.e("LoadTask", "Unexpected exception loading stream", e2);
            if (this.k) {
                return;
            }
            obtainMessage(3, new tp2(e2)).sendToTarget();
        } catch (OutOfMemoryError e3) {
            Log.e("LoadTask", "OutOfMemory error loading stream", e3);
            if (this.k) {
                return;
            }
            obtainMessage(3, new tp2(e3)).sendToTarget();
        } catch (Error e4) {
            Log.e("LoadTask", "Unexpected error loading stream", e4);
            if (!this.k) {
                obtainMessage(4, e4).sendToTarget();
            }
            throw e4;
        } catch (InterruptedException unused) {
            vp2.e(this.d.c());
            if (this.k) {
                return;
            }
            sendEmptyMessage(2);
        }
    }
}

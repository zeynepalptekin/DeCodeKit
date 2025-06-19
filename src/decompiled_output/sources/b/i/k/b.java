package b.i.k;

import android.os.Build;
import android.os.CancellationSignal;
import androidx.annotation.i0;

/* loaded from: classes.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    private boolean f1052a;

    /* renamed from: b, reason: collision with root package name */
    private a f1053b;

    /* renamed from: c, reason: collision with root package name */
    private Object f1054c;
    private boolean d;

    public interface a {
        void onCancel();
    }

    private void f() throws InterruptedException {
        while (this.d) {
            try {
                wait();
            } catch (InterruptedException unused) {
            }
        }
    }

    public void a() {
        synchronized (this) {
            if (this.f1052a) {
                return;
            }
            this.f1052a = true;
            this.d = true;
            a aVar = this.f1053b;
            Object obj = this.f1054c;
            if (aVar != null) {
                try {
                    aVar.onCancel();
                } catch (Throwable th) {
                    synchronized (this) {
                        this.d = false;
                        notifyAll();
                        throw th;
                    }
                }
            }
            if (obj != null && Build.VERSION.SDK_INT >= 16) {
                ((CancellationSignal) obj).cancel();
            }
            synchronized (this) {
                this.d = false;
                notifyAll();
            }
        }
    }

    @i0
    public Object b() {
        Object obj;
        if (Build.VERSION.SDK_INT < 16) {
            return null;
        }
        synchronized (this) {
            if (this.f1054c == null) {
                CancellationSignal cancellationSignal = new CancellationSignal();
                this.f1054c = cancellationSignal;
                if (this.f1052a) {
                    cancellationSignal.cancel();
                }
            }
            obj = this.f1054c;
        }
        return obj;
    }

    public boolean c() {
        boolean z;
        synchronized (this) {
            z = this.f1052a;
        }
        return z;
    }

    public void d(@i0 a aVar) {
        synchronized (this) {
            f();
            if (this.f1053b == aVar) {
                return;
            }
            this.f1053b = aVar;
            if (this.f1052a && aVar != null) {
                aVar.onCancel();
            }
        }
    }

    public void e() {
        if (c()) {
            throw new k();
        }
    }
}

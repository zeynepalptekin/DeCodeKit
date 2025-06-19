package b.c.b;

import android.content.Context;
import android.os.Handler;
import android.os.Message;
import android.util.AttributeSet;
import android.util.Log;
import android.view.InflateException;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.c0;
import androidx.annotation.h0;
import androidx.annotation.i0;
import androidx.annotation.w0;
import b.i.o.h;
import java.util.concurrent.ArrayBlockingQueue;

/* loaded from: classes.dex */
public final class a {
    private static final String e = "AsyncLayoutInflater";

    /* renamed from: a, reason: collision with root package name */
    LayoutInflater f846a;
    private Handler.Callback d = new C0045a();

    /* renamed from: b, reason: collision with root package name */
    Handler f847b = new Handler(this.d);

    /* renamed from: c, reason: collision with root package name */
    d f848c = d.b();

    /* renamed from: b.c.b.a$a, reason: collision with other inner class name */
    class C0045a implements Handler.Callback {
        C0045a() {
        }

        @Override // android.os.Handler.Callback
        public boolean handleMessage(Message message) {
            c cVar = (c) message.obj;
            if (cVar.d == null) {
                cVar.d = a.this.f846a.inflate(cVar.f852c, cVar.f851b, false);
            }
            cVar.e.a(cVar.d, cVar.f852c, cVar.f851b);
            a.this.f848c.d(cVar);
            return true;
        }
    }

    private static class b extends LayoutInflater {

        /* renamed from: a, reason: collision with root package name */
        private static final String[] f849a = {"android.widget.", "android.webkit.", "android.app."};

        b(Context context) {
            super(context);
        }

        @Override // android.view.LayoutInflater
        public LayoutInflater cloneInContext(Context context) {
            return new b(context);
        }

        @Override // android.view.LayoutInflater
        protected View onCreateView(String str, AttributeSet attributeSet) throws InflateException, ClassNotFoundException {
            View viewCreateView;
            for (String str2 : f849a) {
                try {
                    viewCreateView = createView(str, str2, attributeSet);
                } catch (ClassNotFoundException unused) {
                }
                if (viewCreateView != null) {
                    return viewCreateView;
                }
            }
            return super.onCreateView(str, attributeSet);
        }
    }

    private static class c {

        /* renamed from: a, reason: collision with root package name */
        a f850a;

        /* renamed from: b, reason: collision with root package name */
        ViewGroup f851b;

        /* renamed from: c, reason: collision with root package name */
        int f852c;
        View d;
        e e;

        c() {
        }
    }

    private static class d extends Thread {
        private static final d f;
        private ArrayBlockingQueue<c> d = new ArrayBlockingQueue<>(10);
        private h.c<c> e = new h.c<>(10);

        static {
            d dVar = new d();
            f = dVar;
            dVar.start();
        }

        private d() {
        }

        public static d b() {
            return f;
        }

        public void a(c cVar) throws InterruptedException {
            try {
                this.d.put(cVar);
            } catch (InterruptedException e) {
                throw new RuntimeException("Failed to enqueue async inflate request", e);
            }
        }

        public c c() {
            c cVarB = this.e.b();
            return cVarB == null ? new c() : cVarB;
        }

        public void d(c cVar) {
            cVar.e = null;
            cVar.f850a = null;
            cVar.f851b = null;
            cVar.f852c = 0;
            cVar.d = null;
            this.e.a(cVar);
        }

        public void e() throws InterruptedException {
            try {
                c cVarTake = this.d.take();
                try {
                    cVarTake.d = cVarTake.f850a.f846a.inflate(cVarTake.f852c, cVarTake.f851b, false);
                } catch (RuntimeException e) {
                    Log.w(a.e, "Failed to inflate resource in the background! Retrying on the UI thread", e);
                }
                Message.obtain(cVarTake.f850a.f847b, 0, cVarTake).sendToTarget();
            } catch (InterruptedException e2) {
                Log.w(a.e, e2);
            }
        }

        @Override // java.lang.Thread, java.lang.Runnable
        public void run() throws InterruptedException {
            while (true) {
                e();
            }
        }
    }

    public interface e {
        void a(@h0 View view, @c0 int r2, @i0 ViewGroup viewGroup);
    }

    public a(@h0 Context context) {
        this.f846a = new b(context);
    }

    @w0
    public void a(@c0 int r2, @i0 ViewGroup viewGroup, @h0 e eVar) throws InterruptedException {
        if (eVar == null) {
            throw new NullPointerException("callback argument may not be null!");
        }
        c cVarC = this.f848c.c();
        cVarC.f850a = this;
        cVarC.f852c = r2;
        cVarC.f851b = viewGroup;
        cVarC.e = eVar;
        this.f848c.a(cVarC);
    }
}

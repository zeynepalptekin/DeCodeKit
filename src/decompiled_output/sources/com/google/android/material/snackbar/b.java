package com.google.android.material.snackbar;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import androidx.annotation.h0;
import androidx.annotation.i0;
import java.lang.ref.WeakReference;

/* loaded from: classes.dex */
class b {
    static final int e = 0;
    private static final int f = 1500;
    private static final int g = 2750;
    private static b h;

    /* renamed from: a, reason: collision with root package name */
    @h0
    private final Object f6793a = new Object();

    /* renamed from: b, reason: collision with root package name */
    @h0
    private final Handler f6794b = new Handler(Looper.getMainLooper(), new a());

    /* renamed from: c, reason: collision with root package name */
    @i0
    private c f6795c;

    @i0
    private c d;

    class a implements Handler.Callback {
        a() {
        }

        @Override // android.os.Handler.Callback
        public boolean handleMessage(@h0 Message message) {
            if (message.what != 0) {
                return false;
            }
            b.this.d((c) message.obj);
            return true;
        }
    }

    /* renamed from: com.google.android.material.snackbar.b$b, reason: collision with other inner class name */
    interface InterfaceC0201b {
        void a(int r1);

        void y();
    }

    private static class c {

        /* renamed from: a, reason: collision with root package name */
        @h0
        final WeakReference<InterfaceC0201b> f6796a;

        /* renamed from: b, reason: collision with root package name */
        int f6797b;

        /* renamed from: c, reason: collision with root package name */
        boolean f6798c;

        c(int r2, InterfaceC0201b interfaceC0201b) {
            this.f6796a = new WeakReference<>(interfaceC0201b);
            this.f6797b = r2;
        }

        boolean a(@i0 InterfaceC0201b interfaceC0201b) {
            return interfaceC0201b != null && this.f6796a.get() == interfaceC0201b;
        }
    }

    private b() {
    }

    private boolean a(@h0 c cVar, int r4) {
        InterfaceC0201b interfaceC0201b = cVar.f6796a.get();
        if (interfaceC0201b == null) {
            return false;
        }
        this.f6794b.removeCallbacksAndMessages(cVar);
        interfaceC0201b.a(r4);
        return true;
    }

    static b c() {
        if (h == null) {
            h = new b();
        }
        return h;
    }

    private boolean g(InterfaceC0201b interfaceC0201b) {
        c cVar = this.f6795c;
        return cVar != null && cVar.a(interfaceC0201b);
    }

    private boolean h(InterfaceC0201b interfaceC0201b) {
        c cVar = this.d;
        return cVar != null && cVar.a(interfaceC0201b);
    }

    private void m(@h0 c cVar) {
        int r0 = cVar.f6797b;
        if (r0 == -2) {
            return;
        }
        if (r0 <= 0) {
            r0 = r0 == -1 ? 1500 : g;
        }
        this.f6794b.removeCallbacksAndMessages(cVar);
        Handler handler = this.f6794b;
        handler.sendMessageDelayed(Message.obtain(handler, 0, cVar), r0);
    }

    private void o() {
        c cVar = this.d;
        if (cVar != null) {
            this.f6795c = cVar;
            this.d = null;
            InterfaceC0201b interfaceC0201b = cVar.f6796a.get();
            if (interfaceC0201b != null) {
                interfaceC0201b.y();
            } else {
                this.f6795c = null;
            }
        }
    }

    public void b(InterfaceC0201b interfaceC0201b, int r4) {
        c cVar;
        synchronized (this.f6793a) {
            if (g(interfaceC0201b)) {
                cVar = this.f6795c;
            } else if (h(interfaceC0201b)) {
                cVar = this.d;
            }
            a(cVar, r4);
        }
    }

    void d(@h0 c cVar) {
        synchronized (this.f6793a) {
            if (this.f6795c == cVar || this.d == cVar) {
                a(cVar, 2);
            }
        }
    }

    public boolean e(InterfaceC0201b interfaceC0201b) {
        boolean zG;
        synchronized (this.f6793a) {
            zG = g(interfaceC0201b);
        }
        return zG;
    }

    public boolean f(InterfaceC0201b interfaceC0201b) {
        boolean z;
        synchronized (this.f6793a) {
            z = g(interfaceC0201b) || h(interfaceC0201b);
        }
        return z;
    }

    public void i(InterfaceC0201b interfaceC0201b) {
        synchronized (this.f6793a) {
            if (g(interfaceC0201b)) {
                this.f6795c = null;
                if (this.d != null) {
                    o();
                }
            }
        }
    }

    public void j(InterfaceC0201b interfaceC0201b) {
        synchronized (this.f6793a) {
            if (g(interfaceC0201b)) {
                m(this.f6795c);
            }
        }
    }

    public void k(InterfaceC0201b interfaceC0201b) {
        synchronized (this.f6793a) {
            if (g(interfaceC0201b) && !this.f6795c.f6798c) {
                this.f6795c.f6798c = true;
                this.f6794b.removeCallbacksAndMessages(this.f6795c);
            }
        }
    }

    public void l(InterfaceC0201b interfaceC0201b) {
        synchronized (this.f6793a) {
            if (g(interfaceC0201b) && this.f6795c.f6798c) {
                this.f6795c.f6798c = false;
                m(this.f6795c);
            }
        }
    }

    public void n(int r3, InterfaceC0201b interfaceC0201b) {
        synchronized (this.f6793a) {
            if (g(interfaceC0201b)) {
                this.f6795c.f6797b = r3;
                this.f6794b.removeCallbacksAndMessages(this.f6795c);
                m(this.f6795c);
                return;
            }
            if (h(interfaceC0201b)) {
                this.d.f6797b = r3;
            } else {
                this.d = new c(r3, interfaceC0201b);
            }
            if (this.f6795c == null || !a(this.f6795c, 4)) {
                this.f6795c = null;
                o();
            }
        }
    }
}

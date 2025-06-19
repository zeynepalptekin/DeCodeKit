package com.google.android.gms.common.internal;

import android.accounts.Account;
import android.app.PendingIntent;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.Bundle;
import android.os.DeadObjectException;
import android.os.Handler;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import android.os.Message;
import android.os.RemoteException;
import android.text.TextUtils;
import android.util.Log;
import androidx.annotation.RecentlyNonNull;
import androidx.annotation.RecentlyNullable;
import androidx.annotation.y0;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.internal.h;
import com.google.android.gms.common.internal.m;
import com.google.android.gms.common.internal.n;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.Locale;
import java.util.Set;
import java.util.concurrent.atomic.AtomicInteger;
import javax.annotation.concurrent.GuardedBy;

@com.google.android.gms.common.annotation.a
/* loaded from: classes.dex */
public abstract class d<T extends IInterface> {

    @RecentlyNonNull
    @com.google.android.gms.common.annotation.a
    public static final int C = 1;

    @RecentlyNonNull
    @com.google.android.gms.common.annotation.a
    public static final int D = 4;

    @RecentlyNonNull
    @com.google.android.gms.common.annotation.a
    public static final int E = 5;

    @RecentlyNonNull
    @com.google.android.gms.common.annotation.a
    public static final String G = "pendingIntent";

    @RecentlyNonNull
    @com.google.android.gms.common.annotation.a
    public static final String H = "<<default account>>";

    @androidx.annotation.i0
    private volatile c0 A;

    @RecentlyNonNull
    @com.google.android.gms.common.util.d0
    protected AtomicInteger B;

    /* renamed from: a, reason: collision with root package name */
    private int f2509a;

    /* renamed from: b, reason: collision with root package name */
    private long f2510b;

    /* renamed from: c, reason: collision with root package name */
    private long f2511c;
    private int d;
    private long e;

    @androidx.annotation.i0
    private volatile String f;

    @com.google.android.gms.common.util.d0
    private l0 g;
    private final Context h;
    private final Looper i;
    private final com.google.android.gms.common.internal.h j;
    private final c.a.b.b.d.f k;
    final Handler l;
    private final Object m;
    private final Object n;

    @androidx.annotation.i0
    @GuardedBy("mServiceBrokerLock")
    private n o;

    @RecentlyNonNull
    @com.google.android.gms.common.util.d0
    protected c p;

    @androidx.annotation.i0
    @GuardedBy("mLock")
    private T q;
    private final ArrayList<h<?>> r;

    @androidx.annotation.i0
    @GuardedBy("mLock")
    private i s;

    @GuardedBy("mLock")
    private int t;

    @androidx.annotation.i0
    private final a u;

    @androidx.annotation.i0
    private final b v;
    private final int w;

    @androidx.annotation.i0
    private final String x;

    @androidx.annotation.i0
    private c.a.b.b.d.c y;
    private boolean z;
    private static final c.a.b.b.d.d[] F = new c.a.b.b.d.d[0];

    @RecentlyNonNull
    @com.google.android.gms.common.annotation.a
    public static final String[] I = {"service_esmobile", "service_googleme"};

    @com.google.android.gms.common.annotation.a
    public interface a {

        /* renamed from: b, reason: collision with root package name */
        @RecentlyNonNull
        @com.google.android.gms.common.annotation.a
        public static final int f2512b = 1;

        /* renamed from: c, reason: collision with root package name */
        @RecentlyNonNull
        @com.google.android.gms.common.annotation.a
        public static final int f2513c = 3;

        @com.google.android.gms.common.annotation.a
        void a(@RecentlyNonNull int r1);

        @com.google.android.gms.common.annotation.a
        void c(@androidx.annotation.i0 Bundle bundle);
    }

    @com.google.android.gms.common.annotation.a
    public interface b {
        @com.google.android.gms.common.annotation.a
        void b(@RecentlyNonNull c.a.b.b.d.c cVar);
    }

    @com.google.android.gms.common.annotation.a
    public interface c {
        @com.google.android.gms.common.annotation.a
        void a(@RecentlyNonNull c.a.b.b.d.c cVar);
    }

    /* renamed from: com.google.android.gms.common.internal.d$d, reason: collision with other inner class name */
    protected class C0166d implements c {
        @com.google.android.gms.common.annotation.a
        public C0166d() {
        }

        @Override // com.google.android.gms.common.internal.d.c
        public void a(@RecentlyNonNull c.a.b.b.d.c cVar) {
            if (cVar.t()) {
                d dVar = d.this;
                dVar.t(null, dVar.u());
            } else if (d.this.v != null) {
                d.this.v.b(cVar);
            }
        }
    }

    @com.google.android.gms.common.annotation.a
    public interface e {
        @com.google.android.gms.common.annotation.a
        void a();
    }

    private abstract class f extends h<Boolean> {
        private final int d;

        @androidx.annotation.i0
        private final Bundle e;

        @androidx.annotation.g
        protected f(int r3, @androidx.annotation.i0 Bundle bundle) {
            super(Boolean.TRUE);
            this.d = r3;
            this.e = bundle;
        }

        @Override // com.google.android.gms.common.internal.d.h
        protected final /* synthetic */ void a(Boolean bool) {
            if (bool == null) {
                d.this.X(1, null);
                return;
            }
            if (this.d != 0) {
                d.this.X(1, null);
                Bundle bundle = this.e;
                f(new c.a.b.b.d.c(this.d, bundle != null ? (PendingIntent) bundle.getParcelable(d.G) : null));
            } else {
                if (g()) {
                    return;
                }
                d.this.X(1, null);
                f(new c.a.b.b.d.c(8, null));
            }
        }

        @Override // com.google.android.gms.common.internal.d.h
        protected final void b() {
        }

        protected abstract void f(c.a.b.b.d.c cVar);

        protected abstract boolean g();
    }

    final class g extends c.a.b.b.g.b.i {
        public g(Looper looper) {
            super(looper);
        }

        private static void a(Message message) {
            h hVar = (h) message.obj;
            hVar.b();
            hVar.d();
        }

        private static boolean b(Message message) {
            int r2 = message.what;
            return r2 == 2 || r2 == 1 || r2 == 7;
        }

        @Override // android.os.Handler
        public final void handleMessage(Message message) {
            if (d.this.B.get() != message.arg1) {
                if (b(message)) {
                    a(message);
                    return;
                }
                return;
            }
            int r0 = message.what;
            if ((r0 == 1 || r0 == 7 || ((r0 == 4 && !d.this.h()) || message.what == 5)) && !d.this.E()) {
                a(message);
                return;
            }
            int r02 = message.what;
            if (r02 == 4) {
                d.this.y = new c.a.b.b.d.c(message.arg2);
                if (d.this.g0() && !d.this.z) {
                    d.this.X(3, null);
                    return;
                }
                c.a.b.b.d.c cVar = d.this.y != null ? d.this.y : new c.a.b.b.d.c(8);
                d.this.p.a(cVar);
                d.this.G(cVar);
                return;
            }
            if (r02 == 5) {
                c.a.b.b.d.c cVar2 = d.this.y != null ? d.this.y : new c.a.b.b.d.c(8);
                d.this.p.a(cVar2);
                d.this.G(cVar2);
                return;
            }
            if (r02 == 3) {
                Object obj = message.obj;
                c.a.b.b.d.c cVar3 = new c.a.b.b.d.c(message.arg2, obj instanceof PendingIntent ? (PendingIntent) obj : null);
                d.this.p.a(cVar3);
                d.this.G(cVar3);
                return;
            }
            if (r02 == 6) {
                d.this.X(5, null);
                if (d.this.u != null) {
                    d.this.u.a(message.arg2);
                }
                d.this.H(message.arg2);
                d.this.c0(5, 1, null);
                return;
            }
            if (r02 == 2 && !d.this.D()) {
                a(message);
                return;
            }
            if (b(message)) {
                ((h) message.obj).c();
                return;
            }
            int r8 = message.what;
            StringBuilder sb = new StringBuilder(45);
            sb.append("Don't know how to handle message: ");
            sb.append(r8);
            Log.wtf("GmsClient", sb.toString(), new Exception());
        }
    }

    protected abstract class h<TListener> {

        /* renamed from: a, reason: collision with root package name */
        @androidx.annotation.i0
        private TListener f2516a;

        /* renamed from: b, reason: collision with root package name */
        private boolean f2517b = false;

        public h(TListener tlistener) {
            this.f2516a = tlistener;
        }

        protected abstract void a(TListener tlistener);

        protected abstract void b();

        public final void c() {
            TListener tlistener;
            synchronized (this) {
                tlistener = this.f2516a;
                if (this.f2517b) {
                    String strValueOf = String.valueOf(this);
                    StringBuilder sb = new StringBuilder(String.valueOf(strValueOf).length() + 47);
                    sb.append("Callback proxy ");
                    sb.append(strValueOf);
                    sb.append(" being reused. This is not safe.");
                    Log.w("GmsClient", sb.toString());
                }
            }
            if (tlistener != null) {
                try {
                    a(tlistener);
                } catch (RuntimeException e) {
                    b();
                    throw e;
                }
            } else {
                b();
            }
            synchronized (this) {
                this.f2517b = true;
            }
            d();
        }

        public final void d() {
            e();
            synchronized (d.this.r) {
                d.this.r.remove(this);
            }
        }

        public final void e() {
            synchronized (this) {
                this.f2516a = null;
            }
        }
    }

    @com.google.android.gms.common.util.d0
    public final class i implements ServiceConnection {
        private final int d;

        public i(int r2) {
            this.d = r2;
        }

        @Override // android.content.ServiceConnection
        public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
            d dVar = d.this;
            if (iBinder == null) {
                dVar.V(16);
                return;
            }
            synchronized (dVar.n) {
                d dVar2 = d.this;
                IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.common.internal.IGmsServiceBroker");
                dVar2.o = (iInterfaceQueryLocalInterface == null || !(iInterfaceQueryLocalInterface instanceof n)) ? new n.a.C0169a(iBinder) : (n) iInterfaceQueryLocalInterface;
            }
            d.this.W(0, null, this.d);
        }

        @Override // android.content.ServiceConnection
        public final void onServiceDisconnected(ComponentName componentName) {
            synchronized (d.this.n) {
                d.this.o = null;
            }
            Handler handler = d.this.l;
            handler.sendMessage(handler.obtainMessage(6, this.d, 1));
        }
    }

    @com.google.android.gms.common.util.d0
    public static final class j extends m.a {

        @androidx.annotation.i0
        private d e;
        private final int f;

        public j(@androidx.annotation.h0 d dVar, int r2) {
            this.e = dVar;
            this.f = r2;
        }

        @Override // com.google.android.gms.common.internal.m
        @androidx.annotation.g
        public final void I7(int r2, @androidx.annotation.i0 Bundle bundle) {
            Log.wtf("GmsClient", "received deprecated onAccountValidationComplete callback, ignoring", new Exception());
        }

        @Override // com.google.android.gms.common.internal.m
        @androidx.annotation.g
        public final void P4(int r3, @androidx.annotation.h0 IBinder iBinder, @androidx.annotation.h0 c0 c0Var) {
            d dVar = this.e;
            r.l(dVar, "onPostInitCompleteWithConnectionInfo can be called only once per call togetRemoteService");
            r.k(c0Var);
            dVar.b0(c0Var);
            t8(r3, iBinder, c0Var.d);
        }

        @Override // com.google.android.gms.common.internal.m
        @androidx.annotation.g
        public final void t8(int r3, @androidx.annotation.h0 IBinder iBinder, @androidx.annotation.i0 Bundle bundle) {
            r.l(this.e, "onPostInitComplete can be called only once per call to getRemoteService");
            this.e.I(r3, iBinder, bundle, this.f);
            this.e = null;
        }
    }

    protected final class k extends f {

        @androidx.annotation.i0
        private final IBinder g;

        @androidx.annotation.g
        public k(int r2, @androidx.annotation.i0 IBinder iBinder, @androidx.annotation.i0 Bundle bundle) {
            super(r2, bundle);
            this.g = iBinder;
        }

        @Override // com.google.android.gms.common.internal.d.f
        protected final void f(c.a.b.b.d.c cVar) {
            if (d.this.v != null) {
                d.this.v.b(cVar);
            }
            d.this.G(cVar);
        }

        @Override // com.google.android.gms.common.internal.d.f
        protected final boolean g() throws RemoteException {
            try {
                String interfaceDescriptor = ((IBinder) r.k(this.g)).getInterfaceDescriptor();
                if (!d.this.x().equals(interfaceDescriptor)) {
                    String strX = d.this.x();
                    StringBuilder sb = new StringBuilder(String.valueOf(strX).length() + 34 + String.valueOf(interfaceDescriptor).length());
                    sb.append("service descriptor mismatch: ");
                    sb.append(strX);
                    sb.append(" vs. ");
                    sb.append(interfaceDescriptor);
                    Log.e("GmsClient", sb.toString());
                    return false;
                }
                IInterface iInterfaceD = d.this.d(this.g);
                if (iInterfaceD == null || !(d.this.c0(2, 4, iInterfaceD) || d.this.c0(3, 4, iInterfaceD))) {
                    return false;
                }
                d.this.y = null;
                Bundle bundleL = d.this.l();
                if (d.this.u == null) {
                    return true;
                }
                d.this.u.c(bundleL);
                return true;
            } catch (RemoteException unused) {
                Log.w("GmsClient", "service probably died");
                return false;
            }
        }
    }

    protected final class l extends f {
        @androidx.annotation.g
        public l(int r2, @androidx.annotation.i0 Bundle bundle) {
            super(r2, null);
        }

        @Override // com.google.android.gms.common.internal.d.f
        protected final void f(c.a.b.b.d.c cVar) {
            if (d.this.h() && d.this.g0()) {
                d.this.V(16);
            } else {
                d.this.p.a(cVar);
                d.this.G(cVar);
            }
        }

        @Override // com.google.android.gms.common.internal.d.f
        protected final boolean g() {
            d.this.p.a(c.a.b.b.d.c.E);
            return true;
        }
    }

    @com.google.android.gms.common.util.d0
    @com.google.android.gms.common.annotation.a
    protected d(@RecentlyNonNull Context context, @RecentlyNonNull Handler handler, @RecentlyNonNull com.google.android.gms.common.internal.h hVar, @RecentlyNonNull c.a.b.b.d.f fVar, @RecentlyNonNull int r8, @androidx.annotation.i0 a aVar, @androidx.annotation.i0 b bVar) {
        this.f = null;
        this.m = new Object();
        this.n = new Object();
        this.r = new ArrayList<>();
        this.t = 1;
        this.y = null;
        this.z = false;
        this.A = null;
        this.B = new AtomicInteger(0);
        this.h = (Context) r.l(context, "Context must not be null");
        this.l = (Handler) r.l(handler, "Handler must not be null");
        this.i = handler.getLooper();
        this.j = (com.google.android.gms.common.internal.h) r.l(hVar, "Supervisor must not be null");
        this.k = (c.a.b.b.d.f) r.l(fVar, "API availability must not be null");
        this.w = r8;
        this.u = aVar;
        this.v = bVar;
        this.x = null;
    }

    @com.google.android.gms.common.annotation.a
    protected d(@RecentlyNonNull Context context, @RecentlyNonNull Looper looper, @RecentlyNonNull int r12, @RecentlyNonNull a aVar, @RecentlyNonNull b bVar, @RecentlyNonNull String str) {
        this(context, looper, com.google.android.gms.common.internal.h.d(context), c.a.b.b.d.f.i(), r12, (a) r.k(aVar), (b) r.k(bVar), str);
    }

    @com.google.android.gms.common.util.d0
    @com.google.android.gms.common.annotation.a
    protected d(@RecentlyNonNull Context context, @RecentlyNonNull Looper looper, @RecentlyNonNull com.google.android.gms.common.internal.h hVar, @RecentlyNonNull c.a.b.b.d.f fVar, @RecentlyNonNull int r7, @androidx.annotation.i0 a aVar, @androidx.annotation.i0 b bVar, @androidx.annotation.i0 String str) {
        this.f = null;
        this.m = new Object();
        this.n = new Object();
        this.r = new ArrayList<>();
        this.t = 1;
        this.y = null;
        this.z = false;
        this.A = null;
        this.B = new AtomicInteger(0);
        this.h = (Context) r.l(context, "Context must not be null");
        this.i = (Looper) r.l(looper, "Looper must not be null");
        this.j = (com.google.android.gms.common.internal.h) r.l(hVar, "Supervisor must not be null");
        this.k = (c.a.b.b.d.f) r.l(fVar, "API availability must not be null");
        this.l = new g(looper);
        this.w = r7;
        this.u = aVar;
        this.v = bVar;
        this.x = str;
    }

    private final String U() {
        String str = this.x;
        return str == null ? this.h.getClass().getName() : str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void V(int r4) {
        int r42;
        if (e0()) {
            r42 = 5;
            this.z = true;
        } else {
            r42 = 4;
        }
        Handler handler = this.l;
        handler.sendMessage(handler.obtainMessage(r42, this.B.get(), 16));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void X(int r13, @androidx.annotation.i0 T t) {
        r.a((r13 == 4) == (t != null));
        synchronized (this.m) {
            this.t = r13;
            this.q = t;
            if (r13 == 1) {
                i iVar = this.s;
                if (iVar != null) {
                    this.j.g((String) r.k(this.g.a()), this.g.b(), this.g.c(), iVar, U(), this.g.d());
                    this.s = null;
                }
            } else if (r13 == 2 || r13 == 3) {
                i iVar2 = this.s;
                if (iVar2 != null && this.g != null) {
                    String strA = this.g.a();
                    String strB = this.g.b();
                    StringBuilder sb = new StringBuilder(String.valueOf(strA).length() + 70 + String.valueOf(strB).length());
                    sb.append("Calling connect() while still connected, missing disconnect() for ");
                    sb.append(strA);
                    sb.append(" on ");
                    sb.append(strB);
                    Log.e("GmsClient", sb.toString());
                    this.j.g((String) r.k(this.g.a()), this.g.b(), this.g.c(), iVar2, U(), this.g.d());
                    this.B.incrementAndGet();
                }
                i iVar3 = new i(this.B.get());
                this.s = iVar3;
                l0 l0Var = (this.t != 3 || q() == null) ? new l0(A(), z(), false, com.google.android.gms.common.internal.h.c(), C()) : new l0(m().getPackageName(), q(), true, com.google.android.gms.common.internal.h.c(), false);
                this.g = l0Var;
                if (l0Var.d() && s() < 17895000) {
                    String strValueOf = String.valueOf(this.g.a());
                    throw new IllegalStateException(strValueOf.length() != 0 ? "Internal Error, the minimum apk version of this BaseGmsClient is too low to support dynamic lookup. Start service action: ".concat(strValueOf) : new String("Internal Error, the minimum apk version of this BaseGmsClient is too low to support dynamic lookup. Start service action: "));
                }
                if (!this.j.h(new h.a((String) r.k(this.g.a()), this.g.b(), this.g.c(), this.g.d()), iVar3, U())) {
                    String strA2 = this.g.a();
                    String strB2 = this.g.b();
                    StringBuilder sb2 = new StringBuilder(String.valueOf(strA2).length() + 34 + String.valueOf(strB2).length());
                    sb2.append("unable to connect to service: ");
                    sb2.append(strA2);
                    sb2.append(" on ");
                    sb2.append(strB2);
                    Log.e("GmsClient", sb2.toString());
                    W(16, null, this.B.get());
                }
            } else if (r13 == 4) {
                F((IInterface) r.k(t));
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void b0(c0 c0Var) {
        this.A = c0Var;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean c0(int r3, int r4, @androidx.annotation.i0 T t) {
        synchronized (this.m) {
            if (this.t != r3) {
                return false;
            }
            X(r4, t);
            return true;
        }
    }

    private final boolean e0() {
        boolean z;
        synchronized (this.m) {
            z = this.t == 3;
        }
        return z;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean g0() throws ClassNotFoundException {
        if (this.z || TextUtils.isEmpty(x()) || TextUtils.isEmpty(q())) {
            return false;
        }
        try {
            Class.forName(x());
            return true;
        } catch (ClassNotFoundException unused) {
            return false;
        }
    }

    @RecentlyNonNull
    @com.google.android.gms.common.annotation.a
    protected String A() {
        return "com.google.android.gms";
    }

    @RecentlyNullable
    @com.google.android.gms.common.annotation.a
    public com.google.android.gms.common.internal.e B() {
        c0 c0Var = this.A;
        return null;
    }

    @RecentlyNonNull
    @com.google.android.gms.common.annotation.a
    protected boolean C() {
        return false;
    }

    @RecentlyNonNull
    @com.google.android.gms.common.annotation.a
    public boolean D() {
        boolean z;
        synchronized (this.m) {
            z = this.t == 4;
        }
        return z;
    }

    @RecentlyNonNull
    @com.google.android.gms.common.annotation.a
    public boolean E() {
        boolean z;
        synchronized (this.m) {
            z = this.t == 2 || this.t == 3;
        }
        return z;
    }

    @androidx.annotation.i
    @com.google.android.gms.common.annotation.a
    protected void F(@RecentlyNonNull T t) {
        this.f2511c = System.currentTimeMillis();
    }

    @androidx.annotation.i
    @com.google.android.gms.common.annotation.a
    protected void G(@RecentlyNonNull c.a.b.b.d.c cVar) {
        this.d = cVar.h();
        this.e = System.currentTimeMillis();
    }

    @androidx.annotation.i
    @com.google.android.gms.common.annotation.a
    protected void H(@RecentlyNonNull int r3) {
        this.f2509a = r3;
        this.f2510b = System.currentTimeMillis();
    }

    @com.google.android.gms.common.annotation.a
    protected void I(@RecentlyNonNull int r3, @androidx.annotation.i0 IBinder iBinder, @androidx.annotation.i0 Bundle bundle, @RecentlyNonNull int r6) {
        Handler handler = this.l;
        handler.sendMessage(handler.obtainMessage(1, r6, -1, new k(r3, iBinder, bundle)));
    }

    @com.google.android.gms.common.annotation.a
    public void J(@RecentlyNonNull e eVar) {
        eVar.a();
    }

    @RecentlyNonNull
    @com.google.android.gms.common.annotation.a
    public boolean K() {
        return false;
    }

    @RecentlyNonNull
    @com.google.android.gms.common.annotation.a
    public boolean L() {
        return false;
    }

    @RecentlyNonNull
    @com.google.android.gms.common.annotation.a
    public boolean M() {
        return true;
    }

    @RecentlyNonNull
    @com.google.android.gms.common.annotation.a
    public boolean N() {
        return false;
    }

    @com.google.android.gms.common.annotation.a
    public void O(@RecentlyNonNull int r4) {
        Handler handler = this.l;
        handler.sendMessage(handler.obtainMessage(6, this.B.get(), r4));
    }

    @com.google.android.gms.common.util.d0
    @com.google.android.gms.common.annotation.a
    protected void P(@RecentlyNonNull c cVar, @RecentlyNonNull int r4, @androidx.annotation.i0 PendingIntent pendingIntent) {
        this.p = (c) r.l(cVar, "Connection progress callbacks cannot be null.");
        Handler handler = this.l;
        handler.sendMessage(handler.obtainMessage(3, this.B.get(), r4, pendingIntent));
    }

    @RecentlyNonNull
    @com.google.android.gms.common.annotation.a
    public boolean Q() {
        return false;
    }

    protected final void W(@RecentlyNonNull int r3, @androidx.annotation.i0 Bundle bundle, @RecentlyNonNull int r5) {
        Handler handler = this.l;
        handler.sendMessage(handler.obtainMessage(7, r5, -1, new l(r3, null)));
    }

    @com.google.android.gms.common.annotation.a
    public void a() {
        int r0 = this.k.k(this.h, s());
        if (r0 == 0) {
            c(new C0166d());
        } else {
            X(1, null);
            P(new C0166d(), r0, null);
        }
    }

    @com.google.android.gms.common.annotation.a
    protected final void b() {
        if (!D()) {
            throw new IllegalStateException("Not connected. Call connect() and wait for onConnected() to be called.");
        }
    }

    @com.google.android.gms.common.annotation.a
    public void c(@RecentlyNonNull c cVar) {
        this.p = (c) r.l(cVar, "Connection progress callbacks cannot be null.");
        X(2, null);
    }

    @RecentlyNullable
    @com.google.android.gms.common.annotation.a
    protected abstract T d(@RecentlyNonNull IBinder iBinder);

    @com.google.android.gms.common.annotation.a
    public void e() {
        this.B.incrementAndGet();
        synchronized (this.r) {
            int size = this.r.size();
            for (int r2 = 0; r2 < size; r2++) {
                this.r.get(r2).e();
            }
            this.r.clear();
        }
        synchronized (this.n) {
            this.o = null;
        }
        X(1, null);
    }

    @com.google.android.gms.common.annotation.a
    public void f(@RecentlyNonNull String str) {
        this.f = str;
        e();
    }

    @com.google.android.gms.common.annotation.a
    public void g(@RecentlyNonNull String str, @RecentlyNonNull FileDescriptor fileDescriptor, @RecentlyNonNull PrintWriter printWriter, @RecentlyNonNull String[] strArr) {
        int r14;
        T t;
        n nVar;
        synchronized (this.m) {
            r14 = this.t;
            t = this.q;
        }
        synchronized (this.n) {
            nVar = this.o;
        }
        printWriter.append((CharSequence) str).append("mConnectState=");
        printWriter.print(r14 != 1 ? r14 != 2 ? r14 != 3 ? r14 != 4 ? r14 != 5 ? "UNKNOWN" : "DISCONNECTING" : "CONNECTED" : "LOCAL_CONNECTING" : "REMOTE_CONNECTING" : "DISCONNECTED");
        printWriter.append(" mService=");
        if (t == null) {
            printWriter.append("null");
        } else {
            printWriter.append((CharSequence) x()).append("@").append((CharSequence) Integer.toHexString(System.identityHashCode(t.asBinder())));
        }
        printWriter.append(" mServiceBroker=");
        if (nVar == null) {
            printWriter.println("null");
        } else {
            printWriter.append("IGmsServiceBroker@").println(Integer.toHexString(System.identityHashCode(nVar.asBinder())));
        }
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss.SSS", Locale.US);
        if (this.f2511c > 0) {
            PrintWriter printWriterAppend = printWriter.append((CharSequence) str).append("lastConnectedTime=");
            long j2 = this.f2511c;
            String str2 = simpleDateFormat.format(new Date(this.f2511c));
            StringBuilder sb = new StringBuilder(String.valueOf(str2).length() + 21);
            sb.append(j2);
            sb.append(" ");
            sb.append(str2);
            printWriterAppend.println(sb.toString());
        }
        if (this.f2510b > 0) {
            printWriter.append((CharSequence) str).append("lastSuspendedCause=");
            int r142 = this.f2509a;
            printWriter.append((CharSequence) (r142 != 1 ? r142 != 2 ? r142 != 3 ? String.valueOf(r142) : "CAUSE_DEAD_OBJECT_EXCEPTION" : "CAUSE_NETWORK_LOST" : "CAUSE_SERVICE_DISCONNECTED"));
            PrintWriter printWriterAppend2 = printWriter.append(" lastSuspendedTime=");
            long j3 = this.f2510b;
            String str3 = simpleDateFormat.format(new Date(this.f2510b));
            StringBuilder sb2 = new StringBuilder(String.valueOf(str3).length() + 21);
            sb2.append(j3);
            sb2.append(" ");
            sb2.append(str3);
            printWriterAppend2.println(sb2.toString());
        }
        if (this.e > 0) {
            printWriter.append((CharSequence) str).append("lastFailedStatus=").append((CharSequence) com.google.android.gms.common.api.b.a(this.d));
            PrintWriter printWriterAppend3 = printWriter.append(" lastFailedTime=");
            long j4 = this.e;
            String str4 = simpleDateFormat.format(new Date(this.e));
            StringBuilder sb3 = new StringBuilder(String.valueOf(str4).length() + 21);
            sb3.append(j4);
            sb3.append(" ");
            sb3.append(str4);
            printWriterAppend3.println(sb3.toString());
        }
    }

    @RecentlyNonNull
    @com.google.android.gms.common.annotation.a
    protected boolean h() {
        return false;
    }

    @RecentlyNullable
    @com.google.android.gms.common.annotation.a
    public Account i() {
        return null;
    }

    @RecentlyNonNull
    @com.google.android.gms.common.annotation.a
    public c.a.b.b.d.d[] j() {
        return F;
    }

    @RecentlyNullable
    @com.google.android.gms.common.annotation.a
    public final c.a.b.b.d.d[] k() {
        c0 c0Var = this.A;
        if (c0Var == null) {
            return null;
        }
        return c0Var.e;
    }

    @RecentlyNullable
    @com.google.android.gms.common.annotation.a
    public Bundle l() {
        return null;
    }

    @RecentlyNonNull
    @com.google.android.gms.common.annotation.a
    public final Context m() {
        return this.h;
    }

    @RecentlyNonNull
    @com.google.android.gms.common.annotation.a
    public String n() {
        l0 l0Var;
        if (!D() || (l0Var = this.g) == null) {
            throw new RuntimeException("Failed to connect when checking package");
        }
        return l0Var.b();
    }

    @RecentlyNonNull
    @com.google.android.gms.common.annotation.a
    protected Bundle o() {
        return new Bundle();
    }

    @RecentlyNullable
    @com.google.android.gms.common.annotation.a
    public String p() {
        return this.f;
    }

    @RecentlyNullable
    @com.google.android.gms.common.annotation.a
    protected String q() {
        return null;
    }

    @RecentlyNonNull
    @com.google.android.gms.common.annotation.a
    public final Looper r() {
        return this.i;
    }

    @RecentlyNonNull
    @com.google.android.gms.common.annotation.a
    public int s() {
        return c.a.b.b.d.f.f1608a;
    }

    @y0
    @com.google.android.gms.common.annotation.a
    public void t(@androidx.annotation.i0 com.google.android.gms.common.internal.k kVar, @RecentlyNonNull Set<Scope> set) {
        Bundle bundleO = o();
        com.google.android.gms.common.internal.g gVar = new com.google.android.gms.common.internal.g(this.w);
        gVar.g = this.h.getPackageName();
        gVar.j = bundleO;
        if (set != null) {
            gVar.i = (Scope[]) set.toArray(new Scope[set.size()]);
        }
        if (N()) {
            Account accountI = i();
            if (accountI == null) {
                accountI = new Account(H, com.google.android.gms.common.internal.b.f2507a);
            }
            gVar.k = accountI;
            if (kVar != null) {
                gVar.h = kVar.asBinder();
            }
        } else if (L()) {
            gVar.k = i();
        }
        gVar.l = F;
        gVar.m = j();
        if (Q()) {
            gVar.p = true;
        }
        try {
            synchronized (this.n) {
                if (this.o != null) {
                    this.o.p4(new j(this, this.B.get()), gVar);
                } else {
                    Log.w("GmsClient", "mServiceBroker is null, client disconnected");
                }
            }
        } catch (DeadObjectException e2) {
            Log.w("GmsClient", "IGmsServiceBroker.getService failed", e2);
            O(3);
        } catch (RemoteException e3) {
            e = e3;
            Log.w("GmsClient", "IGmsServiceBroker.getService failed", e);
            I(8, null, null, this.B.get());
        } catch (SecurityException e4) {
            throw e4;
        } catch (RuntimeException e5) {
            e = e5;
            Log.w("GmsClient", "IGmsServiceBroker.getService failed", e);
            I(8, null, null, this.B.get());
        }
    }

    @RecentlyNonNull
    @com.google.android.gms.common.annotation.a
    protected Set<Scope> u() {
        return Collections.emptySet();
    }

    @RecentlyNonNull
    @com.google.android.gms.common.annotation.a
    public final T v() throws DeadObjectException {
        T t;
        synchronized (this.m) {
            if (this.t == 5) {
                throw new DeadObjectException();
            }
            b();
            t = (T) r.l(this.q, "Client is connected but service is null");
        }
        return t;
    }

    @RecentlyNullable
    @com.google.android.gms.common.annotation.a
    public IBinder w() {
        synchronized (this.n) {
            if (this.o == null) {
                return null;
            }
            return this.o.asBinder();
        }
    }

    @androidx.annotation.h0
    @com.google.android.gms.common.annotation.a
    protected abstract String x();

    @RecentlyNonNull
    @com.google.android.gms.common.annotation.a
    public Intent y() {
        throw new UnsupportedOperationException("Not a sign in API");
    }

    @androidx.annotation.h0
    @com.google.android.gms.common.annotation.a
    protected abstract String z();
}

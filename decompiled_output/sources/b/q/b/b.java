package b.q.b;

import android.os.Bundle;
import android.os.Looper;
import android.util.Log;
import androidx.annotation.e0;
import androidx.annotation.h0;
import androidx.annotation.i0;
import androidx.lifecycle.j;
import androidx.lifecycle.o;
import androidx.lifecycle.p;
import androidx.lifecycle.u;
import androidx.lifecycle.v;
import androidx.lifecycle.w;
import b.q.b.a;
import b.q.c.c;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.lang.reflect.Modifier;

/* loaded from: classes.dex */
class b extends b.q.b.a {

    /* renamed from: c, reason: collision with root package name */
    static final String f1321c = "LoaderManager";
    static boolean d = false;

    /* renamed from: a, reason: collision with root package name */
    @h0
    private final j f1322a;

    /* renamed from: b, reason: collision with root package name */
    @h0
    private final c f1323b;

    public static class a<D> extends o<D> implements c.InterfaceC0092c<D> {
        private final int l;

        @i0
        private final Bundle m;

        @h0
        private final b.q.c.c<D> n;
        private j o;
        private C0090b<D> p;
        private b.q.c.c<D> q;

        a(int r1, @i0 Bundle bundle, @h0 b.q.c.c<D> cVar, @i0 b.q.c.c<D> cVar2) {
            this.l = r1;
            this.m = bundle;
            this.n = cVar;
            this.q = cVar2;
            cVar.u(r1, this);
        }

        @Override // b.q.c.c.InterfaceC0092c
        public void a(@h0 b.q.c.c<D> cVar, @i0 D d) {
            if (b.d) {
                Log.v(b.f1321c, "onLoadComplete: " + this);
            }
            if (Looper.myLooper() == Looper.getMainLooper()) {
                p(d);
                return;
            }
            if (b.d) {
                Log.w(b.f1321c, "onLoadComplete was incorrectly called on a background thread");
            }
            m(d);
        }

        @Override // androidx.lifecycle.LiveData
        protected void k() {
            if (b.d) {
                Log.v(b.f1321c, "  Starting: " + this);
            }
            this.n.y();
        }

        @Override // androidx.lifecycle.LiveData
        protected void l() {
            if (b.d) {
                Log.v(b.f1321c, "  Stopping: " + this);
            }
            this.n.z();
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // androidx.lifecycle.LiveData
        public void n(@h0 p<? super D> pVar) {
            super.n(pVar);
            this.o = null;
            this.p = null;
        }

        @Override // androidx.lifecycle.o, androidx.lifecycle.LiveData
        public void p(D d) {
            super.p(d);
            b.q.c.c<D> cVar = this.q;
            if (cVar != null) {
                cVar.w();
                this.q = null;
            }
        }

        @e0
        b.q.c.c<D> q(boolean z) {
            if (b.d) {
                Log.v(b.f1321c, "  Destroying: " + this);
            }
            this.n.b();
            this.n.a();
            C0090b<D> c0090b = this.p;
            if (c0090b != null) {
                n(c0090b);
                if (z) {
                    c0090b.d();
                }
            }
            this.n.B(this);
            if ((c0090b == null || c0090b.c()) && !z) {
                return this.n;
            }
            this.n.w();
            return this.q;
        }

        public void r(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
            printWriter.print(str);
            printWriter.print("mId=");
            printWriter.print(this.l);
            printWriter.print(" mArgs=");
            printWriter.println(this.m);
            printWriter.print(str);
            printWriter.print("mLoader=");
            printWriter.println(this.n);
            this.n.g(str + "  ", fileDescriptor, printWriter, strArr);
            if (this.p != null) {
                printWriter.print(str);
                printWriter.print("mCallbacks=");
                printWriter.println(this.p);
                this.p.b(str + "  ", printWriter);
            }
            printWriter.print(str);
            printWriter.print("mData=");
            printWriter.println(s().d(e()));
            printWriter.print(str);
            printWriter.print("mStarted=");
            printWriter.println(g());
        }

        @h0
        b.q.c.c<D> s() {
            return this.n;
        }

        boolean t() {
            C0090b<D> c0090b;
            return (!g() || (c0090b = this.p) == null || c0090b.c()) ? false : true;
        }

        public String toString() {
            StringBuilder sb = new StringBuilder(64);
            sb.append("LoaderInfo{");
            sb.append(Integer.toHexString(System.identityHashCode(this)));
            sb.append(" #");
            sb.append(this.l);
            sb.append(" : ");
            b.i.o.c.a(this.n, sb);
            sb.append("}}");
            return sb.toString();
        }

        void u() {
            j jVar = this.o;
            C0090b<D> c0090b = this.p;
            if (jVar == null || c0090b == null) {
                return;
            }
            super.n(c0090b);
            i(jVar, c0090b);
        }

        @e0
        @h0
        b.q.c.c<D> v(@h0 j jVar, @h0 a.InterfaceC0089a<D> interfaceC0089a) {
            C0090b<D> c0090b = new C0090b<>(this.n, interfaceC0089a);
            i(jVar, c0090b);
            C0090b<D> c0090b2 = this.p;
            if (c0090b2 != null) {
                n(c0090b2);
            }
            this.o = jVar;
            this.p = c0090b;
            return this.n;
        }
    }

    /* renamed from: b.q.b.b$b, reason: collision with other inner class name */
    static class C0090b<D> implements p<D> {

        /* renamed from: a, reason: collision with root package name */
        @h0
        private final b.q.c.c<D> f1324a;

        /* renamed from: b, reason: collision with root package name */
        @h0
        private final a.InterfaceC0089a<D> f1325b;

        /* renamed from: c, reason: collision with root package name */
        private boolean f1326c = false;

        C0090b(@h0 b.q.c.c<D> cVar, @h0 a.InterfaceC0089a<D> interfaceC0089a) {
            this.f1324a = cVar;
            this.f1325b = interfaceC0089a;
        }

        @Override // androidx.lifecycle.p
        public void a(@i0 D d) {
            if (b.d) {
                Log.v(b.f1321c, "  onLoadFinished in " + this.f1324a + ": " + this.f1324a.d(d));
            }
            this.f1325b.a(this.f1324a, d);
            this.f1326c = true;
        }

        public void b(String str, PrintWriter printWriter) {
            printWriter.print(str);
            printWriter.print("mDeliveredData=");
            printWriter.println(this.f1326c);
        }

        boolean c() {
            return this.f1326c;
        }

        @e0
        void d() {
            if (this.f1326c) {
                if (b.d) {
                    Log.v(b.f1321c, "  Resetting: " + this.f1324a);
                }
                this.f1325b.c(this.f1324a);
            }
        }

        public String toString() {
            return this.f1325b.toString();
        }
    }

    static class c extends u {
        private static final v.b e = new a();

        /* renamed from: c, reason: collision with root package name */
        private b.f.j<a> f1327c = new b.f.j<>();
        private boolean d = false;

        static class a implements v.b {
            a() {
            }

            @Override // androidx.lifecycle.v.b
            @h0
            public <T extends u> T a(@h0 Class<T> cls) {
                return new c();
            }
        }

        c() {
        }

        @h0
        static c h(w wVar) {
            return (c) new v(wVar, e).a(c.class);
        }

        @Override // androidx.lifecycle.u
        protected void d() {
            super.d();
            int r0 = this.f1327c.C();
            for (int r1 = 0; r1 < r0; r1++) {
                this.f1327c.D(r1).q(true);
            }
            this.f1327c.c();
        }

        public void f(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
            if (this.f1327c.C() > 0) {
                printWriter.print(str);
                printWriter.println("Loaders:");
                String str2 = str + "    ";
                for (int r1 = 0; r1 < this.f1327c.C(); r1++) {
                    a aVarD = this.f1327c.D(r1);
                    printWriter.print(str);
                    printWriter.print("  #");
                    printWriter.print(this.f1327c.p(r1));
                    printWriter.print(": ");
                    printWriter.println(aVarD.toString());
                    aVarD.r(str2, fileDescriptor, printWriter, strArr);
                }
            }
        }

        void g() {
            this.d = false;
        }

        <D> a<D> i(int r2) {
            return this.f1327c.k(r2);
        }

        boolean j() {
            int r0 = this.f1327c.C();
            for (int r2 = 0; r2 < r0; r2++) {
                if (this.f1327c.D(r2).t()) {
                    return true;
                }
            }
            return false;
        }

        boolean k() {
            return this.d;
        }

        void l() {
            int r0 = this.f1327c.C();
            for (int r1 = 0; r1 < r0; r1++) {
                this.f1327c.D(r1).u();
            }
        }

        void m(int r2, @h0 a aVar) {
            this.f1327c.q(r2, aVar);
        }

        void n(int r2) {
            this.f1327c.t(r2);
        }

        void o() {
            this.d = true;
        }
    }

    b(@h0 j jVar, @h0 w wVar) {
        this.f1322a = jVar;
        this.f1323b = c.h(wVar);
    }

    @e0
    @h0
    private <D> b.q.c.c<D> j(int r3, @i0 Bundle bundle, @h0 a.InterfaceC0089a<D> interfaceC0089a, @i0 b.q.c.c<D> cVar) {
        try {
            this.f1323b.o();
            b.q.c.c<D> cVarB = interfaceC0089a.b(r3, bundle);
            if (cVarB == null) {
                throw new IllegalArgumentException("Object returned from onCreateLoader must not be null");
            }
            if (cVarB.getClass().isMemberClass() && !Modifier.isStatic(cVarB.getClass().getModifiers())) {
                throw new IllegalArgumentException("Object returned from onCreateLoader must not be a non-static inner member class: " + cVarB);
            }
            a aVar = new a(r3, bundle, cVarB, cVar);
            if (d) {
                Log.v(f1321c, "  Created new loader " + aVar);
            }
            this.f1323b.m(r3, aVar);
            this.f1323b.g();
            return aVar.v(this.f1322a, interfaceC0089a);
        } catch (Throwable th) {
            this.f1323b.g();
            throw th;
        }
    }

    @Override // b.q.b.a
    @e0
    public void a(int r3) {
        if (this.f1323b.k()) {
            throw new IllegalStateException("Called while creating a loader");
        }
        if (Looper.getMainLooper() != Looper.myLooper()) {
            throw new IllegalStateException("destroyLoader must be called on the main thread");
        }
        if (d) {
            Log.v(f1321c, "destroyLoader in " + this + " of " + r3);
        }
        a aVarI = this.f1323b.i(r3);
        if (aVarI != null) {
            aVarI.q(true);
            this.f1323b.n(r3);
        }
    }

    @Override // b.q.b.a
    @Deprecated
    public void b(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        this.f1323b.f(str, fileDescriptor, printWriter, strArr);
    }

    @Override // b.q.b.a
    @i0
    public <D> b.q.c.c<D> e(int r2) {
        if (this.f1323b.k()) {
            throw new IllegalStateException("Called while creating a loader");
        }
        a<D> aVarI = this.f1323b.i(r2);
        if (aVarI != null) {
            return aVarI.s();
        }
        return null;
    }

    @Override // b.q.b.a
    public boolean f() {
        return this.f1323b.j();
    }

    @Override // b.q.b.a
    @e0
    @h0
    public <D> b.q.c.c<D> g(int r5, @i0 Bundle bundle, @h0 a.InterfaceC0089a<D> interfaceC0089a) {
        if (this.f1323b.k()) {
            throw new IllegalStateException("Called while creating a loader");
        }
        if (Looper.getMainLooper() != Looper.myLooper()) {
            throw new IllegalStateException("initLoader must be called on the main thread");
        }
        a<D> aVarI = this.f1323b.i(r5);
        if (d) {
            Log.v(f1321c, "initLoader in " + this + ": args=" + bundle);
        }
        if (aVarI == null) {
            return j(r5, bundle, interfaceC0089a, null);
        }
        if (d) {
            Log.v(f1321c, "  Re-using existing loader " + aVarI);
        }
        return aVarI.v(this.f1322a, interfaceC0089a);
    }

    @Override // b.q.b.a
    public void h() {
        this.f1323b.l();
    }

    @Override // b.q.b.a
    @e0
    @h0
    public <D> b.q.c.c<D> i(int r3, @i0 Bundle bundle, @h0 a.InterfaceC0089a<D> interfaceC0089a) {
        if (this.f1323b.k()) {
            throw new IllegalStateException("Called while creating a loader");
        }
        if (Looper.getMainLooper() != Looper.myLooper()) {
            throw new IllegalStateException("restartLoader must be called on the main thread");
        }
        if (d) {
            Log.v(f1321c, "restartLoader in " + this + ": args=" + bundle);
        }
        a<D> aVarI = this.f1323b.i(r3);
        return j(r3, bundle, interfaceC0089a, aVarI != null ? aVarI.q(false) : null);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder(128);
        sb.append("LoaderManager{");
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append(" in ");
        b.i.o.c.a(this.f1322a, sb);
        sb.append("}}");
        return sb.toString();
    }
}

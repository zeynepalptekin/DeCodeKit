package c.a.d;

import android.annotation.TargetApi;
import android.app.Application;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.util.Log;
import androidx.annotation.h0;
import androidx.annotation.i0;
import androidx.annotation.x0;
import b.i.k.p;
import com.google.android.gms.common.api.internal.a;
import com.google.android.gms.common.internal.q;
import com.google.android.gms.common.internal.r;
import com.google.android.gms.common.util.v;
import com.google.android.gms.common.util.x;
import com.google.android.gms.measurement.c.a;
import com.google.firebase.components.ComponentDiscoveryService;
import com.google.firebase.components.n;
import com.google.firebase.components.u;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
import javax.annotation.concurrent.GuardedBy;

/* loaded from: classes.dex */
public class e {
    private static final String j = "FirebaseApp";

    @h0
    public static final String k = "[DEFAULT]";
    private static final Object l = new Object();
    private static final Executor m = new d();

    @GuardedBy("LOCK")
    static final Map<String, e> n = new b.f.a();
    private static final String o = "fire-android";
    private static final String p = "fire-core";
    private static final String q = "kotlin";

    /* renamed from: a, reason: collision with root package name */
    private final Context f2173a;

    /* renamed from: b, reason: collision with root package name */
    private final String f2174b;

    /* renamed from: c, reason: collision with root package name */
    private final k f2175c;
    private final n d;
    private final u<c.a.d.t.a> g;
    private final AtomicBoolean e = new AtomicBoolean(false);
    private final AtomicBoolean f = new AtomicBoolean();
    private final List<b> h = new CopyOnWriteArrayList();
    private final List<f> i = new CopyOnWriteArrayList();

    @com.google.android.gms.common.annotation.a
    public interface b {
        @com.google.android.gms.common.annotation.a
        void a(boolean z);
    }

    @TargetApi(14)
    private static class c implements a.InterfaceC0165a {

        /* renamed from: a, reason: collision with root package name */
        private static AtomicReference<c> f2176a = new AtomicReference<>();

        private c() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static void c(Context context) {
            if (v.c() && (context.getApplicationContext() instanceof Application)) {
                Application application = (Application) context.getApplicationContext();
                if (f2176a.get() == null) {
                    c cVar = new c();
                    if (f2176a.compareAndSet(null, cVar)) {
                        com.google.android.gms.common.api.internal.a.c(application);
                        com.google.android.gms.common.api.internal.a.b().a(cVar);
                    }
                }
            }
        }

        @Override // com.google.android.gms.common.api.internal.a.InterfaceC0165a
        public void a(boolean z) {
            synchronized (e.l) {
                Iterator it = new ArrayList(e.n.values()).iterator();
                while (it.hasNext()) {
                    e eVar = (e) it.next();
                    if (eVar.e.get()) {
                        eVar.B(z);
                    }
                }
            }
        }
    }

    private static class d implements Executor {
        private static final Handler d = new Handler(Looper.getMainLooper());

        private d() {
        }

        @Override // java.util.concurrent.Executor
        public void execute(@h0 Runnable runnable) {
            d.post(runnable);
        }
    }

    @TargetApi(24)
    /* renamed from: c.a.d.e$e, reason: collision with other inner class name */
    private static class C0150e extends BroadcastReceiver {

        /* renamed from: b, reason: collision with root package name */
        private static AtomicReference<C0150e> f2177b = new AtomicReference<>();

        /* renamed from: a, reason: collision with root package name */
        private final Context f2178a;

        public C0150e(Context context) {
            this.f2178a = context;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static void b(Context context) {
            if (f2177b.get() == null) {
                C0150e c0150e = new C0150e(context);
                if (f2177b.compareAndSet(null, c0150e)) {
                    context.registerReceiver(c0150e, new IntentFilter("android.intent.action.USER_UNLOCKED"));
                }
            }
        }

        public void c() {
            this.f2178a.unregisterReceiver(this);
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            synchronized (e.l) {
                Iterator<e> it = e.n.values().iterator();
                while (it.hasNext()) {
                    it.next().t();
                }
            }
            c();
        }
    }

    protected e(Context context, String str, k kVar) {
        this.f2173a = (Context) r.k(context);
        this.f2174b = r.g(str);
        this.f2175c = (k) r.k(kVar);
        List<com.google.firebase.components.j> listA = com.google.firebase.components.h.b(context, ComponentDiscoveryService.class).a();
        String strA = c.a.d.w.e.a();
        Executor executor = m;
        com.google.firebase.components.f[] fVarArr = new com.google.firebase.components.f[8];
        fVarArr[0] = com.google.firebase.components.f.q(context, Context.class, new Class[0]);
        fVarArr[1] = com.google.firebase.components.f.q(this, e.class, new Class[0]);
        fVarArr[2] = com.google.firebase.components.f.q(kVar, k.class, new Class[0]);
        fVarArr[3] = c.a.d.w.g.a(o, "");
        fVarArr[4] = c.a.d.w.g.a(p, c.a.d.a.f);
        fVarArr[5] = strA != null ? c.a.d.w.g.a(q, strA) : null;
        fVarArr[6] = c.a.d.w.c.b();
        fVarArr[7] = c.a.d.r.b.b();
        this.d = new n(executor, listA, fVarArr);
        this.g = new u<>(c.a.d.d.a(this, context));
    }

    private static String A(@h0 String str) {
        return str.trim();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void B(boolean z) {
        Log.d(j, "Notifying background state change listeners.");
        Iterator<b> it = this.h.iterator();
        while (it.hasNext()) {
            it.next().a(z);
        }
    }

    private void C() {
        Iterator<f> it = this.i.iterator();
        while (it.hasNext()) {
            it.next().a(this.f2174b, this.f2175c);
        }
    }

    private void g() {
        r.r(!this.f.get(), "FirebaseApp was deleted");
    }

    @x0
    public static void h() {
        synchronized (l) {
            n.clear();
        }
    }

    private static List<String> k() {
        ArrayList arrayList = new ArrayList();
        synchronized (l) {
            Iterator<e> it = n.values().iterator();
            while (it.hasNext()) {
                arrayList.add(it.next().p());
            }
        }
        Collections.sort(arrayList);
        return arrayList;
    }

    @h0
    public static List<e> m(@h0 Context context) {
        ArrayList arrayList;
        synchronized (l) {
            arrayList = new ArrayList(n.values());
        }
        return arrayList;
    }

    @h0
    public static e n() {
        e eVar;
        synchronized (l) {
            eVar = n.get(k);
            if (eVar == null) {
                throw new IllegalStateException("Default FirebaseApp is not initialized in this process " + x.a() + ". Make sure to call FirebaseApp.initializeApp(Context) first.");
            }
        }
        return eVar;
    }

    @h0
    public static e o(@h0 String str) {
        e eVar;
        String str2;
        synchronized (l) {
            eVar = n.get(A(str));
            if (eVar == null) {
                List<String> listK = k();
                if (listK.isEmpty()) {
                    str2 = "";
                } else {
                    str2 = "Available app names: " + TextUtils.join(", ", listK);
                }
                throw new IllegalStateException(String.format("FirebaseApp with name %s doesn't exist. %s", str, str2));
            }
        }
        return eVar;
    }

    @com.google.android.gms.common.annotation.a
    public static String s(String str, k kVar) {
        return com.google.android.gms.common.util.c.f(str.getBytes(Charset.defaultCharset())) + "+" + com.google.android.gms.common.util.c.f(kVar.j().getBytes(Charset.defaultCharset()));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void t() {
        if (!p.a(this.f2173a)) {
            C0150e.b(this.f2173a);
        } else {
            this.d.e(y());
        }
    }

    @i0
    public static e u(@h0 Context context) {
        synchronized (l) {
            if (n.containsKey(k)) {
                return n();
            }
            k kVarH = k.h(context);
            if (kVarH == null) {
                Log.w(j, "Default FirebaseApp failed to initialize because no default options were found. This usually means that com.google.gms:google-services was not applied to your gradle project.");
                return null;
            }
            return v(context, kVarH);
        }
    }

    @h0
    public static e v(@h0 Context context, @h0 k kVar) {
        return w(context, kVar, k);
    }

    @h0
    public static e w(@h0 Context context, @h0 k kVar, @h0 String str) {
        e eVar;
        c.c(context);
        String strA = A(str);
        if (context.getApplicationContext() != null) {
            context = context.getApplicationContext();
        }
        synchronized (l) {
            r.r(!n.containsKey(strA), "FirebaseApp name " + strA + " already exists!");
            r.l(context, "Application context cannot be null.");
            eVar = new e(context, strA, kVar);
            n.put(strA, eVar);
        }
        eVar.t();
        return eVar;
    }

    static /* synthetic */ c.a.d.t.a z(e eVar, Context context) {
        return new c.a.d.t.a(context, eVar.r(), (c.a.d.o.c) eVar.d.a(c.a.d.o.c.class));
    }

    @com.google.android.gms.common.annotation.a
    public void D(b bVar) {
        g();
        this.h.remove(bVar);
    }

    @com.google.android.gms.common.annotation.a
    public void E(@h0 f fVar) {
        g();
        r.k(fVar);
        this.i.remove(fVar);
    }

    public void F(boolean z) {
        boolean z2;
        g();
        if (this.e.compareAndSet(!z, z)) {
            boolean zD = com.google.android.gms.common.api.internal.a.b().d();
            if (z && zD) {
                z2 = true;
            } else if (z || !zD) {
                return;
            } else {
                z2 = false;
            }
            B(z2);
        }
    }

    @com.google.android.gms.common.annotation.a
    public void G(boolean z) {
        g();
        this.g.get().d(z);
    }

    @com.google.android.gms.common.annotation.a
    public void e(b bVar) {
        g();
        if (this.e.get() && com.google.android.gms.common.api.internal.a.b().d()) {
            bVar.a(true);
        }
        this.h.add(bVar);
    }

    public boolean equals(Object obj) {
        if (obj instanceof e) {
            return this.f2174b.equals(((e) obj).p());
        }
        return false;
    }

    @com.google.android.gms.common.annotation.a
    public void f(@h0 f fVar) {
        g();
        r.k(fVar);
        this.i.add(fVar);
    }

    public int hashCode() {
        return this.f2174b.hashCode();
    }

    public void i() {
        if (this.f.compareAndSet(false, true)) {
            synchronized (l) {
                n.remove(this.f2174b);
            }
            C();
        }
    }

    @com.google.android.gms.common.annotation.a
    public <T> T j(Class<T> cls) {
        g();
        return (T) this.d.a(cls);
    }

    @h0
    public Context l() {
        g();
        return this.f2173a;
    }

    @h0
    public String p() {
        g();
        return this.f2174b;
    }

    @h0
    public k q() {
        g();
        return this.f2175c;
    }

    @com.google.android.gms.common.annotation.a
    public String r() {
        return com.google.android.gms.common.util.c.f(p().getBytes(Charset.defaultCharset())) + "+" + com.google.android.gms.common.util.c.f(q().j().getBytes(Charset.defaultCharset()));
    }

    public String toString() {
        return q.d(this).a(a.C0190a.f6334b, this.f2174b).a("options", this.f2175c).toString();
    }

    @com.google.android.gms.common.annotation.a
    public boolean x() {
        g();
        return this.g.get().b();
    }

    @x0
    @com.google.android.gms.common.annotation.a
    public boolean y() {
        return k.equals(p());
    }
}

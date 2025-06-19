package c.a.b.b.j;

import android.annotation.SuppressLint;
import android.content.Context;
import android.os.PowerManager;
import android.os.WorkSource;
import android.text.TextUtils;
import android.util.Log;
import androidx.annotation.h0;
import androidx.annotation.i0;
import com.google.android.gms.common.internal.r;
import com.google.android.gms.common.internal.v;
import com.google.android.gms.common.util.b0;
import com.google.android.gms.common.util.e0;
import java.lang.reflect.InvocationTargetException;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.atomic.AtomicInteger;
import javax.annotation.concurrent.ThreadSafe;

@ThreadSafe
@v
@com.google.android.gms.common.annotation.a
/* loaded from: classes.dex */
public class d {
    private static ScheduledExecutorService n;
    private static volatile a o = new e();

    /* renamed from: a, reason: collision with root package name */
    private final Object f1888a;

    /* renamed from: b, reason: collision with root package name */
    private final PowerManager.WakeLock f1889b;

    /* renamed from: c, reason: collision with root package name */
    private WorkSource f1890c;
    private final int d;
    private final String e;
    private final String f;
    private final String g;
    private final Context h;
    private boolean i;
    private final Map<String, Integer[]> j;
    private final Set<Future<?>> k;
    private int l;
    private AtomicInteger m;

    public interface a {
    }

    @com.google.android.gms.common.annotation.a
    public d(@h0 Context context, int r9, @h0 String str) {
        this(context, r9, str, null, context == null ? null : context.getPackageName());
    }

    private d(@h0 Context context, int r9, @h0 String str, @i0 String str2, @h0 String str3) {
        this(context, r9, str, null, str3, null);
    }

    @SuppressLint({"UnwrappedWakeLock"})
    private d(@h0 Context context, int r3, @h0 String str, @i0 String str2, @h0 String str3, @i0 String str4) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        this.f1888a = this;
        this.i = true;
        this.j = new HashMap();
        this.k = Collections.synchronizedSet(new HashSet());
        this.m = new AtomicInteger(0);
        r.l(context, "WakeLock: context must not be null");
        r.h(str, "WakeLock: wakeLockName must not be empty");
        this.d = r3;
        this.f = null;
        this.g = null;
        this.h = context.getApplicationContext();
        if ("com.google.android.gms".equals(context.getPackageName())) {
            this.e = str;
        } else {
            String strValueOf = String.valueOf(str);
            this.e = strValueOf.length() != 0 ? "*gcore*:".concat(strValueOf) : new String("*gcore*:");
        }
        this.f1889b = ((PowerManager) context.getSystemService("power")).newWakeLock(r3, str);
        if (e0.d(context)) {
            WorkSource workSourceA = e0.a(context, b0.b(str3) ? context.getPackageName() : str3);
            this.f1890c = workSourceA;
            if (workSourceA != null && e0.d(this.h)) {
                WorkSource workSource = this.f1890c;
                if (workSource != null) {
                    workSource.add(workSourceA);
                } else {
                    this.f1890c = workSourceA;
                }
                try {
                    this.f1889b.setWorkSource(this.f1890c);
                } catch (ArrayIndexOutOfBoundsException | IllegalArgumentException e) {
                    Log.wtf("WakeLock", e.toString());
                }
            }
        }
        if (n == null) {
            n = c.a.b.b.d.q.a.a().a();
        }
    }

    private final String e(String str) {
        return (!this.i || TextUtils.isEmpty(str)) ? this.f : str;
    }

    private final List<String> f() {
        return e0.c(this.f1890c);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void g(int r3) {
        if (this.f1889b.isHeld()) {
            try {
                this.f1889b.release();
            } catch (RuntimeException e) {
                if (!e.getClass().equals(RuntimeException.class)) {
                    throw e;
                }
                Log.e("WakeLock", String.valueOf(this.e).concat(" was already released!"), e);
            }
            this.f1889b.isHeld();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0056 A[Catch: all -> 0x0096, TryCatch #0 {, blocks: (B:4:0x000d, B:6:0x0016, B:11:0x0029, B:13:0x002e, B:15:0x0038, B:22:0x005e, B:23:0x007d, B:16:0x0047, B:18:0x0056, B:20:0x005a, B:8:0x001a, B:10:0x0022), top: B:31:0x000d }] */
    /* JADX WARN: Removed duplicated region for block: B:22:0x005e A[Catch: all -> 0x0096, TryCatch #0 {, blocks: (B:4:0x000d, B:6:0x0016, B:11:0x0029, B:13:0x002e, B:15:0x0038, B:22:0x005e, B:23:0x007d, B:16:0x0047, B:18:0x0056, B:20:0x005a, B:8:0x001a, B:10:0x0022), top: B:31:0x000d }] */
    @com.google.android.gms.common.annotation.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void a(long r14) {
        /*
            r13 = this;
            java.util.concurrent.atomic.AtomicInteger r0 = r13.m
            r0.incrementAndGet()
            r0 = 0
            java.lang.String r6 = r13.e(r0)
            java.lang.Object r0 = r13.f1888a
            monitor-enter(r0)
            java.util.Map<java.lang.String, java.lang.Integer[]> r1 = r13.j     // Catch: java.lang.Throwable -> L96
            boolean r1 = r1.isEmpty()     // Catch: java.lang.Throwable -> L96
            r2 = 0
            if (r1 == 0) goto L1a
            int r1 = r13.l     // Catch: java.lang.Throwable -> L96
            if (r1 <= 0) goto L29
        L1a:
            android.os.PowerManager$WakeLock r1 = r13.f1889b     // Catch: java.lang.Throwable -> L96
            boolean r1 = r1.isHeld()     // Catch: java.lang.Throwable -> L96
            if (r1 != 0) goto L29
            java.util.Map<java.lang.String, java.lang.Integer[]> r1 = r13.j     // Catch: java.lang.Throwable -> L96
            r1.clear()     // Catch: java.lang.Throwable -> L96
            r13.l = r2     // Catch: java.lang.Throwable -> L96
        L29:
            boolean r1 = r13.i     // Catch: java.lang.Throwable -> L96
            r12 = 1
            if (r1 == 0) goto L56
            java.util.Map<java.lang.String, java.lang.Integer[]> r1 = r13.j     // Catch: java.lang.Throwable -> L96
            java.lang.Object r1 = r1.get(r6)     // Catch: java.lang.Throwable -> L96
            java.lang.Integer[] r1 = (java.lang.Integer[]) r1     // Catch: java.lang.Throwable -> L96
            if (r1 != 0) goto L47
            java.util.Map<java.lang.String, java.lang.Integer[]> r1 = r13.j     // Catch: java.lang.Throwable -> L96
            java.lang.Integer[] r3 = new java.lang.Integer[r12]     // Catch: java.lang.Throwable -> L96
            java.lang.Integer r4 = java.lang.Integer.valueOf(r12)     // Catch: java.lang.Throwable -> L96
            r3[r2] = r4     // Catch: java.lang.Throwable -> L96
            r1.put(r6, r3)     // Catch: java.lang.Throwable -> L96
            r2 = 1
            goto L54
        L47:
            r3 = r1[r2]     // Catch: java.lang.Throwable -> L96
            int r3 = r3.intValue()     // Catch: java.lang.Throwable -> L96
            int r3 = r3 + r12
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)     // Catch: java.lang.Throwable -> L96
            r1[r2] = r3     // Catch: java.lang.Throwable -> L96
        L54:
            if (r2 != 0) goto L5e
        L56:
            boolean r1 = r13.i     // Catch: java.lang.Throwable -> L96
            if (r1 != 0) goto L7d
            int r1 = r13.l     // Catch: java.lang.Throwable -> L96
            if (r1 != 0) goto L7d
        L5e:
            com.google.android.gms.common.stats.d r1 = com.google.android.gms.common.stats.d.a()     // Catch: java.lang.Throwable -> L96
            android.content.Context r2 = r13.h     // Catch: java.lang.Throwable -> L96
            android.os.PowerManager$WakeLock r3 = r13.f1889b     // Catch: java.lang.Throwable -> L96
            java.lang.String r3 = com.google.android.gms.common.stats.c.b(r3, r6)     // Catch: java.lang.Throwable -> L96
            r4 = 7
            java.lang.String r5 = r13.e     // Catch: java.lang.Throwable -> L96
            r7 = 0
            int r8 = r13.d     // Catch: java.lang.Throwable -> L96
            java.util.List r9 = r13.f()     // Catch: java.lang.Throwable -> L96
            r10 = r14
            r1.e(r2, r3, r4, r5, r6, r7, r8, r9, r10)     // Catch: java.lang.Throwable -> L96
            int r1 = r13.l     // Catch: java.lang.Throwable -> L96
            int r1 = r1 + r12
            r13.l = r1     // Catch: java.lang.Throwable -> L96
        L7d:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L96
            android.os.PowerManager$WakeLock r0 = r13.f1889b
            r0.acquire()
            r0 = 0
            int r2 = (r14 > r0 ? 1 : (r14 == r0 ? 0 : -1))
            if (r2 <= 0) goto L95
            java.util.concurrent.ScheduledExecutorService r0 = c.a.b.b.j.d.n
            c.a.b.b.j.f r1 = new c.a.b.b.j.f
            r1.<init>(r13)
            java.util.concurrent.TimeUnit r2 = java.util.concurrent.TimeUnit.MILLISECONDS
            r0.schedule(r1, r14, r2)
        L95:
            return
        L96:
            r14 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L96
            throw r14
        */
        throw new UnsupportedOperationException("Method not decompiled: c.a.b.b.j.d.a(long):void");
    }

    @com.google.android.gms.common.annotation.a
    public boolean b() {
        return this.f1889b.isHeld();
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0052 A[Catch: all -> 0x007e, TryCatch #0 {, blocks: (B:7:0x0021, B:9:0x0027, B:21:0x005a, B:22:0x0079, B:12:0x0033, B:14:0x003b, B:15:0x0042, B:17:0x0052, B:19:0x0056), top: B:28:0x0021 }] */
    /* JADX WARN: Removed duplicated region for block: B:21:0x005a A[Catch: all -> 0x007e, TryCatch #0 {, blocks: (B:7:0x0021, B:9:0x0027, B:21:0x005a, B:22:0x0079, B:12:0x0033, B:14:0x003b, B:15:0x0042, B:17:0x0052, B:19:0x0056), top: B:28:0x0021 }] */
    @com.google.android.gms.common.annotation.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void c() {
        /*
            r12 = this;
            java.util.concurrent.atomic.AtomicInteger r0 = r12.m
            int r0 = r0.decrementAndGet()
            if (r0 >= 0) goto L19
            java.lang.String r0 = "WakeLock"
            java.lang.String r1 = r12.e
            java.lang.String r1 = java.lang.String.valueOf(r1)
            java.lang.String r2 = " release without a matched acquire!"
            java.lang.String r1 = r1.concat(r2)
            android.util.Log.e(r0, r1)
        L19:
            r0 = 0
            java.lang.String r6 = r12.e(r0)
            java.lang.Object r0 = r12.f1888a
            monitor-enter(r0)
            boolean r1 = r12.i     // Catch: java.lang.Throwable -> L7e
            r10 = 1
            r11 = 0
            if (r1 == 0) goto L52
            java.util.Map<java.lang.String, java.lang.Integer[]> r1 = r12.j     // Catch: java.lang.Throwable -> L7e
            java.lang.Object r1 = r1.get(r6)     // Catch: java.lang.Throwable -> L7e
            java.lang.Integer[] r1 = (java.lang.Integer[]) r1     // Catch: java.lang.Throwable -> L7e
            if (r1 != 0) goto L33
        L31:
            r1 = 0
            goto L50
        L33:
            r2 = r1[r11]     // Catch: java.lang.Throwable -> L7e
            int r2 = r2.intValue()     // Catch: java.lang.Throwable -> L7e
            if (r2 != r10) goto L42
            java.util.Map<java.lang.String, java.lang.Integer[]> r1 = r12.j     // Catch: java.lang.Throwable -> L7e
            r1.remove(r6)     // Catch: java.lang.Throwable -> L7e
            r1 = 1
            goto L50
        L42:
            r2 = r1[r11]     // Catch: java.lang.Throwable -> L7e
            int r2 = r2.intValue()     // Catch: java.lang.Throwable -> L7e
            int r2 = r2 - r10
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)     // Catch: java.lang.Throwable -> L7e
            r1[r11] = r2     // Catch: java.lang.Throwable -> L7e
            goto L31
        L50:
            if (r1 != 0) goto L5a
        L52:
            boolean r1 = r12.i     // Catch: java.lang.Throwable -> L7e
            if (r1 != 0) goto L79
            int r1 = r12.l     // Catch: java.lang.Throwable -> L7e
            if (r1 != r10) goto L79
        L5a:
            com.google.android.gms.common.stats.d r1 = com.google.android.gms.common.stats.d.a()     // Catch: java.lang.Throwable -> L7e
            android.content.Context r2 = r12.h     // Catch: java.lang.Throwable -> L7e
            android.os.PowerManager$WakeLock r3 = r12.f1889b     // Catch: java.lang.Throwable -> L7e
            java.lang.String r3 = com.google.android.gms.common.stats.c.b(r3, r6)     // Catch: java.lang.Throwable -> L7e
            r4 = 8
            java.lang.String r5 = r12.e     // Catch: java.lang.Throwable -> L7e
            r7 = 0
            int r8 = r12.d     // Catch: java.lang.Throwable -> L7e
            java.util.List r9 = r12.f()     // Catch: java.lang.Throwable -> L7e
            r1.d(r2, r3, r4, r5, r6, r7, r8, r9)     // Catch: java.lang.Throwable -> L7e
            int r1 = r12.l     // Catch: java.lang.Throwable -> L7e
            int r1 = r1 - r10
            r12.l = r1     // Catch: java.lang.Throwable -> L7e
        L79:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L7e
            r12.g(r11)
            return
        L7e:
            r1 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L7e
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: c.a.b.b.j.d.c():void");
    }

    @com.google.android.gms.common.annotation.a
    public void d(boolean z) {
        this.f1889b.setReferenceCounted(z);
        this.i = z;
    }
}

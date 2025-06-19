package c.a.b.b.g.c;

import android.os.Bundle;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes.dex */
public final class mf extends sf {
    private final AtomicReference<Bundle> e = new AtomicReference<>();
    private boolean f;

    /* JADX WARN: Code restructure failed: missing block: B:4:0x0003, code lost:
    
        r4 = r4.get("r");
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static <T> T b2(android.os.Bundle r4, java.lang.Class<T> r5) {
        /*
            r0 = 0
            if (r4 == 0) goto L38
            java.lang.String r1 = "r"
            java.lang.Object r4 = r4.get(r1)
            if (r4 == 0) goto L38
            java.lang.Object r4 = r5.cast(r4)     // Catch: java.lang.ClassCastException -> L10
            return r4
        L10:
            r0 = move-exception
            java.lang.String r5 = r5.getCanonicalName()
            java.lang.Class r4 = r4.getClass()
            java.lang.String r4 = r4.getCanonicalName()
            java.lang.String r1 = "Unexpected object type. Expected, Received"
            java.lang.String r2 = ": %s, %s"
            java.lang.String r1 = r1.concat(r2)
            r2 = 2
            java.lang.Object[] r2 = new java.lang.Object[r2]
            r3 = 0
            r2[r3] = r5
            r5 = 1
            r2[r5] = r4
            java.lang.String r4 = java.lang.String.format(r1, r2)
            java.lang.String r5 = "AM"
            android.util.Log.w(r5, r4, r0)
            throw r0
        L38:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: c.a.b.b.g.c.mf.b2(android.os.Bundle, java.lang.Class):java.lang.Object");
    }

    public final String e2(long j) {
        return (String) b2(i2(j), String.class);
    }

    public final Bundle i2(long j) {
        Bundle bundle;
        synchronized (this.e) {
            if (!this.f) {
                try {
                    this.e.wait(j);
                } catch (InterruptedException unused) {
                    return null;
                }
            }
            bundle = this.e.get();
        }
        return bundle;
    }

    @Override // c.a.b.b.g.c.pf
    public final void s0(Bundle bundle) {
        synchronized (this.e) {
            try {
                this.e.set(bundle);
                this.f = true;
            } finally {
                this.e.notify();
            }
        }
    }
}

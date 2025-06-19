package androidx.lifecycle;

import androidx.annotation.e0;
import androidx.annotation.i0;
import java.io.Closeable;
import java.io.IOException;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* loaded from: classes.dex */
public abstract class u {

    /* renamed from: a, reason: collision with root package name */
    @i0
    private final Map<String, Object> f529a = new HashMap();

    /* renamed from: b, reason: collision with root package name */
    private volatile boolean f530b = false;

    private static void b(Object obj) throws IOException {
        if (obj instanceof Closeable) {
            try {
                ((Closeable) obj).close();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
    }

    @e0
    final void a() {
        this.f530b = true;
        Map<String, Object> map = this.f529a;
        if (map != null) {
            synchronized (map) {
                Iterator<Object> it = this.f529a.values().iterator();
                while (it.hasNext()) {
                    b(it.next());
                }
            }
        }
        d();
    }

    <T> T c(String str) {
        T t;
        synchronized (this.f529a) {
            t = (T) this.f529a.get(str);
        }
        return t;
    }

    protected void d() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    <T> T e(String str, T t) throws IOException {
        Object obj;
        synchronized (this.f529a) {
            obj = this.f529a.get(str);
            if (obj == 0) {
                this.f529a.put(str, t);
            }
        }
        if (obj != 0) {
            t = obj;
        }
        if (this.f530b) {
            b(t);
        }
        return t;
    }
}

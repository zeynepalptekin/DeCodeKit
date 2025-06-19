package c.a.b.b.d;

import java.util.concurrent.Callable;

/* loaded from: classes.dex */
final class g0 extends e0 {
    private final Callable<String> e;

    private g0(Callable<String> callable) {
        super(false, null, null);
        this.e = callable;
    }

    @Override // c.a.b.b.d.e0
    final String f() {
        try {
            return this.e.call();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}

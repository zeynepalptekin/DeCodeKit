package c.a.e.c0;

import java.io.IOException;

/* loaded from: classes.dex */
public final class e extends IOException {
    private static final long d = 1;

    public e(String str) {
        super(str);
    }

    public e(String str, Throwable th) {
        super(str);
        initCause(th);
    }

    public e(Throwable th) {
        initCause(th);
    }
}

package b.i.k;

import androidx.annotation.i0;

/* loaded from: classes.dex */
public class k extends RuntimeException {
    public k() {
        this(null);
    }

    public k(@i0 String str) {
        super(str == null ? "The operation has been canceled." : str);
    }
}

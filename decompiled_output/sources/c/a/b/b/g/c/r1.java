package c.a.b.b.g.c;

import android.database.ContentObserver;
import android.os.Handler;

/* loaded from: classes.dex */
final class r1 extends ContentObserver {
    r1(Handler handler) {
        super(null);
    }

    @Override // android.database.ContentObserver
    public final void onChange(boolean z) {
        s1.e.set(true);
    }
}

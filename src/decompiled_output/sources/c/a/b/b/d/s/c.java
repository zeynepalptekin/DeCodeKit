package c.a.b.b.d.s;

import android.content.Context;
import androidx.annotation.RecentlyNonNull;
import androidx.annotation.i0;
import com.google.android.gms.common.util.d0;

@com.google.android.gms.common.annotation.a
/* loaded from: classes.dex */
public class c {

    /* renamed from: b, reason: collision with root package name */
    private static c f1631b = new c();

    /* renamed from: a, reason: collision with root package name */
    @i0
    private b f1632a = null;

    @RecentlyNonNull
    @com.google.android.gms.common.annotation.a
    public static b a(@RecentlyNonNull Context context) {
        return f1631b.b(context);
    }

    @d0
    private final synchronized b b(Context context) {
        if (this.f1632a == null) {
            if (context.getApplicationContext() != null) {
                context = context.getApplicationContext();
            }
            this.f1632a = new b(context);
        }
        return this.f1632a;
    }
}

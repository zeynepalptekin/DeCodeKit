package c.a.b.b.j;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import android.util.Log;
import com.google.android.gms.common.internal.v;

@v
@com.google.android.gms.common.annotation.a
/* loaded from: classes.dex */
public abstract class b extends b.p.b.a {
    private static String d = "GCoreWakefulBroadcastReceiver";

    @SuppressLint({"UnwrappedWakefulBroadcastReceiver"})
    @com.google.android.gms.common.annotation.a
    public static boolean d(Context context, Intent intent) {
        if (intent == null) {
            return false;
        }
        if (context != null) {
            com.google.android.gms.common.stats.d.a().f(context, intent);
        } else {
            String str = d;
            String strValueOf = String.valueOf(intent.toUri(0));
            Log.w(str, strValueOf.length() != 0 ? "context shouldn't be null. intent: ".concat(strValueOf) : new String("context shouldn't be null. intent: "));
        }
        return b.p.b.a.b(intent);
    }
}

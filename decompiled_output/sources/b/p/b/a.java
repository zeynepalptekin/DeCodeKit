package b.p.b;

import android.content.BroadcastReceiver;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.os.PowerManager;
import android.util.Log;
import android.util.SparseArray;

@Deprecated
/* loaded from: classes.dex */
public abstract class a extends BroadcastReceiver {

    /* renamed from: a, reason: collision with root package name */
    private static final String f1318a = "androidx.contentpager.content.wakelockid";

    /* renamed from: b, reason: collision with root package name */
    private static final SparseArray<PowerManager.WakeLock> f1319b = new SparseArray<>();

    /* renamed from: c, reason: collision with root package name */
    private static int f1320c = 1;

    public static boolean b(Intent intent) {
        int intExtra = intent.getIntExtra(f1318a, 0);
        if (intExtra == 0) {
            return false;
        }
        synchronized (f1319b) {
            PowerManager.WakeLock wakeLock = f1319b.get(intExtra);
            if (wakeLock != null) {
                wakeLock.release();
                f1319b.remove(intExtra);
                return true;
            }
            Log.w("WakefulBroadcastReceiv.", "No active wake lock id #" + intExtra);
            return true;
        }
    }

    public static ComponentName c(Context context, Intent intent) {
        synchronized (f1319b) {
            int r1 = f1320c;
            int r2 = f1320c + 1;
            f1320c = r2;
            if (r2 <= 0) {
                f1320c = 1;
            }
            intent.putExtra(f1318a, r1);
            ComponentName componentNameStartService = context.startService(intent);
            if (componentNameStartService == null) {
                return null;
            }
            PowerManager.WakeLock wakeLockNewWakeLock = ((PowerManager) context.getSystemService("power")).newWakeLock(1, "androidx.core:wake:" + componentNameStartService.flattenToShortString());
            wakeLockNewWakeLock.setReferenceCounted(false);
            wakeLockNewWakeLock.acquire(60000L);
            f1319b.put(r1, wakeLockNewWakeLock);
            return componentNameStartService;
        }
    }
}

package b.i.c;

import android.accounts.AccountManager;
import android.app.ActivityManager;
import android.app.AlarmManager;
import android.app.AppOpsManager;
import android.app.DownloadManager;
import android.app.KeyguardManager;
import android.app.NotificationManager;
import android.app.SearchManager;
import android.app.UiModeManager;
import android.app.WallpaperManager;
import android.app.admin.DevicePolicyManager;
import android.app.job.JobScheduler;
import android.app.usage.UsageStatsManager;
import android.appwidget.AppWidgetManager;
import android.bluetooth.BluetoothManager;
import android.content.ClipboardManager;
import android.content.Context;
import android.content.Intent;
import android.content.RestrictionsManager;
import android.content.pm.LauncherApps;
import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import android.hardware.ConsumerIrManager;
import android.hardware.SensorManager;
import android.hardware.camera2.CameraManager;
import android.hardware.display.DisplayManager;
import android.hardware.input.InputManager;
import android.hardware.usb.UsbManager;
import android.location.LocationManager;
import android.media.AudioManager;
import android.media.MediaRouter;
import android.media.projection.MediaProjectionManager;
import android.media.session.MediaSessionManager;
import android.media.tv.TvInputManager;
import android.net.ConnectivityManager;
import android.net.nsd.NsdManager;
import android.net.wifi.WifiManager;
import android.net.wifi.p2p.WifiP2pManager;
import android.nfc.NfcManager;
import android.os.BatteryManager;
import android.os.Build;
import android.os.Bundle;
import android.os.DropBoxManager;
import android.os.Handler;
import android.os.PowerManager;
import android.os.Process;
import android.os.UserManager;
import android.os.Vibrator;
import android.os.storage.StorageManager;
import android.print.PrintManager;
import android.telecom.TelecomManager;
import android.telephony.SubscriptionManager;
import android.telephony.TelephonyManager;
import android.util.Log;
import android.util.TypedValue;
import android.view.LayoutInflater;
import android.view.WindowManager;
import android.view.accessibility.AccessibilityManager;
import android.view.accessibility.CaptioningManager;
import android.view.inputmethod.InputMethodManager;
import android.view.textservice.TextServicesManager;
import androidx.annotation.h0;
import androidx.annotation.i0;
import androidx.annotation.k;
import androidx.annotation.m;
import androidx.annotation.q;
import androidx.core.app.p;
import com.google.firebase.analytics.FirebaseAnalytics;
import java.io.File;
import java.util.HashMap;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;

/* loaded from: classes.dex */
public class c {

    /* renamed from: a, reason: collision with root package name */
    private static final String f963a = "ContextCompat";

    /* renamed from: b, reason: collision with root package name */
    private static final Object f964b = new Object();

    /* renamed from: c, reason: collision with root package name */
    private static TypedValue f965c;

    private static final class a {

        /* renamed from: a, reason: collision with root package name */
        static final HashMap<Class<?>, String> f966a = new HashMap<>();

        static {
            if (Build.VERSION.SDK_INT >= 22) {
                f966a.put(SubscriptionManager.class, "telephony_subscription_service");
                f966a.put(UsageStatsManager.class, "usagestats");
            }
            if (Build.VERSION.SDK_INT >= 21) {
                f966a.put(AppWidgetManager.class, "appwidget");
                f966a.put(BatteryManager.class, "batterymanager");
                f966a.put(CameraManager.class, "camera");
                f966a.put(JobScheduler.class, "jobscheduler");
                f966a.put(LauncherApps.class, "launcherapps");
                f966a.put(MediaProjectionManager.class, "media_projection");
                f966a.put(MediaSessionManager.class, "media_session");
                f966a.put(RestrictionsManager.class, "restrictions");
                f966a.put(TelecomManager.class, "telecom");
                f966a.put(TvInputManager.class, "tv_input");
            }
            if (Build.VERSION.SDK_INT >= 19) {
                f966a.put(AppOpsManager.class, "appops");
                f966a.put(CaptioningManager.class, "captioning");
                f966a.put(ConsumerIrManager.class, "consumer_ir");
                f966a.put(PrintManager.class, "print");
            }
            if (Build.VERSION.SDK_INT >= 18) {
                f966a.put(BluetoothManager.class, "bluetooth");
            }
            if (Build.VERSION.SDK_INT >= 17) {
                f966a.put(DisplayManager.class, "display");
                f966a.put(UserManager.class, "user");
            }
            if (Build.VERSION.SDK_INT >= 16) {
                f966a.put(InputManager.class, "input");
                f966a.put(MediaRouter.class, "media_router");
                f966a.put(NsdManager.class, "servicediscovery");
            }
            f966a.put(AccessibilityManager.class, "accessibility");
            f966a.put(AccountManager.class, "account");
            f966a.put(ActivityManager.class, "activity");
            f966a.put(AlarmManager.class, p.k0);
            f966a.put(AudioManager.class, "audio");
            f966a.put(ClipboardManager.class, "clipboard");
            f966a.put(ConnectivityManager.class, "connectivity");
            f966a.put(DevicePolicyManager.class, "device_policy");
            f966a.put(DownloadManager.class, "download");
            f966a.put(DropBoxManager.class, "dropbox");
            f966a.put(InputMethodManager.class, "input_method");
            f966a.put(KeyguardManager.class, "keyguard");
            f966a.put(LayoutInflater.class, "layout_inflater");
            f966a.put(LocationManager.class, FirebaseAnalytics.b.t);
            f966a.put(NfcManager.class, "nfc");
            f966a.put(NotificationManager.class, "notification");
            f966a.put(PowerManager.class, "power");
            f966a.put(SearchManager.class, FirebaseAnalytics.a.r);
            f966a.put(SensorManager.class, "sensor");
            f966a.put(StorageManager.class, "storage");
            f966a.put(TelephonyManager.class, "phone");
            f966a.put(TextServicesManager.class, "textservices");
            f966a.put(UiModeManager.class, "uimode");
            f966a.put(UsbManager.class, "usb");
            f966a.put(Vibrator.class, "vibrator");
            f966a.put(WallpaperManager.class, "wallpaper");
            f966a.put(WifiP2pManager.class, "wifip2p");
            f966a.put(WifiManager.class, "wifi");
            f966a.put(WindowManager.class, "window");
        }

        private a() {
        }
    }

    private static class b implements Executor {
        private final Handler d;

        b(@h0 Handler handler) {
            this.d = handler;
        }

        @Override // java.util.concurrent.Executor
        public void execute(Runnable runnable) {
            if (this.d.post(runnable)) {
                return;
            }
            throw new RejectedExecutionException(this.d + " is shutting down");
        }
    }

    protected c() {
    }

    public static int a(@h0 Context context, @h0 String str) {
        if (str != null) {
            return context.checkPermission(str, Process.myPid(), Process.myUid());
        }
        throw new IllegalArgumentException("permission is null");
    }

    @i0
    public static Context b(@h0 Context context) {
        if (Build.VERSION.SDK_INT >= 24) {
            return context.createDeviceProtectedStorageContext();
        }
        return null;
    }

    private static synchronized File c(File file) {
        if (file.exists() || file.mkdirs()) {
            return file;
        }
        if (file.exists()) {
            return file;
        }
        Log.w(f963a, "Unable to create files subdir " + file.getPath());
        return null;
    }

    public static File d(@h0 Context context) {
        return Build.VERSION.SDK_INT >= 21 ? context.getCodeCacheDir() : c(new File(context.getApplicationInfo().dataDir, "code_cache"));
    }

    @k
    public static int e(@h0 Context context, @m int r3) {
        return Build.VERSION.SDK_INT >= 23 ? context.getColor(r3) : context.getResources().getColor(r3);
    }

    @i0
    public static ColorStateList f(@h0 Context context, @m int r3) {
        return Build.VERSION.SDK_INT >= 23 ? context.getColorStateList(r3) : context.getResources().getColorStateList(r3);
    }

    @i0
    public static File g(@h0 Context context) {
        if (Build.VERSION.SDK_INT >= 24) {
            return context.getDataDir();
        }
        String str = context.getApplicationInfo().dataDir;
        if (str != null) {
            return new File(str);
        }
        return null;
    }

    @i0
    public static Drawable h(@h0 Context context, @q int r5) {
        int r0 = Build.VERSION.SDK_INT;
        if (r0 >= 21) {
            return context.getDrawable(r5);
        }
        if (r0 < 16) {
            synchronized (f964b) {
                if (f965c == null) {
                    f965c = new TypedValue();
                }
                context.getResources().getValue(r5, f965c, true);
                r5 = f965c.resourceId;
            }
        }
        return context.getResources().getDrawable(r5);
    }

    @h0
    public static File[] i(@h0 Context context) {
        return Build.VERSION.SDK_INT >= 19 ? context.getExternalCacheDirs() : new File[]{context.getExternalCacheDir()};
    }

    @h0
    public static File[] j(@h0 Context context, @i0 String str) {
        return Build.VERSION.SDK_INT >= 19 ? context.getExternalFilesDirs(str) : new File[]{context.getExternalFilesDir(str)};
    }

    public static Executor k(Context context) {
        return Build.VERSION.SDK_INT >= 28 ? context.getMainExecutor() : new b(new Handler(context.getMainLooper()));
    }

    @i0
    public static File l(@h0 Context context) {
        return Build.VERSION.SDK_INT >= 21 ? context.getNoBackupFilesDir() : c(new File(context.getApplicationInfo().dataDir, "no_backup"));
    }

    @h0
    public static File[] m(@h0 Context context) {
        return Build.VERSION.SDK_INT >= 19 ? context.getObbDirs() : new File[]{context.getObbDir()};
    }

    @i0
    public static <T> T n(@h0 Context context, @h0 Class<T> cls) {
        if (Build.VERSION.SDK_INT >= 23) {
            return (T) context.getSystemService(cls);
        }
        String strO = o(context, cls);
        if (strO != null) {
            return (T) context.getSystemService(strO);
        }
        return null;
    }

    @i0
    public static String o(@h0 Context context, @h0 Class<?> cls) {
        return Build.VERSION.SDK_INT >= 23 ? context.getSystemServiceName(cls) : a.f966a.get(cls);
    }

    public static boolean p(@h0 Context context) {
        if (Build.VERSION.SDK_INT >= 24) {
            return context.isDeviceProtectedStorage();
        }
        return false;
    }

    public static boolean q(@h0 Context context, @h0 Intent[] intentArr) {
        return r(context, intentArr, null);
    }

    public static boolean r(@h0 Context context, @h0 Intent[] intentArr, @i0 Bundle bundle) {
        if (Build.VERSION.SDK_INT >= 16) {
            context.startActivities(intentArr, bundle);
            return true;
        }
        context.startActivities(intentArr);
        return true;
    }

    public static void s(@h0 Context context, @h0 Intent intent, @i0 Bundle bundle) {
        if (Build.VERSION.SDK_INT >= 16) {
            context.startActivity(intent, bundle);
        } else {
            context.startActivity(intent);
        }
    }

    public static void t(@h0 Context context, @h0 Intent intent) {
        if (Build.VERSION.SDK_INT >= 26) {
            context.startForegroundService(intent);
        } else {
            context.startService(intent);
        }
    }
}

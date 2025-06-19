package b.i.c.i;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentSender;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.content.pm.ShortcutInfo;
import android.content.pm.ShortcutManager;
import android.os.Build;
import android.text.TextUtils;
import androidx.annotation.h0;
import androidx.annotation.i0;
import androidx.annotation.x0;
import b.i.c.i.d;
import b.i.c.i.e;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes.dex */
public class f {

    /* renamed from: a, reason: collision with root package name */
    @x0
    static final String f982a = "com.android.launcher.action.INSTALL_SHORTCUT";

    /* renamed from: b, reason: collision with root package name */
    @x0
    static final String f983b = "com.android.launcher.permission.INSTALL_SHORTCUT";

    /* renamed from: c, reason: collision with root package name */
    public static final String f984c = "android.intent.extra.shortcut.ID";
    private static volatile e<?> d;

    class a extends BroadcastReceiver {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ IntentSender f985a;

        a(IntentSender intentSender) {
            this.f985a = intentSender;
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) throws IntentSender.SendIntentException {
            try {
                this.f985a.sendIntent(context, 0, null, null, null);
            } catch (IntentSender.SendIntentException unused) {
            }
        }
    }

    private f() {
    }

    public static boolean a(@h0 Context context, @h0 List<d> list) {
        if (Build.VERSION.SDK_INT >= 25) {
            ArrayList arrayList = new ArrayList();
            Iterator<d> it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(it.next().o());
            }
            if (!((ShortcutManager) context.getSystemService(ShortcutManager.class)).addDynamicShortcuts(arrayList)) {
                return false;
            }
        }
        e(context).a(list);
        return true;
    }

    @h0
    public static Intent b(@h0 Context context, @h0 d dVar) {
        Intent intentCreateShortcutResultIntent = Build.VERSION.SDK_INT >= 26 ? ((ShortcutManager) context.getSystemService(ShortcutManager.class)).createShortcutResultIntent(dVar.o()) : null;
        if (intentCreateShortcutResultIntent == null) {
            intentCreateShortcutResultIntent = new Intent();
        }
        return dVar.a(intentCreateShortcutResultIntent);
    }

    @h0
    public static List<d> c(@h0 Context context) {
        if (Build.VERSION.SDK_INT < 25) {
            try {
                return e(context).b();
            } catch (Exception unused) {
                return new ArrayList();
            }
        }
        List<ShortcutInfo> dynamicShortcuts = ((ShortcutManager) context.getSystemService(ShortcutManager.class)).getDynamicShortcuts();
        ArrayList arrayList = new ArrayList(dynamicShortcuts.size());
        Iterator<ShortcutInfo> it = dynamicShortcuts.iterator();
        while (it.hasNext()) {
            arrayList.add(new d.a(context, it.next()).a());
        }
        return arrayList;
    }

    public static int d(@h0 Context context) {
        if (Build.VERSION.SDK_INT >= 25) {
            return ((ShortcutManager) context.getSystemService(ShortcutManager.class)).getMaxShortcutCountPerActivity();
        }
        return 0;
    }

    private static e<?> e(Context context) {
        if (d == null) {
            if (Build.VERSION.SDK_INT >= 23) {
                try {
                    d = (e) Class.forName("androidx.sharetarget.ShortcutInfoCompatSaverImpl", false, f.class.getClassLoader()).getMethod("getInstance", Context.class).invoke(null, context);
                } catch (Exception unused) {
                }
            }
            if (d == null) {
                d = new e.a();
            }
        }
        return d;
    }

    public static boolean f(@h0 Context context) {
        if (Build.VERSION.SDK_INT >= 26) {
            return ((ShortcutManager) context.getSystemService(ShortcutManager.class)).isRequestPinShortcutSupported();
        }
        if (b.i.c.c.a(context, f983b) != 0) {
            return false;
        }
        Iterator<ResolveInfo> it = context.getPackageManager().queryBroadcastReceivers(new Intent(f982a), 0).iterator();
        while (it.hasNext()) {
            String str = it.next().activityInfo.permission;
            if (TextUtils.isEmpty(str) || f983b.equals(str)) {
                return true;
            }
        }
        return false;
    }

    public static void g(@h0 Context context) {
        if (Build.VERSION.SDK_INT >= 25) {
            ((ShortcutManager) context.getSystemService(ShortcutManager.class)).removeAllDynamicShortcuts();
        }
        e(context).c();
    }

    public static void h(@h0 Context context, @h0 List<String> list) {
        if (Build.VERSION.SDK_INT >= 25) {
            ((ShortcutManager) context.getSystemService(ShortcutManager.class)).removeDynamicShortcuts(list);
        }
        e(context).d(list);
    }

    public static boolean i(@h0 Context context, @h0 d dVar, @i0 IntentSender intentSender) throws PackageManager.NameNotFoundException {
        if (Build.VERSION.SDK_INT >= 26) {
            return ((ShortcutManager) context.getSystemService(ShortcutManager.class)).requestPinShortcut(dVar.o(), intentSender);
        }
        if (!f(context)) {
            return false;
        }
        Intent intentA = dVar.a(new Intent(f982a));
        if (intentSender == null) {
            context.sendBroadcast(intentA);
            return true;
        }
        context.sendOrderedBroadcast(intentA, null, new a(intentSender), null, -1, null, null);
        return true;
    }

    public static boolean j(@h0 Context context, @h0 List<d> list) {
        if (Build.VERSION.SDK_INT >= 25) {
            ArrayList arrayList = new ArrayList();
            Iterator<d> it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(it.next().o());
            }
            if (!((ShortcutManager) context.getSystemService(ShortcutManager.class)).updateShortcuts(arrayList)) {
                return false;
            }
        }
        e(context).a(list);
        return true;
    }
}

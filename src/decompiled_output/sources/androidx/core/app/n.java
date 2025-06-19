package androidx.core.app;

import android.app.Activity;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.os.Build;
import android.os.Bundle;
import android.util.Log;
import androidx.annotation.h0;
import androidx.annotation.i0;

/* loaded from: classes.dex */
public final class n {

    /* renamed from: a, reason: collision with root package name */
    private static final String f294a = "NavUtils";

    /* renamed from: b, reason: collision with root package name */
    public static final String f295b = "android.support.PARENT_ACTIVITY";

    private n() {
    }

    @i0
    public static Intent a(@h0 Activity activity) {
        Intent parentActivityIntent;
        if (Build.VERSION.SDK_INT >= 16 && (parentActivityIntent = activity.getParentActivityIntent()) != null) {
            return parentActivityIntent;
        }
        String strD = d(activity);
        if (strD == null) {
            return null;
        }
        ComponentName componentName = new ComponentName(activity, strD);
        try {
            return e(activity, componentName) == null ? Intent.makeMainActivity(componentName) : new Intent().setComponent(componentName);
        } catch (PackageManager.NameNotFoundException unused) {
            Log.e(f294a, "getParentActivityIntent: bad parentActivityName '" + strD + "' in manifest");
            return null;
        }
    }

    @i0
    public static Intent b(@h0 Context context, @h0 ComponentName componentName) throws PackageManager.NameNotFoundException {
        String strE = e(context, componentName);
        if (strE == null) {
            return null;
        }
        ComponentName componentName2 = new ComponentName(componentName.getPackageName(), strE);
        return e(context, componentName2) == null ? Intent.makeMainActivity(componentName2) : new Intent().setComponent(componentName2);
    }

    @i0
    public static Intent c(@h0 Context context, @h0 Class<?> cls) throws PackageManager.NameNotFoundException {
        String strE = e(context, new ComponentName(context, cls));
        if (strE == null) {
            return null;
        }
        ComponentName componentName = new ComponentName(context, strE);
        return e(context, componentName) == null ? Intent.makeMainActivity(componentName) : new Intent().setComponent(componentName);
    }

    @i0
    public static String d(@h0 Activity activity) {
        try {
            return e(activity, activity.getComponentName());
        } catch (PackageManager.NameNotFoundException e) {
            throw new IllegalArgumentException(e);
        }
    }

    @i0
    public static String e(@h0 Context context, @h0 ComponentName componentName) throws PackageManager.NameNotFoundException {
        String string;
        String str;
        PackageManager packageManager = context.getPackageManager();
        int r1 = Build.VERSION.SDK_INT;
        int r12 = 640;
        int r3 = Build.VERSION.SDK_INT;
        if (r3 >= 29) {
            r12 = 269222528;
        } else if (r3 >= 24) {
            r12 = 787072;
        }
        ActivityInfo activityInfo = packageManager.getActivityInfo(componentName, r12);
        if (Build.VERSION.SDK_INT >= 16 && (str = activityInfo.parentActivityName) != null) {
            return str;
        }
        Bundle bundle = activityInfo.metaData;
        if (bundle == null || (string = bundle.getString(f295b)) == null) {
            return null;
        }
        if (string.charAt(0) != '.') {
            return string;
        }
        return context.getPackageName() + string;
    }

    public static void f(@h0 Activity activity) {
        Intent intentA = a(activity);
        if (intentA != null) {
            g(activity, intentA);
            return;
        }
        throw new IllegalArgumentException("Activity " + activity.getClass().getSimpleName() + " does not have a parent activity name specified. (Did you forget to add the android.support.PARENT_ACTIVITY <meta-data>  element in your manifest?)");
    }

    public static void g(@h0 Activity activity, @h0 Intent intent) {
        if (Build.VERSION.SDK_INT >= 16) {
            activity.navigateUpTo(intent);
            return;
        }
        intent.addFlags(67108864);
        activity.startActivity(intent);
        activity.finish();
    }

    public static boolean h(@h0 Activity activity, @h0 Intent intent) {
        if (Build.VERSION.SDK_INT >= 16) {
            return activity.shouldUpRecreateTask(intent);
        }
        String action = activity.getIntent().getAction();
        return (action == null || action.equals("android.intent.action.MAIN")) ? false : true;
    }
}

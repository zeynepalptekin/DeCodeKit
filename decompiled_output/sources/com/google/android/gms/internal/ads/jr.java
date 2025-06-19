package com.google.android.gms.internal.ads;

import android.annotation.TargetApi;
import android.content.ContentResolver;
import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.provider.Settings;
import android.text.TextUtils;
import android.util.DisplayMetrics;
import android.util.TypedValue;
import android.view.Display;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.google.android.gms.ads.AdView;
import java.math.BigInteger;
import java.net.HttpURLConnection;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Locale;
import java.util.StringTokenizer;
import java.util.UUID;

/* loaded from: classes.dex */
public final class jr {

    /* renamed from: b, reason: collision with root package name */
    public static final Handler f4014b = new lu1(Looper.getMainLooper());

    /* renamed from: c, reason: collision with root package name */
    private static final String f4015c = AdView.class.getName();
    private static final String d = com.google.android.gms.ads.l.class.getName();
    private static final String e = com.google.android.gms.ads.c0.e.class.getName();
    private static final String f = com.google.android.gms.ads.c0.f.class.getName();
    private static final String g = com.google.android.gms.ads.n0.c.class.getName();
    private static final String h = com.google.android.gms.ads.d.class.getName();

    /* renamed from: a, reason: collision with root package name */
    private float f4016a = -1.0f;

    public static int a(DisplayMetrics displayMetrics, int r2) {
        return (int) TypedValue.applyDimension(1, r2, displayMetrics);
    }

    public static com.google.android.gms.ads.f b(Context context, int r1, int r2, int r3) {
        float f2;
        float f3;
        int r22;
        int r0 = u(context, r3);
        if (r0 == -1) {
            return com.google.android.gms.ads.f.q;
        }
        int r02 = Math.min(90, Math.round(r0 * 0.15f));
        if (r1 <= 655) {
            if (r1 > 632) {
                r22 = 81;
            } else if (r1 > 526) {
                f2 = r1 / 468.0f;
                f3 = 60.0f;
            } else if (r1 > 432) {
                r22 = 68;
            } else {
                f2 = r1 / 320.0f;
                f3 = 50.0f;
            }
            return new com.google.android.gms.ads.f(r1, Math.max(Math.min(r22, r02), 50));
        }
        f2 = r1 / 728.0f;
        f3 = 90.0f;
        r22 = Math.round(f2 * f3);
        return new com.google.android.gms.ads.f(r1, Math.max(Math.min(r22, r02), 50));
    }

    @androidx.annotation.i0
    @com.google.android.gms.common.util.d0
    public static String c(StackTraceElement[] stackTraceElementArr, String str) {
        int r1;
        String className;
        int r0 = 0;
        while (true) {
            r1 = r0 + 1;
            if (r1 >= stackTraceElementArr.length) {
                className = null;
                break;
            }
            StackTraceElement stackTraceElement = stackTraceElementArr[r0];
            String className2 = stackTraceElement.getClassName();
            if ("loadAd".equalsIgnoreCase(stackTraceElement.getMethodName()) && (f4015c.equalsIgnoreCase(className2) || d.equalsIgnoreCase(className2) || e.equalsIgnoreCase(className2) || f.equalsIgnoreCase(className2) || g.equalsIgnoreCase(className2) || h.equalsIgnoreCase(className2))) {
                break;
            }
            r0 = r1;
        }
        className = stackTraceElementArr[r1].getClassName();
        if (str != null) {
            StringTokenizer stringTokenizer = new StringTokenizer(str, ".");
            StringBuilder sb = new StringBuilder();
            int r4 = 2;
            if (stringTokenizer.hasMoreElements()) {
                sb.append(stringTokenizer.nextToken());
                while (true) {
                    int r7 = r4 - 1;
                    if (r4 <= 0 || !stringTokenizer.hasMoreElements()) {
                        break;
                    }
                    sb.append(".");
                    sb.append(stringTokenizer.nextToken());
                    r4 = r7;
                }
                str = sb.toString();
            }
            if (className != null && !className.contains(str)) {
                return className;
            }
        }
        return null;
    }

    public static void e(Context context, @androidx.annotation.i0 String str, String str2, Bundle bundle, boolean z, or orVar) {
        Context applicationContext = context.getApplicationContext();
        if (applicationContext == null) {
            applicationContext = context;
        }
        bundle.putString("os", Build.VERSION.RELEASE);
        bundle.putString("api", String.valueOf(Build.VERSION.SDK_INT));
        bundle.putString("appid", applicationContext.getPackageName());
        if (str == null) {
            int r2 = c.a.b.b.d.f.i().b(context);
            StringBuilder sb = new StringBuilder(23);
            sb.append(r2);
            sb.append(".202510000");
            str = sb.toString();
        }
        bundle.putString("js", str);
        Uri.Builder builderAppendQueryParameter = new Uri.Builder().scheme("https").path("//pagead2.googlesyndication.com/pagead/gen_204").appendQueryParameter("id", str2);
        for (String str3 : bundle.keySet()) {
            builderAppendQueryParameter.appendQueryParameter(str3, bundle.getString(str3));
        }
        orVar.a(builderAppendQueryParameter.toString());
    }

    private final void g(ViewGroup viewGroup, qw2 qw2Var, String str, int r8, int r9) {
        if (viewGroup.getChildCount() != 0) {
            return;
        }
        Context context = viewGroup.getContext();
        TextView textView = new TextView(context);
        textView.setGravity(17);
        textView.setText(str);
        textView.setTextColor(r8);
        textView.setBackgroundColor(r9);
        FrameLayout frameLayout = new FrameLayout(context);
        frameLayout.setBackgroundColor(r8);
        int r82 = r(context, 3);
        frameLayout.addView(textView, new FrameLayout.LayoutParams(qw2Var.i - r82, qw2Var.f - r82, 17));
        viewGroup.addView(frameLayout, qw2Var.i, qw2Var.f);
    }

    public static void i(boolean z, HttpURLConnection httpURLConnection, @androidx.annotation.i0 String str) {
        httpURLConnection.setConnectTimeout(60000);
        httpURLConnection.setInstanceFollowRedirects(true);
        httpURLConnection.setReadTimeout(60000);
        if (str != null) {
            httpURLConnection.setRequestProperty("User-Agent", str);
        }
        httpURLConnection.setUseCaches(false);
    }

    public static int k(DisplayMetrics displayMetrics, int r1) {
        return Math.round(r1 / displayMetrics.density);
    }

    public static String l(Context context) {
        ContentResolver contentResolver = context.getContentResolver();
        String string = contentResolver == null ? null : Settings.Secure.getString(contentResolver, "android_id");
        if (string == null || x()) {
            string = "emulator";
        }
        return v(string);
    }

    @androidx.annotation.i0
    public static String m(Context context) {
        ContentResolver contentResolver = context.getContentResolver();
        if (contentResolver == null) {
            return null;
        }
        return Settings.Secure.getString(contentResolver, "android_id");
    }

    public static boolean n(Context context) {
        int r2 = c.a.b.b.d.f.i().k(context, 12451000);
        return r2 == 0 || r2 == 2;
    }

    public static boolean o(Context context) {
        if (context.getResources().getConfiguration().orientation != 2) {
            return false;
        }
        DisplayMetrics displayMetrics = context.getResources().getDisplayMetrics();
        return ((int) (((float) displayMetrics.heightPixels) / displayMetrics.density)) < 600;
    }

    @TargetApi(17)
    public static boolean p(Context context) {
        int r1;
        int r3;
        DisplayMetrics displayMetrics = context.getResources().getDisplayMetrics();
        Display defaultDisplay = ((WindowManager) context.getSystemService("window")).getDefaultDisplay();
        if (com.google.android.gms.common.util.v.f()) {
            defaultDisplay.getRealMetrics(displayMetrics);
            r1 = displayMetrics.heightPixels;
            r3 = displayMetrics.widthPixels;
        } else {
            try {
                r1 = ((Integer) Display.class.getMethod("getRawHeight", new Class[0]).invoke(defaultDisplay, new Object[0])).intValue();
                r3 = ((Integer) Display.class.getMethod("getRawWidth", new Class[0]).invoke(defaultDisplay, new Object[0])).intValue();
            } catch (Exception unused) {
            }
        }
        defaultDisplay.getMetrics(displayMetrics);
        return displayMetrics.heightPixels == r1 && displayMetrics.widthPixels == r3;
    }

    public static int q(Context context) {
        int identifier = context.getResources().getIdentifier("navigation_bar_width", "dimen", "android");
        if (identifier > 0) {
            return context.getResources().getDimensionPixelSize(identifier);
        }
        return 0;
    }

    public static int r(Context context, int r1) {
        return a(context.getResources().getDisplayMetrics(), r1);
    }

    public static Throwable s(Throwable th) {
        if (g2.f.a().booleanValue()) {
            return th;
        }
        LinkedList linkedList = new LinkedList();
        while (th != null) {
            linkedList.push(th);
            th = th.getCause();
        }
        Throwable th2 = null;
        while (!linkedList.isEmpty()) {
            Throwable th3 = (Throwable) linkedList.pop();
            StackTraceElement[] stackTrace = th3.getStackTrace();
            ArrayList arrayList = new ArrayList();
            arrayList.add(new StackTraceElement(th3.getClass().getName(), "<filtered>", "<filtered>", 1));
            boolean z = false;
            for (StackTraceElement stackTraceElement : stackTrace) {
                if (w(stackTraceElement.getClassName())) {
                    arrayList.add(stackTraceElement);
                    z = true;
                } else {
                    String className = stackTraceElement.getClassName();
                    if (!(!TextUtils.isEmpty(className) && (className.startsWith("android.") || className.startsWith("java.")))) {
                        stackTraceElement = new StackTraceElement("<filtered>", "<filtered>", "<filtered>", 1);
                    }
                    arrayList.add(stackTraceElement);
                }
            }
            if (z) {
                th2 = th2 == null ? new Throwable(th3.getMessage()) : new Throwable(th3.getMessage(), th2);
                th2.setStackTrace((StackTraceElement[]) arrayList.toArray(new StackTraceElement[0]));
            }
        }
        return th2;
    }

    public static boolean t(Context context, int r2) {
        return c.a.b.b.d.f.i().k(context, r2) == 0;
    }

    public static int u(Context context, int r3) {
        DisplayMetrics displayMetrics;
        Configuration configuration;
        if (context == null) {
            return -1;
        }
        if (context.getApplicationContext() != null) {
            context = context.getApplicationContext();
        }
        Resources resources = context.getResources();
        if (resources == null || (displayMetrics = resources.getDisplayMetrics()) == null || (configuration = resources.getConfiguration()) == null) {
            return -1;
        }
        int r2 = configuration.orientation;
        if (r3 == 0) {
            r3 = r2;
        }
        return Math.round((r3 == r2 ? displayMetrics.heightPixels : displayMetrics.widthPixels) / displayMetrics.density);
    }

    public static String v(String str) throws NoSuchAlgorithmException {
        for (int r1 = 0; r1 < 2; r1++) {
            try {
                MessageDigest messageDigest = MessageDigest.getInstance("MD5");
                messageDigest.update(str.getBytes());
                return String.format(Locale.US, "%032X", new BigInteger(1, messageDigest.digest()));
            } catch (ArithmeticException unused) {
                return null;
            } catch (NoSuchAlgorithmException unused2) {
            }
        }
        return null;
    }

    @com.google.android.gms.common.util.d0
    public static boolean w(String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        return str.startsWith(g2.d.a());
    }

    public static boolean x() {
        return Build.DEVICE.startsWith("generic");
    }

    public static boolean y() {
        return Looper.myLooper() == Looper.getMainLooper();
    }

    public static String z() throws NoSuchAlgorithmException {
        UUID r0 = UUID.randomUUID();
        byte[] byteArray = BigInteger.valueOf(r0.getLeastSignificantBits()).toByteArray();
        byte[] byteArray2 = BigInteger.valueOf(r0.getMostSignificantBits()).toByteArray();
        String string = new BigInteger(1, byteArray).toString();
        for (int r5 = 0; r5 < 2; r5++) {
            try {
                MessageDigest messageDigest = MessageDigest.getInstance("MD5");
                messageDigest.update(byteArray);
                messageDigest.update(byteArray2);
                byte[] bArr = new byte[8];
                System.arraycopy(messageDigest.digest(), 0, bArr, 0, 8);
                string = new BigInteger(1, bArr).toString();
            } catch (NoSuchAlgorithmException unused) {
            }
        }
        return string;
    }

    public final void d(Context context, @androidx.annotation.i0 String str, String str2, Bundle bundle, boolean z) {
        e(context, str, str2, bundle, true, new mr(this));
    }

    public final void f(ViewGroup viewGroup, qw2 qw2Var, String str) {
        g(viewGroup, qw2Var, str, b.i.p.f0.t, -1);
    }

    public final void h(ViewGroup viewGroup, qw2 qw2Var, String str, String str2) {
        tr.i(str2);
        g(viewGroup, qw2Var, str, b.i.g.b.a.f1048c, b.i.p.f0.t);
    }

    public final int j(Context context, int r4) {
        if (this.f4016a < 0.0f) {
            synchronized (this) {
                if (this.f4016a < 0.0f) {
                    Display defaultDisplay = ((WindowManager) context.getSystemService("window")).getDefaultDisplay();
                    DisplayMetrics displayMetrics = new DisplayMetrics();
                    defaultDisplay.getMetrics(displayMetrics);
                    this.f4016a = displayMetrics.density;
                }
            }
        }
        return Math.round(r4 / this.f4016a);
    }
}

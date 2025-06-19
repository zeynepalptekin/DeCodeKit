package com.google.android.gms.internal.ads;

import android.R;
import android.annotation.SuppressLint;
import android.annotation.TargetApi;
import android.app.Activity;
import android.app.ActivityManager;
import android.app.AlertDialog;
import android.app.KeyguardManager;
import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.SharedPreferences;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Looper;
import android.os.PowerManager;
import android.os.Process;
import android.preference.PreferenceManager;
import android.text.TextUtils;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.ViewParent;
import android.view.Window;
import android.view.WindowManager;
import android.webkit.WebResourceResponse;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.widget.AdapterView;
import android.widget.PopupWindow;
import android.widget.ScrollView;
import com.google.android.gms.ads.f0.a;
import java.io.ByteArrayInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.UnsupportedEncodingException;
import java.net.HttpURLConnection;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.UUID;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicReference;
import java.util.regex.Pattern;
import java.util.regex.PatternSyntaxException;
import javax.annotation.concurrent.GuardedBy;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class to {
    public static final lu1 h = new no(Looper.getMainLooper());

    @GuardedBy("userAgentLock")
    private String e;

    /* renamed from: a, reason: collision with root package name */
    private AtomicReference<Pattern> f5426a = new AtomicReference<>(null);

    /* renamed from: b, reason: collision with root package name */
    private AtomicReference<Pattern> f5427b = new AtomicReference<>(null);

    /* renamed from: c, reason: collision with root package name */
    private boolean f5428c = true;
    private final Object d = new Object();
    private boolean f = false;
    private boolean g = false;

    public static boolean A(Context context) {
        List<ActivityManager.RunningAppProcessInfo> runningAppProcesses;
        try {
            ActivityManager activityManager = (ActivityManager) context.getSystemService("activity");
            KeyguardManager keyguardManager = (KeyguardManager) context.getSystemService("keyguard");
            if (activityManager == null || keyguardManager == null || (runningAppProcesses = activityManager.getRunningAppProcesses()) == null) {
                return false;
            }
            for (ActivityManager.RunningAppProcessInfo runningAppProcessInfo : runningAppProcesses) {
                if (Process.myPid() == runningAppProcessInfo.pid) {
                    if (runningAppProcessInfo.importance != 100 || keyguardManager.inKeyguardRestrictedInputMode()) {
                        return true;
                    }
                    PowerManager powerManager = (PowerManager) context.getSystemService("power");
                    return !(powerManager == null ? false : powerManager.isScreenOn());
                }
            }
            return true;
        } catch (Throwable unused) {
        }
        return false;
    }

    public static int B(Context context) {
        ApplicationInfo applicationInfo = context.getApplicationInfo();
        if (applicationInfo == null) {
            return 0;
        }
        return applicationInfo.targetSdkVersion;
    }

    @androidx.annotation.i0
    private static KeyguardManager C(Context context) {
        Object systemService = context.getSystemService("keyguard");
        if (systemService == null || !(systemService instanceof KeyguardManager)) {
            return null;
        }
        return (KeyguardManager) systemService;
    }

    @TargetApi(16)
    public static boolean D(Context context) {
        KeyguardManager keyguardManagerC;
        return context != null && com.google.android.gms.common.util.v.e() && (keyguardManagerC = C(context)) != null && keyguardManagerC.isKeyguardLocked();
    }

    public static boolean E(Context context) {
        try {
            context.getClassLoader().loadClass("com.google.android.gms.ads.internal.ClientApi");
            return false;
        } catch (ClassNotFoundException unused) {
            return true;
        } catch (Throwable th) {
            tr.c("Error loading class.", th);
            com.google.android.gms.ads.internal.p.g().e(th, "AdUtil.isLiteSdk");
            return false;
        }
    }

    @TargetApi(18)
    public static void F(Context context, Intent intent) {
        if (intent != null && com.google.android.gms.common.util.v.g()) {
            Bundle extras = intent.getExtras() != null ? intent.getExtras() : new Bundle();
            extras.putBinder(b.d.b.c.d, null);
            extras.putString("com.android.browser.application_id", context.getPackageName());
            intent.putExtras(extras);
        }
    }

    public static void G(Context context, String str, String str2) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(str2);
        int size = arrayList.size();
        int r1 = 0;
        while (r1 < size) {
            Object obj = arrayList.get(r1);
            r1++;
            new zq(context, str, (String) obj).c();
        }
    }

    public static String H(Context context) {
        return !((Boolean) qx2.e().c(e0.l4)).booleanValue() ? "" : context.getSharedPreferences("mobileads_consent", 0).getString("consent_string", "");
    }

    public static Bundle I(Context context) {
        if (!((Boolean) qx2.e().c(e0.m4)).booleanValue()) {
            return null;
        }
        SharedPreferences defaultSharedPreferences = PreferenceManager.getDefaultSharedPreferences(context);
        Bundle bundle = new Bundle();
        if (defaultSharedPreferences.contains("IABConsent_CMPPresent")) {
            bundle.putBoolean("IABConsent_CMPPresent", defaultSharedPreferences.getBoolean("IABConsent_CMPPresent", false));
        }
        String[] strArr = {"IABConsent_SubjectToGDPR", "IABConsent_ConsentString", "IABConsent_ParsedPurposeConsents", "IABConsent_ParsedVendorConsents"};
        for (int r4 = 0; r4 < 4; r4++) {
            String str = strArr[r4];
            if (defaultSharedPreferences.contains(str)) {
                bundle.putString(str, defaultSharedPreferences.getString(str, null));
            }
        }
        return bundle;
    }

    public static boolean J(Context context) {
        Window window;
        if ((context instanceof Activity) && (window = ((Activity) context).getWindow()) != null && window.getDecorView() != null) {
            Rect rect = new Rect();
            Rect rect2 = new Rect();
            window.getDecorView().getGlobalVisibleRect(rect, null);
            window.getDecorView().getWindowVisibleDisplayFrame(rect2);
            if (rect.bottom != 0 && rect2.bottom != 0 && rect.top == rect2.top) {
                return true;
            }
        }
        return false;
    }

    public static String K(Context context) {
        if (context.getApplicationContext() != null) {
            context = context.getApplicationContext();
        }
        return T(b0(context));
    }

    public static boolean L(Context context) {
        Bundle bundleB0 = b0(context);
        return TextUtils.isEmpty(T(bundleB0)) && !TextUtils.isEmpty(bundleB0.getString("com.google.android.gms.ads.INTEGRATION_MANAGER"));
    }

    public static boolean M(Context context) {
        NetworkInfo activeNetworkInfo = ((ConnectivityManager) context.getSystemService("connectivity")).getActiveNetworkInfo();
        return activeNetworkInfo != null && activeNetworkInfo.isConnected();
    }

    public static void N(Context context, String str, String str2) throws IOException {
        try {
            FileOutputStream fileOutputStreamOpenFileOutput = context.openFileOutput(str, 0);
            fileOutputStreamOpenFileOutput.write(str2.getBytes("UTF-8"));
            fileOutputStreamOpenFileOutput.close();
        } catch (Exception e) {
            tr.c("Error writing to file in internal storage.", e);
        }
    }

    public static void O(Runnable runnable) {
        if (Looper.getMainLooper().getThread() != Thread.currentThread()) {
            runnable.run();
        } else {
            cs.f3023a.execute(runnable);
        }
    }

    @androidx.annotation.i0
    public static WebResourceResponse P(Context context, String str, String str2) throws ExecutionException, InterruptedException, TimeoutException {
        try {
            HashMap map = new HashMap();
            map.put("User-Agent", com.google.android.gms.ads.internal.p.c().m0(context, str));
            map.put("Cache-Control", "max-stale=3600");
            String str3 = new iq(context).c(str2, map).get(60L, TimeUnit.SECONDS);
            if (str3 != null) {
                return new WebResourceResponse("application/javascript", "UTF-8", new ByteArrayInputStream(str3.getBytes("UTF-8")));
            }
            return null;
        } catch (IOException | InterruptedException | ExecutionException | TimeoutException e) {
            tr.d("Could not fetch MRAID JS.", e);
            return null;
        }
    }

    public static WebResourceResponse Q(HttpURLConnection httpURLConnection) throws IOException {
        com.google.android.gms.ads.internal.p.c();
        String contentType = httpURLConnection.getContentType();
        String strTrim = "";
        String strTrim2 = TextUtils.isEmpty(contentType) ? "" : contentType.split(";")[0].trim();
        com.google.android.gms.ads.internal.p.c();
        String contentType2 = httpURLConnection.getContentType();
        if (!TextUtils.isEmpty(contentType2)) {
            String[] strArrSplit = contentType2.split(";");
            if (strArrSplit.length != 1) {
                int r1 = 1;
                while (true) {
                    if (r1 >= strArrSplit.length) {
                        break;
                    }
                    if (strArrSplit[r1].trim().startsWith("charset")) {
                        String[] strArrSplit2 = strArrSplit[r1].trim().split("=");
                        if (strArrSplit2.length > 1) {
                            strTrim = strArrSplit2[1].trim();
                            break;
                        }
                    }
                    r1++;
                }
            }
        }
        String str = strTrim;
        Map<String, List<String>> headerFields = httpURLConnection.getHeaderFields();
        HashMap map = new HashMap(headerFields.size());
        for (Map.Entry<String, List<String>> entry : headerFields.entrySet()) {
            if (entry.getKey() != null && entry.getValue() != null && entry.getValue().size() > 0) {
                map.put(entry.getKey(), entry.getValue().get(0));
            }
        }
        return com.google.android.gms.ads.internal.p.e().e(strTrim2, str, httpURLConnection.getResponseCode(), httpURLConnection.getResponseMessage(), map, httpURLConnection.getInputStream());
    }

    public static int[] S(Activity activity) {
        View viewFindViewById;
        Window window = activity.getWindow();
        return (window == null || (viewFindViewById = window.findViewById(R.id.content)) == null) ? s0() : new int[]{viewFindViewById.getWidth(), viewFindViewById.getHeight()};
    }

    private static String T(Bundle bundle) {
        if (bundle == null) {
            return "";
        }
        String string = bundle.getString("com.google.android.gms.ads.APPLICATION_ID");
        return TextUtils.isEmpty(string) ? "" : (string.matches("^ca-app-pub-[0-9]{16}~[0-9]{10}$") || string.matches("^/\\d+~.+$")) ? string : "";
    }

    public static int V(String str) {
        try {
            return Integer.parseInt(str);
        } catch (NumberFormatException e) {
            String strValueOf = String.valueOf(e);
            StringBuilder sb = new StringBuilder(String.valueOf(strValueOf).length() + 22);
            sb.append("Could not parse value:");
            sb.append(strValueOf);
            tr.i(sb.toString());
            return 0;
        }
    }

    public static boolean W(String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        return str.matches("([^\\s]+(\\.(?i)(jpg|png|gif|bmp|webp))$)");
    }

    public static boolean Z(String str) {
        if (!nr.a()) {
            return false;
        }
        if (!((Boolean) qx2.e().c(e0.g3)).booleanValue()) {
            return false;
        }
        String str2 = (String) qx2.e().c(e0.i3);
        if (!str2.isEmpty()) {
            for (String str3 : str2.split(";")) {
                if (str3.equals(str)) {
                    return false;
                }
            }
        }
        String str4 = (String) qx2.e().c(e0.h3);
        if (str4.isEmpty()) {
            return true;
        }
        for (String str5 : str4.split(";")) {
            if (str5.equals(str)) {
                return true;
            }
        }
        return false;
    }

    private static int a(char c2) {
        if (c2 >= '0' && c2 <= '9') {
            return c2 - '0';
        }
        char c3 = 'A';
        if (c2 < 'A' || c2 > 'F') {
            c3 = 'a';
            if (c2 < 'a' || c2 > 'f') {
                throw new IllegalArgumentException("Invalid Hex.");
            }
        }
        return (c2 - c3) + 10;
    }

    public static DisplayMetrics b(WindowManager windowManager) {
        DisplayMetrics displayMetrics = new DisplayMetrics();
        windowManager.getDefaultDisplay().getMetrics(displayMetrics);
        return displayMetrics;
    }

    private static Bundle b0(Context context) {
        try {
            return c.a.b.b.d.s.c.a(context).c(context.getPackageName(), 128).metaData;
        } catch (PackageManager.NameNotFoundException | NullPointerException e) {
            oo.l("Error getting metadata", e);
            return null;
        }
    }

    public static PopupWindow c(View view, int r2, int r3, boolean z) {
        return new PopupWindow(view, r2, r3, false);
    }

    public static Map<String, String> d0(Uri uri) {
        if (!w1.f5765b.a().booleanValue()) {
            if (uri == null) {
                return null;
            }
            HashMap map = new HashMap();
            com.google.android.gms.ads.internal.p.e();
            for (String str : uri.getQueryParameterNames()) {
                map.put(str, uri.getQueryParameter(str));
            }
            return map;
        }
        if (uri == null) {
            return null;
        }
        HashMap map2 = new HashMap(20);
        String encodedQuery = uri.getEncodedQuery();
        if (encodedQuery == null) {
            return map2;
        }
        int length = encodedQuery.length();
        StringBuilder sb = new StringBuilder(100);
        StringBuilder sb2 = new StringBuilder(length);
        StringBuilder sb3 = sb;
        int r5 = 0;
        while (r5 < length) {
            char cCharAt = encodedQuery.charAt(r5);
            if (cCharAt == '%') {
                byte[] bArr = new byte[(length - r5) / 3];
                int r10 = 0;
                while (r5 < length - 2 && cCharAt == '%') {
                    try {
                        bArr[r10] = (byte) ((a(encodedQuery.charAt(r5 + 1)) << 4) + a(encodedQuery.charAt(r5 + 2)));
                        r10++;
                    } catch (IllegalArgumentException unused) {
                    }
                    r5 += 3;
                    if (r5 < length) {
                        cCharAt = encodedQuery.charAt(r5);
                    }
                }
                try {
                    sb3.append(new String(bArr, 0, r10, "UTF-8"));
                } catch (UnsupportedEncodingException unused2) {
                }
                if (cCharAt != '%') {
                }
            } else if (cCharAt != '&') {
                if (cCharAt == '+') {
                    cCharAt = ' ';
                } else if (cCharAt == '=' && sb3 != sb2) {
                    sb3 = sb2;
                }
                sb3.append(cCharAt);
            } else {
                if (sb.length() > 0 && sb3 != sb) {
                    map2.put(sb.toString(), sb2.toString());
                    sb.setLength(0);
                    sb2.setLength(0);
                }
                sb3 = sb;
            }
            r5++;
        }
        if (sb.length() > 0 && sb3 != sb) {
            map2.put(sb.toString(), sb2.toString());
        }
        return map2;
    }

    public static String f(InputStreamReader inputStreamReader) throws IOException {
        StringBuilder sb = new StringBuilder(8192);
        char[] cArr = new char[2048];
        while (true) {
            int r2 = inputStreamReader.read(cArr);
            if (r2 == -1) {
                return sb.toString();
            }
            sb.append(cArr, 0, r2);
        }
    }

    public static Bitmap f0(View view) {
        view.setDrawingCacheEnabled(true);
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(view.getDrawingCache());
        view.setDrawingCacheEnabled(false);
        return bitmapCreateBitmap;
    }

    private final JSONArray g(Collection<?> collection) throws JSONException {
        JSONArray jSONArray = new JSONArray();
        Iterator<?> it = collection.iterator();
        while (it.hasNext()) {
            o(jSONArray, it.next());
        }
        return jSONArray;
    }

    public static Bitmap g0(View view) {
        if (view == null) {
            return null;
        }
        Bitmap bitmapI0 = i0(view);
        return bitmapI0 == null ? h0(view) : bitmapI0;
    }

    private static Bitmap h0(@androidx.annotation.h0 View view) {
        try {
            int width = view.getWidth();
            int height = view.getHeight();
            if (width != 0 && height != 0) {
                Bitmap bitmapCreateBitmap = Bitmap.createBitmap(view.getWidth(), view.getHeight(), Bitmap.Config.RGB_565);
                Canvas canvas = new Canvas(bitmapCreateBitmap);
                view.layout(0, 0, width, height);
                view.draw(canvas);
                return bitmapCreateBitmap;
            }
            tr.i("Width or height of view is zero");
            return null;
        } catch (RuntimeException e) {
            tr.c("Fail to capture the webview", e);
            return null;
        }
    }

    public static void i(Context context, Intent intent) {
        try {
            context.startActivity(intent);
        } catch (Throwable unused) {
            intent.addFlags(268435456);
            context.startActivity(intent);
        }
    }

    private static Bitmap i0(@androidx.annotation.h0 View view) {
        try {
            boolean zIsDrawingCacheEnabled = view.isDrawingCacheEnabled();
            view.setDrawingCacheEnabled(true);
            Bitmap drawingCache = view.getDrawingCache();
            bitmapCreateBitmap = drawingCache != null ? Bitmap.createBitmap(drawingCache) : null;
            view.setDrawingCacheEnabled(zIsDrawingCacheEnabled);
        } catch (RuntimeException e) {
            tr.c("Fail to capture the web view", e);
        }
        return bitmapCreateBitmap;
    }

    @TargetApi(18)
    public static void j(Context context, Uri uri) {
        try {
            Intent intent = new Intent("android.intent.action.VIEW", uri);
            Bundle bundle = new Bundle();
            intent.putExtras(bundle);
            F(context, intent);
            bundle.putString("com.android.browser.application_id", context.getPackageName());
            context.startActivity(intent);
            String string = uri.toString();
            StringBuilder sb = new StringBuilder(String.valueOf(string).length() + 26);
            sb.append("Opening ");
            sb.append(string);
            sb.append(" in a new browser.");
            tr.f(sb.toString());
        } catch (ActivityNotFoundException e) {
            tr.c("No browser is found.", e);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0012  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static boolean j0(android.view.View r2) {
        /*
            android.view.View r2 = r2.getRootView()
            r0 = 0
            if (r2 == 0) goto L12
            android.content.Context r2 = r2.getContext()
            boolean r1 = r2 instanceof android.app.Activity
            if (r1 == 0) goto L12
            android.app.Activity r2 = (android.app.Activity) r2
            goto L13
        L12:
            r2 = r0
        L13:
            r1 = 0
            if (r2 != 0) goto L17
            return r1
        L17:
            android.view.Window r2 = r2.getWindow()
            if (r2 != 0) goto L1e
            goto L22
        L1e:
            android.view.WindowManager$LayoutParams r0 = r2.getAttributes()
        L22:
            if (r0 == 0) goto L2d
            int r2 = r0.flags
            r0 = 524288(0x80000, float:7.34684E-40)
            r2 = r2 & r0
            if (r2 == 0) goto L2d
            r2 = 1
            return r2
        L2d:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.to.j0(android.view.View):boolean");
    }

    public static int k0(@androidx.annotation.i0 View view) {
        if (view == null) {
            return -1;
        }
        ViewParent parent = view.getParent();
        while (parent != null && !(parent instanceof AdapterView)) {
            parent = parent.getParent();
        }
        if (parent == null) {
            return -1;
        }
        return ((AdapterView) parent).getPositionForView(view);
    }

    public static boolean l0(Context context, String str) {
        Context contextC = rj.c(context);
        return c.a.b.b.d.s.c.a(contextC).b(str, contextC.getPackageName()) == 0;
    }

    public static void n(Context context, Throwable th) {
        if (context == null) {
            return;
        }
        boolean zBooleanValue = false;
        try {
            zBooleanValue = g2.f3489b.a().booleanValue();
        } catch (IllegalStateException unused) {
        }
        if (zBooleanValue) {
            com.google.android.gms.common.util.i.a(context, th);
        }
    }

    public static boolean n0(@androidx.annotation.i0 View view) {
        if (view == null) {
            return false;
        }
        ViewParent parent = view.getParent();
        while (parent != null && !(parent instanceof ScrollView)) {
            parent = parent.getParent();
        }
        return parent != null;
    }

    private final void o(JSONArray jSONArray, Object obj) throws JSONException {
        Object objG;
        if (obj instanceof Bundle) {
            objG = R((Bundle) obj);
        } else if (obj instanceof Map) {
            objG = e0((Map) obj);
        } else {
            if (!(obj instanceof Collection)) {
                if (!(obj instanceof Object[])) {
                    jSONArray.put(obj);
                    return;
                }
                JSONArray jSONArray2 = new JSONArray();
                for (Object obj2 : (Object[]) obj) {
                    o(jSONArray2, obj2);
                }
                jSONArray.put(jSONArray2);
                return;
            }
            objG = g((Collection) obj);
        }
        jSONArray.put(objG);
    }

    public static String o0(Context context, String str) {
        try {
            return new String(com.google.android.gms.common.util.q.g(context.openFileInput(str), true), "UTF-8");
        } catch (IOException unused) {
            tr.f("Error reading from internal storage.");
            return "";
        }
    }

    private final void p(JSONObject jSONObject, String str, Object obj) throws JSONException {
        Collection<?> collectionAsList;
        Object objG;
        if (obj instanceof Bundle) {
            objG = R((Bundle) obj);
        } else if (obj instanceof Map) {
            objG = e0((Map) obj);
        } else {
            if (obj instanceof Collection) {
                if (str == null) {
                    str = "null";
                }
                collectionAsList = (Collection) obj;
            } else {
                if (!(obj instanceof Object[])) {
                    jSONObject.put(str, obj);
                    return;
                }
                collectionAsList = Arrays.asList((Object[]) obj);
            }
            objG = g(collectionAsList);
        }
        jSONObject.put(str, objG);
    }

    private static String p0() {
        StringBuilder sb = new StringBuilder(256);
        sb.append("Mozilla/5.0 (Linux; U; Android");
        if (Build.VERSION.RELEASE != null) {
            sb.append(" ");
            sb.append(Build.VERSION.RELEASE);
        }
        sb.append("; ");
        sb.append(Locale.getDefault());
        if (Build.DEVICE != null) {
            sb.append("; ");
            sb.append(Build.DEVICE);
            if (Build.DISPLAY != null) {
                sb.append(" Build/");
                sb.append(Build.DISPLAY);
            }
        }
        sb.append(") AppleWebKit/533 Version/4.0 Safari/533");
        return sb.toString();
    }

    public static String q0() {
        return UUID.randomUUID().toString();
    }

    public static String r0() {
        String str = Build.MANUFACTURER;
        String str2 = Build.MODEL;
        if (str2.startsWith(str)) {
            return str2;
        }
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 1 + String.valueOf(str2).length());
        sb.append(str);
        sb.append(" ");
        sb.append(str2);
        return sb.toString();
    }

    private static int[] s0() {
        return new int[]{0, 0};
    }

    private static boolean t(String str, AtomicReference<Pattern> atomicReference, String str2) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        try {
            Pattern patternCompile = atomicReference.get();
            if (patternCompile == null || !str2.equals(patternCompile.pattern())) {
                patternCompile = Pattern.compile(str2);
                atomicReference.set(patternCompile);
            }
            return patternCompile.matcher(str).matches();
        } catch (PatternSyntaxException unused) {
            return false;
        }
    }

    public static String t0() {
        Resources resourcesB = com.google.android.gms.ads.internal.p.g().b();
        return resourcesB != null ? resourcesB.getString(a.C0161a.s7) : "Test Ad";
    }

    @com.google.android.gms.common.util.d0
    protected static String w(Context context) {
        try {
            return new WebView(context).getSettings().getUserAgentString();
        } catch (Throwable unused) {
            return p0();
        }
    }

    public static AlertDialog.Builder x(Context context) {
        return new AlertDialog.Builder(context);
    }

    public static o y(Context context) {
        return new o(context);
    }

    @SuppressLint({"NewApi"})
    public static String z(Context context) {
        List<ActivityManager.RunningTaskInfo> runningTasks;
        ActivityManager.RunningTaskInfo runningTaskInfo;
        try {
            ActivityManager activityManager = (ActivityManager) context.getSystemService("activity");
            if (activityManager != null && (runningTasks = activityManager.getRunningTasks(1)) != null && !runningTasks.isEmpty() && (runningTaskInfo = runningTasks.get(0)) != null && runningTaskInfo.topActivity != null) {
                return runningTaskInfo.topActivity.getClassName();
            }
        } catch (Exception unused) {
        }
        return null;
    }

    public final JSONObject R(Bundle bundle) throws JSONException {
        JSONObject jSONObject = new JSONObject();
        for (String str : bundle.keySet()) {
            p(jSONObject, str, bundle.get(str));
        }
        return jSONObject;
    }

    public final int[] U(Activity activity) {
        int[] r0 = S(activity);
        return new int[]{qx2.a().j(activity, r0[0]), qx2.a().j(activity, r0[1])};
    }

    public final boolean X(String str) {
        return t(str, this.f5426a, (String) qx2.e().c(e0.U));
    }

    public final boolean Y(String str) {
        return t(str, this.f5427b, (String) qx2.e().c(e0.V));
    }

    public final int[] a0(Activity activity) {
        View viewFindViewById;
        Window window = activity.getWindow();
        int[] r4 = (window == null || (viewFindViewById = window.findViewById(R.id.content)) == null) ? s0() : new int[]{viewFindViewById.getTop(), viewFindViewById.getBottom()};
        return new int[]{qx2.a().j(activity, r4[0]), qx2.a().j(activity, r4[1])};
    }

    public final dy1<Map<String, String>> c0(final Uri uri) {
        return qx1.j(qx1.g(null), new ax1(this, uri) { // from class: com.google.android.gms.internal.ads.wo

            /* renamed from: a, reason: collision with root package name */
            private final to f5865a;

            /* renamed from: b, reason: collision with root package name */
            private final Uri f5866b;

            {
                this.f5865a = this;
                this.f5866b = uri;
            }

            @Override // com.google.android.gms.internal.ads.ax1
            public final dy1 a(Object obj) {
                return qx1.g(to.d0(this.f5866b));
            }
        }, cs.f3023a);
    }

    public final JSONObject e0(Map<String, ?> map) throws JSONException {
        try {
            JSONObject jSONObject = new JSONObject();
            for (String str : map.keySet()) {
                p(jSONObject, str, map.get(str));
            }
            return jSONObject;
        } catch (ClassCastException e) {
            String strValueOf = String.valueOf(e.getMessage());
            throw new JSONException(strValueOf.length() != 0 ? "Could not convert map to JSON: ".concat(strValueOf) : new String("Could not convert map to JSON: "));
        }
    }

    public final JSONObject h(@androidx.annotation.i0 Bundle bundle, JSONObject jSONObject) {
        if (bundle != null) {
            try {
                return R(bundle);
            } catch (JSONException e) {
                tr.c("Error converting Bundle to JSON", e);
            }
        }
        return null;
    }

    public final void k(Context context, String str, WebSettings webSettings) {
        webSettings.setUserAgentString(m0(context, str));
    }

    public final void l(Context context, @androidx.annotation.i0 String str, String str2, Bundle bundle, boolean z) {
        com.google.android.gms.ads.internal.p.c();
        bundle.putString("device", r0());
        bundle.putString("eids", TextUtils.join(",", e0.d()));
        qx2.a();
        jr.e(context, str, str2, bundle, true, new xo(this, context, str));
    }

    public final void m(Context context, String str, boolean z, HttpURLConnection httpURLConnection) {
        httpURLConnection.setConnectTimeout(60000);
        httpURLConnection.setInstanceFollowRedirects(false);
        httpURLConnection.setReadTimeout(60000);
        httpURLConnection.setRequestProperty("User-Agent", m0(context, str));
        httpURLConnection.setUseCaches(false);
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x00a4 A[Catch: Exception -> 0x00b3, all -> 0x00cd, TRY_LEAVE, TryCatch #2 {Exception -> 0x00b3, blocks: (B:30:0x009a, B:32:0x00a4), top: B:47:0x009a, outer: #3 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.String m0(android.content.Context r5, java.lang.String r6) {
        /*
            r4 = this;
            java.lang.Object r0 = r4.d
            monitor-enter(r0)
            java.lang.String r1 = r4.e     // Catch: java.lang.Throwable -> Lcd
            if (r1 == 0) goto Lb
            java.lang.String r5 = r4.e     // Catch: java.lang.Throwable -> Lcd
            monitor-exit(r0)     // Catch: java.lang.Throwable -> Lcd
            return r5
        Lb:
            if (r6 != 0) goto L13
            java.lang.String r5 = p0()     // Catch: java.lang.Throwable -> Lcd
            monitor-exit(r0)     // Catch: java.lang.Throwable -> Lcd
            return r5
        L13:
            com.google.android.gms.internal.ads.dp r1 = com.google.android.gms.ads.internal.p.e()     // Catch: java.lang.Exception -> L1d java.lang.Throwable -> Lcd
            java.lang.String r1 = r1.a(r5)     // Catch: java.lang.Exception -> L1d java.lang.Throwable -> Lcd
            r4.e = r1     // Catch: java.lang.Exception -> L1d java.lang.Throwable -> Lcd
        L1d:
            java.lang.String r1 = r4.e     // Catch: java.lang.Throwable -> Lcd
            boolean r1 = android.text.TextUtils.isEmpty(r1)     // Catch: java.lang.Throwable -> Lcd
            if (r1 == 0) goto L6b
            com.google.android.gms.internal.ads.qx2.a()     // Catch: java.lang.Throwable -> Lcd
            boolean r1 = com.google.android.gms.internal.ads.jr.y()     // Catch: java.lang.Throwable -> Lcd
            if (r1 != 0) goto L65
            r1 = 0
            r4.e = r1     // Catch: java.lang.Throwable -> Lcd
            com.google.android.gms.internal.ads.lu1 r1 = com.google.android.gms.internal.ads.to.h     // Catch: java.lang.Throwable -> Lcd
            com.google.android.gms.internal.ads.yo r2 = new com.google.android.gms.internal.ads.yo     // Catch: java.lang.Throwable -> Lcd
            r2.<init>(r4, r5)     // Catch: java.lang.Throwable -> Lcd
            r1.post(r2)     // Catch: java.lang.Throwable -> Lcd
        L3b:
            java.lang.String r1 = r4.e     // Catch: java.lang.Throwable -> Lcd
            if (r1 != 0) goto L6b
            java.lang.Object r1 = r4.d     // Catch: java.lang.InterruptedException -> L45 java.lang.Throwable -> Lcd
            r1.wait()     // Catch: java.lang.InterruptedException -> L45 java.lang.Throwable -> Lcd
            goto L3b
        L45:
            java.lang.String r1 = p0()     // Catch: java.lang.Throwable -> Lcd
            r4.e = r1     // Catch: java.lang.Throwable -> Lcd
            java.lang.String r2 = "Interrupted, use default user agent: "
            java.lang.String r1 = java.lang.String.valueOf(r1)     // Catch: java.lang.Throwable -> Lcd
            int r3 = r1.length()     // Catch: java.lang.Throwable -> Lcd
            if (r3 == 0) goto L5c
            java.lang.String r1 = r2.concat(r1)     // Catch: java.lang.Throwable -> Lcd
            goto L61
        L5c:
            java.lang.String r1 = new java.lang.String     // Catch: java.lang.Throwable -> Lcd
            r1.<init>(r2)     // Catch: java.lang.Throwable -> Lcd
        L61:
            com.google.android.gms.internal.ads.tr.i(r1)     // Catch: java.lang.Throwable -> Lcd
            goto L3b
        L65:
            java.lang.String r1 = w(r5)     // Catch: java.lang.Throwable -> Lcd
            r4.e = r1     // Catch: java.lang.Throwable -> Lcd
        L6b:
            java.lang.String r1 = r4.e     // Catch: java.lang.Throwable -> Lcd
            java.lang.String r1 = java.lang.String.valueOf(r1)     // Catch: java.lang.Throwable -> Lcd
            java.lang.String r2 = java.lang.String.valueOf(r1)     // Catch: java.lang.Throwable -> Lcd
            int r2 = r2.length()     // Catch: java.lang.Throwable -> Lcd
            int r2 = r2 + 10
            java.lang.String r3 = java.lang.String.valueOf(r6)     // Catch: java.lang.Throwable -> Lcd
            int r3 = r3.length()     // Catch: java.lang.Throwable -> Lcd
            int r2 = r2 + r3
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> Lcd
            r3.<init>(r2)     // Catch: java.lang.Throwable -> Lcd
            r3.append(r1)     // Catch: java.lang.Throwable -> Lcd
            java.lang.String r1 = " (Mobile; "
            r3.append(r1)     // Catch: java.lang.Throwable -> Lcd
            r3.append(r6)     // Catch: java.lang.Throwable -> Lcd
            java.lang.String r6 = r3.toString()     // Catch: java.lang.Throwable -> Lcd
            r4.e = r6     // Catch: java.lang.Throwable -> Lcd
            c.a.b.b.d.s.b r5 = c.a.b.b.d.s.c.a(r5)     // Catch: java.lang.Exception -> Lb3 java.lang.Throwable -> Lcd
            boolean r5 = r5.f()     // Catch: java.lang.Exception -> Lb3 java.lang.Throwable -> Lcd
            if (r5 == 0) goto Lbd
            java.lang.String r5 = r4.e     // Catch: java.lang.Exception -> Lb3 java.lang.Throwable -> Lcd
            java.lang.String r5 = java.lang.String.valueOf(r5)     // Catch: java.lang.Exception -> Lb3 java.lang.Throwable -> Lcd
            java.lang.String r6 = ";aia"
            java.lang.String r5 = r5.concat(r6)     // Catch: java.lang.Exception -> Lb3 java.lang.Throwable -> Lcd
            r4.e = r5     // Catch: java.lang.Exception -> Lb3 java.lang.Throwable -> Lcd
            goto Lbd
        Lb3:
            r5 = move-exception
            com.google.android.gms.internal.ads.ao r6 = com.google.android.gms.ads.internal.p.g()     // Catch: java.lang.Throwable -> Lcd
            java.lang.String r1 = "AdUtil.getUserAgent"
            r6.e(r5, r1)     // Catch: java.lang.Throwable -> Lcd
        Lbd:
            java.lang.String r5 = r4.e     // Catch: java.lang.Throwable -> Lcd
            java.lang.String r5 = java.lang.String.valueOf(r5)     // Catch: java.lang.Throwable -> Lcd
            java.lang.String r6 = ")"
            java.lang.String r5 = r5.concat(r6)     // Catch: java.lang.Throwable -> Lcd
            r4.e = r5     // Catch: java.lang.Throwable -> Lcd
            monitor-exit(r0)     // Catch: java.lang.Throwable -> Lcd
            return r5
        Lcd:
            r5 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> Lcd
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.to.m0(android.content.Context, java.lang.String):java.lang.String");
    }

    public final boolean q(View view, Context context) {
        Context applicationContext = context.getApplicationContext();
        return r(view, applicationContext != null ? (PowerManager) applicationContext.getSystemService("power") : null, C(context));
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x001d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean r(android.view.View r4, android.os.PowerManager r5, android.app.KeyguardManager r6) {
        /*
            r3 = this;
            com.google.android.gms.internal.ads.to r0 = com.google.android.gms.ads.internal.p.c()
            boolean r0 = r0.f5428c
            r1 = 1
            r2 = 0
            if (r0 != 0) goto L1d
            if (r6 != 0) goto Le
            r6 = 0
            goto L12
        Le:
            boolean r6 = r6.inKeyguardRestrictedInputMode()
        L12:
            if (r6 == 0) goto L1d
            boolean r6 = j0(r4)
            if (r6 == 0) goto L1b
            goto L1d
        L1b:
            r6 = 0
            goto L1e
        L1d:
            r6 = 1
        L1e:
            int r0 = r4.getVisibility()
            if (r0 != 0) goto L63
            boolean r0 = r4.isShown()
            if (r0 == 0) goto L63
            if (r5 == 0) goto L35
            boolean r5 = r5.isScreenOn()
            if (r5 == 0) goto L33
            goto L35
        L33:
            r5 = 0
            goto L36
        L35:
            r5 = 1
        L36:
            if (r5 == 0) goto L63
            if (r6 == 0) goto L63
            com.google.android.gms.internal.ads.s<java.lang.Boolean> r5 = com.google.android.gms.internal.ads.e0.b1
            com.google.android.gms.internal.ads.z r6 = com.google.android.gms.internal.ads.qx2.e()
            java.lang.Object r5 = r6.c(r5)
            java.lang.Boolean r5 = (java.lang.Boolean) r5
            boolean r5 = r5.booleanValue()
            if (r5 == 0) goto L62
            android.graphics.Rect r5 = new android.graphics.Rect
            r5.<init>()
            boolean r5 = r4.getLocalVisibleRect(r5)
            if (r5 != 0) goto L62
            android.graphics.Rect r5 = new android.graphics.Rect
            r5.<init>()
            boolean r4 = r4.getGlobalVisibleRect(r5)
            if (r4 == 0) goto L63
        L62:
            return r1
        L63:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.to.r(android.view.View, android.os.PowerManager, android.app.KeyguardManager):boolean");
    }

    public final boolean u(Context context) {
        if (this.f) {
            return false;
        }
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("android.intent.action.USER_PRESENT");
        intentFilter.addAction("android.intent.action.SCREEN_OFF");
        context.getApplicationContext().registerReceiver(new ap(this, null), intentFilter);
        this.f = true;
        return true;
    }

    public final boolean v(Context context) {
        if (this.g) {
            return false;
        }
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("com.google.android.ads.intent.DEBUG_LOGGING_ENABLEMENT_CHANGED");
        context.getApplicationContext().registerReceiver(new bp(this, null), intentFilter);
        this.g = true;
        return true;
    }
}

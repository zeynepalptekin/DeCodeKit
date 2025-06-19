package androidx.core.app;

import android.app.Notification;
import android.app.PendingIntent;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.Log;
import android.util.SparseArray;
import androidx.annotation.m0;
import androidx.core.app.p;
import androidx.core.graphics.drawable.IconCompat;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

@m0(16)
/* loaded from: classes.dex */
class s {

    /* renamed from: a, reason: collision with root package name */
    public static final String f341a = "NotificationCompat";

    /* renamed from: b, reason: collision with root package name */
    static final String f342b = "android.support.dataRemoteInputs";

    /* renamed from: c, reason: collision with root package name */
    static final String f343c = "android.support.allowGeneratedReplies";
    private static final String d = "icon";
    private static final String e = "title";
    private static final String f = "actionIntent";
    private static final String g = "extras";
    private static final String h = "remoteInputs";
    private static final String i = "dataOnlyRemoteInputs";
    private static final String j = "resultKey";
    private static final String k = "label";
    private static final String l = "choices";
    private static final String m = "allowFreeFormInput";
    private static final String n = "allowedDataTypes";
    private static final String o = "semanticAction";
    private static final String p = "showsUserInterface";
    private static Field r;
    private static boolean s;
    private static Field u;
    private static Field v;
    private static Field w;
    private static Field x;
    private static boolean y;
    private static final Object q = new Object();
    private static final Object t = new Object();

    private s() {
    }

    public static SparseArray<Bundle> a(List<Bundle> list) {
        int size = list.size();
        SparseArray<Bundle> sparseArray = null;
        for (int r2 = 0; r2 < size; r2++) {
            Bundle bundle = list.get(r2);
            if (bundle != null) {
                if (sparseArray == null) {
                    sparseArray = new SparseArray<>();
                }
                sparseArray.put(r2, bundle);
            }
        }
        return sparseArray;
    }

    private static boolean b() throws NoSuchFieldException, ClassNotFoundException {
        if (y) {
            return false;
        }
        try {
            if (u == null) {
                Class<?> cls = Class.forName("android.app.Notification$Action");
                v = cls.getDeclaredField(d);
                w = cls.getDeclaredField(e);
                x = cls.getDeclaredField(f);
                Field declaredField = Notification.class.getDeclaredField("actions");
                u = declaredField;
                declaredField.setAccessible(true);
            }
        } catch (ClassNotFoundException | NoSuchFieldException e2) {
            Log.e(f341a, "Unable to access notification actions", e2);
            y = true;
        }
        return !y;
    }

    private static w c(Bundle bundle) {
        ArrayList<String> stringArrayList = bundle.getStringArrayList(n);
        HashSet hashSet = new HashSet();
        if (stringArrayList != null) {
            Iterator<String> it = stringArrayList.iterator();
            while (it.hasNext()) {
                hashSet.add(it.next());
            }
        }
        return new w(bundle.getString(j), bundle.getCharSequence(k), bundle.getCharSequenceArray(l), bundle.getBoolean(m), 0, bundle.getBundle(g), hashSet);
    }

    private static w[] d(Bundle[] bundleArr) {
        if (bundleArr == null) {
            return null;
        }
        w[] wVarArr = new w[bundleArr.length];
        for (int r1 = 0; r1 < bundleArr.length; r1++) {
            wVarArr[r1] = c(bundleArr[r1]);
        }
        return wVarArr;
    }

    public static p.b e(Notification notification, int r6) {
        SparseArray sparseParcelableArray;
        synchronized (t) {
            try {
                try {
                    Object[] objArrH = h(notification);
                    if (objArrH != null) {
                        Object obj = objArrH[r6];
                        Bundle bundleK = k(notification);
                        return l(v.getInt(obj), (CharSequence) w.get(obj), (PendingIntent) x.get(obj), (bundleK == null || (sparseParcelableArray = bundleK.getSparseParcelableArray(r.e)) == null) ? null : (Bundle) sparseParcelableArray.get(r6));
                    }
                } catch (IllegalAccessException e2) {
                    Log.e(f341a, "Unable to access notification actions", e2);
                    y = true;
                }
                return null;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public static int f(Notification notification) {
        int length;
        synchronized (t) {
            Object[] objArrH = h(notification);
            length = objArrH != null ? objArrH.length : 0;
        }
        return length;
    }

    static p.b g(Bundle bundle) {
        Bundle bundle2 = bundle.getBundle(g);
        return new p.b(bundle.getInt(d), bundle.getCharSequence(e), (PendingIntent) bundle.getParcelable(f), bundle.getBundle(g), d(i(bundle, h)), d(i(bundle, i)), bundle2 != null ? bundle2.getBoolean(f343c, false) : false, bundle.getInt(o), bundle.getBoolean(p), false);
    }

    private static Object[] h(Notification notification) {
        synchronized (t) {
            if (!b()) {
                return null;
            }
            try {
                return (Object[]) u.get(notification);
            } catch (IllegalAccessException e2) {
                Log.e(f341a, "Unable to access notification actions", e2);
                y = true;
                return null;
            }
        }
    }

    private static Bundle[] i(Bundle bundle, String str) {
        Parcelable[] parcelableArray = bundle.getParcelableArray(str);
        if ((parcelableArray instanceof Bundle[]) || parcelableArray == null) {
            return (Bundle[]) parcelableArray;
        }
        Bundle[] bundleArr = (Bundle[]) Arrays.copyOf(parcelableArray, parcelableArray.length, Bundle[].class);
        bundle.putParcelableArray(str, bundleArr);
        return bundleArr;
    }

    static Bundle j(p.b bVar) {
        Bundle bundle = new Bundle();
        IconCompat iconCompatF = bVar.f();
        bundle.putInt(d, iconCompatF != null ? iconCompatF.t() : 0);
        bundle.putCharSequence(e, bVar.j());
        bundle.putParcelable(f, bVar.a());
        Bundle bundle2 = bVar.d() != null ? new Bundle(bVar.d()) : new Bundle();
        bundle2.putBoolean(f343c, bVar.b());
        bundle.putBundle(g, bundle2);
        bundle.putParcelableArray(h, n(bVar.g()));
        bundle.putBoolean(p, bVar.i());
        bundle.putInt(o, bVar.h());
        return bundle;
    }

    public static Bundle k(Notification notification) {
        String str;
        String str2;
        synchronized (q) {
            if (s) {
                return null;
            }
            try {
                if (r == null) {
                    Field declaredField = Notification.class.getDeclaredField(g);
                    if (!Bundle.class.isAssignableFrom(declaredField.getType())) {
                        Log.e(f341a, "Notification.extras field is not of type Bundle");
                        s = true;
                        return null;
                    }
                    declaredField.setAccessible(true);
                    r = declaredField;
                }
                Bundle bundle = (Bundle) r.get(notification);
                if (bundle == null) {
                    bundle = new Bundle();
                    r.set(notification, bundle);
                }
                return bundle;
            } catch (IllegalAccessException e2) {
                e = e2;
                str = f341a;
                str2 = "Unable to access notification extras";
                Log.e(str, str2, e);
                s = true;
                return null;
            } catch (NoSuchFieldException e3) {
                e = e3;
                str = f341a;
                str2 = "Unable to access notification extras";
                Log.e(str, str2, e);
                s = true;
                return null;
            }
        }
    }

    public static p.b l(int r12, CharSequence charSequence, PendingIntent pendingIntent, Bundle bundle) {
        w[] wVarArrD;
        w[] wVarArrD2;
        boolean z;
        if (bundle != null) {
            wVarArrD = d(i(bundle, r.f));
            wVarArrD2 = d(i(bundle, f342b));
            z = bundle.getBoolean(f343c);
        } else {
            wVarArrD = null;
            wVarArrD2 = null;
            z = false;
        }
        return new p.b(r12, charSequence, pendingIntent, bundle, wVarArrD, wVarArrD2, z, 0, true, false);
    }

    private static Bundle m(w wVar) {
        Bundle bundle = new Bundle();
        bundle.putString(j, wVar.n());
        bundle.putCharSequence(k, wVar.m());
        bundle.putCharSequenceArray(l, wVar.g());
        bundle.putBoolean(m, wVar.e());
        bundle.putBundle(g, wVar.l());
        Set<String> setF = wVar.f();
        if (setF != null && !setF.isEmpty()) {
            ArrayList<String> arrayList = new ArrayList<>(setF.size());
            Iterator<String> it = setF.iterator();
            while (it.hasNext()) {
                arrayList.add(it.next());
            }
            bundle.putStringArrayList(n, arrayList);
        }
        return bundle;
    }

    private static Bundle[] n(w[] wVarArr) {
        if (wVarArr == null) {
            return null;
        }
        Bundle[] bundleArr = new Bundle[wVarArr.length];
        for (int r1 = 0; r1 < wVarArr.length; r1++) {
            bundleArr[r1] = m(wVarArr[r1]);
        }
        return bundleArr;
    }

    public static Bundle o(Notification.Builder builder, p.b bVar) {
        IconCompat iconCompatF = bVar.f();
        builder.addAction(iconCompatF != null ? iconCompatF.t() : 0, bVar.j(), bVar.a());
        Bundle bundle = new Bundle(bVar.d());
        if (bVar.g() != null) {
            bundle.putParcelableArray(r.f, n(bVar.g()));
        }
        if (bVar.c() != null) {
            bundle.putParcelableArray(f342b, n(bVar.c()));
        }
        bundle.putBoolean(f343c, bVar.b());
        return bundle;
    }
}

package androidx.browser.browseractions;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ResolveInfo;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import androidx.annotation.h0;
import androidx.annotation.p0;
import androidx.annotation.x0;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* loaded from: classes.dex */
public class e {

    /* renamed from: b, reason: collision with root package name */
    private static final String f228b = "BrowserActions";

    /* renamed from: c, reason: collision with root package name */
    private static final String f229c = "https://www.example.com";
    public static final String d = "androidx.browser.browseractions.APP_ID";
    public static final String e = "androidx.browser.browseractions.browser_action_open";
    public static final String f = "androidx.browser.browseractions.ICON_ID";
    public static final String g = "androidx.browser.browseractions.TITLE";
    public static final String h = "androidx.browser.browseractions.ACTION";
    public static final String i = "androidx.browser.browseractions.extra.TYPE";
    public static final String j = "androidx.browser.browseractions.extra.MENU_ITEMS";
    public static final String k = "androidx.browser.browseractions.extra.SELECTED_ACTION_PENDING_INTENT";
    public static final int l = 5;
    public static final int m = 0;
    public static final int n = 1;
    public static final int o = 2;
    public static final int p = 3;
    public static final int q = 4;
    public static final int r = 5;
    public static final int s = -1;
    public static final int t = 0;
    public static final int u = 1;
    public static final int v = 2;
    public static final int w = 3;
    public static final int x = 4;
    private static a y;

    /* renamed from: a, reason: collision with root package name */
    @h0
    private final Intent f230a;

    @p0({p0.a.LIBRARY_GROUP})
    @x0
    interface a {
        void a();
    }

    @Retention(RetentionPolicy.SOURCE)
    @p0({p0.a.LIBRARY_GROUP})
    public @interface b {
    }

    @Retention(RetentionPolicy.SOURCE)
    @p0({p0.a.LIBRARY_GROUP})
    public @interface c {
    }

    public static final class d {

        /* renamed from: b, reason: collision with root package name */
        private Context f232b;

        /* renamed from: c, reason: collision with root package name */
        private Uri f233c;
        private ArrayList<Bundle> e;

        /* renamed from: a, reason: collision with root package name */
        private final Intent f231a = new Intent(e.e);
        private PendingIntent f = null;
        private int d = 0;

        public d(Context context, Uri uri) {
            this.e = null;
            this.f232b = context;
            this.f233c = uri;
            this.e = new ArrayList<>();
        }

        private Bundle b(androidx.browser.browseractions.a aVar) {
            Bundle bundle = new Bundle();
            bundle.putString(e.g, aVar.c());
            bundle.putParcelable(e.h, aVar.a());
            if (aVar.b() != 0) {
                bundle.putInt(e.f, aVar.b());
            }
            return bundle;
        }

        public e a() {
            this.f231a.setData(this.f233c);
            this.f231a.putExtra(e.i, this.d);
            this.f231a.putParcelableArrayListExtra(e.j, this.e);
            this.f231a.putExtra(e.d, PendingIntent.getActivity(this.f232b, 0, new Intent(), 0));
            PendingIntent pendingIntent = this.f;
            if (pendingIntent != null) {
                this.f231a.putExtra(e.k, pendingIntent);
            }
            return new e(this.f231a);
        }

        public d c(ArrayList<androidx.browser.browseractions.a> arrayList) {
            if (arrayList.size() > 5) {
                throw new IllegalStateException("Exceeded maximum toolbar item count of 5");
            }
            for (int r0 = 0; r0 < arrayList.size(); r0++) {
                if (TextUtils.isEmpty(arrayList.get(r0).c()) || arrayList.get(r0).a() == null) {
                    throw new IllegalArgumentException("Custom item should contain a non-empty title and non-null intent.");
                }
                this.e.add(b(arrayList.get(r0)));
            }
            return this;
        }

        public d d(androidx.browser.browseractions.a... aVarArr) {
            return c(new ArrayList<>(Arrays.asList(aVarArr)));
        }

        public d e(PendingIntent pendingIntent) {
            this.f = pendingIntent;
            return this;
        }

        public d f(int r1) {
            this.d = r1;
            return this;
        }
    }

    e(@h0 Intent intent) {
        this.f230a = intent;
    }

    private static List<ResolveInfo> a(Context context) {
        return context.getPackageManager().queryIntentActivities(new Intent(e, Uri.parse(f229c)), 131072);
    }

    public static String b(Intent intent) {
        PendingIntent pendingIntent = (PendingIntent) intent.getParcelableExtra(d);
        if (pendingIntent != null) {
            return Build.VERSION.SDK_INT >= 17 ? pendingIntent.getCreatorPackage() : pendingIntent.getTargetPackage();
        }
        return null;
    }

    public static void d(Context context, Intent intent) {
        e(context, intent, a(context));
    }

    @p0({p0.a.LIBRARY_GROUP})
    @x0
    static void e(Context context, Intent intent, List<ResolveInfo> list) {
        if (list == null || list.size() == 0) {
            h(context, intent);
            return;
        }
        int r1 = 0;
        if (list.size() == 1) {
            intent.setPackage(list.get(0).activityInfo.packageName);
        } else {
            ResolveInfo resolveInfoResolveActivity = context.getPackageManager().resolveActivity(new Intent("android.intent.action.VIEW", Uri.parse(f229c)), 65536);
            if (resolveInfoResolveActivity != null) {
                String str = resolveInfoResolveActivity.activityInfo.packageName;
                while (true) {
                    if (r1 >= list.size()) {
                        break;
                    }
                    if (str.equals(list.get(r1).activityInfo.packageName)) {
                        intent.setPackage(str);
                        break;
                    }
                    r1++;
                }
            }
        }
        b.i.c.c.s(context, intent, null);
    }

    public static void f(Context context, Uri uri) {
        d(context, new d(context, uri).a().c());
    }

    public static void g(Context context, Uri uri, int r3, ArrayList<androidx.browser.browseractions.a> arrayList, PendingIntent pendingIntent) {
        d(context, new d(context, uri).f(r3).c(arrayList).e(pendingIntent).a().c());
    }

    private static void h(Context context, Intent intent) {
        Uri data = intent.getData();
        int intExtra = intent.getIntExtra(i, 0);
        ArrayList parcelableArrayListExtra = intent.getParcelableArrayListExtra(j);
        i(context, data, intExtra, parcelableArrayListExtra != null ? j(parcelableArrayListExtra) : null);
    }

    private static void i(Context context, Uri uri, int r2, List<androidx.browser.browseractions.a> list) {
        new androidx.browser.browseractions.d(context, uri, list).a();
        a aVar = y;
        if (aVar != null) {
            aVar.a();
        }
    }

    public static List<androidx.browser.browseractions.a> j(ArrayList<Bundle> arrayList) {
        ArrayList arrayList2 = new ArrayList();
        for (int r1 = 0; r1 < arrayList.size(); r1++) {
            Bundle bundle = arrayList.get(r1);
            String string = bundle.getString(g);
            PendingIntent pendingIntent = (PendingIntent) bundle.getParcelable(h);
            int r2 = bundle.getInt(f);
            if (TextUtils.isEmpty(string) || pendingIntent == null) {
                throw new IllegalArgumentException("Custom item should contain a non-empty title and non-null intent.");
            }
            arrayList2.add(new androidx.browser.browseractions.a(string, pendingIntent, r2));
        }
        return arrayList2;
    }

    @p0({p0.a.LIBRARY_GROUP})
    @x0
    static void k(a aVar) {
        y = aVar;
    }

    @h0
    public Intent c() {
        return this.f230a;
    }
}

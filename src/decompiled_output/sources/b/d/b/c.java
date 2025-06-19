package b.d.b;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Bundle;
import android.widget.RemoteViews;
import androidx.annotation.h0;
import androidx.annotation.i0;
import androidx.annotation.k;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;

/* loaded from: classes.dex */
public final class c {
    public static final String A = "android.support.customtabs.customaction.ID";
    public static final int B = 0;
    private static final int C = 5;

    /* renamed from: c, reason: collision with root package name */
    private static final String f858c = "android.support.customtabs.extra.user_opt_out";
    public static final String d = "android.support.customtabs.extra.SESSION";
    public static final String e = "android.support.customtabs.extra.TOOLBAR_COLOR";
    public static final String f = "android.support.customtabs.extra.ENABLE_URLBAR_HIDING";
    public static final String g = "android.support.customtabs.extra.CLOSE_BUTTON_ICON";
    public static final String h = "android.support.customtabs.extra.TITLE_VISIBILITY";
    public static final int i = 0;
    public static final int j = 1;
    public static final String k = "android.support.customtabs.extra.ACTION_BUTTON_BUNDLE";
    public static final String l = "android.support.customtabs.extra.TOOLBAR_ITEMS";
    public static final String m = "android.support.customtabs.extra.SECONDARY_TOOLBAR_COLOR";
    public static final String n = "android.support.customtabs.customaction.ICON";
    public static final String o = "android.support.customtabs.customaction.DESCRIPTION";
    public static final String p = "android.support.customtabs.customaction.PENDING_INTENT";
    public static final String q = "android.support.customtabs.extra.TINT_ACTION_BUTTON";
    public static final String r = "android.support.customtabs.extra.MENU_ITEMS";
    public static final String s = "android.support.customtabs.customaction.MENU_ITEM_TITLE";
    public static final String t = "android.support.customtabs.extra.EXIT_ANIMATION_BUNDLE";
    public static final String u = "android.support.customtabs.extra.SHARE_MENU_ITEM";
    public static final String v = "android.support.customtabs.extra.EXTRA_REMOTEVIEWS";
    public static final String w = "android.support.customtabs.extra.EXTRA_REMOTEVIEWS_VIEW_IDS";
    public static final String x = "android.support.customtabs.extra.EXTRA_REMOTEVIEWS_PENDINGINTENT";
    public static final String y = "android.support.customtabs.extra.EXTRA_REMOTEVIEWS_CLICKED_ID";
    public static final String z = "android.support.customtabs.extra.EXTRA_ENABLE_INSTANT_APPS";

    /* renamed from: a, reason: collision with root package name */
    @h0
    public final Intent f859a;

    /* renamed from: b, reason: collision with root package name */
    @i0
    public final Bundle f860b;

    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        private final Intent f861a;

        /* renamed from: b, reason: collision with root package name */
        private ArrayList<Bundle> f862b;

        /* renamed from: c, reason: collision with root package name */
        private Bundle f863c;
        private ArrayList<Bundle> d;
        private boolean e;

        public a() {
            this(null);
        }

        public a(@i0 f fVar) throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
            Intent intent = new Intent("android.intent.action.VIEW");
            this.f861a = intent;
            this.f862b = null;
            this.f863c = null;
            this.d = null;
            this.e = true;
            if (fVar != null) {
                intent.setPackage(fVar.c().getPackageName());
            }
            Bundle bundle = new Bundle();
            androidx.core.app.i.b(bundle, c.d, fVar != null ? fVar.b() : null);
            this.f861a.putExtras(bundle);
        }

        public a a() {
            this.f861a.putExtra(c.u, true);
            return this;
        }

        public a b(@h0 String str, @h0 PendingIntent pendingIntent) {
            if (this.f862b == null) {
                this.f862b = new ArrayList<>();
            }
            Bundle bundle = new Bundle();
            bundle.putString(c.s, str);
            bundle.putParcelable(c.p, pendingIntent);
            this.f862b.add(bundle);
            return this;
        }

        @Deprecated
        public a c(int r3, @h0 Bitmap bitmap, @h0 String str, PendingIntent pendingIntent) throws IllegalStateException {
            if (this.d == null) {
                this.d = new ArrayList<>();
            }
            if (this.d.size() >= 5) {
                throw new IllegalStateException("Exceeded maximum toolbar item count of 5");
            }
            Bundle bundle = new Bundle();
            bundle.putInt(c.A, r3);
            bundle.putParcelable(c.n, bitmap);
            bundle.putString(c.o, str);
            bundle.putParcelable(c.p, pendingIntent);
            this.d.add(bundle);
            return this;
        }

        public c d() {
            ArrayList<Bundle> arrayList = this.f862b;
            if (arrayList != null) {
                this.f861a.putParcelableArrayListExtra(c.r, arrayList);
            }
            ArrayList<Bundle> arrayList2 = this.d;
            if (arrayList2 != null) {
                this.f861a.putParcelableArrayListExtra(c.l, arrayList2);
            }
            this.f861a.putExtra(c.z, this.e);
            return new c(this.f861a, this.f863c);
        }

        public a e() {
            this.f861a.putExtra(c.f, true);
            return this;
        }

        public a f(@h0 Bitmap bitmap, @h0 String str, @h0 PendingIntent pendingIntent) {
            return g(bitmap, str, pendingIntent, false);
        }

        public a g(@h0 Bitmap bitmap, @h0 String str, @h0 PendingIntent pendingIntent, boolean z) {
            Bundle bundle = new Bundle();
            bundle.putInt(c.A, 0);
            bundle.putParcelable(c.n, bitmap);
            bundle.putString(c.o, str);
            bundle.putParcelable(c.p, pendingIntent);
            this.f861a.putExtra(c.k, bundle);
            this.f861a.putExtra(c.q, z);
            return this;
        }

        public a h(@h0 Bitmap bitmap) {
            this.f861a.putExtra(c.g, bitmap);
            return this;
        }

        public a i(@h0 Context context, @androidx.annotation.a int r2, @androidx.annotation.a int r3) {
            this.f861a.putExtra(c.t, androidx.core.app.c.d(context, r2, r3).l());
            return this;
        }

        public a j(boolean z) {
            this.e = z;
            return this;
        }

        public a k(@k int r3) {
            this.f861a.putExtra(c.m, r3);
            return this;
        }

        public a l(@h0 RemoteViews remoteViews, @i0 int[] r4, @i0 PendingIntent pendingIntent) {
            this.f861a.putExtra(c.v, remoteViews);
            this.f861a.putExtra(c.w, r4);
            this.f861a.putExtra(c.x, pendingIntent);
            return this;
        }

        public a m(boolean z) {
            this.f861a.putExtra(c.h, z ? 1 : 0);
            return this;
        }

        public a n(@h0 Context context, @androidx.annotation.a int r2, @androidx.annotation.a int r3) {
            this.f863c = androidx.core.app.c.d(context, r2, r3).l();
            return this;
        }

        public a o(@k int r3) {
            this.f861a.putExtra(c.e, r3);
            return this;
        }
    }

    c(Intent intent, Bundle bundle) {
        this.f859a = intent;
        this.f860b = bundle;
    }

    public static int a() {
        return 5;
    }

    public static Intent c(Intent intent) {
        if (intent == null) {
            intent = new Intent("android.intent.action.VIEW");
        }
        intent.addFlags(268435456);
        intent.putExtra(f858c, true);
        return intent;
    }

    public static boolean d(Intent intent) {
        return intent.getBooleanExtra(f858c, false) && (intent.getFlags() & 268435456) != 0;
    }

    public void b(Context context, Uri uri) {
        this.f859a.setData(uri);
        b.i.c.c.s(context, this.f859a, this.f860b);
    }
}

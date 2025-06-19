package androidx.core.app;

import android.app.Activity;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Build;
import android.text.Html;
import android.text.Spanned;
import android.util.Log;
import android.view.ActionProvider;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ShareActionProvider;
import androidx.annotation.h0;
import androidx.annotation.i0;
import androidx.annotation.s0;
import java.util.ArrayList;

/* loaded from: classes.dex */
public final class y {

    /* renamed from: a, reason: collision with root package name */
    public static final String f373a = "androidx.core.app.EXTRA_CALLING_PACKAGE";

    /* renamed from: b, reason: collision with root package name */
    public static final String f374b = "android.support.v4.app.EXTRA_CALLING_PACKAGE";

    /* renamed from: c, reason: collision with root package name */
    public static final String f375c = "androidx.core.app.EXTRA_CALLING_ACTIVITY";
    public static final String d = "android.support.v4.app.EXTRA_CALLING_ACTIVITY";
    private static final String e = ".sharecompat_";

    public static class a {

        /* renamed from: a, reason: collision with root package name */
        @h0
        private final Context f376a;

        /* renamed from: b, reason: collision with root package name */
        @h0
        private final Intent f377b;

        /* renamed from: c, reason: collision with root package name */
        @i0
        private CharSequence f378c;

        @i0
        private ArrayList<String> d;

        @i0
        private ArrayList<String> e;

        @i0
        private ArrayList<String> f;

        @i0
        private ArrayList<Uri> g;

        private a(@h0 Context context, @i0 ComponentName componentName) {
            this.f376a = (Context) b.i.o.i.f(context);
            Intent action = new Intent().setAction("android.intent.action.SEND");
            this.f377b = action;
            action.putExtra(y.f373a, context.getPackageName());
            this.f377b.putExtra(y.f374b, context.getPackageName());
            this.f377b.putExtra(y.f375c, componentName);
            this.f377b.putExtra(y.d, componentName);
            this.f377b.addFlags(524288);
        }

        private void h(String str, ArrayList<String> arrayList) {
            String[] stringArrayExtra = this.f377b.getStringArrayExtra(str);
            int length = stringArrayExtra != null ? stringArrayExtra.length : 0;
            String[] strArr = new String[arrayList.size() + length];
            arrayList.toArray(strArr);
            if (stringArrayExtra != null) {
                System.arraycopy(stringArrayExtra, 0, strArr, arrayList.size(), length);
            }
            this.f377b.putExtra(str, strArr);
        }

        private void i(@i0 String str, @h0 String[] strArr) {
            Intent intentN = n();
            String[] stringArrayExtra = intentN.getStringArrayExtra(str);
            int length = stringArrayExtra != null ? stringArrayExtra.length : 0;
            String[] strArr2 = new String[strArr.length + length];
            if (stringArrayExtra != null) {
                System.arraycopy(stringArrayExtra, 0, strArr2, 0, length);
            }
            System.arraycopy(strArr, 0, strArr2, length, strArr.length);
            intentN.putExtra(str, strArr2);
        }

        @h0
        public static a k(@h0 Activity activity) {
            return l((Context) b.i.o.i.f(activity), activity.getComponentName());
        }

        @h0
        private static a l(@h0 Context context, @i0 ComponentName componentName) {
            return new a(context, componentName);
        }

        @h0
        public a a(@h0 String str) {
            if (this.f == null) {
                this.f = new ArrayList<>();
            }
            this.f.add(str);
            return this;
        }

        @h0
        public a b(@h0 String[] strArr) {
            i("android.intent.extra.BCC", strArr);
            return this;
        }

        @h0
        public a c(@h0 String str) {
            if (this.e == null) {
                this.e = new ArrayList<>();
            }
            this.e.add(str);
            return this;
        }

        @h0
        public a d(@h0 String[] strArr) {
            i("android.intent.extra.CC", strArr);
            return this;
        }

        @h0
        public a e(@h0 String str) {
            if (this.d == null) {
                this.d = new ArrayList<>();
            }
            this.d.add(str);
            return this;
        }

        @h0
        public a f(@h0 String[] strArr) {
            i("android.intent.extra.EMAIL", strArr);
            return this;
        }

        @h0
        public a g(@h0 Uri uri) {
            Uri uri2 = (Uri) this.f377b.getParcelableExtra("android.intent.extra.STREAM");
            if (this.g == null && uri2 == null) {
                return u(uri);
            }
            if (this.g == null) {
                this.g = new ArrayList<>();
            }
            if (uri2 != null) {
                this.f377b.removeExtra("android.intent.extra.STREAM");
                this.g.add(uri2);
            }
            this.g.add(uri);
            return this;
        }

        @h0
        public Intent j() {
            return Intent.createChooser(n(), this.f378c);
        }

        @h0
        Context m() {
            return this.f376a;
        }

        @h0
        public Intent n() {
            ArrayList<String> arrayList = this.d;
            if (arrayList != null) {
                h("android.intent.extra.EMAIL", arrayList);
                this.d = null;
            }
            ArrayList<String> arrayList2 = this.e;
            if (arrayList2 != null) {
                h("android.intent.extra.CC", arrayList2);
                this.e = null;
            }
            ArrayList<String> arrayList3 = this.f;
            if (arrayList3 != null) {
                h("android.intent.extra.BCC", arrayList3);
                this.f = null;
            }
            ArrayList<Uri> arrayList4 = this.g;
            boolean z = arrayList4 != null && arrayList4.size() > 1;
            boolean zEquals = "android.intent.action.SEND_MULTIPLE".equals(this.f377b.getAction());
            if (!z && zEquals) {
                this.f377b.setAction("android.intent.action.SEND");
                ArrayList<Uri> arrayList5 = this.g;
                if (arrayList5 == null || arrayList5.isEmpty()) {
                    this.f377b.removeExtra("android.intent.extra.STREAM");
                } else {
                    this.f377b.putExtra("android.intent.extra.STREAM", this.g.get(0));
                }
                this.g = null;
            }
            if (z && !zEquals) {
                this.f377b.setAction("android.intent.action.SEND_MULTIPLE");
                ArrayList<Uri> arrayList6 = this.g;
                if (arrayList6 == null || arrayList6.isEmpty()) {
                    this.f377b.removeExtra("android.intent.extra.STREAM");
                } else {
                    this.f377b.putParcelableArrayListExtra("android.intent.extra.STREAM", this.g);
                }
            }
            return this.f377b;
        }

        @h0
        public a o(@s0 int r2) {
            return p(this.f376a.getText(r2));
        }

        @h0
        public a p(@i0 CharSequence charSequence) {
            this.f378c = charSequence;
            return this;
        }

        @h0
        public a q(@i0 String[] strArr) {
            this.f377b.putExtra("android.intent.extra.BCC", strArr);
            return this;
        }

        @h0
        public a r(@i0 String[] strArr) {
            this.f377b.putExtra("android.intent.extra.CC", strArr);
            return this;
        }

        @h0
        public a s(@i0 String[] strArr) {
            if (this.d != null) {
                this.d = null;
            }
            this.f377b.putExtra("android.intent.extra.EMAIL", strArr);
            return this;
        }

        @h0
        public a t(@i0 String str) {
            this.f377b.putExtra(b.i.c.e.f969a, str);
            if (!this.f377b.hasExtra("android.intent.extra.TEXT")) {
                w(Html.fromHtml(str));
            }
            return this;
        }

        @h0
        public a u(@i0 Uri uri) {
            if (!"android.intent.action.SEND".equals(this.f377b.getAction())) {
                this.f377b.setAction("android.intent.action.SEND");
            }
            this.g = null;
            this.f377b.putExtra("android.intent.extra.STREAM", uri);
            return this;
        }

        @h0
        public a v(@i0 String str) {
            this.f377b.putExtra("android.intent.extra.SUBJECT", str);
            return this;
        }

        @h0
        public a w(@i0 CharSequence charSequence) {
            this.f377b.putExtra("android.intent.extra.TEXT", charSequence);
            return this;
        }

        @h0
        public a x(@i0 String str) {
            this.f377b.setType(str);
            return this;
        }

        public void y() {
            this.f376a.startActivity(j());
        }
    }

    public static class b {
        private static final String f = "IntentReader";

        /* renamed from: a, reason: collision with root package name */
        @h0
        private final Context f379a;

        /* renamed from: b, reason: collision with root package name */
        @h0
        private final Intent f380b;

        /* renamed from: c, reason: collision with root package name */
        @i0
        private final String f381c;

        @i0
        private final ComponentName d;

        @i0
        private ArrayList<Uri> e;

        private b(@h0 Context context, @h0 Intent intent) {
            this.f379a = (Context) b.i.o.i.f(context);
            this.f380b = (Intent) b.i.o.i.f(intent);
            this.f381c = y.f(intent);
            this.d = y.d(intent);
        }

        @h0
        public static b a(@h0 Activity activity) {
            return b((Context) b.i.o.i.f(activity), activity.getIntent());
        }

        @h0
        private static b b(@h0 Context context, @h0 Intent intent) {
            return new b(context, intent);
        }

        private static void u(StringBuilder sb, CharSequence charSequence, int r5, int r6) {
            String str;
            while (r5 < r6) {
                char cCharAt = charSequence.charAt(r5);
                if (cCharAt == '<') {
                    str = "&lt;";
                } else if (cCharAt == '>') {
                    str = "&gt;";
                } else if (cCharAt == '&') {
                    str = "&amp;";
                } else if (cCharAt > '~' || cCharAt < ' ') {
                    sb.append("&#");
                    sb.append((int) cCharAt);
                    str = ";";
                } else {
                    if (cCharAt == ' ') {
                        while (true) {
                            int r0 = r5 + 1;
                            if (r0 >= r6 || charSequence.charAt(r0) != ' ') {
                                break;
                            }
                            sb.append("&nbsp;");
                            r5 = r0;
                        }
                        sb.append(' ');
                    } else {
                        sb.append(cCharAt);
                    }
                    r5++;
                }
                sb.append(str);
                r5++;
            }
        }

        @i0
        public ComponentName c() {
            return this.d;
        }

        @i0
        public Drawable d() {
            if (this.d == null) {
                return null;
            }
            try {
                return this.f379a.getPackageManager().getActivityIcon(this.d);
            } catch (PackageManager.NameNotFoundException e) {
                Log.e(f, "Could not retrieve icon for calling activity", e);
                return null;
            }
        }

        @i0
        public Drawable e() {
            if (this.f381c == null) {
                return null;
            }
            try {
                return this.f379a.getPackageManager().getApplicationIcon(this.f381c);
            } catch (PackageManager.NameNotFoundException e) {
                Log.e(f, "Could not retrieve icon for calling application", e);
                return null;
            }
        }

        @i0
        public CharSequence f() {
            if (this.f381c == null) {
                return null;
            }
            PackageManager packageManager = this.f379a.getPackageManager();
            try {
                return packageManager.getApplicationLabel(packageManager.getApplicationInfo(this.f381c, 0));
            } catch (PackageManager.NameNotFoundException e) {
                Log.e(f, "Could not retrieve label for calling application", e);
                return null;
            }
        }

        @i0
        public String g() {
            return this.f381c;
        }

        @i0
        public String[] h() {
            return this.f380b.getStringArrayExtra("android.intent.extra.BCC");
        }

        @i0
        public String[] i() {
            return this.f380b.getStringArrayExtra("android.intent.extra.CC");
        }

        @i0
        public String[] j() {
            return this.f380b.getStringArrayExtra("android.intent.extra.EMAIL");
        }

        @i0
        public String k() {
            String stringExtra = this.f380b.getStringExtra(b.i.c.e.f969a);
            if (stringExtra != null) {
                return stringExtra;
            }
            CharSequence charSequenceP = p();
            if (charSequenceP instanceof Spanned) {
                return Html.toHtml((Spanned) charSequenceP);
            }
            if (charSequenceP == null) {
                return stringExtra;
            }
            if (Build.VERSION.SDK_INT >= 16) {
                return Html.escapeHtml(charSequenceP);
            }
            StringBuilder sb = new StringBuilder();
            u(sb, charSequenceP, 0, charSequenceP.length());
            return sb.toString();
        }

        @i0
        public Uri l() {
            return (Uri) this.f380b.getParcelableExtra("android.intent.extra.STREAM");
        }

        @i0
        public Uri m(int r4) {
            Object parcelableExtra;
            if (this.e == null && r()) {
                this.e = this.f380b.getParcelableArrayListExtra("android.intent.extra.STREAM");
            }
            ArrayList<Uri> arrayList = this.e;
            if (arrayList != null) {
                parcelableExtra = arrayList.get(r4);
            } else {
                if (r4 != 0) {
                    throw new IndexOutOfBoundsException("Stream items available: " + n() + " index requested: " + r4);
                }
                parcelableExtra = this.f380b.getParcelableExtra("android.intent.extra.STREAM");
            }
            return (Uri) parcelableExtra;
        }

        public int n() {
            if (this.e == null && r()) {
                this.e = this.f380b.getParcelableArrayListExtra("android.intent.extra.STREAM");
            }
            ArrayList<Uri> arrayList = this.e;
            return arrayList != null ? arrayList.size() : this.f380b.hasExtra("android.intent.extra.STREAM") ? 1 : 0;
        }

        @i0
        public String o() {
            return this.f380b.getStringExtra("android.intent.extra.SUBJECT");
        }

        @i0
        public CharSequence p() {
            return this.f380b.getCharSequenceExtra("android.intent.extra.TEXT");
        }

        @i0
        public String q() {
            return this.f380b.getType();
        }

        public boolean r() {
            return "android.intent.action.SEND_MULTIPLE".equals(this.f380b.getAction());
        }

        public boolean s() {
            String action = this.f380b.getAction();
            return "android.intent.action.SEND".equals(action) || "android.intent.action.SEND_MULTIPLE".equals(action);
        }

        public boolean t() {
            return "android.intent.action.SEND".equals(this.f380b.getAction());
        }
    }

    private y() {
    }

    public static void a(@h0 Menu menu, @androidx.annotation.w int r2, @h0 a aVar) {
        MenuItem menuItemFindItem = menu.findItem(r2);
        if (menuItemFindItem != null) {
            b(menuItemFindItem, aVar);
            return;
        }
        throw new IllegalArgumentException("Could not find menu item with id " + r2 + " in the supplied menu");
    }

    public static void b(@h0 MenuItem menuItem, @h0 a aVar) {
        ActionProvider actionProvider = menuItem.getActionProvider();
        ShareActionProvider shareActionProvider = !(actionProvider instanceof ShareActionProvider) ? new ShareActionProvider(aVar.m()) : (ShareActionProvider) actionProvider;
        shareActionProvider.setShareHistoryFileName(e + aVar.m().getClass().getName());
        shareActionProvider.setShareIntent(aVar.n());
        menuItem.setActionProvider(shareActionProvider);
        if (Build.VERSION.SDK_INT >= 16 || menuItem.hasSubMenu()) {
            return;
        }
        menuItem.setIntent(aVar.j());
    }

    @i0
    public static ComponentName c(@h0 Activity activity) {
        Intent intent = activity.getIntent();
        ComponentName callingActivity = activity.getCallingActivity();
        return callingActivity == null ? d(intent) : callingActivity;
    }

    @i0
    static ComponentName d(@h0 Intent intent) {
        ComponentName componentName = (ComponentName) intent.getParcelableExtra(f375c);
        return componentName == null ? (ComponentName) intent.getParcelableExtra(d) : componentName;
    }

    @i0
    public static String e(@h0 Activity activity) {
        Intent intent = activity.getIntent();
        String callingPackage = activity.getCallingPackage();
        return (callingPackage != null || intent == null) ? callingPackage : f(intent);
    }

    @i0
    static String f(@h0 Intent intent) {
        String stringExtra = intent.getStringExtra(f373a);
        return stringExtra == null ? intent.getStringExtra(f374b) : stringExtra;
    }
}

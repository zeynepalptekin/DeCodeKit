package androidx.core.app;

import android.app.RemoteInput;
import android.content.ClipData;
import android.content.ClipDescription;
import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import androidx.annotation.h0;
import androidx.annotation.i0;
import androidx.annotation.m0;
import androidx.annotation.p0;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/* loaded from: classes.dex */
public final class w {
    private static final String h = "RemoteInput";
    public static final String i = "android.remoteinput.results";
    public static final String j = "android.remoteinput.resultsData";
    private static final String k = "android.remoteinput.dataTypeResultsData";
    private static final String l = "android.remoteinput.resultsSource";
    public static final int m = 0;
    public static final int n = 1;
    public static final int o = 0;
    public static final int p = 1;
    public static final int q = 2;

    /* renamed from: a, reason: collision with root package name */
    private final String f364a;

    /* renamed from: b, reason: collision with root package name */
    private final CharSequence f365b;

    /* renamed from: c, reason: collision with root package name */
    private final CharSequence[] f366c;
    private final boolean d;
    private final int e;
    private final Bundle f;
    private final Set<String> g;

    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        private final String f367a;
        private CharSequence d;
        private CharSequence[] e;

        /* renamed from: b, reason: collision with root package name */
        private final Set<String> f368b = new HashSet();

        /* renamed from: c, reason: collision with root package name */
        private final Bundle f369c = new Bundle();
        private boolean f = true;
        private int g = 0;

        public a(@h0 String str) {
            if (str == null) {
                throw new IllegalArgumentException("Result key can't be null");
            }
            this.f367a = str;
        }

        @h0
        public a a(@h0 Bundle bundle) {
            if (bundle != null) {
                this.f369c.putAll(bundle);
            }
            return this;
        }

        @h0
        public w b() {
            return new w(this.f367a, this.d, this.e, this.f, this.g, this.f369c, this.f368b);
        }

        @h0
        public Bundle c() {
            return this.f369c;
        }

        @h0
        public a d(@h0 String str, boolean z) {
            if (z) {
                this.f368b.add(str);
            } else {
                this.f368b.remove(str);
            }
            return this;
        }

        @h0
        public a e(boolean z) {
            this.f = z;
            return this;
        }

        @h0
        public a f(@i0 CharSequence[] charSequenceArr) {
            this.e = charSequenceArr;
            return this;
        }

        @h0
        public a g(int r1) {
            this.g = r1;
            return this;
        }

        @h0
        public a h(@i0 CharSequence charSequence) {
            this.d = charSequence;
            return this;
        }
    }

    @Retention(RetentionPolicy.SOURCE)
    @p0({p0.a.LIBRARY_GROUP_PREFIX})
    public @interface b {
    }

    @Retention(RetentionPolicy.SOURCE)
    @p0({p0.a.LIBRARY_GROUP_PREFIX})
    public @interface c {
    }

    w(String str, CharSequence charSequence, CharSequence[] charSequenceArr, boolean z, int r5, Bundle bundle, Set<String> set) {
        this.f364a = str;
        this.f365b = charSequence;
        this.f366c = charSequenceArr;
        this.d = z;
        this.e = r5;
        this.f = bundle;
        this.g = set;
        if (j() == 2 && !e()) {
            throw new IllegalArgumentException("setEditChoicesBeforeSending requires setAllowFreeFormInput");
        }
    }

    public static void a(w wVar, Intent intent, Map<String, Uri> map) {
        int r0 = Build.VERSION.SDK_INT;
        if (r0 >= 26) {
            RemoteInput.addDataResultToIntent(c(wVar), intent, map);
            return;
        }
        if (r0 >= 16) {
            Intent intentH = h(intent);
            if (intentH == null) {
                intentH = new Intent();
            }
            for (Map.Entry<String, Uri> entry : map.entrySet()) {
                String key = entry.getKey();
                Uri value = entry.getValue();
                if (key != null) {
                    Bundle bundleExtra = intentH.getBundleExtra(k(key));
                    if (bundleExtra == null) {
                        bundleExtra = new Bundle();
                    }
                    bundleExtra.putString(wVar.n(), value.toString());
                    intentH.putExtra(k(key), bundleExtra);
                }
            }
            intent.setClipData(ClipData.newIntent(i, intentH));
        }
    }

    public static void b(w[] wVarArr, Intent intent, Bundle bundle) {
        int r0 = Build.VERSION.SDK_INT;
        if (r0 >= 26) {
            RemoteInput.addResultsToIntent(d(wVarArr), intent, bundle);
            return;
        }
        if (r0 >= 20) {
            Bundle bundleO = o(intent);
            int r1 = p(intent);
            if (bundleO != null) {
                bundleO.putAll(bundle);
                bundle = bundleO;
            }
            for (w wVar : wVarArr) {
                Map<String, Uri> mapI = i(intent, wVar.n());
                RemoteInput.addResultsToIntent(d(new w[]{wVar}), intent, bundle);
                if (mapI != null) {
                    a(wVar, intent, mapI);
                }
            }
            r(intent, r1);
            return;
        }
        if (r0 >= 16) {
            Intent intentH = h(intent);
            if (intentH == null) {
                intentH = new Intent();
            }
            Bundle bundleExtra = intentH.getBundleExtra(j);
            if (bundleExtra == null) {
                bundleExtra = new Bundle();
            }
            for (w wVar2 : wVarArr) {
                Object obj = bundle.get(wVar2.n());
                if (obj instanceof CharSequence) {
                    bundleExtra.putCharSequence(wVar2.n(), (CharSequence) obj);
                }
            }
            intentH.putExtra(j, bundleExtra);
            intent.setClipData(ClipData.newIntent(i, intentH));
        }
    }

    @m0(20)
    static RemoteInput c(w wVar) {
        RemoteInput.Builder builderAddExtras = new RemoteInput.Builder(wVar.n()).setLabel(wVar.m()).setChoices(wVar.g()).setAllowFreeFormInput(wVar.e()).addExtras(wVar.l());
        if (Build.VERSION.SDK_INT >= 29) {
            builderAddExtras.setEditChoicesBeforeSending(wVar.j());
        }
        return builderAddExtras.build();
    }

    @m0(20)
    static RemoteInput[] d(w[] wVarArr) {
        if (wVarArr == null) {
            return null;
        }
        RemoteInput[] remoteInputArr = new RemoteInput[wVarArr.length];
        for (int r1 = 0; r1 < wVarArr.length; r1++) {
            remoteInputArr[r1] = c(wVarArr[r1]);
        }
        return remoteInputArr;
    }

    @m0(16)
    private static Intent h(Intent intent) {
        ClipData clipData = intent.getClipData();
        if (clipData == null) {
            return null;
        }
        ClipDescription description = clipData.getDescription();
        if (description.hasMimeType("text/vnd.android.intent") && description.getLabel().toString().contentEquals(i)) {
            return clipData.getItemAt(0).getIntent();
        }
        return null;
    }

    public static Map<String, Uri> i(Intent intent, String str) {
        Intent intentH;
        String string;
        int r0 = Build.VERSION.SDK_INT;
        if (r0 >= 26) {
            return RemoteInput.getDataResultsFromIntent(intent, str);
        }
        if (r0 < 16 || (intentH = h(intent)) == null) {
            return null;
        }
        HashMap map = new HashMap();
        for (String str2 : intentH.getExtras().keySet()) {
            if (str2.startsWith(k)) {
                String strSubstring = str2.substring(39);
                if (!strSubstring.isEmpty() && (string = intentH.getBundleExtra(str2).getString(str)) != null && !string.isEmpty()) {
                    map.put(strSubstring, Uri.parse(string));
                }
            }
        }
        if (map.isEmpty()) {
            return null;
        }
        return map;
    }

    private static String k(String str) {
        return k + str;
    }

    public static Bundle o(Intent intent) {
        Intent intentH;
        int r0 = Build.VERSION.SDK_INT;
        if (r0 >= 20) {
            return RemoteInput.getResultsFromIntent(intent);
        }
        if (r0 < 16 || (intentH = h(intent)) == null) {
            return null;
        }
        return (Bundle) intentH.getExtras().getParcelable(j);
    }

    public static int p(@h0 Intent intent) {
        Intent intentH;
        int r0 = Build.VERSION.SDK_INT;
        if (r0 >= 28) {
            return RemoteInput.getResultsSource(intent);
        }
        if (r0 < 16 || (intentH = h(intent)) == null) {
            return 0;
        }
        return intentH.getExtras().getInt(l, 0);
    }

    public static void r(@h0 Intent intent, int r3) {
        int r0 = Build.VERSION.SDK_INT;
        if (r0 >= 28) {
            RemoteInput.setResultsSource(intent, r3);
            return;
        }
        if (r0 >= 16) {
            Intent intentH = h(intent);
            if (intentH == null) {
                intentH = new Intent();
            }
            intentH.putExtra(l, r3);
            intent.setClipData(ClipData.newIntent(i, intentH));
        }
    }

    public boolean e() {
        return this.d;
    }

    public Set<String> f() {
        return this.g;
    }

    public CharSequence[] g() {
        return this.f366c;
    }

    public int j() {
        return this.e;
    }

    public Bundle l() {
        return this.f;
    }

    public CharSequence m() {
        return this.f365b;
    }

    public String n() {
        return this.f364a;
    }

    public boolean q() {
        return (e() || (g() != null && g().length != 0) || f() == null || f().isEmpty()) ? false : true;
    }
}

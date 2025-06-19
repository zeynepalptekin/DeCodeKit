package b.i.c.i;

import android.app.Person;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.ShortcutInfo;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.PersistableBundle;
import android.text.TextUtils;
import androidx.annotation.h0;
import androidx.annotation.i0;
import androidx.annotation.m0;
import androidx.annotation.p0;
import androidx.annotation.x0;
import androidx.core.app.v;
import androidx.core.graphics.drawable.IconCompat;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/* loaded from: classes.dex */
public class d {
    private static final String n = "extraPersonCount";
    private static final String o = "extraPerson_";
    private static final String p = "extraLongLived";

    /* renamed from: a, reason: collision with root package name */
    Context f978a;

    /* renamed from: b, reason: collision with root package name */
    String f979b;

    /* renamed from: c, reason: collision with root package name */
    Intent[] f980c;
    ComponentName d;
    CharSequence e;
    CharSequence f;
    CharSequence g;
    IconCompat h;
    boolean i;
    v[] j;
    Set<String> k;
    boolean l;
    int m;

    public static class a {

        /* renamed from: a, reason: collision with root package name */
        private final d f981a;

        @m0(25)
        @p0({p0.a.LIBRARY_GROUP_PREFIX})
        public a(@h0 Context context, @h0 ShortcutInfo shortcutInfo) {
            d dVar = new d();
            this.f981a = dVar;
            dVar.f978a = context;
            dVar.f979b = shortcutInfo.getId();
            Intent[] intents = shortcutInfo.getIntents();
            this.f981a.f980c = (Intent[]) Arrays.copyOf(intents, intents.length);
            this.f981a.d = shortcutInfo.getActivity();
            this.f981a.e = shortcutInfo.getShortLabel();
            this.f981a.f = shortcutInfo.getLongLabel();
            this.f981a.g = shortcutInfo.getDisabledMessage();
            this.f981a.k = shortcutInfo.getCategories();
            this.f981a.j = d.l(shortcutInfo.getExtras());
            this.f981a.m = shortcutInfo.getRank();
        }

        public a(@h0 Context context, @h0 String str) {
            d dVar = new d();
            this.f981a = dVar;
            dVar.f978a = context;
            dVar.f979b = str;
        }

        @p0({p0.a.LIBRARY_GROUP_PREFIX})
        public a(@h0 d dVar) {
            d dVar2 = new d();
            this.f981a = dVar2;
            dVar2.f978a = dVar.f978a;
            dVar2.f979b = dVar.f979b;
            Intent[] intentArr = dVar.f980c;
            dVar2.f980c = (Intent[]) Arrays.copyOf(intentArr, intentArr.length);
            d dVar3 = this.f981a;
            dVar3.d = dVar.d;
            dVar3.e = dVar.e;
            dVar3.f = dVar.f;
            dVar3.g = dVar.g;
            dVar3.h = dVar.h;
            dVar3.i = dVar.i;
            dVar3.l = dVar.l;
            dVar3.m = dVar.m;
            v[] vVarArr = dVar.j;
            if (vVarArr != null) {
                dVar3.j = (v[]) Arrays.copyOf(vVarArr, vVarArr.length);
            }
            if (dVar.k != null) {
                this.f981a.k = new HashSet(dVar.k);
            }
        }

        @h0
        public d a() {
            if (TextUtils.isEmpty(this.f981a.e)) {
                throw new IllegalArgumentException("Shortcut must have a non-empty label");
            }
            d dVar = this.f981a;
            Intent[] intentArr = dVar.f980c;
            if (intentArr == null || intentArr.length == 0) {
                throw new IllegalArgumentException("Shortcut must have an intent");
            }
            return dVar;
        }

        @h0
        public a b(@h0 ComponentName componentName) {
            this.f981a.d = componentName;
            return this;
        }

        @h0
        public a c() {
            this.f981a.i = true;
            return this;
        }

        @h0
        public a d(@h0 Set<String> set) {
            this.f981a.k = set;
            return this;
        }

        @h0
        public a e(@h0 CharSequence charSequence) {
            this.f981a.g = charSequence;
            return this;
        }

        @h0
        public a f(IconCompat iconCompat) {
            this.f981a.h = iconCompat;
            return this;
        }

        @h0
        public a g(@h0 Intent intent) {
            return h(new Intent[]{intent});
        }

        @h0
        public a h(@h0 Intent[] intentArr) {
            this.f981a.f980c = intentArr;
            return this;
        }

        @h0
        public a i(@h0 CharSequence charSequence) {
            this.f981a.f = charSequence;
            return this;
        }

        @h0
        @Deprecated
        public a j() {
            this.f981a.l = true;
            return this;
        }

        @h0
        public a k(boolean z) {
            this.f981a.l = z;
            return this;
        }

        @h0
        public a l(@h0 v vVar) {
            return m(new v[]{vVar});
        }

        @h0
        public a m(@h0 v[] vVarArr) {
            this.f981a.j = vVarArr;
            return this;
        }

        @h0
        public a n(int r2) {
            this.f981a.m = r2;
            return this;
        }

        @h0
        public a o(@h0 CharSequence charSequence) {
            this.f981a.e = charSequence;
            return this;
        }
    }

    d() {
    }

    @m0(22)
    @p0({p0.a.LIBRARY_GROUP_PREFIX})
    private PersistableBundle b() {
        PersistableBundle persistableBundle = new PersistableBundle();
        v[] vVarArr = this.j;
        if (vVarArr != null && vVarArr.length > 0) {
            persistableBundle.putInt(n, vVarArr.length);
            int r1 = 0;
            while (r1 < this.j.length) {
                StringBuilder sb = new StringBuilder();
                sb.append(o);
                int r3 = r1 + 1;
                sb.append(r3);
                persistableBundle.putPersistableBundle(sb.toString(), this.j[r1].m());
                r1 = r3;
            }
        }
        persistableBundle.putBoolean(p, this.l);
        return persistableBundle;
    }

    @m0(25)
    @p0({p0.a.LIBRARY_GROUP_PREFIX})
    @x0
    static boolean k(@h0 PersistableBundle persistableBundle) {
        if (persistableBundle == null || !persistableBundle.containsKey(p)) {
            return false;
        }
        return persistableBundle.getBoolean(p);
    }

    @m0(25)
    @i0
    @p0({p0.a.LIBRARY_GROUP_PREFIX})
    @x0
    static v[] l(@h0 PersistableBundle persistableBundle) {
        if (persistableBundle == null || !persistableBundle.containsKey(n)) {
            return null;
        }
        int r0 = persistableBundle.getInt(n);
        v[] vVarArr = new v[r0];
        int r2 = 0;
        while (r2 < r0) {
            StringBuilder sb = new StringBuilder();
            sb.append(o);
            int r4 = r2 + 1;
            sb.append(r4);
            vVarArr[r2] = v.c(persistableBundle.getPersistableBundle(sb.toString()));
            r2 = r4;
        }
        return vVarArr;
    }

    Intent a(Intent intent) throws PackageManager.NameNotFoundException {
        intent.putExtra("android.intent.extra.shortcut.INTENT", this.f980c[r0.length - 1]).putExtra("android.intent.extra.shortcut.NAME", this.e.toString());
        if (this.h != null) {
            Drawable activityIcon = null;
            if (this.i) {
                PackageManager packageManager = this.f978a.getPackageManager();
                ComponentName componentName = this.d;
                if (componentName != null) {
                    try {
                        activityIcon = packageManager.getActivityIcon(componentName);
                    } catch (PackageManager.NameNotFoundException unused) {
                    }
                }
                if (activityIcon == null) {
                    activityIcon = this.f978a.getApplicationInfo().loadIcon(packageManager);
                }
            }
            this.h.c(intent, activityIcon, this.f978a);
        }
        return intent;
    }

    @i0
    public ComponentName c() {
        return this.d;
    }

    @i0
    public Set<String> d() {
        return this.k;
    }

    @i0
    public CharSequence e() {
        return this.g;
    }

    @p0({p0.a.LIBRARY_GROUP_PREFIX})
    public IconCompat f() {
        return this.h;
    }

    @h0
    public String g() {
        return this.f979b;
    }

    @h0
    public Intent h() {
        return this.f980c[r0.length - 1];
    }

    @h0
    public Intent[] i() {
        Intent[] intentArr = this.f980c;
        return (Intent[]) Arrays.copyOf(intentArr, intentArr.length);
    }

    @i0
    public CharSequence j() {
        return this.f;
    }

    public int m() {
        return this.m;
    }

    @h0
    public CharSequence n() {
        return this.e;
    }

    @m0(25)
    public ShortcutInfo o() {
        ShortcutInfo.Builder intents = new ShortcutInfo.Builder(this.f978a, this.f979b).setShortLabel(this.e).setIntents(this.f980c);
        IconCompat iconCompat = this.h;
        if (iconCompat != null) {
            intents.setIcon(iconCompat.K(this.f978a));
        }
        if (!TextUtils.isEmpty(this.f)) {
            intents.setLongLabel(this.f);
        }
        if (!TextUtils.isEmpty(this.g)) {
            intents.setDisabledMessage(this.g);
        }
        ComponentName componentName = this.d;
        if (componentName != null) {
            intents.setActivity(componentName);
        }
        Set<String> set = this.k;
        if (set != null) {
            intents.setCategories(set);
        }
        intents.setRank(this.m);
        if (Build.VERSION.SDK_INT >= 29) {
            v[] vVarArr = this.j;
            if (vVarArr != null && vVarArr.length > 0) {
                int length = vVarArr.length;
                Person[] personArr = new Person[length];
                for (int r3 = 0; r3 < length; r3++) {
                    personArr[r3] = this.j[r3].j();
                }
                intents.setPersons(personArr);
            }
            intents.setLongLived(this.l);
        } else {
            intents.setExtras(b());
        }
        return intents.build();
    }
}

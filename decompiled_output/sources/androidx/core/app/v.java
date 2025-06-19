package androidx.core.app;

import android.app.Person;
import android.os.Bundle;
import android.os.PersistableBundle;
import androidx.annotation.h0;
import androidx.annotation.i0;
import androidx.annotation.m0;
import androidx.annotation.p0;
import androidx.core.graphics.drawable.IconCompat;

/* loaded from: classes.dex */
public class v {
    private static final String g = "name";
    private static final String h = "icon";
    private static final String i = "uri";
    private static final String j = "key";
    private static final String k = "isBot";
    private static final String l = "isImportant";

    /* renamed from: a, reason: collision with root package name */
    @i0
    CharSequence f358a;

    /* renamed from: b, reason: collision with root package name */
    @i0
    IconCompat f359b;

    /* renamed from: c, reason: collision with root package name */
    @i0
    String f360c;

    @i0
    String d;
    boolean e;
    boolean f;

    public static class a {

        /* renamed from: a, reason: collision with root package name */
        @i0
        CharSequence f361a;

        /* renamed from: b, reason: collision with root package name */
        @i0
        IconCompat f362b;

        /* renamed from: c, reason: collision with root package name */
        @i0
        String f363c;

        @i0
        String d;
        boolean e;
        boolean f;

        public a() {
        }

        a(v vVar) {
            this.f361a = vVar.f358a;
            this.f362b = vVar.f359b;
            this.f363c = vVar.f360c;
            this.d = vVar.d;
            this.e = vVar.e;
            this.f = vVar.f;
        }

        @h0
        public v a() {
            return new v(this);
        }

        @h0
        public a b(boolean z) {
            this.e = z;
            return this;
        }

        @h0
        public a c(@i0 IconCompat iconCompat) {
            this.f362b = iconCompat;
            return this;
        }

        @h0
        public a d(boolean z) {
            this.f = z;
            return this;
        }

        @h0
        public a e(@i0 String str) {
            this.d = str;
            return this;
        }

        @h0
        public a f(@i0 CharSequence charSequence) {
            this.f361a = charSequence;
            return this;
        }

        @h0
        public a g(@i0 String str) {
            this.f363c = str;
            return this;
        }
    }

    v(a aVar) {
        this.f358a = aVar.f361a;
        this.f359b = aVar.f362b;
        this.f360c = aVar.f363c;
        this.d = aVar.d;
        this.e = aVar.e;
        this.f = aVar.f;
    }

    @m0(28)
    @h0
    @p0({p0.a.LIBRARY_GROUP_PREFIX})
    public static v a(@h0 Person person) {
        return new a().f(person.getName()).c(person.getIcon() != null ? IconCompat.g(person.getIcon()) : null).g(person.getUri()).e(person.getKey()).b(person.isBot()).d(person.isImportant()).a();
    }

    @h0
    public static v b(@h0 Bundle bundle) {
        Bundle bundle2 = bundle.getBundle(h);
        return new a().f(bundle.getCharSequence("name")).c(bundle2 != null ? IconCompat.e(bundle2) : null).g(bundle.getString(i)).e(bundle.getString(j)).b(bundle.getBoolean(k)).d(bundle.getBoolean(l)).a();
    }

    @m0(22)
    @h0
    @p0({p0.a.LIBRARY_GROUP_PREFIX})
    public static v c(@h0 PersistableBundle persistableBundle) {
        return new a().f(persistableBundle.getString("name")).g(persistableBundle.getString(i)).e(persistableBundle.getString(j)).b(persistableBundle.getBoolean(k)).d(persistableBundle.getBoolean(l)).a();
    }

    @i0
    public IconCompat d() {
        return this.f359b;
    }

    @i0
    public String e() {
        return this.d;
    }

    @i0
    public CharSequence f() {
        return this.f358a;
    }

    @i0
    public String g() {
        return this.f360c;
    }

    public boolean h() {
        return this.e;
    }

    public boolean i() {
        return this.f;
    }

    @m0(28)
    @h0
    @p0({p0.a.LIBRARY_GROUP_PREFIX})
    public Person j() {
        return new Person.Builder().setName(f()).setIcon(d() != null ? d().J() : null).setUri(g()).setKey(e()).setBot(h()).setImportant(i()).build();
    }

    @h0
    public a k() {
        return new a(this);
    }

    @h0
    public Bundle l() {
        Bundle bundle = new Bundle();
        bundle.putCharSequence("name", this.f358a);
        IconCompat iconCompat = this.f359b;
        bundle.putBundle(h, iconCompat != null ? iconCompat.I() : null);
        bundle.putString(i, this.f360c);
        bundle.putString(j, this.d);
        bundle.putBoolean(k, this.e);
        bundle.putBoolean(l, this.f);
        return bundle;
    }

    @m0(22)
    @h0
    @p0({p0.a.LIBRARY_GROUP_PREFIX})
    public PersistableBundle m() {
        PersistableBundle persistableBundle = new PersistableBundle();
        CharSequence charSequence = this.f358a;
        persistableBundle.putString("name", charSequence != null ? charSequence.toString() : null);
        persistableBundle.putString(i, this.f360c);
        persistableBundle.putString(j, this.d);
        persistableBundle.putBoolean(k, this.e);
        persistableBundle.putBoolean(l, this.f);
        return persistableBundle;
    }
}

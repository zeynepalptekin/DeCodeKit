package b.i.k;

import android.os.LocaleList;
import androidx.annotation.h0;
import androidx.annotation.i0;
import androidx.annotation.m0;
import java.util.Locale;

@m0(24)
/* loaded from: classes.dex */
final class i implements h {

    /* renamed from: a, reason: collision with root package name */
    private final LocaleList f1063a;

    i(LocaleList localeList) {
        this.f1063a = localeList;
    }

    @Override // b.i.k.h
    public String a() {
        return this.f1063a.toLanguageTags();
    }

    @Override // b.i.k.h
    public Object b() {
        return this.f1063a;
    }

    @Override // b.i.k.h
    public int c(Locale locale) {
        return this.f1063a.indexOf(locale);
    }

    @Override // b.i.k.h
    @i0
    public Locale d(@h0 String[] strArr) {
        return this.f1063a.getFirstMatch(strArr);
    }

    public boolean equals(Object obj) {
        return this.f1063a.equals(((h) obj).b());
    }

    @Override // b.i.k.h
    public Locale get(int r2) {
        return this.f1063a.get(r2);
    }

    public int hashCode() {
        return this.f1063a.hashCode();
    }

    @Override // b.i.k.h
    public boolean isEmpty() {
        return this.f1063a.isEmpty();
    }

    @Override // b.i.k.h
    public int size() {
        return this.f1063a.size();
    }

    public String toString() {
        return this.f1063a.toString();
    }
}

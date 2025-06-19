package c.a.b.b.d.p;

import android.util.Log;
import androidx.annotation.RecentlyNonNull;
import androidx.annotation.i0;
import com.google.android.gms.common.internal.i;
import java.util.Locale;

@com.google.android.gms.common.annotation.a
/* loaded from: classes.dex */
public class a {

    /* renamed from: a, reason: collision with root package name */
    private final String f1624a;

    /* renamed from: b, reason: collision with root package name */
    private final String f1625b;

    /* renamed from: c, reason: collision with root package name */
    private final i f1626c;
    private final int d;

    private a(String str, String str2) {
        this.f1625b = str2;
        this.f1624a = str;
        this.f1626c = new i(str);
        int r1 = 2;
        while (7 >= r1 && !Log.isLoggable(this.f1624a, r1)) {
            r1++;
        }
        this.d = r1;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    @com.google.android.gms.common.annotation.a
    public a(@RecentlyNonNull String str, @RecentlyNonNull String... strArr) {
        String string;
        if (strArr.length == 0) {
            string = "";
        } else {
            StringBuilder sb = new StringBuilder();
            sb.append('[');
            for (String str2 : strArr) {
                if (sb.length() > 1) {
                    sb.append(",");
                }
                sb.append(str2);
            }
            sb.append(']');
            sb.append(' ');
            string = sb.toString();
        }
        this(str, string);
    }

    @com.google.android.gms.common.annotation.a
    public void a(@RecentlyNonNull String str, @RecentlyNonNull Throwable th, @i0 Object... objArr) {
        if (h(3)) {
            Log.d(this.f1624a, e(str, objArr), th);
        }
    }

    @com.google.android.gms.common.annotation.a
    public void b(@RecentlyNonNull String str, @i0 Object... objArr) {
        if (h(3)) {
            Log.d(this.f1624a, e(str, objArr));
        }
    }

    @com.google.android.gms.common.annotation.a
    public void c(@RecentlyNonNull String str, @RecentlyNonNull Throwable th, @i0 Object... objArr) {
        Log.e(this.f1624a, e(str, objArr), th);
    }

    @com.google.android.gms.common.annotation.a
    public void d(@RecentlyNonNull String str, @i0 Object... objArr) {
        Log.e(this.f1624a, e(str, objArr));
    }

    @RecentlyNonNull
    @com.google.android.gms.common.annotation.a
    protected String e(@RecentlyNonNull String str, @i0 Object... objArr) {
        if (objArr != null && objArr.length > 0) {
            str = String.format(Locale.US, str, objArr);
        }
        return this.f1625b.concat(str);
    }

    @RecentlyNonNull
    @com.google.android.gms.common.annotation.a
    public String f() {
        return this.f1624a;
    }

    @com.google.android.gms.common.annotation.a
    public void g(@RecentlyNonNull String str, @i0 Object... objArr) {
        Log.i(this.f1624a, e(str, objArr));
    }

    @RecentlyNonNull
    @com.google.android.gms.common.annotation.a
    public boolean h(@RecentlyNonNull int r2) {
        return this.d <= r2;
    }

    @com.google.android.gms.common.annotation.a
    public void i(@RecentlyNonNull String str, @RecentlyNonNull Throwable th, @i0 Object... objArr) {
        if (h(2)) {
            Log.v(this.f1624a, e(str, objArr), th);
        }
    }

    @com.google.android.gms.common.annotation.a
    public void j(@RecentlyNonNull String str, @i0 Object... objArr) {
        if (h(2)) {
            Log.v(this.f1624a, e(str, objArr));
        }
    }

    @com.google.android.gms.common.annotation.a
    public void k(@RecentlyNonNull String str, @i0 Object... objArr) {
        Log.w(this.f1624a, e(str, objArr));
    }

    @com.google.android.gms.common.annotation.a
    public void l(@RecentlyNonNull String str, @RecentlyNonNull Throwable th, @i0 Object... objArr) {
        Log.wtf(this.f1624a, e(str, objArr), th);
    }

    @com.google.android.gms.common.annotation.a
    public void m(@RecentlyNonNull Throwable th) {
        Log.wtf(this.f1624a, th);
    }
}

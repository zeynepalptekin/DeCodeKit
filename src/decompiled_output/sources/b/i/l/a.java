package b.i.l;

import android.util.Base64;
import androidx.annotation.e;
import androidx.annotation.h0;
import androidx.annotation.i0;
import androidx.annotation.p0;
import b.i.o.i;
import java.util.List;

/* loaded from: classes.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    private final String f1070a;

    /* renamed from: b, reason: collision with root package name */
    private final String f1071b;

    /* renamed from: c, reason: collision with root package name */
    private final String f1072c;
    private final List<List<byte[]>> d;
    private final int e;
    private final String f;

    public a(@h0 String str, @h0 String str2, @h0 String str3, @e int r4) {
        this.f1070a = (String) i.f(str);
        this.f1071b = (String) i.f(str2);
        this.f1072c = (String) i.f(str3);
        this.d = null;
        i.a(r4 != 0);
        this.e = r4;
        this.f = this.f1070a + "-" + this.f1071b + "-" + this.f1072c;
    }

    public a(@h0 String str, @h0 String str2, @h0 String str3, @h0 List<List<byte[]>> list) {
        this.f1070a = (String) i.f(str);
        this.f1071b = (String) i.f(str2);
        this.f1072c = (String) i.f(str3);
        this.d = (List) i.f(list);
        this.e = 0;
        this.f = this.f1070a + "-" + this.f1071b + "-" + this.f1072c;
    }

    @i0
    public List<List<byte[]>> a() {
        return this.d;
    }

    @e
    public int b() {
        return this.e;
    }

    @p0({p0.a.LIBRARY_GROUP_PREFIX})
    public String c() {
        return this.f;
    }

    @h0
    public String d() {
        return this.f1070a;
    }

    @h0
    public String e() {
        return this.f1071b;
    }

    @h0
    public String f() {
        return this.f1072c;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("FontRequest {mProviderAuthority: " + this.f1070a + ", mProviderPackage: " + this.f1071b + ", mQuery: " + this.f1072c + ", mCertificates:");
        for (int r2 = 0; r2 < this.d.size(); r2++) {
            sb.append(" [");
            List<byte[]> list = this.d.get(r2);
            for (int r4 = 0; r4 < list.size(); r4++) {
                sb.append(" \"");
                sb.append(Base64.encodeToString(list.get(r4), 0));
                sb.append("\"");
            }
            sb.append(" ]");
        }
        sb.append("}");
        sb.append("mCertificatesArray: " + this.e);
        return sb.toString();
    }
}

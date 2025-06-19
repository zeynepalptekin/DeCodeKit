package c.a.b.b.g.c;

import android.net.Uri;
import java.util.Map;
import javax.annotation.Nullable;

/* loaded from: classes.dex */
public final class h2 {

    /* renamed from: a, reason: collision with root package name */
    private final Map<String, Map<String, String>> f1704a;

    h2(Map<String, Map<String, String>> map) {
        this.f1704a = map;
    }

    @Nullable
    public final String a(@Nullable Uri uri, @Nullable String str, @Nullable String str2, String str3) {
        if (uri == null) {
            return null;
        }
        Map<String, String> map = this.f1704a.get(uri.toString());
        if (map == null) {
            return null;
        }
        if (str2 != null) {
            String strValueOf = String.valueOf(str2);
            String strValueOf2 = String.valueOf(str3);
            str3 = strValueOf2.length() != 0 ? strValueOf.concat(strValueOf2) : new String(strValueOf);
        }
        return map.get(str3);
    }
}

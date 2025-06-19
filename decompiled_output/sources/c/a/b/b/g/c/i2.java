package c.a.b.b.g.c;

import android.net.Uri;

/* loaded from: classes.dex */
public final class i2 {

    /* renamed from: a, reason: collision with root package name */
    @androidx.annotation.u("PhenotypeConstants.class")
    private static final b.f.a<String, Uri> f1723a = new b.f.a<>();

    public static synchronized Uri a(String str) {
        Uri uri;
        uri = f1723a.get(str);
        if (uri == null) {
            String strValueOf = String.valueOf(Uri.encode(str));
            uri = Uri.parse(strValueOf.length() != 0 ? "content://com.google.android.gms.phenotype/".concat(strValueOf) : new String("content://com.google.android.gms.phenotype/"));
            f1723a.put(str, uri);
        }
        return uri;
    }
}

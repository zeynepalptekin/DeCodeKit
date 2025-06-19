package b.l.b;

import android.content.Context;
import android.net.Uri;
import android.os.Build;
import android.provider.DocumentsContract;
import androidx.annotation.h0;
import androidx.annotation.i0;
import java.io.File;

/* loaded from: classes.dex */
public abstract class a {

    /* renamed from: b, reason: collision with root package name */
    static final String f1300b = "DocumentFile";

    /* renamed from: a, reason: collision with root package name */
    @i0
    private final a f1301a;

    a(@i0 a aVar) {
        this.f1301a = aVar;
    }

    @h0
    public static a h(@h0 File file) {
        return new c(null, file);
    }

    @i0
    public static a i(@h0 Context context, @h0 Uri uri) {
        if (Build.VERSION.SDK_INT >= 19) {
            return new d(null, context, uri);
        }
        return null;
    }

    @i0
    public static a j(@h0 Context context, @h0 Uri uri) {
        if (Build.VERSION.SDK_INT >= 21) {
            return new e(null, context, DocumentsContract.buildDocumentUriUsingTree(uri, DocumentsContract.getTreeDocumentId(uri)));
        }
        return null;
    }

    public static boolean p(@h0 Context context, @i0 Uri uri) {
        if (Build.VERSION.SDK_INT >= 19) {
            return DocumentsContract.isDocumentUri(context, uri);
        }
        return false;
    }

    public abstract boolean a();

    public abstract boolean b();

    @i0
    public abstract a c(@h0 String str);

    @i0
    public abstract a d(@h0 String str, @h0 String str2);

    public abstract boolean e();

    public abstract boolean f();

    @i0
    public a g(@h0 String str) {
        for (a aVar : u()) {
            if (str.equals(aVar.k())) {
                return aVar;
            }
        }
        return null;
    }

    @i0
    public abstract String k();

    @i0
    public a l() {
        return this.f1301a;
    }

    @i0
    public abstract String m();

    @h0
    public abstract Uri n();

    public abstract boolean o();

    public abstract boolean q();

    public abstract boolean r();

    public abstract long s();

    public abstract long t();

    @h0
    public abstract a[] u();

    public abstract boolean v(@h0 String str);
}

package b.i.c;

import android.content.ContentResolver;
import android.database.Cursor;
import android.net.Uri;
import android.os.Build;
import android.os.CancellationSignal;
import android.os.OperationCanceledException;
import b.i.k.k;

/* loaded from: classes.dex */
public final class b {
    private b() {
    }

    public static Cursor a(ContentResolver contentResolver, Uri uri, String[] strArr, String str, String[] strArr2, String str2, b.i.k.b bVar) throws Exception {
        Object objB;
        if (Build.VERSION.SDK_INT < 16) {
            if (bVar != null) {
                bVar.e();
            }
            return contentResolver.query(uri, strArr, str, strArr2, str2);
        }
        if (bVar != null) {
            try {
                objB = bVar.b();
            } catch (Exception e) {
                if (e instanceof OperationCanceledException) {
                    throw new k();
                }
                throw e;
            }
        } else {
            objB = null;
        }
        return contentResolver.query(uri, strArr, str, strArr2, str2, (CancellationSignal) objB);
    }
}

package b.l.b;

import android.content.ContentResolver;
import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import android.provider.DocumentsContract;
import android.util.Log;
import androidx.annotation.i0;
import androidx.annotation.m0;
import java.io.FileNotFoundException;
import java.util.ArrayList;

@m0(21)
/* loaded from: classes.dex */
class e extends a {

    /* renamed from: c, reason: collision with root package name */
    private Context f1306c;
    private Uri d;

    e(@i0 a aVar, Context context, Uri uri) {
        super(aVar);
        this.f1306c = context;
        this.d = uri;
    }

    private static void w(@i0 AutoCloseable autoCloseable) throws Exception {
        if (autoCloseable != null) {
            try {
                autoCloseable.close();
            } catch (RuntimeException e) {
                throw e;
            } catch (Exception unused) {
            }
        }
    }

    @i0
    private static Uri x(Context context, Uri uri, String str, String str2) {
        try {
            return DocumentsContract.createDocument(context.getContentResolver(), uri, str, str2);
        } catch (Exception unused) {
            return null;
        }
    }

    @Override // b.l.b.a
    public boolean a() {
        return b.a(this.f1306c, this.d);
    }

    @Override // b.l.b.a
    public boolean b() {
        return b.b(this.f1306c, this.d);
    }

    @Override // b.l.b.a
    @i0
    public a c(String str) {
        Uri uriX = x(this.f1306c, this.d, "vnd.android.document/directory", str);
        if (uriX != null) {
            return new e(this, this.f1306c, uriX);
        }
        return null;
    }

    @Override // b.l.b.a
    @i0
    public a d(String str, String str2) {
        Uri uriX = x(this.f1306c, this.d, str, str2);
        if (uriX != null) {
            return new e(this, this.f1306c, uriX);
        }
        return null;
    }

    @Override // b.l.b.a
    public boolean e() {
        try {
            return DocumentsContract.deleteDocument(this.f1306c.getContentResolver(), this.d);
        } catch (Exception unused) {
            return false;
        }
    }

    @Override // b.l.b.a
    public boolean f() {
        return b.d(this.f1306c, this.d);
    }

    @Override // b.l.b.a
    @i0
    public String k() {
        return b.f(this.f1306c, this.d);
    }

    @Override // b.l.b.a
    @i0
    public String m() {
        return b.h(this.f1306c, this.d);
    }

    @Override // b.l.b.a
    public Uri n() {
        return this.d;
    }

    @Override // b.l.b.a
    public boolean o() {
        return b.i(this.f1306c, this.d);
    }

    @Override // b.l.b.a
    public boolean q() {
        return b.j(this.f1306c, this.d);
    }

    @Override // b.l.b.a
    public boolean r() {
        return b.k(this.f1306c, this.d);
    }

    @Override // b.l.b.a
    public long s() {
        return b.l(this.f1306c, this.d);
    }

    @Override // b.l.b.a
    public long t() {
        return b.m(this.f1306c, this.d);
    }

    @Override // b.l.b.a
    public a[] u() throws Exception {
        ContentResolver contentResolver = this.f1306c.getContentResolver();
        Uri uri = this.d;
        Uri uriBuildChildDocumentsUriUsingTree = DocumentsContract.buildChildDocumentsUriUsingTree(uri, DocumentsContract.getDocumentId(uri));
        ArrayList arrayList = new ArrayList();
        Cursor cursorQuery = null;
        try {
            try {
                cursorQuery = contentResolver.query(uriBuildChildDocumentsUriUsingTree, new String[]{"document_id"}, null, null, null);
                while (cursorQuery.moveToNext()) {
                    arrayList.add(DocumentsContract.buildDocumentUriUsingTree(this.d, cursorQuery.getString(0)));
                }
            } catch (Exception e) {
                Log.w("DocumentFile", "Failed query: " + e);
            }
            Uri[] uriArr = (Uri[]) arrayList.toArray(new Uri[arrayList.size()]);
            a[] aVarArr = new a[uriArr.length];
            for (int r7 = 0; r7 < uriArr.length; r7++) {
                aVarArr[r7] = new e(this, this.f1306c, uriArr[r7]);
            }
            return aVarArr;
        } finally {
            w(cursorQuery);
        }
    }

    @Override // b.l.b.a
    public boolean v(String str) throws FileNotFoundException {
        try {
            Uri uriRenameDocument = DocumentsContract.renameDocument(this.f1306c.getContentResolver(), this.d, str);
            if (uriRenameDocument != null) {
                this.d = uriRenameDocument;
                return true;
            }
        } catch (Exception unused) {
        }
        return false;
    }
}

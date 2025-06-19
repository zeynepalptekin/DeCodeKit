package b.l.b;

import android.net.Uri;
import android.util.Log;
import android.webkit.MimeTypeMap;
import androidx.annotation.i0;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;

/* loaded from: classes.dex */
class c extends a {

    /* renamed from: c, reason: collision with root package name */
    private File f1304c;

    c(@i0 a aVar, File file) {
        super(aVar);
        this.f1304c = file;
    }

    private static boolean w(File file) {
        File[] fileArrListFiles = file.listFiles();
        boolean zW = true;
        if (fileArrListFiles != null) {
            for (File file2 : fileArrListFiles) {
                if (file2.isDirectory()) {
                    zW &= w(file2);
                }
                if (!file2.delete()) {
                    Log.w("DocumentFile", "Failed to delete " + file2);
                    zW = false;
                }
            }
        }
        return zW;
    }

    private static String x(String str) {
        int r0 = str.lastIndexOf(46);
        if (r0 < 0) {
            return "application/octet-stream";
        }
        String mimeTypeFromExtension = MimeTypeMap.getSingleton().getMimeTypeFromExtension(str.substring(r0 + 1).toLowerCase());
        return mimeTypeFromExtension != null ? mimeTypeFromExtension : "application/octet-stream";
    }

    @Override // b.l.b.a
    public boolean a() {
        return this.f1304c.canRead();
    }

    @Override // b.l.b.a
    public boolean b() {
        return this.f1304c.canWrite();
    }

    @Override // b.l.b.a
    @i0
    public a c(String str) {
        File file = new File(this.f1304c, str);
        if (file.isDirectory() || file.mkdir()) {
            return new c(this, file);
        }
        return null;
    }

    @Override // b.l.b.a
    @i0
    public a d(String str, String str2) throws IOException {
        String extensionFromMimeType = MimeTypeMap.getSingleton().getExtensionFromMimeType(str);
        if (extensionFromMimeType != null) {
            str2 = str2 + "." + extensionFromMimeType;
        }
        File file = new File(this.f1304c, str2);
        try {
            file.createNewFile();
            return new c(this, file);
        } catch (IOException e) {
            Log.w("DocumentFile", "Failed to createFile: " + e);
            return null;
        }
    }

    @Override // b.l.b.a
    public boolean e() {
        w(this.f1304c);
        return this.f1304c.delete();
    }

    @Override // b.l.b.a
    public boolean f() {
        return this.f1304c.exists();
    }

    @Override // b.l.b.a
    public String k() {
        return this.f1304c.getName();
    }

    @Override // b.l.b.a
    @i0
    public String m() {
        if (this.f1304c.isDirectory()) {
            return null;
        }
        return x(this.f1304c.getName());
    }

    @Override // b.l.b.a
    public Uri n() {
        return Uri.fromFile(this.f1304c);
    }

    @Override // b.l.b.a
    public boolean o() {
        return this.f1304c.isDirectory();
    }

    @Override // b.l.b.a
    public boolean q() {
        return this.f1304c.isFile();
    }

    @Override // b.l.b.a
    public boolean r() {
        return false;
    }

    @Override // b.l.b.a
    public long s() {
        return this.f1304c.lastModified();
    }

    @Override // b.l.b.a
    public long t() {
        return this.f1304c.length();
    }

    @Override // b.l.b.a
    public a[] u() {
        ArrayList arrayList = new ArrayList();
        File[] fileArrListFiles = this.f1304c.listFiles();
        if (fileArrListFiles != null) {
            for (File file : fileArrListFiles) {
                arrayList.add(new c(this, file));
            }
        }
        return (a[]) arrayList.toArray(new a[arrayList.size()]);
    }

    @Override // b.l.b.a
    public boolean v(String str) {
        File file = new File(this.f1304c.getParentFile(), str);
        if (!this.f1304c.renameTo(file)) {
            return false;
        }
        this.f1304c = file;
        return true;
    }
}

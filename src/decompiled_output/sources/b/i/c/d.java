package b.i.c;

import android.content.ContentProvider;
import android.content.ContentValues;
import android.content.Context;
import android.content.pm.ProviderInfo;
import android.content.res.XmlResourceParser;
import android.database.Cursor;
import android.database.MatrixCursor;
import android.net.Uri;
import android.os.Build;
import android.os.Environment;
import android.os.ParcelFileDescriptor;
import android.text.TextUtils;
import android.webkit.MimeTypeMap;
import androidx.annotation.h0;
import androidx.annotation.i0;
import androidx.annotation.u;
import com.google.firebase.analytics.FirebaseAnalytics;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import org.xmlpull.v1.XmlPullParserException;

/* loaded from: classes.dex */
public class d extends ContentProvider {
    private static final String f = "android.support.FILE_PROVIDER_PATHS";
    private static final String g = "root-path";
    private static final String h = "files-path";
    private static final String i = "cache-path";
    private static final String j = "external-path";
    private static final String k = "external-files-path";
    private static final String l = "external-cache-path";
    private static final String m = "external-media-path";
    private static final String n = "name";
    private static final String o = "path";
    private a d;
    private static final String[] e = {"_display_name", "_size"};
    private static final File p = new File("/");

    @u("sCache")
    private static HashMap<String, a> q = new HashMap<>();

    interface a {
        File a(Uri uri);

        Uri b(File file);
    }

    static class b implements a {

        /* renamed from: a, reason: collision with root package name */
        private final String f967a;

        /* renamed from: b, reason: collision with root package name */
        private final HashMap<String, File> f968b = new HashMap<>();

        b(String str) {
            this.f967a = str;
        }

        @Override // b.i.c.d.a
        public File a(Uri uri) throws IOException {
            String encodedPath = uri.getEncodedPath();
            int r1 = encodedPath.indexOf(47, 1);
            String strDecode = Uri.decode(encodedPath.substring(1, r1));
            String strDecode2 = Uri.decode(encodedPath.substring(r1 + 1));
            File file = this.f968b.get(strDecode);
            if (file == null) {
                throw new IllegalArgumentException("Unable to find configured root for " + uri);
            }
            File file2 = new File(file, strDecode2);
            try {
                File canonicalFile = file2.getCanonicalFile();
                if (canonicalFile.getPath().startsWith(file.getPath())) {
                    return canonicalFile;
                }
                throw new SecurityException("Resolved path jumped beyond configured root");
            } catch (IOException unused) {
                throw new IllegalArgumentException("Failed to resolve canonical path for " + file2);
            }
        }

        @Override // b.i.c.d.a
        public Uri b(File file) throws IOException {
            try {
                String canonicalPath = file.getCanonicalPath();
                Map.Entry<String, File> entry = null;
                for (Map.Entry<String, File> entry2 : this.f968b.entrySet()) {
                    String path = entry2.getValue().getPath();
                    if (canonicalPath.startsWith(path) && (entry == null || path.length() > entry.getValue().getPath().length())) {
                        entry = entry2;
                    }
                }
                if (entry == null) {
                    throw new IllegalArgumentException("Failed to find configured root that contains " + canonicalPath);
                }
                String path2 = entry.getValue().getPath();
                boolean zEndsWith = path2.endsWith("/");
                int length = path2.length();
                if (!zEndsWith) {
                    length++;
                }
                return new Uri.Builder().scheme(FirebaseAnalytics.b.R).authority(this.f967a).encodedPath(Uri.encode(entry.getKey()) + '/' + Uri.encode(canonicalPath.substring(length), "/")).build();
            } catch (IOException unused) {
                throw new IllegalArgumentException("Failed to resolve canonical path for " + file);
            }
        }

        void c(String str, File file) throws IOException {
            if (TextUtils.isEmpty(str)) {
                throw new IllegalArgumentException("Name must not be empty");
            }
            try {
                this.f968b.put(str, file.getCanonicalFile());
            } catch (IOException e) {
                throw new IllegalArgumentException("Failed to resolve canonical path for " + file, e);
            }
        }
    }

    private static File a(File file, String... strArr) {
        for (String str : strArr) {
            if (str != null) {
                file = new File(file, str);
            }
        }
        return file;
    }

    private static Object[] b(Object[] objArr, int r3) {
        Object[] objArr2 = new Object[r3];
        System.arraycopy(objArr, 0, objArr2, 0, r3);
        return objArr2;
    }

    private static String[] c(String[] strArr, int r3) {
        String[] strArr2 = new String[r3];
        System.arraycopy(strArr, 0, strArr2, 0, r3);
        return strArr2;
    }

    private static a d(Context context, String str) {
        a aVarG;
        synchronized (q) {
            aVarG = q.get(str);
            if (aVarG == null) {
                try {
                    aVarG = g(context, str);
                    q.put(str, aVarG);
                } catch (IOException e2) {
                    throw new IllegalArgumentException("Failed to parse android.support.FILE_PROVIDER_PATHS meta-data", e2);
                } catch (XmlPullParserException e3) {
                    throw new IllegalArgumentException("Failed to parse android.support.FILE_PROVIDER_PATHS meta-data", e3);
                }
            }
        }
        return aVarG;
    }

    public static Uri e(@h0 Context context, @h0 String str, @h0 File file) {
        return d(context, str).b(file);
    }

    private static int f(String str) {
        if ("r".equals(str)) {
            return 268435456;
        }
        if ("w".equals(str) || "wt".equals(str)) {
            return 738197504;
        }
        if ("wa".equals(str)) {
            return 704643072;
        }
        if ("rw".equals(str)) {
            return 939524096;
        }
        if ("rwt".equals(str)) {
            return 1006632960;
        }
        throw new IllegalArgumentException("Invalid mode: " + str);
    }

    private static a g(Context context, String str) throws XmlPullParserException, IOException {
        b bVar = new b(str);
        ProviderInfo providerInfoResolveContentProvider = context.getPackageManager().resolveContentProvider(str, 128);
        if (providerInfoResolveContentProvider == null) {
            throw new IllegalArgumentException("Couldn't find meta-data for provider with authority " + str);
        }
        XmlResourceParser xmlResourceParserLoadXmlMetaData = providerInfoResolveContentProvider.loadXmlMetaData(context.getPackageManager(), f);
        if (xmlResourceParserLoadXmlMetaData == null) {
            throw new IllegalArgumentException("Missing android.support.FILE_PROVIDER_PATHS meta-data");
        }
        while (true) {
            int next = xmlResourceParserLoadXmlMetaData.next();
            if (next == 1) {
                return bVar;
            }
            if (next == 2) {
                String name = xmlResourceParserLoadXmlMetaData.getName();
                File externalStorageDirectory = null;
                String attributeValue = xmlResourceParserLoadXmlMetaData.getAttributeValue(null, "name");
                String attributeValue2 = xmlResourceParserLoadXmlMetaData.getAttributeValue(null, o);
                if (g.equals(name)) {
                    externalStorageDirectory = p;
                } else if (h.equals(name)) {
                    externalStorageDirectory = context.getFilesDir();
                } else if (i.equals(name)) {
                    externalStorageDirectory = context.getCacheDir();
                } else if (j.equals(name)) {
                    externalStorageDirectory = Environment.getExternalStorageDirectory();
                } else if (k.equals(name)) {
                    File[] fileArrJ = c.j(context, null);
                    if (fileArrJ.length > 0) {
                        externalStorageDirectory = fileArrJ[0];
                    }
                } else if (l.equals(name)) {
                    File[] fileArrI = c.i(context);
                    if (fileArrI.length > 0) {
                        externalStorageDirectory = fileArrI[0];
                    }
                } else if (Build.VERSION.SDK_INT >= 21 && m.equals(name)) {
                    File[] externalMediaDirs = context.getExternalMediaDirs();
                    if (externalMediaDirs.length > 0) {
                        externalStorageDirectory = externalMediaDirs[0];
                    }
                }
                if (externalStorageDirectory != null) {
                    bVar.c(attributeValue, a(externalStorageDirectory, attributeValue2));
                }
            }
        }
    }

    @Override // android.content.ContentProvider
    public void attachInfo(@h0 Context context, @h0 ProviderInfo providerInfo) {
        super.attachInfo(context, providerInfo);
        if (providerInfo.exported) {
            throw new SecurityException("Provider must not be exported");
        }
        if (!providerInfo.grantUriPermissions) {
            throw new SecurityException("Provider must grant uri permissions");
        }
        this.d = d(context, providerInfo.authority);
    }

    @Override // android.content.ContentProvider
    public int delete(@h0 Uri uri, @i0 String str, @i0 String[] strArr) {
        return this.d.a(uri).delete() ? 1 : 0;
    }

    @Override // android.content.ContentProvider
    public String getType(@h0 Uri uri) {
        File fileA = this.d.a(uri);
        int r0 = fileA.getName().lastIndexOf(46);
        if (r0 < 0) {
            return "application/octet-stream";
        }
        String mimeTypeFromExtension = MimeTypeMap.getSingleton().getMimeTypeFromExtension(fileA.getName().substring(r0 + 1));
        return mimeTypeFromExtension != null ? mimeTypeFromExtension : "application/octet-stream";
    }

    @Override // android.content.ContentProvider
    public Uri insert(@h0 Uri uri, ContentValues contentValues) {
        throw new UnsupportedOperationException("No external inserts");
    }

    @Override // android.content.ContentProvider
    public boolean onCreate() {
        return true;
    }

    @Override // android.content.ContentProvider
    public ParcelFileDescriptor openFile(@h0 Uri uri, @h0 String str) throws FileNotFoundException {
        return ParcelFileDescriptor.open(this.d.a(uri), f(str));
    }

    @Override // android.content.ContentProvider
    public Cursor query(@h0 Uri uri, @i0 String[] strArr, @i0 String str, @i0 String[] strArr2, @i0 String str2) {
        int r2;
        File fileA = this.d.a(uri);
        if (strArr == null) {
            strArr = e;
        }
        String[] strArr3 = new String[strArr.length];
        Object[] objArr = new Object[strArr.length];
        int r1 = 0;
        for (String str3 : strArr) {
            if ("_display_name".equals(str3)) {
                strArr3[r1] = "_display_name";
                r2 = r1 + 1;
                objArr[r1] = fileA.getName();
            } else if ("_size".equals(str3)) {
                strArr3[r1] = "_size";
                r2 = r1 + 1;
                objArr[r1] = Long.valueOf(fileA.length());
            }
            r1 = r2;
        }
        String[] strArrC = c(strArr3, r1);
        Object[] objArrB = b(objArr, r1);
        MatrixCursor matrixCursor = new MatrixCursor(strArrC, 1);
        matrixCursor.addRow(objArrB);
        return matrixCursor;
    }

    @Override // android.content.ContentProvider
    public int update(@h0 Uri uri, ContentValues contentValues, @i0 String str, @i0 String[] strArr) {
        throw new UnsupportedOperationException("No external updates");
    }
}

package c.a.b.b.g.c;

import android.content.ContentResolver;
import android.database.ContentObserver;
import android.database.Cursor;
import android.database.sqlite.SQLiteException;
import android.net.Uri;
import android.os.StrictMode;
import android.util.Log;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* loaded from: classes.dex */
public final class w1 implements a2 {

    @androidx.annotation.u("ConfigurationContentLoader.class")
    private static final Map<Uri, w1> g = new b.f.a();
    private static final String[] h = {"key", "value"};

    /* renamed from: a, reason: collision with root package name */
    private final ContentResolver f1848a;

    /* renamed from: b, reason: collision with root package name */
    private final Uri f1849b;
    private volatile Map<String, String> e;

    /* renamed from: c, reason: collision with root package name */
    private final ContentObserver f1850c = new y1(this, null);
    private final Object d = new Object();

    @androidx.annotation.u("this")
    private final List<x1> f = new ArrayList();

    private w1(ContentResolver contentResolver, Uri uri) {
        g3.b(contentResolver);
        g3.b(uri);
        this.f1848a = contentResolver;
        this.f1849b = uri;
        contentResolver.registerContentObserver(uri, false, this.f1850c);
    }

    public static w1 a(ContentResolver contentResolver, Uri uri) {
        w1 w1Var;
        synchronized (w1.class) {
            w1Var = g.get(uri);
            if (w1Var == null) {
                try {
                    w1 w1Var2 = new w1(contentResolver, uri);
                    try {
                        g.put(uri, w1Var2);
                    } catch (SecurityException unused) {
                    }
                    w1Var = w1Var2;
                } catch (SecurityException unused2) {
                }
            }
        }
        return w1Var;
    }

    static synchronized void d() {
        for (w1 w1Var : g.values()) {
            w1Var.f1848a.unregisterContentObserver(w1Var.f1850c);
        }
        g.clear();
    }

    private final Map<String, String> f() {
        StrictMode.ThreadPolicy threadPolicyAllowThreadDiskReads = StrictMode.allowThreadDiskReads();
        try {
            try {
                return (Map) z1.a(new c2(this) { // from class: c.a.b.b.g.c.v1

                    /* renamed from: a, reason: collision with root package name */
                    private final w1 f1839a;

                    {
                        this.f1839a = this;
                    }

                    @Override // c.a.b.b.g.c.c2
                    public final Object a() {
                        return this.f1839a.e();
                    }
                });
            } catch (SQLiteException | IllegalStateException | SecurityException unused) {
                Log.e("ConfigurationContentLoader", "PhenotypeFlag unable to load ContentProvider, using default values");
                StrictMode.setThreadPolicy(threadPolicyAllowThreadDiskReads);
                return null;
            }
        } finally {
            StrictMode.setThreadPolicy(threadPolicyAllowThreadDiskReads);
        }
    }

    public final Map<String, String> b() {
        Map<String, String> mapF = this.e;
        if (mapF == null) {
            synchronized (this.d) {
                mapF = this.e;
                if (mapF == null) {
                    mapF = f();
                    this.e = mapF;
                }
            }
        }
        return mapF != null ? mapF : Collections.emptyMap();
    }

    public final void c() {
        synchronized (this.d) {
            this.e = null;
            l2.g();
        }
        synchronized (this) {
            Iterator<x1> it = this.f.iterator();
            while (it.hasNext()) {
                it.next().a();
            }
        }
    }

    final /* synthetic */ Map e() {
        Cursor cursorQuery = this.f1848a.query(this.f1849b, h, null, null, null);
        if (cursorQuery == null) {
            return Collections.emptyMap();
        }
        try {
            int count = cursorQuery.getCount();
            if (count == 0) {
                return Collections.emptyMap();
            }
            Map aVar = count <= 256 ? new b.f.a(count) : new HashMap(count, 1.0f);
            while (cursorQuery.moveToNext()) {
                aVar.put(cursorQuery.getString(0), cursorQuery.getString(1));
            }
            return aVar;
        } finally {
            cursorQuery.close();
        }
    }

    @Override // c.a.b.b.g.c.a2
    public final /* synthetic */ Object i(String str) {
        return b().get(str);
    }
}

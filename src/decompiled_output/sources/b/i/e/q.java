package b.i.e;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.os.CancellationSignal;
import android.util.Log;
import androidx.annotation.h0;
import androidx.annotation.i0;
import androidx.annotation.p0;
import androidx.appcompat.widget.ActivityChooserView;
import b.i.c.j.d;
import b.i.l.b;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.Field;
import java.util.concurrent.ConcurrentHashMap;

@p0({p0.a.LIBRARY_GROUP_PREFIX})
/* loaded from: classes.dex */
class q {

    /* renamed from: b, reason: collision with root package name */
    private static final String f1030b = "TypefaceCompatBaseImpl";

    /* renamed from: c, reason: collision with root package name */
    private static final int f1031c = 0;

    /* renamed from: a, reason: collision with root package name */
    private ConcurrentHashMap<Long, d.c> f1032a = new ConcurrentHashMap<>();

    class a implements c<b.h> {
        a() {
        }

        @Override // b.i.e.q.c
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public int a(b.h hVar) {
            return hVar.d();
        }

        @Override // b.i.e.q.c
        /* renamed from: d, reason: merged with bridge method [inline-methods] */
        public boolean b(b.h hVar) {
            return hVar.e();
        }
    }

    class b implements c<d.C0056d> {
        b() {
        }

        @Override // b.i.e.q.c
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public int a(d.C0056d c0056d) {
            return c0056d.e();
        }

        @Override // b.i.e.q.c
        /* renamed from: d, reason: merged with bridge method [inline-methods] */
        public boolean b(d.C0056d c0056d) {
            return c0056d.f();
        }
    }

    private interface c<T> {
        int a(T t);

        boolean b(T t);
    }

    q() {
    }

    private void a(Typeface typeface, d.c cVar) throws NoSuchFieldException {
        long j = j(typeface);
        if (j != 0) {
            this.f1032a.put(Long.valueOf(j), cVar);
        }
    }

    private d.C0056d f(d.c cVar, int r3) {
        return (d.C0056d) g(cVar.a(), r3, new b());
    }

    private static <T> T g(T[] tArr, int r11, c<T> cVar) {
        int r0 = (r11 & 1) == 0 ? 400 : 700;
        boolean z = (r11 & 2) != 0;
        T t = null;
        int r4 = ActivityChooserView.f.j;
        for (T t2 : tArr) {
            int r8 = (Math.abs(cVar.a(t2) - r0) * 2) + (cVar.b(t2) == z ? 0 : 1);
            if (t == null || r4 > r8) {
                t = t2;
                r4 = r8;
            }
        }
        return t;
    }

    private static long j(@i0 Typeface typeface) throws NoSuchFieldException {
        if (typeface == null) {
            return 0L;
        }
        try {
            Field declaredField = Typeface.class.getDeclaredField("native_instance");
            declaredField.setAccessible(true);
            return ((Number) declaredField.get(typeface)).longValue();
        } catch (IllegalAccessException e) {
            Log.e(f1030b, "Could not retrieve font from family.", e);
            return 0L;
        } catch (NoSuchFieldException e2) {
            Log.e(f1030b, "Could not retrieve font from family.", e2);
            return 0L;
        }
    }

    @i0
    public Typeface b(Context context, d.c cVar, Resources resources, int r6) throws NoSuchFieldException {
        d.C0056d c0056dF = f(cVar, r6);
        if (c0056dF == null) {
            return null;
        }
        Typeface typefaceD = k.d(context, resources, c0056dF.b(), c0056dF.a(), r6);
        a(typefaceD, cVar);
        return typefaceD;
    }

    @i0
    public Typeface c(Context context, @i0 CancellationSignal cancellationSignal, @h0 b.h[] hVarArr, int r6) throws Throwable {
        InputStream inputStreamOpenInputStream;
        InputStream inputStream = null;
        if (hVarArr.length < 1) {
            return null;
        }
        try {
            inputStreamOpenInputStream = context.getContentResolver().openInputStream(h(hVarArr, r6).c());
        } catch (IOException unused) {
            inputStreamOpenInputStream = null;
        } catch (Throwable th) {
            th = th;
        }
        try {
            Typeface typefaceD = d(context, inputStreamOpenInputStream);
            r.a(inputStreamOpenInputStream);
            return typefaceD;
        } catch (IOException unused2) {
            r.a(inputStreamOpenInputStream);
            return null;
        } catch (Throwable th2) {
            th = th2;
            inputStream = inputStreamOpenInputStream;
            r.a(inputStream);
            throw th;
        }
    }

    protected Typeface d(Context context, InputStream inputStream) {
        File fileE = r.e(context);
        if (fileE == null) {
            return null;
        }
        try {
            if (r.d(fileE, inputStream)) {
                return Typeface.createFromFile(fileE.getPath());
            }
            return null;
        } catch (RuntimeException unused) {
            return null;
        } finally {
            fileE.delete();
        }
    }

    @i0
    public Typeface e(Context context, Resources resources, int r3, String str, int r5) {
        File fileE = r.e(context);
        if (fileE == null) {
            return null;
        }
        try {
            if (r.c(fileE, resources, r3)) {
                return Typeface.createFromFile(fileE.getPath());
            }
            return null;
        } catch (RuntimeException unused) {
            return null;
        } finally {
            fileE.delete();
        }
    }

    protected b.h h(b.h[] hVarArr, int r3) {
        return (b.h) g(hVarArr, r3, new a());
    }

    @i0
    d.c i(Typeface typeface) throws NoSuchFieldException {
        long j = j(typeface);
        if (j == 0) {
            return null;
        }
        return this.f1032a.get(Long.valueOf(j));
    }
}

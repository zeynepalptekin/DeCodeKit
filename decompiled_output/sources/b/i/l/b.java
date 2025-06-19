package b.i.l;

import android.content.ContentUris;
import android.content.Context;
import android.content.pm.PackageManager;
import android.content.pm.ProviderInfo;
import android.content.pm.Signature;
import android.content.res.Resources;
import android.database.Cursor;
import android.graphics.Typeface;
import android.net.Uri;
import android.os.Build;
import android.os.CancellationSignal;
import android.os.Handler;
import android.provider.BaseColumns;
import androidx.annotation.h0;
import androidx.annotation.i0;
import androidx.annotation.m0;
import androidx.annotation.p0;
import androidx.annotation.u;
import androidx.annotation.x0;
import androidx.annotation.z;
import b.i.c.j.g;
import b.i.e.k;
import b.i.e.r;
import b.i.l.c;
import com.google.android.material.transformation.FabTransformationScrimBehavior;
import com.google.firebase.analytics.FirebaseAnalytics;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Callable;

/* loaded from: classes.dex */
public class b {

    /* renamed from: a, reason: collision with root package name */
    @p0({p0.a.LIBRARY_GROUP_PREFIX})
    public static final String f1073a = "font_results";

    /* renamed from: b, reason: collision with root package name */
    @p0({p0.a.LIBRARY_GROUP_PREFIX})
    static final int f1074b = -1;

    /* renamed from: c, reason: collision with root package name */
    @p0({p0.a.LIBRARY_GROUP_PREFIX})
    static final int f1075c = -2;
    static final b.f.g<String, Typeface> d = new b.f.g<>(16);
    private static final int e = 10000;
    private static final b.i.l.c f = new b.i.l.c("fonts", 10, e);
    static final Object g = new Object();

    @u("sLock")
    static final b.f.i<String, ArrayList<c.d<j>>> h = new b.f.i<>();
    private static final Comparator<byte[]> i = new e();

    class a implements Callable<j> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Context f1076a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ b.i.l.a f1077b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ int f1078c;
        final /* synthetic */ String d;

        a(Context context, b.i.l.a aVar, int r3, String str) {
            this.f1076a = context;
            this.f1077b = aVar;
            this.f1078c = r3;
            this.d = str;
        }

        @Override // java.util.concurrent.Callable
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public j call() throws Exception {
            j jVarG = b.g(this.f1076a, this.f1077b, this.f1078c);
            Typeface typeface = jVarG.f1094a;
            if (typeface != null) {
                b.d.j(this.d, typeface);
            }
            return jVarG;
        }
    }

    /* renamed from: b.i.l.b$b, reason: collision with other inner class name */
    class C0061b implements c.d<j> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ g.a f1079a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ Handler f1080b;

        C0061b(g.a aVar, Handler handler) {
            this.f1079a = aVar;
            this.f1080b = handler;
        }

        @Override // b.i.l.c.d
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public void a(j jVar) {
            int r0;
            g.a aVar;
            if (jVar == null) {
                aVar = this.f1079a;
                r0 = 1;
            } else {
                r0 = jVar.f1095b;
                if (r0 == 0) {
                    this.f1079a.b(jVar.f1094a, this.f1080b);
                    return;
                }
                aVar = this.f1079a;
            }
            aVar.a(r0, this.f1080b);
        }
    }

    class c implements c.d<j> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ String f1081a;

        c(String str) {
            this.f1081a = str;
        }

        @Override // b.i.l.c.d
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public void a(j jVar) {
            synchronized (b.g) {
                ArrayList<c.d<j>> arrayList = b.h.get(this.f1081a);
                if (arrayList == null) {
                    return;
                }
                b.h.remove(this.f1081a);
                for (int r0 = 0; r0 < arrayList.size(); r0++) {
                    arrayList.get(r0).a(jVar);
                }
            }
        }
    }

    class d implements Runnable {
        final /* synthetic */ Context d;
        final /* synthetic */ b.i.l.a e;
        final /* synthetic */ Handler f;
        final /* synthetic */ i g;

        class a implements Runnable {
            a() {
            }

            @Override // java.lang.Runnable
            public void run() {
                d.this.g.a(-1);
            }
        }

        /* renamed from: b.i.l.b$d$b, reason: collision with other inner class name */
        class RunnableC0062b implements Runnable {
            RunnableC0062b() {
            }

            @Override // java.lang.Runnable
            public void run() {
                d.this.g.a(-2);
            }
        }

        class c implements Runnable {
            c() {
            }

            @Override // java.lang.Runnable
            public void run() {
                d.this.g.a(-3);
            }
        }

        /* renamed from: b.i.l.b$d$d, reason: collision with other inner class name */
        class RunnableC0063d implements Runnable {
            RunnableC0063d() {
            }

            @Override // java.lang.Runnable
            public void run() {
                d.this.g.a(-3);
            }
        }

        class e implements Runnable {
            e() {
            }

            @Override // java.lang.Runnable
            public void run() {
                d.this.g.a(1);
            }
        }

        class f implements Runnable {
            f() {
            }

            @Override // java.lang.Runnable
            public void run() {
                d.this.g.a(-3);
            }
        }

        class g implements Runnable {
            final /* synthetic */ int d;

            g(int r2) {
                this.d = r2;
            }

            @Override // java.lang.Runnable
            public void run() {
                d.this.g.a(this.d);
            }
        }

        class h implements Runnable {
            h() {
            }

            @Override // java.lang.Runnable
            public void run() {
                d.this.g.a(-3);
            }
        }

        class i implements Runnable {
            final /* synthetic */ Typeface d;

            i(Typeface typeface) {
                this.d = typeface;
            }

            @Override // java.lang.Runnable
            public void run() {
                d.this.g.b(this.d);
            }
        }

        d(Context context, b.i.l.a aVar, Handler handler, i iVar) {
            this.d = context;
            this.e = aVar;
            this.f = handler;
            this.g = iVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                g gVarD = b.d(this.d, null, this.e);
                if (gVarD.b() != 0) {
                    int r0 = gVarD.b();
                    if (r0 == 1) {
                        this.f.post(new RunnableC0062b());
                        return;
                    } else if (r0 != 2) {
                        this.f.post(new RunnableC0063d());
                        return;
                    } else {
                        this.f.post(new c());
                        return;
                    }
                }
                h[] hVarArrA = gVarD.a();
                if (hVarArrA == null || hVarArrA.length == 0) {
                    this.f.post(new e());
                    return;
                }
                for (h hVar : hVarArrA) {
                    if (hVar.a() != 0) {
                        int r02 = hVar.a();
                        if (r02 < 0) {
                            this.f.post(new f());
                            return;
                        } else {
                            this.f.post(new g(r02));
                            return;
                        }
                    }
                }
                Typeface typefaceA = b.a(this.d, null, hVarArrA);
                if (typefaceA == null) {
                    this.f.post(new h());
                } else {
                    this.f.post(new i(typefaceA));
                }
            } catch (PackageManager.NameNotFoundException unused) {
                this.f.post(new a());
            }
        }
    }

    class e implements Comparator<byte[]> {
        e() {
        }

        @Override // java.util.Comparator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public int compare(byte[] bArr, byte[] bArr2) {
            int length;
            int length2;
            if (bArr.length == bArr2.length) {
                for (int r1 = 0; r1 < bArr.length; r1++) {
                    if (bArr[r1] != bArr2[r1]) {
                        length = bArr[r1];
                        length2 = bArr2[r1];
                    }
                }
                return 0;
            }
            length = bArr.length;
            length2 = bArr2.length;
            return length - length2;
        }
    }

    public static final class f implements BaseColumns {

        /* renamed from: a, reason: collision with root package name */
        public static final String f1082a = "file_id";

        /* renamed from: b, reason: collision with root package name */
        public static final String f1083b = "font_ttc_index";

        /* renamed from: c, reason: collision with root package name */
        public static final String f1084c = "font_variation_settings";
        public static final String d = "font_weight";
        public static final String e = "font_italic";
        public static final String f = "result_code";
        public static final int g = 0;
        public static final int h = 1;
        public static final int i = 2;
        public static final int j = 3;
    }

    public static class g {

        /* renamed from: c, reason: collision with root package name */
        public static final int f1085c = 0;
        public static final int d = 1;
        public static final int e = 2;

        /* renamed from: a, reason: collision with root package name */
        private final int f1086a;

        /* renamed from: b, reason: collision with root package name */
        private final h[] f1087b;

        @p0({p0.a.LIBRARY_GROUP_PREFIX})
        public g(int r1, @i0 h[] hVarArr) {
            this.f1086a = r1;
            this.f1087b = hVarArr;
        }

        public h[] a() {
            return this.f1087b;
        }

        public int b() {
            return this.f1086a;
        }
    }

    public static class h {

        /* renamed from: a, reason: collision with root package name */
        private final Uri f1088a;

        /* renamed from: b, reason: collision with root package name */
        private final int f1089b;

        /* renamed from: c, reason: collision with root package name */
        private final int f1090c;
        private final boolean d;
        private final int e;

        @p0({p0.a.LIBRARY_GROUP_PREFIX})
        public h(@h0 Uri uri, @z(from = FabTransformationScrimBehavior.j) int r2, @z(from = 1, to = 1000) int r3, boolean z, int r5) {
            this.f1088a = (Uri) b.i.o.i.f(uri);
            this.f1089b = r2;
            this.f1090c = r3;
            this.d = z;
            this.e = r5;
        }

        public int a() {
            return this.e;
        }

        @z(from = FabTransformationScrimBehavior.j)
        public int b() {
            return this.f1089b;
        }

        @h0
        public Uri c() {
            return this.f1088a;
        }

        @z(from = 1, to = 1000)
        public int d() {
            return this.f1090c;
        }

        public boolean e() {
            return this.d;
        }
    }

    public static class i {

        /* renamed from: a, reason: collision with root package name */
        @p0({p0.a.LIBRARY_GROUP_PREFIX})
        public static final int f1091a = 0;

        /* renamed from: b, reason: collision with root package name */
        public static final int f1092b = -1;

        /* renamed from: c, reason: collision with root package name */
        public static final int f1093c = -2;
        public static final int d = -3;
        public static final int e = -4;
        public static final int f = 1;
        public static final int g = 2;
        public static final int h = 3;

        @Retention(RetentionPolicy.SOURCE)
        @p0({p0.a.LIBRARY_GROUP_PREFIX})
        public @interface a {
        }

        public void a(int r1) {
        }

        public void b(Typeface typeface) {
        }
    }

    private static final class j {

        /* renamed from: a, reason: collision with root package name */
        final Typeface f1094a;

        /* renamed from: b, reason: collision with root package name */
        final int f1095b;

        j(@i0 Typeface typeface, int r2) {
            this.f1094a = typeface;
            this.f1095b = r2;
        }
    }

    private b() {
    }

    @i0
    public static Typeface a(@h0 Context context, @i0 CancellationSignal cancellationSignal, @h0 h[] hVarArr) {
        return k.b(context, cancellationSignal, hVarArr, 0);
    }

    private static List<byte[]> b(Signature[] signatureArr) {
        ArrayList arrayList = new ArrayList();
        for (Signature signature : signatureArr) {
            arrayList.add(signature.toByteArray());
        }
        return arrayList;
    }

    private static boolean c(List<byte[]> list, List<byte[]> list2) {
        if (list.size() != list2.size()) {
            return false;
        }
        for (int r0 = 0; r0 < list.size(); r0++) {
            if (!Arrays.equals(list.get(r0), list2.get(r0))) {
                return false;
            }
        }
        return true;
    }

    @h0
    public static g d(@h0 Context context, @i0 CancellationSignal cancellationSignal, @h0 b.i.l.a aVar) throws PackageManager.NameNotFoundException {
        ProviderInfo providerInfoI = i(context.getPackageManager(), aVar, context.getResources());
        return providerInfoI == null ? new g(1, null) : new g(0, f(context, aVar, providerInfoI.authority, cancellationSignal));
    }

    private static List<List<byte[]>> e(b.i.l.a aVar, Resources resources) {
        return aVar.a() != null ? aVar.a() : b.i.c.j.d.c(resources, aVar.b());
    }

    @h0
    @x0
    static h[] f(Context context, b.i.l.a aVar, String str, CancellationSignal cancellationSignal) {
        ArrayList arrayList = new ArrayList();
        Uri uriBuild = new Uri.Builder().scheme(FirebaseAnalytics.b.R).authority(str).build();
        Uri uriBuild2 = new Uri.Builder().scheme(FirebaseAnalytics.b.R).authority(str).appendPath("file").build();
        Cursor cursorQuery = null;
        try {
            cursorQuery = Build.VERSION.SDK_INT > 16 ? context.getContentResolver().query(uriBuild, new String[]{"_id", f.f1082a, f.f1083b, f.f1084c, f.d, f.e, f.f}, "query = ?", new String[]{aVar.f()}, null, cancellationSignal) : context.getContentResolver().query(uriBuild, new String[]{"_id", f.f1082a, f.f1083b, f.f1084c, f.d, f.e, f.f}, "query = ?", new String[]{aVar.f()}, null);
            if (cursorQuery != null && cursorQuery.getCount() > 0) {
                int columnIndex = cursorQuery.getColumnIndex(f.f);
                ArrayList arrayList2 = new ArrayList();
                int columnIndex2 = cursorQuery.getColumnIndex("_id");
                int columnIndex3 = cursorQuery.getColumnIndex(f.f1082a);
                int columnIndex4 = cursorQuery.getColumnIndex(f.f1083b);
                int columnIndex5 = cursorQuery.getColumnIndex(f.d);
                int columnIndex6 = cursorQuery.getColumnIndex(f.e);
                while (cursorQuery.moveToNext()) {
                    int r19 = columnIndex != -1 ? cursorQuery.getInt(columnIndex) : 0;
                    arrayList2.add(new h(columnIndex3 == -1 ? ContentUris.withAppendedId(uriBuild, cursorQuery.getLong(columnIndex2)) : ContentUris.withAppendedId(uriBuild2, cursorQuery.getLong(columnIndex3)), columnIndex4 != -1 ? cursorQuery.getInt(columnIndex4) : 0, columnIndex5 != -1 ? cursorQuery.getInt(columnIndex5) : 400, columnIndex6 != -1 && cursorQuery.getInt(columnIndex6) == 1, r19));
                }
                arrayList = arrayList2;
            }
            return (h[]) arrayList.toArray(new h[0]);
        } finally {
            if (cursorQuery != null) {
                cursorQuery.close();
            }
        }
    }

    @h0
    static j g(Context context, b.i.l.a aVar, int r5) {
        try {
            g gVarD = d(context, null, aVar);
            if (gVarD.b() != 0) {
                return new j(null, gVarD.b() == 1 ? -2 : -3);
            }
            Typeface typefaceB = k.b(context, null, gVarD.a(), r5);
            return new j(typefaceB, typefaceB != null ? 0 : -3);
        } catch (PackageManager.NameNotFoundException unused) {
            return new j(null, -1);
        }
    }

    @p0({p0.a.LIBRARY_GROUP_PREFIX})
    public static Typeface h(Context context, b.i.l.a aVar, @i0 g.a aVar2, @i0 Handler handler, boolean z, int r7, int r8) {
        String str = aVar.c() + "-" + r8;
        Typeface typefaceF = d.f(str);
        if (typefaceF != null) {
            if (aVar2 != null) {
                aVar2.d(typefaceF);
            }
            return typefaceF;
        }
        if (z && r7 == -1) {
            j jVarG = g(context, aVar, r8);
            if (aVar2 != null) {
                int r3 = jVarG.f1095b;
                if (r3 == 0) {
                    aVar2.b(jVarG.f1094a, handler);
                } else {
                    aVar2.a(r3, handler);
                }
            }
            return jVarG.f1094a;
        }
        a aVar3 = new a(context, aVar, r8, str);
        if (z) {
            try {
                return ((j) f.g(aVar3, r7)).f1094a;
            } catch (InterruptedException unused) {
                return null;
            }
        }
        C0061b c0061b = aVar2 == null ? null : new C0061b(aVar2, handler);
        synchronized (g) {
            ArrayList<c.d<j>> arrayList = h.get(str);
            if (arrayList != null) {
                if (c0061b != null) {
                    arrayList.add(c0061b);
                }
                return null;
            }
            if (c0061b != null) {
                ArrayList<c.d<j>> arrayList2 = new ArrayList<>();
                arrayList2.add(c0061b);
                h.put(str, arrayList2);
            }
            f.f(aVar3, new c(str));
            return null;
        }
    }

    @i0
    @p0({p0.a.LIBRARY_GROUP_PREFIX})
    @x0
    public static ProviderInfo i(@h0 PackageManager packageManager, @h0 b.i.l.a aVar, @i0 Resources resources) throws PackageManager.NameNotFoundException {
        String strD = aVar.d();
        ProviderInfo providerInfoResolveContentProvider = packageManager.resolveContentProvider(strD, 0);
        if (providerInfoResolveContentProvider == null) {
            throw new PackageManager.NameNotFoundException("No package found for authority: " + strD);
        }
        if (!providerInfoResolveContentProvider.packageName.equals(aVar.e())) {
            throw new PackageManager.NameNotFoundException("Found content provider " + strD + ", but package was not " + aVar.e());
        }
        List<byte[]> listB = b(packageManager.getPackageInfo(providerInfoResolveContentProvider.packageName, 64).signatures);
        Collections.sort(listB, i);
        List<List<byte[]>> listE = e(aVar, resources);
        for (int r1 = 0; r1 < listE.size(); r1++) {
            ArrayList arrayList = new ArrayList(listE.get(r1));
            Collections.sort(arrayList, i);
            if (c(listB, arrayList)) {
                return providerInfoResolveContentProvider;
            }
        }
        return null;
    }

    @m0(19)
    @p0({p0.a.LIBRARY_GROUP_PREFIX})
    public static Map<Uri, ByteBuffer> j(Context context, h[] hVarArr, CancellationSignal cancellationSignal) {
        HashMap map = new HashMap();
        for (h hVar : hVarArr) {
            if (hVar.a() == 0) {
                Uri uriC = hVar.c();
                if (!map.containsKey(uriC)) {
                    map.put(uriC, r.f(context, cancellationSignal, uriC));
                }
            }
        }
        return Collections.unmodifiableMap(map);
    }

    public static void k(@h0 Context context, @h0 b.i.l.a aVar, @h0 i iVar, @h0 Handler handler) {
        l(context.getApplicationContext(), aVar, iVar, handler);
    }

    private static void l(@h0 Context context, @h0 b.i.l.a aVar, @h0 i iVar, @h0 Handler handler) {
        handler.post(new d(context, aVar, new Handler(), iVar));
    }

    @p0({p0.a.LIBRARY_GROUP_PREFIX})
    public static void m() {
        d.d();
    }
}

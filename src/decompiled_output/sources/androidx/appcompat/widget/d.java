package androidx.appcompat.widget;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.ResolveInfo;
import android.database.DataSetObservable;
import android.os.AsyncTask;
import android.text.TextUtils;
import android.util.Log;
import android.util.Xml;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.xmlpull.v1.XmlSerializer;

/* loaded from: classes.dex */
class d extends DataSetObservable {
    static final boolean n = false;
    static final String p = "historical-records";
    static final String q = "historical-record";
    static final String r = "activity";
    static final String s = "time";
    static final String t = "weight";
    public static final String u = "activity_choser_model_history.xml";
    public static final int v = 50;
    private static final int w = 5;
    private static final float x = 1.0f;
    private static final String y = ".xml";
    private static final int z = -1;
    final Context d;
    final String e;
    private Intent f;
    private f m;
    static final String o = d.class.getSimpleName();
    private static final Object A = new Object();
    private static final Map<String, d> B = new HashMap();

    /* renamed from: a, reason: collision with root package name */
    private final Object f136a = new Object();

    /* renamed from: b, reason: collision with root package name */
    private final List<b> f137b = new ArrayList();

    /* renamed from: c, reason: collision with root package name */
    private final List<e> f138c = new ArrayList();
    private c g = new C0018d();
    private int h = 50;
    boolean i = true;
    private boolean j = false;
    private boolean k = true;
    private boolean l = false;

    public interface a {
        void setActivityChooserModel(d dVar);
    }

    public static final class b implements Comparable<b> {
        public final ResolveInfo d;
        public float e;

        public b(ResolveInfo resolveInfo) {
            this.d = resolveInfo;
        }

        @Override // java.lang.Comparable
        /* renamed from: e, reason: merged with bridge method [inline-methods] */
        public int compareTo(b bVar) {
            return Float.floatToIntBits(bVar.e) - Float.floatToIntBits(this.e);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return obj != null && b.class == obj.getClass() && Float.floatToIntBits(this.e) == Float.floatToIntBits(((b) obj).e);
        }

        public int hashCode() {
            return Float.floatToIntBits(this.e) + 31;
        }

        public String toString() {
            return "[resolveInfo:" + this.d.toString() + "; weight:" + new BigDecimal(this.e) + "]";
        }
    }

    public interface c {
        void a(Intent intent, List<b> list, List<e> list2);
    }

    /* renamed from: androidx.appcompat.widget.d$d, reason: collision with other inner class name */
    private static final class C0018d implements c {

        /* renamed from: b, reason: collision with root package name */
        private static final float f139b = 0.95f;

        /* renamed from: a, reason: collision with root package name */
        private final Map<ComponentName, b> f140a = new HashMap();

        C0018d() {
        }

        @Override // androidx.appcompat.widget.d.c
        public void a(Intent intent, List<b> list, List<e> list2) {
            Map<ComponentName, b> map = this.f140a;
            map.clear();
            int size = list.size();
            for (int r1 = 0; r1 < size; r1++) {
                b bVar = list.get(r1);
                bVar.e = 0.0f;
                ActivityInfo activityInfo = bVar.d.activityInfo;
                map.put(new ComponentName(activityInfo.packageName, activityInfo.name), bVar);
            }
            float f = 1.0f;
            for (int size2 = list2.size() - 1; size2 >= 0; size2--) {
                e eVar = list2.get(size2);
                b bVar2 = map.get(eVar.f141a);
                if (bVar2 != null) {
                    bVar2.e += eVar.f143c * f;
                    f *= f139b;
                }
            }
            Collections.sort(list);
        }
    }

    public static final class e {

        /* renamed from: a, reason: collision with root package name */
        public final ComponentName f141a;

        /* renamed from: b, reason: collision with root package name */
        public final long f142b;

        /* renamed from: c, reason: collision with root package name */
        public final float f143c;

        public e(ComponentName componentName, long j, float f) {
            this.f141a = componentName;
            this.f142b = j;
            this.f143c = f;
        }

        public e(String str, long j, float f) {
            this(ComponentName.unflattenFromString(str), j, f);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || e.class != obj.getClass()) {
                return false;
            }
            e eVar = (e) obj;
            ComponentName componentName = this.f141a;
            if (componentName == null) {
                if (eVar.f141a != null) {
                    return false;
                }
            } else if (!componentName.equals(eVar.f141a)) {
                return false;
            }
            return this.f142b == eVar.f142b && Float.floatToIntBits(this.f143c) == Float.floatToIntBits(eVar.f143c);
        }

        public int hashCode() {
            ComponentName componentName = this.f141a;
            int r0 = componentName == null ? 0 : componentName.hashCode();
            long j = this.f142b;
            return ((((r0 + 31) * 31) + ((int) (j ^ (j >>> 32)))) * 31) + Float.floatToIntBits(this.f143c);
        }

        public String toString() {
            return "[; activity:" + this.f141a + "; time:" + this.f142b + "; weight:" + new BigDecimal(this.f143c) + "]";
        }
    }

    public interface f {
        boolean a(d dVar, Intent intent);
    }

    private final class g extends AsyncTask<Object, Void, Void> {
        g() {
        }

        @Override // android.os.AsyncTask
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public Void doInBackground(Object... objArr) throws IOException {
            List list = (List) objArr[0];
            String str = (String) objArr[1];
            try {
                FileOutputStream fileOutputStreamOpenFileOutput = d.this.d.openFileOutput(str, 0);
                XmlSerializer xmlSerializerNewSerializer = Xml.newSerializer();
                try {
                    try {
                        try {
                            xmlSerializerNewSerializer.setOutput(fileOutputStreamOpenFileOutput, null);
                            xmlSerializerNewSerializer.startDocument("UTF-8", Boolean.TRUE);
                            xmlSerializerNewSerializer.startTag(null, d.p);
                            int size = list.size();
                            for (int r9 = 0; r9 < size; r9++) {
                                e eVar = (e) list.remove(0);
                                xmlSerializerNewSerializer.startTag(null, d.q);
                                xmlSerializerNewSerializer.attribute(null, d.r, eVar.f141a.flattenToString());
                                xmlSerializerNewSerializer.attribute(null, d.s, String.valueOf(eVar.f142b));
                                xmlSerializerNewSerializer.attribute(null, d.t, String.valueOf(eVar.f143c));
                                xmlSerializerNewSerializer.endTag(null, d.q);
                            }
                            xmlSerializerNewSerializer.endTag(null, d.p);
                            xmlSerializerNewSerializer.endDocument();
                            d.this.i = true;
                        } catch (Throwable th) {
                            d.this.i = true;
                            if (fileOutputStreamOpenFileOutput != null) {
                                try {
                                    fileOutputStreamOpenFileOutput.close();
                                } catch (IOException unused) {
                                }
                            }
                            throw th;
                        }
                    } catch (IOException e) {
                        Log.e(d.o, "Error writing historical record file: " + d.this.e, e);
                        d.this.i = true;
                        if (fileOutputStreamOpenFileOutput != null) {
                        }
                    }
                } catch (IllegalArgumentException e2) {
                    Log.e(d.o, "Error writing historical record file: " + d.this.e, e2);
                    d.this.i = true;
                    if (fileOutputStreamOpenFileOutput != null) {
                    }
                } catch (IllegalStateException e3) {
                    Log.e(d.o, "Error writing historical record file: " + d.this.e, e3);
                    d.this.i = true;
                    if (fileOutputStreamOpenFileOutput != null) {
                    }
                }
                if (fileOutputStreamOpenFileOutput != null) {
                    try {
                        fileOutputStreamOpenFileOutput.close();
                    } catch (IOException unused2) {
                    }
                }
                return null;
            } catch (FileNotFoundException e4) {
                Log.e(d.o, "Error writing historical record file: " + str, e4);
                return null;
            }
        }
    }

    private d(Context context, String str) {
        this.d = context.getApplicationContext();
        if (TextUtils.isEmpty(str) || str.endsWith(y)) {
            this.e = str;
            return;
        }
        this.e = str + y;
    }

    private boolean a(e eVar) {
        boolean zAdd = this.f138c.add(eVar);
        if (zAdd) {
            this.k = true;
            n();
            m();
            v();
            notifyChanged();
        }
        return zAdd;
    }

    private void c() {
        boolean zL = l() | o();
        n();
        if (zL) {
            v();
            notifyChanged();
        }
    }

    public static d d(Context context, String str) {
        d dVar;
        synchronized (A) {
            dVar = B.get(str);
            if (dVar == null) {
                dVar = new d(context, str);
                B.put(str, dVar);
            }
        }
        return dVar;
    }

    private boolean l() {
        if (!this.l || this.f == null) {
            return false;
        }
        this.l = false;
        this.f137b.clear();
        List<ResolveInfo> listQueryIntentActivities = this.d.getPackageManager().queryIntentActivities(this.f, 0);
        int size = listQueryIntentActivities.size();
        for (int r1 = 0; r1 < size; r1++) {
            this.f137b.add(new b(listQueryIntentActivities.get(r1)));
        }
        return true;
    }

    private void m() {
        if (!this.j) {
            throw new IllegalStateException("No preceding call to #readHistoricalData");
        }
        if (this.k) {
            this.k = false;
            if (TextUtils.isEmpty(this.e)) {
                return;
            }
            new g().executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, new ArrayList(this.f138c), this.e);
        }
    }

    private void n() {
        int size = this.f138c.size() - this.h;
        if (size <= 0) {
            return;
        }
        this.k = true;
        for (int r2 = 0; r2 < size; r2++) {
            this.f138c.remove(0);
        }
    }

    private boolean o() throws IOException {
        if (!this.i || !this.k || TextUtils.isEmpty(this.e)) {
            return false;
        }
        this.i = false;
        this.j = true;
        p();
        return true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x0038, code lost:
    
        r1.close();
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:?, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:?, code lost:
    
        return;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void p() throws java.io.IOException {
        /*
            r10 = this;
            java.lang.String r0 = "Error reading historical recrod file: "
            android.content.Context r1 = r10.d     // Catch: java.io.FileNotFoundException -> Lc2
            java.lang.String r2 = r10.e     // Catch: java.io.FileNotFoundException -> Lc2
            java.io.FileInputStream r1 = r1.openFileInput(r2)     // Catch: java.io.FileNotFoundException -> Lc2
            org.xmlpull.v1.XmlPullParser r2 = android.util.Xml.newPullParser()     // Catch: java.lang.Throwable -> L84 java.io.IOException -> L86 org.xmlpull.v1.XmlPullParserException -> La0
            java.lang.String r3 = "UTF-8"
            r2.setInput(r1, r3)     // Catch: java.lang.Throwable -> L84 java.io.IOException -> L86 org.xmlpull.v1.XmlPullParserException -> La0
            r3 = 0
        L14:
            r4 = 1
            if (r3 == r4) goto L1f
            r5 = 2
            if (r3 == r5) goto L1f
            int r3 = r2.next()     // Catch: java.lang.Throwable -> L84 java.io.IOException -> L86 org.xmlpull.v1.XmlPullParserException -> La0
            goto L14
        L1f:
            java.lang.String r3 = "historical-records"
            java.lang.String r5 = r2.getName()     // Catch: java.lang.Throwable -> L84 java.io.IOException -> L86 org.xmlpull.v1.XmlPullParserException -> La0
            boolean r3 = r3.equals(r5)     // Catch: java.lang.Throwable -> L84 java.io.IOException -> L86 org.xmlpull.v1.XmlPullParserException -> La0
            if (r3 == 0) goto L7c
            java.util.List<androidx.appcompat.widget.d$e> r3 = r10.f138c     // Catch: java.lang.Throwable -> L84 java.io.IOException -> L86 org.xmlpull.v1.XmlPullParserException -> La0
            r3.clear()     // Catch: java.lang.Throwable -> L84 java.io.IOException -> L86 org.xmlpull.v1.XmlPullParserException -> La0
        L30:
            int r5 = r2.next()     // Catch: java.lang.Throwable -> L84 java.io.IOException -> L86 org.xmlpull.v1.XmlPullParserException -> La0
            if (r5 != r4) goto L3d
            if (r1 == 0) goto Lbb
        L38:
            r1.close()     // Catch: java.io.IOException -> Lbb
            goto Lbb
        L3d:
            r6 = 3
            if (r5 == r6) goto L30
            r6 = 4
            if (r5 != r6) goto L44
            goto L30
        L44:
            java.lang.String r5 = r2.getName()     // Catch: java.lang.Throwable -> L84 java.io.IOException -> L86 org.xmlpull.v1.XmlPullParserException -> La0
            java.lang.String r6 = "historical-record"
            boolean r5 = r6.equals(r5)     // Catch: java.lang.Throwable -> L84 java.io.IOException -> L86 org.xmlpull.v1.XmlPullParserException -> La0
            if (r5 == 0) goto L74
            java.lang.String r5 = "activity"
            r6 = 0
            java.lang.String r5 = r2.getAttributeValue(r6, r5)     // Catch: java.lang.Throwable -> L84 java.io.IOException -> L86 org.xmlpull.v1.XmlPullParserException -> La0
            java.lang.String r7 = "time"
            java.lang.String r7 = r2.getAttributeValue(r6, r7)     // Catch: java.lang.Throwable -> L84 java.io.IOException -> L86 org.xmlpull.v1.XmlPullParserException -> La0
            long r7 = java.lang.Long.parseLong(r7)     // Catch: java.lang.Throwable -> L84 java.io.IOException -> L86 org.xmlpull.v1.XmlPullParserException -> La0
            java.lang.String r9 = "weight"
            java.lang.String r6 = r2.getAttributeValue(r6, r9)     // Catch: java.lang.Throwable -> L84 java.io.IOException -> L86 org.xmlpull.v1.XmlPullParserException -> La0
            float r6 = java.lang.Float.parseFloat(r6)     // Catch: java.lang.Throwable -> L84 java.io.IOException -> L86 org.xmlpull.v1.XmlPullParserException -> La0
            androidx.appcompat.widget.d$e r9 = new androidx.appcompat.widget.d$e     // Catch: java.lang.Throwable -> L84 java.io.IOException -> L86 org.xmlpull.v1.XmlPullParserException -> La0
            r9.<init>(r5, r7, r6)     // Catch: java.lang.Throwable -> L84 java.io.IOException -> L86 org.xmlpull.v1.XmlPullParserException -> La0
            r3.add(r9)     // Catch: java.lang.Throwable -> L84 java.io.IOException -> L86 org.xmlpull.v1.XmlPullParserException -> La0
            goto L30
        L74:
            org.xmlpull.v1.XmlPullParserException r2 = new org.xmlpull.v1.XmlPullParserException     // Catch: java.lang.Throwable -> L84 java.io.IOException -> L86 org.xmlpull.v1.XmlPullParserException -> La0
            java.lang.String r3 = "Share records file not well-formed."
            r2.<init>(r3)     // Catch: java.lang.Throwable -> L84 java.io.IOException -> L86 org.xmlpull.v1.XmlPullParserException -> La0
            throw r2     // Catch: java.lang.Throwable -> L84 java.io.IOException -> L86 org.xmlpull.v1.XmlPullParserException -> La0
        L7c:
            org.xmlpull.v1.XmlPullParserException r2 = new org.xmlpull.v1.XmlPullParserException     // Catch: java.lang.Throwable -> L84 java.io.IOException -> L86 org.xmlpull.v1.XmlPullParserException -> La0
            java.lang.String r3 = "Share records file does not start with historical-records tag."
            r2.<init>(r3)     // Catch: java.lang.Throwable -> L84 java.io.IOException -> L86 org.xmlpull.v1.XmlPullParserException -> La0
            throw r2     // Catch: java.lang.Throwable -> L84 java.io.IOException -> L86 org.xmlpull.v1.XmlPullParserException -> La0
        L84:
            r0 = move-exception
            goto Lbc
        L86:
            r2 = move-exception
            java.lang.String r3 = androidx.appcompat.widget.d.o     // Catch: java.lang.Throwable -> L84
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L84
            r4.<init>()     // Catch: java.lang.Throwable -> L84
            r4.append(r0)     // Catch: java.lang.Throwable -> L84
            java.lang.String r0 = r10.e     // Catch: java.lang.Throwable -> L84
            r4.append(r0)     // Catch: java.lang.Throwable -> L84
            java.lang.String r0 = r4.toString()     // Catch: java.lang.Throwable -> L84
            android.util.Log.e(r3, r0, r2)     // Catch: java.lang.Throwable -> L84
            if (r1 == 0) goto Lbb
            goto L38
        La0:
            r2 = move-exception
            java.lang.String r3 = androidx.appcompat.widget.d.o     // Catch: java.lang.Throwable -> L84
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L84
            r4.<init>()     // Catch: java.lang.Throwable -> L84
            r4.append(r0)     // Catch: java.lang.Throwable -> L84
            java.lang.String r0 = r10.e     // Catch: java.lang.Throwable -> L84
            r4.append(r0)     // Catch: java.lang.Throwable -> L84
            java.lang.String r0 = r4.toString()     // Catch: java.lang.Throwable -> L84
            android.util.Log.e(r3, r0, r2)     // Catch: java.lang.Throwable -> L84
            if (r1 == 0) goto Lbb
            goto L38
        Lbb:
            return
        Lbc:
            if (r1 == 0) goto Lc1
            r1.close()     // Catch: java.io.IOException -> Lc1
        Lc1:
            throw r0
        Lc2:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.d.p():void");
    }

    private boolean v() {
        if (this.g == null || this.f == null || this.f137b.isEmpty() || this.f138c.isEmpty()) {
            return false;
        }
        this.g.a(this.f, this.f137b, Collections.unmodifiableList(this.f138c));
        return true;
    }

    public Intent b(int r7) {
        synchronized (this.f136a) {
            if (this.f == null) {
                return null;
            }
            c();
            b bVar = this.f137b.get(r7);
            ComponentName componentName = new ComponentName(bVar.d.activityInfo.packageName, bVar.d.activityInfo.name);
            Intent intent = new Intent(this.f);
            intent.setComponent(componentName);
            if (this.m != null) {
                if (this.m.a(this, new Intent(intent))) {
                    return null;
                }
            }
            a(new e(componentName, System.currentTimeMillis(), 1.0f));
            return intent;
        }
    }

    public ResolveInfo e(int r3) {
        ResolveInfo resolveInfo;
        synchronized (this.f136a) {
            c();
            resolveInfo = this.f137b.get(r3).d;
        }
        return resolveInfo;
    }

    public int f() {
        int size;
        synchronized (this.f136a) {
            c();
            size = this.f137b.size();
        }
        return size;
    }

    public int g(ResolveInfo resolveInfo) {
        synchronized (this.f136a) {
            c();
            List<b> list = this.f137b;
            int size = list.size();
            for (int r3 = 0; r3 < size; r3++) {
                if (list.get(r3).d == resolveInfo) {
                    return r3;
                }
            }
            return -1;
        }
    }

    public ResolveInfo h() {
        synchronized (this.f136a) {
            c();
            if (this.f137b.isEmpty()) {
                return null;
            }
            return this.f137b.get(0).d;
        }
    }

    public int i() {
        int r1;
        synchronized (this.f136a) {
            r1 = this.h;
        }
        return r1;
    }

    public int j() {
        int size;
        synchronized (this.f136a) {
            c();
            size = this.f138c.size();
        }
        return size;
    }

    public Intent k() {
        Intent intent;
        synchronized (this.f136a) {
            intent = this.f;
        }
        return intent;
    }

    public void q(c cVar) {
        synchronized (this.f136a) {
            if (this.g == cVar) {
                return;
            }
            this.g = cVar;
            if (v()) {
                notifyChanged();
            }
        }
    }

    public void r(int r6) {
        synchronized (this.f136a) {
            c();
            b bVar = this.f137b.get(r6);
            b bVar2 = this.f137b.get(0);
            a(new e(new ComponentName(bVar.d.activityInfo.packageName, bVar.d.activityInfo.name), System.currentTimeMillis(), bVar2 != null ? (bVar2.e - bVar.e) + 5.0f : 1.0f));
        }
    }

    public void s(int r3) {
        synchronized (this.f136a) {
            if (this.h == r3) {
                return;
            }
            this.h = r3;
            n();
            if (v()) {
                notifyChanged();
            }
        }
    }

    public void t(Intent intent) {
        synchronized (this.f136a) {
            if (this.f == intent) {
                return;
            }
            this.f = intent;
            this.l = true;
            c();
        }
    }

    public void u(f fVar) {
        synchronized (this.f136a) {
            this.m = fVar;
        }
    }
}

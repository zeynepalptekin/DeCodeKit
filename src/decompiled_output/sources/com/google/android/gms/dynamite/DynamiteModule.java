package com.google.android.gms.dynamite;

import android.content.Context;
import android.database.Cursor;
import android.os.Build;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import android.util.Log;
import androidx.annotation.RecentlyNonNull;
import androidx.annotation.RecentlyNullable;
import androidx.annotation.i0;
import com.google.android.gms.common.internal.q;
import com.google.android.gms.common.internal.r;
import com.google.android.gms.common.util.DynamiteApi;
import dalvik.system.DelegateLastClassLoader;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import javax.annotation.concurrent.GuardedBy;

@com.google.android.gms.common.annotation.a
/* loaded from: classes.dex */
public final class DynamiteModule {

    /* renamed from: b, reason: collision with root package name */
    @i0
    @GuardedBy("DynamiteModule.class")
    private static Boolean f2600b = null;

    /* renamed from: c, reason: collision with root package name */
    @i0
    @GuardedBy("DynamiteModule.class")
    private static k f2601c = null;

    @i0
    @GuardedBy("DynamiteModule.class")
    private static m d = null;

    @i0
    @GuardedBy("DynamiteModule.class")
    private static String e = null;

    @GuardedBy("DynamiteModule.class")
    private static int f = -1;
    private static final ThreadLocal<c> g = new ThreadLocal<>();
    private static final b.InterfaceC0171b h = new com.google.android.gms.dynamite.b();

    @RecentlyNonNull
    @com.google.android.gms.common.annotation.a
    public static final b i = new com.google.android.gms.dynamite.a();

    @RecentlyNonNull
    @com.google.android.gms.common.annotation.a
    public static final b j = new com.google.android.gms.dynamite.d();

    @RecentlyNonNull
    @com.google.android.gms.common.annotation.a
    public static final b k = new com.google.android.gms.dynamite.c();

    @RecentlyNonNull
    @com.google.android.gms.common.annotation.a
    public static final b l = new f();

    @RecentlyNonNull
    @com.google.android.gms.common.annotation.a
    public static final b m = new e();

    @RecentlyNonNull
    @com.google.android.gms.common.annotation.a
    public static final b n = new h();
    private static final b o = new g();

    /* renamed from: a, reason: collision with root package name */
    private final Context f2602a;

    @DynamiteApi
    public static class DynamiteLoaderClassLoader {

        @RecentlyNullable
        @GuardedBy("DynamiteLoaderClassLoader.class")
        public static ClassLoader sClassLoader;
    }

    @com.google.android.gms.common.annotation.a
    public static class a extends Exception {
        private a(String str) {
            super(str);
        }

        /* synthetic */ a(String str, com.google.android.gms.dynamite.b bVar) {
            this(str);
        }

        private a(String str, Throwable th) {
            super(str, th);
        }

        /* synthetic */ a(String str, Throwable th, com.google.android.gms.dynamite.b bVar) {
            this(str, th);
        }
    }

    public interface b {

        public static class a {

            /* renamed from: a, reason: collision with root package name */
            public int f2603a = 0;

            /* renamed from: b, reason: collision with root package name */
            public int f2604b = 0;

            /* renamed from: c, reason: collision with root package name */
            public int f2605c = 0;
        }

        /* renamed from: com.google.android.gms.dynamite.DynamiteModule$b$b, reason: collision with other inner class name */
        public interface InterfaceC0171b {
            int a(Context context, String str, boolean z) throws a;

            int b(Context context, String str);
        }

        a a(Context context, String str, InterfaceC0171b interfaceC0171b) throws a;
    }

    private static class c {

        /* renamed from: a, reason: collision with root package name */
        public Cursor f2606a;

        private c() {
        }

        /* synthetic */ c(com.google.android.gms.dynamite.b bVar) {
            this();
        }
    }

    private static class d implements b.InterfaceC0171b {

        /* renamed from: a, reason: collision with root package name */
        private final int f2607a;

        /* renamed from: b, reason: collision with root package name */
        private final int f2608b = 0;

        public d(int r1, int r2) {
            this.f2607a = r1;
        }

        @Override // com.google.android.gms.dynamite.DynamiteModule.b.InterfaceC0171b
        public final int a(Context context, String str, boolean z) {
            return 0;
        }

        @Override // com.google.android.gms.dynamite.DynamiteModule.b.InterfaceC0171b
        public final int b(Context context, String str) {
            return this.f2607a;
        }
    }

    private DynamiteModule(Context context) {
        this.f2602a = (Context) r.k(context);
    }

    @RecentlyNonNull
    @com.google.android.gms.common.annotation.a
    public static int a(@RecentlyNonNull Context context, @RecentlyNonNull String str) {
        try {
            ClassLoader classLoader = context.getApplicationContext().getClassLoader();
            StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 61);
            sb.append("com.google.android.gms.dynamite.descriptors.");
            sb.append(str);
            sb.append(".ModuleDescriptor");
            Class<?> clsLoadClass = classLoader.loadClass(sb.toString());
            Field declaredField = clsLoadClass.getDeclaredField("MODULE_ID");
            Field declaredField2 = clsLoadClass.getDeclaredField("MODULE_VERSION");
            if (q.b(declaredField.get(null), str)) {
                return declaredField2.getInt(null);
            }
            String strValueOf = String.valueOf(declaredField.get(null));
            StringBuilder sb2 = new StringBuilder(String.valueOf(strValueOf).length() + 51 + String.valueOf(str).length());
            sb2.append("Module descriptor id '");
            sb2.append(strValueOf);
            sb2.append("' didn't match expected id '");
            sb2.append(str);
            sb2.append("'");
            Log.e("DynamiteModule", sb2.toString());
            return 0;
        } catch (ClassNotFoundException unused) {
            StringBuilder sb3 = new StringBuilder(String.valueOf(str).length() + 45);
            sb3.append("Local module descriptor class for ");
            sb3.append(str);
            sb3.append(" not found.");
            Log.w("DynamiteModule", sb3.toString());
            return 0;
        } catch (Exception e2) {
            String strValueOf2 = String.valueOf(e2.getMessage());
            Log.e("DynamiteModule", strValueOf2.length() != 0 ? "Failed to load module descriptor class: ".concat(strValueOf2) : new String("Failed to load module descriptor class: "));
            return 0;
        }
    }

    @RecentlyNonNull
    @com.google.android.gms.common.annotation.a
    public static int c(@RecentlyNonNull Context context, @RecentlyNonNull String str) {
        return f(context, str, false);
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x007e A[DONT_GENERATE, PHI: r10 r11
  0x007e: PHI (r10v9 com.google.android.gms.dynamite.DynamiteModule) = 
  (r10v5 com.google.android.gms.dynamite.DynamiteModule)
  (r10v6 com.google.android.gms.dynamite.DynamiteModule)
  (r10v10 com.google.android.gms.dynamite.DynamiteModule)
 binds: [B:38:0x00cf, B:25:0x0093, B:17:0x007c] A[DONT_GENERATE, DONT_INLINE]
  0x007e: PHI (r11v15 android.database.Cursor) = (r11v10 android.database.Cursor), (r11v11 android.database.Cursor), (r11v16 android.database.Cursor) binds: [B:38:0x00cf, B:25:0x0093, B:17:0x007c] A[DONT_GENERATE, DONT_INLINE]] */
    @androidx.annotation.RecentlyNonNull
    @com.google.android.gms.common.annotation.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static com.google.android.gms.dynamite.DynamiteModule e(@androidx.annotation.RecentlyNonNull android.content.Context r10, @androidx.annotation.RecentlyNonNull com.google.android.gms.dynamite.DynamiteModule.b r11, @androidx.annotation.RecentlyNonNull java.lang.String r12) throws com.google.android.gms.dynamite.DynamiteModule.a {
        /*
            Method dump skipped, instructions count: 301
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.dynamite.DynamiteModule.e(android.content.Context, com.google.android.gms.dynamite.DynamiteModule$b, java.lang.String):com.google.android.gms.dynamite.DynamiteModule");
    }

    @RecentlyNonNull
    public static int f(@RecentlyNonNull Context context, @RecentlyNonNull String str, @RecentlyNonNull boolean z) {
        Field declaredField;
        try {
            synchronized (DynamiteModule.class) {
                Boolean bool = f2600b;
                if (bool == null) {
                    try {
                        declaredField = context.getApplicationContext().getClassLoader().loadClass(DynamiteLoaderClassLoader.class.getName()).getDeclaredField("sClassLoader");
                    } catch (ClassNotFoundException | IllegalAccessException | NoSuchFieldException e2) {
                        String strValueOf = String.valueOf(e2);
                        StringBuilder sb = new StringBuilder(String.valueOf(strValueOf).length() + 30);
                        sb.append("Failed to load module via V2: ");
                        sb.append(strValueOf);
                        Log.w("DynamiteModule", sb.toString());
                        bool = Boolean.FALSE;
                    }
                    synchronized (declaredField.getDeclaringClass()) {
                        ClassLoader classLoader = (ClassLoader) declaredField.get(null);
                        if (classLoader != null) {
                            if (classLoader != ClassLoader.getSystemClassLoader()) {
                                try {
                                    k(classLoader);
                                } catch (a unused) {
                                }
                                bool = Boolean.TRUE;
                            }
                            f2600b = bool;
                        } else if ("com.google.android.gms".equals(context.getApplicationContext().getPackageName())) {
                            declaredField.set(null, ClassLoader.getSystemClassLoader());
                        } else {
                            try {
                                int r4 = o(context, str, z);
                                if (e != null && !e.isEmpty()) {
                                    ClassLoader delegateLastClassLoader = Build.VERSION.SDK_INT >= 29 ? new DelegateLastClassLoader((String) r.k(e), ClassLoader.getSystemClassLoader()) : new i((String) r.k(e), ClassLoader.getSystemClassLoader());
                                    k(delegateLastClassLoader);
                                    declaredField.set(null, delegateLastClassLoader);
                                    f2600b = Boolean.TRUE;
                                    return r4;
                                }
                                return r4;
                            } catch (a unused2) {
                                declaredField.set(null, ClassLoader.getSystemClassLoader());
                            }
                        }
                        bool = Boolean.FALSE;
                        f2600b = bool;
                    }
                }
                if (!bool.booleanValue()) {
                    return m(context, str, z);
                }
                try {
                    return o(context, str, z);
                } catch (a e3) {
                    String strValueOf2 = String.valueOf(e3.getMessage());
                    Log.w("DynamiteModule", strValueOf2.length() != 0 ? "Failed to retrieve remote module version: ".concat(strValueOf2) : new String("Failed to retrieve remote module version: "));
                    return 0;
                }
            }
        } catch (Throwable th) {
            com.google.android.gms.common.util.i.a(context, th);
            throw th;
        }
    }

    private static DynamiteModule g(Context context, String str) {
        String strValueOf = String.valueOf(str);
        Log.i("DynamiteModule", strValueOf.length() != 0 ? "Selected local version of ".concat(strValueOf) : new String("Selected local version of "));
        return new DynamiteModule(context.getApplicationContext());
    }

    private static DynamiteModule h(Context context, String str, int r6) throws a {
        Boolean bool;
        c.a.b.b.e.c cVarI6;
        com.google.android.gms.dynamite.b bVar = null;
        try {
            synchronized (DynamiteModule.class) {
                bool = f2600b;
            }
            if (bool == null) {
                throw new a("Failed to determine which loading route to use.", bVar);
            }
            if (bool.booleanValue()) {
                return n(context, str, r6);
            }
            StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 51);
            sb.append("Selected remote version of ");
            sb.append(str);
            sb.append(", version >= ");
            sb.append(r6);
            Log.i("DynamiteModule", sb.toString());
            k kVarI = i(context);
            if (kVarI == null) {
                throw new a("Failed to create IDynamiteLoader.", bVar);
            }
            int r2 = kVarI.b();
            if (r2 >= 3) {
                c cVar = g.get();
                if (cVar == null) {
                    throw new a("No cached result cursor holder", bVar);
                }
                cVarI6 = kVarI.P0(c.a.b.b.e.e.i2(context), str, r6, c.a.b.b.e.e.i2(cVar.f2606a));
            } else if (r2 == 2) {
                Log.w("DynamiteModule", "IDynamite loader version = 2");
                cVarI6 = kVarI.e4(c.a.b.b.e.e.i2(context), str, r6);
            } else {
                Log.w("DynamiteModule", "Dynamite loader version < 2, falling back to createModuleContext");
                cVarI6 = kVarI.i6(c.a.b.b.e.e.i2(context), str, r6);
            }
            if (c.a.b.b.e.e.e2(cVarI6) != null) {
                return new DynamiteModule((Context) c.a.b.b.e.e.e2(cVarI6));
            }
            throw new a("Failed to load remote module.", bVar);
        } catch (RemoteException e2) {
            throw new a("Failed to load remote module.", e2, bVar);
        } catch (a e3) {
            throw e3;
        } catch (Throwable th) {
            com.google.android.gms.common.util.i.a(context, th);
            throw new a("Failed to load remote module.", th, bVar);
        }
    }

    @i0
    private static k i(Context context) {
        k jVar;
        synchronized (DynamiteModule.class) {
            if (f2601c != null) {
                return f2601c;
            }
            try {
                IBinder iBinder = (IBinder) context.createPackageContext("com.google.android.gms", 3).getClassLoader().loadClass("com.google.android.gms.chimera.container.DynamiteLoaderImpl").newInstance();
                if (iBinder == null) {
                    jVar = null;
                } else {
                    IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.dynamite.IDynamiteLoader");
                    jVar = iInterfaceQueryLocalInterface instanceof k ? (k) iInterfaceQueryLocalInterface : new j(iBinder);
                }
                if (jVar != null) {
                    f2601c = jVar;
                    return jVar;
                }
            } catch (Exception e2) {
                String strValueOf = String.valueOf(e2.getMessage());
                Log.e("DynamiteModule", strValueOf.length() != 0 ? "Failed to load IDynamiteLoader from GmsCore: ".concat(strValueOf) : new String("Failed to load IDynamiteLoader from GmsCore: "));
            }
            return null;
        }
    }

    private static Boolean j() {
        Boolean boolValueOf;
        synchronized (DynamiteModule.class) {
            boolValueOf = Boolean.valueOf(f >= 2);
        }
        return boolValueOf;
    }

    @GuardedBy("DynamiteModule.class")
    private static void k(ClassLoader classLoader) throws a {
        m lVar;
        com.google.android.gms.dynamite.b bVar = null;
        try {
            IBinder iBinder = (IBinder) classLoader.loadClass("com.google.android.gms.dynamiteloader.DynamiteLoaderV2").getConstructor(new Class[0]).newInstance(new Object[0]);
            if (iBinder == null) {
                lVar = null;
            } else {
                IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.dynamite.IDynamiteLoaderV2");
                lVar = iInterfaceQueryLocalInterface instanceof m ? (m) iInterfaceQueryLocalInterface : new l(iBinder);
            }
            d = lVar;
        } catch (ClassNotFoundException | IllegalAccessException | InstantiationException | NoSuchMethodException | InvocationTargetException e2) {
            throw new a("Failed to instantiate dynamite loader", e2, bVar);
        }
    }

    private static boolean l(Cursor cursor) {
        c cVar = g.get();
        if (cVar == null || cVar.f2606a != null) {
            return false;
        }
        cVar.f2606a = cursor;
        return true;
    }

    private static int m(Context context, String str, boolean z) throws Throwable {
        k kVarI = i(context);
        if (kVarI == null) {
            return 0;
        }
        try {
            try {
                int r4 = kVarI.b();
                if (r4 < 3) {
                    if (r4 == 2) {
                        Log.w("DynamiteModule", "IDynamite loader version = 2, no high precision latency measurement.");
                        return kVarI.H1(c.a.b.b.e.e.i2(context), str, z);
                    }
                    Log.w("DynamiteModule", "IDynamite loader version < 2, falling back to getModuleVersion2");
                    return kVarI.z3(c.a.b.b.e.e.i2(context), str, z);
                }
                Cursor cursor = (Cursor) c.a.b.b.e.e.e2(kVarI.v3(c.a.b.b.e.e.i2(context), str, z));
                if (cursor != null) {
                    try {
                        if (cursor.moveToFirst()) {
                            int r7 = cursor.getInt(0);
                            cursor = (r7 <= 0 || !l(cursor)) ? cursor : null;
                            if (cursor != null) {
                                cursor.close();
                            }
                            return r7;
                        }
                    } catch (RemoteException e2) {
                        e = e2;
                        cursor = cursor;
                        String strValueOf = String.valueOf(e.getMessage());
                        Log.w("DynamiteModule", strValueOf.length() != 0 ? "Failed to retrieve remote module version: ".concat(strValueOf) : new String("Failed to retrieve remote module version: "));
                        if (cursor != null) {
                            cursor.close();
                        }
                        return 0;
                    } catch (Throwable th) {
                        th = th;
                        cursor = cursor;
                        if (cursor != null) {
                            cursor.close();
                        }
                        throw th;
                    }
                }
                Log.w("DynamiteModule", "Failed to retrieve remote module version.");
                if (cursor != null) {
                    cursor.close();
                }
                return 0;
            } catch (RemoteException e3) {
                e = e3;
            }
        } catch (Throwable th2) {
            th = th2;
        }
    }

    private static DynamiteModule n(Context context, String str, int r7) throws RemoteException, a {
        m mVar;
        c.a.b.b.e.c cVarP0;
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 51);
        sb.append("Selected remote version of ");
        sb.append(str);
        sb.append(", version >= ");
        sb.append(r7);
        Log.i("DynamiteModule", sb.toString());
        synchronized (DynamiteModule.class) {
            mVar = d;
        }
        com.google.android.gms.dynamite.b bVar = null;
        if (mVar == null) {
            throw new a("DynamiteLoaderV2 was not cached.", bVar);
        }
        c cVar = g.get();
        if (cVar == null || cVar.f2606a == null) {
            throw new a("No result cursor", bVar);
        }
        Context applicationContext = context.getApplicationContext();
        Cursor cursor = cVar.f2606a;
        c.a.b.b.e.e.i2(null);
        if (j().booleanValue()) {
            Log.v("DynamiteModule", "Dynamite loader version >= 2, using loadModule2NoCrashUtils");
            cVarP0 = mVar.x3(c.a.b.b.e.e.i2(applicationContext), str, r7, c.a.b.b.e.e.i2(cursor));
        } else {
            Log.w("DynamiteModule", "Dynamite loader version < 2, falling back to loadModule2");
            cVarP0 = mVar.P0(c.a.b.b.e.e.i2(applicationContext), str, r7, c.a.b.b.e.e.i2(cursor));
        }
        Context context2 = (Context) c.a.b.b.e.e.e2(cVarP0);
        if (context2 != null) {
            return new DynamiteModule(context2);
        }
        throw new a("Failed to get module context", bVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0072  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00a6  */
    /* JADX WARN: Type inference failed for: r0v0, types: [com.google.android.gms.dynamite.b] */
    /* JADX WARN: Type inference failed for: r0v1, types: [android.database.Cursor] */
    /* JADX WARN: Type inference failed for: r0v2 */
    /* JADX WARN: Type inference failed for: r0v3 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static int o(android.content.Context r8, java.lang.String r9, boolean r10) throws java.lang.Throwable {
        /*
            r0 = 0
            android.content.ContentResolver r1 = r8.getContentResolver()     // Catch: java.lang.Throwable -> L91 java.lang.Exception -> L93
            if (r10 == 0) goto La
            java.lang.String r8 = "api_force_staging"
            goto Lc
        La:
            java.lang.String r8 = "api"
        Lc:
            int r10 = r8.length()     // Catch: java.lang.Throwable -> L91 java.lang.Exception -> L93
            int r10 = r10 + 42
            java.lang.String r2 = java.lang.String.valueOf(r9)     // Catch: java.lang.Throwable -> L91 java.lang.Exception -> L93
            int r2 = r2.length()     // Catch: java.lang.Throwable -> L91 java.lang.Exception -> L93
            int r10 = r10 + r2
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L91 java.lang.Exception -> L93
            r2.<init>(r10)     // Catch: java.lang.Throwable -> L91 java.lang.Exception -> L93
            java.lang.String r10 = "content://com.google.android.gms.chimera/"
            r2.append(r10)     // Catch: java.lang.Throwable -> L91 java.lang.Exception -> L93
            r2.append(r8)     // Catch: java.lang.Throwable -> L91 java.lang.Exception -> L93
            java.lang.String r8 = "/"
            r2.append(r8)     // Catch: java.lang.Throwable -> L91 java.lang.Exception -> L93
            r2.append(r9)     // Catch: java.lang.Throwable -> L91 java.lang.Exception -> L93
            java.lang.String r8 = r2.toString()     // Catch: java.lang.Throwable -> L91 java.lang.Exception -> L93
            android.net.Uri r2 = android.net.Uri.parse(r8)     // Catch: java.lang.Throwable -> L91 java.lang.Exception -> L93
            r3 = 0
            r4 = 0
            r5 = 0
            r6 = 0
            android.database.Cursor r8 = r1.query(r2, r3, r4, r5, r6)     // Catch: java.lang.Throwable -> L91 java.lang.Exception -> L93
            if (r8 == 0) goto L79
            boolean r9 = r8.moveToFirst()     // Catch: java.lang.Throwable -> L88 java.lang.Exception -> L8c
            if (r9 == 0) goto L79
            r9 = 0
            int r9 = r8.getInt(r9)     // Catch: java.lang.Throwable -> L88 java.lang.Exception -> L8c
            if (r9 <= 0) goto L72
            java.lang.Class<com.google.android.gms.dynamite.DynamiteModule> r10 = com.google.android.gms.dynamite.DynamiteModule.class
            monitor-enter(r10)     // Catch: java.lang.Throwable -> L88 java.lang.Exception -> L8c
            r1 = 2
            java.lang.String r1 = r8.getString(r1)     // Catch: java.lang.Throwable -> L6f
            com.google.android.gms.dynamite.DynamiteModule.e = r1     // Catch: java.lang.Throwable -> L6f
            java.lang.String r1 = "loaderVersion"
            int r1 = r8.getColumnIndex(r1)     // Catch: java.lang.Throwable -> L6f
            if (r1 < 0) goto L67
            int r1 = r8.getInt(r1)     // Catch: java.lang.Throwable -> L6f
            com.google.android.gms.dynamite.DynamiteModule.f = r1     // Catch: java.lang.Throwable -> L6f
        L67:
            monitor-exit(r10)     // Catch: java.lang.Throwable -> L6f
            boolean r10 = l(r8)     // Catch: java.lang.Throwable -> L88 java.lang.Exception -> L8c
            if (r10 == 0) goto L72
            goto L73
        L6f:
            r9 = move-exception
            monitor-exit(r10)     // Catch: java.lang.Throwable -> L6f
            throw r9     // Catch: java.lang.Throwable -> L88 java.lang.Exception -> L8c
        L72:
            r0 = r8
        L73:
            if (r0 == 0) goto L78
            r0.close()
        L78:
            return r9
        L79:
            java.lang.String r9 = "DynamiteModule"
            java.lang.String r10 = "Failed to retrieve remote module version."
            android.util.Log.w(r9, r10)     // Catch: java.lang.Throwable -> L88 java.lang.Exception -> L8c
            com.google.android.gms.dynamite.DynamiteModule$a r9 = new com.google.android.gms.dynamite.DynamiteModule$a     // Catch: java.lang.Throwable -> L88 java.lang.Exception -> L8c
            java.lang.String r10 = "Failed to connect to dynamite module ContentResolver."
            r9.<init>(r10, r0)     // Catch: java.lang.Throwable -> L88 java.lang.Exception -> L8c
            throw r9     // Catch: java.lang.Throwable -> L88 java.lang.Exception -> L8c
        L88:
            r9 = move-exception
            r0 = r8
            r8 = r9
            goto La4
        L8c:
            r9 = move-exception
            r7 = r9
            r9 = r8
            r8 = r7
            goto L95
        L91:
            r8 = move-exception
            goto La4
        L93:
            r8 = move-exception
            r9 = r0
        L95:
            boolean r10 = r8 instanceof com.google.android.gms.dynamite.DynamiteModule.a     // Catch: java.lang.Throwable -> La2
            if (r10 == 0) goto L9a
            throw r8     // Catch: java.lang.Throwable -> La2
        L9a:
            com.google.android.gms.dynamite.DynamiteModule$a r10 = new com.google.android.gms.dynamite.DynamiteModule$a     // Catch: java.lang.Throwable -> La2
            java.lang.String r1 = "V2 version check failed"
            r10.<init>(r1, r8, r0)     // Catch: java.lang.Throwable -> La2
            throw r10     // Catch: java.lang.Throwable -> La2
        La2:
            r8 = move-exception
            r0 = r9
        La4:
            if (r0 == 0) goto La9
            r0.close()
        La9:
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.dynamite.DynamiteModule.o(android.content.Context, java.lang.String, boolean):int");
    }

    @RecentlyNonNull
    @com.google.android.gms.common.annotation.a
    public final Context b() {
        return this.f2602a;
    }

    @RecentlyNonNull
    @com.google.android.gms.common.annotation.a
    public final IBinder d(@RecentlyNonNull String str) throws a {
        try {
            return (IBinder) this.f2602a.getClassLoader().loadClass(str).newInstance();
        } catch (ClassNotFoundException | IllegalAccessException | InstantiationException e2) {
            String strValueOf = String.valueOf(str);
            throw new a(strValueOf.length() != 0 ? "Failed to instantiate module class: ".concat(strValueOf) : new String("Failed to instantiate module class: "), e2, null);
        }
    }
}

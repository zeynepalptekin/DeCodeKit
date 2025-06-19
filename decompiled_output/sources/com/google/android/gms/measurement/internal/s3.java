package com.google.android.gms.measurement.internal;

import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.os.Parcel;

/* loaded from: classes.dex */
public final class s3 extends g5 {

    /* renamed from: c, reason: collision with root package name */
    private final r3 f6506c;
    private boolean d;

    s3(b5 b5Var) {
        super(b5Var);
        this.f6506c = new r3(this, F(), "google_app_measurement_local.db");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:67:0x00f7 A[PHI: r6 r9
  0x00f7: PHI (r6v3 int) = (r6v1 int), (r6v4 int) binds: [B:73:0x0112, B:66:0x00f5] A[DONT_GENERATE, DONT_INLINE]
  0x00f7: PHI (r9v7 android.database.sqlite.SQLiteDatabase) = (r9v6 android.database.sqlite.SQLiteDatabase), (r9v8 android.database.sqlite.SQLiteDatabase) binds: [B:73:0x0112, B:66:0x00f5] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:78:0x011e  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0123  */
    /* JADX WARN: Type inference failed for: r12v0 */
    /* JADX WARN: Type inference failed for: r12v1 */
    /* JADX WARN: Type inference failed for: r12v2, types: [android.database.Cursor] */
    /* JADX WARN: Type inference failed for: r12v3 */
    /* JADX WARN: Type inference failed for: r12v4 */
    /* JADX WARN: Type inference failed for: r12v5, types: [android.database.Cursor] */
    /* JADX WARN: Type inference failed for: r12v6 */
    /* JADX WARN: Type inference failed for: r2v0 */
    /* JADX WARN: Type inference failed for: r2v1, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r2v11 */
    @androidx.annotation.y0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final boolean C(int r17, byte[] r18) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 310
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.s3.C(int, byte[]):boolean");
    }

    @androidx.annotation.y0
    @com.google.android.gms.common.util.d0
    private final SQLiteDatabase K() throws SQLiteException {
        if (this.d) {
            return null;
        }
        SQLiteDatabase writableDatabase = this.f6506c.getWritableDatabase();
        if (writableDatabase != null) {
            return writableDatabase;
        }
        this.d = true;
        return null;
    }

    @com.google.android.gms.common.util.d0
    private final boolean L() {
        return F().getDatabasePath("google_app_measurement_local.db").exists();
    }

    private static long y(SQLiteDatabase sQLiteDatabase) {
        Cursor cursorQuery = null;
        try {
            cursorQuery = sQLiteDatabase.query("messages", new String[]{"rowid"}, "type=?", new String[]{"3"}, null, null, "rowid desc", "1");
            if (cursorQuery.moveToFirst()) {
                return cursorQuery.getLong(0);
            }
            if (cursorQuery == null) {
                return -1L;
            }
            cursorQuery.close();
            return -1L;
        } finally {
            if (cursorQuery != null) {
                cursorQuery.close();
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:121:0x01af  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x01c4 A[PHI: r8 r15
  0x01c4: PHI (r8v3 int) = (r8v1 int), (r8v1 int), (r8v4 int) binds: [B:122:0x01b2, B:137:0x01dd, B:130:0x01c2] A[DONT_GENERATE, DONT_INLINE]
  0x01c4: PHI (r15v6 android.database.sqlite.SQLiteDatabase) = 
  (r15v4 android.database.sqlite.SQLiteDatabase)
  (r15v5 android.database.sqlite.SQLiteDatabase)
  (r15v7 android.database.sqlite.SQLiteDatabase)
 binds: [B:122:0x01b2, B:137:0x01dd, B:130:0x01c2] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:136:0x01da  */
    /* JADX WARN: Removed duplicated region for block: B:144:0x01ea  */
    /* JADX WARN: Removed duplicated region for block: B:146:0x01ef  */
    /* JADX WARN: Removed duplicated region for block: B:152:0x0197 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:173:0x01e0 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:176:0x01e0 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.util.List<com.google.android.gms.common.internal.z.a> A(int r22) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 513
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.s3.A(int):java.util.List");
    }

    @Override // com.google.android.gms.measurement.internal.v5, com.google.android.gms.measurement.internal.x5
    public final /* bridge */ /* synthetic */ w3 B() {
        return super.B();
    }

    public final boolean D(s sVar) {
        Parcel parcelObtain = Parcel.obtain();
        sVar.writeToParcel(parcelObtain, 0);
        byte[] bArrMarshall = parcelObtain.marshall();
        parcelObtain.recycle();
        if (bArrMarshall.length <= 131072) {
            return C(0, bArrMarshall);
        }
        B().G().a("Event is too long for local database. Sending event directly to service");
        return false;
    }

    public final boolean E(ca caVar) {
        Parcel parcelObtain = Parcel.obtain();
        caVar.writeToParcel(parcelObtain, 0);
        byte[] bArrMarshall = parcelObtain.marshall();
        parcelObtain.recycle();
        if (bArrMarshall.length <= 131072) {
            return C(1, bArrMarshall);
        }
        B().G().a("User property too long for local database. Sending directly to service");
        return false;
    }

    @Override // com.google.android.gms.measurement.internal.v5, com.google.android.gms.measurement.internal.x5
    public final /* bridge */ /* synthetic */ Context F() {
        return super.F();
    }

    public final boolean G(va vaVar) {
        h();
        byte[] bArrP0 = ha.p0(vaVar);
        if (bArrP0.length <= 131072) {
            return C(2, bArrP0);
        }
        B().G().a("Conditional user property too long for local database. Sending directly to service");
        return false;
    }

    @androidx.annotation.y0
    public final void H() {
        c();
        try {
            int r0 = K().delete("messages", null, null) + 0;
            if (r0 > 0) {
                B().N().b("Reset local analytics data. records", Integer.valueOf(r0));
            }
        } catch (SQLiteException e) {
            B().E().b("Error resetting local analytics data. error", e);
        }
    }

    @androidx.annotation.y0
    public final boolean I() {
        return C(3, new byte[0]);
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x006c A[PHI: r4
  0x006c: PHI (r4v3 int) = (r4v1 int), (r4v1 int), (r4v4 int) binds: [B:30:0x0063, B:37:0x007e, B:33:0x006a] A[DONT_GENERATE, DONT_INLINE]] */
    @androidx.annotation.y0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean J() {
        /*
            r11 = this;
            java.lang.String r0 = "Error deleting app launch break from local database"
            r11.c()
            boolean r1 = r11.d
            r2 = 0
            if (r1 == 0) goto Lb
            return r2
        Lb:
            boolean r1 = r11.L()
            if (r1 != 0) goto L12
            return r2
        L12:
            r1 = 5
            r3 = 0
            r4 = 5
        L15:
            if (r3 >= r1) goto L8a
            r5 = 0
            r6 = 1
            android.database.sqlite.SQLiteDatabase r5 = r11.K()     // Catch: java.lang.Throwable -> L46 android.database.sqlite.SQLiteException -> L48 android.database.sqlite.SQLiteDatabaseLockedException -> L64 android.database.sqlite.SQLiteFullException -> L70
            if (r5 != 0) goto L27
            r11.d = r6     // Catch: java.lang.Throwable -> L46 android.database.sqlite.SQLiteException -> L48 android.database.sqlite.SQLiteDatabaseLockedException -> L64 android.database.sqlite.SQLiteFullException -> L70
            if (r5 == 0) goto L26
            r5.close()
        L26:
            return r2
        L27:
            r5.beginTransaction()     // Catch: java.lang.Throwable -> L46 android.database.sqlite.SQLiteException -> L48 android.database.sqlite.SQLiteDatabaseLockedException -> L64 android.database.sqlite.SQLiteFullException -> L70
            java.lang.String r7 = "messages"
            java.lang.String r8 = "type == ?"
            java.lang.String[] r9 = new java.lang.String[r6]     // Catch: java.lang.Throwable -> L46 android.database.sqlite.SQLiteException -> L48 android.database.sqlite.SQLiteDatabaseLockedException -> L64 android.database.sqlite.SQLiteFullException -> L70
            r10 = 3
            java.lang.String r10 = java.lang.Integer.toString(r10)     // Catch: java.lang.Throwable -> L46 android.database.sqlite.SQLiteException -> L48 android.database.sqlite.SQLiteDatabaseLockedException -> L64 android.database.sqlite.SQLiteFullException -> L70
            r9[r2] = r10     // Catch: java.lang.Throwable -> L46 android.database.sqlite.SQLiteException -> L48 android.database.sqlite.SQLiteDatabaseLockedException -> L64 android.database.sqlite.SQLiteFullException -> L70
            r5.delete(r7, r8, r9)     // Catch: java.lang.Throwable -> L46 android.database.sqlite.SQLiteException -> L48 android.database.sqlite.SQLiteDatabaseLockedException -> L64 android.database.sqlite.SQLiteFullException -> L70
            r5.setTransactionSuccessful()     // Catch: java.lang.Throwable -> L46 android.database.sqlite.SQLiteException -> L48 android.database.sqlite.SQLiteDatabaseLockedException -> L64 android.database.sqlite.SQLiteFullException -> L70
            r5.endTransaction()     // Catch: java.lang.Throwable -> L46 android.database.sqlite.SQLiteException -> L48 android.database.sqlite.SQLiteDatabaseLockedException -> L64 android.database.sqlite.SQLiteFullException -> L70
            if (r5 == 0) goto L45
            r5.close()
        L45:
            return r6
        L46:
            r0 = move-exception
            goto L84
        L48:
            r7 = move-exception
            if (r5 == 0) goto L54
            boolean r8 = r5.inTransaction()     // Catch: java.lang.Throwable -> L46
            if (r8 == 0) goto L54
            r5.endTransaction()     // Catch: java.lang.Throwable -> L46
        L54:
            com.google.android.gms.measurement.internal.w3 r8 = r11.B()     // Catch: java.lang.Throwable -> L46
            com.google.android.gms.measurement.internal.y3 r8 = r8.E()     // Catch: java.lang.Throwable -> L46
            r8.b(r0, r7)     // Catch: java.lang.Throwable -> L46
            r11.d = r6     // Catch: java.lang.Throwable -> L46
            if (r5 == 0) goto L81
            goto L6c
        L64:
            long r6 = (long) r4     // Catch: java.lang.Throwable -> L46
            android.os.SystemClock.sleep(r6)     // Catch: java.lang.Throwable -> L46
            int r4 = r4 + 20
            if (r5 == 0) goto L81
        L6c:
            r5.close()
            goto L81
        L70:
            r7 = move-exception
            com.google.android.gms.measurement.internal.w3 r8 = r11.B()     // Catch: java.lang.Throwable -> L46
            com.google.android.gms.measurement.internal.y3 r8 = r8.E()     // Catch: java.lang.Throwable -> L46
            r8.b(r0, r7)     // Catch: java.lang.Throwable -> L46
            r11.d = r6     // Catch: java.lang.Throwable -> L46
            if (r5 == 0) goto L81
            goto L6c
        L81:
            int r3 = r3 + 1
            goto L15
        L84:
            if (r5 == 0) goto L89
            r5.close()
        L89:
            throw r0
        L8a:
            com.google.android.gms.measurement.internal.w3 r0 = r11.B()
            com.google.android.gms.measurement.internal.y3 r0 = r0.I()
            java.lang.String r1 = "Error deleting app launch break from local database in reasonable time"
            r0.a(r1)
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.s3.J():boolean");
    }

    @Override // com.google.android.gms.measurement.internal.d2, com.google.android.gms.measurement.internal.v5
    public final /* bridge */ /* synthetic */ void a() {
        super.a();
    }

    @Override // com.google.android.gms.measurement.internal.d2, com.google.android.gms.measurement.internal.v5
    public final /* bridge */ /* synthetic */ void b() {
        super.b();
    }

    @Override // com.google.android.gms.measurement.internal.d2, com.google.android.gms.measurement.internal.v5
    public final /* bridge */ /* synthetic */ void c() {
        super.c();
    }

    @Override // com.google.android.gms.measurement.internal.v5
    public final /* bridge */ /* synthetic */ m d() {
        return super.d();
    }

    @Override // com.google.android.gms.measurement.internal.v5, com.google.android.gms.measurement.internal.x5
    public final /* bridge */ /* synthetic */ wa e() {
        return super.e();
    }

    @Override // com.google.android.gms.measurement.internal.v5
    public final /* bridge */ /* synthetic */ u3 f() {
        return super.f();
    }

    @Override // com.google.android.gms.measurement.internal.v5
    public final /* bridge */ /* synthetic */ ha h() {
        return super.h();
    }

    @Override // com.google.android.gms.measurement.internal.v5
    public final /* bridge */ /* synthetic */ j4 i() {
        return super.i();
    }

    @Override // com.google.android.gms.measurement.internal.v5
    public final /* bridge */ /* synthetic */ xa j() {
        return super.j();
    }

    @Override // com.google.android.gms.measurement.internal.d2
    public final /* bridge */ /* synthetic */ a k() {
        return super.k();
    }

    @Override // com.google.android.gms.measurement.internal.d2
    public final /* bridge */ /* synthetic */ f6 l() {
        return super.l();
    }

    @Override // com.google.android.gms.measurement.internal.d2
    public final /* bridge */ /* synthetic */ p3 m() {
        return super.m();
    }

    @Override // com.google.android.gms.measurement.internal.d2
    public final /* bridge */ /* synthetic */ x7 n() {
        return super.n();
    }

    @Override // com.google.android.gms.measurement.internal.d2
    public final /* bridge */ /* synthetic */ s7 o() {
        return super.o();
    }

    @Override // com.google.android.gms.measurement.internal.d2
    public final /* bridge */ /* synthetic */ s3 p() {
        return super.p();
    }

    @Override // com.google.android.gms.measurement.internal.d2
    public final /* bridge */ /* synthetic */ e9 q() {
        return super.q();
    }

    @Override // com.google.android.gms.measurement.internal.g5
    protected final boolean v() {
        return false;
    }

    @Override // com.google.android.gms.measurement.internal.v5, com.google.android.gms.measurement.internal.x5
    public final /* bridge */ /* synthetic */ u4 x() {
        return super.x();
    }

    @Override // com.google.android.gms.measurement.internal.v5, com.google.android.gms.measurement.internal.x5
    public final /* bridge */ /* synthetic */ com.google.android.gms.common.util.g z() {
        return super.z();
    }
}

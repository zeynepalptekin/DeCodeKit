package com.google.android.gms.measurement.internal;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.SQLException;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.os.Bundle;
import android.text.TextUtils;
import c.a.b.b.g.c.g1;
import c.a.b.b.g.c.h7;
import c.a.b.b.g.c.hd;
import c.a.b.b.g.c.x0;
import com.google.android.gms.measurement.c.a;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* loaded from: classes.dex */
final class d extends u9 {
    private static final String[] f = {"last_bundled_timestamp", "ALTER TABLE events ADD COLUMN last_bundled_timestamp INTEGER;", "last_bundled_day", "ALTER TABLE events ADD COLUMN last_bundled_day INTEGER;", "last_sampled_complex_event_id", "ALTER TABLE events ADD COLUMN last_sampled_complex_event_id INTEGER;", "last_sampling_rate", "ALTER TABLE events ADD COLUMN last_sampling_rate INTEGER;", "last_exempt_from_sampling", "ALTER TABLE events ADD COLUMN last_exempt_from_sampling INTEGER;", "current_session_count", "ALTER TABLE events ADD COLUMN current_session_count INTEGER;"};
    private static final String[] g = {"origin", "ALTER TABLE user_attributes ADD COLUMN origin TEXT;"};
    private static final String[] h = {"app_version", "ALTER TABLE apps ADD COLUMN app_version TEXT;", "app_store", "ALTER TABLE apps ADD COLUMN app_store TEXT;", "gmp_version", "ALTER TABLE apps ADD COLUMN gmp_version INTEGER;", "dev_cert_hash", "ALTER TABLE apps ADD COLUMN dev_cert_hash INTEGER;", "measurement_enabled", "ALTER TABLE apps ADD COLUMN measurement_enabled INTEGER;", "last_bundle_start_timestamp", "ALTER TABLE apps ADD COLUMN last_bundle_start_timestamp INTEGER;", "day", "ALTER TABLE apps ADD COLUMN day INTEGER;", "daily_public_events_count", "ALTER TABLE apps ADD COLUMN daily_public_events_count INTEGER;", "daily_events_count", "ALTER TABLE apps ADD COLUMN daily_events_count INTEGER;", "daily_conversions_count", "ALTER TABLE apps ADD COLUMN daily_conversions_count INTEGER;", "remote_config", "ALTER TABLE apps ADD COLUMN remote_config BLOB;", "config_fetched_time", "ALTER TABLE apps ADD COLUMN config_fetched_time INTEGER;", "failed_config_fetch_time", "ALTER TABLE apps ADD COLUMN failed_config_fetch_time INTEGER;", "app_version_int", "ALTER TABLE apps ADD COLUMN app_version_int INTEGER;", "firebase_instance_id", "ALTER TABLE apps ADD COLUMN firebase_instance_id TEXT;", "daily_error_events_count", "ALTER TABLE apps ADD COLUMN daily_error_events_count INTEGER;", "daily_realtime_events_count", "ALTER TABLE apps ADD COLUMN daily_realtime_events_count INTEGER;", "health_monitor_sample", "ALTER TABLE apps ADD COLUMN health_monitor_sample TEXT;", "android_id", "ALTER TABLE apps ADD COLUMN android_id INTEGER;", "adid_reporting_enabled", "ALTER TABLE apps ADD COLUMN adid_reporting_enabled INTEGER;", "ssaid_reporting_enabled", "ALTER TABLE apps ADD COLUMN ssaid_reporting_enabled INTEGER;", "admob_app_id", "ALTER TABLE apps ADD COLUMN admob_app_id TEXT;", "linked_admob_app_id", "ALTER TABLE apps ADD COLUMN linked_admob_app_id TEXT;", "dynamite_version", "ALTER TABLE apps ADD COLUMN dynamite_version INTEGER;", "safelisted_events", "ALTER TABLE apps ADD COLUMN safelisted_events TEXT;", "ga_app_id", "ALTER TABLE apps ADD COLUMN ga_app_id TEXT;"};
    private static final String[] i = {"realtime", "ALTER TABLE raw_events ADD COLUMN realtime INTEGER;"};
    private static final String[] j = {"has_realtime", "ALTER TABLE queue ADD COLUMN has_realtime INTEGER;", "retry_count", "ALTER TABLE queue ADD COLUMN retry_count INTEGER;"};
    private static final String[] k = {"session_scoped", "ALTER TABLE event_filters ADD COLUMN session_scoped BOOLEAN;"};
    private static final String[] l = {"session_scoped", "ALTER TABLE property_filters ADD COLUMN session_scoped BOOLEAN;"};
    private static final String[] m = {"previous_install_count", "ALTER TABLE app2 ADD COLUMN previous_install_count INTEGER;"};
    private final i d;
    private final q9 e;

    d(t9 t9Var) {
        super(t9Var);
        this.e = new q9(z());
        this.d = new i(this, F(), "google_app_measurement.db");
    }

    @androidx.annotation.y0
    private final long A(String str, String[] strArr, long j2) {
        Cursor cursorRawQuery = null;
        try {
            try {
                cursorRawQuery = u().rawQuery(str, strArr);
                if (cursorRawQuery.moveToFirst()) {
                    return cursorRawQuery.getLong(0);
                }
                if (cursorRawQuery != null) {
                    cursorRawQuery.close();
                }
                return j2;
            } catch (SQLiteException e) {
                B().E().c("Database error", str, e);
                throw e;
            }
        } finally {
            if (cursorRawQuery != null) {
                cursorRawQuery.close();
            }
        }
    }

    @androidx.annotation.y0
    @com.google.android.gms.common.util.d0
    private final Object I(Cursor cursor, int r5) {
        int type = cursor.getType(r5);
        if (type == 0) {
            B().E().a("Loaded invalid null value from database");
            return null;
        }
        if (type == 1) {
            return Long.valueOf(cursor.getLong(r5));
        }
        if (type == 2) {
            return Double.valueOf(cursor.getDouble(r5));
        }
        if (type == 3) {
            return cursor.getString(r5);
        }
        if (type != 4) {
            B().E().b("Loaded invalid unknown value type, ignoring it", Integer.valueOf(type));
            return null;
        }
        B().E().a("Loaded invalid blob type value, ignoring it");
        return null;
    }

    @androidx.annotation.y0
    private final String K(String str, String[] strArr, String str2) {
        Cursor cursorRawQuery = null;
        try {
            try {
                cursorRawQuery = u().rawQuery(str, strArr);
                if (cursorRawQuery.moveToFirst()) {
                    return cursorRawQuery.getString(0);
                }
                if (cursorRawQuery != null) {
                    cursorRawQuery.close();
                }
                return str2;
            } catch (SQLiteException e) {
                B().E().c("Database error", str, e);
                throw e;
            }
        } finally {
            if (cursorRawQuery != null) {
                cursorRawQuery.close();
            }
        }
    }

    @androidx.annotation.y0
    private static void P(ContentValues contentValues, String str, Object obj) {
        com.google.android.gms.common.internal.r.g(str);
        com.google.android.gms.common.internal.r.k(obj);
        if (obj instanceof String) {
            contentValues.put(str, (String) obj);
        } else if (obj instanceof Long) {
            contentValues.put(str, (Long) obj);
        } else {
            if (!(obj instanceof Double)) {
                throw new IllegalArgumentException("Invalid value type");
            }
            contentValues.put(str, (Double) obj);
        }
    }

    @androidx.annotation.y0
    private final boolean Y(String str, int r7, x0.b bVar) throws IllegalStateException {
        q();
        c();
        com.google.android.gms.common.internal.r.g(str);
        com.google.android.gms.common.internal.r.k(bVar);
        if (TextUtils.isEmpty(bVar.L())) {
            B().I().d("Event filter had no event name. Audience definition ignored. appId, audienceId, filterId", w3.t(str), Integer.valueOf(r7), String.valueOf(bVar.J() ? Integer.valueOf(bVar.K()) : null));
            return false;
        }
        byte[] bArrL = bVar.l();
        ContentValues contentValues = new ContentValues();
        contentValues.put("app_id", str);
        contentValues.put("audience_id", Integer.valueOf(r7));
        contentValues.put("filter_id", bVar.J() ? Integer.valueOf(bVar.K()) : null);
        contentValues.put("event_name", bVar.L());
        contentValues.put("session_scoped", bVar.S() ? Boolean.valueOf(bVar.T()) : null);
        contentValues.put("data", bArrL);
        try {
            if (u().insertWithOnConflict("event_filters", null, contentValues, 5) != -1) {
                return true;
            }
            B().E().b("Failed to insert event filter (got -1). appId", w3.t(str));
            return true;
        } catch (SQLiteException e) {
            B().E().c("Error storing event filter. appId", w3.t(str), e);
            return false;
        }
    }

    @androidx.annotation.y0
    private final boolean Z(String str, int r7, x0.e eVar) throws IllegalStateException {
        q();
        c();
        com.google.android.gms.common.internal.r.g(str);
        com.google.android.gms.common.internal.r.k(eVar);
        if (TextUtils.isEmpty(eVar.G())) {
            B().I().d("Property filter had no property name. Audience definition ignored. appId, audienceId, filterId", w3.t(str), Integer.valueOf(r7), String.valueOf(eVar.E() ? Integer.valueOf(eVar.F()) : null));
            return false;
        }
        byte[] bArrL = eVar.l();
        ContentValues contentValues = new ContentValues();
        contentValues.put("app_id", str);
        contentValues.put("audience_id", Integer.valueOf(r7));
        contentValues.put("filter_id", eVar.E() ? Integer.valueOf(eVar.F()) : null);
        contentValues.put("property_name", eVar.G());
        contentValues.put("session_scoped", eVar.M() ? Boolean.valueOf(eVar.N()) : null);
        contentValues.put("data", bArrL);
        try {
            if (u().insertWithOnConflict("property_filters", null, contentValues, 5) != -1) {
                return true;
            }
            B().E().b("Failed to insert property filter (got -1). appId", w3.t(str));
            return false;
        } catch (SQLiteException e) {
            B().E().c("Error storing property filter. appId", w3.t(str), e);
            return false;
        }
    }

    @com.google.android.gms.common.util.d0
    private final boolean k0() {
        return F().getDatabasePath("google_app_measurement.db").exists();
    }

    @androidx.annotation.y0
    private final long l0(String str, String[] strArr) {
        Cursor cursor = null;
        try {
            try {
                Cursor cursorRawQuery = u().rawQuery(str, strArr);
                if (!cursorRawQuery.moveToFirst()) {
                    throw new SQLiteException("Database returned empty set");
                }
                long j2 = cursorRawQuery.getLong(0);
                if (cursorRawQuery != null) {
                    cursorRawQuery.close();
                }
                return j2;
            } catch (SQLiteException e) {
                B().E().c("Database error", str, e);
                throw e;
            }
        } catch (Throwable th) {
            if (0 != 0) {
                cursor.close();
            }
            throw th;
        }
    }

    private final boolean p0(String str, List<Integer> list) {
        com.google.android.gms.common.internal.r.g(str);
        q();
        c();
        SQLiteDatabase sQLiteDatabaseU = u();
        try {
            long jL0 = l0("select count(1) from audience_filter_values where app_id=?", new String[]{str});
            int r2 = Math.max(0, Math.min(2000, j().r(str, u.G)));
            if (jL0 <= r2) {
                return false;
            }
            ArrayList arrayList = new ArrayList();
            for (int r5 = 0; r5 < list.size(); r5++) {
                Integer num = list.get(r5);
                if (num == null || !(num instanceof Integer)) {
                    return false;
                }
                arrayList.add(Integer.toString(num.intValue()));
            }
            String strJoin = TextUtils.join(",", arrayList);
            StringBuilder sb = new StringBuilder(String.valueOf(strJoin).length() + 2);
            sb.append("(");
            sb.append(strJoin);
            sb.append(")");
            String string = sb.toString();
            StringBuilder sb2 = new StringBuilder(String.valueOf(string).length() + 140);
            sb2.append("audience_id in (select audience_id from audience_filter_values where app_id=? and audience_id not in ");
            sb2.append(string);
            sb2.append(" order by rowid desc limit -1 offset ?)");
            return sQLiteDatabaseU.delete("audience_filter_values", sb2.toString(), new String[]{str, Integer.toString(r2)}) > 0;
        } catch (SQLiteException e) {
            B().E().c("Database error querying filters. appId", w3.t(str), e);
            return false;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00d3  */
    /* JADX WARN: Type inference failed for: r9v0 */
    /* JADX WARN: Type inference failed for: r9v1, types: [android.database.Cursor] */
    /* JADX WARN: Type inference failed for: r9v2 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    final java.util.Map<java.lang.Integer, java.util.List<c.a.b.b.g.c.x0.e>> A0(java.lang.String r13, java.lang.String r14) throws java.lang.Throwable {
        /*
            r12 = this;
            r12.q()
            r12.c()
            com.google.android.gms.common.internal.r.g(r13)
            com.google.android.gms.common.internal.r.g(r14)
            b.f.a r0 = new b.f.a
            r0.<init>()
            android.database.sqlite.SQLiteDatabase r1 = r12.u()
            r9 = 0
            java.lang.String r2 = "property_filters"
            java.lang.String r3 = "audience_id"
            java.lang.String r4 = "data"
            java.lang.String[] r3 = new java.lang.String[]{r3, r4}     // Catch: java.lang.Throwable -> L98 android.database.sqlite.SQLiteException -> L9a
            java.lang.String r4 = "app_id=? AND property_name=?"
            r5 = 2
            java.lang.String[] r5 = new java.lang.String[r5]     // Catch: java.lang.Throwable -> L98 android.database.sqlite.SQLiteException -> L9a
            r10 = 0
            r5[r10] = r13     // Catch: java.lang.Throwable -> L98 android.database.sqlite.SQLiteException -> L9a
            r11 = 1
            r5[r11] = r14     // Catch: java.lang.Throwable -> L98 android.database.sqlite.SQLiteException -> L9a
            r6 = 0
            r7 = 0
            r8 = 0
            android.database.Cursor r14 = r1.query(r2, r3, r4, r5, r6, r7, r8)     // Catch: java.lang.Throwable -> L98 android.database.sqlite.SQLiteException -> L9a
            boolean r1 = r14.moveToFirst()     // Catch: android.database.sqlite.SQLiteException -> L96 java.lang.Throwable -> Lcf
            if (r1 != 0) goto L42
            java.util.Map r13 = java.util.Collections.emptyMap()     // Catch: android.database.sqlite.SQLiteException -> L96 java.lang.Throwable -> Lcf
            if (r14 == 0) goto L41
            r14.close()
        L41:
            return r13
        L42:
            byte[] r1 = r14.getBlob(r11)     // Catch: android.database.sqlite.SQLiteException -> L96 java.lang.Throwable -> Lcf
            c.a.b.b.g.c.x0$e$a r2 = c.a.b.b.g.c.x0.e.O()     // Catch: java.io.IOException -> L78 android.database.sqlite.SQLiteException -> L96 java.lang.Throwable -> Lcf
            c.a.b.b.g.c.u8 r1 = com.google.android.gms.measurement.internal.da.A(r2, r1)     // Catch: java.io.IOException -> L78 android.database.sqlite.SQLiteException -> L96 java.lang.Throwable -> Lcf
            c.a.b.b.g.c.x0$e$a r1 = (c.a.b.b.g.c.x0.e.a) r1     // Catch: java.io.IOException -> L78 android.database.sqlite.SQLiteException -> L96 java.lang.Throwable -> Lcf
            c.a.b.b.g.c.r8 r1 = r1.j()     // Catch: java.io.IOException -> L78 android.database.sqlite.SQLiteException -> L96 java.lang.Throwable -> Lcf
            c.a.b.b.g.c.h7 r1 = (c.a.b.b.g.c.h7) r1     // Catch: java.io.IOException -> L78 android.database.sqlite.SQLiteException -> L96 java.lang.Throwable -> Lcf
            c.a.b.b.g.c.x0$e r1 = (c.a.b.b.g.c.x0.e) r1     // Catch: java.io.IOException -> L78 android.database.sqlite.SQLiteException -> L96 java.lang.Throwable -> Lcf
            int r2 = r14.getInt(r10)     // Catch: android.database.sqlite.SQLiteException -> L96 java.lang.Throwable -> Lcf
            java.lang.Integer r3 = java.lang.Integer.valueOf(r2)     // Catch: android.database.sqlite.SQLiteException -> L96 java.lang.Throwable -> Lcf
            java.lang.Object r3 = r0.get(r3)     // Catch: android.database.sqlite.SQLiteException -> L96 java.lang.Throwable -> Lcf
            java.util.List r3 = (java.util.List) r3     // Catch: android.database.sqlite.SQLiteException -> L96 java.lang.Throwable -> Lcf
            if (r3 != 0) goto L74
            java.util.ArrayList r3 = new java.util.ArrayList     // Catch: android.database.sqlite.SQLiteException -> L96 java.lang.Throwable -> Lcf
            r3.<init>()     // Catch: android.database.sqlite.SQLiteException -> L96 java.lang.Throwable -> Lcf
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)     // Catch: android.database.sqlite.SQLiteException -> L96 java.lang.Throwable -> Lcf
            r0.put(r2, r3)     // Catch: android.database.sqlite.SQLiteException -> L96 java.lang.Throwable -> Lcf
        L74:
            r3.add(r1)     // Catch: android.database.sqlite.SQLiteException -> L96 java.lang.Throwable -> Lcf
            goto L8a
        L78:
            r1 = move-exception
            com.google.android.gms.measurement.internal.w3 r2 = r12.B()     // Catch: android.database.sqlite.SQLiteException -> L96 java.lang.Throwable -> Lcf
            com.google.android.gms.measurement.internal.y3 r2 = r2.E()     // Catch: android.database.sqlite.SQLiteException -> L96 java.lang.Throwable -> Lcf
            java.lang.String r3 = "Failed to merge filter"
            java.lang.Object r4 = com.google.android.gms.measurement.internal.w3.t(r13)     // Catch: android.database.sqlite.SQLiteException -> L96 java.lang.Throwable -> Lcf
            r2.c(r3, r4, r1)     // Catch: android.database.sqlite.SQLiteException -> L96 java.lang.Throwable -> Lcf
        L8a:
            boolean r1 = r14.moveToNext()     // Catch: android.database.sqlite.SQLiteException -> L96 java.lang.Throwable -> Lcf
            if (r1 != 0) goto L42
            if (r14 == 0) goto L95
            r14.close()
        L95:
            return r0
        L96:
            r0 = move-exception
            goto L9c
        L98:
            r13 = move-exception
            goto Ld1
        L9a:
            r0 = move-exception
            r14 = r9
        L9c:
            com.google.android.gms.measurement.internal.w3 r1 = r12.B()     // Catch: java.lang.Throwable -> Lcf
            com.google.android.gms.measurement.internal.y3 r1 = r1.E()     // Catch: java.lang.Throwable -> Lcf
            java.lang.String r2 = "Database error querying filters. appId"
            java.lang.Object r3 = com.google.android.gms.measurement.internal.w3.t(r13)     // Catch: java.lang.Throwable -> Lcf
            r1.c(r2, r3, r0)     // Catch: java.lang.Throwable -> Lcf
            boolean r0 = c.a.b.b.g.c.pc.b()     // Catch: java.lang.Throwable -> Lcf
            if (r0 == 0) goto Lc9
            com.google.android.gms.measurement.internal.xa r0 = r12.j()     // Catch: java.lang.Throwable -> Lcf
            com.google.android.gms.measurement.internal.l3<java.lang.Boolean> r1 = com.google.android.gms.measurement.internal.u.H0     // Catch: java.lang.Throwable -> Lcf
            boolean r13 = r0.C(r13, r1)     // Catch: java.lang.Throwable -> Lcf
            if (r13 == 0) goto Lc9
            java.util.Map r13 = java.util.Collections.emptyMap()     // Catch: java.lang.Throwable -> Lcf
            if (r14 == 0) goto Lc8
            r14.close()
        Lc8:
            return r13
        Lc9:
            if (r14 == 0) goto Lce
            r14.close()
        Lce:
            return r9
        Lcf:
            r13 = move-exception
            r9 = r14
        Ld1:
            if (r9 == 0) goto Ld6
            r9.close()
        Ld6:
            throw r13
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.d.A0(java.lang.String, java.lang.String):java.util.Map");
    }

    @androidx.annotation.y0
    public final void B0() {
        q();
        u().endTransaction();
    }

    /* JADX WARN: Not initialized variable reg: 1, insn: 0x0091: MOVE (r0 I:??[OBJECT, ARRAY]) = (r1 I:??[OBJECT, ARRAY]), block:B:32:0x0091 */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0094  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final android.util.Pair<c.a.b.b.g.c.g1.c, java.lang.Long> C(java.lang.String r8, java.lang.Long r9) throws java.lang.Throwable {
        /*
            r7 = this;
            r7.c()
            r7.q()
            r0 = 0
            android.database.sqlite.SQLiteDatabase r1 = r7.u()     // Catch: java.lang.Throwable -> L79 android.database.sqlite.SQLiteException -> L7b
            java.lang.String r2 = "select main_event, children_to_process from main_event_params where app_id=? and event_id=?"
            r3 = 2
            java.lang.String[] r3 = new java.lang.String[r3]     // Catch: java.lang.Throwable -> L79 android.database.sqlite.SQLiteException -> L7b
            r4 = 0
            r3[r4] = r8     // Catch: java.lang.Throwable -> L79 android.database.sqlite.SQLiteException -> L7b
            java.lang.String r5 = java.lang.String.valueOf(r9)     // Catch: java.lang.Throwable -> L79 android.database.sqlite.SQLiteException -> L7b
            r6 = 1
            r3[r6] = r5     // Catch: java.lang.Throwable -> L79 android.database.sqlite.SQLiteException -> L7b
            android.database.Cursor r1 = r1.rawQuery(r2, r3)     // Catch: java.lang.Throwable -> L79 android.database.sqlite.SQLiteException -> L7b
            boolean r2 = r1.moveToFirst()     // Catch: android.database.sqlite.SQLiteException -> L77 java.lang.Throwable -> L90
            if (r2 != 0) goto L37
            com.google.android.gms.measurement.internal.w3 r8 = r7.B()     // Catch: android.database.sqlite.SQLiteException -> L77 java.lang.Throwable -> L90
            com.google.android.gms.measurement.internal.y3 r8 = r8.N()     // Catch: android.database.sqlite.SQLiteException -> L77 java.lang.Throwable -> L90
            java.lang.String r9 = "Main event not found"
            r8.a(r9)     // Catch: android.database.sqlite.SQLiteException -> L77 java.lang.Throwable -> L90
            if (r1 == 0) goto L36
            r1.close()
        L36:
            return r0
        L37:
            byte[] r2 = r1.getBlob(r4)     // Catch: android.database.sqlite.SQLiteException -> L77 java.lang.Throwable -> L90
            long r3 = r1.getLong(r6)     // Catch: android.database.sqlite.SQLiteException -> L77 java.lang.Throwable -> L90
            java.lang.Long r3 = java.lang.Long.valueOf(r3)     // Catch: android.database.sqlite.SQLiteException -> L77 java.lang.Throwable -> L90
            c.a.b.b.g.c.g1$c$a r4 = c.a.b.b.g.c.g1.c.d0()     // Catch: java.io.IOException -> L5f android.database.sqlite.SQLiteException -> L77 java.lang.Throwable -> L90
            c.a.b.b.g.c.u8 r2 = com.google.android.gms.measurement.internal.da.A(r4, r2)     // Catch: java.io.IOException -> L5f android.database.sqlite.SQLiteException -> L77 java.lang.Throwable -> L90
            c.a.b.b.g.c.g1$c$a r2 = (c.a.b.b.g.c.g1.c.a) r2     // Catch: java.io.IOException -> L5f android.database.sqlite.SQLiteException -> L77 java.lang.Throwable -> L90
            c.a.b.b.g.c.r8 r2 = r2.j()     // Catch: java.io.IOException -> L5f android.database.sqlite.SQLiteException -> L77 java.lang.Throwable -> L90
            c.a.b.b.g.c.h7 r2 = (c.a.b.b.g.c.h7) r2     // Catch: java.io.IOException -> L5f android.database.sqlite.SQLiteException -> L77 java.lang.Throwable -> L90
            c.a.b.b.g.c.g1$c r2 = (c.a.b.b.g.c.g1.c) r2     // Catch: java.io.IOException -> L5f android.database.sqlite.SQLiteException -> L77 java.lang.Throwable -> L90
            android.util.Pair r8 = android.util.Pair.create(r2, r3)     // Catch: android.database.sqlite.SQLiteException -> L77 java.lang.Throwable -> L90
            if (r1 == 0) goto L5e
            r1.close()
        L5e:
            return r8
        L5f:
            r2 = move-exception
            com.google.android.gms.measurement.internal.w3 r3 = r7.B()     // Catch: android.database.sqlite.SQLiteException -> L77 java.lang.Throwable -> L90
            com.google.android.gms.measurement.internal.y3 r3 = r3.E()     // Catch: android.database.sqlite.SQLiteException -> L77 java.lang.Throwable -> L90
            java.lang.String r4 = "Failed to merge main event. appId, eventId"
            java.lang.Object r8 = com.google.android.gms.measurement.internal.w3.t(r8)     // Catch: android.database.sqlite.SQLiteException -> L77 java.lang.Throwable -> L90
            r3.d(r4, r8, r9, r2)     // Catch: android.database.sqlite.SQLiteException -> L77 java.lang.Throwable -> L90
            if (r1 == 0) goto L76
            r1.close()
        L76:
            return r0
        L77:
            r8 = move-exception
            goto L7d
        L79:
            r8 = move-exception
            goto L92
        L7b:
            r8 = move-exception
            r1 = r0
        L7d:
            com.google.android.gms.measurement.internal.w3 r9 = r7.B()     // Catch: java.lang.Throwable -> L90
            com.google.android.gms.measurement.internal.y3 r9 = r9.E()     // Catch: java.lang.Throwable -> L90
            java.lang.String r2 = "Error selecting main event"
            r9.b(r2, r8)     // Catch: java.lang.Throwable -> L90
            if (r1 == 0) goto L8f
            r1.close()
        L8f:
            return r0
        L90:
            r8 = move-exception
            r0 = r1
        L92:
            if (r0 == 0) goto L97
            r0.close()
        L97:
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.d.C(java.lang.String, java.lang.Long):android.util.Pair");
    }

    public final long C0(String str) {
        com.google.android.gms.common.internal.r.g(str);
        return A("select count(1) from events where app_id=? and name not like '!_%' escape '!'", new String[]{str}, 0L);
    }

    @androidx.annotation.y0
    public final g D(long j2, String str, long j3, boolean z, boolean z2, boolean z3, boolean z4, boolean z5) {
        com.google.android.gms.common.internal.r.g(str);
        c();
        q();
        String[] strArr = {str};
        g gVar = new g();
        Cursor cursor = null;
        try {
            try {
                SQLiteDatabase sQLiteDatabaseU = u();
                Cursor cursorQuery = sQLiteDatabaseU.query("apps", new String[]{"day", "daily_events_count", "daily_public_events_count", "daily_conversions_count", "daily_error_events_count", "daily_realtime_events_count"}, "app_id=?", new String[]{str}, null, null, null);
                if (!cursorQuery.moveToFirst()) {
                    B().I().b("Not updating daily counts, app is not known. appId", w3.t(str));
                    if (cursorQuery != null) {
                        cursorQuery.close();
                    }
                    return gVar;
                }
                if (cursorQuery.getLong(0) == j2) {
                    gVar.f6390b = cursorQuery.getLong(1);
                    gVar.f6389a = cursorQuery.getLong(2);
                    gVar.f6391c = cursorQuery.getLong(3);
                    gVar.d = cursorQuery.getLong(4);
                    gVar.e = cursorQuery.getLong(5);
                }
                if (z) {
                    gVar.f6390b += j3;
                }
                if (z2) {
                    gVar.f6389a += j3;
                }
                if (z3) {
                    gVar.f6391c += j3;
                }
                if (z4) {
                    gVar.d += j3;
                }
                if (z5) {
                    gVar.e += j3;
                }
                ContentValues contentValues = new ContentValues();
                contentValues.put("day", Long.valueOf(j2));
                contentValues.put("daily_public_events_count", Long.valueOf(gVar.f6389a));
                contentValues.put("daily_events_count", Long.valueOf(gVar.f6390b));
                contentValues.put("daily_conversions_count", Long.valueOf(gVar.f6391c));
                contentValues.put("daily_error_events_count", Long.valueOf(gVar.d));
                contentValues.put("daily_realtime_events_count", Long.valueOf(gVar.e));
                sQLiteDatabaseU.update("apps", contentValues, "app_id=?", strArr);
                if (cursorQuery != null) {
                    cursorQuery.close();
                }
                return gVar;
            } catch (SQLiteException e) {
                B().E().c("Error updating daily counts. appId", w3.t(str), e);
                if (0 != 0) {
                    cursor.close();
                }
                return gVar;
            }
        } catch (Throwable th) {
            if (0 != 0) {
                cursor.close();
            }
            throw th;
        }
    }

    @androidx.annotation.y0
    @com.google.android.gms.common.util.d0
    protected final long D0(String str, String str2) throws Throwable {
        long jA;
        com.google.android.gms.common.internal.r.g(str);
        com.google.android.gms.common.internal.r.g(str2);
        c();
        q();
        SQLiteDatabase sQLiteDatabaseU = u();
        sQLiteDatabaseU.beginTransaction();
        long j2 = 0;
        try {
            StringBuilder sb = new StringBuilder(String.valueOf(str2).length() + 32);
            sb.append("select ");
            sb.append(str2);
            sb.append(" from app2 where app_id=?");
            try {
                try {
                    jA = A(sb.toString(), new String[]{str}, -1L);
                    if (jA == -1) {
                        ContentValues contentValues = new ContentValues();
                        contentValues.put("app_id", str);
                        contentValues.put("first_open_count", (Integer) 0);
                        contentValues.put("previous_install_count", (Integer) 0);
                        if (sQLiteDatabaseU.insertWithOnConflict("app2", null, contentValues, 5) == -1) {
                            B().E().c("Failed to insert column (got -1). appId", w3.t(str), str2);
                            sQLiteDatabaseU.endTransaction();
                            return -1L;
                        }
                        jA = 0;
                    }
                } catch (SQLiteException e) {
                    e = e;
                }
                try {
                    ContentValues contentValues2 = new ContentValues();
                    contentValues2.put("app_id", str);
                    contentValues2.put(str2, Long.valueOf(1 + jA));
                    if (sQLiteDatabaseU.update("app2", contentValues2, "app_id = ?", new String[]{str}) == 0) {
                        B().E().c("Failed to update column (got 0). appId", w3.t(str), str2);
                        sQLiteDatabaseU.endTransaction();
                        return -1L;
                    }
                    sQLiteDatabaseU.setTransactionSuccessful();
                    sQLiteDatabaseU.endTransaction();
                    return jA;
                } catch (SQLiteException e2) {
                    e = e2;
                    j2 = jA;
                    B().E().d("Error inserting column. appId", w3.t(str), str2, e);
                    sQLiteDatabaseU.endTransaction();
                    return j2;
                }
            } catch (Throwable th) {
                th = th;
                sQLiteDatabaseU.endTransaction();
                throw th;
            }
        } catch (SQLiteException e3) {
            e = e3;
        } catch (Throwable th2) {
            th = th2;
        }
    }

    @androidx.annotation.y0
    public final g E(long j2, String str, boolean z, boolean z2, boolean z3, boolean z4, boolean z5) {
        return D(j2, str, 1L, false, false, z3, false, z5);
    }

    /* JADX WARN: Not initialized variable reg: 1, insn: 0x00d6: MOVE (r0 I:??[OBJECT, ARRAY]) = (r1 I:??[OBJECT, ARRAY]), block:B:47:0x00d6 */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00d9  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final android.os.Bundle E0(java.lang.String r8) throws java.lang.Throwable {
        /*
            r7 = this;
            r7.c()
            r7.q()
            r0 = 0
            android.database.sqlite.SQLiteDatabase r1 = r7.u()     // Catch: java.lang.Throwable -> Lbe android.database.sqlite.SQLiteException -> Lc0
            java.lang.String r2 = "select parameters from default_event_params where app_id=?"
            r3 = 1
            java.lang.String[] r3 = new java.lang.String[r3]     // Catch: java.lang.Throwable -> Lbe android.database.sqlite.SQLiteException -> Lc0
            r4 = 0
            r3[r4] = r8     // Catch: java.lang.Throwable -> Lbe android.database.sqlite.SQLiteException -> Lc0
            android.database.Cursor r1 = r1.rawQuery(r2, r3)     // Catch: java.lang.Throwable -> Lbe android.database.sqlite.SQLiteException -> Lc0
            boolean r2 = r1.moveToFirst()     // Catch: android.database.sqlite.SQLiteException -> Lbc java.lang.Throwable -> Ld5
            if (r2 != 0) goto L30
            com.google.android.gms.measurement.internal.w3 r8 = r7.B()     // Catch: android.database.sqlite.SQLiteException -> Lbc java.lang.Throwable -> Ld5
            com.google.android.gms.measurement.internal.y3 r8 = r8.N()     // Catch: android.database.sqlite.SQLiteException -> Lbc java.lang.Throwable -> Ld5
            java.lang.String r2 = "Default event parameters not found"
            r8.a(r2)     // Catch: android.database.sqlite.SQLiteException -> Lbc java.lang.Throwable -> Ld5
            if (r1 == 0) goto L2f
            r1.close()
        L2f:
            return r0
        L30:
            byte[] r2 = r1.getBlob(r4)     // Catch: android.database.sqlite.SQLiteException -> Lbc java.lang.Throwable -> Ld5
            c.a.b.b.g.c.g1$c$a r3 = c.a.b.b.g.c.g1.c.d0()     // Catch: java.io.IOException -> La4 android.database.sqlite.SQLiteException -> Lbc java.lang.Throwable -> Ld5
            c.a.b.b.g.c.u8 r2 = com.google.android.gms.measurement.internal.da.A(r3, r2)     // Catch: java.io.IOException -> La4 android.database.sqlite.SQLiteException -> Lbc java.lang.Throwable -> Ld5
            c.a.b.b.g.c.g1$c$a r2 = (c.a.b.b.g.c.g1.c.a) r2     // Catch: java.io.IOException -> La4 android.database.sqlite.SQLiteException -> Lbc java.lang.Throwable -> Ld5
            c.a.b.b.g.c.r8 r2 = r2.j()     // Catch: java.io.IOException -> La4 android.database.sqlite.SQLiteException -> Lbc java.lang.Throwable -> Ld5
            c.a.b.b.g.c.h7 r2 = (c.a.b.b.g.c.h7) r2     // Catch: java.io.IOException -> La4 android.database.sqlite.SQLiteException -> Lbc java.lang.Throwable -> Ld5
            c.a.b.b.g.c.g1$c r2 = (c.a.b.b.g.c.g1.c) r2     // Catch: java.io.IOException -> La4 android.database.sqlite.SQLiteException -> Lbc java.lang.Throwable -> Ld5
            r7.k()     // Catch: android.database.sqlite.SQLiteException -> Lbc java.lang.Throwable -> Ld5
            java.util.List r8 = r2.D()     // Catch: android.database.sqlite.SQLiteException -> Lbc java.lang.Throwable -> Ld5
            android.os.Bundle r2 = new android.os.Bundle     // Catch: android.database.sqlite.SQLiteException -> Lbc java.lang.Throwable -> Ld5
            r2.<init>()     // Catch: android.database.sqlite.SQLiteException -> Lbc java.lang.Throwable -> Ld5
            java.util.Iterator r8 = r8.iterator()     // Catch: android.database.sqlite.SQLiteException -> Lbc java.lang.Throwable -> Ld5
        L56:
            boolean r3 = r8.hasNext()     // Catch: android.database.sqlite.SQLiteException -> Lbc java.lang.Throwable -> Ld5
            if (r3 == 0) goto L9e
            java.lang.Object r3 = r8.next()     // Catch: android.database.sqlite.SQLiteException -> Lbc java.lang.Throwable -> Ld5
            c.a.b.b.g.c.g1$e r3 = (c.a.b.b.g.c.g1.e) r3     // Catch: android.database.sqlite.SQLiteException -> Lbc java.lang.Throwable -> Ld5
            java.lang.String r4 = r3.P()     // Catch: android.database.sqlite.SQLiteException -> Lbc java.lang.Throwable -> Ld5
            boolean r5 = r3.c0()     // Catch: android.database.sqlite.SQLiteException -> Lbc java.lang.Throwable -> Ld5
            if (r5 == 0) goto L74
            double r5 = r3.d0()     // Catch: android.database.sqlite.SQLiteException -> Lbc java.lang.Throwable -> Ld5
            r2.putDouble(r4, r5)     // Catch: android.database.sqlite.SQLiteException -> Lbc java.lang.Throwable -> Ld5
            goto L56
        L74:
            boolean r5 = r3.a0()     // Catch: android.database.sqlite.SQLiteException -> Lbc java.lang.Throwable -> Ld5
            if (r5 == 0) goto L82
            float r3 = r3.b0()     // Catch: android.database.sqlite.SQLiteException -> Lbc java.lang.Throwable -> Ld5
            r2.putFloat(r4, r3)     // Catch: android.database.sqlite.SQLiteException -> Lbc java.lang.Throwable -> Ld5
            goto L56
        L82:
            boolean r5 = r3.U()     // Catch: android.database.sqlite.SQLiteException -> Lbc java.lang.Throwable -> Ld5
            if (r5 == 0) goto L90
            java.lang.String r3 = r3.V()     // Catch: android.database.sqlite.SQLiteException -> Lbc java.lang.Throwable -> Ld5
            r2.putString(r4, r3)     // Catch: android.database.sqlite.SQLiteException -> Lbc java.lang.Throwable -> Ld5
            goto L56
        L90:
            boolean r5 = r3.Y()     // Catch: android.database.sqlite.SQLiteException -> Lbc java.lang.Throwable -> Ld5
            if (r5 == 0) goto L56
            long r5 = r3.Z()     // Catch: android.database.sqlite.SQLiteException -> Lbc java.lang.Throwable -> Ld5
            r2.putLong(r4, r5)     // Catch: android.database.sqlite.SQLiteException -> Lbc java.lang.Throwable -> Ld5
            goto L56
        L9e:
            if (r1 == 0) goto La3
            r1.close()
        La3:
            return r2
        La4:
            r2 = move-exception
            com.google.android.gms.measurement.internal.w3 r3 = r7.B()     // Catch: android.database.sqlite.SQLiteException -> Lbc java.lang.Throwable -> Ld5
            com.google.android.gms.measurement.internal.y3 r3 = r3.E()     // Catch: android.database.sqlite.SQLiteException -> Lbc java.lang.Throwable -> Ld5
            java.lang.String r4 = "Failed to retrieve default event parameters. appId"
            java.lang.Object r8 = com.google.android.gms.measurement.internal.w3.t(r8)     // Catch: android.database.sqlite.SQLiteException -> Lbc java.lang.Throwable -> Ld5
            r3.c(r4, r8, r2)     // Catch: android.database.sqlite.SQLiteException -> Lbc java.lang.Throwable -> Ld5
            if (r1 == 0) goto Lbb
            r1.close()
        Lbb:
            return r0
        Lbc:
            r8 = move-exception
            goto Lc2
        Lbe:
            r8 = move-exception
            goto Ld7
        Lc0:
            r8 = move-exception
            r1 = r0
        Lc2:
            com.google.android.gms.measurement.internal.w3 r2 = r7.B()     // Catch: java.lang.Throwable -> Ld5
            com.google.android.gms.measurement.internal.y3 r2 = r2.E()     // Catch: java.lang.Throwable -> Ld5
            java.lang.String r3 = "Error selecting default event parameters"
            r2.b(r3, r8)     // Catch: java.lang.Throwable -> Ld5
            if (r1 == 0) goto Ld4
            r1.close()
        Ld4:
            return r0
        Ld5:
            r8 = move-exception
            r0 = r1
        Ld7:
            if (r0 == 0) goto Ldc
            r0.close()
        Ldc:
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.d.E0(java.lang.String):android.os.Bundle");
    }

    public final e F0(String str) {
        com.google.android.gms.common.internal.r.k(str);
        c();
        q();
        return e.b(K("select consent_state from consent_settings where app_id=? limit 1;", new String[]{str}, "G1"));
    }

    /* JADX WARN: Not initialized variable reg: 14, insn: 0x014c: MOVE (r18 I:??[OBJECT, ARRAY]) = (r14 I:??[OBJECT, ARRAY]), block:B:66:0x014c */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0147  */
    @androidx.annotation.y0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final com.google.android.gms.measurement.internal.o G(java.lang.String r26, java.lang.String r27) {
        /*
            Method dump skipped, instructions count: 340
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.d.G(java.lang.String, java.lang.String):com.google.android.gms.measurement.internal.o");
    }

    @androidx.annotation.y0
    final void G0() {
        int r0;
        c();
        q();
        if (k0()) {
            long jA = i().h.a();
            long jC = z().c();
            if (Math.abs(jC - jA) > u.z.a(null).longValue()) {
                i().h.b(jC);
                c();
                q();
                if (!k0() || (r0 = u().delete("queue", "abs(bundle_end_timestamp - ?) > cast(? as integer)", new String[]{String.valueOf(z().a()), String.valueOf(xa.K())})) <= 0) {
                    return;
                }
                B().N().b("Deleted stale rows. rowsDeleted", Integer.valueOf(r0));
            }
        }
    }

    @androidx.annotation.y0
    public final long H0() {
        return A("select max(bundle_end_timestamp) from queue", null, 0L);
    }

    @androidx.annotation.y0
    public final long I0() {
        return A("select max(timestamp) from raw_events", null, 0L);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:27:0x005b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.String J(long r5) throws java.lang.Throwable {
        /*
            r4 = this;
            r4.c()
            r4.q()
            r0 = 0
            android.database.sqlite.SQLiteDatabase r1 = r4.u()     // Catch: java.lang.Throwable -> L40 android.database.sqlite.SQLiteException -> L42
            java.lang.String r2 = "select app_id from apps where app_id in (select distinct app_id from raw_events) and config_fetched_time < ? order by failed_config_fetch_time limit 1;"
            r3 = 1
            java.lang.String[] r3 = new java.lang.String[r3]     // Catch: java.lang.Throwable -> L40 android.database.sqlite.SQLiteException -> L42
            java.lang.String r5 = java.lang.String.valueOf(r5)     // Catch: java.lang.Throwable -> L40 android.database.sqlite.SQLiteException -> L42
            r6 = 0
            r3[r6] = r5     // Catch: java.lang.Throwable -> L40 android.database.sqlite.SQLiteException -> L42
            android.database.Cursor r5 = r1.rawQuery(r2, r3)     // Catch: java.lang.Throwable -> L40 android.database.sqlite.SQLiteException -> L42
            boolean r1 = r5.moveToFirst()     // Catch: android.database.sqlite.SQLiteException -> L3e java.lang.Throwable -> L57
            if (r1 != 0) goto L34
            com.google.android.gms.measurement.internal.w3 r6 = r4.B()     // Catch: android.database.sqlite.SQLiteException -> L3e java.lang.Throwable -> L57
            com.google.android.gms.measurement.internal.y3 r6 = r6.N()     // Catch: android.database.sqlite.SQLiteException -> L3e java.lang.Throwable -> L57
            java.lang.String r1 = "No expired configs for apps with pending events"
            r6.a(r1)     // Catch: android.database.sqlite.SQLiteException -> L3e java.lang.Throwable -> L57
            if (r5 == 0) goto L33
            r5.close()
        L33:
            return r0
        L34:
            java.lang.String r6 = r5.getString(r6)     // Catch: android.database.sqlite.SQLiteException -> L3e java.lang.Throwable -> L57
            if (r5 == 0) goto L3d
            r5.close()
        L3d:
            return r6
        L3e:
            r6 = move-exception
            goto L44
        L40:
            r6 = move-exception
            goto L59
        L42:
            r6 = move-exception
            r5 = r0
        L44:
            com.google.android.gms.measurement.internal.w3 r1 = r4.B()     // Catch: java.lang.Throwable -> L57
            com.google.android.gms.measurement.internal.y3 r1 = r1.E()     // Catch: java.lang.Throwable -> L57
            java.lang.String r2 = "Error selecting expired configs"
            r1.b(r2, r6)     // Catch: java.lang.Throwable -> L57
            if (r5 == 0) goto L56
            r5.close()
        L56:
            return r0
        L57:
            r6 = move-exception
            r0 = r5
        L59:
            if (r0 == 0) goto L5e
            r0.close()
        L5e:
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.d.J(long):java.lang.String");
    }

    public final boolean J0() {
        return l0("select count(1) > 0 from raw_events", null) != 0;
    }

    public final boolean K0() {
        return l0("select count(1) > 0 from raw_events where realtime = 1", null) != 0;
    }

    /* JADX WARN: Removed duplicated region for block: B:41:0x00bd  */
    @androidx.annotation.y0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.util.List<com.google.android.gms.measurement.internal.ea> L(java.lang.String r14) throws java.lang.Throwable {
        /*
            r13 = this;
            com.google.android.gms.common.internal.r.g(r14)
            r13.c()
            r13.q()
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r1 = 0
            android.database.sqlite.SQLiteDatabase r2 = r13.u()     // Catch: java.lang.Throwable -> L82 android.database.sqlite.SQLiteException -> L84
            java.lang.String r3 = "user_attributes"
            java.lang.String r4 = "name"
            java.lang.String r5 = "origin"
            java.lang.String r6 = "set_timestamp"
            java.lang.String r7 = "value"
            java.lang.String[] r4 = new java.lang.String[]{r4, r5, r6, r7}     // Catch: java.lang.Throwable -> L82 android.database.sqlite.SQLiteException -> L84
            java.lang.String r5 = "app_id=?"
            r11 = 1
            java.lang.String[] r6 = new java.lang.String[r11]     // Catch: java.lang.Throwable -> L82 android.database.sqlite.SQLiteException -> L84
            r12 = 0
            r6[r12] = r14     // Catch: java.lang.Throwable -> L82 android.database.sqlite.SQLiteException -> L84
            r7 = 0
            r8 = 0
            java.lang.String r9 = "rowid"
            java.lang.String r10 = "1000"
            android.database.Cursor r2 = r2.query(r3, r4, r5, r6, r7, r8, r9, r10)     // Catch: java.lang.Throwable -> L82 android.database.sqlite.SQLiteException -> L84
            boolean r3 = r2.moveToFirst()     // Catch: android.database.sqlite.SQLiteException -> L80 java.lang.Throwable -> Lb9
            if (r3 != 0) goto L3f
            if (r2 == 0) goto L3e
            r2.close()
        L3e:
            return r0
        L3f:
            java.lang.String r7 = r2.getString(r12)     // Catch: android.database.sqlite.SQLiteException -> L80 java.lang.Throwable -> Lb9
            java.lang.String r3 = r2.getString(r11)     // Catch: android.database.sqlite.SQLiteException -> L80 java.lang.Throwable -> Lb9
            if (r3 != 0) goto L4b
            java.lang.String r3 = ""
        L4b:
            r6 = r3
            r3 = 2
            long r8 = r2.getLong(r3)     // Catch: android.database.sqlite.SQLiteException -> L80 java.lang.Throwable -> Lb9
            r3 = 3
            java.lang.Object r10 = r13.I(r2, r3)     // Catch: android.database.sqlite.SQLiteException -> L80 java.lang.Throwable -> Lb9
            if (r10 != 0) goto L6a
            com.google.android.gms.measurement.internal.w3 r3 = r13.B()     // Catch: android.database.sqlite.SQLiteException -> L80 java.lang.Throwable -> Lb9
            com.google.android.gms.measurement.internal.y3 r3 = r3.E()     // Catch: android.database.sqlite.SQLiteException -> L80 java.lang.Throwable -> Lb9
            java.lang.String r4 = "Read invalid user property value, ignoring it. appId"
            java.lang.Object r5 = com.google.android.gms.measurement.internal.w3.t(r14)     // Catch: android.database.sqlite.SQLiteException -> L80 java.lang.Throwable -> Lb9
            r3.b(r4, r5)     // Catch: android.database.sqlite.SQLiteException -> L80 java.lang.Throwable -> Lb9
            goto L74
        L6a:
            com.google.android.gms.measurement.internal.ea r3 = new com.google.android.gms.measurement.internal.ea     // Catch: android.database.sqlite.SQLiteException -> L80 java.lang.Throwable -> Lb9
            r4 = r3
            r5 = r14
            r4.<init>(r5, r6, r7, r8, r10)     // Catch: android.database.sqlite.SQLiteException -> L80 java.lang.Throwable -> Lb9
            r0.add(r3)     // Catch: android.database.sqlite.SQLiteException -> L80 java.lang.Throwable -> Lb9
        L74:
            boolean r3 = r2.moveToNext()     // Catch: android.database.sqlite.SQLiteException -> L80 java.lang.Throwable -> Lb9
            if (r3 != 0) goto L3f
            if (r2 == 0) goto L7f
            r2.close()
        L7f:
            return r0
        L80:
            r0 = move-exception
            goto L86
        L82:
            r14 = move-exception
            goto Lbb
        L84:
            r0 = move-exception
            r2 = r1
        L86:
            com.google.android.gms.measurement.internal.w3 r3 = r13.B()     // Catch: java.lang.Throwable -> Lb9
            com.google.android.gms.measurement.internal.y3 r3 = r3.E()     // Catch: java.lang.Throwable -> Lb9
            java.lang.String r4 = "Error querying user properties. appId"
            java.lang.Object r5 = com.google.android.gms.measurement.internal.w3.t(r14)     // Catch: java.lang.Throwable -> Lb9
            r3.c(r4, r5, r0)     // Catch: java.lang.Throwable -> Lb9
            boolean r0 = c.a.b.b.g.c.pc.b()     // Catch: java.lang.Throwable -> Lb9
            if (r0 == 0) goto Lb3
            com.google.android.gms.measurement.internal.xa r0 = r13.j()     // Catch: java.lang.Throwable -> Lb9
            com.google.android.gms.measurement.internal.l3<java.lang.Boolean> r3 = com.google.android.gms.measurement.internal.u.H0     // Catch: java.lang.Throwable -> Lb9
            boolean r14 = r0.C(r14, r3)     // Catch: java.lang.Throwable -> Lb9
            if (r14 == 0) goto Lb3
            java.util.List r14 = java.util.Collections.emptyList()     // Catch: java.lang.Throwable -> Lb9
            if (r2 == 0) goto Lb2
            r2.close()
        Lb2:
            return r14
        Lb3:
            if (r2 == 0) goto Lb8
            r2.close()
        Lb8:
            return r1
        Lb9:
            r14 = move-exception
            r1 = r2
        Lbb:
            if (r1 == 0) goto Lc0
            r1.close()
        Lc0:
            throw r14
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.d.L(java.lang.String):java.util.List");
    }

    public final long L0() {
        Cursor cursorRawQuery = null;
        try {
            try {
                cursorRawQuery = u().rawQuery("select rowid from raw_events order by rowid desc limit 1;", null);
                if (!cursorRawQuery.moveToFirst()) {
                    if (cursorRawQuery != null) {
                        cursorRawQuery.close();
                    }
                    return -1L;
                }
                long j2 = cursorRawQuery.getLong(0);
                if (cursorRawQuery != null) {
                    cursorRawQuery.close();
                }
                return j2;
            } catch (SQLiteException e) {
                B().E().b("Error querying raw events", e);
                if (cursorRawQuery != null) {
                    cursorRawQuery.close();
                }
                return -1L;
            }
        } catch (Throwable th) {
            if (cursorRawQuery != null) {
                cursorRawQuery.close();
            }
            throw th;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:38:0x00c5 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00c9  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00c7 A[EDGE_INSN: B:59:0x00c7->B:39:0x00c7 BREAK  A[LOOP:0: B:18:0x0054->B:61:?], SYNTHETIC] */
    @androidx.annotation.y0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.util.List<android.util.Pair<c.a.b.b.g.c.g1.g, java.lang.Long>> M(java.lang.String r13, int r14, int r15) {
        /*
            r12 = this;
            r12.c()
            r12.q()
            r0 = 1
            r1 = 0
            if (r14 <= 0) goto Lc
            r2 = 1
            goto Ld
        Lc:
            r2 = 0
        Ld:
            com.google.android.gms.common.internal.r.a(r2)
            if (r15 <= 0) goto L14
            r2 = 1
            goto L15
        L14:
            r2 = 0
        L15:
            com.google.android.gms.common.internal.r.a(r2)
            com.google.android.gms.common.internal.r.g(r13)
            r2 = 0
            android.database.sqlite.SQLiteDatabase r3 = r12.u()     // Catch: java.lang.Throwable -> Lcd android.database.sqlite.SQLiteException -> Lcf
            java.lang.String r4 = "queue"
            java.lang.String r5 = "rowid"
            java.lang.String r6 = "data"
            java.lang.String r7 = "retry_count"
            java.lang.String[] r5 = new java.lang.String[]{r5, r6, r7}     // Catch: java.lang.Throwable -> Lcd android.database.sqlite.SQLiteException -> Lcf
            java.lang.String r6 = "app_id=?"
            java.lang.String[] r7 = new java.lang.String[r0]     // Catch: java.lang.Throwable -> Lcd android.database.sqlite.SQLiteException -> Lcf
            r7[r1] = r13     // Catch: java.lang.Throwable -> Lcd android.database.sqlite.SQLiteException -> Lcf
            r8 = 0
            r9 = 0
            java.lang.String r10 = "rowid"
            java.lang.String r11 = java.lang.String.valueOf(r14)     // Catch: java.lang.Throwable -> Lcd android.database.sqlite.SQLiteException -> Lcf
            android.database.Cursor r2 = r3.query(r4, r5, r6, r7, r8, r9, r10, r11)     // Catch: java.lang.Throwable -> Lcd android.database.sqlite.SQLiteException -> Lcf
            boolean r14 = r2.moveToFirst()     // Catch: java.lang.Throwable -> Lcd android.database.sqlite.SQLiteException -> Lcf
            if (r14 != 0) goto L4e
            java.util.List r13 = java.util.Collections.emptyList()     // Catch: java.lang.Throwable -> Lcd android.database.sqlite.SQLiteException -> Lcf
            if (r2 == 0) goto L4d
            r2.close()
        L4d:
            return r13
        L4e:
            java.util.ArrayList r14 = new java.util.ArrayList     // Catch: java.lang.Throwable -> Lcd android.database.sqlite.SQLiteException -> Lcf
            r14.<init>()     // Catch: java.lang.Throwable -> Lcd android.database.sqlite.SQLiteException -> Lcf
            r3 = 0
        L54:
            long r4 = r2.getLong(r1)     // Catch: java.lang.Throwable -> Lcd android.database.sqlite.SQLiteException -> Lcf
            byte[] r6 = r2.getBlob(r0)     // Catch: java.io.IOException -> Laf java.lang.Throwable -> Lcd android.database.sqlite.SQLiteException -> Lcf
            com.google.android.gms.measurement.internal.da r7 = r12.k()     // Catch: java.io.IOException -> Laf java.lang.Throwable -> Lcd android.database.sqlite.SQLiteException -> Lcf
            byte[] r6 = r7.Y(r6)     // Catch: java.io.IOException -> Laf java.lang.Throwable -> Lcd android.database.sqlite.SQLiteException -> Lcf
            boolean r7 = r14.isEmpty()     // Catch: java.lang.Throwable -> Lcd android.database.sqlite.SQLiteException -> Lcf
            if (r7 != 0) goto L6e
            int r7 = r6.length     // Catch: java.lang.Throwable -> Lcd android.database.sqlite.SQLiteException -> Lcf
            int r7 = r7 + r3
            if (r7 > r15) goto Lc7
        L6e:
            c.a.b.b.g.c.g1$g$a r7 = c.a.b.b.g.c.g1.g.T0()     // Catch: java.io.IOException -> L9c java.lang.Throwable -> Lcd android.database.sqlite.SQLiteException -> Lcf
            c.a.b.b.g.c.u8 r7 = com.google.android.gms.measurement.internal.da.A(r7, r6)     // Catch: java.io.IOException -> L9c java.lang.Throwable -> Lcd android.database.sqlite.SQLiteException -> Lcf
            c.a.b.b.g.c.g1$g$a r7 = (c.a.b.b.g.c.g1.g.a) r7     // Catch: java.io.IOException -> L9c java.lang.Throwable -> Lcd android.database.sqlite.SQLiteException -> Lcf
            r8 = 2
            boolean r9 = r2.isNull(r8)     // Catch: java.lang.Throwable -> Lcd android.database.sqlite.SQLiteException -> Lcf
            if (r9 != 0) goto L86
            int r8 = r2.getInt(r8)     // Catch: java.lang.Throwable -> Lcd android.database.sqlite.SQLiteException -> Lcf
            r7.x0(r8)     // Catch: java.lang.Throwable -> Lcd android.database.sqlite.SQLiteException -> Lcf
        L86:
            int r6 = r6.length     // Catch: java.lang.Throwable -> Lcd android.database.sqlite.SQLiteException -> Lcf
            int r3 = r3 + r6
            c.a.b.b.g.c.r8 r6 = r7.j()     // Catch: java.lang.Throwable -> Lcd android.database.sqlite.SQLiteException -> Lcf
            c.a.b.b.g.c.h7 r6 = (c.a.b.b.g.c.h7) r6     // Catch: java.lang.Throwable -> Lcd android.database.sqlite.SQLiteException -> Lcf
            c.a.b.b.g.c.g1$g r6 = (c.a.b.b.g.c.g1.g) r6     // Catch: java.lang.Throwable -> Lcd android.database.sqlite.SQLiteException -> Lcf
            java.lang.Long r4 = java.lang.Long.valueOf(r4)     // Catch: java.lang.Throwable -> Lcd android.database.sqlite.SQLiteException -> Lcf
            android.util.Pair r4 = android.util.Pair.create(r6, r4)     // Catch: java.lang.Throwable -> Lcd android.database.sqlite.SQLiteException -> Lcf
            r14.add(r4)     // Catch: java.lang.Throwable -> Lcd android.database.sqlite.SQLiteException -> Lcf
            goto Lbf
        L9c:
            r4 = move-exception
            com.google.android.gms.measurement.internal.w3 r5 = r12.B()     // Catch: java.lang.Throwable -> Lcd android.database.sqlite.SQLiteException -> Lcf
            com.google.android.gms.measurement.internal.y3 r5 = r5.E()     // Catch: java.lang.Throwable -> Lcd android.database.sqlite.SQLiteException -> Lcf
            java.lang.String r6 = "Failed to merge queued bundle. appId"
            java.lang.Object r7 = com.google.android.gms.measurement.internal.w3.t(r13)     // Catch: java.lang.Throwable -> Lcd android.database.sqlite.SQLiteException -> Lcf
        Lab:
            r5.c(r6, r7, r4)     // Catch: java.lang.Throwable -> Lcd android.database.sqlite.SQLiteException -> Lcf
            goto Lbf
        Laf:
            r4 = move-exception
            com.google.android.gms.measurement.internal.w3 r5 = r12.B()     // Catch: java.lang.Throwable -> Lcd android.database.sqlite.SQLiteException -> Lcf
            com.google.android.gms.measurement.internal.y3 r5 = r5.E()     // Catch: java.lang.Throwable -> Lcd android.database.sqlite.SQLiteException -> Lcf
            java.lang.String r6 = "Failed to unzip queued bundle. appId"
            java.lang.Object r7 = com.google.android.gms.measurement.internal.w3.t(r13)     // Catch: java.lang.Throwable -> Lcd android.database.sqlite.SQLiteException -> Lcf
            goto Lab
        Lbf:
            boolean r4 = r2.moveToNext()     // Catch: java.lang.Throwable -> Lcd android.database.sqlite.SQLiteException -> Lcf
            if (r4 == 0) goto Lc7
            if (r3 <= r15) goto L54
        Lc7:
            if (r2 == 0) goto Lcc
            r2.close()
        Lcc:
            return r14
        Lcd:
            r13 = move-exception
            goto Leb
        Lcf:
            r14 = move-exception
            com.google.android.gms.measurement.internal.w3 r15 = r12.B()     // Catch: java.lang.Throwable -> Lcd
            com.google.android.gms.measurement.internal.y3 r15 = r15.E()     // Catch: java.lang.Throwable -> Lcd
            java.lang.String r0 = "Error querying bundles. appId"
            java.lang.Object r13 = com.google.android.gms.measurement.internal.w3.t(r13)     // Catch: java.lang.Throwable -> Lcd
            r15.c(r0, r13, r14)     // Catch: java.lang.Throwable -> Lcd
            java.util.List r13 = java.util.Collections.emptyList()     // Catch: java.lang.Throwable -> Lcd
            if (r2 == 0) goto Lea
            r2.close()
        Lea:
            return r13
        Leb:
            if (r2 == 0) goto Lf0
            r2.close()
        Lf0:
            throw r13
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.d.M(java.lang.String, int, int):java.util.List");
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x008f, code lost:
    
        B().E().b("Read more than the max allowed user properties, ignoring excess", 1000);
     */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0134  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x013c  */
    @androidx.annotation.y0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.util.List<com.google.android.gms.measurement.internal.ea> N(java.lang.String r21, java.lang.String r22, java.lang.String r23) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 320
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.d.N(java.lang.String, java.lang.String, java.lang.String):java.util.List");
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0052, code lost:
    
        B().E().b("Read more than the max allowed conditional properties, ignoring extra", 1000);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.util.List<com.google.android.gms.measurement.internal.va> O(java.lang.String r25, java.lang.String[] r26) {
        /*
            Method dump skipped, instructions count: 296
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.d.O(java.lang.String, java.lang.String[]):java.util.List");
    }

    @androidx.annotation.y0
    public final void Q(o oVar) {
        com.google.android.gms.common.internal.r.k(oVar);
        c();
        q();
        ContentValues contentValues = new ContentValues();
        contentValues.put("app_id", oVar.f6471a);
        contentValues.put(a.C0190a.f6334b, oVar.f6472b);
        contentValues.put("lifetime_count", Long.valueOf(oVar.f6473c));
        contentValues.put("current_bundle_count", Long.valueOf(oVar.d));
        contentValues.put("last_fire_timestamp", Long.valueOf(oVar.f));
        contentValues.put("last_bundled_timestamp", Long.valueOf(oVar.g));
        contentValues.put("last_bundled_day", oVar.h);
        contentValues.put("last_sampled_complex_event_id", oVar.i);
        contentValues.put("last_sampling_rate", oVar.j);
        contentValues.put("current_session_count", Long.valueOf(oVar.e));
        Boolean bool = oVar.k;
        contentValues.put("last_exempt_from_sampling", (bool == null || !bool.booleanValue()) ? null : 1L);
        try {
            if (u().insertWithOnConflict("events", null, contentValues, 5) == -1) {
                B().E().b("Failed to insert/update event aggregates (got -1). appId", w3.t(oVar.f6471a));
            }
        } catch (SQLiteException e) {
            B().E().c("Error storing event aggregates. appId", w3.t(oVar.f6471a), e);
        }
    }

    @androidx.annotation.y0
    public final void R(f4 f4Var) {
        com.google.android.gms.common.internal.r.k(f4Var);
        c();
        q();
        ContentValues contentValues = new ContentValues();
        contentValues.put("app_id", f4Var.t());
        contentValues.put("app_instance_id", f4Var.x());
        contentValues.put("gmp_app_id", f4Var.A());
        contentValues.put("resettable_device_id_hash", f4Var.J());
        contentValues.put("last_bundle_index", Long.valueOf(f4Var.f0()));
        contentValues.put("last_bundle_start_timestamp", Long.valueOf(f4Var.P()));
        contentValues.put("last_bundle_end_timestamp", Long.valueOf(f4Var.R()));
        contentValues.put("app_version", f4Var.T());
        contentValues.put("app_store", f4Var.X());
        contentValues.put("gmp_version", Long.valueOf(f4Var.Z()));
        contentValues.put("dev_cert_hash", Long.valueOf(f4Var.b0()));
        contentValues.put("measurement_enabled", Boolean.valueOf(f4Var.e0()));
        contentValues.put("day", Long.valueOf(f4Var.j0()));
        contentValues.put("daily_public_events_count", Long.valueOf(f4Var.k0()));
        contentValues.put("daily_events_count", Long.valueOf(f4Var.l0()));
        contentValues.put("daily_conversions_count", Long.valueOf(f4Var.m0()));
        contentValues.put("config_fetched_time", Long.valueOf(f4Var.g0()));
        contentValues.put("failed_config_fetch_time", Long.valueOf(f4Var.h0()));
        contentValues.put("app_version_int", Long.valueOf(f4Var.V()));
        contentValues.put("firebase_instance_id", f4Var.M());
        contentValues.put("daily_error_events_count", Long.valueOf(f4Var.h()));
        contentValues.put("daily_realtime_events_count", Long.valueOf(f4Var.g()));
        contentValues.put("health_monitor_sample", f4Var.i());
        contentValues.put("android_id", Long.valueOf(f4Var.k()));
        contentValues.put("adid_reporting_enabled", Boolean.valueOf(f4Var.l()));
        contentValues.put("ssaid_reporting_enabled", Boolean.valueOf(f4Var.m()));
        contentValues.put("admob_app_id", f4Var.D());
        contentValues.put("dynamite_version", Long.valueOf(f4Var.d0()));
        if (f4Var.o() != null) {
            if (f4Var.o().size() == 0) {
                B().I().b("Safelisted events should not be an empty list. appId", f4Var.t());
            } else {
                contentValues.put("safelisted_events", TextUtils.join(",", f4Var.o()));
            }
        }
        if (hd.b() && j().C(f4Var.t(), u.k0)) {
            contentValues.put("ga_app_id", f4Var.G());
        }
        try {
            SQLiteDatabase sQLiteDatabaseU = u();
            if (sQLiteDatabaseU.update("apps", contentValues, "app_id = ?", new String[]{f4Var.t()}) == 0 && sQLiteDatabaseU.insertWithOnConflict("apps", null, contentValues, 5) == -1) {
                B().E().b("Failed to insert/update app (got -1). appId", w3.t(f4Var.t()));
            }
        } catch (SQLiteException e) {
            B().E().c("Error storing app. appId", w3.t(f4Var.t()), e);
        }
    }

    @androidx.annotation.y0
    final void S(String str, List<x0.a> list) {
        boolean z;
        y3 y3VarI;
        String str2;
        Object objT;
        Integer numValueOf;
        boolean z2;
        com.google.android.gms.common.internal.r.k(list);
        for (int r8 = 0; r8 < list.size(); r8++) {
            x0.a.C0130a c0130aX = list.get(r8).x();
            if (c0130aX.D() != 0) {
                for (int r11 = 0; r11 < c0130aX.D(); r11++) {
                    x0.b.a aVarX = c0130aX.F(r11).x();
                    x0.b.a aVar = (x0.b.a) ((h7.a) aVarX.clone());
                    String strB = z5.b(aVarX.C());
                    if (strB != null) {
                        aVar.z(strB);
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    for (int r15 = 0; r15 < aVarX.D(); r15++) {
                        x0.c cVarA = aVarX.A(r15);
                        String strA = c6.a(cVarA.N());
                        if (strA != null) {
                            aVar.x(r15, (x0.c) ((c.a.b.b.g.c.h7) cVarA.x().x(strA).j()));
                            z2 = true;
                        }
                    }
                    if (z2) {
                        c0130aX = c0130aX.z(r11, aVar);
                        list.set(r8, (x0.a) ((c.a.b.b.g.c.h7) c0130aX.j()));
                    }
                }
            }
            if (c0130aX.x() != 0) {
                for (int r7 = 0; r7 < c0130aX.x(); r7++) {
                    x0.e eVarC = c0130aX.C(r7);
                    String strA2 = b6.a(eVarC.G());
                    if (strA2 != null) {
                        c0130aX = c0130aX.A(r7, eVarC.x().x(strA2));
                        list.set(r8, (x0.a) ((c.a.b.b.g.c.h7) c0130aX.j()));
                    }
                }
            }
        }
        q();
        c();
        com.google.android.gms.common.internal.r.g(str);
        com.google.android.gms.common.internal.r.k(list);
        SQLiteDatabase sQLiteDatabaseU = u();
        sQLiteDatabaseU.beginTransaction();
        try {
            q();
            c();
            com.google.android.gms.common.internal.r.g(str);
            SQLiteDatabase sQLiteDatabaseU2 = u();
            sQLiteDatabaseU2.delete("property_filters", "app_id=?", new String[]{str});
            sQLiteDatabaseU2.delete("event_filters", "app_id=?", new String[]{str});
            for (x0.a aVar2 : list) {
                q();
                c();
                com.google.android.gms.common.internal.r.g(str);
                com.google.android.gms.common.internal.r.k(aVar2);
                if (aVar2.J()) {
                    int r9 = aVar2.K();
                    Iterator<x0.b> it = aVar2.O().iterator();
                    while (true) {
                        if (it.hasNext()) {
                            if (!it.next().J()) {
                                y3VarI = B().I();
                                str2 = "Event filter with no ID. Audience definition ignored. appId, audienceId";
                                objT = w3.t(str);
                                numValueOf = Integer.valueOf(r9);
                                break;
                            }
                        } else {
                            Iterator<x0.e> it2 = aVar2.M().iterator();
                            while (it2.hasNext()) {
                                if (!it2.next().E()) {
                                    y3VarI = B().I();
                                    str2 = "Property filter with no ID. Audience definition ignored. appId, audienceId";
                                    objT = w3.t(str);
                                    numValueOf = Integer.valueOf(r9);
                                }
                            }
                            Iterator<x0.b> it3 = aVar2.O().iterator();
                            while (true) {
                                if (it3.hasNext()) {
                                    if (!Y(str, r9, it3.next())) {
                                        z = false;
                                        break;
                                    }
                                } else {
                                    z = true;
                                    break;
                                }
                            }
                            if (z) {
                                Iterator<x0.e> it4 = aVar2.M().iterator();
                                while (true) {
                                    if (it4.hasNext()) {
                                        if (!Z(str, r9, it4.next())) {
                                            z = false;
                                            break;
                                        }
                                    } else {
                                        break;
                                    }
                                }
                            }
                            if (!z) {
                                q();
                                c();
                                com.google.android.gms.common.internal.r.g(str);
                                SQLiteDatabase sQLiteDatabaseU3 = u();
                                sQLiteDatabaseU3.delete("property_filters", "app_id=? and audience_id=?", new String[]{str, String.valueOf(r9)});
                                sQLiteDatabaseU3.delete("event_filters", "app_id=? and audience_id=?", new String[]{str, String.valueOf(r9)});
                            }
                        }
                    }
                    y3VarI.c(str2, objT, numValueOf);
                    break;
                }
                B().I().b("Audience with no ID. appId", w3.t(str));
            }
            ArrayList arrayList = new ArrayList();
            for (x0.a aVar3 : list) {
                arrayList.add(aVar3.J() ? Integer.valueOf(aVar3.K()) : null);
            }
            p0(str, arrayList);
            sQLiteDatabaseU.setTransactionSuccessful();
        } finally {
            sQLiteDatabaseU.endTransaction();
        }
    }

    @androidx.annotation.y0
    @com.google.android.gms.common.util.d0
    final void T(List<Long> list) throws SQLException {
        c();
        q();
        com.google.android.gms.common.internal.r.k(list);
        com.google.android.gms.common.internal.r.m(list.size());
        if (k0()) {
            String strJoin = TextUtils.join(",", list);
            StringBuilder sb = new StringBuilder(String.valueOf(strJoin).length() + 2);
            sb.append("(");
            sb.append(strJoin);
            sb.append(")");
            String string = sb.toString();
            StringBuilder sb2 = new StringBuilder(String.valueOf(string).length() + 80);
            sb2.append("SELECT COUNT(1) FROM queue WHERE rowid IN ");
            sb2.append(string);
            sb2.append(" AND retry_count =  2147483647 LIMIT 1");
            if (l0(sb2.toString(), null) > 0) {
                B().I().a("The number of upload retries exceeds the limit. Will remain unchanged.");
            }
            try {
                SQLiteDatabase sQLiteDatabaseU = u();
                StringBuilder sb3 = new StringBuilder(String.valueOf(string).length() + 127);
                sb3.append("UPDATE queue SET retry_count = IFNULL(retry_count, 0) + 1 WHERE rowid IN ");
                sb3.append(string);
                sb3.append(" AND (retry_count IS NULL OR retry_count < 2147483647)");
                sQLiteDatabaseU.execSQL(sb3.toString());
            } catch (SQLiteException e) {
                B().E().b("Error incrementing retry count. error", e);
            }
        }
    }

    @androidx.annotation.y0
    public final boolean U(g1.g gVar, boolean z) throws IllegalStateException {
        y3 y3VarE;
        Object objT;
        String str;
        ContentValues contentValues;
        c();
        q();
        com.google.android.gms.common.internal.r.k(gVar);
        com.google.android.gms.common.internal.r.g(gVar.Y2());
        com.google.android.gms.common.internal.r.q(gVar.x2());
        G0();
        long jA = z().a();
        if (gVar.y2() < jA - xa.K() || gVar.y2() > xa.K() + jA) {
            B().I().d("Storing bundle outside of the max uploading time span. appId, now, timestamp", w3.t(gVar.Y2()), Long.valueOf(jA), Long.valueOf(gVar.y2()));
        }
        try {
            byte[] bArrZ = k().Z(gVar.l());
            B().N().b("Saving bundle, size", Integer.valueOf(bArrZ.length));
            contentValues = new ContentValues();
            contentValues.put("app_id", gVar.Y2());
            contentValues.put("bundle_end_timestamp", Long.valueOf(gVar.y2()));
            contentValues.put("data", bArrZ);
            contentValues.put("has_realtime", Integer.valueOf(z ? 1 : 0));
            if (gVar.z0()) {
                contentValues.put("retry_count", Integer.valueOf(gVar.M0()));
            }
        } catch (IOException e) {
            e = e;
            y3VarE = B().E();
            objT = w3.t(gVar.Y2());
            str = "Data loss. Failed to serialize bundle. appId";
        }
        try {
            if (u().insert("queue", null, contentValues) != -1) {
                return true;
            }
            B().E().b("Failed to insert bundle (got -1). appId", w3.t(gVar.Y2()));
            return false;
        } catch (SQLiteException e2) {
            e = e2;
            y3VarE = B().E();
            objT = w3.t(gVar.Y2());
            str = "Error storing bundle. appId";
            y3VarE.c(str, objT, e);
            return false;
        }
    }

    public final boolean V(l lVar, long j2, boolean z) {
        c();
        q();
        com.google.android.gms.common.internal.r.k(lVar);
        com.google.android.gms.common.internal.r.g(lVar.f6435a);
        byte[] bArrL = k().w(lVar).l();
        ContentValues contentValues = new ContentValues();
        contentValues.put("app_id", lVar.f6435a);
        contentValues.put(a.C0190a.f6334b, lVar.f6436b);
        contentValues.put("timestamp", Long.valueOf(lVar.d));
        contentValues.put("metadata_fingerprint", Long.valueOf(j2));
        contentValues.put("data", bArrL);
        contentValues.put("realtime", Integer.valueOf(z ? 1 : 0));
        try {
            if (u().insert("raw_events", null, contentValues) != -1) {
                return true;
            }
            B().E().b("Failed to insert raw event (got -1). appId", w3.t(lVar.f6435a));
            return false;
        } catch (SQLiteException e) {
            B().E().c("Error storing raw event. appId", w3.t(lVar.f6435a), e);
            return false;
        }
    }

    @androidx.annotation.y0
    public final boolean W(ea eaVar) {
        com.google.android.gms.common.internal.r.k(eaVar);
        c();
        q();
        if (r0(eaVar.f6378a, eaVar.f6380c) == null) {
            if (ha.e0(eaVar.f6380c)) {
                if (l0("select count(1) from user_attributes where app_id=? and name not like '!_%' escape '!'", new String[]{eaVar.f6378a}) >= j().v(eaVar.f6378a)) {
                    return false;
                }
            } else if (!"_npa".equals(eaVar.f6380c) && l0("select count(1) from user_attributes where app_id=? and origin=? AND name like '!_%' escape '!'", new String[]{eaVar.f6378a, eaVar.f6379b}) >= 25) {
                return false;
            }
        }
        ContentValues contentValues = new ContentValues();
        contentValues.put("app_id", eaVar.f6378a);
        contentValues.put("origin", eaVar.f6379b);
        contentValues.put(a.C0190a.f6334b, eaVar.f6380c);
        contentValues.put("set_timestamp", Long.valueOf(eaVar.d));
        P(contentValues, "value", eaVar.e);
        try {
            if (u().insertWithOnConflict("user_attributes", null, contentValues, 5) == -1) {
                B().E().b("Failed to insert/update user property (got -1). appId", w3.t(eaVar.f6378a));
            }
        } catch (SQLiteException e) {
            B().E().c("Error storing user property. appId", w3.t(eaVar.f6378a), e);
        }
        return true;
    }

    @androidx.annotation.y0
    public final boolean X(va vaVar) {
        com.google.android.gms.common.internal.r.k(vaVar);
        c();
        q();
        if (r0(vaVar.d, vaVar.f.e) == null && l0("SELECT COUNT(1) FROM conditional_properties WHERE app_id=?", new String[]{vaVar.d}) >= 1000) {
            return false;
        }
        ContentValues contentValues = new ContentValues();
        contentValues.put("app_id", vaVar.d);
        contentValues.put("origin", vaVar.e);
        contentValues.put(a.C0190a.f6334b, vaVar.f.e);
        P(contentValues, "value", vaVar.f.h());
        contentValues.put(a.C0190a.n, Boolean.valueOf(vaVar.h));
        contentValues.put(a.C0190a.d, vaVar.i);
        contentValues.put(a.C0190a.e, Long.valueOf(vaVar.k));
        h();
        contentValues.put("timed_out_event", ha.p0(vaVar.j));
        contentValues.put(a.C0190a.m, Long.valueOf(vaVar.g));
        h();
        contentValues.put("triggered_event", ha.p0(vaVar.l));
        contentValues.put(a.C0190a.o, Long.valueOf(vaVar.f.f));
        contentValues.put(a.C0190a.j, Long.valueOf(vaVar.m));
        h();
        contentValues.put("expired_event", ha.p0(vaVar.n));
        try {
            if (u().insertWithOnConflict("conditional_properties", null, contentValues, 5) == -1) {
                B().E().b("Failed to insert/update conditional user property (got -1)", w3.t(vaVar.d));
            }
        } catch (SQLiteException e) {
            B().E().c("Error storing conditional user property", w3.t(vaVar.d), e);
        }
        return true;
    }

    final boolean a0(String str, Bundle bundle) {
        c();
        q();
        byte[] bArrL = k().w(new l(this.f6543a, "", str, "dep", 0L, 0L, bundle)).l();
        B().N().c("Saving default event parameters, appId, data size", f().s(str), Integer.valueOf(bArrL.length));
        ContentValues contentValues = new ContentValues();
        contentValues.put("app_id", str);
        contentValues.put("parameters", bArrL);
        try {
            if (u().insertWithOnConflict("default_event_params", null, contentValues, 5) != -1) {
                return true;
            }
            B().E().b("Failed to insert default event parameters (got -1). appId", w3.t(str));
            return false;
        } catch (SQLiteException e) {
            B().E().c("Error storing default event parameters. appId", w3.t(str), e);
            return false;
        }
    }

    public final boolean b0(String str, Long l2, long j2, g1.c cVar) {
        c();
        q();
        com.google.android.gms.common.internal.r.k(cVar);
        com.google.android.gms.common.internal.r.g(str);
        com.google.android.gms.common.internal.r.k(l2);
        byte[] bArrL = cVar.l();
        B().N().c("Saving complex main event, appId, data size", f().s(str), Integer.valueOf(bArrL.length));
        ContentValues contentValues = new ContentValues();
        contentValues.put("app_id", str);
        contentValues.put("event_id", l2);
        contentValues.put("children_to_process", Long.valueOf(j2));
        contentValues.put("main_event", bArrL);
        try {
            if (u().insertWithOnConflict("main_event_params", null, contentValues, 5) != -1) {
                return true;
            }
            B().E().b("Failed to insert complex main event (got -1). appId", w3.t(str));
            return false;
        } catch (SQLiteException e) {
            B().E().c("Error storing complex main event. appId", w3.t(str), e);
            return false;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:77:0x022d  */
    @androidx.annotation.y0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final com.google.android.gms.measurement.internal.f4 m0(java.lang.String r35) {
        /*
            Method dump skipped, instructions count: 561
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.d.m0(java.lang.String):com.google.android.gms.measurement.internal.f4");
    }

    @androidx.annotation.y0
    public final List<va> n0(String str, String str2, String str3) {
        com.google.android.gms.common.internal.r.g(str);
        c();
        q();
        ArrayList arrayList = new ArrayList(3);
        arrayList.add(str);
        StringBuilder sb = new StringBuilder("app_id=?");
        if (!TextUtils.isEmpty(str2)) {
            arrayList.add(str2);
            sb.append(" and origin=?");
        }
        if (!TextUtils.isEmpty(str3)) {
            arrayList.add(String.valueOf(str3).concat("*"));
            sb.append(" and name glob ?");
        }
        return O(sb.toString(), (String[]) arrayList.toArray(new String[arrayList.size()]));
    }

    @androidx.annotation.y0
    public final void o0(String str, String str2) throws IllegalStateException {
        com.google.android.gms.common.internal.r.g(str);
        com.google.android.gms.common.internal.r.g(str2);
        c();
        q();
        try {
            u().delete("user_attributes", "app_id=? and name=?", new String[]{str, str2});
        } catch (SQLiteException e) {
            B().E().d("Error deleting user property. appId", w3.t(str), f().w(str2), e);
        }
    }

    public final long q0(String str) {
        com.google.android.gms.common.internal.r.g(str);
        c();
        q();
        try {
            return u().delete("raw_events", "rowid in (select rowid from raw_events where app_id=? order by rowid desc limit -1 offset ?)", new String[]{str, String.valueOf(Math.max(0, Math.min(1000000, j().r(str, u.q))))});
        } catch (SQLiteException e) {
            B().E().c("Error deleting over the limit events. appId", w3.t(str), e);
            return 0L;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x00a9  */
    @androidx.annotation.y0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final com.google.android.gms.measurement.internal.ea r0(java.lang.String r19, java.lang.String r20) {
        /*
            r18 = this;
            r8 = r20
            com.google.android.gms.common.internal.r.g(r19)
            com.google.android.gms.common.internal.r.g(r20)
            r18.c()
            r18.q()
            r9 = 0
            android.database.sqlite.SQLiteDatabase r10 = r18.u()     // Catch: java.lang.Throwable -> L7e android.database.sqlite.SQLiteException -> L82
            java.lang.String r11 = "user_attributes"
            java.lang.String r0 = "set_timestamp"
            java.lang.String r1 = "value"
            java.lang.String r2 = "origin"
            java.lang.String[] r12 = new java.lang.String[]{r0, r1, r2}     // Catch: java.lang.Throwable -> L7e android.database.sqlite.SQLiteException -> L82
            java.lang.String r13 = "app_id=? and name=?"
            r0 = 2
            java.lang.String[] r14 = new java.lang.String[r0]     // Catch: java.lang.Throwable -> L7e android.database.sqlite.SQLiteException -> L82
            r1 = 0
            r14[r1] = r19     // Catch: java.lang.Throwable -> L7e android.database.sqlite.SQLiteException -> L82
            r2 = 1
            r14[r2] = r8     // Catch: java.lang.Throwable -> L7e android.database.sqlite.SQLiteException -> L82
            r15 = 0
            r16 = 0
            r17 = 0
            android.database.Cursor r10 = r10.query(r11, r12, r13, r14, r15, r16, r17)     // Catch: java.lang.Throwable -> L7e android.database.sqlite.SQLiteException -> L82
            boolean r3 = r10.moveToFirst()     // Catch: java.lang.Throwable -> L76 android.database.sqlite.SQLiteException -> L7a
            if (r3 != 0) goto L3f
            if (r10 == 0) goto L3e
            r10.close()
        L3e:
            return r9
        L3f:
            long r5 = r10.getLong(r1)     // Catch: java.lang.Throwable -> L76 android.database.sqlite.SQLiteException -> L7a
            r11 = r18
            java.lang.Object r7 = r11.I(r10, r2)     // Catch: android.database.sqlite.SQLiteException -> L74 java.lang.Throwable -> La5
            java.lang.String r3 = r10.getString(r0)     // Catch: android.database.sqlite.SQLiteException -> L74 java.lang.Throwable -> La5
            com.google.android.gms.measurement.internal.ea r0 = new com.google.android.gms.measurement.internal.ea     // Catch: android.database.sqlite.SQLiteException -> L74 java.lang.Throwable -> La5
            r1 = r0
            r2 = r19
            r4 = r20
            r1.<init>(r2, r3, r4, r5, r7)     // Catch: android.database.sqlite.SQLiteException -> L74 java.lang.Throwable -> La5
            boolean r1 = r10.moveToNext()     // Catch: android.database.sqlite.SQLiteException -> L74 java.lang.Throwable -> La5
            if (r1 == 0) goto L6e
            com.google.android.gms.measurement.internal.w3 r1 = r18.B()     // Catch: android.database.sqlite.SQLiteException -> L74 java.lang.Throwable -> La5
            com.google.android.gms.measurement.internal.y3 r1 = r1.E()     // Catch: android.database.sqlite.SQLiteException -> L74 java.lang.Throwable -> La5
            java.lang.String r2 = "Got multiple records for user property, expected one. appId"
            java.lang.Object r3 = com.google.android.gms.measurement.internal.w3.t(r19)     // Catch: android.database.sqlite.SQLiteException -> L74 java.lang.Throwable -> La5
            r1.b(r2, r3)     // Catch: android.database.sqlite.SQLiteException -> L74 java.lang.Throwable -> La5
        L6e:
            if (r10 == 0) goto L73
            r10.close()
        L73:
            return r0
        L74:
            r0 = move-exception
            goto L86
        L76:
            r0 = move-exception
            r11 = r18
            goto La6
        L7a:
            r0 = move-exception
            r11 = r18
            goto L86
        L7e:
            r0 = move-exception
            r11 = r18
            goto La7
        L82:
            r0 = move-exception
            r11 = r18
            r10 = r9
        L86:
            com.google.android.gms.measurement.internal.w3 r1 = r18.B()     // Catch: java.lang.Throwable -> La5
            com.google.android.gms.measurement.internal.y3 r1 = r1.E()     // Catch: java.lang.Throwable -> La5
            java.lang.String r2 = "Error querying user property. appId"
            java.lang.Object r3 = com.google.android.gms.measurement.internal.w3.t(r19)     // Catch: java.lang.Throwable -> La5
            com.google.android.gms.measurement.internal.u3 r4 = r18.f()     // Catch: java.lang.Throwable -> La5
            java.lang.String r4 = r4.w(r8)     // Catch: java.lang.Throwable -> La5
            r1.d(r2, r3, r4, r0)     // Catch: java.lang.Throwable -> La5
            if (r10 == 0) goto La4
            r10.close()
        La4:
            return r9
        La5:
            r0 = move-exception
        La6:
            r9 = r10
        La7:
            if (r9 == 0) goto Lac
            r9.close()
        Lac:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.d.r0(java.lang.String, java.lang.String):com.google.android.gms.measurement.internal.ea");
    }

    @Override // com.google.android.gms.measurement.internal.u9
    protected final boolean s() {
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:38:0x0125  */
    @androidx.annotation.y0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final com.google.android.gms.measurement.internal.va s0(java.lang.String r30, java.lang.String r31) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 297
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.d.s0(java.lang.String, java.lang.String):com.google.android.gms.measurement.internal.va");
    }

    @androidx.annotation.y0
    public final void t() {
        q();
        u().setTransactionSuccessful();
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x0073  */
    @androidx.annotation.y0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final byte[] t0(java.lang.String r11) throws java.lang.Throwable {
        /*
            r10 = this;
            com.google.android.gms.common.internal.r.g(r11)
            r10.c()
            r10.q()
            r0 = 0
            android.database.sqlite.SQLiteDatabase r1 = r10.u()     // Catch: java.lang.Throwable -> L54 android.database.sqlite.SQLiteException -> L56
            java.lang.String r2 = "apps"
            java.lang.String r3 = "remote_config"
            java.lang.String[] r3 = new java.lang.String[]{r3}     // Catch: java.lang.Throwable -> L54 android.database.sqlite.SQLiteException -> L56
            java.lang.String r4 = "app_id=?"
            r5 = 1
            java.lang.String[] r5 = new java.lang.String[r5]     // Catch: java.lang.Throwable -> L54 android.database.sqlite.SQLiteException -> L56
            r9 = 0
            r5[r9] = r11     // Catch: java.lang.Throwable -> L54 android.database.sqlite.SQLiteException -> L56
            r6 = 0
            r7 = 0
            r8 = 0
            android.database.Cursor r1 = r1.query(r2, r3, r4, r5, r6, r7, r8)     // Catch: java.lang.Throwable -> L54 android.database.sqlite.SQLiteException -> L56
            boolean r2 = r1.moveToFirst()     // Catch: android.database.sqlite.SQLiteException -> L52 java.lang.Throwable -> L6f
            if (r2 != 0) goto L31
            if (r1 == 0) goto L30
            r1.close()
        L30:
            return r0
        L31:
            byte[] r2 = r1.getBlob(r9)     // Catch: android.database.sqlite.SQLiteException -> L52 java.lang.Throwable -> L6f
            boolean r3 = r1.moveToNext()     // Catch: android.database.sqlite.SQLiteException -> L52 java.lang.Throwable -> L6f
            if (r3 == 0) goto L4c
            com.google.android.gms.measurement.internal.w3 r3 = r10.B()     // Catch: android.database.sqlite.SQLiteException -> L52 java.lang.Throwable -> L6f
            com.google.android.gms.measurement.internal.y3 r3 = r3.E()     // Catch: android.database.sqlite.SQLiteException -> L52 java.lang.Throwable -> L6f
            java.lang.String r4 = "Got multiple records for app config, expected one. appId"
            java.lang.Object r5 = com.google.android.gms.measurement.internal.w3.t(r11)     // Catch: android.database.sqlite.SQLiteException -> L52 java.lang.Throwable -> L6f
            r3.b(r4, r5)     // Catch: android.database.sqlite.SQLiteException -> L52 java.lang.Throwable -> L6f
        L4c:
            if (r1 == 0) goto L51
            r1.close()
        L51:
            return r2
        L52:
            r2 = move-exception
            goto L58
        L54:
            r11 = move-exception
            goto L71
        L56:
            r2 = move-exception
            r1 = r0
        L58:
            com.google.android.gms.measurement.internal.w3 r3 = r10.B()     // Catch: java.lang.Throwable -> L6f
            com.google.android.gms.measurement.internal.y3 r3 = r3.E()     // Catch: java.lang.Throwable -> L6f
            java.lang.String r4 = "Error querying remote config. appId"
            java.lang.Object r11 = com.google.android.gms.measurement.internal.w3.t(r11)     // Catch: java.lang.Throwable -> L6f
            r3.c(r4, r11, r2)     // Catch: java.lang.Throwable -> L6f
            if (r1 == 0) goto L6e
            r1.close()
        L6e:
            return r0
        L6f:
            r11 = move-exception
            r0 = r1
        L71:
            if (r0 == 0) goto L76
            r0.close()
        L76:
            throw r11
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.d.t0(java.lang.String):byte[]");
    }

    @androidx.annotation.y0
    @com.google.android.gms.common.util.d0
    final SQLiteDatabase u() {
        c();
        try {
            return this.d.getWritableDatabase();
        } catch (SQLiteException e) {
            B().I().b("Error opening database", e);
            throw e;
        }
    }

    @androidx.annotation.y0
    public final int u0(String str, String str2) throws IllegalStateException {
        com.google.android.gms.common.internal.r.g(str);
        com.google.android.gms.common.internal.r.g(str2);
        c();
        q();
        try {
            return u().delete("conditional_properties", "app_id=? and name=?", new String[]{str, str2});
        } catch (SQLiteException e) {
            B().E().d("Error deleting conditional property", w3.t(str), f().w(str2), e);
            return 0;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x0041  */
    @androidx.annotation.y0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.String v() throws java.lang.Throwable {
        /*
            r6 = this;
            android.database.sqlite.SQLiteDatabase r0 = r6.u()
            r1 = 0
            java.lang.String r2 = "select app_id from queue order by has_realtime desc, rowid asc limit 1;"
            android.database.Cursor r0 = r0.rawQuery(r2, r1)     // Catch: java.lang.Throwable -> L24 android.database.sqlite.SQLiteException -> L29
            boolean r2 = r0.moveToFirst()     // Catch: android.database.sqlite.SQLiteException -> L22 java.lang.Throwable -> L3e
            if (r2 == 0) goto L1c
            r2 = 0
            java.lang.String r1 = r0.getString(r2)     // Catch: android.database.sqlite.SQLiteException -> L22 java.lang.Throwable -> L3e
            if (r0 == 0) goto L1b
            r0.close()
        L1b:
            return r1
        L1c:
            if (r0 == 0) goto L21
            r0.close()
        L21:
            return r1
        L22:
            r2 = move-exception
            goto L2b
        L24:
            r0 = move-exception
            r5 = r1
            r1 = r0
            r0 = r5
            goto L3f
        L29:
            r2 = move-exception
            r0 = r1
        L2b:
            com.google.android.gms.measurement.internal.w3 r3 = r6.B()     // Catch: java.lang.Throwable -> L3e
            com.google.android.gms.measurement.internal.y3 r3 = r3.E()     // Catch: java.lang.Throwable -> L3e
            java.lang.String r4 = "Database error getting next bundle app id"
            r3.b(r4, r2)     // Catch: java.lang.Throwable -> L3e
            if (r0 == 0) goto L3d
            r0.close()
        L3d:
            return r1
        L3e:
            r1 = move-exception
        L3f:
            if (r0 == 0) goto L44
            r0.close()
        L44:
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.d.v():java.lang.String");
    }

    final Map<Integer, List<x0.b>> v0(String str) {
        com.google.android.gms.common.internal.r.g(str);
        b.f.a aVar = new b.f.a();
        Cursor cursor = null;
        try {
            try {
                Cursor cursorQuery = u().query("event_filters", new String[]{"audience_id", "data"}, "app_id=?", new String[]{str}, null, null, null);
                if (!cursorQuery.moveToFirst()) {
                    Map<Integer, List<x0.b>> mapEmptyMap = Collections.emptyMap();
                    if (cursorQuery != null) {
                        cursorQuery.close();
                    }
                    return mapEmptyMap;
                }
                do {
                    try {
                        x0.b bVar = (x0.b) ((c.a.b.b.g.c.h7) ((x0.b.a) da.A(x0.b.U(), cursorQuery.getBlob(1))).j());
                        if (bVar.O()) {
                            int r2 = cursorQuery.getInt(0);
                            List arrayList = (List) aVar.get(Integer.valueOf(r2));
                            if (arrayList == null) {
                                arrayList = new ArrayList();
                                aVar.put(Integer.valueOf(r2), arrayList);
                            }
                            arrayList.add(bVar);
                        }
                    } catch (IOException e) {
                        B().E().c("Failed to merge filter. appId", w3.t(str), e);
                    }
                } while (cursorQuery.moveToNext());
                if (cursorQuery != null) {
                    cursorQuery.close();
                }
                return aVar;
            } catch (Throwable th) {
                if (0 != 0) {
                    cursor.close();
                }
                throw th;
            }
        } catch (SQLiteException e2) {
            B().E().c("Database error querying filters. appId", w3.t(str), e2);
            Map<Integer, List<x0.b>> mapEmptyMap2 = Collections.emptyMap();
            if (0 != 0) {
                cursor.close();
            }
            return mapEmptyMap2;
        }
    }

    public final boolean w() {
        return l0("select count(1) > 0 from queue where has_realtime = 1", null) != 0;
    }

    @androidx.annotation.y0
    public final void w0() {
        q();
        u().beginTransaction();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00a2  */
    /* JADX WARN: Type inference failed for: r2v0 */
    /* JADX WARN: Type inference failed for: r2v1, types: [android.database.Cursor] */
    /* JADX WARN: Type inference failed for: r2v2 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    final java.util.Map<java.lang.Integer, java.util.List<java.lang.Integer>> x0(java.lang.String r8) throws java.lang.Throwable {
        /*
            r7 = this;
            r7.q()
            r7.c()
            com.google.android.gms.common.internal.r.g(r8)
            b.f.a r0 = new b.f.a
            r0.<init>()
            android.database.sqlite.SQLiteDatabase r1 = r7.u()
            r2 = 0
            java.lang.String r3 = "select audience_id, filter_id from event_filters where app_id = ? and session_scoped = 1 UNION select audience_id, filter_id from property_filters where app_id = ? and session_scoped = 1;"
            r4 = 2
            java.lang.String[] r4 = new java.lang.String[r4]     // Catch: java.lang.Throwable -> L67 android.database.sqlite.SQLiteException -> L69
            r5 = 0
            r4[r5] = r8     // Catch: java.lang.Throwable -> L67 android.database.sqlite.SQLiteException -> L69
            r6 = 1
            r4[r6] = r8     // Catch: java.lang.Throwable -> L67 android.database.sqlite.SQLiteException -> L69
            android.database.Cursor r1 = r1.rawQuery(r3, r4)     // Catch: java.lang.Throwable -> L67 android.database.sqlite.SQLiteException -> L69
            boolean r3 = r1.moveToFirst()     // Catch: android.database.sqlite.SQLiteException -> L65 java.lang.Throwable -> L9e
            if (r3 != 0) goto L32
            java.util.Map r8 = java.util.Collections.emptyMap()     // Catch: android.database.sqlite.SQLiteException -> L65 java.lang.Throwable -> L9e
            if (r1 == 0) goto L31
            r1.close()
        L31:
            return r8
        L32:
            int r3 = r1.getInt(r5)     // Catch: android.database.sqlite.SQLiteException -> L65 java.lang.Throwable -> L9e
            java.lang.Integer r4 = java.lang.Integer.valueOf(r3)     // Catch: android.database.sqlite.SQLiteException -> L65 java.lang.Throwable -> L9e
            java.lang.Object r4 = r0.get(r4)     // Catch: android.database.sqlite.SQLiteException -> L65 java.lang.Throwable -> L9e
            java.util.List r4 = (java.util.List) r4     // Catch: android.database.sqlite.SQLiteException -> L65 java.lang.Throwable -> L9e
            if (r4 != 0) goto L4e
            java.util.ArrayList r4 = new java.util.ArrayList     // Catch: android.database.sqlite.SQLiteException -> L65 java.lang.Throwable -> L9e
            r4.<init>()     // Catch: android.database.sqlite.SQLiteException -> L65 java.lang.Throwable -> L9e
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)     // Catch: android.database.sqlite.SQLiteException -> L65 java.lang.Throwable -> L9e
            r0.put(r3, r4)     // Catch: android.database.sqlite.SQLiteException -> L65 java.lang.Throwable -> L9e
        L4e:
            int r3 = r1.getInt(r6)     // Catch: android.database.sqlite.SQLiteException -> L65 java.lang.Throwable -> L9e
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)     // Catch: android.database.sqlite.SQLiteException -> L65 java.lang.Throwable -> L9e
            r4.add(r3)     // Catch: android.database.sqlite.SQLiteException -> L65 java.lang.Throwable -> L9e
            boolean r3 = r1.moveToNext()     // Catch: android.database.sqlite.SQLiteException -> L65 java.lang.Throwable -> L9e
            if (r3 != 0) goto L32
            if (r1 == 0) goto L64
            r1.close()
        L64:
            return r0
        L65:
            r0 = move-exception
            goto L6b
        L67:
            r8 = move-exception
            goto La0
        L69:
            r0 = move-exception
            r1 = r2
        L6b:
            com.google.android.gms.measurement.internal.w3 r3 = r7.B()     // Catch: java.lang.Throwable -> L9e
            com.google.android.gms.measurement.internal.y3 r3 = r3.E()     // Catch: java.lang.Throwable -> L9e
            java.lang.String r4 = "Database error querying scoped filters. appId"
            java.lang.Object r5 = com.google.android.gms.measurement.internal.w3.t(r8)     // Catch: java.lang.Throwable -> L9e
            r3.c(r4, r5, r0)     // Catch: java.lang.Throwable -> L9e
            boolean r0 = c.a.b.b.g.c.pc.b()     // Catch: java.lang.Throwable -> L9e
            if (r0 == 0) goto L98
            com.google.android.gms.measurement.internal.xa r0 = r7.j()     // Catch: java.lang.Throwable -> L9e
            com.google.android.gms.measurement.internal.l3<java.lang.Boolean> r3 = com.google.android.gms.measurement.internal.u.H0     // Catch: java.lang.Throwable -> L9e
            boolean r8 = r0.C(r8, r3)     // Catch: java.lang.Throwable -> L9e
            if (r8 == 0) goto L98
            java.util.Map r8 = java.util.Collections.emptyMap()     // Catch: java.lang.Throwable -> L9e
            if (r1 == 0) goto L97
            r1.close()
        L97:
            return r8
        L98:
            if (r1 == 0) goto L9d
            r1.close()
        L9d:
            return r2
        L9e:
            r8 = move-exception
            r2 = r1
        La0:
            if (r2 == 0) goto La5
            r2.close()
        La5:
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.d.x0(java.lang.String):java.util.Map");
    }

    public final long y(g1.g gVar) throws IOException {
        c();
        q();
        com.google.android.gms.common.internal.r.k(gVar);
        com.google.android.gms.common.internal.r.g(gVar.Y2());
        byte[] bArrL = gVar.l();
        long jU = k().u(bArrL);
        ContentValues contentValues = new ContentValues();
        contentValues.put("app_id", gVar.Y2());
        contentValues.put("metadata_fingerprint", Long.valueOf(jU));
        contentValues.put("metadata", bArrL);
        try {
            u().insertWithOnConflict("raw_events_metadata", null, contentValues, 4);
            return jU;
        } catch (SQLiteException e) {
            B().E().c("Error storing raw event metadata. appId", w3.t(gVar.Y2()), e);
            throw e;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00d3  */
    /* JADX WARN: Type inference failed for: r9v0 */
    /* JADX WARN: Type inference failed for: r9v1, types: [android.database.Cursor] */
    /* JADX WARN: Type inference failed for: r9v2 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    final java.util.Map<java.lang.Integer, java.util.List<c.a.b.b.g.c.x0.b>> y0(java.lang.String r13, java.lang.String r14) throws java.lang.Throwable {
        /*
            r12 = this;
            r12.q()
            r12.c()
            com.google.android.gms.common.internal.r.g(r13)
            com.google.android.gms.common.internal.r.g(r14)
            b.f.a r0 = new b.f.a
            r0.<init>()
            android.database.sqlite.SQLiteDatabase r1 = r12.u()
            r9 = 0
            java.lang.String r2 = "event_filters"
            java.lang.String r3 = "audience_id"
            java.lang.String r4 = "data"
            java.lang.String[] r3 = new java.lang.String[]{r3, r4}     // Catch: java.lang.Throwable -> L98 android.database.sqlite.SQLiteException -> L9a
            java.lang.String r4 = "app_id=? AND event_name=?"
            r5 = 2
            java.lang.String[] r5 = new java.lang.String[r5]     // Catch: java.lang.Throwable -> L98 android.database.sqlite.SQLiteException -> L9a
            r10 = 0
            r5[r10] = r13     // Catch: java.lang.Throwable -> L98 android.database.sqlite.SQLiteException -> L9a
            r11 = 1
            r5[r11] = r14     // Catch: java.lang.Throwable -> L98 android.database.sqlite.SQLiteException -> L9a
            r6 = 0
            r7 = 0
            r8 = 0
            android.database.Cursor r14 = r1.query(r2, r3, r4, r5, r6, r7, r8)     // Catch: java.lang.Throwable -> L98 android.database.sqlite.SQLiteException -> L9a
            boolean r1 = r14.moveToFirst()     // Catch: android.database.sqlite.SQLiteException -> L96 java.lang.Throwable -> Lcf
            if (r1 != 0) goto L42
            java.util.Map r13 = java.util.Collections.emptyMap()     // Catch: android.database.sqlite.SQLiteException -> L96 java.lang.Throwable -> Lcf
            if (r14 == 0) goto L41
            r14.close()
        L41:
            return r13
        L42:
            byte[] r1 = r14.getBlob(r11)     // Catch: android.database.sqlite.SQLiteException -> L96 java.lang.Throwable -> Lcf
            c.a.b.b.g.c.x0$b$a r2 = c.a.b.b.g.c.x0.b.U()     // Catch: java.io.IOException -> L78 android.database.sqlite.SQLiteException -> L96 java.lang.Throwable -> Lcf
            c.a.b.b.g.c.u8 r1 = com.google.android.gms.measurement.internal.da.A(r2, r1)     // Catch: java.io.IOException -> L78 android.database.sqlite.SQLiteException -> L96 java.lang.Throwable -> Lcf
            c.a.b.b.g.c.x0$b$a r1 = (c.a.b.b.g.c.x0.b.a) r1     // Catch: java.io.IOException -> L78 android.database.sqlite.SQLiteException -> L96 java.lang.Throwable -> Lcf
            c.a.b.b.g.c.r8 r1 = r1.j()     // Catch: java.io.IOException -> L78 android.database.sqlite.SQLiteException -> L96 java.lang.Throwable -> Lcf
            c.a.b.b.g.c.h7 r1 = (c.a.b.b.g.c.h7) r1     // Catch: java.io.IOException -> L78 android.database.sqlite.SQLiteException -> L96 java.lang.Throwable -> Lcf
            c.a.b.b.g.c.x0$b r1 = (c.a.b.b.g.c.x0.b) r1     // Catch: java.io.IOException -> L78 android.database.sqlite.SQLiteException -> L96 java.lang.Throwable -> Lcf
            int r2 = r14.getInt(r10)     // Catch: android.database.sqlite.SQLiteException -> L96 java.lang.Throwable -> Lcf
            java.lang.Integer r3 = java.lang.Integer.valueOf(r2)     // Catch: android.database.sqlite.SQLiteException -> L96 java.lang.Throwable -> Lcf
            java.lang.Object r3 = r0.get(r3)     // Catch: android.database.sqlite.SQLiteException -> L96 java.lang.Throwable -> Lcf
            java.util.List r3 = (java.util.List) r3     // Catch: android.database.sqlite.SQLiteException -> L96 java.lang.Throwable -> Lcf
            if (r3 != 0) goto L74
            java.util.ArrayList r3 = new java.util.ArrayList     // Catch: android.database.sqlite.SQLiteException -> L96 java.lang.Throwable -> Lcf
            r3.<init>()     // Catch: android.database.sqlite.SQLiteException -> L96 java.lang.Throwable -> Lcf
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)     // Catch: android.database.sqlite.SQLiteException -> L96 java.lang.Throwable -> Lcf
            r0.put(r2, r3)     // Catch: android.database.sqlite.SQLiteException -> L96 java.lang.Throwable -> Lcf
        L74:
            r3.add(r1)     // Catch: android.database.sqlite.SQLiteException -> L96 java.lang.Throwable -> Lcf
            goto L8a
        L78:
            r1 = move-exception
            com.google.android.gms.measurement.internal.w3 r2 = r12.B()     // Catch: android.database.sqlite.SQLiteException -> L96 java.lang.Throwable -> Lcf
            com.google.android.gms.measurement.internal.y3 r2 = r2.E()     // Catch: android.database.sqlite.SQLiteException -> L96 java.lang.Throwable -> Lcf
            java.lang.String r3 = "Failed to merge filter. appId"
            java.lang.Object r4 = com.google.android.gms.measurement.internal.w3.t(r13)     // Catch: android.database.sqlite.SQLiteException -> L96 java.lang.Throwable -> Lcf
            r2.c(r3, r4, r1)     // Catch: android.database.sqlite.SQLiteException -> L96 java.lang.Throwable -> Lcf
        L8a:
            boolean r1 = r14.moveToNext()     // Catch: android.database.sqlite.SQLiteException -> L96 java.lang.Throwable -> Lcf
            if (r1 != 0) goto L42
            if (r14 == 0) goto L95
            r14.close()
        L95:
            return r0
        L96:
            r0 = move-exception
            goto L9c
        L98:
            r13 = move-exception
            goto Ld1
        L9a:
            r0 = move-exception
            r14 = r9
        L9c:
            com.google.android.gms.measurement.internal.w3 r1 = r12.B()     // Catch: java.lang.Throwable -> Lcf
            com.google.android.gms.measurement.internal.y3 r1 = r1.E()     // Catch: java.lang.Throwable -> Lcf
            java.lang.String r2 = "Database error querying filters. appId"
            java.lang.Object r3 = com.google.android.gms.measurement.internal.w3.t(r13)     // Catch: java.lang.Throwable -> Lcf
            r1.c(r2, r3, r0)     // Catch: java.lang.Throwable -> Lcf
            boolean r0 = c.a.b.b.g.c.pc.b()     // Catch: java.lang.Throwable -> Lcf
            if (r0 == 0) goto Lc9
            com.google.android.gms.measurement.internal.xa r0 = r12.j()     // Catch: java.lang.Throwable -> Lcf
            com.google.android.gms.measurement.internal.l3<java.lang.Boolean> r1 = com.google.android.gms.measurement.internal.u.H0     // Catch: java.lang.Throwable -> Lcf
            boolean r13 = r0.C(r13, r1)     // Catch: java.lang.Throwable -> Lcf
            if (r13 == 0) goto Lc9
            java.util.Map r13 = java.util.Collections.emptyMap()     // Catch: java.lang.Throwable -> Lcf
            if (r14 == 0) goto Lc8
            r14.close()
        Lc8:
            return r13
        Lc9:
            if (r14 == 0) goto Lce
            r14.close()
        Lce:
            return r9
        Lcf:
            r13 = move-exception
            r9 = r14
        Ld1:
            if (r9 == 0) goto Ld6
            r9.close()
        Ld6:
            throw r13
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.d.y0(java.lang.String, java.lang.String):java.util.Map");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00d5  */
    /* JADX WARN: Type inference failed for: r8v0 */
    /* JADX WARN: Type inference failed for: r8v1, types: [android.database.Cursor] */
    /* JADX WARN: Type inference failed for: r8v2 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    final java.util.Map<java.lang.Integer, c.a.b.b.g.c.g1.i> z0(java.lang.String r12) throws java.lang.Throwable {
        /*
            r11 = this;
            r11.q()
            r11.c()
            com.google.android.gms.common.internal.r.g(r12)
            android.database.sqlite.SQLiteDatabase r0 = r11.u()
            r8 = 0
            java.lang.String r1 = "audience_filter_values"
            java.lang.String r2 = "audience_id"
            java.lang.String r3 = "current_results"
            java.lang.String[] r2 = new java.lang.String[]{r2, r3}     // Catch: java.lang.Throwable -> L9a android.database.sqlite.SQLiteException -> L9c
            java.lang.String r3 = "app_id=?"
            r9 = 1
            java.lang.String[] r4 = new java.lang.String[r9]     // Catch: java.lang.Throwable -> L9a android.database.sqlite.SQLiteException -> L9c
            r10 = 0
            r4[r10] = r12     // Catch: java.lang.Throwable -> L9a android.database.sqlite.SQLiteException -> L9c
            r5 = 0
            r6 = 0
            r7 = 0
            android.database.Cursor r0 = r0.query(r1, r2, r3, r4, r5, r6, r7)     // Catch: java.lang.Throwable -> L9a android.database.sqlite.SQLiteException -> L9c
            boolean r1 = r0.moveToFirst()     // Catch: android.database.sqlite.SQLiteException -> L98 java.lang.Throwable -> Ld1
            if (r1 != 0) goto L4f
            boolean r1 = c.a.b.b.g.c.pc.b()     // Catch: android.database.sqlite.SQLiteException -> L98 java.lang.Throwable -> Ld1
            if (r1 == 0) goto L49
            com.google.android.gms.measurement.internal.xa r1 = r11.j()     // Catch: android.database.sqlite.SQLiteException -> L98 java.lang.Throwable -> Ld1
            com.google.android.gms.measurement.internal.l3<java.lang.Boolean> r2 = com.google.android.gms.measurement.internal.u.H0     // Catch: android.database.sqlite.SQLiteException -> L98 java.lang.Throwable -> Ld1
            boolean r1 = r1.C(r12, r2)     // Catch: android.database.sqlite.SQLiteException -> L98 java.lang.Throwable -> Ld1
            if (r1 == 0) goto L49
            java.util.Map r12 = java.util.Collections.emptyMap()     // Catch: android.database.sqlite.SQLiteException -> L98 java.lang.Throwable -> Ld1
            if (r0 == 0) goto L48
            r0.close()
        L48:
            return r12
        L49:
            if (r0 == 0) goto L4e
            r0.close()
        L4e:
            return r8
        L4f:
            b.f.a r1 = new b.f.a     // Catch: android.database.sqlite.SQLiteException -> L98 java.lang.Throwable -> Ld1
            r1.<init>()     // Catch: android.database.sqlite.SQLiteException -> L98 java.lang.Throwable -> Ld1
        L54:
            int r2 = r0.getInt(r10)     // Catch: android.database.sqlite.SQLiteException -> L98 java.lang.Throwable -> Ld1
            byte[] r3 = r0.getBlob(r9)     // Catch: android.database.sqlite.SQLiteException -> L98 java.lang.Throwable -> Ld1
            c.a.b.b.g.c.g1$i$a r4 = c.a.b.b.g.c.g1.i.c0()     // Catch: java.io.IOException -> L76 android.database.sqlite.SQLiteException -> L98 java.lang.Throwable -> Ld1
            c.a.b.b.g.c.u8 r3 = com.google.android.gms.measurement.internal.da.A(r4, r3)     // Catch: java.io.IOException -> L76 android.database.sqlite.SQLiteException -> L98 java.lang.Throwable -> Ld1
            c.a.b.b.g.c.g1$i$a r3 = (c.a.b.b.g.c.g1.i.a) r3     // Catch: java.io.IOException -> L76 android.database.sqlite.SQLiteException -> L98 java.lang.Throwable -> Ld1
            c.a.b.b.g.c.r8 r3 = r3.j()     // Catch: java.io.IOException -> L76 android.database.sqlite.SQLiteException -> L98 java.lang.Throwable -> Ld1
            c.a.b.b.g.c.h7 r3 = (c.a.b.b.g.c.h7) r3     // Catch: java.io.IOException -> L76 android.database.sqlite.SQLiteException -> L98 java.lang.Throwable -> Ld1
            c.a.b.b.g.c.g1$i r3 = (c.a.b.b.g.c.g1.i) r3     // Catch: java.io.IOException -> L76 android.database.sqlite.SQLiteException -> L98 java.lang.Throwable -> Ld1
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)     // Catch: android.database.sqlite.SQLiteException -> L98 java.lang.Throwable -> Ld1
            r1.put(r2, r3)     // Catch: android.database.sqlite.SQLiteException -> L98 java.lang.Throwable -> Ld1
            goto L8c
        L76:
            r3 = move-exception
            com.google.android.gms.measurement.internal.w3 r4 = r11.B()     // Catch: android.database.sqlite.SQLiteException -> L98 java.lang.Throwable -> Ld1
            com.google.android.gms.measurement.internal.y3 r4 = r4.E()     // Catch: android.database.sqlite.SQLiteException -> L98 java.lang.Throwable -> Ld1
            java.lang.String r5 = "Failed to merge filter results. appId, audienceId, error"
            java.lang.Object r6 = com.google.android.gms.measurement.internal.w3.t(r12)     // Catch: android.database.sqlite.SQLiteException -> L98 java.lang.Throwable -> Ld1
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)     // Catch: android.database.sqlite.SQLiteException -> L98 java.lang.Throwable -> Ld1
            r4.d(r5, r6, r2, r3)     // Catch: android.database.sqlite.SQLiteException -> L98 java.lang.Throwable -> Ld1
        L8c:
            boolean r2 = r0.moveToNext()     // Catch: android.database.sqlite.SQLiteException -> L98 java.lang.Throwable -> Ld1
            if (r2 != 0) goto L54
            if (r0 == 0) goto L97
            r0.close()
        L97:
            return r1
        L98:
            r1 = move-exception
            goto L9e
        L9a:
            r12 = move-exception
            goto Ld3
        L9c:
            r1 = move-exception
            r0 = r8
        L9e:
            com.google.android.gms.measurement.internal.w3 r2 = r11.B()     // Catch: java.lang.Throwable -> Ld1
            com.google.android.gms.measurement.internal.y3 r2 = r2.E()     // Catch: java.lang.Throwable -> Ld1
            java.lang.String r3 = "Database error querying filter results. appId"
            java.lang.Object r4 = com.google.android.gms.measurement.internal.w3.t(r12)     // Catch: java.lang.Throwable -> Ld1
            r2.c(r3, r4, r1)     // Catch: java.lang.Throwable -> Ld1
            boolean r1 = c.a.b.b.g.c.pc.b()     // Catch: java.lang.Throwable -> Ld1
            if (r1 == 0) goto Lcb
            com.google.android.gms.measurement.internal.xa r1 = r11.j()     // Catch: java.lang.Throwable -> Ld1
            com.google.android.gms.measurement.internal.l3<java.lang.Boolean> r2 = com.google.android.gms.measurement.internal.u.H0     // Catch: java.lang.Throwable -> Ld1
            boolean r12 = r1.C(r12, r2)     // Catch: java.lang.Throwable -> Ld1
            if (r12 == 0) goto Lcb
            java.util.Map r12 = java.util.Collections.emptyMap()     // Catch: java.lang.Throwable -> Ld1
            if (r0 == 0) goto Lca
            r0.close()
        Lca:
            return r12
        Lcb:
            if (r0 == 0) goto Ld0
            r0.close()
        Ld0:
            return r8
        Ld1:
            r12 = move-exception
            r8 = r0
        Ld3:
            if (r8 == 0) goto Ld8
            r8.close()
        Ld8:
            throw r12
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.d.z0(java.lang.String):java.util.Map");
    }
}

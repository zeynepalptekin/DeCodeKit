package com.google.android.gms.measurement.internal;

import android.content.Context;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import c.a.b.b.g.c.g1;
import c.a.b.b.g.c.x0;
import com.google.android.gms.common.internal.z.b;
import com.google.android.gms.measurement.c.a;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.security.MessageDigest;
import java.util.ArrayList;
import java.util.BitSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.zip.GZIPInputStream;
import java.util.zip.GZIPOutputStream;

/* loaded from: classes.dex */
public final class da extends u9 {
    da(t9 t9Var) {
        super(t9Var);
    }

    static <Builder extends c.a.b.b.g.c.u8> Builder A(Builder builder, byte[] bArr) throws c.a.b.b.g.c.q7 {
        c.a.b.b.g.c.u6 u6VarC = c.a.b.b.g.c.u6.c();
        return u6VarC != null ? (Builder) builder.H(bArr, u6VarC) : (Builder) builder.I(bArr);
    }

    private static String G(boolean z, boolean z2, boolean z3) {
        StringBuilder sb = new StringBuilder();
        if (z) {
            sb.append("Dynamic ");
        }
        if (z2) {
            sb.append("Sequence ");
        }
        if (z3) {
            sb.append("Session-Scoped ");
        }
        return sb.toString();
    }

    static List<Long> H(BitSet bitSet) {
        int length = (bitSet.length() + 63) / 64;
        ArrayList arrayList = new ArrayList(length);
        for (int r4 = 0; r4 < length; r4++) {
            long j = 0;
            for (int r7 = 0; r7 < 64; r7++) {
                int r8 = (r4 << 6) + r7;
                if (r8 < bitSet.length()) {
                    if (bitSet.get(r8)) {
                        j |= 1 << r7;
                    }
                }
            }
            arrayList.add(Long.valueOf(j));
        }
        return arrayList;
    }

    private static List<g1.e> J(Bundle[] bundleArr) {
        ArrayList arrayList = new ArrayList();
        for (Bundle bundle : bundleArr) {
            if (bundle != null) {
                g1.e.a aVarG0 = g1.e.g0();
                for (String str : bundle.keySet()) {
                    g1.e.a aVarF = g1.e.g0().F(str);
                    Object obj = bundle.get(str);
                    if (obj instanceof Long) {
                        aVarF.A(((Long) obj).longValue());
                    } else if (obj instanceof String) {
                        aVarF.J((String) obj);
                    } else if (obj instanceof Double) {
                        aVarF.z(((Double) obj).doubleValue());
                    }
                    aVarG0.C(aVarF);
                }
                if (aVarG0.L() > 0) {
                    arrayList.add((g1.e) ((c.a.b.b.g.c.h7) aVarG0.j()));
                }
            }
        }
        return arrayList;
    }

    static void K(g1.c.a aVar, String str, Object obj) {
        List<g1.e> listK = aVar.K();
        int r1 = 0;
        while (true) {
            if (r1 >= listK.size()) {
                r1 = -1;
                break;
            } else if (str.equals(listK.get(r1).P())) {
                break;
            } else {
                r1++;
            }
        }
        g1.e.a aVarF = g1.e.g0().F(str);
        if (obj instanceof Long) {
            aVarF.A(((Long) obj).longValue());
        } else if (obj instanceof String) {
            aVarF.J((String) obj);
        } else if (obj instanceof Double) {
            aVarF.z(((Double) obj).doubleValue());
        } else if (obj instanceof Bundle[]) {
            aVarF.D(J((Bundle[]) obj));
        }
        if (r1 >= 0) {
            aVar.x(r1, aVarF);
        } else {
            aVar.C(aVarF);
        }
    }

    private static void N(StringBuilder sb, int r3) {
        for (int r0 = 0; r0 < r3; r0++) {
            sb.append("  ");
        }
    }

    private final void O(StringBuilder sb, int r7, x0.c cVar) {
        if (cVar == null) {
            return;
        }
        N(sb, r7);
        sb.append("filter {\n");
        if (cVar.K()) {
            R(sb, r7, "complement", Boolean.valueOf(cVar.L()));
        }
        if (cVar.M()) {
            R(sb, r7, "param_name", f().v(cVar.N()));
        }
        if (cVar.E()) {
            int r0 = r7 + 1;
            x0.f fVarF = cVar.F();
            if (fVarF != null) {
                N(sb, r0);
                sb.append("string_filter");
                sb.append(" {\n");
                if (fVarF.C()) {
                    R(sb, r0, "match_type", fVarF.D().name());
                }
                if (fVarF.E()) {
                    R(sb, r0, "expression", fVarF.F());
                }
                if (fVarF.G()) {
                    R(sb, r0, "case_sensitive", Boolean.valueOf(fVarF.J()));
                }
                if (fVarF.L() > 0) {
                    N(sb, r0 + 1);
                    sb.append("expression_list {\n");
                    for (String str : fVarF.K()) {
                        N(sb, r0 + 2);
                        sb.append(str);
                        sb.append("\n");
                    }
                    sb.append("}\n");
                }
                N(sb, r0);
                sb.append("}\n");
            }
        }
        if (cVar.G()) {
            P(sb, r7 + 1, "number_filter", cVar.J());
        }
        N(sb, r7);
        sb.append("}\n");
    }

    private static void P(StringBuilder sb, int r2, String str, x0.d dVar) {
        if (dVar == null) {
            return;
        }
        N(sb, r2);
        sb.append(str);
        sb.append(" {\n");
        if (dVar.C()) {
            R(sb, r2, "comparison_type", dVar.D().name());
        }
        if (dVar.E()) {
            R(sb, r2, "match_as_float", Boolean.valueOf(dVar.F()));
        }
        if (dVar.G()) {
            R(sb, r2, "comparison_value", dVar.J());
        }
        if (dVar.K()) {
            R(sb, r2, "min_comparison_value", dVar.L());
        }
        if (dVar.M()) {
            R(sb, r2, "max_comparison_value", dVar.N());
        }
        N(sb, r2);
        sb.append("}\n");
    }

    private static void Q(StringBuilder sb, int r9, String str, g1.i iVar, String str2) {
        if (iVar == null) {
            return;
        }
        N(sb, 3);
        sb.append(str);
        sb.append(" {\n");
        if (iVar.T() != 0) {
            N(sb, 4);
            sb.append("results: ");
            int r3 = 0;
            for (Long l : iVar.Q()) {
                int r5 = r3 + 1;
                if (r3 != 0) {
                    sb.append(", ");
                }
                sb.append(l);
                r3 = r5;
            }
            sb.append('\n');
        }
        if (iVar.K() != 0) {
            N(sb, 4);
            sb.append("status: ");
            int r32 = 0;
            for (Long l2 : iVar.D()) {
                int r52 = r32 + 1;
                if (r32 != 0) {
                    sb.append(", ");
                }
                sb.append(l2);
                r32 = r52;
            }
            sb.append('\n');
        }
        if (iVar.Z() != 0) {
            N(sb, 4);
            sb.append("dynamic_filter_timestamps: {");
            int r4 = 0;
            for (g1.b bVar : iVar.X()) {
                int r6 = r4 + 1;
                if (r4 != 0) {
                    sb.append(", ");
                }
                sb.append(bVar.G() ? Integer.valueOf(bVar.J()) : null);
                sb.append(":");
                sb.append(bVar.K() ? Long.valueOf(bVar.L()) : null);
                r4 = r6;
            }
            sb.append("}\n");
        }
        if (iVar.b0() != 0) {
            N(sb, 4);
            sb.append("sequence_filter_timestamps: {");
            int r11 = 0;
            for (g1.j jVar : iVar.a0()) {
                int r42 = r11 + 1;
                if (r11 != 0) {
                    sb.append(", ");
                }
                sb.append(jVar.G() ? Integer.valueOf(jVar.J()) : null);
                sb.append(": [");
                Iterator<Long> it = jVar.L().iterator();
                int r0 = 0;
                while (it.hasNext()) {
                    long jLongValue = it.next().longValue();
                    int r7 = r0 + 1;
                    if (r0 != 0) {
                        sb.append(", ");
                    }
                    sb.append(jLongValue);
                    r0 = r7;
                }
                sb.append("]");
                r11 = r42;
            }
            sb.append("}\n");
        }
        N(sb, 3);
        sb.append("}\n");
    }

    private static void R(StringBuilder sb, int r1, String str, Object obj) {
        if (obj == null) {
            return;
        }
        N(sb, r1 + 1);
        sb.append(str);
        sb.append(": ");
        sb.append(obj);
        sb.append('\n');
    }

    private final void S(StringBuilder sb, int r7, List<g1.e> list) {
        if (list == null) {
            return;
        }
        int r72 = r7 + 1;
        for (g1.e eVar : list) {
            if (eVar != null) {
                N(sb, r72);
                sb.append("param {\n");
                R(sb, r72, a.C0190a.f6334b, eVar.O() ? f().v(eVar.P()) : null);
                R(sb, r72, "string_value", eVar.U() ? eVar.V() : null);
                R(sb, r72, "int_value", eVar.Y() ? Long.valueOf(eVar.Z()) : null);
                R(sb, r72, "double_value", eVar.c0() ? Double.valueOf(eVar.d0()) : null);
                if (eVar.f0() > 0) {
                    S(sb, r72, eVar.e0());
                }
                N(sb, r72);
                sb.append("}\n");
            }
        }
    }

    @androidx.annotation.y0
    static boolean U(s sVar, ma maVar) {
        com.google.android.gms.common.internal.r.k(sVar);
        com.google.android.gms.common.internal.r.k(maVar);
        return (TextUtils.isEmpty(maVar.e) && TextUtils.isEmpty(maVar.u)) ? false : true;
    }

    static boolean V(String str) {
        return str != null && str.matches("([+-])?([0-9]+\\.?[0-9]*|[0-9]*\\.?[0-9]+)") && str.length() <= 310;
    }

    static boolean W(List<Long> list, int r5) {
        if (r5 < (list.size() << 6)) {
            return ((1 << (r5 % 64)) & list.get(r5 / 64).longValue()) != 0;
        }
        return false;
    }

    static Object X(g1.c cVar, String str) {
        g1.e eVarY = y(cVar, str);
        if (eVarY == null) {
            return null;
        }
        if (eVarY.U()) {
            return eVarY.V();
        }
        if (eVarY.Y()) {
            return Long.valueOf(eVarY.Z());
        }
        if (eVarY.c0()) {
            return Double.valueOf(eVarY.d0());
        }
        if (eVarY.f0() <= 0) {
            return null;
        }
        List<g1.e> listE0 = eVarY.e0();
        ArrayList arrayList = new ArrayList();
        for (g1.e eVar : listE0) {
            if (eVar != null) {
                Bundle bundle = new Bundle();
                for (g1.e eVar2 : eVar.e0()) {
                    if (eVar2.U()) {
                        bundle.putString(eVar2.P(), eVar2.V());
                    } else if (eVar2.Y()) {
                        bundle.putLong(eVar2.P(), eVar2.Z());
                    } else if (eVar2.c0()) {
                        bundle.putDouble(eVar2.P(), eVar2.d0());
                    }
                }
                if (!bundle.isEmpty()) {
                    arrayList.add(bundle);
                }
            }
        }
        return (Bundle[]) arrayList.toArray(new Bundle[arrayList.size()]);
    }

    static int t(g1.g.a aVar, String str) {
        if (aVar == null) {
            return -1;
        }
        for (int r1 = 0; r1 < aVar.g0(); r1++) {
            if (str.equals(aVar.e0(r1).S())) {
                return r1;
            }
        }
        return -1;
    }

    static g1.e y(g1.c cVar, String str) {
        for (g1.e eVar : cVar.D()) {
            if (eVar.P().equals(str)) {
                return eVar;
            }
        }
        return null;
    }

    @Override // com.google.android.gms.measurement.internal.v5, com.google.android.gms.measurement.internal.x5
    public final /* bridge */ /* synthetic */ w3 B() {
        return super.B();
    }

    final String C(x0.b bVar) {
        if (bVar == null) {
            return "null";
        }
        StringBuilder sb = new StringBuilder();
        sb.append("\nevent_filter {\n");
        if (bVar.J()) {
            R(sb, 0, "filter_id", Integer.valueOf(bVar.K()));
        }
        R(sb, 0, "event_name", f().s(bVar.L()));
        String strG = G(bVar.Q(), bVar.R(), bVar.T());
        if (!strG.isEmpty()) {
            R(sb, 0, "filter_type", strG);
        }
        if (bVar.O()) {
            P(sb, 1, "event_count_filter", bVar.P());
        }
        if (bVar.N() > 0) {
            sb.append("  filters {\n");
            Iterator<x0.c> it = bVar.M().iterator();
            while (it.hasNext()) {
                O(sb, 2, it.next());
            }
        }
        N(sb, 1);
        sb.append("}\n}\n");
        return sb.toString();
    }

    final String D(x0.e eVar) {
        if (eVar == null) {
            return "null";
        }
        StringBuilder sb = new StringBuilder();
        sb.append("\nproperty_filter {\n");
        if (eVar.E()) {
            R(sb, 0, "filter_id", Integer.valueOf(eVar.F()));
        }
        R(sb, 0, "property_name", f().w(eVar.G()));
        String strG = G(eVar.K(), eVar.L(), eVar.N());
        if (!strG.isEmpty()) {
            R(sb, 0, "filter_type", strG);
        }
        O(sb, 1, eVar.J());
        sb.append("}\n");
        return sb.toString();
    }

    final String E(g1.f fVar) {
        if (fVar == null) {
            return "";
        }
        StringBuilder sb = new StringBuilder();
        sb.append("\nbatch {\n");
        for (g1.g gVar : fVar.D()) {
            if (gVar != null) {
                N(sb, 1);
                sb.append("bundle {\n");
                if (gVar.a0()) {
                    R(sb, 1, "protocol_version", Integer.valueOf(gVar.A0()));
                }
                R(sb, 1, "platform", gVar.P2());
                if (gVar.a3()) {
                    R(sb, 1, "gmp_version", Long.valueOf(gVar.C()));
                }
                if (gVar.b0()) {
                    R(sb, 1, "uploading_gmp_version", Long.valueOf(gVar.c0()));
                }
                if (gVar.O0()) {
                    R(sb, 1, "dynamite_version", Long.valueOf(gVar.P0()));
                }
                if (gVar.u0()) {
                    R(sb, 1, "config_version", Long.valueOf(gVar.v0()));
                }
                R(sb, 1, "gmp_app_id", gVar.m0());
                R(sb, 1, "admob_app_id", gVar.N0());
                R(sb, 1, "app_id", gVar.Y2());
                R(sb, 1, "app_version", gVar.Z2());
                if (gVar.r0()) {
                    R(sb, 1, "app_version_major", Integer.valueOf(gVar.s0()));
                }
                R(sb, 1, "firebase_instance_id", gVar.q0());
                if (gVar.h0()) {
                    R(sb, 1, "dev_cert_hash", Long.valueOf(gVar.i0()));
                }
                R(sb, 1, "app_store", gVar.X2());
                if (gVar.X1()) {
                    R(sb, 1, "upload_timestamp_millis", Long.valueOf(gVar.Y1()));
                }
                if (gVar.l2()) {
                    R(sb, 1, "start_timestamp_millis", Long.valueOf(gVar.m2()));
                }
                if (gVar.x2()) {
                    R(sb, 1, "end_timestamp_millis", Long.valueOf(gVar.y2()));
                }
                if (gVar.F2()) {
                    R(sb, 1, "previous_bundle_start_timestamp_millis", Long.valueOf(gVar.G2()));
                }
                if (gVar.L2()) {
                    R(sb, 1, "previous_bundle_end_timestamp_millis", Long.valueOf(gVar.M2()));
                }
                R(sb, 1, "app_instance_id", gVar.g0());
                R(sb, 1, "resettable_device_id", gVar.d0());
                R(sb, 1, "device_id", gVar.t0());
                R(sb, 1, "ds_id", gVar.y0());
                if (gVar.e0()) {
                    R(sb, 1, "limited_ad_tracking", Boolean.valueOf(gVar.f0()));
                }
                R(sb, 1, "os_version", gVar.S2());
                R(sb, 1, "device_model", gVar.T2());
                R(sb, 1, "user_default_language", gVar.U2());
                if (gVar.V2()) {
                    R(sb, 1, "time_zone_offset_minutes", Integer.valueOf(gVar.W2()));
                }
                if (gVar.j0()) {
                    R(sb, 1, "bundle_sequential_index", Integer.valueOf(gVar.k0()));
                }
                if (gVar.n0()) {
                    R(sb, 1, "service_upload", Boolean.valueOf(gVar.o0()));
                }
                R(sb, 1, "health_monitor", gVar.l0());
                if (!j().p(u.A0) && gVar.w0() && gVar.x0() != 0) {
                    R(sb, 1, "android_id", Long.valueOf(gVar.x0()));
                }
                if (gVar.z0()) {
                    R(sb, 1, "retry_counter", Integer.valueOf(gVar.M0()));
                }
                if (gVar.R0()) {
                    R(sb, 1, "consent_signals", gVar.S0());
                }
                List<g1.k> listA1 = gVar.A1();
                if (listA1 != null) {
                    for (g1.k kVar : listA1) {
                        if (kVar != null) {
                            N(sb, 2);
                            sb.append("user_property {\n");
                            R(sb, 2, "set_timestamp_millis", kVar.L() ? Long.valueOf(kVar.M()) : null);
                            R(sb, 2, a.C0190a.f6334b, f().w(kVar.S()));
                            R(sb, 2, "string_value", kVar.V());
                            R(sb, 2, "int_value", kVar.W() ? Long.valueOf(kVar.X()) : null);
                            R(sb, 2, "double_value", kVar.Y() ? Double.valueOf(kVar.Z()) : null);
                            N(sb, 2);
                            sb.append("}\n");
                        }
                    }
                }
                List<g1.a> listP0 = gVar.p0();
                String strY2 = gVar.Y2();
                if (listP0 != null) {
                    for (g1.a aVar : listP0) {
                        if (aVar != null) {
                            N(sb, 2);
                            sb.append("audience_membership {\n");
                            if (aVar.K()) {
                                R(sb, 2, "audience_id", Integer.valueOf(aVar.L()));
                            }
                            if (aVar.R()) {
                                R(sb, 2, "new_audience", Boolean.valueOf(aVar.S()));
                            }
                            Q(sb, 2, "current_data", aVar.O(), strY2);
                            if (aVar.P()) {
                                Q(sb, 2, "previous_data", aVar.Q(), strY2);
                            }
                            N(sb, 2);
                            sb.append("}\n");
                        }
                    }
                }
                List<g1.c> listB1 = gVar.b1();
                if (listB1 != null) {
                    for (g1.c cVar : listB1) {
                        if (cVar != null) {
                            N(sb, 2);
                            sb.append("event {\n");
                            R(sb, 2, a.C0190a.f6334b, f().s(cVar.W()));
                            if (cVar.X()) {
                                R(sb, 2, "timestamp_millis", Long.valueOf(cVar.Y()));
                            }
                            if (cVar.Z()) {
                                R(sb, 2, "previous_timestamp_millis", Long.valueOf(cVar.a0()));
                            }
                            if (cVar.b0()) {
                                R(sb, 2, "count", Integer.valueOf(cVar.c0()));
                            }
                            if (cVar.S() != 0) {
                                S(sb, 2, cVar.D());
                            }
                            N(sb, 2);
                            sb.append("}\n");
                        }
                    }
                }
                N(sb, 1);
                sb.append("}\n");
            }
        }
        sb.append("}\n");
        return sb.toString();
    }

    @Override // com.google.android.gms.measurement.internal.v5, com.google.android.gms.measurement.internal.x5
    public final /* bridge */ /* synthetic */ Context F() {
        return super.F();
    }

    final List<Long> I(List<Long> list, List<Integer> list2) {
        int r9;
        ArrayList arrayList = new ArrayList(list);
        for (Integer num : list2) {
            if (num.intValue() < 0) {
                B().I().b("Ignoring negative bit index to be cleared", num);
            } else {
                int r1 = num.intValue() / 64;
                if (r1 >= arrayList.size()) {
                    B().I().c("Ignoring bit index greater than bitSet size", num, Integer.valueOf(arrayList.size()));
                } else {
                    arrayList.set(r1, Long.valueOf(((Long) arrayList.get(r1)).longValue() & (~(1 << (num.intValue() % 64)))));
                }
            }
        }
        int size = arrayList.size();
        int size2 = arrayList.size() - 1;
        while (true) {
            int r6 = size2;
            r9 = size;
            size = r6;
            if (size < 0 || ((Long) arrayList.get(size)).longValue() != 0) {
                break;
            }
            size2 = size - 1;
        }
        return arrayList.subList(0, r9);
    }

    final void L(g1.e.a aVar, Object obj) {
        com.google.android.gms.common.internal.r.k(obj);
        aVar.x().G().K().M();
        if (obj instanceof String) {
            aVar.J((String) obj);
            return;
        }
        if (obj instanceof Long) {
            aVar.A(((Long) obj).longValue());
            return;
        }
        if (obj instanceof Double) {
            aVar.z(((Double) obj).doubleValue());
        } else if (obj instanceof Bundle[]) {
            aVar.D(J((Bundle[]) obj));
        } else {
            B().E().b("Ignoring invalid (type) event param value", obj);
        }
    }

    final void M(g1.k.a aVar, Object obj) {
        com.google.android.gms.common.internal.r.k(obj);
        aVar.x().D().J();
        if (obj instanceof String) {
            aVar.G((String) obj);
            return;
        }
        if (obj instanceof Long) {
            aVar.F(((Long) obj).longValue());
        } else if (obj instanceof Double) {
            aVar.z(((Double) obj).doubleValue());
        } else {
            B().E().b("Ignoring invalid (type) user attribute value", obj);
        }
    }

    final boolean T(long j, long j2) {
        return j == 0 || j2 <= 0 || Math.abs(z().a() - j) > j2;
    }

    final byte[] Y(byte[] bArr) throws IOException {
        try {
            ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(bArr);
            GZIPInputStream gZIPInputStream = new GZIPInputStream(byteArrayInputStream);
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            byte[] bArr2 = new byte[1024];
            while (true) {
                int r3 = gZIPInputStream.read(bArr2);
                if (r3 <= 0) {
                    gZIPInputStream.close();
                    byteArrayInputStream.close();
                    return byteArrayOutputStream.toByteArray();
                }
                byteArrayOutputStream.write(bArr2, 0, r3);
            }
        } catch (IOException e) {
            B().E().b("Failed to ungzip content", e);
            throw e;
        }
    }

    final byte[] Z(byte[] bArr) throws IOException {
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            GZIPOutputStream gZIPOutputStream = new GZIPOutputStream(byteArrayOutputStream);
            gZIPOutputStream.write(bArr);
            gZIPOutputStream.close();
            byteArrayOutputStream.close();
            return byteArrayOutputStream.toByteArray();
        } catch (IOException e) {
            B().E().b("Failed to gzip content", e);
            throw e;
        }
    }

    @Override // com.google.android.gms.measurement.internal.v5
    public final /* bridge */ /* synthetic */ void a() {
        super.a();
    }

    @androidx.annotation.i0
    final List<Integer> a0() throws NumberFormatException {
        Map<String, String> mapC = u.c(this.f6502b.F());
        if (mapC == null || mapC.size() == 0) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        int r3 = u.Q.a(null).intValue();
        for (Map.Entry<String, String> entry : mapC.entrySet()) {
            if (entry.getKey().startsWith("measurement.id.")) {
                try {
                    int r4 = Integer.parseInt(entry.getValue());
                    if (r4 != 0) {
                        arrayList.add(Integer.valueOf(r4));
                        if (arrayList.size() >= r3) {
                            B().I().b("Too many experiment IDs. Number of IDs", Integer.valueOf(arrayList.size()));
                            break;
                        }
                        continue;
                    } else {
                        continue;
                    }
                } catch (NumberFormatException e) {
                    B().I().b("Experiment ID NumberFormatException", e);
                }
            }
        }
        if (arrayList.size() == 0) {
            return null;
        }
        return arrayList;
    }

    @Override // com.google.android.gms.measurement.internal.v5
    public final /* bridge */ /* synthetic */ void b() {
        super.b();
    }

    @Override // com.google.android.gms.measurement.internal.v5
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

    @Override // com.google.android.gms.measurement.internal.r9
    public final /* bridge */ /* synthetic */ da k() {
        return super.k();
    }

    @Override // com.google.android.gms.measurement.internal.r9
    public final /* bridge */ /* synthetic */ y8 l() {
        return super.l();
    }

    @Override // com.google.android.gms.measurement.internal.r9
    public final /* bridge */ /* synthetic */ na m() {
        return super.m();
    }

    @Override // com.google.android.gms.measurement.internal.r9
    public final /* bridge */ /* synthetic */ d n() {
        return super.n();
    }

    @Override // com.google.android.gms.measurement.internal.r9
    public final /* bridge */ /* synthetic */ v4 o() {
        return super.o();
    }

    @Override // com.google.android.gms.measurement.internal.u9
    protected final boolean s() {
        return false;
    }

    @androidx.annotation.y0
    final long u(byte[] bArr) {
        com.google.android.gms.common.internal.r.k(bArr);
        h().c();
        MessageDigest messageDigestJ0 = ha.J0();
        if (messageDigestJ0 != null) {
            return ha.w(messageDigestJ0.digest(bArr));
        }
        B().E().a("Failed to get MD5");
        return 0L;
    }

    final <T extends Parcelable> T v(byte[] bArr, Parcelable.Creator<T> creator) {
        if (bArr == null) {
            return null;
        }
        Parcel parcelObtain = Parcel.obtain();
        try {
            parcelObtain.unmarshall(bArr, 0, bArr.length);
            parcelObtain.setDataPosition(0);
            return creator.createFromParcel(parcelObtain);
        } catch (b.a unused) {
            B().E().a("Failed to load parcelable from buffer");
            return null;
        } finally {
            parcelObtain.recycle();
        }
    }

    final g1.c w(l lVar) {
        g1.c.a aVarN = g1.c.d0().N(lVar.e);
        Iterator<String> it = lVar.f.iterator();
        while (it.hasNext()) {
            String next = it.next();
            g1.e.a aVarF = g1.e.g0().F(next);
            L(aVarF, lVar.f.j(next));
            aVarN.C(aVarF);
        }
        return (g1.c) ((c.a.b.b.g.c.h7) aVarN.j());
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

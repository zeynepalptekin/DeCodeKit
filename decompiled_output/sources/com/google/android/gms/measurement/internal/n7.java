package com.google.android.gms.measurement.internal;

import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Pair;
import c.a.b.b.g.c.g1;
import c.a.b.b.g.c.hd;
import c.a.b.b.g.c.md;
import c.a.b.b.g.c.wb;
import java.io.IOException;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes.dex */
final class n7 extends u9 {
    public n7(t9 t9Var) {
        super(t9Var);
    }

    private static String g(String str, String str2) {
        throw new SecurityException("This implementation should not be used.");
    }

    @Override // com.google.android.gms.measurement.internal.u9
    protected final boolean s() {
        return false;
    }

    @androidx.annotation.y0
    public final byte[] t(@androidx.annotation.h0 s sVar, @androidx.annotation.q0(min = 1) String str) {
        String strD;
        String strA;
        ea next;
        Bundle bundleL;
        g1.g.a aVar;
        f4 f4Var;
        g1.f.a aVar2;
        Bundle bundle;
        byte[] bArr;
        long j;
        o oVarA;
        c();
        this.f6543a.o();
        com.google.android.gms.common.internal.r.k(sVar);
        com.google.android.gms.common.internal.r.g(str);
        if (!j().C(str, u.X)) {
            B().M().b("Generating ScionPayload disabled. packageName", str);
            return new byte[0];
        }
        if (!"_iap".equals(sVar.d) && !"_iapx".equals(sVar.d)) {
            B().M().c("Generating a payload for this event is not available. package_name, event_name", str, sVar.d);
            return null;
        }
        g1.f.a aVarG = g1.f.G();
        n().w0();
        try {
            f4 f4VarM0 = n().m0(str);
            if (f4VarM0 == null) {
                B().M().b("Log and bundle not available. package_name", str);
                return new byte[0];
            }
            if (!f4VarM0.e0()) {
                B().M().b("Log and bundle disabled. package_name", str);
                return new byte[0];
            }
            g1.g.a aVarL = g1.g.T0().x(1).L("android");
            if (!TextUtils.isEmpty(f4VarM0.t())) {
                aVarL.n0(f4VarM0.t());
            }
            if (!TextUtils.isEmpty(f4VarM0.X())) {
                aVarL.j0(f4VarM0.X());
            }
            if (!TextUtils.isEmpty(f4VarM0.T())) {
                aVarL.r0(f4VarM0.T());
            }
            if (f4VarM0.V() != -2147483648L) {
                aVarL.t0((int) f4VarM0.V());
            }
            aVarL.m0(f4VarM0.Z()).E0(f4VarM0.d0());
            if (hd.b() && j().C(f4VarM0.t(), u.k0)) {
                if (!TextUtils.isEmpty(f4VarM0.A())) {
                    strA = f4VarM0.A();
                    aVarL.F0(strA);
                } else if (!TextUtils.isEmpty(f4VarM0.G())) {
                    aVarL.Q0(f4VarM0.G());
                } else if (!TextUtils.isEmpty(f4VarM0.D())) {
                    strD = f4VarM0.D();
                    aVarL.N0(strD);
                }
            } else if (!TextUtils.isEmpty(f4VarM0.A())) {
                strA = f4VarM0.A();
                aVarL.F0(strA);
            } else if (!TextUtils.isEmpty(f4VarM0.D())) {
                strD = f4VarM0.D();
                aVarL.N0(strD);
            }
            e eVarB = this.f6502b.b(str);
            aVarL.u0(f4VarM0.b0());
            if (this.f6543a.l() && j().J(aVarL.C0())) {
                if (!wb.b() || !j().p(u.L0)) {
                    aVarL.C0();
                    if (!TextUtils.isEmpty(null)) {
                        aVarL.M0(null);
                    }
                } else if (eVarB.o() && !TextUtils.isEmpty(null)) {
                    aVarL.M0(null);
                }
            }
            if (wb.b() && j().p(u.L0)) {
                aVarL.S0(eVarB.e());
            }
            if (!wb.b() || !j().p(u.L0) || eVarB.o()) {
                Pair<String, Boolean> pairT = l().t(f4VarM0.t(), eVarB);
                if (f4VarM0.l() && pairT != null && !TextUtils.isEmpty((CharSequence) pairT.first)) {
                    aVarL.v0(g((String) pairT.first, Long.toString(sVar.g)));
                    if (pairT.second != null) {
                        aVarL.M(((Boolean) pairT.second).booleanValue());
                    }
                }
            }
            d().l();
            g1.g.a aVarA0 = aVarL.a0(Build.MODEL);
            d().l();
            aVarA0.T(Build.VERSION.RELEASE).l0((int) d().r()).d0(d().s());
            if (!wb.b() || !j().p(u.L0) || eVarB.q()) {
                aVarL.z0(g(f4VarM0.x(), Long.toString(sVar.g)));
            }
            if (!TextUtils.isEmpty(f4VarM0.M())) {
                aVarL.I0(f4VarM0.M());
            }
            String strT = f4VarM0.t();
            List<ea> listL = n().L(strT);
            Iterator<ea> it = listL.iterator();
            while (true) {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
                if ("_lte".equals(next.f6380c)) {
                    break;
                }
            }
            if (next == null || next.e == null) {
                ea eaVar = new ea(strT, "auto", "_lte", z().a(), 0L);
                listL.add(eaVar);
                n().W(eaVar);
            }
            da daVarK = k();
            daVarK.B().N().a("Checking account type status for ad personalization signals");
            if (daVarK.d().v()) {
                String strT2 = f4VarM0.t();
                if (f4VarM0.l() && daVarK.o().I(strT2)) {
                    daVarK.B().M().a("Turning off ad personalization due to account type");
                    Iterator<ea> it2 = listL.iterator();
                    while (true) {
                        if (!it2.hasNext()) {
                            break;
                        }
                        if ("_npa".equals(it2.next().f6380c)) {
                            it2.remove();
                            break;
                        }
                    }
                    listL.add(new ea(strT2, "auto", "_npa", daVarK.z().a(), 1L));
                }
            }
            g1.k[] kVarArr = new g1.k[listL.size()];
            for (int r4 = 0; r4 < listL.size(); r4++) {
                g1.k.a aVarA = g1.k.a0().C(listL.get(r4).f6380c).A(listL.get(r4).d);
                k().M(aVarA, listL.get(r4).e);
                kVarArr[r4] = (g1.k) ((c.a.b.b.g.c.h7) aVarA.j());
            }
            aVarL.S(Arrays.asList(kVarArr));
            if (md.b() && j().p(u.C0) && j().p(u.D0)) {
                a4 a4VarB = a4.b(sVar);
                h().M(a4VarB.d, n().E0(str));
                h().V(a4VarB, j().k(str));
                bundleL = a4VarB.d;
            } else {
                bundleL = sVar.e.l();
            }
            Bundle bundle2 = bundleL;
            bundle2.putLong("_c", 1L);
            B().M().a("Marking in-app purchase as real-time");
            bundle2.putLong("_r", 1L);
            bundle2.putString("_o", sVar.f);
            if (h().D0(aVarL.C0())) {
                h().N(bundle2, "_dbg", 1L);
                h().N(bundle2, "_r", 1L);
            }
            o oVarG = n().G(str, sVar.d);
            if (oVarG == null) {
                f4Var = f4VarM0;
                aVar = aVarL;
                aVar2 = aVarG;
                bundle = bundle2;
                bArr = null;
                oVarA = new o(str, sVar.d, 0L, 0L, sVar.g, 0L, null, null, null, null);
                j = 0;
            } else {
                aVar = aVarL;
                f4Var = f4VarM0;
                aVar2 = aVarG;
                bundle = bundle2;
                bArr = null;
                j = oVarG.f;
                oVarA = oVarG.a(sVar.g);
            }
            n().Q(oVarA);
            l lVar = new l(this.f6543a, sVar.f, str, sVar.d, sVar.g, j, bundle);
            g1.c.a aVarN = g1.c.d0().A(lVar.d).G(lVar.f6436b).N(lVar.e);
            Iterator<String> it3 = lVar.f.iterator();
            while (it3.hasNext()) {
                String next2 = it3.next();
                g1.e.a aVarF = g1.e.g0().F(next2);
                k().L(aVarF, lVar.f.j(next2));
                aVarN.C(aVarF);
            }
            g1.g.a aVar3 = aVar;
            aVar3.D(aVarN).F(g1.h.C().x(g1.d.C().x(oVarA.f6473c).z(sVar.d)));
            aVar3.Z(m().u(f4Var.t(), Collections.emptyList(), aVar3.f0(), Long.valueOf(aVarN.S()), Long.valueOf(aVarN.S())));
            if (aVarN.R()) {
                aVar3.R(aVarN.S()).Y(aVarN.S());
            }
            long jR = f4Var.R();
            if (jR != 0) {
                aVar3.i0(jR);
            }
            long jP = f4Var.P();
            if (jP != 0) {
                aVar3.b0(jP);
            } else if (jR != 0) {
                aVar3.b0(jR);
            }
            f4Var.i0();
            aVar3.p0((int) f4Var.f0()).q0(32053L).C(z().a()).U(true);
            g1.f.a aVar4 = aVar2;
            aVar4.x(aVar3);
            f4 f4Var2 = f4Var;
            f4Var2.a(aVar3.k0());
            f4Var2.q(aVar3.o0());
            n().R(f4Var2);
            n().t();
            try {
                return k().Z(((g1.f) ((c.a.b.b.g.c.h7) aVar4.j())).l());
            } catch (IOException e) {
                B().E().c("Data loss. Failed to bundle and serialize. appId", w3.t(str), e);
                return bArr;
            }
        } catch (SecurityException e2) {
            B().M().b("app instance id encryption failed", e2.getMessage());
            return new byte[0];
        } catch (SecurityException e3) {
            B().M().b("Resettable device id encryption failed", e3.getMessage());
            return new byte[0];
        } finally {
            n().B0();
        }
    }
}

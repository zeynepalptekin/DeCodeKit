package com.google.android.gms.internal.ads;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.security.GeneralSecurityException;

/* loaded from: classes.dex */
final class rf2 {

    /* renamed from: a, reason: collision with root package name */
    static fz1 f5134a;

    static boolean a(jf2 jf2Var) throws IllegalAccessException, GeneralSecurityException, InvocationTargetException {
        Method methodE;
        fz1 fz1VarA;
        if (f5134a != null) {
            return true;
        }
        String str = (String) qx2.e().c(e0.L1);
        if (str == null || str.length() == 0) {
            str = (jf2Var == null || (methodE = jf2Var.e("TkuK+8ZKbIcxeUe4msY7eeifKf/tICuqqRvwzwQUhsKM0HemvJhBrPQYp0qpvgcE", "eNJuSXkridnHpFkTgNBQFH0ivDH801goaJfT5bONEac=")) == null) ? null : (String) methodE.invoke(null, new Object[0]);
            if (str == null) {
                return false;
            }
        }
        try {
            kz1 kz1VarA = oz1.a(v21.b(str, true));
            for (q42 q42Var : j12.f3901c.H()) {
                if (q42Var.H().isEmpty()) {
                    throw new GeneralSecurityException("Missing type_url.");
                }
                if (q42Var.I().isEmpty()) {
                    throw new GeneralSecurityException("Missing primitive_name.");
                }
                if (q42Var.L().isEmpty()) {
                    throw new GeneralSecurityException("Missing catalogue_name.");
                }
                if (!q42Var.L().equals("TinkAead") && !q42Var.L().equals("TinkMac") && !q42Var.L().equals("TinkHybridDecrypt") && !q42Var.L().equals("TinkHybridEncrypt") && !q42Var.L().equals("TinkPublicKeySign") && !q42Var.L().equals("TinkPublicKeyVerify") && !q42Var.L().equals("TinkStreamingAead") && !q42Var.L().equals("TinkDeterministicAead")) {
                    zy1<?> zy1VarR = uz1.r(q42Var.L());
                    uz1.l(zy1VarR.a());
                    uz1.j(zy1VarR.b(q42Var.H(), q42Var.I(), q42Var.J()), q42Var.K());
                }
            }
            fz1VarA = n12.a(kz1VarA, null);
            f5134a = fz1VarA;
        } catch (IllegalArgumentException | GeneralSecurityException unused) {
        }
        return fz1VarA != null;
    }
}

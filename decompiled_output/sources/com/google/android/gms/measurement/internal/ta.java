package com.google.android.gms.measurement.internal;

import c.a.b.b.g.c.g1;
import c.a.b.b.g.c.ic;
import c.a.b.b.g.c.x0;

/* loaded from: classes.dex */
final class ta extends ua {
    private x0.e g;
    private final /* synthetic */ na h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ta(na naVar, String str, int r3, x0.e eVar) {
        super(str, r3);
        this.h = naVar;
        this.g = eVar;
    }

    @Override // com.google.android.gms.measurement.internal.ua
    final int a() {
        return this.g.F();
    }

    @Override // com.google.android.gms.measurement.internal.ua
    final boolean i() {
        return true;
    }

    @Override // com.google.android.gms.measurement.internal.ua
    final boolean j() {
        return false;
    }

    final boolean k(Long l, Long l2, g1.k kVar, boolean z) {
        y3 y3VarI;
        String strW;
        String str;
        Boolean boolG;
        boolean z2 = ic.b() && this.h.j().w(this.f6536a, u.b0);
        boolean zK = this.g.K();
        boolean zL = this.g.L();
        boolean zN = this.g.N();
        boolean z3 = zK || zL || zN;
        Boolean boolD = null;
        boolD = null;
        if (z && !z3) {
            this.h.B().N().c("Property filter already evaluated true and it is not associated with an enhanced audience. audience ID, filter ID", Integer.valueOf(this.f6537b), this.g.E() ? Integer.valueOf(this.g.F()) : null);
            return true;
        }
        x0.c cVarJ = this.g.J();
        boolean zL2 = cVarJ.L();
        if (kVar.W()) {
            if (cVarJ.G()) {
                boolG = ua.c(kVar.X(), cVarJ.J());
                boolD = ua.d(boolG, zL2);
            } else {
                y3VarI = this.h.B().I();
                strW = this.h.f().w(kVar.S());
                str = "No number filter for long property. property";
                y3VarI.b(str, strW);
            }
        } else if (!kVar.Y()) {
            if (kVar.U()) {
                if (cVarJ.E()) {
                    boolG = ua.g(kVar.V(), cVarJ.F(), this.h.B());
                } else if (!cVarJ.G()) {
                    y3VarI = this.h.B().I();
                    strW = this.h.f().w(kVar.S());
                    str = "No string or number filter defined. property";
                } else if (da.V(kVar.V())) {
                    boolG = ua.e(kVar.V(), cVarJ.J());
                } else {
                    this.h.B().I().c("Invalid user property value for Numeric number filter. property, value", this.h.f().w(kVar.S()), kVar.V());
                }
                boolD = ua.d(boolG, zL2);
            } else {
                y3VarI = this.h.B().I();
                strW = this.h.f().w(kVar.S());
                str = "User property has no value, property";
            }
            y3VarI.b(str, strW);
        } else if (cVarJ.G()) {
            boolG = ua.b(kVar.Z(), cVarJ.J());
            boolD = ua.d(boolG, zL2);
        } else {
            y3VarI = this.h.B().I();
            strW = this.h.f().w(kVar.S());
            str = "No number filter for double property. property";
            y3VarI.b(str, strW);
        }
        this.h.B().N().b("Property filter result", boolD == null ? "null" : boolD);
        if (boolD == null) {
            return false;
        }
        this.f6538c = Boolean.TRUE;
        if (zN && !boolD.booleanValue()) {
            return true;
        }
        if (!z || this.g.K()) {
            this.d = boolD;
        }
        if (boolD.booleanValue() && z3 && kVar.L()) {
            long jM = kVar.M();
            if (l != null) {
                jM = l.longValue();
            }
            if (z2 && this.g.K() && !this.g.L() && l2 != null) {
                jM = l2.longValue();
            }
            if (this.g.L()) {
                this.f = Long.valueOf(jM);
            } else {
                this.e = Long.valueOf(jM);
            }
        }
        return true;
    }
}

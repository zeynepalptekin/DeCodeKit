package com.google.android.gms.measurement.internal;

import c.a.b.b.g.c.x0;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.regex.Pattern;
import java.util.regex.PatternSyntaxException;

/* loaded from: classes.dex */
abstract class ua {

    /* renamed from: a, reason: collision with root package name */
    String f6536a;

    /* renamed from: b, reason: collision with root package name */
    int f6537b;

    /* renamed from: c, reason: collision with root package name */
    Boolean f6538c;
    Boolean d;
    Long e;
    Long f;

    ua(String str, int r2) {
        this.f6536a = str;
        this.f6537b = r2;
    }

    static Boolean b(double d, x0.d dVar) {
        try {
            return h(new BigDecimal(d), dVar, Math.ulp(d));
        } catch (NumberFormatException unused) {
            return null;
        }
    }

    static Boolean c(long j, x0.d dVar) {
        try {
            return h(new BigDecimal(j), dVar, 0.0d);
        } catch (NumberFormatException unused) {
            return null;
        }
    }

    @com.google.android.gms.common.util.d0
    static Boolean d(Boolean bool, boolean z) {
        if (bool == null) {
            return null;
        }
        return Boolean.valueOf(bool.booleanValue() != z);
    }

    static Boolean e(String str, x0.d dVar) {
        if (!da.V(str)) {
            return null;
        }
        try {
            return h(new BigDecimal(str), dVar, 0.0d);
        } catch (NumberFormatException unused) {
            return null;
        }
    }

    private static Boolean f(String str, x0.f.b bVar, boolean z, String str2, List<String> list, String str3, w3 w3Var) {
        boolean zStartsWith;
        if (str == null) {
            return null;
        }
        if (bVar == x0.f.b.IN_LIST) {
            if (list == null || list.size() == 0) {
                return null;
            }
        } else if (str2 == null) {
            return null;
        }
        if (!z && bVar != x0.f.b.REGEXP) {
            str = str.toUpperCase(Locale.ENGLISH);
        }
        switch (qa.f6497a[bVar.ordinal()]) {
            case 1:
                try {
                    return Boolean.valueOf(Pattern.compile(str3, z ? 0 : 66).matcher(str).matches());
                } catch (PatternSyntaxException unused) {
                    if (w3Var != null) {
                        w3Var.I().b("Invalid regular expression in REGEXP audience filter. expression", str3);
                    }
                    return null;
                }
            case 2:
                zStartsWith = str.startsWith(str2);
                break;
            case 3:
                zStartsWith = str.endsWith(str2);
                break;
            case 4:
                zStartsWith = str.contains(str2);
                break;
            case 5:
                zStartsWith = str.equals(str2);
                break;
            case 6:
                zStartsWith = list.contains(str);
                break;
            default:
                return null;
        }
        return Boolean.valueOf(zStartsWith);
    }

    @com.google.android.gms.common.util.d0
    static Boolean g(String str, x0.f fVar, w3 w3Var) {
        List<String> list;
        com.google.android.gms.common.internal.r.k(fVar);
        if (str == null || !fVar.C() || fVar.D() == x0.f.b.UNKNOWN_MATCH_TYPE) {
            return null;
        }
        if (fVar.D() == x0.f.b.IN_LIST) {
            if (fVar.L() == 0) {
                return null;
            }
        } else if (!fVar.E()) {
            return null;
        }
        x0.f.b bVarD = fVar.D();
        boolean zJ = fVar.J();
        String strF = (zJ || bVarD == x0.f.b.REGEXP || bVarD == x0.f.b.IN_LIST) ? fVar.F() : fVar.F().toUpperCase(Locale.ENGLISH);
        if (fVar.L() == 0) {
            list = null;
        } else {
            List<String> listK = fVar.K();
            if (!zJ) {
                ArrayList arrayList = new ArrayList(listK.size());
                Iterator<String> it = listK.iterator();
                while (it.hasNext()) {
                    arrayList.add(it.next().toUpperCase(Locale.ENGLISH));
                }
                listK = Collections.unmodifiableList(arrayList);
            }
            list = listK;
        }
        return f(str, bVarD, zJ, strF, list, bVarD == x0.f.b.REGEXP ? strF : null, w3Var);
    }

    @com.google.android.gms.common.util.d0
    private static Boolean h(BigDecimal bigDecimal, x0.d dVar, double d) {
        BigDecimal bigDecimal2;
        BigDecimal bigDecimal3;
        BigDecimal bigDecimal4;
        com.google.android.gms.common.internal.r.k(dVar);
        if (dVar.C() && dVar.D() != x0.d.a.UNKNOWN_COMPARISON_TYPE) {
            if (dVar.D() == x0.d.a.BETWEEN) {
                if (!dVar.K() || !dVar.M()) {
                    return null;
                }
            } else if (!dVar.G()) {
                return null;
            }
            x0.d.a aVarD = dVar.D();
            if (dVar.D() == x0.d.a.BETWEEN) {
                if (da.V(dVar.L()) && da.V(dVar.N())) {
                    try {
                        BigDecimal bigDecimal5 = new BigDecimal(dVar.L());
                        bigDecimal4 = new BigDecimal(dVar.N());
                        bigDecimal3 = bigDecimal5;
                        bigDecimal2 = null;
                    } catch (NumberFormatException unused) {
                    }
                }
                return null;
            }
            if (!da.V(dVar.J())) {
                return null;
            }
            try {
                bigDecimal2 = new BigDecimal(dVar.J());
                bigDecimal3 = null;
                bigDecimal4 = null;
            } catch (NumberFormatException unused2) {
            }
            if (aVarD == x0.d.a.BETWEEN) {
                if (bigDecimal3 == null) {
                    return null;
                }
            } else if (bigDecimal2 != null) {
            }
            int r0 = qa.f6498b[aVarD.ordinal()];
            if (r0 == 1) {
                return Boolean.valueOf(bigDecimal.compareTo(bigDecimal2) == -1);
            }
            if (r0 == 2) {
                return Boolean.valueOf(bigDecimal.compareTo(bigDecimal2) == 1);
            }
            if (r0 == 3) {
                if (d == 0.0d) {
                    return Boolean.valueOf(bigDecimal.compareTo(bigDecimal2) == 0);
                }
                if (bigDecimal.compareTo(bigDecimal2.subtract(new BigDecimal(d).multiply(new BigDecimal(2)))) == 1 && bigDecimal.compareTo(bigDecimal2.add(new BigDecimal(d).multiply(new BigDecimal(2)))) == -1) {
                    z = true;
                }
                return Boolean.valueOf(z);
            }
            if (r0 == 4) {
                if (bigDecimal.compareTo(bigDecimal3) != -1 && bigDecimal.compareTo(bigDecimal4) != 1) {
                    z = true;
                }
                return Boolean.valueOf(z);
            }
        }
        return null;
    }

    abstract int a();

    abstract boolean i();

    abstract boolean j();
}

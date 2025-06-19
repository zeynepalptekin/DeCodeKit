package com.google.android.gms.internal.ads;

import androidx.appcompat.widget.ActivityChooserView;
import com.google.android.gms.internal.ads.cv2;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import javax.annotation.concurrent.GuardedBy;

/* loaded from: classes.dex */
final class uo1 implements qo1 {

    /* renamed from: a, reason: collision with root package name */
    @GuardedBy("this")
    private final ConcurrentHashMap<bp1, so1> f5567a;

    /* renamed from: b, reason: collision with root package name */
    private yo1 f5568b;

    /* renamed from: c, reason: collision with root package name */
    private wo1 f5569c = new wo1();

    public uo1(yo1 yo1Var) {
        this.f5567a = new ConcurrentHashMap<>(yo1Var.k);
        this.f5568b = yo1Var;
    }

    private final void f() {
        if (yo1.i()) {
            StringBuilder sb = new StringBuilder();
            sb.append(this.f5568b.i);
            sb.append(" PoolCollection");
            sb.append(this.f5569c.g());
            int r3 = 0;
            for (Map.Entry<bp1, so1> entry : this.f5567a.entrySet()) {
                r3++;
                sb.append(r3);
                sb.append(". ");
                sb.append(entry.getValue());
                sb.append("#");
                sb.append(entry.getKey().hashCode());
                sb.append("    ");
                for (int r5 = 0; r5 < entry.getValue().b(); r5++) {
                    sb.append("[O]");
                }
                for (int r52 = entry.getValue().b(); r52 < this.f5568b.k; r52++) {
                    sb.append("[ ]");
                }
                sb.append("\n");
                sb.append(entry.getValue().f());
                sb.append("\n");
            }
            while (r3 < this.f5568b.j) {
                r3++;
                sb.append(r3);
                sb.append(".\n");
            }
            tr.f(sb.toString());
        }
    }

    private final void g(cp1<?> cp1Var, tp1 tp1Var) {
        if (cp1Var != null) {
            cp1Var.f3012a.h().D((cv2.g) ((l92) cv2.g.J().v(cv2.g.a.N().x(cv2.g.c.IN_MEMORY).v(cv2.g.d.K().w(tp1Var.d).v(tp1Var.e))).P()));
        }
        f();
    }

    @Override // com.google.android.gms.internal.ads.qo1
    public final yo1 a() {
        return this.f5568b;
    }

    @Override // com.google.android.gms.internal.ads.qo1
    @androidx.annotation.i0
    public final synchronized cp1<?> b(bp1 bp1Var) {
        cp1<?> cp1VarC;
        so1 so1Var = this.f5567a.get(bp1Var);
        cp1VarC = null;
        if (so1Var != null) {
            cp1VarC = so1Var.c();
            if (cp1VarC == null) {
                this.f5569c.b();
            }
            g(cp1VarC, so1Var.g());
        } else {
            this.f5569c.a();
            g(null, null);
        }
        return cp1VarC;
    }

    @Override // com.google.android.gms.internal.ads.qo1
    @Deprecated
    public final bp1 c(jw2 jw2Var, String str, vw2 vw2Var) {
        return new ep1(jw2Var, str, new ej(this.f5568b.g).e().o, this.f5568b.m, vw2Var);
    }

    @Override // com.google.android.gms.internal.ads.qo1
    public final synchronized boolean d(bp1 bp1Var) {
        so1 so1Var = this.f5567a.get(bp1Var);
        if (so1Var != null) {
            return so1Var.b() < this.f5568b.k;
        }
        return true;
    }

    @Override // com.google.android.gms.internal.ads.qo1
    public final synchronized boolean e(bp1 bp1Var, cp1<?> cp1Var) {
        boolean zI;
        ConcurrentHashMap<bp1, so1> concurrentHashMap;
        so1 so1Var = this.f5567a.get(bp1Var);
        cp1Var.d = com.google.android.gms.ads.internal.p.j().a();
        if (so1Var == null) {
            so1Var = new so1(this.f5568b.k, this.f5568b.l * 1000);
            if (this.f5567a.size() == this.f5568b.j) {
                int r1 = to1.f5432a[this.f5568b.o - 1];
                long jA = Long.MAX_VALUE;
                bp1 key = null;
                if (r1 == 1) {
                    for (Map.Entry<bp1, so1> entry : this.f5567a.entrySet()) {
                        if (entry.getValue().a() < jA) {
                            jA = entry.getValue().a();
                            key = entry.getKey();
                        }
                    }
                    if (key != null) {
                        concurrentHashMap = this.f5567a;
                        concurrentHashMap.remove(key);
                    }
                    this.f5569c.d();
                } else if (r1 != 2) {
                    if (r1 == 3) {
                        int r12 = ActivityChooserView.f.j;
                        for (Map.Entry<bp1, so1> entry2 : this.f5567a.entrySet()) {
                            if (entry2.getValue().e() < r12) {
                                r12 = entry2.getValue().e();
                                key = entry2.getKey();
                            }
                        }
                        if (key != null) {
                            concurrentHashMap = this.f5567a;
                            concurrentHashMap.remove(key);
                        }
                    }
                    this.f5569c.d();
                } else {
                    for (Map.Entry<bp1, so1> entry3 : this.f5567a.entrySet()) {
                        if (entry3.getValue().d() < jA) {
                            jA = entry3.getValue().d();
                            key = entry3.getKey();
                        }
                    }
                    if (key != null) {
                        concurrentHashMap = this.f5567a;
                        concurrentHashMap.remove(key);
                    }
                    this.f5569c.d();
                }
            }
            this.f5567a.put(bp1Var, so1Var);
            this.f5569c.c();
        }
        zI = so1Var.i(cp1Var);
        this.f5569c.e();
        vo1 vo1VarF = this.f5569c.f();
        tp1 tp1VarG = so1Var.g();
        if (cp1Var != null) {
            cp1Var.f3012a.h().T((cv2.g) ((l92) cv2.g.J().v(cv2.g.a.N().x(cv2.g.c.IN_MEMORY).w(cv2.g.e.L().w(vo1VarF.d).x(vo1VarF.e).v(tp1VarG.e))).P()));
        }
        f();
        return zI;
    }
}

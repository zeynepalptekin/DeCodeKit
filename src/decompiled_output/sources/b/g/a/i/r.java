package b.g.a.i;

import b.g.a.i.e;
import java.util.ArrayList;

/* loaded from: classes.dex */
public class r {

    /* renamed from: a, reason: collision with root package name */
    private int f954a;

    /* renamed from: b, reason: collision with root package name */
    private int f955b;

    /* renamed from: c, reason: collision with root package name */
    private int f956c;
    private int d;
    private ArrayList<a> e = new ArrayList<>();

    static class a {

        /* renamed from: a, reason: collision with root package name */
        private e f957a;

        /* renamed from: b, reason: collision with root package name */
        private e f958b;

        /* renamed from: c, reason: collision with root package name */
        private int f959c;
        private e.c d;
        private int e;

        public a(e eVar) {
            this.f957a = eVar;
            this.f958b = eVar.o();
            this.f959c = eVar.g();
            this.d = eVar.n();
            this.e = eVar.e();
        }

        public void a(h hVar) {
            hVar.s(this.f957a.p()).d(this.f958b, this.f959c, this.d, this.e);
        }

        public void b(h hVar) {
            int r2;
            e eVarS = hVar.s(this.f957a.p());
            this.f957a = eVarS;
            if (eVarS != null) {
                this.f958b = eVarS.o();
                this.f959c = this.f957a.g();
                this.d = this.f957a.n();
                r2 = this.f957a.e();
            } else {
                this.f958b = null;
                r2 = 0;
                this.f959c = 0;
                this.d = e.c.STRONG;
            }
            this.e = r2;
        }
    }

    public r(h hVar) {
        this.f954a = hVar.s0();
        this.f955b = hVar.t0();
        this.f956c = hVar.p0();
        this.d = hVar.J();
        ArrayList<e> arrayListT = hVar.t();
        int size = arrayListT.size();
        for (int r1 = 0; r1 < size; r1++) {
            this.e.add(new a(arrayListT.get(r1)));
        }
    }

    public void a(h hVar) {
        hVar.J1(this.f954a);
        hVar.K1(this.f955b);
        hVar.F1(this.f956c);
        hVar.g1(this.d);
        int size = this.e.size();
        for (int r1 = 0; r1 < size; r1++) {
            this.e.get(r1).a(hVar);
        }
    }

    public void b(h hVar) {
        this.f954a = hVar.s0();
        this.f955b = hVar.t0();
        this.f956c = hVar.p0();
        this.d = hVar.J();
        int size = this.e.size();
        for (int r1 = 0; r1 < size; r1++) {
            this.e.get(r1).b(hVar);
        }
    }
}

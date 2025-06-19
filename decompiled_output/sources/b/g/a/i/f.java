package b.g.a.i;

import b.g.a.i.e;

/* loaded from: classes.dex */
public class f extends i {
    private a E1;

    public enum a {
        BEGIN,
        MIDDLE,
        END,
        TOP,
        VERTICAL_MIDDLE,
        BOTTOM,
        LEFT,
        RIGHT
    }

    public f() {
        this.E1 = a.MIDDLE;
    }

    public f(int r1, int r2) {
        super(r1, r2);
        this.E1 = a.MIDDLE;
    }

    public f(int r1, int r2, int r3, int r4) {
        super(r1, r2, r3, r4);
        this.E1 = a.MIDDLE;
    }

    @Override // b.g.a.i.h
    public void b(b.g.a.e eVar) {
        if (this.c1.size() != 0) {
            int r0 = 0;
            int size = this.c1.size();
            f fVar = this;
            while (r0 < size) {
                h hVar = this.c1.get(r0);
                if (fVar != this) {
                    hVar.f(e.d.LEFT, fVar, e.d.RIGHT);
                    fVar.f(e.d.RIGHT, hVar, e.d.LEFT);
                } else {
                    e.c cVar = e.c.STRONG;
                    if (this.E1 == a.END) {
                        cVar = e.c.WEAK;
                    }
                    e.d dVar = e.d.LEFT;
                    hVar.h(dVar, fVar, dVar, 0, cVar);
                }
                e.d dVar2 = e.d.TOP;
                hVar.f(dVar2, this, dVar2);
                e.d dVar3 = e.d.BOTTOM;
                hVar.f(dVar3, this, dVar3);
                r0++;
                fVar = hVar;
            }
            if (fVar != this) {
                e.c cVar2 = e.c.STRONG;
                if (this.E1 == a.BEGIN) {
                    cVar2 = e.c.WEAK;
                }
                e.d dVar4 = e.d.RIGHT;
                fVar.h(dVar4, this, dVar4, 0, cVar2);
            }
        }
        super.b(eVar);
    }
}

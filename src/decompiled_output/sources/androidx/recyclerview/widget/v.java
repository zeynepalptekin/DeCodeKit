package androidx.recyclerview.widget;

import androidx.recyclerview.widget.a;
import java.util.List;

/* loaded from: classes.dex */
class v {

    /* renamed from: a, reason: collision with root package name */
    final a f742a;

    interface a {
        void a(a.b bVar);

        a.b b(int r1, int r2, int r3, Object obj);
    }

    v(a aVar) {
        this.f742a = aVar;
    }

    private int a(List<a.b> list) {
        boolean z = false;
        for (int size = list.size() - 1; size >= 0; size--) {
            if (list.get(size).f609a != 8) {
                z = true;
            } else if (z) {
                return size;
            }
        }
        return -1;
    }

    private void c(List<a.b> list, int r5, a.b bVar, int r7, a.b bVar2) {
        int r0 = bVar.d < bVar2.f610b ? -1 : 0;
        if (bVar.f610b < bVar2.f610b) {
            r0++;
        }
        int r1 = bVar2.f610b;
        int r2 = bVar.f610b;
        if (r1 <= r2) {
            bVar.f610b = r2 + bVar2.d;
        }
        int r12 = bVar2.f610b;
        int r22 = bVar.d;
        if (r12 <= r22) {
            bVar.d = r22 + bVar2.d;
        }
        bVar2.f610b += r0;
        list.set(r5, bVar2);
        list.set(r7, bVar);
    }

    private void d(List<a.b> list, int r9, int r10) {
        a.b bVar = list.get(r9);
        a.b bVar2 = list.get(r10);
        int r0 = bVar2.f609a;
        if (r0 == 1) {
            c(list, r9, bVar, r10, bVar2);
        } else if (r0 == 2) {
            e(list, r9, bVar, r10, bVar2);
        } else {
            if (r0 != 4) {
                return;
            }
            f(list, r9, bVar, r10, bVar2);
        }
    }

    void b(List<a.b> list) {
        while (true) {
            int r0 = a(list);
            if (r0 == -1) {
                return;
            } else {
                d(list, r0, r0 + 1);
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:60:0x00ca A[PHI: r0
  0x00ca: PHI (r0v12 int) = (r0v6 int), (r0v16 int) binds: [B:59:0x00c8, B:46:0x009e] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    void e(java.util.List<androidx.recyclerview.widget.a.b> r10, int r11, androidx.recyclerview.widget.a.b r12, int r13, androidx.recyclerview.widget.a.b r14) {
        /*
            Method dump skipped, instructions count: 229
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.v.e(java.util.List, int, androidx.recyclerview.widget.a$b, int, androidx.recyclerview.widget.a$b):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0027  */
    /* JADX WARN: Removed duplicated region for block: B:12:0x002b  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0048  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x004c  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0056  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x005b  */
    /* JADX WARN: Removed duplicated region for block: B:24:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    void f(java.util.List<androidx.recyclerview.widget.a.b> r9, int r10, androidx.recyclerview.widget.a.b r11, int r12, androidx.recyclerview.widget.a.b r13) {
        /*
            r8 = this;
            int r0 = r11.d
            int r1 = r13.f610b
            r2 = 4
            r3 = 0
            r4 = 1
            if (r0 >= r1) goto Ld
            int r1 = r1 - r4
            r13.f610b = r1
            goto L20
        Ld:
            int r5 = r13.d
            int r1 = r1 + r5
            if (r0 >= r1) goto L20
            int r5 = r5 - r4
            r13.d = r5
            androidx.recyclerview.widget.v$a r0 = r8.f742a
            int r1 = r11.f610b
            java.lang.Object r5 = r13.f611c
            androidx.recyclerview.widget.a$b r0 = r0.b(r2, r1, r4, r5)
            goto L21
        L20:
            r0 = r3
        L21:
            int r1 = r11.f610b
            int r5 = r13.f610b
            if (r1 > r5) goto L2b
            int r5 = r5 + r4
            r13.f610b = r5
            goto L41
        L2b:
            int r6 = r13.d
            int r7 = r5 + r6
            if (r1 >= r7) goto L41
            int r5 = r5 + r6
            int r5 = r5 - r1
            androidx.recyclerview.widget.v$a r3 = r8.f742a
            int r1 = r1 + r4
            java.lang.Object r4 = r13.f611c
            androidx.recyclerview.widget.a$b r3 = r3.b(r2, r1, r5, r4)
            int r1 = r13.d
            int r1 = r1 - r5
            r13.d = r1
        L41:
            r9.set(r12, r11)
            int r11 = r13.d
            if (r11 <= 0) goto L4c
            r9.set(r10, r13)
            goto L54
        L4c:
            r9.remove(r10)
            androidx.recyclerview.widget.v$a r11 = r8.f742a
            r11.a(r13)
        L54:
            if (r0 == 0) goto L59
            r9.add(r10, r0)
        L59:
            if (r3 == 0) goto L5e
            r9.add(r10, r3)
        L5e:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.v.f(java.util.List, int, androidx.recyclerview.widget.a$b, int, androidx.recyclerview.widget.a$b):void");
    }
}

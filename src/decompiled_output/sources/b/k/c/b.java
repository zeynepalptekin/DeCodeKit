package b.k.c;

import android.graphics.Rect;
import androidx.annotation.h0;
import androidx.annotation.i0;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

/* loaded from: classes.dex */
class b {

    public interface a<T> {
        void a(T t, Rect rect);
    }

    /* renamed from: b.k.c.b$b, reason: collision with other inner class name */
    public interface InterfaceC0081b<T, V> {
        V a(T t, int r2);

        int b(T t);
    }

    private static class c<T> implements Comparator<T> {
        private final Rect d = new Rect();
        private final Rect e = new Rect();
        private final boolean f;
        private final a<T> g;

        c(boolean z, a<T> aVar) {
            this.f = z;
            this.g = aVar;
        }

        @Override // java.util.Comparator
        public int compare(T t, T t2) {
            Rect rect = this.d;
            Rect rect2 = this.e;
            this.g.a(t, rect);
            this.g.a(t2, rect2);
            int r5 = rect.top;
            int r6 = rect2.top;
            if (r5 < r6) {
                return -1;
            }
            if (r5 > r6) {
                return 1;
            }
            int r52 = rect.left;
            int r62 = rect2.left;
            if (r52 < r62) {
                return this.f ? 1 : -1;
            }
            if (r52 > r62) {
                return this.f ? -1 : 1;
            }
            int r53 = rect.bottom;
            int r63 = rect2.bottom;
            if (r53 < r63) {
                return -1;
            }
            if (r53 > r63) {
                return 1;
            }
            int r54 = rect.right;
            int r64 = rect2.right;
            if (r54 < r64) {
                return this.f ? 1 : -1;
            }
            if (r54 > r64) {
                return this.f ? -1 : 1;
            }
            return 0;
        }
    }

    private b() {
    }

    private static boolean a(int r3, @h0 Rect rect, @h0 Rect rect2, @h0 Rect rect3) {
        boolean zB = b(r3, rect, rect2);
        if (b(r3, rect, rect3) || !zB) {
            return false;
        }
        return !j(r3, rect, rect3) || r3 == 17 || r3 == 66 || k(r3, rect, rect2) < m(r3, rect, rect3);
    }

    private static boolean b(int r3, @h0 Rect rect, @h0 Rect rect2) {
        if (r3 != 17) {
            if (r3 != 33) {
                if (r3 != 66) {
                    if (r3 != 130) {
                        throw new IllegalArgumentException("direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
                    }
                }
            }
            return rect2.right >= rect.left && rect2.left <= rect.right;
        }
        return rect2.bottom >= rect.top && rect2.top <= rect.bottom;
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x004d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static <L, T> T c(@androidx.annotation.h0 L r7, @androidx.annotation.h0 b.k.c.b.InterfaceC0081b<L, T> r8, @androidx.annotation.h0 b.k.c.b.a<T> r9, @androidx.annotation.i0 T r10, @androidx.annotation.h0 android.graphics.Rect r11, int r12) {
        /*
            android.graphics.Rect r0 = new android.graphics.Rect
            r0.<init>(r11)
            r1 = 17
            r2 = 0
            if (r12 == r1) goto L38
            r1 = 33
            if (r12 == r1) goto L2e
            r1 = 66
            if (r12 == r1) goto L26
            r1 = 130(0x82, float:1.82E-43)
            if (r12 != r1) goto L1e
            int r1 = r11.height()
            int r1 = r1 + 1
            int r1 = -r1
            goto L34
        L1e:
            java.lang.IllegalArgumentException r7 = new java.lang.IllegalArgumentException
            java.lang.String r8 = "direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}."
            r7.<init>(r8)
            throw r7
        L26:
            int r1 = r11.width()
            int r1 = r1 + 1
            int r1 = -r1
            goto L3e
        L2e:
            int r1 = r11.height()
            int r1 = r1 + 1
        L34:
            r0.offset(r2, r1)
            goto L41
        L38:
            int r1 = r11.width()
            int r1 = r1 + 1
        L3e:
            r0.offset(r1, r2)
        L41:
            r1 = 0
            int r3 = r8.b(r7)
            android.graphics.Rect r4 = new android.graphics.Rect
            r4.<init>()
        L4b:
            if (r2 >= r3) goto L64
            java.lang.Object r5 = r8.a(r7, r2)
            if (r5 != r10) goto L54
            goto L61
        L54:
            r9.a(r5, r4)
            boolean r6 = h(r12, r11, r4, r0)
            if (r6 == 0) goto L61
            r0.set(r4)
            r1 = r5
        L61:
            int r2 = r2 + 1
            goto L4b
        L64:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: b.k.c.b.c(java.lang.Object, b.k.c.b$b, b.k.c.b$a, java.lang.Object, android.graphics.Rect, int):java.lang.Object");
    }

    public static <L, T> T d(@h0 L l, @h0 InterfaceC0081b<L, T> interfaceC0081b, @h0 a<T> aVar, @i0 T t, int r8, boolean z, boolean z2) {
        int r0 = interfaceC0081b.b(l);
        ArrayList arrayList = new ArrayList(r0);
        for (int r2 = 0; r2 < r0; r2++) {
            arrayList.add(interfaceC0081b.a(l, r2));
        }
        Collections.sort(arrayList, new c(z, aVar));
        if (r8 == 1) {
            return (T) f(t, arrayList, z2);
        }
        if (r8 == 2) {
            return (T) e(t, arrayList, z2);
        }
        throw new IllegalArgumentException("direction must be one of {FOCUS_FORWARD, FOCUS_BACKWARD}.");
    }

    private static <T> T e(T t, ArrayList<T> arrayList, boolean z) {
        int size = arrayList.size();
        int r1 = (t == null ? -1 : arrayList.lastIndexOf(t)) + 1;
        if (r1 < size) {
            return arrayList.get(r1);
        }
        if (!z || size <= 0) {
            return null;
        }
        return arrayList.get(0);
    }

    private static <T> T f(T t, ArrayList<T> arrayList, boolean z) {
        int size = arrayList.size();
        int r1 = (t == null ? size : arrayList.indexOf(t)) - 1;
        if (r1 >= 0) {
            return arrayList.get(r1);
        }
        if (!z || size <= 0) {
            return null;
        }
        return arrayList.get(size - 1);
    }

    private static int g(int r1, int r2) {
        return (r1 * 13 * r1) + (r2 * r2);
    }

    private static boolean h(int r3, @h0 Rect rect, @h0 Rect rect2, @h0 Rect rect3) {
        if (!i(rect, rect2, r3)) {
            return false;
        }
        if (i(rect, rect3, r3) && !a(r3, rect, rect2, rect3)) {
            return !a(r3, rect, rect3, rect2) && g(k(r3, rect, rect2), o(r3, rect, rect2)) < g(k(r3, rect, rect3), o(r3, rect, rect3));
        }
        return true;
    }

    private static boolean i(@h0 Rect rect, @h0 Rect rect2, int r5) {
        if (r5 == 17) {
            int r52 = rect.right;
            int r0 = rect2.right;
            return (r52 > r0 || rect.left >= r0) && rect.left > rect2.left;
        }
        if (r5 == 33) {
            int r53 = rect.bottom;
            int r02 = rect2.bottom;
            return (r53 > r02 || rect.top >= r02) && rect.top > rect2.top;
        }
        if (r5 == 66) {
            int r54 = rect.left;
            int r03 = rect2.left;
            return (r54 < r03 || rect.right <= r03) && rect.right < rect2.right;
        }
        if (r5 != 130) {
            throw new IllegalArgumentException("direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
        }
        int r55 = rect.top;
        int r04 = rect2.top;
        return (r55 < r04 || rect.bottom <= r04) && rect.bottom < rect2.bottom;
    }

    private static boolean j(int r3, @h0 Rect rect, @h0 Rect rect2) {
        if (r3 == 17) {
            return rect.left >= rect2.right;
        }
        if (r3 == 33) {
            return rect.top >= rect2.bottom;
        }
        if (r3 == 66) {
            return rect.right <= rect2.left;
        }
        if (r3 == 130) {
            return rect.bottom <= rect2.top;
        }
        throw new IllegalArgumentException("direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
    }

    private static int k(int r0, @h0 Rect rect, @h0 Rect rect2) {
        return Math.max(0, l(r0, rect, rect2));
    }

    private static int l(int r1, @h0 Rect rect, @h0 Rect rect2) {
        int r12;
        int r2;
        if (r1 == 17) {
            r12 = rect.left;
            r2 = rect2.right;
        } else if (r1 == 33) {
            r12 = rect.top;
            r2 = rect2.bottom;
        } else if (r1 == 66) {
            r12 = rect2.left;
            r2 = rect.right;
        } else {
            if (r1 != 130) {
                throw new IllegalArgumentException("direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
            }
            r12 = rect2.top;
            r2 = rect.bottom;
        }
        return r12 - r2;
    }

    private static int m(int r0, @h0 Rect rect, @h0 Rect rect2) {
        return Math.max(1, n(r0, rect, rect2));
    }

    private static int n(int r1, @h0 Rect rect, @h0 Rect rect2) {
        int r12;
        int r2;
        if (r1 == 17) {
            r12 = rect.left;
            r2 = rect2.left;
        } else if (r1 == 33) {
            r12 = rect.top;
            r2 = rect2.top;
        } else if (r1 == 66) {
            r12 = rect2.right;
            r2 = rect.right;
        } else {
            if (r1 != 130) {
                throw new IllegalArgumentException("direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
            }
            r12 = rect2.bottom;
            r2 = rect.bottom;
        }
        return r12 - r2;
    }

    private static int o(int r1, @h0 Rect rect, @h0 Rect rect2) {
        int r12;
        int r2;
        int r3;
        if (r1 == 17) {
            r12 = rect.top + (rect.height() / 2);
            r2 = rect2.top;
            r3 = rect2.height();
        } else {
            if (r1 != 33) {
                if (r1 != 66) {
                    if (r1 != 130) {
                        throw new IllegalArgumentException("direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
                    }
                }
                r12 = rect.top + (rect.height() / 2);
                r2 = rect2.top;
                r3 = rect2.height();
            }
            r12 = rect.left + (rect.width() / 2);
            r2 = rect2.left;
            r3 = rect2.width();
        }
        return Math.abs(r12 - (r2 + (r3 / 2)));
    }
}

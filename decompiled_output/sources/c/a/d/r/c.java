package c.a.d.r;

import androidx.annotation.h0;

/* loaded from: classes.dex */
public interface c {

    public enum a {
        NONE(0),
        SDK(1),
        GLOBAL(2),
        COMBINED(3);

        private final int d;

        a(int r3) {
            this.d = r3;
        }

        public int e() {
            return this.d;
        }
    }

    @h0
    a a(@h0 String str);
}

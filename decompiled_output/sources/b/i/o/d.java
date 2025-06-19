package b.i.o;

import android.util.Log;
import androidx.annotation.p0;
import java.io.Writer;

@p0({p0.a.LIBRARY_GROUP_PREFIX})
@Deprecated
/* loaded from: classes.dex */
public class d extends Writer {
    private final String d;
    private StringBuilder e = new StringBuilder(128);

    public d(String str) {
        this.d = str;
    }

    private void a() {
        if (this.e.length() > 0) {
            Log.d(this.d, this.e.toString());
            StringBuilder sb = this.e;
            sb.delete(0, sb.length());
        }
    }

    @Override // java.io.Writer, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        a();
    }

    @Override // java.io.Writer, java.io.Flushable
    public void flush() {
        a();
    }

    @Override // java.io.Writer
    public void write(char[] cArr, int r5, int r6) {
        for (int r0 = 0; r0 < r6; r0++) {
            char c2 = cArr[r5 + r0];
            if (c2 == '\n') {
                a();
            } else {
                this.e.append(c2);
            }
        }
    }
}

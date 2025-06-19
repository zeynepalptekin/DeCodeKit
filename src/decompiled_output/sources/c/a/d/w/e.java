package c.a.d.w;

import androidx.annotation.i0;
import kotlin.KotlinVersion;

/* loaded from: classes.dex */
public final class e {
    private e() {
    }

    @i0
    public static String a() {
        try {
            return KotlinVersion.CURRENT.toString();
        } catch (NoClassDefFoundError unused) {
            return null;
        }
    }
}

package b.i.k;

import android.annotation.SuppressLint;
import android.os.Build;
import android.os.Message;
import androidx.annotation.h0;

/* loaded from: classes.dex */
public final class j {

    /* renamed from: a, reason: collision with root package name */
    private static boolean f1064a = true;

    /* renamed from: b, reason: collision with root package name */
    private static boolean f1065b = true;

    private j() {
    }

    @SuppressLint({"NewApi"})
    public static boolean a(@h0 Message message) {
        int r0 = Build.VERSION.SDK_INT;
        if (r0 >= 22) {
            return message.isAsynchronous();
        }
        if (f1065b && r0 >= 16) {
            try {
                return message.isAsynchronous();
            } catch (NoSuchMethodError unused) {
                f1065b = false;
            }
        }
        return false;
    }

    @SuppressLint({"NewApi"})
    public static void b(@h0 Message message, boolean z) {
        int r0 = Build.VERSION.SDK_INT;
        if (r0 >= 22) {
            message.setAsynchronous(z);
        } else {
            if (!f1064a || r0 < 16) {
                return;
            }
            try {
                message.setAsynchronous(z);
            } catch (NoSuchMethodError unused) {
                f1064a = false;
            }
        }
    }
}

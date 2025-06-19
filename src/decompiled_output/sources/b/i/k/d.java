package b.i.k;

import android.os.Build;
import android.os.Environment;
import android.util.Log;
import androidx.annotation.h0;
import java.io.File;
import java.io.IOException;

/* loaded from: classes.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    private static final String f1055a = "EnvironmentCompat";

    /* renamed from: b, reason: collision with root package name */
    public static final String f1056b = "unknown";

    private d() {
    }

    @h0
    public static String a(@h0 File file) {
        int r0 = Build.VERSION.SDK_INT;
        if (r0 >= 21) {
            return Environment.getExternalStorageState(file);
        }
        if (r0 >= 19) {
            return Environment.getStorageState(file);
        }
        try {
            return file.getCanonicalPath().startsWith(Environment.getExternalStorageDirectory().getCanonicalPath()) ? Environment.getExternalStorageState() : f1056b;
        } catch (IOException e) {
            Log.w(f1055a, "Failed to resolve canonical path: " + e);
            return f1056b;
        }
    }
}

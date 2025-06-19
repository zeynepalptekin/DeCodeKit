package b.i.k;

import android.content.Context;
import android.os.Build;
import android.os.UserManager;
import androidx.annotation.h0;

/* loaded from: classes.dex */
public class p {
    private p() {
    }

    public static boolean a(@h0 Context context) {
        if (Build.VERSION.SDK_INT >= 24) {
            return ((UserManager) context.getSystemService(UserManager.class)).isUserUnlocked();
        }
        return true;
    }
}

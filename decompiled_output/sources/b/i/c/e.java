package b.i.c;

import android.content.Intent;
import android.os.Build;
import androidx.annotation.h0;

/* loaded from: classes.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    public static final String f969a = "android.intent.extra.HTML_TEXT";

    /* renamed from: b, reason: collision with root package name */
    public static final String f970b = "android.intent.extra.START_PLAYBACK";

    /* renamed from: c, reason: collision with root package name */
    public static final String f971c = "android.intent.category.LEANBACK_LAUNCHER";

    private e() {
    }

    @h0
    public static Intent a(@h0 String str, @h0 String str2) {
        if (Build.VERSION.SDK_INT >= 15) {
            return Intent.makeMainSelectorActivity(str, str2);
        }
        Intent intent = new Intent(str);
        intent.addCategory(str2);
        return intent;
    }
}

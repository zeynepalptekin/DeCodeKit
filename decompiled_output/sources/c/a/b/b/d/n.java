package c.a.b.b.d;

import android.content.Intent;
import androidx.annotation.RecentlyNonNull;

/* loaded from: classes.dex */
public class n extends Exception {
    private final Intent d;

    public n(@RecentlyNonNull String str, @RecentlyNonNull Intent intent) {
        super(str);
        this.d = intent;
    }

    @RecentlyNonNull
    public Intent a() {
        return new Intent(this.d);
    }
}

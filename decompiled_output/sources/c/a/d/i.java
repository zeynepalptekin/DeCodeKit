package c.a.d;

import androidx.annotation.RecentlyNonNull;
import com.google.android.gms.common.api.Status;

@com.google.android.gms.common.annotation.a
/* loaded from: classes.dex */
public class i implements com.google.android.gms.common.api.internal.e {
    @Override // com.google.android.gms.common.api.internal.e
    @RecentlyNonNull
    public Exception a(@RecentlyNonNull Status status) {
        return status.j() == 8 ? new h(status.D()) : new c(status.D());
    }
}

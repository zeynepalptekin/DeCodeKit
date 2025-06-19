package androidx.lifecycle;

import androidx.annotation.p0;
import java.util.HashMap;
import java.util.Map;

@p0({p0.a.LIBRARY_GROUP_PREFIX})
/* loaded from: classes.dex */
public class n {

    /* renamed from: a, reason: collision with root package name */
    private Map<String, Integer> f522a = new HashMap();

    @p0({p0.a.LIBRARY_GROUP_PREFIX})
    public boolean a(String str, int r6) {
        Integer num = this.f522a.get(str);
        int r0 = num != null ? num.intValue() : 0;
        boolean z = (r0 & r6) != 0;
        this.f522a.put(str, Integer.valueOf(r6 | r0));
        return !z;
    }
}

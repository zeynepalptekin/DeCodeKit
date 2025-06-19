package b.w;

import android.view.View;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes.dex */
public class n0 {

    /* renamed from: b, reason: collision with root package name */
    public View f1494b;

    /* renamed from: a, reason: collision with root package name */
    public final Map<String, Object> f1493a = new HashMap();

    /* renamed from: c, reason: collision with root package name */
    final ArrayList<g0> f1495c = new ArrayList<>();

    @Deprecated
    public n0() {
    }

    public n0(@androidx.annotation.h0 View view) {
        this.f1494b = view;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof n0)) {
            return false;
        }
        n0 n0Var = (n0) obj;
        return this.f1494b == n0Var.f1494b && this.f1493a.equals(n0Var.f1493a);
    }

    public int hashCode() {
        return (this.f1494b.hashCode() * 31) + this.f1493a.hashCode();
    }

    public String toString() {
        String str = (("TransitionValues@" + Integer.toHexString(hashCode()) + ":\n") + "    view = " + this.f1494b + "\n") + "    values:";
        for (String str2 : this.f1493a.keySet()) {
            str = str + "    " + str2 + ": " + this.f1493a.get(str2) + "\n";
        }
        return str;
    }
}

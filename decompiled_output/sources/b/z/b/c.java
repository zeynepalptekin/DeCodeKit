package b.z.b;

import android.view.View;
import androidx.annotation.h0;
import b.z.b.h;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes.dex */
public final class c implements h.m {

    /* renamed from: a, reason: collision with root package name */
    private final List<h.m> f1558a = new ArrayList();

    @Override // b.z.b.h.m
    public void a(@h0 View view, float f) {
        Iterator<h.m> it = this.f1558a.iterator();
        while (it.hasNext()) {
            it.next().a(view, f);
        }
    }

    public void b(@h0 h.m mVar) {
        this.f1558a.add(mVar);
    }

    public void c(@h0 h.m mVar) {
        this.f1558a.remove(mVar);
    }
}

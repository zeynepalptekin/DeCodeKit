package c.a.b.b.k;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: Add missing generic type declarations: [TResult] */
/* loaded from: classes.dex */
final class r<TResult> implements c<Void, List<TResult>> {

    /* renamed from: a, reason: collision with root package name */
    private final /* synthetic */ Collection f1921a;

    r(Collection collection) {
        this.f1921a = collection;
    }

    @Override // c.a.b.b.k.c
    public final /* synthetic */ Object a(@androidx.annotation.h0 m<Void> mVar) throws Exception {
        ArrayList arrayList = new ArrayList();
        Iterator it = this.f1921a.iterator();
        while (it.hasNext()) {
            arrayList.add(((m) it.next()).r());
        }
        return arrayList;
    }
}

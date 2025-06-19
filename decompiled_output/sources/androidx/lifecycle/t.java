package androidx.lifecycle;

import androidx.annotation.e0;
import androidx.annotation.h0;
import androidx.annotation.i0;

/* loaded from: classes.dex */
public class t {

    /* JADX INFO: Add missing generic type declarations: [X] */
    static class a<X> implements p<X> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ m f523a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ b.b.a.d.a f524b;

        a(m mVar, b.b.a.d.a aVar) {
            this.f523a = mVar;
            this.f524b = aVar;
        }

        @Override // androidx.lifecycle.p
        public void a(@i0 X x) {
            this.f523a.p(this.f524b.a(x));
        }
    }

    /* JADX INFO: Add missing generic type declarations: [X] */
    static class b<X> implements p<X> {

        /* renamed from: a, reason: collision with root package name */
        LiveData<Y> f525a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ b.b.a.d.a f526b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ m f527c;

        /* JADX INFO: Add missing generic type declarations: [Y] */
        class a<Y> implements p<Y> {
            a() {
            }

            @Override // androidx.lifecycle.p
            public void a(@i0 Y y) {
                b.this.f527c.p(y);
            }
        }

        b(b.b.a.d.a aVar, m mVar) {
            this.f526b = aVar;
            this.f527c = mVar;
        }

        @Override // androidx.lifecycle.p
        public void a(@i0 X x) {
            LiveData<Y> liveData = (LiveData) this.f526b.a(x);
            Object obj = this.f525a;
            if (obj == liveData) {
                return;
            }
            if (obj != null) {
                this.f527c.r(obj);
            }
            this.f525a = liveData;
            if (liveData != 0) {
                this.f527c.q(liveData, new a());
            }
        }
    }

    private t() {
    }

    @e0
    public static <X, Y> LiveData<Y> a(@h0 LiveData<X> liveData, @h0 b.b.a.d.a<X, Y> aVar) {
        m mVar = new m();
        mVar.q(liveData, new a(mVar, aVar));
        return mVar;
    }

    @e0
    public static <X, Y> LiveData<Y> b(@h0 LiveData<X> liveData, @h0 b.b.a.d.a<X, LiveData<Y>> aVar) {
        m mVar = new m();
        mVar.q(liveData, new b(aVar, mVar));
        return mVar;
    }
}

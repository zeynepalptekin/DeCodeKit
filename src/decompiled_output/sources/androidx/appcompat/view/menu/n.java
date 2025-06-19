package androidx.appcompat.view.menu;

import android.content.Context;
import android.os.Parcelable;
import android.view.ViewGroup;
import androidx.annotation.h0;
import androidx.annotation.p0;

@p0({p0.a.LIBRARY_GROUP_PREFIX})
/* loaded from: classes.dex */
public interface n {

    public interface a {
        void a(@h0 g gVar, boolean z);

        boolean b(@h0 g gVar);
    }

    int J();

    void K(Context context, g gVar);

    void L(Parcelable parcelable);

    boolean M(s sVar);

    void N(boolean z);

    o O(ViewGroup viewGroup);

    boolean P();

    Parcelable Q();

    boolean R(g gVar, j jVar);

    boolean S(g gVar, j jVar);

    void T(a aVar);

    void a(g gVar, boolean z);
}

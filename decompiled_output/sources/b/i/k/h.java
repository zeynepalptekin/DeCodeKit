package b.i.k;

import androidx.annotation.h0;
import androidx.annotation.i0;
import androidx.annotation.z;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.transformation.FabTransformationScrimBehavior;
import java.util.Locale;

/* loaded from: classes.dex */
interface h {
    String a();

    Object b();

    @z(from = RecyclerView.Q0)
    int c(Locale locale);

    @i0
    Locale d(@h0 String[] strArr);

    Locale get(int r1);

    boolean isEmpty();

    @z(from = FabTransformationScrimBehavior.j)
    int size();
}

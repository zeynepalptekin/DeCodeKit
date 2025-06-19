package c.a.b.c.b;

import android.util.Property;
import android.view.ViewGroup;
import androidx.annotation.h0;
import c.a.b.c.a;

/* loaded from: classes.dex */
public class d extends Property<ViewGroup, Float> {

    /* renamed from: a, reason: collision with root package name */
    public static final Property<ViewGroup, Float> f1939a = new d("childrenAlpha");

    private d(String str) {
        super(Float.class, str);
    }

    @Override // android.util.Property
    @h0
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public Float get(@h0 ViewGroup viewGroup) {
        Float f = (Float) viewGroup.getTag(a.h.mtrl_internal_children_alpha_tag);
        return f != null ? f : Float.valueOf(1.0f);
    }

    @Override // android.util.Property
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public void set(@h0 ViewGroup viewGroup, @h0 Float f) {
        float fFloatValue = f.floatValue();
        viewGroup.setTag(a.h.mtrl_internal_children_alpha_tag, Float.valueOf(fFloatValue));
        int childCount = viewGroup.getChildCount();
        for (int r1 = 0; r1 < childCount; r1++) {
            viewGroup.getChildAt(r1).setAlpha(fFloatValue);
        }
    }
}

package c.a.b.b.g.c;

import java.util.Collections;
import java.util.List;
import java.util.Map;

/* JADX INFO: Add missing generic type declarations: [FieldDescriptorType] */
/* loaded from: classes.dex */
final class o9<FieldDescriptorType> extends p9<FieldDescriptorType, Object> {
    o9(int r2) {
        super(r2, null);
    }

    @Override // c.a.b.b.g.c.p9
    public final void e() {
        if (!i()) {
            for (int r0 = 0; r0 < j(); r0++) {
                Map.Entry<FieldDescriptorType, Object> entryH = h(r0);
                if (((z6) entryH.getKey()).d()) {
                    entryH.setValue(Collections.unmodifiableList((List) entryH.getValue()));
                }
            }
            for (Map.Entry<FieldDescriptorType, Object> entry : m()) {
                if (((z6) entry.getKey()).d()) {
                    entry.setValue(Collections.unmodifiableList((List) entry.getValue()));
                }
            }
        }
        super.e();
    }
}

package com.google.android.gms.internal.ads;

import java.util.Collections;
import java.util.List;
import java.util.Map;

/* JADX INFO: Add missing generic type declarations: [FieldDescriptorType] */
/* loaded from: classes.dex */
final class yb2<FieldDescriptorType> extends zb2<FieldDescriptorType, Object> {
    yb2(int r2) {
        super(r2, null);
    }

    @Override // com.google.android.gms.internal.ads.zb2
    public final void g() {
        if (!a()) {
            for (int r0 = 0; r0 < h(); r0++) {
                Map.Entry<FieldDescriptorType, Object> entryP = p(r0);
                if (((g92) entryP.getKey()).L()) {
                    entryP.setValue(Collections.unmodifiableList((List) entryP.getValue()));
                }
            }
            for (Map.Entry<FieldDescriptorType, Object> entry : i()) {
                if (((g92) entry.getKey()).L()) {
                    entry.setValue(Collections.unmodifiableList((List) entry.getValue()));
                }
            }
        }
        super.g();
    }
}

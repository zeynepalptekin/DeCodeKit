package androidx.appcompat.widget;

import android.view.textclassifier.TextClassificationManager;
import android.view.textclassifier.TextClassifier;
import android.widget.TextView;

/* loaded from: classes.dex */
final class y {

    /* renamed from: a, reason: collision with root package name */
    @androidx.annotation.h0
    private TextView f207a;

    /* renamed from: b, reason: collision with root package name */
    @androidx.annotation.i0
    private TextClassifier f208b;

    y(@androidx.annotation.h0 TextView textView) {
        this.f207a = (TextView) b.i.o.i.f(textView);
    }

    @androidx.annotation.m0(api = 26)
    @androidx.annotation.h0
    public TextClassifier a() {
        TextClassifier textClassifier = this.f208b;
        if (textClassifier != null) {
            return textClassifier;
        }
        TextClassificationManager textClassificationManager = (TextClassificationManager) this.f207a.getContext().getSystemService(TextClassificationManager.class);
        return textClassificationManager != null ? textClassificationManager.getTextClassifier() : TextClassifier.NO_OP;
    }

    @androidx.annotation.m0(api = 26)
    public void b(@androidx.annotation.i0 TextClassifier textClassifier) {
        this.f208b = textClassifier;
    }
}

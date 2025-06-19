package c.a.b.c.b;

import android.animation.TypeEvaluator;
import androidx.annotation.h0;

/* loaded from: classes.dex */
public class c implements TypeEvaluator<Integer> {

    /* renamed from: a, reason: collision with root package name */
    private static final c f1938a = new c();

    @h0
    public static c b() {
        return f1938a;
    }

    @Override // android.animation.TypeEvaluator
    @h0
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public Integer evaluate(float f, Integer num, Integer num2) {
        int r13 = num.intValue();
        float f2 = ((r13 >> 24) & 255) / 255.0f;
        int r14 = num2.intValue();
        float fPow = (float) Math.pow(((r13 >> 16) & 255) / 255.0f, 2.2d);
        float fPow2 = (float) Math.pow(((r13 >> 8) & 255) / 255.0f, 2.2d);
        float fPow3 = (float) Math.pow((r13 & 255) / 255.0f, 2.2d);
        float fPow4 = (float) Math.pow(((r14 >> 16) & 255) / 255.0f, 2.2d);
        float f3 = f2 + (((((r14 >> 24) & 255) / 255.0f) - f2) * f);
        float fPow5 = fPow2 + ((((float) Math.pow(((r14 >> 8) & 255) / 255.0f, 2.2d)) - fPow2) * f);
        float fPow6 = fPow3 + (f * (((float) Math.pow((r14 & 255) / 255.0f, 2.2d)) - fPow3));
        return Integer.valueOf((Math.round(((float) Math.pow(fPow + ((fPow4 - fPow) * f), 0.45454545454545453d)) * 255.0f) << 16) | (Math.round(f3 * 255.0f) << 24) | (Math.round(((float) Math.pow(fPow5, 0.45454545454545453d)) * 255.0f) << 8) | Math.round(((float) Math.pow(fPow6, 0.45454545454545453d)) * 255.0f));
    }
}

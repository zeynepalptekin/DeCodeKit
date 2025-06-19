package b.w;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.os.Build;
import java.util.ArrayList;

/* loaded from: classes.dex */
class a {

    /* renamed from: b.w.a$a, reason: collision with other inner class name */
    interface InterfaceC0106a {
        void onAnimationPause(Animator animator);

        void onAnimationResume(Animator animator);
    }

    private a() {
    }

    static void a(@androidx.annotation.h0 Animator animator, @androidx.annotation.h0 AnimatorListenerAdapter animatorListenerAdapter) {
        if (Build.VERSION.SDK_INT >= 19) {
            animator.addPauseListener(animatorListenerAdapter);
        }
    }

    static void b(@androidx.annotation.h0 Animator animator) {
        if (Build.VERSION.SDK_INT >= 19) {
            animator.pause();
            return;
        }
        ArrayList<Animator.AnimatorListener> listeners = animator.getListeners();
        if (listeners != null) {
            int size = listeners.size();
            for (int r1 = 0; r1 < size; r1++) {
                Animator.AnimatorListener animatorListener = listeners.get(r1);
                if (animatorListener instanceof InterfaceC0106a) {
                    ((InterfaceC0106a) animatorListener).onAnimationPause(animator);
                }
            }
        }
    }

    static void c(@androidx.annotation.h0 Animator animator) {
        if (Build.VERSION.SDK_INT >= 19) {
            animator.resume();
            return;
        }
        ArrayList<Animator.AnimatorListener> listeners = animator.getListeners();
        if (listeners != null) {
            int size = listeners.size();
            for (int r1 = 0; r1 < size; r1++) {
                Animator.AnimatorListener animatorListener = listeners.get(r1);
                if (animatorListener instanceof InterfaceC0106a) {
                    ((InterfaceC0106a) animatorListener).onAnimationResume(animator);
                }
            }
        }
    }
}

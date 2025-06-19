package androidx.lifecycle;

import android.app.Activity;
import android.app.Fragment;
import android.app.FragmentManager;
import android.content.ComponentCallbacks2;
import android.os.Bundle;
import androidx.annotation.p0;
import androidx.lifecycle.g;

@p0({p0.a.LIBRARY_GROUP_PREFIX})
/* loaded from: classes.dex */
public class s extends Fragment {
    private static final String e = "androidx.lifecycle.LifecycleDispatcher.report_fragment_tag";
    private a d;

    interface a {
        void C0();

        void D0();

        void onResume();
    }

    private void a(g.a aVar) {
        ComponentCallbacks2 activity = getActivity();
        if (activity instanceof l) {
            ((l) activity).b().j(aVar);
        } else if (activity instanceof j) {
            g gVarB = ((j) activity).b();
            if (gVarB instanceof k) {
                ((k) gVarB).j(aVar);
            }
        }
    }

    private void b(a aVar) {
        if (aVar != null) {
            aVar.D0();
        }
    }

    private void c(a aVar) {
        if (aVar != null) {
            aVar.onResume();
        }
    }

    private void d(a aVar) {
        if (aVar != null) {
            aVar.C0();
        }
    }

    static s e(Activity activity) {
        return (s) activity.getFragmentManager().findFragmentByTag(e);
    }

    public static void f(Activity activity) {
        FragmentManager fragmentManager = activity.getFragmentManager();
        if (fragmentManager.findFragmentByTag(e) == null) {
            fragmentManager.beginTransaction().add(new s(), e).commit();
            fragmentManager.executePendingTransactions();
        }
    }

    void g(a aVar) {
        this.d = aVar;
    }

    @Override // android.app.Fragment
    public void onActivityCreated(Bundle bundle) {
        super.onActivityCreated(bundle);
        b(this.d);
        a(g.a.ON_CREATE);
    }

    @Override // android.app.Fragment
    public void onDestroy() {
        super.onDestroy();
        a(g.a.ON_DESTROY);
        this.d = null;
    }

    @Override // android.app.Fragment
    public void onPause() {
        super.onPause();
        a(g.a.ON_PAUSE);
    }

    @Override // android.app.Fragment
    public void onResume() {
        super.onResume();
        c(this.d);
        a(g.a.ON_RESUME);
    }

    @Override // android.app.Fragment
    public void onStart() {
        super.onStart();
        d(this.d);
        a(g.a.ON_START);
    }

    @Override // android.app.Fragment
    public void onStop() {
        super.onStop();
        a(g.a.ON_STOP);
    }
}

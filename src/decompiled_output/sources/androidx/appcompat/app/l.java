package androidx.appcompat.app;

import android.view.View;
import android.widget.AdapterView;
import androidx.appcompat.app.a;

/* loaded from: classes.dex */
class l implements AdapterView.OnItemSelectedListener {
    private final a.e d;

    public l(a.e eVar) {
        this.d = eVar;
    }

    @Override // android.widget.AdapterView.OnItemSelectedListener
    public void onItemSelected(AdapterView<?> adapterView, View view, int r3, long j) {
        a.e eVar = this.d;
        if (eVar != null) {
            eVar.a(r3, j);
        }
    }

    @Override // android.widget.AdapterView.OnItemSelectedListener
    public void onNothingSelected(AdapterView<?> adapterView) {
    }
}

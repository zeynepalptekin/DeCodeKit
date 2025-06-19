package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.net.InetAddress;
import java.net.Socket;
import java.net.SocketException;
import javax.net.ssl.SSLSocketFactory;

/* loaded from: classes.dex */
final class tu extends SSLSocketFactory {

    /* renamed from: a, reason: collision with root package name */
    private SSLSocketFactory f5450a = (SSLSocketFactory) SSLSocketFactory.getDefault();

    /* renamed from: b, reason: collision with root package name */
    private final /* synthetic */ qu f5451b;

    tu(qu quVar) {
        this.f5451b = quVar;
    }

    private final Socket a(Socket socket) throws SocketException {
        if (this.f5451b.o > 0) {
            socket.setReceiveBufferSize(this.f5451b.o);
        }
        this.f5451b.e(socket);
        return socket;
    }

    @Override // javax.net.SocketFactory
    public final Socket createSocket(String str, int r3) throws IOException {
        return a(this.f5450a.createSocket(str, r3));
    }

    @Override // javax.net.SocketFactory
    public final Socket createSocket(String str, int r3, InetAddress inetAddress, int r5) throws IOException {
        return a(this.f5450a.createSocket(str, r3, inetAddress, r5));
    }

    @Override // javax.net.SocketFactory
    public final Socket createSocket(InetAddress inetAddress, int r3) throws IOException {
        return a(this.f5450a.createSocket(inetAddress, r3));
    }

    @Override // javax.net.SocketFactory
    public final Socket createSocket(InetAddress inetAddress, int r3, InetAddress inetAddress2, int r5) throws IOException {
        return a(this.f5450a.createSocket(inetAddress, r3, inetAddress2, r5));
    }

    @Override // javax.net.ssl.SSLSocketFactory
    public final Socket createSocket(Socket socket, String str, int r4, boolean z) throws IOException {
        return a(this.f5450a.createSocket(socket, str, r4, z));
    }

    @Override // javax.net.ssl.SSLSocketFactory
    public final String[] getDefaultCipherSuites() {
        return this.f5450a.getDefaultCipherSuites();
    }

    @Override // javax.net.ssl.SSLSocketFactory
    public final String[] getSupportedCipherSuites() {
        return this.f5450a.getSupportedCipherSuites();
    }
}

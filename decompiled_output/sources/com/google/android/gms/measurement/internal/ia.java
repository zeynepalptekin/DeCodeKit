package com.google.android.gms.measurement.internal;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.InetAddress;
import java.net.SocketAddress;
import java.net.SocketException;
import java.nio.channels.SocketChannel;
import java.util.ArrayList;
import java.util.Arrays;
import javax.net.ssl.HandshakeCompletedListener;
import javax.net.ssl.SSLSession;
import javax.net.ssl.SSLSocket;

/* loaded from: classes.dex */
final class ia extends SSLSocket {
    private final SSLSocket d;

    ia(ja jaVar, SSLSocket sSLSocket) {
        this.d = sSLSocket;
    }

    @Override // javax.net.ssl.SSLSocket
    public final void addHandshakeCompletedListener(HandshakeCompletedListener handshakeCompletedListener) {
        this.d.addHandshakeCompletedListener(handshakeCompletedListener);
    }

    @Override // java.net.Socket
    public final void bind(SocketAddress socketAddress) throws IOException {
        this.d.bind(socketAddress);
    }

    @Override // java.net.Socket, java.io.Closeable, java.lang.AutoCloseable
    public final synchronized void close() throws IOException {
        this.d.close();
    }

    @Override // java.net.Socket
    public final void connect(SocketAddress socketAddress) throws IOException {
        this.d.connect(socketAddress);
    }

    @Override // java.net.Socket
    public final void connect(SocketAddress socketAddress, int r3) throws IOException {
        this.d.connect(socketAddress, r3);
    }

    public final boolean equals(Object obj) {
        return this.d.equals(obj);
    }

    @Override // java.net.Socket
    public final SocketChannel getChannel() {
        return this.d.getChannel();
    }

    @Override // javax.net.ssl.SSLSocket
    public final boolean getEnableSessionCreation() {
        return this.d.getEnableSessionCreation();
    }

    @Override // javax.net.ssl.SSLSocket
    public final String[] getEnabledCipherSuites() {
        return this.d.getEnabledCipherSuites();
    }

    @Override // javax.net.ssl.SSLSocket
    public final String[] getEnabledProtocols() {
        return this.d.getEnabledProtocols();
    }

    @Override // java.net.Socket
    public final InetAddress getInetAddress() {
        return this.d.getInetAddress();
    }

    @Override // java.net.Socket
    public final InputStream getInputStream() throws IOException {
        return this.d.getInputStream();
    }

    @Override // java.net.Socket
    public final boolean getKeepAlive() throws SocketException {
        return this.d.getKeepAlive();
    }

    @Override // java.net.Socket
    public final InetAddress getLocalAddress() {
        return this.d.getLocalAddress();
    }

    @Override // java.net.Socket
    public final int getLocalPort() {
        return this.d.getLocalPort();
    }

    @Override // java.net.Socket
    public final SocketAddress getLocalSocketAddress() {
        return this.d.getLocalSocketAddress();
    }

    @Override // javax.net.ssl.SSLSocket
    public final boolean getNeedClientAuth() {
        return this.d.getNeedClientAuth();
    }

    @Override // java.net.Socket
    public final boolean getOOBInline() throws SocketException {
        return this.d.getOOBInline();
    }

    @Override // java.net.Socket
    public final OutputStream getOutputStream() throws IOException {
        return this.d.getOutputStream();
    }

    @Override // java.net.Socket
    public final int getPort() {
        return this.d.getPort();
    }

    @Override // java.net.Socket
    public final synchronized int getReceiveBufferSize() throws SocketException {
        return this.d.getReceiveBufferSize();
    }

    @Override // java.net.Socket
    public final SocketAddress getRemoteSocketAddress() {
        return this.d.getRemoteSocketAddress();
    }

    @Override // java.net.Socket
    public final boolean getReuseAddress() throws SocketException {
        return this.d.getReuseAddress();
    }

    @Override // java.net.Socket
    public final synchronized int getSendBufferSize() throws SocketException {
        return this.d.getSendBufferSize();
    }

    @Override // javax.net.ssl.SSLSocket
    public final SSLSession getSession() {
        return this.d.getSession();
    }

    @Override // java.net.Socket
    public final int getSoLinger() throws SocketException {
        return this.d.getSoLinger();
    }

    @Override // java.net.Socket
    public final synchronized int getSoTimeout() throws SocketException {
        return this.d.getSoTimeout();
    }

    @Override // javax.net.ssl.SSLSocket
    public final String[] getSupportedCipherSuites() {
        return this.d.getSupportedCipherSuites();
    }

    @Override // javax.net.ssl.SSLSocket
    public final String[] getSupportedProtocols() {
        return this.d.getSupportedProtocols();
    }

    @Override // java.net.Socket
    public final boolean getTcpNoDelay() throws SocketException {
        return this.d.getTcpNoDelay();
    }

    @Override // java.net.Socket
    public final int getTrafficClass() throws SocketException {
        return this.d.getTrafficClass();
    }

    @Override // javax.net.ssl.SSLSocket
    public final boolean getUseClientMode() {
        return this.d.getUseClientMode();
    }

    @Override // javax.net.ssl.SSLSocket
    public final boolean getWantClientAuth() {
        return this.d.getWantClientAuth();
    }

    @Override // java.net.Socket
    public final boolean isBound() {
        return this.d.isBound();
    }

    @Override // java.net.Socket
    public final boolean isClosed() {
        return this.d.isClosed();
    }

    @Override // java.net.Socket
    public final boolean isConnected() {
        return this.d.isConnected();
    }

    @Override // java.net.Socket
    public final boolean isInputShutdown() {
        return this.d.isInputShutdown();
    }

    @Override // java.net.Socket
    public final boolean isOutputShutdown() {
        return this.d.isOutputShutdown();
    }

    @Override // javax.net.ssl.SSLSocket
    public final void removeHandshakeCompletedListener(HandshakeCompletedListener handshakeCompletedListener) {
        this.d.removeHandshakeCompletedListener(handshakeCompletedListener);
    }

    @Override // java.net.Socket
    public final void sendUrgentData(int r2) throws IOException {
        this.d.sendUrgentData(r2);
    }

    @Override // javax.net.ssl.SSLSocket
    public final void setEnableSessionCreation(boolean z) {
        this.d.setEnableSessionCreation(z);
    }

    @Override // javax.net.ssl.SSLSocket
    public final void setEnabledCipherSuites(String[] strArr) {
        this.d.setEnabledCipherSuites(strArr);
    }

    @Override // javax.net.ssl.SSLSocket
    public final void setEnabledProtocols(String[] strArr) {
        if (strArr != null && Arrays.asList(strArr).contains("SSLv3")) {
            ArrayList arrayList = new ArrayList(Arrays.asList(this.d.getEnabledProtocols()));
            if (arrayList.size() > 1) {
                arrayList.remove("SSLv3");
            }
            strArr = (String[]) arrayList.toArray(new String[arrayList.size()]);
        }
        this.d.setEnabledProtocols(strArr);
    }

    @Override // java.net.Socket
    public final void setKeepAlive(boolean z) throws SocketException {
        this.d.setKeepAlive(z);
    }

    @Override // javax.net.ssl.SSLSocket
    public final void setNeedClientAuth(boolean z) {
        this.d.setNeedClientAuth(z);
    }

    @Override // java.net.Socket
    public final void setOOBInline(boolean z) throws SocketException {
        this.d.setOOBInline(z);
    }

    @Override // java.net.Socket
    public final void setPerformancePreferences(int r2, int r3, int r4) {
        this.d.setPerformancePreferences(r2, r3, r4);
    }

    @Override // java.net.Socket
    public final synchronized void setReceiveBufferSize(int r2) throws SocketException {
        this.d.setReceiveBufferSize(r2);
    }

    @Override // java.net.Socket
    public final void setReuseAddress(boolean z) throws SocketException {
        this.d.setReuseAddress(z);
    }

    @Override // java.net.Socket
    public final synchronized void setSendBufferSize(int r2) throws SocketException {
        this.d.setSendBufferSize(r2);
    }

    @Override // java.net.Socket
    public final void setSoLinger(boolean z, int r3) throws SocketException {
        this.d.setSoLinger(z, r3);
    }

    @Override // java.net.Socket
    public final synchronized void setSoTimeout(int r2) throws SocketException {
        this.d.setSoTimeout(r2);
    }

    @Override // java.net.Socket
    public final void setTcpNoDelay(boolean z) throws SocketException {
        this.d.setTcpNoDelay(z);
    }

    @Override // java.net.Socket
    public final void setTrafficClass(int r2) throws SocketException {
        this.d.setTrafficClass(r2);
    }

    @Override // javax.net.ssl.SSLSocket
    public final void setUseClientMode(boolean z) {
        this.d.setUseClientMode(z);
    }

    @Override // javax.net.ssl.SSLSocket
    public final void setWantClientAuth(boolean z) {
        this.d.setWantClientAuth(z);
    }

    @Override // java.net.Socket
    public final void shutdownInput() throws IOException {
        this.d.shutdownInput();
    }

    @Override // java.net.Socket
    public final void shutdownOutput() throws IOException {
        this.d.shutdownOutput();
    }

    @Override // javax.net.ssl.SSLSocket
    public final void startHandshake() throws IOException {
        this.d.startHandshake();
    }

    @Override // javax.net.ssl.SSLSocket, java.net.Socket
    public final String toString() {
        return this.d.toString();
    }
}

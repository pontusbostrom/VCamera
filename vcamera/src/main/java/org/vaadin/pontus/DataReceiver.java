package org.vaadin.pontus;

import java.io.OutputStream;

@FunctionalInterface
public interface DataReceiver {

    public OutputStream getOutputStream(String mimeType);

}

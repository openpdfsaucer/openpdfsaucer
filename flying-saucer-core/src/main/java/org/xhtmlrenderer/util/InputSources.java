package org.xhtmlrenderer.util;

import org.jspecify.annotations.Nullable;
import org.xml.sax.InputSource;

import java.io.BufferedInputStream;
import java.io.InputStream;
import java.net.URL;

public class InputSources {
    @Nullable
    public static InputSource fromStream(@Nullable InputStream is) {
        return is == null ? null : new InputSource(new BufferedInputStream(is));
    }

    public static InputSource fromURL(URL source) {
        return new InputSource(source.toString());
    }
}
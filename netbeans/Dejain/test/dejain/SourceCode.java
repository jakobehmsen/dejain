/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dejain;

import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.io.UnsupportedEncodingException;
import static jdk.nashorn.internal.objects.NativeRegExp.source;

/**
 *
 * @author Jakob
 */
public class SourceCode {
    private InputStream sourceCode;

    public SourceCode(String sourceCode) throws UnsupportedEncodingException {
        this.sourceCode = new ByteArrayInputStream(sourceCode.getBytes("UTF-8"));
    }
}

/**
 *
 */
package com.juxtapose.example.ch07.flat;

import org.springframework.batch.item.file.FlatFileHeaderCallback;

import java.io.IOException;
import java.io.Writer;

/**
 * @author bruce.liu(mailto : jxta.liu @ gmail.com)
 * 2013-9-20上午09:11:41
 */
public class DefaultFlatFileHeaderCallback implements FlatFileHeaderCallback {

    /* (non-Javadoc)
     * @see org.springframework.batch.item.file.FlatFileHeaderCallback#writeHeader(java.io.Writer)
     */
    @Override
    public void writeHeader(Writer writer) throws IOException {
        writer.write("##credit 201310 begin.");
    }

}

/**
 *
 */
package com.juxtapose.example.ch07.listener;

import com.juxtapose.example.ch07.CreditBill;
import org.springframework.batch.core.ItemWriteListener;

import java.util.List;


/**
 *
 * @author bruce.liu(mailto : jxta.liu @ gmail.com)
 * 2013-9-29下午01:50:36
 */
public class SystemOutItemWriteListener implements ItemWriteListener<CreditBill> {
    public void beforeWrite(List<? extends CreditBill> items) {
        System.out.println("SystemOutItemWriteListener.beforeWrite()");
    }

    public void afterWrite(List<? extends CreditBill> items) {
        System.out.println("SystemOutItemWriteListener.afterWrite()");
    }

    public void onWriteError(Exception exception,
                             List<? extends CreditBill> items) {
        System.out.println("SystemOutItemWriteListener.onWriteError()");
    }
}

package com.juxtapose.example.ch11.partition.remote;

import org.springframework.batch.core.StepExecution;
import org.springframework.integration.Message;

import java.util.Collection;

/**
 * @author bruce.liu(mailto : jxta.liu @ gmail.com)
 * 2014-3-23下午06:16:21
 */
public class MessageTransformer {
    @SuppressWarnings("unchecked")
    public Message<Collection<StepExecution>> extract(Message<?> inMessage) {
        return (Message<Collection<StepExecution>>) inMessage;
    }
}
